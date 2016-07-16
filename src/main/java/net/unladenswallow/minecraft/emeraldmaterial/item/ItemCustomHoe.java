package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.item.ItemHoe;

public class ItemCustomHoe extends ItemHoe {

    public ItemCustomHoe(ToolMaterial toolMaterial, String unlocalizedName) {
        super(toolMaterial);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
    }

}
