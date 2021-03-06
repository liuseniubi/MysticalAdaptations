package com.focamacho.mysticaladaptations.items.insanium;

import com.blakebr0.cucumber.helper.CropHelper;
import com.blakebr0.cucumber.helper.NBTHelper;
import com.blakebr0.cucumber.item.ItemBase;
import com.blakebr0.cucumber.lib.Colors;
import com.blakebr0.cucumber.util.Utils;
import com.blakebr0.mysticalagriculture.items.tools.ToolType;
import com.blakebr0.mysticalagriculture.lib.Tooltips;
import com.focamacho.mysticaladaptations.MysticalAdaptations;
import com.focamacho.mysticaladaptations.init.ModItems;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class InsaniumScythe extends ItemBase {

	public int range;
	public ToolMaterial toolMaterial;
	public TextFormatting color;
	
	public InsaniumScythe(String name, int range, ToolMaterial material, TextFormatting color){
		super(name);
		this.setMaxStackSize(1);
		this.setMaxDamage(material.getMaxUses());
		this.setCreativeTab(MysticalAdaptations.tabMysticalAdaptations);
		this.range = range;
		this.toolMaterial = material;
		this.color = color;
		this.setRegistryName(name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced){
		tooltip.add(Tooltips.RANGE + Colors.DARK_PURPLE + "5x5");
		int damage = stack.getMaxDamage() - stack.getItemDamage();
		tooltip.add(Tooltips.DURABILITY + color + (damage > -1 ? damage : Tooltips.UNLIMITED));
		NBTTagCompound tag = NBTHelper.getTagCompound(stack);
		if(tag.hasKey(ToolType.TOOL_TYPE)){
			tooltip.add(Tooltips.CHARM_SLOT + Colors.DARK_PURPLE + ToolType.byIndex(tag.getInteger(ToolType.TOOL_TYPE)).getLocalizedName());
		} else {
			tooltip.add(Tooltips.CHARM_SLOT + Colors.DARK_PURPLE + Tooltips.EMPTY);
		}
	}
	
	public int getRange(ItemStack stack){
		int range = 2;
		if(stack.getItem() == ModItems.INSANIUM_SCYTHE){
			NBTTagCompound tag = NBTHelper.getTagCompound(stack);
			if(tag.hasKey(ToolType.TOOL_TYPE)){
				if(tag.getInteger(ToolType.TOOL_TYPE) == ToolType.SCYTHING_AOE.getIndex()){
					range = 3;
				}
			}
		}
		return range;
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing face, float hitX, float hitY, float hitZ){
		ItemStack stack = player.getHeldItem(hand);
		if(!player.canPlayerEdit(pos.offset(face), face, stack)){
			return EnumActionResult.FAIL;
		}
				
		int range = getRange(stack);
		Iterable<BlockPos> blocks = pos.getAllInBox(pos.add(-range, 0, -range), pos.add(range, 0, range));
		
		for(BlockPos aoePos : blocks){
			IBlockState state = world.getBlockState(aoePos);
			Block block = state.getBlock();
			if(block instanceof BlockCrops){
				BlockCrops crop = (BlockCrops)block;
				Item seed = CropHelper.getSeed(crop);
				if(crop.isMaxAge(state) && seed != null){
					int fortune = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, stack);
					NonNullList<ItemStack> drops = NonNullList.create();
					crop.getDrops(drops, world, aoePos, state, fortune);
					for(ItemStack drop : drops){
						if(!drop.isEmpty() && drop.getItem() == seed){
							drop.shrink(1);;
							if(drop.getCount() <= 0){
								drops.remove(drop);
							}
							break;
						}
					}
					for(ItemStack drop : drops){
						if(!drop.isEmpty()){
							block.spawnAsEntity(world, aoePos, drop);
						}
					}
					player.swingArm(hand);
					player.spawnSweepParticles();
					world.setBlockState(aoePos, crop.withAge(0));
					world.playSound(null, aoePos, SoundEvents.BLOCK_GRASS_BREAK, player.getSoundCategory(), 1.0F, 1.0F);
					if(Utils.randInt(1, 4) != 1){
						stack.damageItem(1, player);
					}
				}
			}
		}
		return EnumActionResult.SUCCESS;
	}
	
    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity){
    	if(player.getCooledAttackStrength(0.5F) >= 0.95F){
    		int range = getRange(stack);
    		double grow = (range == 2 ? 1.5D : 1.0D);
    		List<EntityLivingBase> entities = player.getEntityWorld().getEntitiesWithinAABB(EntityLivingBase.class, entity.getEntityBoundingBox().grow(grow, 0.25D, grow));

            for(EntityLivingBase aoeEntity : entities) {
                if(aoeEntity != player && aoeEntity != entity && !player.isOnSameTeam(entity)) {
                    aoeEntity.knockBack(player, 0.4F, (double) MathHelper.sin(player.rotationYaw * 0.017453292F), (double)(-MathHelper.cos(player.rotationYaw * 0.017453292F)));
                    aoeEntity.attackEntityFrom(DamageSource.causePlayerDamage(player), 11.5F);
                }
            }

            player.getEntityWorld().playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, player.getSoundCategory(), 1.0F, 1.0F);
            player.spawnSweepParticles();
    	}
    	return super.onLeftClickEntity(stack, player, entity);
    }
    
    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot){
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if(equipmentSlot == EntityEquipmentSlot.MAINHAND){
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.toolMaterial.getAttackDamage() - 1.0F, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.5D, 0));
        }
        return multimap;
    }

}