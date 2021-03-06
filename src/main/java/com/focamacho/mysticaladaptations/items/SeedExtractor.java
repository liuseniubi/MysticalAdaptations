package com.focamacho.mysticaladaptations.items;

import com.focamacho.mysticaladaptations.MysticalAdaptations;
import com.focamacho.mysticaladaptations.config.ModConfig;
import com.focamacho.mysticaladaptations.init.ModItems;
import com.focamacho.mysticaladaptations.lib.BlockCheck;
import com.focamacho.mysticaladaptations.util.Utils;
import com.google.common.collect.Multimap;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class SeedExtractor extends Item {

	private final ToolMaterial toolMaterial;
	
	public SeedExtractor(String name, ToolMaterial material, int durability) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setMaxDamage(durability);
		this.setCreativeTab(MysticalAdaptations.tabMysticalAdaptations);
		this.setMaxStackSize(1);
		this.toolMaterial = material;
	}
	
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand) {
        ItemStack seed;
        
    	ItemStack itemstack = player.getHeldItem(hand);
        RayTraceResult raytraceresult = this.rayTrace(worldIn, player, true);
        BlockPos pos;

		if (raytraceresult == null) return new ActionResult<>(EnumActionResult.PASS, itemstack);
		if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK) return new ActionResult<>(EnumActionResult.PASS, itemstack);
		else {
			pos = raytraceresult.getBlockPos();
			IBlockState iblockstate = worldIn.getBlockState(pos);
			Block block = iblockstate.getBlock();
			ItemStack blockItem = iblockstate.getBlock().getPickBlock(iblockstate, raytraceresult, worldIn, pos, player);
			   if(player.canPlayerEdit(pos, raytraceresult.sideHit, itemstack)) {
			   seed = BlockCheck.getSeedFromBlock(itemstack, blockItem, block);
			   if(seed != null) {
				   if(!worldIn.isRemote) {
					   seedExtractorUse(worldIn, player, itemstack, seed, pos);
				   } else {
					   spawnParticles(pos, worldIn, iblockstate);
				   }
				   worldIn.playSound(null, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
				   return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
				}
		   }
		}
        return new ActionResult<>(EnumActionResult.PASS, itemstack);
    }
    
	public void seedExtractorUse(World worldIn, EntityPlayer player, ItemStack extractor, ItemStack seed, BlockPos pos) {
      	worldIn.setBlockToAir(pos);
      	EntityItem seedDrop = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), seed);
		player.getCooldownTracker().setCooldown(extractor.getItem(), 20);
	    worldIn.spawnEntity(seedDrop);
	    extractor.damageItem(1, player);
	}
	
	private void spawnParticles(BlockPos pos, World world, IBlockState state) {
		Random rand = new Random();

		for (int k = 0; k < 20; ++k) {
			double xCoord = pos.getX() + (rand.nextDouble() * 0.6D) - 0.3D;
			double yCoord = pos.getY() + (rand.nextDouble() * 0.6D);
			double zCoord = pos.getZ() + (rand.nextDouble() * 0.6D) - 0.3D;
			double xSpeed = rand.nextGaussian() * 0.02D;
			double ySpeed = rand.nextGaussian() * 0.2D;
			double zSpeed = rand.nextGaussian() * 0.02D;
			world.spawnParticle(EnumParticleTypes.BLOCK_CRACK, xCoord, yCoord, zCoord, xSpeed, ySpeed, zSpeed, Block.getStateId(state));
		}
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flagIn) {
		int tier = getExtractorTier();
		list.add(ChatFormatting.GRAY + "Tier: " + Utils.getColorFromTier(tier) + tier);
	}
	
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		return ModConfig.ENCHANTABLE_EXTRACTOR;
	}
	
	@Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot){
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if(equipmentSlot == EntityEquipmentSlot.MAINHAND){
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.toolMaterial.getAttackDamage() - 1.0F, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -3.4D, 0));
        }
        return multimap;
    }

    public int getExtractorTier() {
		return SeedExtractor.getExtractorTier(this);
	}

    public static int getExtractorTier(Item itemExtractor) {
		if(itemExtractor.equals(ModItems.INFERIUM_SEED_EXTRACTOR)) return 1;
		else if(itemExtractor.equals(ModItems.PRUDENTIUM_SEED_EXTRACTOR)) return 2;
		else if(itemExtractor.equals(ModItems.INTERMEDIUM_SEED_EXTRACTOR)) return 3;
		else if(itemExtractor.equals(ModItems.SUPERIUM_SEED_EXTRACTOR)) return 4;
		else if(itemExtractor.equals(ModItems.SUPREMIUM_SEED_EXTRACTOR)) return 5;
		else if(itemExtractor.equals(ModItems.INSANIUM_SEED_EXTRACTOR)) return 6;
		return 0;
	}
}
