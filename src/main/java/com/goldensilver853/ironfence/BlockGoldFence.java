package com.goldensilver853.ironfence;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class BlockGoldFence extends BlockFence {

	public BlockGoldFence(Material par3Material) {

		super("ironfence:gold", Material.iron);
		this.setResistance(6.0F);
		this.setHardness(4.0F);
		this.setBlockName("goldFence");
		this.setStepSound(Block.soundTypeMetal);
		this.setCreativeTab(CreativeTabs.tabDecorations);

	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k,
			EntityPlayer entity, int l, float m, float n, float o) {

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == Items.diamond) {
			world.setBlock(i, j, k, IronFence.BlockDiamondFence, 0, 2);
		}

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == Items.diamond) {
			if (entity instanceof EntityPlayer)
				entity.inventory
						.consumeInventoryItem(Items.diamond);
		}

		return true;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}

}