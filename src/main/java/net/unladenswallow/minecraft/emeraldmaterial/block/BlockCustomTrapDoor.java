package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTrapDoor;
import net.unladenswallow.minecraft.emeraldmaterial.ItemMaterials;

public class BlockCustomTrapDoor extends BlockTrapDoor {

	public BlockCustomTrapDoor(Block sourceBlock, String unlocalizedName) {
		super(sourceBlock.getMaterial());
		this.setUnlocalizedName(unlocalizedName);
		this.setStepSound(sourceBlock.stepSound);
		setHardness(ItemMaterials.getBlockHardness(sourceBlock));
		this.disableStats();
	}

}
