package com.goldensilver853.ironfence;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockObsidianFence extends BlockFence {

	public BlockObsidianFence(Material par3Material) {

		super("obsidian", Material.rock);
		this.setBlockName("obsidianFence");
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(CreativeTabs.tabDecorations);

	}

	public boolean onBlockActivated(World world, int i, int j, int k,
			EntityPlayer entity, int l, float m, float n, float o) {

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == IronFence.CrystalUpgrade) {
			world.setBlock(i, j, k, IronFence.BlockCrystalFence, 0, 2);
		}

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == IronFence.CrystalUpgrade) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory
						.consumeInventoryItem(IronFence.CrystalUpgrade);
		}

		return true;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}
}