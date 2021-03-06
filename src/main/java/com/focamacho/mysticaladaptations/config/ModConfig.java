package com.focamacho.mysticaladaptations.config;

import com.focamacho.mysticaladaptations.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ModConfig {
	
	public static Configuration config;
	public static ModConfig instance;
	
	public static boolean ENABLE_SEED_EXTRACTORS;
	
	public static int INFERIUM_DURABILITY;
	public static int PRUDENTIUM_DURABILITY;
	public static int INTERMEDIUM_DURABILITY;
	public static int SUPERIUM_DURABILITY;
	public static int SUPREMIUM_DURABILITY;
	public static int INSANIUM_DURABILITY;
	
	public static boolean MOB_SEED_DROP;
	public static boolean EXTRACTOR_LOWER_TIER;
	public static boolean EXTRACTOR_ANY_TIER;
	public static boolean REMOVE_SEED_RECIPES;
	public static boolean REMOVE_MOBS_SEED_RECIPES;
	public static boolean JEI_COMPAT;
	public static boolean EXPERIENCE_SEEDS_DROP;
	public static int EXPERIENCE_SEEDS_DROP_CHANCE;
	public static boolean EXPERIENCE_SEEDS_DROP_DURABILITY;
	public static boolean ENCHANTABLE_EXTRACTOR;
	
	public static boolean NETHERSTAR_BLOCK;
	public static boolean SILICON_BLOCK;
	public static boolean HOP_GRAPHITE_BLOCK;
	
	public static boolean INSANIUM_ARMOR;
	public static boolean INSANIUM_ARMOR_SATURATION;
	public static boolean INSANIUM_ARMOR_HUNGERLESS;
	public static boolean INSANIUM_ARMOR_FIRERESISTANCE;
	public static boolean REMOVE_AGRADDITIONS_RECIPES;
	public static boolean INSANIUM_TOOLS;
	public static boolean INSANIUM_PICKAXE_OBSIDIAN;
	public static boolean INSANIUM_SHEARS_DOUBLES;
	public static boolean INSANIUM_LURE;
	public static boolean INSANIUM_AXE_UP;
	public static boolean INSANIUM_REPROCESSOR;
	public static boolean INSANIUM_FURNACE;
	public static boolean ULTIMATE_FURNACE_RECIPE;
	public static boolean TINKERS_INSANIUM;
	public static boolean ULTIMATE_REPROCESSOR_RECIPE;
	
	@SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
        if(eventArgs.getModID().equals(Reference.MOD_ID)) {
            ModConfig.syncConfig();
        }
    }
	
	public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
	}
	
	public static void syncConfig() {
	
		String category;
		
		category = "Principal";
		config.addCustomCategoryComment(category, "Enable/Disable Principal Mechanics");
		ENABLE_SEED_EXTRACTORS = config.getBoolean("ENABLE_SEED_EXTRACTOR", category, true, "Enable Seed Extractors");
		
		category = "Seed Extractor Durability";
		config.addCustomCategoryComment(category, "Set the durability of the Seed Extractors");
		INFERIUM_DURABILITY = config.getInt("INFERIUM_DURABILITY", category, 15, 1, 2147483647, "Inferium Seed Extractor Durability.");
		PRUDENTIUM_DURABILITY = config.getInt("PRUDENTIUM_DURABILITY", category, 15, 1, 2147483647, "Prudentium Seed Extractor Durability.");
		INTERMEDIUM_DURABILITY = config.getInt("INTERMEDIUM_DURABILITY", category, 15, 1, 2147483647, "Intermedium Seed Extractor Durability.");
		SUPERIUM_DURABILITY = config.getInt("SUPERIUM_DURABILITY", category, 15, 1, 2147483647, "Superium Seed Extractor Durability.");
		SUPREMIUM_DURABILITY = config.getInt("SUPREMIUM_DURABILITY", category, 15, 1, 2147483647, "Supremium Seed Extractor Durability.");
		INSANIUM_DURABILITY = config.getInt("INSANIUM_DURABILITY", category, 15, 1, 2147483647, "Insanium Seed Extractor Durability. (Only if Mystical Agradditions is loaded)");
		
		category = "Additional Mechanics";
		config.addCustomCategoryComment(category, "Some additional mechanics available");
		MOB_SEED_DROP = config.getBoolean("MOB_SEED_DROP", category, true, "Kill a mob using a Seed Extractor to get its seed.");
		EXTRACTOR_LOWER_TIER = config.getBoolean("EXTRACTOR_LOWER_TIER", category, true, "Seed Extractor of larger tiers can pick lower tier seeds.");
		EXTRACTOR_ANY_TIER = config.getBoolean("EXTRACTOR_ANY_TIER", category, false, "Seed extractors can collect any seed, regardless of the tier.");
		REMOVE_SEED_RECIPES = config.getBoolean("REMOVE_SEED_RECIPES", category, true, "Remove all default crafting table non-mob seeds recipes. Example: Copper Seeds, Iron Seeds, Aluminum Seeds...");
		REMOVE_MOBS_SEED_RECIPES = config.getBoolean("REMOVE_MOBS_SEED_RECIPES", category, true, "Remove all default crafting table mobs seeds recipes. Example: Pig Seeds, Cow Seeds, Skeleton Seeds...");
		REMOVE_AGRADDITIONS_RECIPES = config.getBoolean("REMOVE_AGRADDITIONS_RECIPES", category, true, "Remove all default crafting table seed recipes from the mod Mystical Agradditions. Example: Netherstar Seeds, Dragon Egg Seeds...");
		JEI_COMPAT = config.getBoolean("JEI_COMPAT", category, true, "Enable/Disable JEI Seed Extractor Compat.");
		EXPERIENCE_SEEDS_DROP = config.getBoolean("EXPERIENCE_SEEDS_DROP", category, true, "If true, mobs will have a configurable chance of dropping a Experience Seeds when killed using a Seed Extractor.");
		EXPERIENCE_SEEDS_DROP_CHANCE = config.getInt("EXPERIENCE_SEEDS_DROP_CHANCE", category, 10, 1, 100, "Set Experience Seeds drop chance.");
		EXPERIENCE_SEEDS_DROP_DURABILITY = config.getBoolean("EXPERIENCE_SEEDS_DROP_DURABILITY", category, false, "Consume 1 from the Seed Extractor Durability when a Experience Seed is dropped.");
		ENCHANTABLE_EXTRACTOR = config.getBoolean("ENCHANTABLE_EXTRACTOR", category, true, "Set whether Seed Extractors can be enchanted using books.");
		
		category = "Blocks";
		config.addCustomCategoryComment(category, "Enable/Disable Blocks");
		NETHERSTAR_BLOCK = config.get(category, "NETHERSTAR_BLOCK", true).getBoolean();
		SILICON_BLOCK = config.get(category, "SILICON_BLOCK", true).getBoolean();
		HOP_GRAPHITE_BLOCK = config.get(category, "HOP_GRAPHITE_BLOCK", true).getBoolean();
		
		category = "Mystical Agradditions";
		config.addCustomCategoryComment(category, "Cool things for Mystical Agradditions");
		INSANIUM_ARMOR = config.getBoolean("INSANIUM_ARMOR", category, true, "Enable the Insanium Armor");
		INSANIUM_ARMOR_SATURATION = config.getBoolean("INSANIUM_ARMOR_SATURATION", category, false, "Wearing a full set of a Insanium Armor gives saturation effect - Yeah, that's OP");
		INSANIUM_ARMOR_HUNGERLESS = config.getBoolean("INSANIUM_ARMOR_HUNGERLESS", category, true, "Wearing a full set of a Insanium Armor keeps your hunger bar always full");
		INSANIUM_ARMOR_FIRERESISTANCE = config.getBoolean("INSANIUM_ARMOR_FIRERESISTANCE", category, false, "Wearing a full set of a Insanium Armor gives fire resistance effect");
		INSANIUM_TOOLS = config.getBoolean("INSANIUM_TOOLS", category, true, "Enable Insanium Tools");
		INSANIUM_PICKAXE_OBSIDIAN = config.getBoolean("INSANIUM_PICKAXE_OBSIDIAN", category, true, "Insanium Pickaxe breaks obsidian instantly");
		INSANIUM_SHEARS_DOUBLES = config.getBoolean("INSANIUM_SHEARS_DOUBLES", category, true, "Insanium Shears doubles drops obtained from shearing entities.");
		INSANIUM_REPROCESSOR = config.getBoolean("INSANIUM_REPROCESSOR", category, true, "Enable the Insanium Seed Reprocessor");
		INSANIUM_LURE = config.getBoolean("INSANIUM_LURE", category, true, "Insanium Fishing Rod catches fish faster than normal");
		INSANIUM_AXE_UP = config.getBoolean("INSANIUM_AXE_UP", category, true, "Insanium Axe breaks all log blocks above the target block");
		INSANIUM_FURNACE = config.getBoolean("INSANIUM_FURNACE", category, true, "Enable the Insanium Furnace");
		ULTIMATE_FURNACE_RECIPE = config.getBoolean("ULTIMATE_FURNACE_RECIPE", category, true, "Changes the Ultimate Furnace recipe to use a Insanium Furnace instead of a Supremium Furnace");
		TINKERS_INSANIUM = config.getBoolean("TINKERS_INSANIUM", category, true, "Enable/Disable Tinker's Construct Insanium Compat");
		ULTIMATE_REPROCESSOR_RECIPE = config.getBoolean("ULTIMATE_REPROCESSOR_RECIPE", category, true, "Changes the Ultimate Seed Reprocessor recipe to use a Insanium Seed Reprocessor instead of a Supremium Seed Reprocessor");
		
		if(config.hasChanged()){
			config.save();
		}
	}
} 
