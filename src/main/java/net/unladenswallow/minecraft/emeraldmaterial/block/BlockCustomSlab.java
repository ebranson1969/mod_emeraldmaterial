package net.unladenswallow.minecraft.emeraldmaterial.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.unladenswallow.minecraft.emeraldmaterial.EMLogger;
import net.unladenswallow.minecraft.emeraldmaterial.ItemMaterials;

public abstract class BlockCustomSlab extends BlockSlab {
	
	/* The Custom Slab does not have any variants, but if we want to inherit behaviors of BlockSlab and ItemSlab,
	 * we need to conform to their expectations.  Specifically, ItemSlab will only place a half slab on another
	 * half slab if it is the same variant. So we create a dummy boolean variant that is always false.
	 */
    public static final PropertyBool SEAMLESS = PropertyBool.create("seamless");
	protected static final PropertyBool VARIANT = PropertyBool.create("variant");
	
	public BlockCustomSlab(Block sourceBlock) {
		super(sourceBlock.getMaterial(sourceBlock.getDefaultState()));
//		EMLogger.info("BlockCustomSlab <init>: %s guesses: hardness = %f; resistance = %f",
//				(new ItemStack(sourceBlock)).getDisplayName(),
//				ItemMaterials.guessHardness(sourceBlock),
//				ItemMaterials.guessResistance(sourceBlock));
		setHardness(ItemMaterials.getBlockHardness(sourceBlock));
		setResistance(ItemMaterials.guessResistance(sourceBlock));

        IBlockState iblockstate = this.blockState.getBaseState();

        if (this.isDouble())
        {
            iblockstate = iblockstate.withProperty(SEAMLESS, Boolean.valueOf(false));
        }
        else
        {
            iblockstate = iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }

        this.setDefaultState(iblockstate.withProperty(VARIANT, false));
        this.setCreativeTab(CreativeTabs.tabBlock);

		this.useNeighborBrightness = !this.isDouble();
	}

	@Override
    protected final BlockStateContainer createBlockState() {
        return this.isDouble() ? new BlockStateContainer(this, new IProperty[] {SEAMLESS, VARIANT}): new BlockStateContainer(this, new IProperty[] {HALF, VARIANT});
    }

	@Override
    public final IBlockState getStateFromMeta(final int meta) {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, false);

        if (this.isDouble())
        {
            iblockstate = iblockstate.withProperty(SEAMLESS, Boolean.valueOf((meta & 8) != 0));
        }
        else
        {
            iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return iblockstate;
    }
	
	@Override
	public int getMetaFromState(IBlockState state)
    {
        int i = 0;

        if (this.isDouble())
        {
            if (((Boolean)state.getValue(SEAMLESS)).booleanValue())
            {
                i |= 8;
            }
        }
        else if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
        {
            i |= 8;
        }

        return i;
    }
	
	@Override
	public String getUnlocalizedName(int meta) {
		return getUnlocalizedName();
	}

	@Override
	public abstract boolean isDouble();

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

//	@Override
//    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
//		IBlockState blockState = super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
//		return blockState;
//	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }

    public ItemBlock getItemBlock() {
        ItemBlock itemBlock = new ItemBlock(this);
        itemBlock.setRegistryName(this.getRegistryName());
        return itemBlock;
    }

    @Override
    public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
    {
        EMLogger.info("canPlaceBlockOnSide: %b", super.canPlaceBlockOnSide(worldIn, pos, side));
        return super.canPlaceBlockOnSide(worldIn, pos, side);
    }
    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        EMLogger.info("canPlaceBlockAt: %b", super.canPlaceBlockAt(worldIn, pos));
        return super.canPlaceBlockAt(worldIn, pos);
    }

}
