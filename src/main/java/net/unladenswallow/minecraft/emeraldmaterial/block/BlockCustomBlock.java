package net.unladenswallow.minecraft.emeraldmaterial.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class BlockCustomBlock extends Block {

	public BlockCustomBlock(Material materialIn, String unlocalizedName) {
		super(materialIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

    public ItemBlock getItemBlock() {
        ItemBlock itemBlock = new ItemBlock(this);
        itemBlock.setRegistryName(this.getRegistryName());
        return itemBlock;
    }
}
