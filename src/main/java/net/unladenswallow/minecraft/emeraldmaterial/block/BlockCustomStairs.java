package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockCustomStairs extends BlockStairs {

	public BlockCustomStairs(Block sourceBlock, String unlocalizedName) {
		super(sourceBlock.getDefaultState());
		this.setUnlocalizedName(unlocalizedName);
		this.useNeighborBrightness = true;
	}

}
