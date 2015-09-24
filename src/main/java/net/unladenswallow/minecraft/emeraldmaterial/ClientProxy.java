package net.unladenswallow.minecraft.emeraldmaterial;

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
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        	.register(ModEmeraldMaterial.emeraldHelmet, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_helmet"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldChest, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_chest"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldPants, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_pants"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldBoots, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_boots"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldBroadsword, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_broadsword"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldSword, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_sword"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldBow, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_bow"), "inventory"));
        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow");
        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow_pulling_0");
        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow_pulling_1");
        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow_pulling_2");
        ModelBakery.addVariantName(ModEmeraldMaterial.emeraldBow, ModEmeraldMaterial.MODID + ":emerald_bow_pulling_3");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldPickaxe, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_pickaxe"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldAxe, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_axe"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldSpade, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_spade"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldHoe, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_hoe"), "inventory"));

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(Item.getItemFromBlock(ModEmeraldMaterial.emeraldStairs), 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_stairs"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(Item.getItemFromBlock(ModEmeraldMaterial.emeraldHalfSlab), 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_half_slab"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(Item.getItemFromBlock(ModEmeraldMaterial.emeraldWall), 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_wall"), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(ModEmeraldMaterial.emeraldDoor, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, "emerald_door"), "inventory"));

        MinecraftForge.EVENT_BUS.register(ModEmeraldMaterial.emeraldBow);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
