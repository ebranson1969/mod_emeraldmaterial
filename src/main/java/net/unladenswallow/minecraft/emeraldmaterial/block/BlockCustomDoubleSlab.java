package net.unladenswallow.minecraft.emeraldmaterial.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockCustomDoubleSlab extends BlockCustomSlab {

	private BlockCustomHalfSlab halfSlabPartner;
	
	public BlockCustomDoubleSlab(Block sourceBlock, BlockCustomHalfSlab halfSlabPartner, String unlocalizedName) {
		super(sourceBlock);
		this.halfSlabPartner = halfSlabPartner;
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
	}
	
	@Override
	public boolean isDouble() {
		return true;
	}

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this.halfSlabPartner);
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return "thereAreNoVariants";
    }


}
