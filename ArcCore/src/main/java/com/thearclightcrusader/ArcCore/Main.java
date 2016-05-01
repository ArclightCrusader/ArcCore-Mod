package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.armor.ArmorAbyss;
import com.thearclightcrusader.ArcCore.armor.ArmorArclight;
import com.thearclightcrusader.ArcCore.armor.ArmorAscended;
import com.thearclightcrusader.ArcCore.armor.ArmorBacon;
import com.thearclightcrusader.ArcCore.armor.ArmorMoissanite;
import com.thearclightcrusader.ArcCore.armor.ArmorNihil;
import com.thearclightcrusader.ArcCore.armor.ArmorPalladium;
import com.thearclightcrusader.ArcCore.blocks.ArcCoreFurnace;
import com.thearclightcrusader.ArcCore.blocks.ArcCoreInfuser;
import com.thearclightcrusader.ArcCore.blocks.ArcCoreLamp;
import com.thearclightcrusader.ArcCore.blocks.AscendedOre;
import com.thearclightcrusader.ArcCore.blocks.BaconLeaf;
import com.thearclightcrusader.ArcCore.blocks.BaconSapling;
import com.thearclightcrusader.ArcCore.blocks.BaconWood;
import com.thearclightcrusader.ArcCore.blocks.ChocoCake;
import com.thearclightcrusader.ArcCore.blocks.CrystalOre;
import com.thearclightcrusader.ArcCore.blocks.FairyDirt;
import com.thearclightcrusader.ArcCore.blocks.FairyGrass;
import com.thearclightcrusader.ArcCore.blocks.FairyPlanks;
import com.thearclightcrusader.ArcCore.blocks.FairyStone;
import com.thearclightcrusader.ArcCore.blocks.FireStone;
import com.thearclightcrusader.ArcCore.blocks.GildedDirt;
import com.thearclightcrusader.ArcCore.blocks.GildedGrass;
import com.thearclightcrusader.ArcCore.blocks.GildedLeaf;
import com.thearclightcrusader.ArcCore.blocks.GildedLog;
import com.thearclightcrusader.ArcCore.blocks.GildedPlanks;
import com.thearclightcrusader.ArcCore.blocks.GildedSapling;
import com.thearclightcrusader.ArcCore.blocks.GildedStone;
import com.thearclightcrusader.ArcCore.blocks.GildedStoneBricks;
import com.thearclightcrusader.ArcCore.blocks.MoissaniteOre;
import com.thearclightcrusader.ArcCore.blocks.NihilBlock;
import com.thearclightcrusader.ArcCore.blocks.PalladiumOre;
import com.thearclightcrusader.ArcCore.blocks.UBlackStoneSlab;
import com.thearclightcrusader.ArcCore.blocks.UEmeraldStoneSlab;
import com.thearclightcrusader.ArcCore.blocks.UFairyStoneBricks;
import com.thearclightcrusader.ArcCore.blocks.UFairyStoneSlab;
import com.thearclightcrusader.ArcCore.blocks.UFairyStoneStairs;
import com.thearclightcrusader.ArcCore.blocks.UGildedStoneBricks;
import com.thearclightcrusader.ArcCore.blocks.UGildedStoneSlab;
import com.thearclightcrusader.ArcCore.blocks.ULightBlock;
import com.thearclightcrusader.ArcCore.blocks.UPlatinumStoneSlab;
import com.thearclightcrusader.ArcCore.blocks.USapphireStoneSlab;
import com.thearclightcrusader.ArcCore.blocks.UWhiteStoneSlab;
import com.thearclightcrusader.ArcCore.entity.EntityCyclops;
import com.thearclightcrusader.ArcCore.entity.EntityFairy;
import com.thearclightcrusader.ArcCore.entity.EntityNihil;
import com.thearclightcrusader.ArcCore.gui.GuiHandler;
import com.thearclightcrusader.ArcCore.handler.EntityHandler;
import com.thearclightcrusader.ArcCore.items.ArcCore;
import com.thearclightcrusader.ArcCore.items.ArcDiamond;
import com.thearclightcrusader.ArcCore.items.ArclightIngot;
import com.thearclightcrusader.ArcCore.items.AscendedIngot;
import com.thearclightcrusader.ArcCore.items.Bacon;
import com.thearclightcrusader.ArcCore.items.BaconBeer;
import com.thearclightcrusader.ArcCore.items.BaconCooked;
import com.thearclightcrusader.ArcCore.items.BaconRoot;
import com.thearclightcrusader.ArcCore.items.CalciumAcetate;
import com.thearclightcrusader.ArcCore.items.CyclopsEye;
import com.thearclightcrusader.ArcCore.items.EmeraldBacon;
import com.thearclightcrusader.ArcCore.items.FairyDust;
import com.thearclightcrusader.ArcCore.items.FuelGel;
import com.thearclightcrusader.ArcCore.items.InfusedQuartz;
import com.thearclightcrusader.ArcCore.items.ItemBlackStoneSlab;
import com.thearclightcrusader.ArcCore.items.ItemEmeraldStoneSlab;
import com.thearclightcrusader.ArcCore.items.ItemFairyStoneSlab;
import com.thearclightcrusader.ArcCore.items.ItemGildedStoneSlab;
import com.thearclightcrusader.ArcCore.items.ItemLeafBlocks;
import com.thearclightcrusader.ArcCore.items.ItemLogBlocks;
import com.thearclightcrusader.ArcCore.items.ItemPlatinumStoneSlab;
import com.thearclightcrusader.ArcCore.items.ItemSaplingBlocks;
import com.thearclightcrusader.ArcCore.items.ItemWhiteStoneSlab;
import com.thearclightcrusader.ArcCore.items.Moissanite;
import com.thearclightcrusader.ArcCore.items.NihilSoulShard;
import com.thearclightcrusader.ArcCore.items.OrganicFuelGel;
import com.thearclightcrusader.ArcCore.items.PalladiumIngot;
import com.thearclightcrusader.ArcCore.items.PrototypeCore;
import com.thearclightcrusader.ArcCore.items.SurvivalistFuelGel;
import com.thearclightcrusader.ArcCore.items.WaterTalisman;
import com.thearclightcrusader.ArcCore.proxy.*;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreFurnace;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreInfuser;
import com.thearclightcrusader.ArcCore.tools.AbyssalAxe;
import com.thearclightcrusader.ArcCore.tools.AbyssalHoe;
import com.thearclightcrusader.ArcCore.tools.AbyssalPick;
import com.thearclightcrusader.ArcCore.tools.AbyssalShovel;
import com.thearclightcrusader.ArcCore.tools.AbyssalSword;
import com.thearclightcrusader.ArcCore.tools.ArclightAxe;
import com.thearclightcrusader.ArcCore.tools.ArclightHoe;
import com.thearclightcrusader.ArcCore.tools.ArclightPick;
import com.thearclightcrusader.ArcCore.tools.ArclightShovel;
import com.thearclightcrusader.ArcCore.tools.ArclightSword;
import com.thearclightcrusader.ArcCore.tools.AscendedAxe;
import com.thearclightcrusader.ArcCore.tools.AscendedHoe;
import com.thearclightcrusader.ArcCore.tools.AscendedPick;
import com.thearclightcrusader.ArcCore.tools.AscendedShovel;
import com.thearclightcrusader.ArcCore.tools.AscendedSword;
import com.thearclightcrusader.ArcCore.tools.BaconAxe;
import com.thearclightcrusader.ArcCore.tools.BaconHoe;
import com.thearclightcrusader.ArcCore.tools.BaconPick;
import com.thearclightcrusader.ArcCore.tools.BaconShovel;
import com.thearclightcrusader.ArcCore.tools.BaconSword;
import com.thearclightcrusader.ArcCore.tools.MoissaniteAxe;
import com.thearclightcrusader.ArcCore.tools.MoissaniteHoe;
import com.thearclightcrusader.ArcCore.tools.MoissanitePick;
import com.thearclightcrusader.ArcCore.tools.MoissaniteShovel;
import com.thearclightcrusader.ArcCore.tools.MoissaniteSword;
import com.thearclightcrusader.ArcCore.tools.NihilAxe;
import com.thearclightcrusader.ArcCore.tools.NihilHoe;
import com.thearclightcrusader.ArcCore.tools.NihilPick;
import com.thearclightcrusader.ArcCore.tools.NihilShovel;
import com.thearclightcrusader.ArcCore.tools.NihilSword;
import com.thearclightcrusader.ArcCore.tools.PalladiumAxe;
import com.thearclightcrusader.ArcCore.tools.PalladiumHoe;
import com.thearclightcrusader.ArcCore.tools.PalladiumPick;
import com.thearclightcrusader.ArcCore.tools.PalladiumShovel;
import com.thearclightcrusader.ArcCore.tools.PalladiumSword;
import com.thearclightcrusader.ArcCore.worldgen.ArcCoreWorldGen;
import com.thearclightcrusader.ArcCore.worldgen.BiomesAC;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = References.MODID, version = References.VERSION)
public class Main
{
    
