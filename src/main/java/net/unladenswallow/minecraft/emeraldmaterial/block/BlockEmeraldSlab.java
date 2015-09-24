package net.unladenswallow.minecraft.emeraldmaterial.block;

import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.unladenswallow.minecraft.emeraldmaterial.ModEmeraldMaterial;

public abstract class BlockEmeraldSlab extends BlockSlab {
	
	/* The Emerald Slab does not have any variants, but if we want to inherit behaviors of BlockSlab and ItemSlab,
	 * we need to conform to their expectations.  Specifically, ItemSlab will only place a half slab on another
	 * half slab if it is the same variant. So we create a dummy boolean variant that is always false.
	 * The alternative is probably to have ItemBlockEmeraldSlab override everything in it's parent class
	 * that refers to variants.
	 */
	private static final PropertyBool VARIANT_PROPERTY = PropertyBool.create("variant");
	
	public BlockEmeraldSlab() {
		super(Blocks.emerald_block.getMaterial());
		setHardness(5f);
		setResistance(30f);
		IBlockState iblockstate = this.blockState.getBaseState();
		iblockstate = iblockstate.withProperty(VARIANT_PROPERTY, false);
		if (!this.isDouble()) {
			this.setCreativeTab(CreativeTabs.tabBlock);
			iblockstate = iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
		}
		this.setDefaultState(iblockstate);
		this.useNeighborBrightness = !this.isDouble();
	}

	@Override
    protected final BlockState createBlockState() {
        if (this.isDouble()) {
            return new BlockState(this, new IProperty[] {VARIANT_PROPERTY});
        } else {
            return new BlockState(
                this,
                new IProperty[] {VARIANT_PROPERTY, HALF});
        }
    }

	@Override
    public final IBlockState getStateFromMeta(final int meta) {
        IBlockState blockState = this.getDefaultState();
        if (!this.isDouble()) {
            EnumBlockHalf value = EnumBlockHalf.BOTTOM;
            if ((meta & 8) != 0) {
                value = EnumBlockHalf.TOP;
            }

            blockState = blockState.withProperty(HALF, value);
        }

        return blockState;
    }
	
	@Override
	public int getMetaFromState(IBlockState state)
    {
		if (this.isDouble()) {
           return 0;
        }

        if ((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP) {
            return 8;
        } else {
            return 0;
        }
    }
	
	@Override
	public String getUnlocalizedName(int meta) {
		return getUnlocalizedName();
	}

	@Override
	public abstract boolean isDouble();

	@Override
	public IProperty getVariantProperty() {
		return VARIANT_PROPERTY;
	}

	@Override
	public Object getVariant(ItemStack stack) {
		return false;
	}

	@Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		IBlockState blockState = super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
		return blockState;
	}
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModEmeraldMaterial.emeraldHalfSlab);
    }

}
