package com.focamacho.mysticaladaptations.config;

import com.focamacho.mysticaladaptations.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class RecipesConfig {
	
	public static Configuration config;
		
	public static String[] abyssalnite_seeds;
	public static String[] adamantine_seeds;
	public static String[] aluminum_brass_seeds;
	public static String[] aluminum_seeds;
	public static String[] alumite_seeds;
	public static String[] amber_seeds;
	public static String[] apatite_seeds;
	public static String[] aquamarine_seeds;
	public static String[] aquarium_seeds;
	public static String[] ardite_seeds;
	public static String[] basalt_seeds;
	public static String[] black_quartz_seeds;
	public static String[] blue_topaz_seeds;
	public static String[] boron_seeds;
	public static String[] brass_seeds;
	public static String[] bronze_seeds;
	public static String[] certus_quartz_seeds;
	public static String[] chimerite_seeds;
	public static String[] chrome_seeds;
	public static String[] coal_seeds;
	public static String[] cobalt_seeds;
	public static String[] cold_iron_seeds;
	public static String[] compressed_iron_seeds;
	public static String[] conductive_iron_seeds;
	public static String[] constantan_seeds;
	public static String[] copper_seeds;
	public static String[] coralium_seeds;
	public static String[] dark_gem_seeds;
	public static String[] dark_steel_seeds;
	public static String[] dawnstone_seeds;
	public static String[] desh_seeds;
	public static String[] diamond_seeds;
	public static String[] dilithium_seeds;
	public static String[] dirt_seeds;
	public static String[] draconium_seeds;
	public static String[] dreadium_seeds;
	public static String[] dye_seeds;
	public static String[] electrical_steel_seeds;
	public static String[] electrotine_seeds;
	public static String[] electrum_seeds;
	public static String[] elementium_seeds;
	public static String[] emerald_seeds;
	public static String[] end_seeds;
	public static String[] end_steel_seeds;
	public static String[] ender_amethyst_seeds;
	public static String[] ender_biotite_seeds;
	public static String[] enderium_seeds;
	public static String[] energetic_alloy_seeds;
	public static String[] experience_seeds;
	public static String[] fiery_ingot_seeds;
	public static String[] fire_seeds;
	public static String[] fluix_seeds;
	public static String[] fluxed_electrum_seeds;
	public static String[] glowstone_ingot_seeds;
	public static String[] glowstone_seeds;
	public static String[] gold_seeds;
	public static String[] grains_of_infinity_seeds;
	public static String[] graphite_seeds;
	public static String[] hop_graphite_seeds;
	public static String[] ice_seeds;
	public static String[] invar_seeds;
	public static String[] iridium_ore_seeds;
	public static String[] iridium_seeds;
	public static String[] iron_seeds;
	public static String[] ironwood_seeds;
	public static String[] jade_seeds;
	public static String[] knightmetal_seeds;
	public static String[] knightslime_seeds;
	public static String[] lapis_lazuli_seeds;
	public static String[] lead_seeds;
	public static String[] limestone_seeds;
	public static String[] lithium_seeds;
	public static String[] lumium_seeds;
	public static String[] magnesium_seeds;
	public static String[] malachite_seeds;
	public static String[] manasteel_seeds;
	public static String[] manyullyn_seeds;
	public static String[] marble_seeds;
	public static String[] menril_seeds;
	public static String[] meteoric_iron_seeds;
	public static String[] mithril_seeds;
	public static String[] moonstone_seeds;
	public static String[] mystical_flower_seeds;
	public static String[] nature_seeds;
	public static String[] nether_quartz_seeds;
	public static String[] nether_seeds;
	public static String[] nickel_seeds;
	public static String[] obsidian_seeds;
	public static String[] octine_seeds;
	public static String[] osmium_seeds;
	public static String[] peridot_seeds;
	public static String[] platinum_seeds;
	public static String[] pulsating_iron_seeds;
	public static String[] quartz_enriched_iron_seeds;
	public static String[] quicksilver_seeds;
	public static String[] redstone_alloy_seeds;
	public static String[] redstone_seeds;
	public static String[] refined_obsidian_seeds;
	public static String[] rock_crystal_seeds;
	public static String[] rubber_seeds;
	public static String[] ruby_seeds;
	public static String[] saltpeter_seeds;
	public static String[] sapphire_seeds;
	public static String[] signalum_seeds;
	public static String[] silicon_seeds;
	public static String[] silver_seeds;
	public static String[] sky_stone_seeds;
	public static String[] slate_seeds;
	public static String[] slimy_bone_seeds;
	public static String[] soularium_seeds;
	public static String[] star_steel_seeds;
	public static String[] starmetal_seeds;
	public static String[] steel_seeds;
	public static String[] steeleaf_seeds;
	public static String[] stone_seeds;
	public static String[] sulfur_seeds;
	public static String[] sunstone_seeds;
	public static String[] syrmorite_seeds;
	public static String[] tanzanite_seeds;
	public static String[] terrasteel_seeds;
	public static String[] thaumium_seeds;
	public static String[] thorium_seeds;
	public static String[] tin_seeds;
	public static String[] titanium_seeds;
	public static String[] topaz_seeds;
	public static String[] tritanium_seeds;
	public static String[] tungsten_seeds;
	public static String[] uranium_238_seeds;
	public static String[] uranium_seeds;
	public static String[] valonite_seeds;
	public static String[] vibrant_alloy_seeds;
	public static String[] vinteum_seeds;
	public static String[] void_metal_seeds;
	public static String[] water_seeds;
	public static String[] wood_seeds;
	public static String[] yellorium_seeds;
	public static String[] zinc_seeds;
	public static String[] awakened_draconium_seeds;
	public static String[] dragon_egg_seeds;
	public static String[] nether_star_seeds;
	public static String[] neutronium_seeds;
	public static String[] basalz_seeds;
	public static String[] blaze_seeds;
	public static String[] blitz_seeds;
	public static String[] blizz_seeds;
	public static String[] chicken_seeds;
	public static String[] cow_seeds;
	public static String[] creeper_seeds;
	public static String[] enderman_seeds;
	public static String[] ghast_seeds;
	public static String[] guardian_seeds;
	public static String[] pig_seeds;
	public static String[] rabbit_seeds;
	public static String[] sheep_seeds;
	public static String[] skeleton_seeds;
	public static String[] slime_seeds;
	public static String[] spider_seeds;
	public static String[] wither_skeleton_seeds;
	public static String[] zombie_seeds;
	
	@SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
        if(eventArgs.getModID().equals(Reference.MOD_ID)) {
            RecipesConfig.syncConfig();
        }
    }
	
	public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
	}
	
	public static void syncConfig() {
	
		String category;

		category = "Recipes";
		config.addCustomCategoryComment(category, "Set which block or entity drops a seed when right-clicked/killed using a Seed Extractor");
	    abyssalnite_seeds = config.get(category, "abyssalnite_seeds", new String[] {"ore:blockAbyssalnite"}).getStringList();
	    adamantine_seeds = config.get(category, "adamantine_seeds", new String[] {"ore:blockAdamantine"}).getStringList();
	    aluminum_brass_seeds = config.get(category, "aluminum_brass_seeds", new String[] {"ore:blockAlubrass"}).getStringList();
	    aluminum_seeds = config.get(category, "aluminum_seeds", new String[] {"ore:blockAluminum"}).getStringList();
	    alumite_seeds = config.get(category, "alumite_seeds", new String[] {"ore:blockAlumite"}).getStringList();
	    amber_seeds = config.get(category, "amber_seeds", new String[] {"biomesoplenty:gem_block:7"}).getStringList();
	    apatite_seeds = config.get(category, "apatite_seeds", new String[] {"ore:blockApatite"}).getStringList();
	    aquamarine_seeds = config.get(category, "aquamarine_seeds", new String[] {"astralsorcery:blockcustomsandore"}).getStringList();
	    aquarium_seeds = config.get(category, "aquarium_seeds", new String[] {"ore:blockAquarium"}).getStringList();
	    ardite_seeds = config.get(category, "ardite_seeds", new String[] {"ore:blockArdite"}).getStringList();
	    basalt_seeds = config.get(category, "basalt_seeds", new String[] {"ore:stoneBasalt"}).getStringList();
	    black_quartz_seeds = config.get(category, "black_quartz_seeds", new String[]{"actuallyadditions:block_misc", "actuallyadditions:block_misc:1", "actuallyadditions:block_misc:2"}).getStringList();
	    blue_topaz_seeds = config.get(category, "blue_topaz_seeds", new String[] {"ore:blockBlueTopaz"}).getStringList();
	    boron_seeds = config.get(category, "boron_seeds", new String[] {"ore:blockBoron"}).getStringList();
	    brass_seeds = config.get(category, "brass_seeds", new String[] {"ore:blockBrass"}).getStringList();
	    bronze_seeds = config.get(category, "bronze_seeds", new String[] {"ore:blockBronze"}).getStringList();
	    certus_quartz_seeds = config.get(category, "certus_quartz_seeds", new String[] {"appliedenergistics2:quartz_block"}).getStringList();
	    chimerite_seeds = config.get(category, "chimerite_seeds", new String[] {"ore:blockChimerite"}).getStringList();
	    chrome_seeds = config.get(category, "chrome_seeds", new String[] {"ore:blockChrome"}).getStringList();
	    coal_seeds = config.get(category, "coal_seeds", new String[] {"ore:blockCoal"}).getStringList();
	    cobalt_seeds = config.get(category, "cobalt_seeds", new String[] {"ore:blockCobalt"}).getStringList();
	    cold_iron_seeds = config.get(category, "cold_iron_seeds", new String[] {"ore:blockColdiron"}).getStringList();
	    compressed_iron_seeds = config.get(category, "compressed_iron_seeds", new String[] {"ore:blockIronCompressed"}).getStringList();
	    conductive_iron_seeds = config.get(category, "conductive_iron_seeds", new String[] {"ore:blockConductiveIron"}).getStringList();
	    constantan_seeds = config.get(category, "constantan_seeds", new String[] {"ore:blockConstantan"}).getStringList();
	    copper_seeds = config.get(category, "copper_seeds", new String[] {"ore:blockCopper"}).getStringList();
	    coralium_seeds = config.get(category, "coralium_seeds", new String[] {"ore:blockLiquifiedCoralium"}).getStringList();
	    dark_gem_seeds = config.get(category, "dark_gem_seeds", new String[] {"evilcraft:dark_block"}).getStringList();
	    dark_steel_seeds = config.get(category, "dark_steel_seeds", new String[] {"ore:blockDarkSteel"}).getStringList();
	    dawnstone_seeds = config.get(category, "dawnstone_seeds", new String[] {"ore:blockDawnstone"}).getStringList();
	    desh_seeds = config.get(category, "desh_seeds", new String[] {"ore:blockDesh"}).getStringList();
	    diamond_seeds = config.get(category, "diamond_seeds", new String[] {"ore:blockDiamond"}).getStringList();
	    dilithium_seeds = config.get(category, "dilithium_seeds", new String[] {"ore:oreDilithium"}).getStringList();
	    dirt_seeds = config.get(category, "dirt_seeds", new String[] {"ore:dirt"}).getStringList();
	    draconium_seeds = config.get(category, "draconium_seeds", new String[] {"ore:blockDraconium"}).getStringList();
	    dreadium_seeds = config.get(category, "dreadium_seeds", new String[] {"ore:blockDreadium"}).getStringList();
	    dye_seeds = config.get(category, "dye_seeds", new String[] {"minecraft:yellow_flower", "minecraft:red_flower", "minecraft:red_flower:1", "minecraft:red_flower:2", "minecraft:red_flower:3", "minecraft:red_flower:4", "minecraft:red_flower:5", "minecraft:red_flower:6", "minecraft:red_flower:7", "minecraft:red_flower:8"}).getStringList();
	    electrical_steel_seeds = config.get(category, "electrical_steel_seeds", new String[] {"ore:blockElectricalSteel"}).getStringList();
	    electrotine_seeds = config.get(category, "electrotine_seeds", new String[] {"ore:blockElectrotine"}).getStringList();
	    electrum_seeds = config.get(category, "electrum_seeds", new String[] {"ore:blockElectrum"}).getStringList();
	    elementium_seeds = config.get(category, "elementium_seeds", new String[] {"botania:storage:2"}).getStringList();
	    emerald_seeds = config.get(category, "emerald_seeds", new String[] {"ore:blockEmerald"}).getStringList();
	    end_seeds = config.get(category, "end_seeds", new String[] {"ore:endstone"}).getStringList();
	    end_steel_seeds = config.get(category, "end_steel_seeds", new String[] {"ore:blockEndSteel"}).getStringList();
	    ender_amethyst_seeds = config.get(category, "ender_amethyst_seeds", new String[] {"biomesoplenty:gem_block"}).getStringList();
	    ender_biotite_seeds = config.get(category, "ender_biotite_seeds", new String[] {"quark:biotite_block"}).getStringList();
	    enderium_seeds = config.get(category, "enderium_seeds", new String[] {"ore:blockEnderium"}).getStringList();
	    energetic_alloy_seeds = config.get(category, "energetic_alloy_seeds", new String[] {"ore:blockEnergeticAlloy"}).getStringList();
	    experience_seeds = config.get(category, "experience_seeds", new String[] {""}).getStringList();
	    fiery_ingot_seeds = config.get(category, "fiery_ingot_seeds", new String[] {"ore:blockFiery"}).getStringList();
	    fire_seeds = config.get(category, "fire_seeds", new String[] {"minecraft:lava"}).getStringList();
	    fluix_seeds = config.get(category, "fluix_seeds", new String[] {"appliedenergistics2:fluix_block"}).getStringList();
	    fluxed_electrum_seeds = config.get(category, "fluxed_electrum_seeds", new String[] {"ore:blockElectrumFlux"}).getStringList();
	    glowstone_ingot_seeds = config.get(category, "glowstone_ingot_seeds", new String[] {"ore:blockRefinedGlowstone"}).getStringList();
	    glowstone_seeds = config.get(category, "glowstone_seeds", new String[] {"ore:glowstone"}).getStringList();
	    gold_seeds = config.get(category, "gold_seeds", new String[] {"ore:blockGold"}).getStringList();
	    grains_of_infinity_seeds = config.get(category, "grains_of_infinity_seeds", new String[] {"ore:compressed1xDustBedrock"}).getStringList();
	    graphite_seeds = config.get(category, "graphite_seeds", new String[] {"ore:blockGraphite"}).getStringList();
	    hop_graphite_seeds = config.get(category, "hop_graphite_seeds", new String[] {"ore:blockHOPGraphite"}).getStringList();
	    ice_seeds = config.get(category, "ice_seeds", new String[] {"minecraft:snow", "minecraft:ice", "minecraft:packed_ice"}).getStringList();
	    invar_seeds = config.get(category, "invar_seeds", new String[] {"ore:blockInvar"}).getStringList();
	    iridium_ore_seeds = config.get(category, "iridium_ore_seeds", new String[] {"ore:oreIridium"}).getStringList();
	    iridium_seeds = config.get(category, "iridium_seeds", new String[] {"ore:blockIridium"}).getStringList();
	    iron_seeds = config.get(category, "iron_seeds", new String[] {"ore:blockIron"}).getStringList();
	    ironwood_seeds = config.get(category, "ironwood_seeds", new String[] {"twilightforest:block_storage"}).getStringList();
	    jade_seeds = config.get(category, "jade_seeds", new String[] {"ore:blockJade"}).getStringList();
	    knightmetal_seeds = config.get(category, "knightmetal_seeds", new String[] {"ore:blockKnightmetal"}).getStringList();
	    knightslime_seeds = config.get(category, "knightslime_seeds", new String[] {"ore:blockKnightslime"}).getStringList();
	    lapis_lazuli_seeds = config.get(category, "lapis_lazuli_seeds", new String[] {"ore:blockLapis"}).getStringList();
	    lead_seeds = config.get(category, "lead_seeds", new String[] {"ore:blockLead"}).getStringList();
	    limestone_seeds = config.get(category, "limestone_seeds", new String[] {"ore:stoneLimestone"}).getStringList();
	    lithium_seeds = config.get(category, "lithium_seeds", new String[] {"ore:blockLithium"}).getStringList();
	    lumium_seeds = config.get(category, "lumium_seeds", new String[] {"ore:blockLumium"}).getStringList();
	    magnesium_seeds = config.get(category, "magnesium_seeds", new String[] {"ore:blockMagnesium"}).getStringList();
	    malachite_seeds = config.get(category, "malachite_seeds", new String[] {"biomesoplenty:gem_block:5"}).getStringList();
	    manasteel_seeds = config.get(category, "manasteel_seeds", new String[] {"botania:storage"}).getStringList();
	    manyullyn_seeds = config.get(category, "manyullyn_seeds", new String[] {"ore:blockManyullyn"}).getStringList();
	    marble_seeds = config.get(category, "marble_seeds", new String[] {"ore:stoneMarble"}).getStringList();
	    menril_seeds = config.get(category, "menril_seeds", new String[] {"integrateddynamics:crystalized_menril_block"}).getStringList();
	    meteoric_iron_seeds = config.get(category, "meteoric_iron_seeds", new String[] {"galacticraftcore:basic_block_core:12"}).getStringList();
	    mithril_seeds = config.get(category, "mithril_seeds", new String[] {"ore:blockMithril"}).getStringList();
	    moonstone_seeds = config.get(category, "moonstone_seeds", new String[] {"ore:blockMoonstone"}).getStringList();
	    mystical_flower_seeds = config.get(category, "mystical_flower_seeds", new String[] {"botania:flower", "botania:flower:1", "botania:flower:2", "botania:flower:3", "botania:flower:4", "botania:flower:5", "botania:flower:6", "botania:flower:7", "botania:flower:8", "botania:flower:9", "botania:flower:10", "botania:flower:11", "botania:flower:12", "botania:flower:13", "botania:flower:14", "botania:flower:15"}).getStringList();
	    nature_seeds = config.get(category, "nature_seeds", new String[] {"minecraft:vine", "minecraft:cactus", "minecraft:reeds", "minecraft:pumpkin", "minecraft:melon_block", "minecraft:waterlily", "minecraft:tallgrass:1", "minecraft:dye:3", "minecraft:carrot", "minecraft:potato"}).getStringList();
	    nether_quartz_seeds = config.get(category, "nether_quartz_seeds", new String[] {"ore:blockQuartz"}).getStringList();
	    nether_seeds = config.get(category, "nether_seeds", new String[] {"ore:netherrack"}).getStringList();
	    nickel_seeds = config.get(category, "nickel_seeds", new String[] {"ore:blockNickel"}).getStringList();
	    obsidian_seeds = config.get(category, "obsidian_seeds", new String[] {"ore:obsidian"}).getStringList();
	    octine_seeds = config.get(category, "octine_seeds", new String[] {"ore:blockOctine"}).getStringList();
	    osmium_seeds = config.get(category, "osmium_seeds", new String[] {"ore:blockOsmium"}).getStringList();
	    peridot_seeds = config.get(category, "peridot_seeds", new String[] {"ore:blockPeridot"}).getStringList();
	    platinum_seeds = config.get(category, "platinum_seeds", new String[] {"ore:blockPlatinum"}).getStringList();
	    pulsating_iron_seeds = config.get(category, "pulsating_iron_seeds", new String[] {"ore:blockPulsatingIron"}).getStringList();
	    quartz_enriched_iron_seeds = config.get(category, "quartz_enriched_iron_seeds", new String[] {"refinedstorage:quartz_enriched_iron_block"}).getStringList();
	    quicksilver_seeds = config.get(category, "quicksilver_seeds", new String[] {"thaumcraft:ore_cinnabar"}).getStringList();
	    redstone_alloy_seeds = config.get(category, "redstone_alloy_seeds", new String[] {"ore:blockRedstoneAlloy"}).getStringList();
	    redstone_seeds = config.get(category, "redstone_seeds", new String[] {"ore:blockRedstone"}).getStringList();
	    refined_obsidian_seeds = config.get(category, "refined_obsidian_seeds", new String[] {"ore:blockRefinedObsidian"}).getStringList();
	    rock_crystal_seeds = config.get(category, "rock_crystal_seeds", new String[] {"astralsorcery:blockcustomore"}).getStringList();
	    rubber_seeds = config.get(category, "rubber_seeds", new String[] {"ore:logRubber", "ore:woodRubber"}).getStringList();
	    ruby_seeds = config.get(category, "ruby_seeds", new String[] {"ore:blockRuby"}).getStringList();
	    saltpeter_seeds = config.get(category, "saltpeter_seeds", new String[] {""}).getStringList();
	    sapphire_seeds = config.get(category, "sapphire_seeds", new String[] {"ore:blockSapphire"}).getStringList();
	    signalum_seeds = config.get(category, "signalum_seeds", new String[] {"ore:blockSignalum"}).getStringList();
	    silicon_seeds = config.get(category, "silicon_seeds", new String[] {"ore:blockSilicon"}).getStringList();
	    silver_seeds = config.get(category, "silver_seeds", new String[] {"ore:blockSilver"}).getStringList();
	    sky_stone_seeds = config.get(category, "sky_stone_seeds", new String[] {"appliedenergistics2:sky_stone_block"}).getStringList();
	    slate_seeds = config.get(category, "slate_seeds", new String[] {"ore:slate"}).getStringList();
	    slime_seeds = config.get(category, "slime_seeds", new String[] {"ore:blockSlime;entity:minecraft:slime"}).getStringList();
	    slimy_bone_seeds = config.get(category, "slimy_bone_seeds", new String[] {"ore:blockBone"}).getStringList();
	    soularium_seeds = config.get(category, "soularium_seeds", new String[] {"ore:blockSoularium"}).getStringList();
	    star_steel_seeds = config.get(category, "star_steel_seeds", new String[] {"ore:blockStarsteel"}).getStringList();
	    starmetal_seeds = config.get(category, "starmetal_seeds", new String[] {"ore:oreAstralStarmetal"}).getStringList();
	    steel_seeds = config.get(category, "steel_seeds", new String[] {"ore:blockSteel"}).getStringList();
	    steeleaf_seeds = config.get(category, "steeleaf_seeds", new String[] {"ore:blockSteeleaf"}).getStringList();
	    stone_seeds = config.get(category, "stone_seeds", new String[] {"ore:stone"}).getStringList();
	    sulfur_seeds = config.get(category, "sulfur_seeds", new String[] {""}).getStringList();
	    sunstone_seeds = config.get(category, "sunstone_seeds", new String[] {"ore:blockSunstone"}).getStringList();
	    syrmorite_seeds = config.get(category, "syrmorite_seeds", new String[] {"ore:blockSyrmorite"}).getStringList();
	    tanzanite_seeds = config.get(category, "tanzanite_seeds", new String[] {"biomesoplenty:gem_block:4"}).getStringList();
	    terrasteel_seeds = config.get(category, "terrasteel_seeds", new String[] {"botania:storage:1"}).getStringList();
	    thaumium_seeds = config.get(category, "thaumium_seeds", new String[] {"ore:blockThaumium"}).getStringList();
	    thorium_seeds = config.get(category, "thorium_seeds", new String[] {"ore:blockThroium"}).getStringList();
	    tin_seeds = config.get(category, "tin_seeds", new String[] {"ore:blockTin"}).getStringList();
	    titanium_seeds = config.get(category, "titanium_seeds", new String[] {"ore:blockTitanium"}).getStringList();
	    topaz_seeds = config.get(category, "topaz_seeds", new String[] {"biomesoplenty:gem_block:3"}).getStringList();
	    tritanium_seeds = config.get(category, "tritanium_seeds", new String[] {"ore:blockTritanium"}).getStringList();
	    tungsten_seeds = config.get(category, "tungsten_seeds", new String[] {"ore:blockTungsten"}).getStringList();
	    uranium_238_seeds = config.get(category, "uranium_238_seeds", new String[] {"ic2:resource:10"}).getStringList();
	    uranium_seeds = config.get(category, "uranium_seeds", new String[] {"ore:blockUranium"}).getStringList();
	    valonite_seeds = config.get(category, "valonite_seeds", new String[] {"ore:blockValonite"}).getStringList();
	    vibrant_alloy_seeds = config.get(category, "vibrant_alloy_seeds", new String[] {"ore:blockVibrantAlloy"}).getStringList();
	    vinteum_seeds = config.get(category, "vinteum_seeds", new String[] {"ore:blockVinteum"}).getStringList();
	    void_metal_seeds = config.get(category, "void_metal_seeds", new String[] {"ore:blockVoid"}).getStringList();
	    water_seeds = config.get(category, "water_seeds", new String[] {"minecraft:water"}).getStringList();
	    wood_seeds = config.get(category, "wood_seeds", new String[] {"ore:logWood"}).getStringList();
	    yellorium_seeds = config.get(category, "yellorium_seeds", new String[] {"ore:blockYellorium"}).getStringList();
	    zinc_seeds = config.get(category, "zinc_seeds", new String[] {"ore:blockZinc"}).getStringList();
	    awakened_draconium_seeds = config.get(category, "awakened_draconium_seeds", new String[] {"ore:blockDraconiumAwakened"}).getStringList();
	    dragon_egg_seeds = config.get(category, "dragon_egg_seeds", new String[] {"minecraft:dragon_egg"}).getStringList();
	    nether_star_seeds = config.get(category, "nether_star_seeds", new String[] {"ore:blockNetherStar"}).getStringList();
	    neutronium_seeds = config.get(category, "neutronium_seeds", new String[] {"ore:blockCosmicNeutronium"}).getStringList();
		basalz_seeds = config.get(category, "basalz_seeds", new String[] {"entity:thermalfoundation:basalz"}).getStringList();
		blaze_seeds = config.get(category, "blaze_seeds", new String[] {"entity:minecraft:blaze"}).getStringList();
		blitz_seeds = config.get(category, "blitz_seeds", new String[] {"entity:thermalfoundation:blitz"}).getStringList();
		blizz_seeds = config.get(category, "blizz_seeds", new String[] {"entity:thermalfoundation:blizz"}).getStringList();
		chicken_seeds = config.get(category, "chicken_seeds", new String[] {"entity:minecraft:chicken"}).getStringList();
		cow_seeds = config.get(category, "cow_seeds", new String[] {"entity:minecraft:cow"}).getStringList();
		creeper_seeds = config.get(category, "creeper_seeds", new String[] {"entity:minecraft:creeper"}).getStringList();
		enderman_seeds = config.get(category, "enderman_seeds", new String[] {"entity:minecraft:enderman"}).getStringList();
		ghast_seeds = config.get(category, "ghast_seeds", new String[] {"entity:minecraft:ghast"}).getStringList();
		guardian_seeds = config.get(category, "guardian_seeds", new String[] {"entity:minecraft:guardian"}).getStringList();
		pig_seeds = config.get(category, "pig_seeds", new String[] {"entity:minecraft:pig"}).getStringList();
		rabbit_seeds = config.get(category, "rabbit_seeds", new String[] {"entity:minecraft:rabbit"}).getStringList();
		sheep_seeds = config.get(category, "sheep_seeds", new String[] {"entity:minecraft:sheep"}).getStringList();
		skeleton_seeds = config.get(category, "skeleton_seeds", new String[] {"entity:minecraft:skeleton"}).getStringList();
		spider_seeds = config.get(category, "spider_seeds", new String[] {"entity:minecraft:spider"}).getStringList();
		wither_skeleton_seeds = config.get(category, "wither_skeleton_seeds", new String[] {"entity:minecraft:wither_skeleton"}).getStringList();
		zombie_seeds = config.get(category, "zombie_seeds", new String[] {"entity:minecraft:zombie"}).getStringList();
	    
		if(config.hasChanged()){
			config.save();
		}
	}
} 