    @Instance(value = References.MODID)
    public static Main instance;
    
    @SidedProxy(clientSide = "com.thearclightcrusader.ArcCore.proxy.ProxyClient", serverSide = "com.thearclightcrusader.ArcCore.proxy.ProxyCommon")
    public static ProxyCommon proxy;
    
    ArcCoreWorldGen eventWorldGen = new ArcCoreWorldGen();
    
    public static CreativeTabs arcCoreTab = new CreativeTabs("arccore"){
    	@SideOnly(Side.CLIENT)
    	public Item getTabIconItem(){
    		return Item.getItemFromBlock(Main.baconSapling);
    	}
    };
    
    public static ArmorMaterial ArmorBacon = EnumHelper.addArmorMaterial("Emerald Encrusted Bacon", 37, new int[]{4, 6, 5, 4}, 35);
    public static ArmorMaterial Arclight = EnumHelper.addArmorMaterial("Arclight", 50, new int[]{5, 8, 7, 5}, 40);
    public static ArmorMaterial ArmorNihil = EnumHelper.addArmorMaterial("ArmorNihil", 1, new int[]{1, 1, 1, 1}, 1);
    public static ArmorMaterial ArmorAbyss = EnumHelper.addArmorMaterial("ArmorAbyss", 60, new int[]{6, 9, 8, 6}, 45);
    public static ArmorMaterial ArmorAscended = EnumHelper.addArmorMaterial("ArmorAscended", 75, new int[]{9, 12, 10, 9}, 60);
    public static ArmorMaterial ArmorMoissanite = EnumHelper.addArmorMaterial("ArmorMoissanite", 45, new int[]{5, 7, 7, 5}, 40);
    public static ArmorMaterial ArmorPalladium = EnumHelper.addArmorMaterial("ArmorPalladium", 20, new int[]{3, 6, 5, 3}, 15);
    
    public static ToolMaterial ArclightTool = EnumHelper.addToolMaterial("ArclightTool", 5, 2500, 10, 6, 40);
    public static ToolMaterial BaconTool = EnumHelper.addToolMaterial("BaconTool", 4, 2000, 8, 5, 35);
    public static ToolMaterial NihilTool = EnumHelper.addToolMaterial("NihilTool", 0, 15, 0, 0, 0);
    public static ToolMaterial AbyssalTool = EnumHelper.addToolMaterial("AbyssalTool", 5, 2500, 7, 9, 40);
    public static ToolMaterial AscendedTool = EnumHelper.addToolMaterial("AscendedTool", 5, 3000, 9, 13, 75);
    public static ToolMaterial MoissaniteTool = EnumHelper.addToolMaterial("MoissaniteTool", 4, 2250, 6, 9, 40);
    public static ToolMaterial PalladiumTool = EnumHelper.addToolMaterial("PalladiumTool", 2, 700, 4, 3, 20);

    public static ToolMaterial StaffMaterial = EnumHelper.addToolMaterial("StaffMaterial", 0, 20, 1, 1, 1);
   
    //Fuel
    public static Item calciumAcetate = new CalciumAcetate();
    public static Item fuelGel = new FuelGel();
    public static Item survivalistFuelGel = new SurvivalistFuelGel();
    public static Item organicFuelGel = new OrganicFuelGel();
    
    //Blocks
    public static Block baconSapling;
    public static Block baconWood;
    public static Block baconLeaf;
    public static Block arcCoreLampOff;
    public static Block arcCoreLampOn;
    public static Block nihilBlock = new NihilBlock(Material.rock);
    public static Block palladiumOre = new PalladiumOre(Material.iron).setBlockName("PalladiumOre");
    public static Block crystalOre = new CrystalOre(Material.rock).setBlockName("CrystalOre");
    public static Block ascendedOre = new AscendedOre(Material.rock).setBlockName("AscendedOre");
    public static Block chocoCake = new ChocoCake(Material.cake).setBlockName("ChocoCake");
    public static Block moissaniteOre = new MoissaniteOre(Material.rock).setBlockName("MoissaniteOre");
    
    public static Block fireStone = new FireStone(Material.rock).setBlockName("FireStone");
    
    public static Block gildedSapling = new GildedSapling().setBlockName("GildedSapling").setCreativeTab(Main.arcCoreTab);
	public static Block gildedLeaf = new GildedLeaf().setBlockName("GildedLeaf").setCreativeTab(Main.arcCoreTab);
	public static Block gildedLog = new GildedLog().setBlockName("GildedLog").setCreativeTab(Main.arcCoreTab);
	public static Block gildedGrass = new GildedGrass(Material.grass).setBlockName("GildedGrass");
	public static Block gildedDirt = new GildedDirt(Material.ground).setBlockName("GildedDirt");
	public static Block gildedStone = new GildedStone(Material.rock).setBlockName("GildedStone");
	public static Block gildedPlanks = new GildedPlanks(Material.wood).setBlockName("GildedPlanks");
	public static Block gildedStoneBricks = new GildedStoneBricks(Material.rock).setBlockName("GildedStoneBricks");
	
	//Fairy Structure Blocks
	
	//public static Block fairySapling = new FairySapling().setBlockName("FairySapling").setCreativeTab(Main.arcCoreTab);
	//public static Block fairyLeaf = new FairyLeaf().setBlockName("FairyLeaf").setCreativeTab(Main.arcCoreTab);
	//public static Block fairyLog = new FairyLog().setBlockName("FairyLog").setCreativeTab(Main.arcCoreTab);
	public static Block fairyGrass = new FairyGrass(Material.grass).setBlockName("FairyGrass");
	public static Block fairyDirt = new FairyDirt(Material.ground).setBlockName("FairyDirt");
	public static Block fairyStone = new FairyStone(Material.rock).setBlockName("FairyStone");
	public static Block fairyPlanks = new FairyPlanks(Material.wood).setBlockName("FairyPlanks");
	
