package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.item.ItemBlock;
import net.unladenswallow.minecraft.emeraldmaterial.ItemMaterials;

public class BlockCustomTrapDoor extends BlockTrapDoor {

	public BlockCustomTrapDoor(Block sourceBlock, String unlocalizedName) {
		super(sourceBlock.getMaterial(sourceBlock.getDefaultState()));
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setStepSound(sourceBlock.getStepSound());
		setHardness(ItemMaterials.getBlockHardness(sourceBlock));
		this.disableStats();
	}

    public ItemBlock getItemBlock() {
        ItemBlock itemBlock = new ItemBlock(this);
        itemBlock.setRegistryName(this.getRegistryName());
        return itemBlock;
    }
}
