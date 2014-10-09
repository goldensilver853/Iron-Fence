package com.goldensilver853.ironfence;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCrystalFence extends BlockFence {

	public BlockCrystalFence(Material par3Material) {

		super("ironfence:crystal", Material.iron);
		this.setBlockName("crystalFence");
		this.setStepSound(Block.soundTypeMetal);
		this.setCreativeTab(CreativeTabs.tabDecorations);

	}

	@Override
	public boolean onBlockActivated(World world, int i, int j, int k,
			EntityPlayer entity, int l, float m, float n, float o) {

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == IronFence.ObsidianUpgrade) {
			world.setBlock(i, j, k, IronFence.BlockObsidianFence, 0, 2);
		}

		if (entity.inventory.getCurrentItem() != null
				&& entity.inventory.getCurrentItem().getItem() == IronFence.ObsidianUpgrade) {
			if (entity instanceof EntityPlayer)
				entity.inventory
						.consumeInventoryItem(IronFence.ObsidianUpgrade);
		}

		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public int getRenderBlockPass() {
		return 1;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}
}