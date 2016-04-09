package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.*;

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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = References.MODID, version = References.VERSION)
public class Main
{
    
    @Instance(value = References.MODID)
    public static Main instance;
    
    @SidedProxy(clientSide = "com.thearclightcrusader.ArcCore.proxy.ProxyClient", serverSide = "com.thearclightcrusader.ArcCore.proxy.ProxyCommon")
    public static ProxyCommon proxy;
    
    public static ArmorMaterial ArmorBacon = EnumHelper.addArmorMaterial("Emerald Encrusted Bacon", 37, new int[]{4, 6, 5, 4}, 35);
    public static ArmorMaterial Arclight = EnumHelper.addArmorMaterial("Arclight", 50, new int[]{5, 8, 7, 5}, 40);
    public static ArmorMaterial ArmorNihil = EnumHelper.addArmorMaterial("ArmorNihil", 70, new int[]{6, 9, 9, 6}, 60);
    
    public static ToolMaterial ArclightTool = EnumHelper.addToolMaterial("ArclightTool", 5, 1000, 5, 10, 50);
    public static ToolMaterial BaconTool = EnumHelper.addToolMaterial("BaconTool", 5, 900, 4, 8, 50);
    public static ToolMaterial NihilTool = EnumHelper.addToolMaterial("NihilTool", 1, 25, 1, 1, 1);
    public static ToolMaterial AbyssalTool = EnumHelper.addToolMaterial("AbyssalTool", 5, 1200, 6, 12, 50);
    public static ToolMaterial AscendedTool = EnumHelper.addToolMaterial("ArclightTool", 5, 1500, 7, 15, 100);
    
    //Blocks
    public static Block baconSapling;
    public static Block baconWood;
    public static Block baconLeaf;
    public static Block nihilBlock = new NihilBlock(90017, Material.rock);
    
    public static Item baconHelm = new ArmorBacon(90005, ArmorBacon, 0, 0, "BaconHelm").setUnlocalizedName("BaconHelm").setTextureName(References.MODID + ":BaconHelm").setCreativeTab(CreativeTabs.tabCombat);;
    public static Item baconChestplate = new ArmorBacon(90006, ArmorBacon, 0, 1, "BaconChest").setUnlocalizedName("BaconChest").setTextureName(References.MODID + ":BaconChestplate").setCreativeTab(CreativeTabs.tabCombat);;
    public static Item baconLegs = new ArmorBacon(90007, ArmorBacon, 0, 2, "BaconLegs").setUnlocalizedName("BaconLegs").setTextureName(References.MODID + ":BaconLegs").setCreativeTab(CreativeTabs.tabCombat);;
    public static Item baconBoots = new ArmorBacon(90008, ArmorBacon, 0, 3, "BaconBoots").setUnlocalizedName("BaconBoots").setTextureName(References.MODID + ":BaconBoots").setCreativeTab(CreativeTabs.tabCombat);;
    
    public static Item baconRoot = new BaconRoot(90000);
    public static Item emeraldBacon = new EmeraldBacon(90001);
    public static Item bacon = new Bacon(90002, 1, false);
    public static Item baconBeer = new BaconBeer(90003, 2, false);
    public static Item baconCooked = new BaconCooked(90004, 6, false);
    
    public static Item arclightIngot = new ArclightIngot(90013);
    public static Item arcCore = new ArcCore(90014);
    public static Item protoArcCore = new PrototypeCore(90015);
    
    public static Item nihilHelm = new ArmorNihil(90009, ArmorNihil, 0, 0, "NihilHelm").setUnlocalizedName("ArclightHelm").setTextureName(References.MODID + ":ArclightHelm");
    public static Item nihilChest = new ArmorNihil(90010, ArmorNihil, 0, 1, "NihlChest").setUnlocalizedName("ArclightChest").setTextureName(References.MODID + ":ArclightChestplate");
    public static Item nihilLegs = new ArmorNihil(90011, ArmorNihil, 0, 2, "NihilLegs").setUnlocalizedName("ArclightLegs").setTextureName(References.MODID + ":ArclightLegs");
    public static Item nihilBoots = new ArmorNihil(90012, ArmorNihil, 0, 3, "NihilBoots").setUnlocalizedName("ArclightBoots").setTextureName(References.MODID + ":ArclightBoots"); 
    
