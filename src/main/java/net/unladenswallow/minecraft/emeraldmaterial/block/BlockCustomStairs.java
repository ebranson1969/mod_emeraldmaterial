package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.item.ItemBlock;

public class BlockCustomStairs extends BlockStairs {

	public BlockCustomStairs(Block sourceBlock, String unlocalizedName) {
		super(sourceBlock.getDefaultState());
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.useNeighborBrightness = true;
	}

	public ItemBlock getItemBlock() {
	    ItemBlock itemBlock = new ItemBlock(this);
	    itemBlock.setRegistryName(this.getRegistryName());
	    return itemBlock;
	}
}
