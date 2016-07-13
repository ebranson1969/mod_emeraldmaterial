package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class BlockCustomHalfSlab extends BlockCustomSlab {

	public BlockCustomHalfSlab(Block sourceBlock, String unlocalizedName) {
		super(sourceBlock);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
	}
	
	@Override
	public boolean isDouble() {
		return false;
	}

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return "thereAreNoVariants";
    }

}
