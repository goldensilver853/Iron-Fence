package com.goldensilver853.ironfence;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = IronFence.MODID, version = IronFence.VERSION)
public class IronFence
{
    public static final String MODID = "IronFence";
    public static final String VERSION = "0.1.0";
   
    
    public static Block BlockIronFence;
    public static Block BlockCopperFence;
    public static Block BlockSilverFence;
    public static Block BlockGoldFence;
    public static Block BlockDiamondFence;
    public static Block BlockCrystalFence;
    public static Block BlockObsidianFence;
    public static Block DirtFence;
    public static Item CrystalUpgrade;
    public static Item ObsidianUpgrade;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		BlockIronFence = new BlockIronFence(Material.iron)
		.setHardness(5F) .setResistance(7F) .setStepSound(Block.soundTypeMetal);
		GameRegistry.registerBlock(BlockIronFence, "ironFence");
		
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockIronFence, true, new Object[]{
                "FFF", "FPF", "FFF", Character.valueOf('F'), ("ingotIron"), Character.valueOf('P'), (Blocks.fence),
                }));
        
		
		BlockCopperFence = new BlockCopperFence(Material.iron)
		.setHardness(5F) .setResistance(7F) .setStepSound(Block.soundTypeMetal);
		GameRegistry.registerBlock(BlockCopperFence,  "copperFence");
		
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockCopperFence, true, new Object[]{
                "FFF", "FPF", "FFF", Character.valueOf('F'), ("ingotCopper"), Character.valueOf('P'), (Blocks.fence),
                }));
        
		
		BlockSilverFence = new BlockSilverFence(Material.iron)
		.setHardness(5F) .setResistance(7F) .setStepSound(Block.soundTypeMetal); 
		GameRegistry.registerBlock(BlockSilverFence,  "silverFence");
		
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockSilverFence, true, new Object[]{
                "FFF", "FPF", "FFF", Character.valueOf('F'), ("ingotSilver"), Character.valueOf('P'), (Blocks.fence),
                }));
        
		
		BlockGoldFence = new BlockGoldFence(Material.iron) 
		.setHardness(7F) .setResistance(8F) .setStepSound(Block.soundTypeMetal);
		GameRegistry.registerBlock(BlockGoldFence, "goldFence");
		
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockGoldFence, true, new Object[]{
                "FFF", "FPF", "FFF", Character.valueOf('F'), ("ingotGold"), Character.valueOf('P'), (BlockIronFence),
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockGoldFence, true, new Object[]{
                "FFF", "FPF", "FFF", Character.valueOf('F'), ("ingotGold"), Character.valueOf('P'), (BlockSilverFence),
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockGoldFence, true, new Object[]{
                "FFF", "FPF", "FFF", Character.valueOf('F'), ("ingotGold"), Character.valueOf('P'), (BlockCopperFence),
                }));
        
		
		BlockDiamondFence = new BlockDiamondFence(Material.iron)
	    .setHardness(15F) .setResistance(18F) .setStepSound(Block.soundTypeMetal);
		GameRegistry.registerBlock(BlockDiamondFence,  "diamondFence");
		
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockDiamondFence, true, new Object[]{
                "FFF", "FPF", "FFF", Character.valueOf('F'), ("gemDiamond"), Character.valueOf('P'), (BlockGoldFence),
                }));
        
		
		BlockCrystalFence = new BlockCrystalFence(Material.iron)
		.setHardness(50F) .setResistance(60F) .setStepSound(Block.soundTypeMetal);
		GameRegistry.registerBlock(BlockCrystalFence,  "crystalFence");
		
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockCrystalFence, true, new Object[]{
                "FGF", "GPG", "FGF", Character.valueOf('F'), ("gemDiamond"), Character.valueOf('P'), (BlockDiamondFence), Character.valueOf('G'), ("blockGlass"),
                }));
        
        
		DirtFence = new BlockFence("dirt", Material.ground)
		.setBlockName("DirtFence") .setHardness(1F) .setResistance(2F) .setStepSound(Block.soundTypeGravel);
		GameRegistry.registerBlock(DirtFence,  "DirtFence");
		
        GameRegistry.addRecipe(new ShapedOreRecipe(DirtFence, true, new Object[]{
                "FFF", "FPF", "FFF", Character.valueOf('F'), (Blocks.dirt), Character.valueOf('P'), (Blocks.fence),
                }));
        
        
		BlockObsidianFence = new BlockObsidianFence(Material.rock)
		.setHardness(50F) .setResistance(60F);
		GameRegistry.registerBlock(BlockObsidianFence,  "obsidanFence") .setStepSound(Block.soundTypeStone);
		
        GameRegistry.addRecipe(new ShapedOreRecipe(BlockObsidianFence, true, new Object[]{
                "FFF", "FPF", "FFF", Character.valueOf('F'), (Blocks.obsidian), Character.valueOf('P'), (BlockDiamondFence)
                }));
        
        
        CrystalUpgrade = new Item()
        .setUnlocalizedName("crystalUpgrade") .setTextureName("ironfence:crystalUpgrade") .setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(CrystalUpgrade, "crystalUpgrade");
        
        
        GameRegistry.addRecipe(new ShapedOreRecipe(CrystalUpgrade, true, new Object[]{
                "XFX", "FDF", "XFX", Character.valueOf('F'), ("blockGlass"), Character.valueOf('D'), ("gemDiamond")
                }));
        
        
        
        
        ObsidianUpgrade = new Item()
        .setUnlocalizedName("obsidianUpgrade") .setTextureName("ironfence:obsidianUpgrade") .setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(ObsidianUpgrade, "obsidianUpgrade");
        
        
        GameRegistry.addRecipe(new ShapedOreRecipe(ObsidianUpgrade, true, new Object[]{
                "XFX", "FFF", "XFX", Character.valueOf('F'), (Blocks.obsidian)
                }));
        
        
    }
}
