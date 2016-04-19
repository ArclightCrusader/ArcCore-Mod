package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.armor.ArmorAbyss;
import com.thearclightcrusader.ArcCore.armor.ArmorArclight;
import com.thearclightcrusader.ArcCore.armor.ArmorAscended;
import com.thearclightcrusader.ArcCore.armor.ArmorBacon;
import com.thearclightcrusader.ArcCore.armor.ArmorNihil;
import com.thearclightcrusader.ArcCore.blocks.ArcCoreFurnace;
import com.thearclightcrusader.ArcCore.blocks.ArcCoreInfuser;
import com.thearclightcrusader.ArcCore.blocks.ArcCoreLamp;
import com.thearclightcrusader.ArcCore.blocks.BaconLeaf;
import com.thearclightcrusader.ArcCore.blocks.BaconSapling;
import com.thearclightcrusader.ArcCore.blocks.BaconWood;
import com.thearclightcrusader.ArcCore.blocks.NihilBlock;
import com.thearclightcrusader.ArcCore.gui.GuiHandler;
import com.thearclightcrusader.ArcCore.items.ArcDiamond;
import com.thearclightcrusader.ArcCore.items.ArclightIngot;
import com.thearclightcrusader.ArcCore.items.Bacon;
import com.thearclightcrusader.ArcCore.items.BaconBeer;
import com.thearclightcrusader.ArcCore.items.BaconCooked;
import com.thearclightcrusader.ArcCore.items.BaconRoot;
import com.thearclightcrusader.ArcCore.items.CalciumAcetate;
import com.thearclightcrusader.ArcCore.items.EmeraldBacon;
import com.thearclightcrusader.ArcCore.items.FuelGel;
import com.thearclightcrusader.ArcCore.items.ItemLeafBlocks;
import com.thearclightcrusader.ArcCore.items.ItemLogBlocks;
import com.thearclightcrusader.ArcCore.items.ItemSaplingBlocks;
import com.thearclightcrusader.ArcCore.items.OrganicFuelGel;
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
import com.thearclightcrusader.ArcCore.tools.NihilAxe;
import com.thearclightcrusader.ArcCore.tools.NihilHoe;
import com.thearclightcrusader.ArcCore.tools.NihilPick;
import com.thearclightcrusader.ArcCore.tools.NihilShovel;
import com.thearclightcrusader.ArcCore.tools.NihilSword;

