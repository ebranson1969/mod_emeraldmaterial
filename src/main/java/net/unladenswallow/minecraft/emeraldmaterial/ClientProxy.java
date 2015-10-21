package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
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

        registerItem(ModEmeraldMaterial.emeraldSword, "emerald_sword");
        registerItem(ModEmeraldMaterial.emeraldBroadsword, "emerald_broadsword");
        registerItemModelWithVariants(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow", ModEmeraldMaterial.MODID + ":emerald_bow", 4);
        
        registerItem(ModEmeraldMaterial.emeraldAxe, "emerald_axe");
        registerItem(ModEmeraldMaterial.emeraldHoe, "emerald_hoe");
        registerItem(ModEmeraldMaterial.emeraldPickaxe, "emerald_pickaxe");
        registerItem(ModEmeraldMaterial.emeraldSpade, "emerald_spade");

        registerItemFromBlock(ModEmeraldMaterial.emeraldStairs, "emerald_stairs");
        registerItemFromBlock(ModEmeraldMaterial.emeraldWall, "emerald_wall");
        registerItemFromBlock(ModEmeraldMaterial.emeraldHalfSlab, "emerald_half_slab");

        registerItem(ModEmeraldMaterial.emeraldDoor, "emerald_door");

        registerItem(ModEmeraldMaterial.emeraldHorseArmor, "emerald_horse_armor");

        
        registerItem(ModEmeraldMaterial.obsidianHelmet, "obsidian_helmet");
        registerItem(ModEmeraldMaterial.obsidianChest, "obsidian_chest");
        registerItem(ModEmeraldMaterial.obsidianPants, "obsidian_pants");
        registerItem(ModEmeraldMaterial.obsidianBoots, "obsidian_boots");
        
        registerItem(ModEmeraldMaterial.obsidianSword, "obsidian_sword");
        registerItem(ModEmeraldMaterial.obsidianBroadsword, "obsidian_broadsword");
        registerItemModelWithVariants(ModEmeraldMaterial.obsidianBow, ModEmeraldMaterial.MODID + ":obsidian_bow", ModEmeraldMaterial.MODID + ":obsidian_bow", 3);
        
        registerItem(ModEmeraldMaterial.obsidianAxe, "obsidian_axe");
        registerItem(ModEmeraldMaterial.obsidianHoe, "obsidian_hoe");
        registerItem(ModEmeraldMaterial.obsidianPickaxe, "obsidian_pickaxe");
        registerItem(ModEmeraldMaterial.obsidianSpade, "obsidian_spade");

        registerItemFromBlock(ModEmeraldMaterial.obsidianStairs, "obsidian_stairs");
        registerItemFromBlock(ModEmeraldMaterial.obsidianWall, "obsidian_wall");
        registerItemFromBlock(ModEmeraldMaterial.obsidianHalfSlab, "obsidian_half_slab");

        registerItem(ModEmeraldMaterial.obsidianDoor, "obsidian_door");

        registerItemFromBlock(ModEmeraldMaterial.polishedObsidian, "polished_obsidian");

        
        registerItem(ModEmeraldMaterial.lapisHelmet, "lapis_helmet");
        registerItem(ModEmeraldMaterial.lapisChest, "lapis_chest");
        registerItem(ModEmeraldMaterial.lapisPants, "lapis_pants");
        registerItem(ModEmeraldMaterial.lapisBoots, "lapis_boots");
        
        registerItem(ModEmeraldMaterial.lapisSword, "lapis_sword");
        registerItem(ModEmeraldMaterial.lapisBroadsword, "lapis_broadsword");
        registerItemModelWithVariants(ModEmeraldMaterial.lapisBow, ModEmeraldMaterial.MODID + ":lapis_bow", ModEmeraldMaterial.MODID + ":lapis_bow", 3);
        
        registerItem(ModEmeraldMaterial.lapisAxe, "lapis_axe");
        registerItem(ModEmeraldMaterial.lapisHoe, "lapis_hoe");
        registerItem(ModEmeraldMaterial.lapisPickaxe, "lapis_pickaxe");
        registerItem(ModEmeraldMaterial.lapisSpade, "lapis_spade");

        registerItemFromBlock(ModEmeraldMaterial.lapisStairs, "lapis_stairs");
        registerItemFromBlock(ModEmeraldMaterial.lapisWall, "lapis_wall");
        registerItemFromBlock(ModEmeraldMaterial.lapisHalfSlab, "lapis_half_slab");

        registerItem(ModEmeraldMaterial.lapisDoor, "lapis_door");


        registerItem(ModEmeraldMaterial.goldBroadsword, "gold_broadsword");
        registerItemModelWithVariants(ModEmeraldMaterial.goldBow, ModEmeraldMaterial.MODID + ":gold_bow", ModEmeraldMaterial.MODID + ":gold_bow", 3);

        registerItemFromBlock(ModEmeraldMaterial.goldStairs, "gold_stairs");
        registerItemFromBlock(ModEmeraldMaterial.goldWall, "gold_wall");
        registerItemFromBlock(ModEmeraldMaterial.goldHalfSlab, "gold_half_slab");

        registerItem(ModEmeraldMaterial.goldDoor, "gold_door");


        
        MinecraftForge.EVENT_BUS.register(ModEmeraldMaterial.emeraldBow);
		MinecraftForge.EVENT_BUS.register(ModEmeraldMaterial.eventHandler);
		FMLCommonHandler.instance().bus().register(ModEmeraldMaterial.eventHandler);

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
