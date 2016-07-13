package net.unladenswallow.minecraft.emeraldmaterial.item;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemCustomAxe extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder, Blocks.wooden_button, Blocks.wooden_pressure_plate});

    public ItemCustomAxe(Item.ToolMaterial toolMaterial, String unlocalizedName) {
        super(toolMaterial, EFFECTIVE_ON);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.wood && material != Material.plants && material != Material.vine ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }

}
