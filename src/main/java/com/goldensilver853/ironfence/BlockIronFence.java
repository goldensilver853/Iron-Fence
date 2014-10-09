package com.goldensilver853.ironfence;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class BlockIronFence extends BlockFence {

	public BlockIronFence(Material par3Material) {

		super("ironfence:iron", Material.iron);
		this.setBlockName("ironFence");
		this.setStepSound(Block.soundTypeMetal);
		this.setCreativeTab(CreativeTabs.tabDecorations);

	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k,
			EntityPlayer entity, int l, float m, float n, float o) {

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == Items.gold_ingot) {
			world.setBlock(i, j, k, IronFence.BlockGoldFence, 0, 2);
		}

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == Items.gold_ingot) {
			if (entity instanceof EntityPlayer)
				entity.inventory
						.consumeInventoryItem(Items.gold_ingot);
		}

		return true;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}

}
