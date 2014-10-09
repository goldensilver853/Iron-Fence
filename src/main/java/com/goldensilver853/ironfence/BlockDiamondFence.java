package com.goldensilver853.ironfence;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


public class BlockDiamondFence extends BlockFence {

	public BlockDiamondFence(Material par3Material) {

		super("ironfence:diamond", Material.iron);
		this.setBlockName("diamondFence");
		this.setStepSound(Block.soundTypeMetal);
		this.setCreativeTab(CreativeTabs.tabDecorations);

	}

	public boolean onBlockActivated(World world, int i, int j, int k,
			EntityPlayer entity, int l, float m, float n, float o) {

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == IronFence.ObsidianUpgrade) {
			world.setBlock(i, j, k, IronFence.BlockObsidianFence, 0, 2);
		}

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == IronFence.ObsidianUpgrade) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory
						.consumeInventoryItem(IronFence.ObsidianUpgrade);
		}

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