package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.BlockStairs;
import net.minecraft.init.Blocks;

public class BlockEmeraldStairs extends BlockStairs {

	public BlockEmeraldStairs() {
		super(Blocks.emerald_block.getDefaultState());
		this.setUnlocalizedName("emeraldStairs");
		this.useNeighborBrightness = true;
	}

}
