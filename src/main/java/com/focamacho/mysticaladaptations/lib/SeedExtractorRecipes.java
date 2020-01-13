package com.focamacho.mysticaladaptations.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.blakebr0.mysticalagriculture.lib.CropType.Type;
import com.focamacho.mysticaladaptations.config.RecipesConfig;
import com.focamacho.mysticaladaptations.util.ModCheck;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SeedExtractorRecipes {

	public static SeedExtractorRecipe water_seeds;
	public static SeedExtractorRecipe wood_seeds;
	public static SeedExtractorRecipe copper_seeds;
	public static SeedExtractorRecipe tin_seeds;
	public static SeedExtractorRecipe platinum_seeds;
	public static SeedExtractorRecipe aluminum_brass_seeds;
	public static SeedExtractorRecipe aluminum_seeds;
	public static SeedExtractorRecipe alumite_seeds;
	public static SeedExtractorRecipe ardite_seeds;
	public static SeedExtractorRecipe black_quartz_seeds;
	public static SeedExtractorRecipe boron_seeds;
	public static SeedExtractorRecipe brass_seeds;
	public static SeedExtractorRecipe bronze_seeds;
	public static SeedExtractorRecipe chrome_seeds;
	public static SeedExtractorRecipe coal_seeds;
	public static SeedExtractorRecipe cobalt_seeds;
	public static SeedExtractorRecipe conductive_iron_seeds;
	public static SeedExtractorRecipe constantan_seeds;
	public static SeedExtractorRecipe dark_steel_seeds;
	public static SeedExtractorRecipe diamond_seeds;
	public static SeedExtractorRecipe draconium_seeds;
	public static SeedExtractorRecipe dirt_seeds;
	public static SeedExtractorRecipe electrical_steel_seeds;
	public static SeedExtractorRecipe electrotine_seeds;
	public static SeedExtractorRecipe electrum_seeds;
	public static SeedExtractorRecipe emerald_seeds;
	public static SeedExtractorRecipe end_steel_seeds;
	public static SeedExtractorRecipe enderium_seeds;
	public static SeedExtractorRecipe energetic_alloy_seeds;
	public static SeedExtractorRecipe experience_seeds;
	public static SeedExtractorRecipe glowstone_ingot_seeds;
	public static SeedExtractorRecipe glowstone_seeds;
	public static SeedExtractorRecipe gold_seeds;
	public static SeedExtractorRecipe grains_of_infinity_seeds;
	public static SeedExtractorRecipe invar_seeds;
	public static SeedExtractorRecipe iridium_seeds;
	public static SeedExtractorRecipe iron_seeds;
	public static SeedExtractorRecipe knightslime_seeds;
	public static SeedExtractorRecipe lapis_lazuli_seeds;
	public static SeedExtractorRecipe lead_seeds;
	public static SeedExtractorRecipe limestone_seeds;
	public static SeedExtractorRecipe lithium_seeds;
	public static SeedExtractorRecipe lumium_seeds;
	public static SeedExtractorRecipe magnesium_seeds;
	public static SeedExtractorRecipe manyullyn_seeds;
	public static SeedExtractorRecipe marble_seeds;
	public static SeedExtractorRecipe mithril_seeds;
	public static SeedExtractorRecipe nether_quartz_seeds;
	public static SeedExtractorRecipe nickel_seeds;
	public static SeedExtractorRecipe obsidian_seeds;
	public static SeedExtractorRecipe osmium_seeds;
	public static SeedExtractorRecipe peridot_seeds;
	public static SeedExtractorRecipe pulsating_iron_seeds;
	public static SeedExtractorRecipe redstone_alloy_seeds;
	public static SeedExtractorRecipe redstone_seeds;
	public static SeedExtractorRecipe refined_obsidian_seeds;
	public static SeedExtractorRecipe ruby_seeds;
	public static SeedExtractorRecipe saltpeter_seeds;
	public static SeedExtractorRecipe sapphire_seeds;
	public static SeedExtractorRecipe signalum_seeds;
	public static SeedExtractorRecipe silver_seeds;
	public static SeedExtractorRecipe slate_seeds;
	public static SeedExtractorRecipe slime_seeds;
	public static SeedExtractorRecipe soularium_seeds;
	public static SeedExtractorRecipe steel_seeds;
	public static SeedExtractorRecipe thorium_seeds;
	public static SeedExtractorRecipe titanium_seeds;
	public static SeedExtractorRecipe tungsten_seeds;
	public static SeedExtractorRecipe uranium_seeds;
	public static SeedExtractorRecipe vibrant_alloy_seeds;
	public static SeedExtractorRecipe zinc_seeds;
	public static SeedExtractorRecipe abyssalnite_seeds;
	public static SeedExtractorRecipe adamantine_seeds;
	public static SeedExtractorRecipe apatite_seeds;
	public static SeedExtractorRecipe aquarium_seeds;
	public static SeedExtractorRecipe basalt_seeds;
	public static SeedExtractorRecipe cold_iron_seeds;
	public static SeedExtractorRecipe compressed_iron_seeds;
	public static SeedExtractorRecipe coralium_seeds;
	public static SeedExtractorRecipe dawnstone_seeds;
	public static SeedExtractorRecipe desh_seeds;
	public static SeedExtractorRecipe dreadium_seeds;
	public static SeedExtractorRecipe end_seeds;
	public static SeedExtractorRecipe fiery_ingot_seeds;
	public static SeedExtractorRecipe fluxed_electrum_seeds;
	public static SeedExtractorRecipe jade_seeds;
	public static SeedExtractorRecipe knightmetal_seeds;
	public static SeedExtractorRecipe nether_seeds;
	public static SeedExtractorRecipe octine_seeds;
	public static SeedExtractorRecipe slimy_bone_seeds;
	public static SeedExtractorRecipe star_steel_seeds;
	public static SeedExtractorRecipe steeleaf_seeds;
	public static SeedExtractorRecipe syrmorite_seeds;
	public static SeedExtractorRecipe thaumium_seeds;
	public static SeedExtractorRecipe tritanium_seeds;
	public static SeedExtractorRecipe valonite_seeds;
	public static SeedExtractorRecipe void_metal_seeds;
	public static SeedExtractorRecipe ice_seeds;
	public static SeedExtractorRecipe amber_seeds;
	public static SeedExtractorRecipe certus_quartz_seeds;
	public static SeedExtractorRecipe dark_gem_seeds;
	public static SeedExtractorRecipe elementium_seeds;
	public static SeedExtractorRecipe ender_amethyst_seeds;
	public static SeedExtractorRecipe ender_biotite_seeds;
	public static SeedExtractorRecipe fluix_seeds;
	public static SeedExtractorRecipe ironwood_seeds;
	public static SeedExtractorRecipe malachite_seeds;
	public static SeedExtractorRecipe manasteel_seeds;
	public static SeedExtractorRecipe menril_seeds;
	public static SeedExtractorRecipe meteoric_iron_seeds;
	public static SeedExtractorRecipe quartz_enriched_iron_seeds;
	public static SeedExtractorRecipe rock_crystal_seeds;
	public static SeedExtractorRecipe sky_stone_seeds;
	public static SeedExtractorRecipe tanzanite_seeds;
	public static SeedExtractorRecipe terrasteel_seeds;
	public static SeedExtractorRecipe topaz_seeds;
	public static SeedExtractorRecipe blue_topaz_seeds;
	public static SeedExtractorRecipe chimerite_seeds;
	public static SeedExtractorRecipe graphite_seeds;
	public static SeedExtractorRecipe hop_graphite_seeds;
	public static SeedExtractorRecipe moonstone_seeds;
	public static SeedExtractorRecipe sunstone_seeds;
	public static SeedExtractorRecipe vinteum_seeds;
	public static SeedExtractorRecipe yellorium_seeds;
	public static SeedExtractorRecipe mystical_flower_seeds;
	public static SeedExtractorRecipe nature_seeds;
	public static SeedExtractorRecipe stone_seeds;
	public static SeedExtractorRecipe sulfur_seeds;
	public static SeedExtractorRecipe fire_seeds;
	public static SeedExtractorRecipe aquamarine_seeds;
	public static SeedExtractorRecipe dilithium_seeds;
	public static SeedExtractorRecipe iridium_ore_seeds;
	public static SeedExtractorRecipe rubber_seeds;
	public static SeedExtractorRecipe starmetal_seeds;
	public static SeedExtractorRecipe uranium_238_seeds;
	public static SeedExtractorRecipe quicksilver_seeds;
	public static SeedExtractorRecipe dye_seeds;
	public static SeedExtractorRecipe nether_star_seeds;
	public static SeedExtractorRecipe awakened_draconium_seeds;
	public static SeedExtractorRecipe dragon_egg_seeds;
	public static SeedExtractorRecipe neutronium_seeds;
	public static SeedExtractorRecipe silicon_seeds;
	public static SeedExtractorRecipe basalz_seeds;
	public static SeedExtractorRecipe blaze_seeds;
	public static SeedExtractorRecipe blitz_seeds;
	public static SeedExtractorRecipe blizz_seeds;
	public static SeedExtractorRecipe chicken_seeds;
	public static SeedExtractorRecipe cow_seeds;
	public static SeedExtractorRecipe creeper_seeds;
	public static SeedExtractorRecipe enderman_seeds;
	public static SeedExtractorRecipe ghast_seeds;
	public static SeedExtractorRecipe guardian_seeds;
	public static SeedExtractorRecipe pig_seeds;
	public static SeedExtractorRecipe rabbit_seeds;
	public static SeedExtractorRecipe sheep_seeds;
	public static SeedExtractorRecipe skeleton_seeds;
	public static SeedExtractorRecipe spider_seeds;
	public static SeedExtractorRecipe wither_skeleton_seeds;
	public static SeedExtractorRecipe zombie_seeds;
	public static List<SeedExtractorRecipe> allRecipes = new ArrayList<SeedExtractorRecipe>();
	
	public static void preInit() {
		water_seeds = new SeedExtractorRecipe(RecipesConfig.water_seeds, Type.WATER);
		wood_seeds = new SeedExtractorRecipe(RecipesConfig.wood_seeds, Type.WOOD);
		copper_seeds = new SeedExtractorRecipe(RecipesConfig.copper_seeds, Type.COPPER);
		tin_seeds = new SeedExtractorRecipe(RecipesConfig.tin_seeds, Type.TIN);
		platinum_seeds = new SeedExtractorRecipe(RecipesConfig.platinum_seeds, Type.PLATINUM);
		aluminum_brass_seeds = new SeedExtractorRecipe(RecipesConfig.aluminum_brass_seeds, Type.ALUMINUM_BRASS);
		aluminum_seeds = new SeedExtractorRecipe(RecipesConfig.aluminum_seeds, Type.ALUMINUM);
		alumite_seeds = new SeedExtractorRecipe(RecipesConfig.alumite_seeds, Type.ALUMITE);
		ardite_seeds = new SeedExtractorRecipe(RecipesConfig.ardite_seeds, Type.ARDITE);
		black_quartz_seeds = new SeedExtractorRecipe(RecipesConfig.black_quartz_seeds, Type.BLACK_QUARTZ);
		boron_seeds = new SeedExtractorRecipe(RecipesConfig.boron_seeds, Type.BORON);
		brass_seeds = new SeedExtractorRecipe(RecipesConfig.brass_seeds, Type.BRASS);
		bronze_seeds = new SeedExtractorRecipe(RecipesConfig.bronze_seeds, Type.BRONZE);
		chrome_seeds = new SeedExtractorRecipe(RecipesConfig.chrome_seeds, Type.CHROME);
		coal_seeds = new SeedExtractorRecipe(RecipesConfig.coal_seeds, Type.COAL);
		cobalt_seeds = new SeedExtractorRecipe(RecipesConfig.cobalt_seeds, Type.COBALT);
		conductive_iron_seeds = new SeedExtractorRecipe(RecipesConfig.conductive_iron_seeds, Type.CONDUCTIVE_IRON);
		constantan_seeds = new SeedExtractorRecipe(RecipesConfig.constantan_seeds, Type.CONSTANTAN);
		dark_steel_seeds = new SeedExtractorRecipe(RecipesConfig.dark_steel_seeds, Type.DARK_STEEL);
		diamond_seeds = new SeedExtractorRecipe(RecipesConfig.diamond_seeds, Type.DIAMOND);
		draconium_seeds = new SeedExtractorRecipe(RecipesConfig.draconium_seeds, Type.DRACONIUM);
		dirt_seeds = new SeedExtractorRecipe(RecipesConfig.dirt_seeds, Type.DIRT);
		electrical_steel_seeds = new SeedExtractorRecipe(RecipesConfig.electrical_steel_seeds, Type.ELECTRICAL_STEEL);
		electrotine_seeds = new SeedExtractorRecipe(RecipesConfig.electrotine_seeds, Type.ELECTROTINE);
		electrum_seeds = new SeedExtractorRecipe(RecipesConfig.electrum_seeds, Type.ELECTRUM);
		emerald_seeds = new SeedExtractorRecipe(RecipesConfig.emerald_seeds, Type.EMERALD);
		end_steel_seeds = new SeedExtractorRecipe(RecipesConfig.end_steel_seeds, Type.END_STEEL);
		enderium_seeds = new SeedExtractorRecipe(RecipesConfig.enderium_seeds, Type.ENDERIUM);
		energetic_alloy_seeds = new SeedExtractorRecipe(RecipesConfig.energetic_alloy_seeds, Type.ENERGETIC_ALLOY);
		experience_seeds = new SeedExtractorRecipe(RecipesConfig.experience_seeds, Type.EXPERIENCE);
		glowstone_ingot_seeds = new SeedExtractorRecipe(RecipesConfig.glowstone_ingot_seeds, Type.GLOWSTONE_INGOT);
		glowstone_seeds = new SeedExtractorRecipe(RecipesConfig.glowstone_seeds, Type.GLOWSTONE);
		gold_seeds = new SeedExtractorRecipe(RecipesConfig.gold_seeds, Type.GOLD);
		grains_of_infinity_seeds = new SeedExtractorRecipe(RecipesConfig.grains_of_infinity_seeds, Type.GRAINS_OF_INFINITY);
		invar_seeds = new SeedExtractorRecipe(RecipesConfig.invar_seeds, Type.INVAR);
		iridium_seeds = new SeedExtractorRecipe(RecipesConfig.iridium_seeds, Type.IRIDIUM);
		iron_seeds = new SeedExtractorRecipe(RecipesConfig.iron_seeds, Type.IRON);
		knightslime_seeds = new SeedExtractorRecipe(RecipesConfig.knightslime_seeds, Type.KNIGHTSLIME);
		lapis_lazuli_seeds = new SeedExtractorRecipe(RecipesConfig.lapis_lazuli_seeds, Type.LAPIS_LAZULI);
		lead_seeds = new SeedExtractorRecipe(RecipesConfig.lead_seeds, Type.LEAD);
		limestone_seeds = new SeedExtractorRecipe(RecipesConfig.limestone_seeds, Type.LIMESTONE);
		lithium_seeds = new SeedExtractorRecipe(RecipesConfig.lithium_seeds, Type.LITHIUM);
		lumium_seeds = new SeedExtractorRecipe(RecipesConfig.lumium_seeds, Type.LUMIUM);
		magnesium_seeds = new SeedExtractorRecipe(RecipesConfig.magnesium_seeds, Type.MAGNESIUM);
		manyullyn_seeds = new SeedExtractorRecipe(RecipesConfig.manyullyn_seeds, Type.MANYULLYN);
		marble_seeds = new SeedExtractorRecipe(RecipesConfig.marble_seeds, Type.MARBLE);
		mithril_seeds = new SeedExtractorRecipe(RecipesConfig.mithril_seeds, Type.MITHRIL);
		nether_quartz_seeds = new SeedExtractorRecipe(RecipesConfig.nether_quartz_seeds, Type.NETHER_QUARTZ);
		nickel_seeds = new SeedExtractorRecipe(RecipesConfig.nickel_seeds, Type.NICKEL);
		obsidian_seeds = new SeedExtractorRecipe(RecipesConfig.obsidian_seeds, Type.OBSIDIAN);
		osmium_seeds = new SeedExtractorRecipe(RecipesConfig.osmium_seeds, Type.OSMIUM);
		peridot_seeds = new SeedExtractorRecipe(RecipesConfig.peridot_seeds, Type.PERIDOT);
		pulsating_iron_seeds = new SeedExtractorRecipe(RecipesConfig.pulsating_iron_seeds, Type.PULSATING_IRON);
		redstone_alloy_seeds = new SeedExtractorRecipe(RecipesConfig.redstone_alloy_seeds, Type.REDSTONE_ALLOY);
		redstone_seeds = new SeedExtractorRecipe(RecipesConfig.redstone_seeds, Type.REDSTONE);
		refined_obsidian_seeds = new SeedExtractorRecipe(RecipesConfig.refined_obsidian_seeds, Type.REFINED_OBSIDIAN);
		ruby_seeds = new SeedExtractorRecipe(RecipesConfig.ruby_seeds, Type.RUBY);
		saltpeter_seeds = new SeedExtractorRecipe(RecipesConfig.saltpeter_seeds, Type.SALTPETER);
		sapphire_seeds = new SeedExtractorRecipe(RecipesConfig.sapphire_seeds, Type.SAPPHIRE);
		signalum_seeds = new SeedExtractorRecipe(RecipesConfig.signalum_seeds, Type.SIGNALUM);
		silver_seeds = new SeedExtractorRecipe(RecipesConfig.silver_seeds, Type.SILVER);
		slate_seeds = new SeedExtractorRecipe(RecipesConfig.slate_seeds, Type.SLATE);
		slime_seeds = new SeedExtractorRecipe(RecipesConfig.slime_seeds, Type.SLIME);
		soularium_seeds = new SeedExtractorRecipe(RecipesConfig.soularium_seeds, Type.SOULARIUM);
		steel_seeds = new SeedExtractorRecipe(RecipesConfig.steel_seeds, Type.STEEL);
		thorium_seeds = new SeedExtractorRecipe(RecipesConfig.thorium_seeds, Type.THORIUM);
		titanium_seeds = new SeedExtractorRecipe(RecipesConfig.titanium_seeds, Type.TITANIUM);
		tungsten_seeds = new SeedExtractorRecipe(RecipesConfig.tungsten_seeds, Type.TUNGSTEN);
		uranium_seeds = new SeedExtractorRecipe(RecipesConfig.uranium_seeds, Type.URANIUM);
		vibrant_alloy_seeds = new SeedExtractorRecipe(RecipesConfig.vibrant_alloy_seeds, Type.VIBRANT_ALLOY);
		zinc_seeds = new SeedExtractorRecipe(RecipesConfig.zinc_seeds, Type.ZINC);
		abyssalnite_seeds = new SeedExtractorRecipe(RecipesConfig.abyssalnite_seeds, Type.ABYSSALNITE);
		adamantine_seeds = new SeedExtractorRecipe(RecipesConfig.adamantine_seeds, Type.ADAMANTINE);
		apatite_seeds = new SeedExtractorRecipe(RecipesConfig.apatite_seeds, Type.APATITE);
		aquarium_seeds = new SeedExtractorRecipe(RecipesConfig.aquarium_seeds, Type.AQUARIUM);
		basalt_seeds = new SeedExtractorRecipe(RecipesConfig.basalt_seeds, Type.BASALT);
		cold_iron_seeds = new SeedExtractorRecipe(RecipesConfig.cold_iron_seeds, Type.COLD_IRON);
		compressed_iron_seeds = new SeedExtractorRecipe(RecipesConfig.compressed_iron_seeds, Type.COMPRESSED_IRON);
		coralium_seeds = new SeedExtractorRecipe(RecipesConfig.coralium_seeds, Type.CORALIUM);
		dawnstone_seeds = new SeedExtractorRecipe(RecipesConfig.dawnstone_seeds, Type.DAWNSTONE);
		desh_seeds = new SeedExtractorRecipe(RecipesConfig.desh_seeds, Type.DESH);
		dreadium_seeds = new SeedExtractorRecipe(RecipesConfig.dreadium_seeds, Type.DREADIUM);
		end_seeds = new SeedExtractorRecipe(RecipesConfig.end_seeds, Type.END);
		fiery_ingot_seeds = new SeedExtractorRecipe(RecipesConfig.fiery_ingot_seeds, Type.FIERY_INGOT);
		fluxed_electrum_seeds = new SeedExtractorRecipe(RecipesConfig.fluxed_electrum_seeds, Type.FLUXED_ELECTRUM);
		jade_seeds = new SeedExtractorRecipe(RecipesConfig.jade_seeds, Type.JADE);
		knightmetal_seeds = new SeedExtractorRecipe(RecipesConfig.knightmetal_seeds, Type.KNIGHTMETAL);
		nether_seeds = new SeedExtractorRecipe(RecipesConfig.nether_seeds, Type.NETHER);
		octine_seeds = new SeedExtractorRecipe(RecipesConfig.octine_seeds, Type.OCTINE);
		slimy_bone_seeds = new SeedExtractorRecipe(RecipesConfig.slimy_bone_seeds, Type.SLIMY_BONE);
		star_steel_seeds = new SeedExtractorRecipe(RecipesConfig.star_steel_seeds, Type.STAR_STEEL);
		steeleaf_seeds = new SeedExtractorRecipe(RecipesConfig.steeleaf_seeds, Type.STEELEAF);
		syrmorite_seeds = new SeedExtractorRecipe(RecipesConfig.syrmorite_seeds, Type.SYRMORITE);
		thaumium_seeds = new SeedExtractorRecipe(RecipesConfig.thaumium_seeds, Type.THAUMIUM);
		tritanium_seeds = new SeedExtractorRecipe(RecipesConfig.tritanium_seeds, Type.TRITANIUM);
		valonite_seeds = new SeedExtractorRecipe(RecipesConfig.valonite_seeds, Type.VALONITE);
		void_metal_seeds = new SeedExtractorRecipe(RecipesConfig.void_metal_seeds, Type.VOID_METAL);
		ice_seeds = new SeedExtractorRecipe(RecipesConfig.ice_seeds, Type.ICE);
		amber_seeds = new SeedExtractorRecipe(RecipesConfig.amber_seeds, Type.AMBER);
		certus_quartz_seeds = new SeedExtractorRecipe(RecipesConfig.certus_quartz_seeds, Type.CERTUS_QUARTZ);
		dark_gem_seeds = new SeedExtractorRecipe(RecipesConfig.dark_gem_seeds, Type.DARK_GEM);
		elementium_seeds = new SeedExtractorRecipe(RecipesConfig.elementium_seeds, Type.ELEMENTIUM);
		ender_amethyst_seeds = new SeedExtractorRecipe(RecipesConfig.ender_amethyst_seeds, Type.ENDER_AMETHYST);
		ender_biotite_seeds = new SeedExtractorRecipe(RecipesConfig.ender_biotite_seeds, Type.ENDER_BIOTITE);
		fluix_seeds = new SeedExtractorRecipe(RecipesConfig.fluix_seeds, Type.FLUIX);
		ironwood_seeds = new SeedExtractorRecipe(RecipesConfig.ironwood_seeds, Type.IRONWOOD);
		malachite_seeds = new SeedExtractorRecipe(RecipesConfig.malachite_seeds, Type.MALACHITE);
		manasteel_seeds = new SeedExtractorRecipe(RecipesConfig.manasteel_seeds, Type.MANASTEEL);
		menril_seeds = new SeedExtractorRecipe(RecipesConfig.menril_seeds, Type.MENRIL);
		meteoric_iron_seeds = new SeedExtractorRecipe(RecipesConfig.meteoric_iron_seeds, Type.METEORIC_IRON);
		quartz_enriched_iron_seeds = new SeedExtractorRecipe(RecipesConfig.quartz_enriched_iron_seeds, Type.QUARTZ_ENRICHED_IRON);
		rock_crystal_seeds = new SeedExtractorRecipe(RecipesConfig.rock_crystal_seeds, Type.ROCK_CRYSTAL);
		sky_stone_seeds = new SeedExtractorRecipe(RecipesConfig.sky_stone_seeds, Type.SKY_STONE);
		tanzanite_seeds = new SeedExtractorRecipe(RecipesConfig.tanzanite_seeds, Type.TANZANITE);
		terrasteel_seeds = new SeedExtractorRecipe(RecipesConfig.terrasteel_seeds, Type.TERRASTEEL);
		topaz_seeds = new SeedExtractorRecipe(RecipesConfig.topaz_seeds, Type.TOPAZ);
		blue_topaz_seeds = new SeedExtractorRecipe(RecipesConfig.blue_topaz_seeds, Type.BLUE_TOPAZ);
		chimerite_seeds = new SeedExtractorRecipe(RecipesConfig.chimerite_seeds, Type.CHIMERITE);
		graphite_seeds = new SeedExtractorRecipe(RecipesConfig.graphite_seeds, Type.GRAPHITE);
		hop_graphite_seeds = new SeedExtractorRecipe(RecipesConfig.hop_graphite_seeds, Type.HOP_GRAPHITE);
		moonstone_seeds = new SeedExtractorRecipe(RecipesConfig.moonstone_seeds, Type.MOONSTONE);
		sunstone_seeds = new SeedExtractorRecipe(RecipesConfig.sunstone_seeds, Type.SUNSTONE);
		vinteum_seeds = new SeedExtractorRecipe(RecipesConfig.vinteum_seeds, Type.VINTEUM);
		yellorium_seeds = new SeedExtractorRecipe(RecipesConfig.yellorium_seeds, Type.YELLORIUM);
		mystical_flower_seeds = new SeedExtractorRecipe(RecipesConfig.mystical_flower_seeds, Type.MYSTICAL_FLOWER);
		nature_seeds = new SeedExtractorRecipe(RecipesConfig.nature_seeds, Type.NATURE);
		stone_seeds = new SeedExtractorRecipe(RecipesConfig.stone_seeds, Type.STONE);
		sulfur_seeds = new SeedExtractorRecipe(RecipesConfig.sulfur_seeds, Type.SULFUR);
		fire_seeds = new SeedExtractorRecipe(RecipesConfig.fire_seeds, Type.FIRE);
		aquamarine_seeds = new SeedExtractorRecipe(RecipesConfig.aquamarine_seeds, Type.AQUAMARINE);
		dilithium_seeds = new SeedExtractorRecipe(RecipesConfig.dilithium_seeds, Type.DILITHIUM);
		iridium_ore_seeds = new SeedExtractorRecipe(RecipesConfig.iridium_ore_seeds, Type.IRIDIUM_ORE);
		rubber_seeds = new SeedExtractorRecipe(RecipesConfig.rubber_seeds, Type.RUBBER);
		starmetal_seeds = new SeedExtractorRecipe(RecipesConfig.starmetal_seeds, Type.STARMETAL);
		uranium_238_seeds = new SeedExtractorRecipe(RecipesConfig.uranium_238_seeds, Type.URANIUM_238);
		quicksilver_seeds = new SeedExtractorRecipe(RecipesConfig.quicksilver_seeds, Type.QUICKSILVER);
		dye_seeds = new SeedExtractorRecipe(RecipesConfig.dye_seeds, Type.DYE);
		silicon_seeds = new SeedExtractorRecipe(RecipesConfig.silicon_seeds, Type.SILICON);
		basalz_seeds = new SeedExtractorRecipe(RecipesConfig.basalz_seeds, Type.BASALZ);
		blaze_seeds = new SeedExtractorRecipe(RecipesConfig.blaze_seeds, Type.BLAZE);
		blitz_seeds = new SeedExtractorRecipe(RecipesConfig.blitz_seeds, Type.BLITZ);
		blizz_seeds = new SeedExtractorRecipe(RecipesConfig.blizz_seeds, Type.BLIZZ);
		chicken_seeds = new SeedExtractorRecipe(RecipesConfig.chicken_seeds, Type.CHICKEN);
		cow_seeds = new SeedExtractorRecipe(RecipesConfig.cow_seeds, Type.COW);
		creeper_seeds = new SeedExtractorRecipe(RecipesConfig.creeper_seeds, Type.CREEPER);
		enderman_seeds = new SeedExtractorRecipe(RecipesConfig.enderman_seeds, Type.ENDERMAN);
		ghast_seeds = new SeedExtractorRecipe(RecipesConfig.ghast_seeds, Type.GHAST);
		guardian_seeds= new SeedExtractorRecipe(RecipesConfig.guardian_seeds, Type.GUARDIAN);
		pig_seeds = new SeedExtractorRecipe(RecipesConfig.pig_seeds, Type.PIG);
		rabbit_seeds = new SeedExtractorRecipe(RecipesConfig.rabbit_seeds, Type.RABBIT);
		sheep_seeds = new SeedExtractorRecipe(RecipesConfig.sheep_seeds, Type.SHEEP);
		skeleton_seeds = new SeedExtractorRecipe(RecipesConfig.skeleton_seeds, Type.SKELETON);
		spider_seeds = new SeedExtractorRecipe(RecipesConfig.spider_seeds, Type.SPIDER);
		wither_skeleton_seeds = new SeedExtractorRecipe(RecipesConfig.wither_skeleton_seeds, Type.WITHER_SKELETON);
		zombie_seeds = new SeedExtractorRecipe(RecipesConfig.zombie_seeds, Type.ZOMBIE);
		allRecipes.add(water_seeds);
		allRecipes.add(rubber_seeds);
		allRecipes.add(wood_seeds);
		allRecipes.add(copper_seeds);
		allRecipes.add(tin_seeds);
		allRecipes.add(platinum_seeds);
		allRecipes.add(aluminum_brass_seeds);
		allRecipes.add(aluminum_seeds);
		allRecipes.add(alumite_seeds);
		allRecipes.add(ardite_seeds);
		allRecipes.add(black_quartz_seeds);
		allRecipes.add(boron_seeds);
		allRecipes.add(brass_seeds);
		allRecipes.add(bronze_seeds);
		allRecipes.add(chrome_seeds);
		allRecipes.add(coal_seeds);
		allRecipes.add(cobalt_seeds);
		allRecipes.add(conductive_iron_seeds);
		allRecipes.add(constantan_seeds);
		allRecipes.add(dark_steel_seeds);
		allRecipes.add(diamond_seeds);
		allRecipes.add(draconium_seeds);
		allRecipes.add(dirt_seeds);
		allRecipes.add(electrical_steel_seeds);
		allRecipes.add(electrotine_seeds);
		allRecipes.add(electrum_seeds);
		allRecipes.add(emerald_seeds);
		allRecipes.add(end_steel_seeds);
		allRecipes.add(enderium_seeds);
		allRecipes.add(energetic_alloy_seeds);
		allRecipes.add(experience_seeds);
		allRecipes.add(glowstone_ingot_seeds);
		allRecipes.add(glowstone_seeds);
		allRecipes.add(gold_seeds);
		allRecipes.add(grains_of_infinity_seeds);
		allRecipes.add(invar_seeds);
		allRecipes.add(iridium_seeds);
		allRecipes.add(iron_seeds);
		allRecipes.add(knightslime_seeds);
		allRecipes.add(lapis_lazuli_seeds);
		allRecipes.add(lead_seeds);
		allRecipes.add(limestone_seeds);
		allRecipes.add(lithium_seeds);
		allRecipes.add(lumium_seeds);
		allRecipes.add(magnesium_seeds);
		allRecipes.add(manyullyn_seeds);
		allRecipes.add(marble_seeds);
		allRecipes.add(mithril_seeds);
		allRecipes.add(nether_quartz_seeds);
		allRecipes.add(nickel_seeds);
		allRecipes.add(obsidian_seeds);
		allRecipes.add(osmium_seeds);
		allRecipes.add(peridot_seeds);
		allRecipes.add(pulsating_iron_seeds);
		allRecipes.add(redstone_alloy_seeds);
		allRecipes.add(redstone_seeds);
		allRecipes.add(refined_obsidian_seeds);
		allRecipes.add(ruby_seeds);
		allRecipes.add(saltpeter_seeds);
		allRecipes.add(sapphire_seeds);
		allRecipes.add(signalum_seeds);
		allRecipes.add(silver_seeds);
		allRecipes.add(slate_seeds);
		allRecipes.add(slime_seeds);
		allRecipes.add(soularium_seeds);
		allRecipes.add(steel_seeds);
		allRecipes.add(thorium_seeds);
		allRecipes.add(titanium_seeds);
		allRecipes.add(tungsten_seeds);
		allRecipes.add(uranium_seeds);
		allRecipes.add(vibrant_alloy_seeds);
		allRecipes.add(zinc_seeds);
		allRecipes.add(abyssalnite_seeds);
		allRecipes.add(adamantine_seeds);
		allRecipes.add(apatite_seeds);
		allRecipes.add(aquarium_seeds);
		allRecipes.add(basalt_seeds);
		allRecipes.add(cold_iron_seeds);
		allRecipes.add(compressed_iron_seeds);
		allRecipes.add(coralium_seeds);
		allRecipes.add(dawnstone_seeds);
		allRecipes.add(desh_seeds);
		allRecipes.add(dreadium_seeds);
		allRecipes.add(end_seeds);
		allRecipes.add(fiery_ingot_seeds);
		allRecipes.add(fluxed_electrum_seeds);
		allRecipes.add(jade_seeds);
		allRecipes.add(knightmetal_seeds);
		allRecipes.add(nether_seeds);
		allRecipes.add(octine_seeds);
		allRecipes.add(slimy_bone_seeds);
		allRecipes.add(star_steel_seeds);
		allRecipes.add(steeleaf_seeds);
		allRecipes.add(syrmorite_seeds);
		allRecipes.add(thaumium_seeds);
		allRecipes.add(tritanium_seeds);
		allRecipes.add(valonite_seeds);
		allRecipes.add(void_metal_seeds);
		allRecipes.add(ice_seeds);
		allRecipes.add(amber_seeds);
		allRecipes.add(certus_quartz_seeds);
		allRecipes.add(dark_gem_seeds);
		allRecipes.add(elementium_seeds);
		allRecipes.add(ender_amethyst_seeds);
		allRecipes.add(ender_biotite_seeds);
		allRecipes.add(fluix_seeds);
		allRecipes.add(ironwood_seeds);
		allRecipes.add(malachite_seeds);
		allRecipes.add(manasteel_seeds);
		allRecipes.add(menril_seeds);
		allRecipes.add(meteoric_iron_seeds);
		allRecipes.add(quartz_enriched_iron_seeds);
		allRecipes.add(rock_crystal_seeds);
		allRecipes.add(sky_stone_seeds);
		allRecipes.add(tanzanite_seeds);
		allRecipes.add(terrasteel_seeds);
		allRecipes.add(topaz_seeds);
		allRecipes.add(blue_topaz_seeds);
		allRecipes.add(chimerite_seeds);
		allRecipes.add(graphite_seeds);
		allRecipes.add(hop_graphite_seeds);
		allRecipes.add(moonstone_seeds);
		allRecipes.add(sunstone_seeds);
		allRecipes.add(vinteum_seeds);
		allRecipes.add(yellorium_seeds);
		allRecipes.add(mystical_flower_seeds);
		allRecipes.add(nature_seeds);
		allRecipes.add(stone_seeds);
		allRecipes.add(sulfur_seeds);
		allRecipes.add(fire_seeds);
		allRecipes.add(aquamarine_seeds);
		allRecipes.add(dilithium_seeds);
		allRecipes.add(iridium_ore_seeds);
		allRecipes.add(starmetal_seeds);
		allRecipes.add(uranium_238_seeds);
		allRecipes.add(quicksilver_seeds);
		allRecipes.add(dye_seeds);
		allRecipes.add(silicon_seeds);
		allRecipes.add(basalz_seeds);
		allRecipes.add(blaze_seeds);
		allRecipes.add(blitz_seeds);
		allRecipes.add(blizz_seeds);
		allRecipes.add(chicken_seeds);
		allRecipes.add(cow_seeds);
		allRecipes.add(creeper_seeds);
		allRecipes.add(enderman_seeds);
		allRecipes.add(ghast_seeds);
		allRecipes.add(guardian_seeds);
		allRecipes.add(pig_seeds);
		allRecipes.add(rabbit_seeds);
		allRecipes.add(sheep_seeds);
		allRecipes.add(skeleton_seeds);
		allRecipes.add(spider_seeds);
		allRecipes.add(wither_skeleton_seeds);
		allRecipes.add(zombie_seeds);
	}
	
	public static void init() {
		if(ModCheck.MYSTICAL_AGRADDITIONS) {
			nether_star_seeds = new SeedExtractorRecipe(RecipesConfig.nether_star_seeds, new ItemStack(Item.getByNameOrId("mysticalagradditions:nether_star_seeds")), 6);
			awakened_draconium_seeds = new SeedExtractorRecipe(RecipesConfig.awakened_draconium_seeds, new ItemStack(Item.getByNameOrId("mysticalagradditions:awakened_draconium_seeds")), 6);
			dragon_egg_seeds = new SeedExtractorRecipe(RecipesConfig.dragon_egg_seeds, new ItemStack(Item.getByNameOrId("mysticalagradditions:dragon_egg_seeds")), 6);
			neutronium_seeds = new SeedExtractorRecipe(RecipesConfig.neutronium_seeds, new ItemStack(Item.getByNameOrId("mysticalagradditions:neutronium_seeds")), 6);
			allRecipes.add(nether_star_seeds);
			allRecipes.add(awakened_draconium_seeds);
			allRecipes.add(dragon_egg_seeds);
			allRecipes.add(neutronium_seeds);
		}
	}
}
