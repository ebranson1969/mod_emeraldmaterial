package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.Block;

public class BlockCustomHalfSlab extends BlockCustomSlab {

	public BlockCustomHalfSlab(Block sourceBlock, String unlocalizedName) {
		super(sourceBlock);
		setUnlocalizedName(unlocalizedName);
	}
	
	@Override
	public boolean isDouble() {
		return false;
	}

}
