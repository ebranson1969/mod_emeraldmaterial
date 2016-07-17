package net.unladenswallow.minecraft.emeraldmaterial.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.unladenswallow.minecraft.emeraldmaterial.ItemMaterials;

public class BlockCustomDoor extends BlockDoor {

	/* There is an unfortunate circular relationship here.  The ItemDoor needs to know what Block to place,
	 * while the BlockDoor needs to know what Item to drop when broken.  So each must have an instance of the other.
	 */
	private Item dropItem;
	
	/* The concept of "interactive" seems a bit backwards, but it is assumed this way based on a comment in BlockDoor.onBlockActivated() */
	private boolean interactive = false;
	
	public BlockCustomDoor(Block sourceBlock, String unlocalizedName) {
		super(sourceBlock.getDefaultState().getMaterial());
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setHardness(ItemMaterials.getBlockHardness(sourceBlock));
        this.setResistance(ItemMaterials.guessResistance(sourceBlock));
        this.setSoundType(sourceBlock.getSoundType());
        if (this.blockMaterial == Material.IRON)
        {
            this.interactive = true;
        }
	}

	public BlockCustomDoor setDropItem(Item partnerItem) {
		this.dropItem = partnerItem;
		return this;
	}
	
	public Item getDropItem() {
		return this.dropItem;
	}
	
	public BlockCustomDoor setInteractive(boolean interactive) {
		this.interactive = interactive;
		return this;
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? null : this.getDropItem();
    }
	
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (this.allowInteract())
        {
            return false; //Allow items to interact with the door
        }
        else
        {
            BlockPos blockpos1 = state.getValue(HALF) == BlockDoor.EnumDoorHalf.LOWER ? pos : pos.down();
            IBlockState iblockstate1 = pos.equals(blockpos1) ? state : worldIn.getBlockState(blockpos1);

            if (iblockstate1.getBlock() != this)
            {
                return false;
            }
            else
            {
                state = iblockstate1.cycleProperty(OPEN);
                worldIn.setBlockState(blockpos1, state, 2);
                worldIn.markBlockRangeForRenderUpdate(blockpos1, pos);
                worldIn.playEvent(playerIn, ((Boolean)state.getValue(OPEN)).booleanValue() ? this.getOpenSound() : this.getCloseSound(), pos, 0);
                return true;
            }
        }
    }

    protected boolean allowInteract() {
    	return this.interactive;
    }

    /* Copied from IronDoor because they are private */
    private int getCloseSound()
    {
        return this.blockMaterial == Material.IRON ? 1011 : 1012;
    }
    private int getOpenSound()
    {
        return this.blockMaterial == Material.IRON ? 1005 : 1006;
    }

}
