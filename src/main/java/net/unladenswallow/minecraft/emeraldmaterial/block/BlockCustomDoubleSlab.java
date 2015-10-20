package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.Block;

public class BlockCustomDoubleSlab extends BlockCustomSlab {

	public BlockCustomDoubleSlab(Block sourceBlock, String unlocalizedName) {
		super(sourceBlock);
		setUnlocalizedName(unlocalizedName);
	}
	
	@Override
	public boolean isDouble() {
		return true;
	}

}