	//Stone Bricks
	public static Block uFairyStoneBricks = new UFairyStoneBricks(Material.rock, 1).setBlockName("UFairyStoneBricks");
	public static Block uChiseledFairyStoneBricks = new UFairyStoneBricks(Material.rock,3).setBlockName("UChiseledFairyStoneBricks");
	
	public static Block uGildedStoneBricks = new UFairyStoneBricks(Material.rock, 2).setBlockName("UGildedStoneBricks");
	public static Block uChiseledGildedStoneBricks = new UFairyStoneBricks(Material.rock, 4).setBlockName("UChiseledGildedStoneBricks");
	
	public static Block uEmeraldStoneBricks = new UFairyStoneBricks(Material.rock, 5).setBlockName("UEmeraldStoneBricks");
	public static Block uChiseledEmeraldStoneBricks = new UFairyStoneBricks(Material.rock, 6).setBlockName("UChiseledEmeraldStoneBricks");
	
	public static Block uPlatinumStoneBricks = new UFairyStoneBricks(Material.rock, 7).setBlockName("UPlatinumStoneBricks");
	public static Block uChiseledPlatinumStoneBricks = new UFairyStoneBricks(Material.rock, 8).setBlockName("UChiseledPlatinumStoneBricks");
	
	public static Block uSapphireStoneBricks = new UFairyStoneBricks(Material.rock, 9).setBlockName("USapphireStoneBricks");
	public static Block uChiseledSapphireStoneBricks = new UFairyStoneBricks(Material.rock, 10).setBlockName("UChiseledSapphireStoneBricks");
	
	public static Block uWhiteStoneBricks = new UFairyStoneBricks(Material.rock, 11).setBlockName("UWhiteStoneBricks");
	public static Block uChiseledWhiteStoneBricks = new UFairyStoneBricks(Material.rock, 12).setBlockName("UChiseledWhiteStoneBricks");
	
	public static Block uBlackStoneBricks = new UFairyStoneBricks(Material.rock, 13).setBlockName("UBlackStoneBricks");
	public static Block uChiseledBlackStoneBricks = new UFairyStoneBricks(Material.rock, 14).setBlockName("UChiseledBlackStoneBricks");
	
	//Stone Bricks Stairs
	public static Block uFairyStoneStairs = new UFairyStoneStairs(Main.uFairyStoneBricks, 1, 1).setBlockName("UFairyStoneStairs");
	public static Block uEmeraldBrickStairs = new UFairyStoneStairs(Main.uEmeraldStoneBricks, 1, 2).setBlockName("UEmeraldBrickStairs");
	public static Block uGildedStoneStairs = new UFairyStoneStairs(Main.uGildedStoneBricks, 1, 3).setBlockName("UGildedStoneStairs");
	public static Block uSapphireStoneStairs = new UFairyStoneStairs(Main.uSapphireStoneBricks, 1, 4).setBlockName("USapphireBrickStairs");
	public static Block uPlatinumBrickStairs = new UFairyStoneStairs(Main.uPlatinumStoneBricks, 1, 5).setBlockName("UPlatinumBrickStairs");
	public static Block uWhiteStoneStairs = new UFairyStoneStairs(Main.uWhiteStoneBricks, 1, 6).setBlockName("UWhiteStoneStairs");
	public static Block uBlackStoneStairs = new UFairyStoneStairs(Main.uBlackStoneBricks, 1, 7).setBlockName("UBlackStoneStairs");
	
	//Stone Brick Slabs
	public static BlockSlab uFairyStoneSlab = new UFairyStoneSlab(false, Material.rock);
	public static BlockSlab uFairyStoneSlabDouble = new UFairyStoneSlab(true, Material.rock);
	
	public static BlockSlab uEmeraldStoneSlab = new UEmeraldStoneSlab(false, Material.rock);
	public static BlockSlab uEmeraldStoneSlabDouble = new UEmeraldStoneSlab(true, Material.rock);
	
	public static BlockSlab uGildedStoneSlab = new UGildedStoneSlab(false, Material.rock);
	public static BlockSlab uGildedStoneSlabDouble = new UGildedStoneSlab(true, Material.rock);
	
	public static BlockSlab uWhiteStoneSlab = new UWhiteStoneSlab(false, Material.rock);
	public static BlockSlab uWhiteStoneSlabDouble = new UWhiteStoneSlab(true, Material.rock);
	
	public static BlockSlab uSapphireStoneSlab = new USapphireStoneSlab(false, Material.rock);
	public static BlockSlab uSapphireStoneSlabDouble = new USapphireStoneSlab(true, Material.rock);
	
	public static BlockSlab uPlatinumStoneSlab = new UPlatinumStoneSlab(false, Material.rock);
	public static BlockSlab uPlatinumStoneSlabDouble = new UPlatinumStoneSlab(true, Material.rock);
	
	public static BlockSlab uBlackStoneSlab = new UBlackStoneSlab(false, Material.rock);
	public static BlockSlab uBlackStoneSlabDouble = new UBlackStoneSlab(true, Material.rock);
	
	//Light Block
	public static Block uLightBlockPink = new ULightBlock(Material.glass, 0);
	public static Block uLightBlockGold = new ULightBlock(Material.glass, 1);
	

    //Machines
    public static Block arcCoreFurnaceIdle;
    public static Block arcCoreFurnaceActive;
    
    public static Block arcCoreInfuserIdle;
    public static Block arcCoreInfuserActive;
    public static final int getIDArcCoreInfuser = 1;
    public static final int getIDArcCoreFurnace = 2;
    
