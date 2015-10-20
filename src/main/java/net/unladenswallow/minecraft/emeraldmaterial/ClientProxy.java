package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        registerItem(ModEmeraldMaterial.emeraldHelmet, "emerald_helmet");
        registerItem(ModEmeraldMaterial.emeraldChest, "emerald_chest");
        registerItem(ModEmeraldMaterial.emeraldPants, "emerald_pants");
        registerItem(ModEmeraldMaterial.emeraldBoots, "emerald_boots");
        registerItem(ModEmeraldMaterial.emeraldBroadsword, "emerald_broadsword");
        registerItem(ModEmeraldMaterial.emeraldSword, "emerald_sword");
        registerItemModelWithVariants(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow", ModEmeraldMaterial.MODID + ":emerald_bow", 4);
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
//    		.register(ModEmeraldMaterial.emeraldBow, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_bow"), "inventory"));
//        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow");
//        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow_pulling_0");
//        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow_pulling_1");
//        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow_pulling_2");
//        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow_pulling_3");
        registerItem(ModEmeraldMaterial.emeraldPickaxe, "emerald_pickaxe");
        registerItem(ModEmeraldMaterial.emeraldAxe, "emerald_axe");
        registerItem(ModEmeraldMaterial.emeraldSpade, "emerald_spade");
        registerItem(ModEmeraldMaterial.emeraldHoe, "emerald_hoe");
        registerItem(ModEmeraldMaterial.emeraldHorseArmor, "emerald_horse_armor");

        registerItemFromBlock(ModEmeraldMaterial.emeraldStairs, "emerald_stairs");
        registerItemFromBlock(ModEmeraldMaterial.emeraldHalfSlab, "emerald_half_slab");
        registerItemFromBlock(ModEmeraldMaterial.emeraldWall, "emerald_wall");

        registerItem(ModEmeraldMaterial.emeraldDoor, "emerald_door");

        registerItem(ModEmeraldMaterial.obsidianHelmet, "obsidian_helmet");
        registerItem(ModEmeraldMaterial.obsidianChest, "obsidian_chest");
        registerItem(ModEmeraldMaterial.obsidianPants, "obsidian_pants");
        registerItem(ModEmeraldMaterial.obsidianBoots, "obsidian_boots");
        registerItem(ModEmeraldMaterial.obsidianSword, "obsidian_sword");
        registerItem(ModEmeraldMaterial.obsidianPickaxe, "obsidian_pickaxe");
        registerItem(ModEmeraldMaterial.obsidianAxe, "obsidian_axe");
        registerItem(ModEmeraldMaterial.obsidianSpade, "obsidian_spade");
        registerItem(ModEmeraldMaterial.obsidianHoe, "obsidian_hoe");
        registerItemModelWithVariants(ModEmeraldMaterial.obsidianBow, ModEmeraldMaterial.MODID + ":obsidian_bow", ModEmeraldMaterial.MODID + ":obsidian_bow", 3);

        registerItemFromBlock(ModEmeraldMaterial.obsidianStairs, "obsidian_stairs");
        registerItemFromBlock(ModEmeraldMaterial.obsidianHalfSlab, "obsidian_half_slab");
        registerItemFromBlock(ModEmeraldMaterial.obsidianWall, "obsidian_wall");
        registerItem(ModEmeraldMaterial.obsidianDoor, "obsidian_door");

        registerItemFromBlock(ModEmeraldMaterial.polishedObsidian, "polished_obsidian");

        MinecraftForge.EVENT_BUS.register(ModEmeraldMaterial.emeraldBow);
    }

	protected void registerItem(Item item, String name) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(item, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, name), "inventory"));
    }
    
    protected void registerItemFromBlock(Block block, String name) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, name), "inventory"));
    	
    }
    
    private void registerItemModelWithVariants(Item bowAndQuiver, String itemModel, String modelBase, int numVariants) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(bowAndQuiver, 0, new ModelResourceLocation(itemModel, "inventory"));
        ModelBakery.addVariantName(bowAndQuiver, itemModel);
        ModelBakery.addVariantName(bowAndQuiver, modelBase);
        for (int i = 0; i < numVariants; i++) {
	        ModelBakery.addVariantName(bowAndQuiver, modelBase + "_pulling_" + i);
        }
    }
    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
