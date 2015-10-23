package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTrapDoor;

public class BlockCustomTrapDoor extends BlockTrapDoor {

	public BlockCustomTrapDoor(Block sourceBlock, String unlocalizedName) {
		super(sourceBlock.getMaterial());
		this.setUnlocalizedName(unlocalizedName);
		this.setStepSound(sourceBlock.stepSound);
		/* Best guess reverse-engineered value of hardness value based on the explosion
		 * resistance of the given source block, without allowing hardness to be absurdly high */
		setHardness(Math.min(15.0f, sourceBlock.getExplosionResistance(null)));
		this.disableStats();
	}

}