    public static Item arclightHelm = new ArmorArclight(90009, Arclight, 0, 0, "ArclightHelm").setUnlocalizedName("ArclightHelm").setTextureName(References.MODID + ":ArclightHelm");
    public static Item arclightChest = new ArmorArclight(90010, Arclight, 0, 1, "ArclightChest").setUnlocalizedName("ArclightChest").setTextureName(References.MODID + ":ArclightChestplate");
    public static Item arclightLegs = new ArmorArclight(90011, Arclight, 0, 2, "ArclightLegs").setUnlocalizedName("ArclightLegs").setTextureName(References.MODID + ":ArclightLegs");
    public static Item arclightBoots = new ArmorArclight(90012, Arclight, 0, 3, "ArclightBoots").setUnlocalizedName("ArclightBoots").setTextureName(References.MODID + ":ArclightBoots"); 
    
    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
    	//Blocks
    	baconSapling = new BaconSapling().setBlockName("Sapling").setCreativeTab(CreativeTabs.tabDecorations);
    	baconLeaf = new BaconLeaf().setBlockName("Leaf").setCreativeTab(CreativeTabs.tabDecorations);
    	baconWood = new BaconWood().setBlockName("Log").setCreativeTab(CreativeTabs.tabBlock);
		//GameReg
    	GameRegistry.registerBlock(baconWood, ItemLogBlocks.class, baconWood.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(baconLeaf, ItemLeafBlocks.class, baconLeaf.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(baconSapling, ItemSaplingBlocks.class, baconSapling.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(nihilBlock, "NihilBlock");
    	
    	GameRegistry.registerItem(bacon, "Bacon");
    	GameRegistry.registerItem(baconRoot, "BaconRoot");
    	GameRegistry.registerItem(baconCooked, "CookedBacon");
    	GameRegistry.registerItem(emeraldBacon, "EmeraldEncrustedBacon");
    	GameRegistry.registerItem(baconBeer, "BaconBeer");
    	GameRegistry.registerItem(protoArcCore, "ProtoArcCore");
    	
    	GameRegistry.registerItem(baconHelm, "BaconHelm");
    	GameRegistry.registerItem(baconChestplate, "BaconChest");
    	GameRegistry.registerItem(baconLegs, "BaconLegs");
    	GameRegistry.registerItem(baconBoots, "BaconBoots");
    	
    	GameRegistry.registerItem(arclightHelm, "ArclightHelm");
    	GameRegistry.registerItem(arclightChest, "ArclightChest");
    	GameRegistry.registerItem(arclightLegs, "ArclightLegs");
    	GameRegistry.registerItem(arclightBoots, "ArclightBoots");
    	
    	GameRegistry.registerItem(arclightIngot, "ArclightIngot");
    	GameRegistry.registerItem(arcCore, "ArcCore");
    	
    	//Recipes
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconLeaf), " X ", "XYX", " X ", 'X', Items.emerald, 'Y', Blocks.leaves);
    	GameRegistry.addShapedRecipe(new ItemStack(Main.baconSapling), "PEP", "DSD", "PEP", 'P', Items.porkchop, 'E', Main.baconLeaf, 'D', Items.diamond, 'S', Blocks.sapling);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.baconBeer), Main.baconRoot, Items.potionitem);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.emeraldBacon), Items.emerald, Items.porkchop, Items.emerald);
    	GameRegistry.addShapelessRecipe(new ItemStack(Main.bacon, 4), Main.baconWood);
    	
    	GameRegistry.addSmelting(new ItemStack(Main.baconWood), new ItemStack(Main.baconRoot), 5);
    	GameRegistry.addSmelting(new ItemStack(Main.bacon), new ItemStack(Main.baconCooked), 7);
    	
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
    public void load(FMLInitializationEvent event){
    	proxy.registerRenderers();
    }
}