    //Armor
    public static Item baconHelm = new ArmorBacon(ArmorBacon, 0, 0, "BaconHelm").setUnlocalizedName("BaconHelm").setTextureName(References.MODID + ":BaconHelm").setCreativeTab(Main.arcCoreTab);
    public static Item baconChestplate = new ArmorBacon(ArmorBacon, 0, 1, "BaconChest").setUnlocalizedName("BaconChest").setTextureName(References.MODID + ":BaconChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item baconLegs = new ArmorBacon(ArmorBacon, 0, 2, "BaconLegs").setUnlocalizedName("BaconLegs").setTextureName(References.MODID + ":BaconLegs").setCreativeTab(Main.arcCoreTab);
    public static Item baconBoots = new ArmorBacon(ArmorBacon, 0, 3, "BaconBoots").setUnlocalizedName("BaconBoots").setTextureName(References.MODID + ":BaconBoots").setCreativeTab(Main.arcCoreTab);
    
    public static Item ascendedHelm = new ArmorAscended(ArmorAscended, 0, 0, "AscendedHelm").setUnlocalizedName("AscendedHelm").setTextureName(References.MODID + ":AscendedHelmet").setCreativeTab(Main.arcCoreTab);;
    public static Item ascendedChest = new ArmorAscended(ArmorAscended, 0, 1, "AscendedChest").setUnlocalizedName("AscendedChest").setTextureName(References.MODID + ":AscendedChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item ascendedLegs = new ArmorAscended(ArmorAscended, 0, 2, "AscendedLegs").setUnlocalizedName("AscendedLegs").setTextureName(References.MODID + ":AscendedLeggings").setCreativeTab(Main.arcCoreTab);
    public static Item ascendedBoots = new ArmorAscended(ArmorAscended, 0, 3, "AscendedBoots").setUnlocalizedName("AscendedBoots").setTextureName(References.MODID + ":AscendedBoots").setCreativeTab(Main.arcCoreTab);
    
    public static Item nihilHelm = new ArmorNihil(ArmorNihil, 0, 0, "NihilHelm").setUnlocalizedName("NihilHelm").setTextureName(References.MODID + ":FutileHelmet").setCreativeTab(Main.arcCoreTab);
    public static Item nihilChest = new ArmorNihil(ArmorNihil, 0, 1, "NihlChest").setUnlocalizedName("NihilChest").setTextureName(References.MODID + ":FutileChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item nihilLegs = new ArmorNihil(ArmorNihil, 0, 2, "NihilLegs").setUnlocalizedName("NihilLegs").setTextureName(References.MODID + ":FutileLeggings").setCreativeTab(Main.arcCoreTab);
    public static Item nihilBoots = new ArmorNihil(ArmorNihil, 0, 3, "NihilBoots").setUnlocalizedName("NihilBoots").setTextureName(References.MODID + ":FutileBoots").setCreativeTab(Main.arcCoreTab);
    
    public static Item arclightHelm = new ArmorArclight(Arclight, 0, 0, "ArclightHelm").setUnlocalizedName("ArclightHelm").setTextureName(References.MODID + ":ArclightHelmet").setCreativeTab(Main.arcCoreTab);
    public static Item arclightChest = new ArmorArclight(Arclight, 0, 1, "ArclightChest").setUnlocalizedName("ArclightChest").setTextureName(References.MODID + ":arclight_chestplate").setCreativeTab(Main.arcCoreTab);
    public static Item arclightLegs = new ArmorArclight(Arclight, 0, 2, "ArclightLegs").setUnlocalizedName("ArclightLegs").setTextureName(References.MODID + ":ArclightLeggings").setCreativeTab(Main.arcCoreTab);
    public static Item arclightBoots = new ArmorArclight(Arclight, 0, 3, "ArclightBoots").setUnlocalizedName("ArclightBoots").setTextureName(References.MODID + ":arclight_boots").setCreativeTab(Main.arcCoreTab);
   
    public static Item abyssalHelm = new ArmorAbyss(ArmorAbyss, 0, 0, "AbyssalHelm").setUnlocalizedName("AbyssalHelm").setTextureName(References.MODID + ":AbyssalHelmet").setCreativeTab(Main.arcCoreTab);
    public static Item abyssalChest = new ArmorAbyss(ArmorAbyss, 0, 1, "AbyssalChest").setUnlocalizedName("AbyssalChest").setTextureName(References.MODID + ":AbyssalChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item abyssalLegs = new ArmorAbyss(ArmorAbyss, 0, 2, "AbyssalLegs").setUnlocalizedName("AbyssalLegs").setTextureName(References.MODID + ":AbyssalLeggings").setCreativeTab(Main.arcCoreTab);
    public static Item abyssalBoots = new ArmorAbyss(ArmorAbyss, 0, 3, "AbyssalBoots").setUnlocalizedName("AbyssalBoots").setTextureName(References.MODID + ":AbyssalBoots").setCreativeTab(Main.arcCoreTab); 
    
    public static Item moissaniteHelm = new ArmorMoissanite(ArmorMoissanite, 0, 0, "MoissaniteHelm").setUnlocalizedName("MoissaniteHelm").setTextureName(References.MODID + ":MoissaniteHelmet").setCreativeTab(Main.arcCoreTab);
    public static Item moissaniteChest = new ArmorMoissanite(ArmorMoissanite, 0, 1, "MoissaniteChest").setUnlocalizedName("MoissaniteChest").setTextureName(References.MODID + ":MoissaniteChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item moissaniteLegs = new ArmorMoissanite(ArmorMoissanite, 0, 2, "MoissaniteLegs").setUnlocalizedName("MoissaniteLegs").setTextureName(References.MODID + ":MoissaniteLeggings").setCreativeTab(Main.arcCoreTab);
    public static Item moissaniteBoots = new ArmorMoissanite(ArmorMoissanite, 0, 3, "MoissaniteBoots").setUnlocalizedName("MoissaniteBoots").setTextureName(References.MODID + ":MoissaniteBoots").setCreativeTab(Main.arcCoreTab); 
    
    public static Item palladiumHelm = new ArmorPalladium(ArmorPalladium, 0, 0, "PalladiumHelm").setUnlocalizedName("PalladiumHelm").setTextureName(References.MODID + ":PalladiumHelm").setCreativeTab(Main.arcCoreTab);
    public static Item palladiumChest = new ArmorPalladium(ArmorPalladium, 0, 1, "PalladiumChest").setUnlocalizedName("PalladiumChest").setTextureName(References.MODID + ":PalladiumChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item palladiumLegs = new ArmorPalladium(ArmorPalladium, 0, 2, "PalladiumLegs").setUnlocalizedName("PalladiumLegs").setTextureName(References.MODID + ":PalladiumLeggings").setCreativeTab(Main.arcCoreTab);
    public static Item palladiumBoots = new ArmorPalladium(ArmorPalladium, 0, 3, "PalladiumBoots").setUnlocalizedName("PalladiumBoots").setTextureName(References.MODID + ":PalladiumBoots").setCreativeTab(Main.arcCoreTab); 
    
    //Tools
    public static Item baconSword = new BaconSword(BaconTool);
    public static Item baconPick = new BaconPick(BaconTool);
    public static Item baconAxe = new BaconAxe(BaconTool);
    public static Item baconShovel = new BaconShovel(BaconTool);
    public static Item baconHoe = new BaconHoe(BaconTool);
    
    public static Item arclightSword = new ArclightSword(ArclightTool);
    public static Item arclightPick = new ArclightPick(ArclightTool);
    public static Item arclightAxe = new ArclightAxe(ArclightTool);
    public static Item arclightShovel = new ArclightShovel(ArclightTool);
    public static Item arclightHoe = new ArclightHoe(ArclightTool);
    
    public static Item nihilSword = new NihilSword(NihilTool);
    public static Item nihilPick = new NihilPick(NihilTool);
    public static Item nihilAxe = new NihilAxe(NihilTool);
    public static Item nihilShovel = new NihilShovel(NihilTool);
    public static Item nihilHoe = new NihilHoe(NihilTool);
    
    public static Item abyssalSword = new AbyssalSword(AbyssalTool);
    public static Item abyssalPick = new AbyssalPick(AbyssalTool);
    public static Item abyssalAxe = new AbyssalAxe(AbyssalTool);
    public static Item abyssalShovel = new AbyssalShovel(AbyssalTool);
    public static Item abyssalHoe = new AbyssalHoe(AbyssalTool);
    
    public static Item ascendedSword = new AscendedSword(AscendedTool);
    public static Item ascendedPick = new AscendedPick(AscendedTool);
    public static Item ascendedAxe = new AscendedAxe(AscendedTool);
    public static Item ascendedShovel = new AscendedShovel(AscendedTool);
    public static Item ascendedHoe = new AscendedHoe(AscendedTool);
    
    public static Item moissaniteSword = new MoissaniteSword(MoissaniteTool);
    public static Item moissanitePick = new MoissanitePick(MoissaniteTool);
    public static Item moissaniteAxe = new MoissaniteAxe(MoissaniteTool);
    public static Item moissaniteShovel = new MoissaniteShovel(MoissaniteTool);
    public static Item moissaniteHoe = new MoissaniteHoe(MoissaniteTool);
    
    public static Item palladiumSword = new PalladiumSword(PalladiumTool);
    public static Item palladiumPick = new PalladiumPick(PalladiumTool);
    public static Item palladiumAxe = new PalladiumAxe(PalladiumTool);
    public static Item palladiumShovel = new PalladiumShovel(PalladiumTool);
    public static Item palladiumHoe = new PalladiumHoe(PalladiumTool);
    
    //Items
    public static Item baconRoot = new BaconRoot();
    public static Item emeraldBacon = new EmeraldBacon();
    public static Item bacon = new Bacon(1, false);
    public static Item baconBeer = new BaconBeer(2, false);
    public static Item baconCooked = new BaconCooked(6, false);
    public static Item arclightIngot = new ArclightIngot();
    public static Item arcCore = new ArcCore();
    public static Item protoArcCore = new PrototypeCore();
    public static Item arcDiamond = new ArcDiamond();
    public static Item palladiumIngot = new PalladiumIngot();
    public static Item ascendedIngot = new AscendedIngot();
    public static Item moissanite = new Moissanite();
    public static Item infusedQuartz = new InfusedQuartz();
    public static Item cyclopsEye = new CyclopsEye();
    public static Item nihilianSoulShard = new NihilSoulShard();
    public static Item fairyDust = new FairyDust();
    
    //Talismans
    public static Item waterTalisman = new WaterTalisman();
    
    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
    	
    	BiomesAC.init();
    	
    	//Entities
    	EntityHandler.registerMonsters(EntityCyclops.class, "Cyclops", 50, 78, 1, 3);
    	EntityHandler.registerMonsters(EntityNihil.class, "Nihil", 25, 82, 1, 2);
    	EntityHandler.registerFairy(EntityFairy.class, "Fairy", 60, 1, 2);
    	
    	//Blocks
    	baconSapling = new BaconSapling().setBlockName("Sapling").setCreativeTab(Main.arcCoreTab);
    	baconLeaf = new BaconLeaf().setBlockName("Leaf").setCreativeTab(Main.arcCoreTab);
    	baconWood = new BaconWood().setBlockName("Log").setCreativeTab(Main.arcCoreTab);
    	arcCoreFurnaceIdle = new ArcCoreFurnace(false).setBlockName("ArcCoreFurnaceIdle").setCreativeTab(Main.arcCoreTab).setHardness(3.5F);
    	arcCoreFurnaceActive = new ArcCoreFurnace(true).setBlockName("ArcCoreFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
    	arcCoreInfuserIdle = new ArcCoreInfuser(false).setBlockName("ArcCoreInfuserIdle").setCreativeTab(Main.arcCoreTab).setHardness(3.5F);
    	arcCoreInfuserActive = new ArcCoreInfuser(true).setBlockName("ArcCoreInfuserActive").setLightLevel(0.625F).setHardness(3.5F);
    	arcCoreLampOff = new ArcCoreLamp(false).setBlockName("ArcCoreLampOff").setCreativeTab(Main.arcCoreTab);
    	arcCoreLampOn = new ArcCoreLamp(true).setBlockName("ArcCoreLampOn");
    	
		//GameReg
    	GameRegistry.registerBlock(baconWood, ItemLogBlocks.class, baconWood.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(baconLeaf, ItemLeafBlocks.class, baconLeaf.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(baconSapling, ItemSaplingBlocks.class, baconSapling.getUnlocalizedName().substring(5));
    	
    	//Spawn
    	GameRegistry.registerWorldGenerator(eventWorldGen, 0);
    	
    	//Block Registry
    	GameRegistry.registerBlock(nihilBlock, "NihilBlock");
    	GameRegistry.registerBlock(arcCoreLampOff, "ArcCoreLampOff");
    	GameRegistry.registerBlock(arcCoreLampOn, "ArcCoreLampOn");
    	GameRegistry.registerBlock(palladiumOre, "PalladiumOre");
    	GameRegistry.registerBlock(crystalOre, "CrystalOre");
    	GameRegistry.registerBlock(ascendedOre, "AscendedOre");
    	GameRegistry.registerBlock(chocoCake, "ChocoCake");
    	GameRegistry.registerBlock(moissaniteOre, "MoissaniteOre");    	
    	GameRegistry.registerBlock(gildedSapling, "GildedSapling");
    	GameRegistry.registerBlock(gildedLog, "GildedLog");
    	GameRegistry.registerBlock(gildedLeaf, "GildedLeaf");
    	GameRegistry.registerBlock(gildedGrass, "GildedGrass");
    	GameRegistry.registerBlock(gildedStone, "GildedStone");
    	GameRegistry.registerBlock(gildedStoneBricks, "GildedStoneBricks");
    	GameRegistry.registerBlock(gildedPlanks, "GildedPlanks");
    	GameRegistry.registerBlock(fireStone, "FireStone");
    	
    	//GameRegistry.registerBlock(fairyLog, "FairyLog");
    	//GameRegistry.registerBlock(fairyLeaf, "GildedLeaf");
    	GameRegistry.registerBlock(fairyGrass, "FairyGrass");
    	GameRegistry.registerBlock(fairyStone, "FairyStone");
    	GameRegistry.registerBlock(fairyPlanks, "FairyPlanks");
    	
    	GameRegistry.registerBlock(uFairyStoneBricks, "uFairyStoneBricks");
    	GameRegistry.registerBlock(uFairyStoneStairs, "uFairyStoneStairs");
    	GameRegistry.registerBlock(uChiseledFairyStoneBricks, "uChiseledFairyStoneBricks");
 
    	GameRegistry.registerBlock(uGildedStoneBricks, "uGildedStoneBricks");
    	GameRegistry.registerBlock(uGildedStoneStairs, "uGildedStoneStairs");
    	GameRegistry.registerBlock(uChiseledGildedStoneBricks, "uChiseledGildedStoneBricks");
    	
    	GameRegistry.registerBlock(uEmeraldStoneBricks, "uEmeraldStoneBricks");
    	GameRegistry.registerBlock(uEmeraldBrickStairs, "uEmeraldStoneStairs");
    	GameRegistry.registerBlock(uChiseledEmeraldStoneBricks, "uChiseledEmeraldStoneBricks");
    	
    	GameRegistry.registerBlock(uPlatinumStoneBricks, "uPlatinumStoneBricks");
    	GameRegistry.registerBlock(uPlatinumBrickStairs, "uPlatinumStoneStairs");
    	GameRegistry.registerBlock(uChiseledPlatinumStoneBricks, "uChiseledPlatinumStoneBricks");
    	
    	GameRegistry.registerBlock(uWhiteStoneBricks, "uWhiteStoneBricks");
    	GameRegistry.registerBlock(uWhiteStoneStairs, "uWhiteStoneStairs");
    	GameRegistry.registerBlock(uChiseledWhiteStoneBricks, "uChiseledWhiteStoneBricks");
    	
    	GameRegistry.registerBlock(uSapphireStoneBricks, "uSapphireStoneBricks");
    	GameRegistry.registerBlock(uSapphireStoneStairs, "uSapphireStoneStairs");
    	GameRegistry.registerBlock(uChiseledSapphireStoneBricks, "uChiseledSapphireStoneBricks");
    	
    	GameRegistry.registerBlock(uBlackStoneBricks, "uBlackStoneBricks");
    	GameRegistry.registerBlock(uBlackStoneStairs, "uBlackStoneStairs");
    	GameRegistry.registerBlock(uChiseledBlackStoneBricks, "uChiseledBlackStoneBricks");
    	
    	GameRegistry.registerBlock(uFairyStoneSlab, ItemFairyStoneSlab.class, "uFairyStoneSlab");
    	GameRegistry.registerBlock(uFairyStoneSlabDouble, ItemFairyStoneSlab.class, "uFairyStoneSlabDouble");
    	
    	GameRegistry.registerBlock(uGildedStoneSlab, ItemGildedStoneSlab.class, "uGildedStoneSlab");
    	GameRegistry.registerBlock(uGildedStoneSlabDouble, ItemGildedStoneSlab.class, "uGildedStoneSlabDouble");
    	
    	GameRegistry.registerBlock(uEmeraldStoneSlab, ItemEmeraldStoneSlab.class, "uEmeraldStoneSlab");
    	GameRegistry.registerBlock(uEmeraldStoneSlabDouble, ItemEmeraldStoneSlab.class, "uEmeraldStoneSlabDouble");
    	
    	GameRegistry.registerBlock(uWhiteStoneSlab, ItemWhiteStoneSlab.class, "uWhiteStoneSlab");
    	GameRegistry.registerBlock(uWhiteStoneSlabDouble, ItemWhiteStoneSlab.class, "uWhiteStoneSlabDouble");
    	
    	GameRegistry.registerBlock(uSapphireStoneSlab, ItemSapphireStoneSlab.class, "uSapphireStoneSlab");
    	GameRegistry.registerBlock(uSapphireStoneSlabDouble, ItemSapphireStoneSlab.class, "uSapphireStoneSlabDouble");
    	
    	GameRegistry.registerBlock(uPlatinumStoneSlab, ItemPlatinumStoneSlab.class, "uPlatinumStoneSlab");
    	GameRegistry.registerBlock(uPlatinumStoneSlabDouble, ItemPlatinumStoneSlab.class, "uPlatinumStoneSlabDouble");
    	
    	GameRegistry.registerBlock(uBlackStoneSlab, ItemBlackStoneSlab.class, "uBlackStoneSlab");
    	GameRegistry.registerBlock(uBlackStoneSlabDouble, ItemBlackStoneSlab.class, "uBlackStoneSlabDouble");
    	
    	GameRegistry.registerBlock(uLightBlockPink, "LightBlockPink");
    	GameRegistry.registerBlock(uLightBlockGold, "LightBlockGold");
    	
    	//Machine Registry
    	GameRegistry.registerBlock(arcCoreFurnaceIdle, "ArcCoreFurnaceIdle");
    	GameRegistry.registerBlock(arcCoreFurnaceActive, "ArcCoreFurnaceActive");
    	
    	GameRegistry.registerBlock(arcCoreInfuserIdle, "ArcCoreInfuserIdle");
    	GameRegistry.registerBlock(arcCoreInfuserActive, "ArcCoreInfuserActive");
    	
    	//Item Registry
    	GameRegistry.registerItem(bacon, "Bacon");
    	GameRegistry.registerItem(baconRoot, "BaconRoot");
    	GameRegistry.registerItem(baconCooked, "CookedBacon");
    	GameRegistry.registerItem(emeraldBacon, "EmeraldEncrustedBacon");
    	GameRegistry.registerItem(baconBeer, "BaconBeer");
    	GameRegistry.registerItem(protoArcCore, "ProtoArcCore");
    	GameRegistry.registerItem(arclightIngot, "ArclightIngot");
    	GameRegistry.registerItem(arcCore, "ArcCore");
    	GameRegistry.registerItem(arcDiamond, "ArcDiamond");
    	GameRegistry.registerItem(waterTalisman, "WaterTalisman");
    	GameRegistry.registerItem(ascendedIngot, "AscendedIngot");
    	GameRegistry.registerItem(palladiumIngot, "PalladiumIngot");
    	GameRegistry.registerItem(moissanite, "Moissanite");
    	GameRegistry.registerItem(infusedQuartz, "InfusedQuartz");
    	GameRegistry.registerItem(fairyDust, "FairyDust");
    	GameRegistry.registerItem(nihilianSoulShard, "NihilSoulShard");
    	GameRegistry.registerItem(cyclopsEye, "CyclopsEye");

    	
    	//Fuel
    	GameRegistry.registerItem(calciumAcetate, "CalciumAcetate");
    	GameRegistry.registerItem(fuelGel, "FuelGel");
    	GameRegistry.registerItem(survivalistFuelGel, "SurvivalistFuelGel");
    	GameRegistry.registerItem(organicFuelGel, "OrganicFuelGel");
    	
    	//Tool Registry
    	GameRegistry.registerItem(arclightSword, "ArclightSword");
    	GameRegistry.registerItem(arclightPick, "ArclightPickaxe");
    	GameRegistry.registerItem(arclightAxe, "ArclightAxe");
    	GameRegistry.registerItem(arclightShovel, "ArclightShovel");
    	GameRegistry.registerItem(arclightHoe, "ArclightHoe");
    	
    	GameRegistry.registerItem(palladiumSword, "PalladiumSword");
    	GameRegistry.registerItem(palladiumPick, "PalladiumPickaxe");
    	GameRegistry.registerItem(palladiumAxe, "PalladiumAxe");
    	GameRegistry.registerItem(palladiumShovel, "PalladiumShovel");
    	GameRegistry.registerItem(palladiumHoe, "PalladiumHoe");
    	
    	GameRegistry.registerItem(nihilSword, "FutileSword");
    	GameRegistry.registerItem(nihilPick, "FutilePickaxe");
    	GameRegistry.registerItem(nihilShovel, "FutileShovel");
    	GameRegistry.registerItem(nihilAxe, "FutileAxe");
    	GameRegistry.registerItem(nihilHoe, "FutileHoe");
    	
    	GameRegistry.registerItem(baconSword, "BaconSword");
    	GameRegistry.registerItem(baconPick, "BaconPickaxe");
    	GameRegistry.registerItem(baconShovel, "BaconShovel");
    	GameRegistry.registerItem(baconAxe, "BaconAxe");
    	GameRegistry.registerItem(baconHoe, "BaconHoe");
    	
    	GameRegistry.registerItem(abyssalSword, "AbyssalSword");
    	GameRegistry.registerItem(abyssalPick, "AbyssalPickaxe");
    	GameRegistry.registerItem(abyssalAxe, "AbyssalAxe");
    	GameRegistry.registerItem(abyssalHoe, "AbyssalHoe");
    	GameRegistry.registerItem(abyssalShovel, "AbyssalShovel");
    	
    	GameRegistry.registerItem(ascendedSword, "AscendedSword");
    	GameRegistry.registerItem(ascendedPick, "AscendedPickaxe");
    	GameRegistry.registerItem(ascendedAxe, "AscendedAxe");
    	GameRegistry.registerItem(ascendedHoe, "AscendedHoe");
    	GameRegistry.registerItem(ascendedShovel, "AscendedShovel");
    	
    	GameRegistry.registerItem(moissaniteSword, "MoissaniteSword");
    	GameRegistry.registerItem(moissanitePick, "MoissanitePickaxe");
    	GameRegistry.registerItem(moissaniteAxe, "MoissaniteAxe");
    	GameRegistry.registerItem(moissaniteHoe, "MoissaniteHoe");
    	GameRegistry.registerItem(moissaniteShovel, "MoissaniteShovel");
    	
    	//Armor Registry
    	GameRegistry.registerItem(baconHelm, "BaconHelm");
    	GameRegistry.registerItem(baconChestplate, "BaconChest");
    	GameRegistry.registerItem(baconLegs, "BaconLegs");
    	GameRegistry.registerItem(baconBoots, "BaconBoots");
    	
    	GameRegistry.registerItem(arclightHelm, "ArclightHelm");
    	GameRegistry.registerItem(arclightChest, "ArclightChest");
    	GameRegistry.registerItem(arclightLegs, "ArclightLegs");
    	GameRegistry.registerItem(arclightBoots, "ArclightBoots");

    	GameRegistry.registerItem(ascendedHelm, "AscendedHelm");
    	GameRegistry.registerItem(ascendedChest, "AscendedChest");
    	GameRegistry.registerItem(ascendedLegs, "AscendedLegs");
    	GameRegistry.registerItem(ascendedBoots, "AscendedBoots");
    	
    	GameRegistry.registerItem(palladiumHelm, "PalladiumHelm");
    	GameRegistry.registerItem(palladiumChest, "PalladiumChest");
    	GameRegistry.registerItem(palladiumLegs, "PalladiumLegs");
    	GameRegistry.registerItem(palladiumBoots, "PalladiumBoots");

    	GameRegistry.registerItem(nihilHelm, "NihilHelm");
    	GameRegistry.registerItem(nihilChest, "NihilChest");
    	GameRegistry.registerItem(nihilLegs, "NihilLegs");
    	GameRegistry.registerItem(nihilBoots, "NihilBoots");
    	
    	GameRegistry.registerItem(abyssalHelm, "AbyssalHelm");
    	GameRegistry.registerItem(abyssalChest, "AbyssalChest");
    	GameRegistry.registerItem(abyssalLegs, "AbyssalLegs");
    	GameRegistry.registerItem(abyssalBoots, "AbyssalBoots");
    	
     	GameRegistry.registerItem(moissaniteHelm, "MoissaniteHelm");
    	GameRegistry.registerItem(moissaniteChest, "MoissaniteChest");
    	GameRegistry.registerItem(moissaniteLegs, "MoissaniteLegs");
    	GameRegistry.registerItem(moissaniteBoots, "MoissaniteBoots");
    	
    	//Recipes
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconLeaf, 2), " X ", "XYX", " X ", 'X', Items.emerald, 'Y', Blocks.leaves);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconSapling), "PEP", "DSD", "PEP", 'P', Items.porkchop, 'E', Main.baconLeaf, 'D', Items.emerald, 'S', Blocks.sapling);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.baconBeer), Main.baconRoot, Items.potionitem);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.emeraldBacon), Items.emerald, Items.porkchop, Items.emerald);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.bacon, 4), Main.baconWood);
    	
    	GameRegistry.addSmelting(new ItemStack(Main.baconWood), new ItemStack(Main.baconRoot), 0.2F);
    	GameRegistry.addSmelting(new ItemStack(Main.bacon), new ItemStack(Main.baconCooked), 0.1F);
    	GameRegistry.addSmelting(new ItemStack(Main.palladiumOre), new ItemStack(Main.palladiumIngot), 1F);
    	GameRegistry.addSmelting(new ItemStack(Main.ascendedOre), new ItemStack(Main.ascendedIngot), 1F);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arcCore), "XYX", "YZY", "XDX", 'X', Items.redstone  , 'Y', Blocks.glass, 'D', Main.palladiumIngot, 'Z', Items.diamond);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.arclightIngot), Items.iron_ingot, Main.arcCore, Main.arcDiamond);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.protoArcCore), "XYX", "YZY", "XDX", 'X', Blocks.obsidian, 'Y', Main.infusedQuartz, 'Z', Main.arcCore, 'D', Main.arcDiamond);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arcCoreFurnaceIdle), "XXX", "XYX", "XXX", 'X', Blocks.cobblestone, 'Y', Main.arcCore);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arcCoreInfuserIdle), "XXX", "ZYZ", "VVV", 'X', Blocks.furnace, 'Y', Main.arcCore, 'Z', Blocks.redstone_block, 'V', Items.iron_ingot);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.calciumAcetate), Items.egg, Items.bone, Items.potionitem);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.calciumAcetate), Items.egg, Items.bone, Items.water_bucket);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconHelm), "XXX", "X X", "   ", 'X', Main.emeraldBacon);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconHelm), "   ", "XXX", "X X", 'X', Main.emeraldBacon);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconChestplate), "X X", "XXX", "XXX", 'X', Main.emeraldBacon);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconLegs), "XXX", "X X", "X X", 'X', Main.emeraldBacon);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconBoots), "XXX", "X X", "   ", 'X', Main.emeraldBacon);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconBoots), "   ", "X X", "X X", 'X', Main.emeraldBacon);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightHelm), "XXX", "X X", "   ", 'X', Main.arclightIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightHelm), "   ", "XXX", "X X", 'X', Main.arclightIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightChest), "X X", "XXX", "XXX", 'X', Main.arclightIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightLegs), "XXX", "X X", "X X", 'X', Main.arclightIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightBoots), "XXX", "X X", "   ", 'X', Main.arclightIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightBoots), "   ", "X X", "X X", 'X', Main.arclightIngot);

    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedHelm), "XXX", "X X", "   ", 'X', Main.ascendedIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedHelm), "   ", "XXX", "X X", 'X', Main.ascendedIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedChest), "X X", "XXX", "XXX", 'X', Main.ascendedIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedLegs), "XXX", "X X", "X X", 'X', Main.ascendedIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedBoots), "XXX", "X X", "   ", 'X', Main.ascendedIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedBoots), "   ", "X X", "X X", 'X', Main.ascendedIngot);

    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilHelm), "XXX", "X X", "   ", 'X', Main.nihilBlock);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilHelm), "   ", "XXX", "X X", 'X', Main.nihilBlock);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilChest), "X X", "XXX", "XXX", 'X', Main.nihilBlock);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilLegs), "XXX", "X X", "X X", 'X', Main.nihilBlock);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilBoots), "XXX", "X X", "   ", 'X', Main.nihilBlock);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilBoots), "   ", "X X", "X X", 'X', Main.nihilBlock);
    	
      	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteHelm), "XXX", "X X", "   ", 'X', Main.moissanite);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteHelm), "   ", "XXX", "X X", 'X', Main.moissanite);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteChest), "X X", "XXX", "XXX", 'X', Main.moissanite);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteLegs), "XXX", "X X", "X X", 'X', Main.moissanite);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteBoots), "XXX", "X X", "   ", 'X', Main.moissanite);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteBoots), "   ", "X X", "X X", 'X', Main.moissanite);
    	
     	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumHelm), "XXX", "X X", "   ", 'X', Main.palladiumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumHelm), "   ", "XXX", "X X", 'X', Main.palladiumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumChest), "X X", "XXX", "XXX", 'X', Main.palladiumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumLegs), "XXX", "X X", "X X", 'X', Main.palladiumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumBoots), "XXX", "X X", "   ", 'X', Main.palladiumIngot);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumBoots), "   ", "X X", "X X", 'X', Main.palladiumIngot);
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.abyssalHelm), Main.nihilHelm, Main.protoArcCore);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.abyssalChest), Main.nihilChest, Main.protoArcCore);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.abyssalLegs), Main.nihilLegs, Main.protoArcCore);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.abyssalBoots), Main.nihilBoots, Main.protoArcCore);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconPick), "XXX", " Y ", " Y ", 'X', Main.emeraldBacon, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightPick), "XXX", " Y ", " Y ", 'X', Main.arclightIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedPick), "XXX", " Y ", " Y ", 'X', Main.ascendedIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilPick), "XXX", " Y ", " Y ", 'X', Main.nihilBlock, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissanitePick), "XXX", " Y ", " Y ", 'X', Main.moissanite, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumPick), "XXX", " Y ", " Y ", 'X', Main.palladiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.abyssalPick), Main.nihilPick, Main.protoArcCore);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconShovel), "X  ", "Y  ", "Y  ", 'X', Main.emeraldBacon, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconShovel), " X ", " Y ", " Y ", 'X', Main.emeraldBacon, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconShovel), "  X", "  Y", "  Y", 'X', Main.emeraldBacon, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightShovel), "X  ", "Y  ", "Y  ", 'X', Main.arclightIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightShovel), " X ", " Y ", " Y ", 'X', Main.arclightIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightShovel), "  X", "  Y", "  Y", 'X', Main.arclightIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilShovel), "X  ", "Y  ", "Y  ", 'X', Main.nihilBlock, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilShovel), " X ", " Y ", " Y ", 'X', Main.nihilBlock, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilShovel), "  X", "  Y", "  Y", 'X', Main.nihilBlock, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedShovel), "X  ", "Y  ", "Y  ", 'X', Main.ascendedIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedShovel), " X ", " Y ", " Y ", 'X', Main.ascendedIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedShovel), "  X", "  Y", "  Y", 'X', Main.ascendedIngot, 'Y', Items.stick);
       	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteShovel), "X  ", "Y  ", "Y  ", 'X', Main.moissanite, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteShovel), " X ", " Y ", " Y ", 'X', Main.moissanite, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteShovel), "  X", "  Y", "  Y", 'X', Main.moissanite, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumShovel), "X  ", "Y  ", "Y  ", 'X', Main.palladiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumShovel), " X ", " Y ", " Y ", 'X', Main.palladiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumShovel), "  X", "  Y", "  Y", 'X', Main.palladiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.abyssalShovel), Main.nihilShovel, Main.protoArcCore);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconAxe), "XX ", "XY ", " Y ", 'X', Main.emeraldBacon, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconAxe), " XX", " YX", " Y ", 'X', Main.emeraldBacon, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightAxe), "XX ", "XY ", " Y ", 'X', Main.arclightIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightAxe), " XX", " YX", " Y ", 'X', Main.arclightIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedAxe), "XX ", "XY ", " Y ", 'X', Main.ascendedIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedAxe), " XX", " YX", " Y ", 'X', Main.ascendedIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilAxe), "XX ", "XY ", " Y ", 'X', Main.nihilBlock, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilAxe), " XX", " YX", " Y ", 'X', Main.nihilBlock, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteAxe), "XX ", "XY ", " Y ", 'X', Main.moissanite, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteAxe), " XX", " YX", " Y ", 'X', Main.moissanite, 'Y', Items.stick);
      	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumAxe), "XX ", "XY ", " Y ", 'X', Main.palladiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumAxe), " XX", " YX", " Y ", 'X', Main.palladiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.abyssalAxe), Main.nihilAxe, Main.protoArcCore);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconHoe), "XX ", " Y ", " Y ", 'X', Main.emeraldBacon, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconHoe), " XX", " Y ", " Y ", 'X', Main.emeraldBacon, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightHoe), "XX ", " Y ", " Y ", 'X', Main.arclightIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightHoe), " XX", " Y ", " Y ", 'X', Main.arclightIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedHoe), "XX ", " Y ", " Y ", 'X', Main.ascendedIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedHoe), " XX", " Y ", " Y ", 'X', Main.ascendedIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilHoe), "XX ", " Y ", " Y ", 'X', Main.nihilBlock, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilHoe), " XX", " Y ", " Y ", 'X', Main.nihilBlock, 'Y', Items.stick);
      	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteHoe), "XX ", " Y ", " Y ", 'X', Main.moissanite, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteHoe), " XX", " Y ", " Y ", 'X', Main.moissanite, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumHoe), "XX ", " Y ", " Y ", 'X', Main.palladiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumHoe), " XX", " Y ", " Y ", 'X', Main.palladiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.abyssalHoe), Main.nihilHoe, Main.protoArcCore);
    	
     	GameRegistry.addShapedRecipe(new ItemStack(Main.baconSword), "X  ", "X  ", "Y  ", 'X', Main.emeraldBacon, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.baconSword), " X ", " X ", " Y ", 'X', Main.emeraldBacon, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.baconSword), "  X", "  X", "  Y", 'X', Main.emeraldBacon, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightSword), "X  ", "X  ", "Y  ", 'X', Main.arclightIngot, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightSword), " X ", " X ", " Y ", 'X', Main.arclightIngot, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightSword), "  X", "  X", "  Y", 'X', Main.arclightIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedSword), "X  ", "X  ", "Y  ", 'X', Main.ascendedIngot, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedSword), " X ", " X ", " Y ", 'X', Main.ascendedIngot, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.ascendedSword), "  X", "  X", "  Y", 'X', Main.ascendedIngot, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilSword), "X  ", "X  ", "Y  ", 'X', Main.nihilBlock, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilSword), " X ", " X ", " Y ", 'X', Main.nihilBlock, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.nihilSword), "  X", "  X", "  Y", 'X', Main.nihilBlock, 'Y', Items.stick);
       	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteSword), "X  ", "X  ", "Y  ", 'X', Main.moissanite, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteSword), " X ", " X ", " Y ", 'X', Main.moissanite, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.moissaniteSword), "  X", "  X", "  Y", 'X', Main.moissanite, 'Y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumSword), "X  ", "X  ", "Y  ", 'X', Main.palladiumIngot, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumSword), " X ", " X ", " Y ", 'X', Main.palladiumIngot, 'Y', Items.stick);
     	GameRegistry.addShapedRecipe(new ItemStack(Main.palladiumSword), "  X", "  X", "  Y", 'X', Main.palladiumIngot, 'Y', Items.stick);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.abyssalSword), Main.nihilSword, Main.protoArcCore);
    	
    }
    	
    
    @EventHandler 
    public void Init(FMLInitializationEvent event){
    	
    	GameRegistry.registerTileEntity(TileEntityArcCoreFurnace.class, "ArcCoreFurnace");
    	GameRegistry.registerTileEntity(TileEntityArcCoreInfuser.class, "ArcCoreInfuser");
    	NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
    
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event){
    	proxy.registerRenderers();
    }

}