import net.minecraft.block.Block;
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
    
    public static ToolMaterial ArclightTool = EnumHelper.addToolMaterial("ArclightTool", 5, 2500, 9, 5, 40);
    public static ToolMaterial BaconTool = EnumHelper.addToolMaterial("BaconTool", 4, 2000, 8, 5, 35);
    public static ToolMaterial NihilTool = EnumHelper.addToolMaterial("NihilTool", 0, 15, 0, 0, 1);
    public static ToolMaterial AbyssalTool = EnumHelper.addToolMaterial("AbyssalTool", 5, 2250, 9, 7, 40);
    public static ToolMaterial AscendedTool = EnumHelper.addToolMaterial("ArclightTool", 5, 3000, 12, 9, 75);
    
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
    public static Block nihilBlock = new NihilBlock(90017, Material.rock);
    
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
    
    public static Item ascendedHelm = new ArmorAscended(ArmorAscended, 0, 0, "AscendedHelm").setUnlocalizedName("AscendedHelm").setTextureName(References.MODID + ":AscendedHelm").setCreativeTab(Main.arcCoreTab);;
    public static Item ascendedChest = new ArmorAscended(ArmorAscended, 0, 1, "AscendedChest").setUnlocalizedName("AscendedChest").setTextureName(References.MODID + ":AscendedChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item ascendedLegs = new ArmorAscended(ArmorAscended, 0, 2, "AscendedLegs").setUnlocalizedName("AscendedLegs").setTextureName(References.MODID + ":AscendedLegs").setCreativeTab(Main.arcCoreTab);
    public static Item ascendedBoots = new ArmorAscended(ArmorAscended, 0, 3, "AscendedBoots").setUnlocalizedName("AscendedBoots").setTextureName(References.MODID + ":AscendedBoots").setCreativeTab(Main.arcCoreTab);
    
    public static Item nihilHelm = new ArmorNihil(ArmorNihil, 0, 0, "NihilHelm").setUnlocalizedName("NihilHelm").setTextureName(References.MODID + ":NihilHelm").setCreativeTab(Main.arcCoreTab);
    public static Item nihilChest = new ArmorNihil(ArmorNihil, 0, 1, "NihlChest").setUnlocalizedName("NihilChest").setTextureName(References.MODID + ":NihilChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item nihilLegs = new ArmorNihil(ArmorNihil, 0, 2, "NihilLegs").setUnlocalizedName("NihilLegs").setTextureName(References.MODID + ":NihilLegs").setCreativeTab(Main.arcCoreTab);
    public static Item nihilBoots = new ArmorNihil(ArmorNihil, 0, 3, "NihilBoots").setUnlocalizedName("NihilBoots").setTextureName(References.MODID + ":NihilBoots").setCreativeTab(Main.arcCoreTab);
    
    public static Item arclightHelm = new ArmorArclight(Arclight, 0, 0, "ArclightHelm").setUnlocalizedName("ArclightHelm").setTextureName(References.MODID + ":ArclightHelm").setCreativeTab(Main.arcCoreTab);
    public static Item arclightChest = new ArmorArclight(Arclight, 0, 1, "ArclightChest").setUnlocalizedName("ArclightChest").setTextureName(References.MODID + ":ArclightChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item arclightLegs = new ArmorArclight(Arclight, 0, 2, "ArclightLegs").setUnlocalizedName("ArclightLegs").setTextureName(References.MODID + ":ArclightLegs").setCreativeTab(Main.arcCoreTab);
    public static Item arclightBoots = new ArmorArclight(Arclight, 0, 3, "ArclightBoots").setUnlocalizedName("ArclightBoots").setTextureName(References.MODID + ":ArclightBoots").setCreativeTab(Main.arcCoreTab);
   
    public static Item abyssalHelm = new ArmorAbyss(ArmorAbyss, 0, 0, "AbyssalHelm").setUnlocalizedName("AbyssalHelm").setTextureName(References.MODID + ":AbyssalHelm").setCreativeTab(Main.arcCoreTab);
    public static Item abyssalChest = new ArmorAbyss(ArmorAbyss, 0, 1, "AbyssalChest").setUnlocalizedName("AbyssalChest").setTextureName(References.MODID + ":AbyssalChestplate").setCreativeTab(Main.arcCoreTab);
    public static Item abyssalLegs = new ArmorAbyss(ArmorAbyss, 0, 2, "AbyssalLegs").setUnlocalizedName("AbyssalLegs").setTextureName(References.MODID + ":AbyssalLegs").setCreativeTab(Main.arcCoreTab);
    public static Item abyssalBoots = new ArmorAbyss(ArmorAbyss, 0, 3, "AbyssalBoots").setUnlocalizedName("AbyssalBoots").setTextureName(References.MODID + ":AbyssalBoots").setCreativeTab(Main.arcCoreTab); 
    
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
    
    //Staves
    public static Item waterTalisman = new WaterTalisman();
    
    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
    	
    	
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
    	
    	//Block Registry
    	GameRegistry.registerBlock(nihilBlock, "NihilBlock");
    	GameRegistry.registerBlock(arcCoreLampOff, "ArcCoreLampOff");
    	GameRegistry.registerBlock(arcCoreLampOn, "ArcCoreLampOn");
    	
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
    	GameRegistry.registerItem(abyssalShovel, "AbyssalShovel");
    	GameRegistry.registerItem(abyssalShovel, "AbyssalShovel");
    	
    	GameRegistry.registerItem(ascendedSword, "AscendedSword");
    	GameRegistry.registerItem(ascendedPick, "AscendedPickaxe");
    	GameRegistry.registerItem(ascendedAxe, "AscendedAxe");
    	GameRegistry.registerItem(ascendedShovel, "AscendedShovel");
    	GameRegistry.registerItem(ascendedShovel, "AscendedShovel");
    	
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

    	GameRegistry.registerItem(nihilHelm, "NihilHelm");
    	GameRegistry.registerItem(nihilChest, "NihilChest");
    	GameRegistry.registerItem(nihilLegs, "NihilLegs");
    	GameRegistry.registerItem(nihilBoots, "NihilBoots");
    	
    	GameRegistry.registerItem(abyssalHelm, "AbyssalHelm");
    	GameRegistry.registerItem(abyssalChest, "AbyssalChest");
    	GameRegistry.registerItem(abyssalLegs, "AbyssalLegs");
    	GameRegistry.registerItem(abyssalBoots, "AbyssalBoots");
    	
    	//Recipes
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconLeaf), " X ", "XYX", " X ", 'X', Items.emerald, 'Y', Blocks.leaves);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconSapling), "PEP", "DSD", "PEP", 'P', Items.porkchop, 'E', Main.baconLeaf, 'D', Items.emerald, 'S', Blocks.sapling);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.baconBeer), Main.baconRoot, Items.potionitem);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.emeraldBacon), Items.emerald, Items.porkchop, Items.emerald);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.bacon, 4), Main.baconWood);
    	
    	GameRegistry.addSmelting(new ItemStack(Main.baconWood), new ItemStack(Main.baconRoot), 0.2F);
    	GameRegistry.addSmelting(new ItemStack(Main.bacon), new ItemStack(Main.baconCooked), 0.1F);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arcCore), "XYX", "YZY", "XYX", 'X', Blocks.redstone_block  , 'Y', Blocks.glass, 'Z', Items.diamond);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.arclightIngot, 2), "XXX", "XYX", "XXX", 'X', Items.iron_ingot, 'Y', Main.arcCore);
    	
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
