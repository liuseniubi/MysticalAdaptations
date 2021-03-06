package com.focamacho.mysticaladaptations.items.insanium;

import com.blakebr0.cucumber.helper.NBTHelper;
import com.blakebr0.cucumber.item.ItemBase;
import com.blakebr0.cucumber.lib.Colors;
import com.blakebr0.cucumber.util.ToolTools;
import com.blakebr0.cucumber.util.Utils;
import com.blakebr0.mysticalagriculture.items.tools.ToolType;
import com.blakebr0.mysticalagriculture.lib.Tooltips;
import com.focamacho.mysticaladaptations.MysticalAdaptations;
import com.focamacho.mysticaladaptations.init.ModItems;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class InsaniumSickle extends ItemBase {
	
	public int range;
	public ToolMaterial toolMaterial;
	public TextFormatting color;
	
	public InsaniumSickle(String name, int range, ToolMaterial material, TextFormatting color){
		super(name);
		this.setMaxStackSize(1);
		this.setMaxDamage(material.getMaxUses());
		this.setRegistryName(name);
		this.setCreativeTab(MysticalAdaptations.tabMysticalAdaptations);
		this.range = range;
		this.toolMaterial = material;
		this.color = color;
	}
	
	public int getRange(ItemStack stack){
		if(stack.getItem() == ModItems.INSANIUM_SICKLE){
        	NBTTagCompound tag = NBTHelper.getTagCompound(stack);
        	if(tag.hasKey(ToolType.TOOL_TYPE)){
        		if(tag.getInteger(ToolType.TOOL_TYPE) == ToolType.REAPING_AOE.getIndex()){
        			return this.range + 1;
        		}
        	}
		}
		return this.range;
	}
	
    public float getStrVsBlock(ItemStack stack, IBlockState state){
        return (state.getMaterial() == Material.LEAVES || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.VINE) ? (this.toolMaterial.getEfficiency() / 2) : super.getDestroySpeed(stack, state);
	}

	@Override
    public boolean onBlockStartBreak(ItemStack stack, BlockPos pos, EntityPlayer player){
		this.harvest(stack, getRange(stack), player.getEntityWorld(), pos, player);
        return false;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced){
		int damage = stack.getMaxDamage() - stack.getItemDamage();
		tooltip.add(Tooltips.RANGE + Colors.DARK_PURPLE + "7x7x7");
		tooltip.add(Tooltips.DURABILITY + color + (damage > -1 ? damage : Tooltips.UNLIMITED));
		NBTTagCompound tag = NBTHelper.getTagCompound(stack);
		if(tag.hasKey(ToolType.TOOL_TYPE)){
			tooltip.add(Tooltips.CHARM_SLOT + Colors.DARK_PURPLE + ToolType.byIndex(tag.getInteger(ToolType.TOOL_TYPE)).getLocalizedName());
		} else {
			tooltip.add(Tooltips.CHARM_SLOT + Colors.DARK_PURPLE + Tooltips.EMPTY);
		}
	}
	
    public boolean harvest(ItemStack stack, int radius, World world, BlockPos pos, EntityPlayer player){
        
        IBlockState state = world.getBlockState(pos);
        float hardness = state.getBlockHardness(world, pos);
        
        if(!canHarvest(world, pos, false, stack, player) || !(state.getMaterial() == Material.LEAVES || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.VINE)){
            stack.damageItem(1, player);
        	return false;
        }
                
        if(radius > 0){        	
        	int used = 0;
        	Iterable<BlockPos> blocks = BlockPos.getAllInBox(pos.add(-radius, -radius, -radius), pos.add(radius, radius, radius));
        	for(BlockPos aoePos : blocks){
        		if(aoePos != pos){
        			IBlockState aoeState = world.getBlockState(aoePos);
        			if(aoeState.getBlockHardness(world, aoePos) <= hardness + 5.0F){
        				if(aoeState.getMaterial() == Material.LEAVES || aoeState.getMaterial() == Material.PLANTS || aoeState.getMaterial() == Material.VINE){
        					int usesLeft = stack.getMaxDamage() - stack.getItemDamage() + 1;
        					if(used < usesLeft || stack.getMaxDamage() == -1){
            					if(canHarvest(world, aoePos, true, stack, player)){
            						if(aoeState.getBlockHardness(world, aoePos) <= 0.0F){
            							if(Utils.randInt(1, 3) == 1){
            								used++;
            							}
            						} else {
                						used++;
            						}
            					}
        					}
        				}
        			} else {
        				return false;
        			}
        		}
            }
        	if(used > 0 && !player.capabilities.isCreativeMode){
        		stack.damageItem(used, player);
        	}
        }
        return true;
    }	
    
    private boolean canHarvest(World world, BlockPos pos, boolean extra, ItemStack stack, EntityPlayer player){
        IBlockState state = world.getBlockState(pos);
        float hardness = state.getBlockHardness(world, pos);
        Block block = state.getBlock();
        boolean harvest = (ForgeHooks.canHarvestBlock(block, player, world, pos) || this.canHarvestBlock(state, stack)) && (!extra || this.getStrVsBlock(stack, world.getBlockState(pos)) > 1.0F);
        if(hardness >= 0.0F && (!extra || harvest)){
        	return ToolTools.breakBlocksAOE(stack, world, player, pos);
        }
        return false;
    }
    
    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot){
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if(equipmentSlot == EntityEquipmentSlot.MAINHAND){
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.toolMaterial.getAttackDamage(), 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.5D, 0));
        }

        return multimap;
    }
}