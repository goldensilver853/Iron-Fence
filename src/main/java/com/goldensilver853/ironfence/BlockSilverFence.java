package com.goldensilver853.ironfence;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;



public class BlockSilverFence extends BlockFence {

	public BlockSilverFence(Material par3Material) {

		super("ironfence:silver", Material.iron);
		this.setBlockName("silverFence");
		this.setStepSound(Block.soundTypeMetal);
		this.setCreativeTab(CreativeTabs.tabDecorations);

	}

	public boolean onBlockActivated(World world, int i, int j, int k,
			EntityPlayer entity, int l, float m, float n, float o) {

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == Items.gold_ingot) {
			world.setBlock(i, j, k, IronFence.BlockGoldFence, 0, 2);
		}

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == Items.gold_ingot) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory
						.consumeInventoryItem(Items.gold_ingot);
		}

		return true;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}

}