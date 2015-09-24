package net.unladenswallow.minecraft.emeraldmaterial.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.unladenswallow.minecraft.emeraldmaterial.ModEmeraldMaterial;

public class BlockEmeraldDoor extends BlockDoor {

	public BlockEmeraldDoor() {
		super(Blocks.emerald_block.getMaterial());
		this.setUnlocalizedName("emeraldDoor");
		this.setHardness(6.0f);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(CreativeTabs.tabRedstone);
	}

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? null : ModEmeraldMaterial.emeraldDoor;
    }
	
}
