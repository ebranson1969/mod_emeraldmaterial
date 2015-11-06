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
        registerItemFromBlock(ModEmeraldMaterial.emeraldTrapdoor, "emerald_trapdoor");

        registerItem(ModEmeraldMaterial.emeraldHorseArmor, "emerald_horse_armor");

        
        registerItem(ModEmeraldMaterial.obsidianIngot, "obsidian_ingot");
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
        registerItemFromBlock(ModEmeraldMaterial.obsidianTrapdoor, "obsidian_trapdoor");

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
        registerItemFromBlock(ModEmeraldMaterial.lapisTrapdoor, "lapis_trapdoor");


        registerItem(ModEmeraldMaterial.redstoneHelmet, "redstone_helmet");
        registerItem(ModEmeraldMaterial.redstoneChest, "redstone_chest");
        registerItem(ModEmeraldMaterial.redstonePants, "redstone_pants");
        registerItem(ModEmeraldMaterial.redstoneBoots, "redstone_boots");
        
        registerItem(ModEmeraldMaterial.redstoneSword, "redstone_sword");
        registerItem(ModEmeraldMaterial.redstoneBroadsword, "redstone_broadsword");
        registerItemModelWithVariants(ModEmeraldMaterial.redstoneBow, ModEmeraldMaterial.MODID + ":redstone_bow", ModEmeraldMaterial.MODID + ":redstone_bow", 3);
        
        registerItem(ModEmeraldMaterial.redstoneAxe, "redstone_axe");
        registerItem(ModEmeraldMaterial.redstoneHoe, "redstone_hoe");
        registerItem(ModEmeraldMaterial.redstonePickaxe, "redstone_pickaxe");
        registerItem(ModEmeraldMaterial.redstoneSpade, "redstone_spade");

        registerItemFromBlock(ModEmeraldMaterial.redstoneStairs, "redstone_stairs");
        registerItemFromBlock(ModEmeraldMaterial.redstoneWall, "redstone_wall");
        registerItemFromBlock(ModEmeraldMaterial.redstoneHalfSlab, "redstone_half_slab");

        registerItem(ModEmeraldMaterial.redstoneDoor, "redstone_door");
        registerItemFromBlock(ModEmeraldMaterial.redstoneTrapdoor, "redstone_trapdoor");


        registerItem(ModEmeraldMaterial.goldBroadsword, "gold_broadsword");
        registerItemModelWithVariants(ModEmeraldMaterial.goldBow, ModEmeraldMaterial.MODID + ":gold_bow", ModEmeraldMaterial.MODID + ":gold_bow", 3);

        registerItemFromBlock(ModEmeraldMaterial.goldStairs, "gold_stairs");
        registerItemFromBlock(ModEmeraldMaterial.goldWall, "gold_wall");
        registerItemFromBlock(ModEmeraldMaterial.goldHalfSlab, "gold_half_slab");

        registerItem(ModEmeraldMaterial.goldDoor, "gold_door");
        registerItemFromBlock(ModEmeraldMaterial.goldTrapdoor, "gold_trapdoor");


        registerItem(ModEmeraldMaterial.ironBroadsword, "iron_broadsword");
        registerItemModelWithVariants(ModEmeraldMaterial.ironBow, ModEmeraldMaterial.MODID + ":iron_bow", ModEmeraldMaterial.MODID + ":iron_bow", 3);

        registerItemFromBlock(ModEmeraldMaterial.ironStairs, "iron_stairs");
        registerItemFromBlock(ModEmeraldMaterial.ironWall, "iron_wall");
        registerItemFromBlock(ModEmeraldMaterial.ironHalfSlab, "iron_half_slab");

        
        registerItem(ModEmeraldMaterial.diamondBroadsword, "diamond_broadsword");
        registerItemModelWithVariants(ModEmeraldMaterial.diamondBow, ModEmeraldMaterial.MODID + ":diamond_bow", ModEmeraldMaterial.MODID + ":diamond_bow", 3);

        registerItemFromBlock(ModEmeraldMaterial.diamondStairs, "diamond_stairs");
        registerItemFromBlock(ModEmeraldMaterial.diamondWall, "diamond_wall");
        registerItemFromBlock(ModEmeraldMaterial.diamondHalfSlab, "diamond_half_slab");

        registerItem(ModEmeraldMaterial.diamondDoor, "diamond_door");
        registerItemFromBlock(ModEmeraldMaterial.diamondTrapdoor, "diamond_trapdoor");

        
        registerItemFromBlock(ModEmeraldMaterial.diamondObsidianBlock, "diamond-obsidian_block");
        registerItem(ModEmeraldMaterial.diamondObsidianIngot, "diamond-obsidian_ingot");
        registerItem(ModEmeraldMaterial.diamondObsidianHelmet, "diamond-obsidian_helmet");
        registerItem(ModEmeraldMaterial.diamondObsidianChest, "diamond-obsidian_chest");
        registerItem(ModEmeraldMaterial.diamondObsidianPants, "diamond-obsidian_pants");
        registerItem(ModEmeraldMaterial.diamondObsidianBoots, "diamond-obsidian_boots");
        
        registerItem(ModEmeraldMaterial.diamondObsidianSword, "diamond-obsidian_sword");
        registerItem(ModEmeraldMaterial.diamondObsidianBroadsword, "diamond-obsidian_broadsword");
        registerItemModelWithVariants(ModEmeraldMaterial.diamondObsidianBow, ModEmeraldMaterial.MODID + ":diamond-obsidian_bow", ModEmeraldMaterial.MODID + ":diamond-obsidian_bow", 3);
        
        registerItem(ModEmeraldMaterial.diamondObsidianAxe, "diamond-obsidian_axe");
        registerItem(ModEmeraldMaterial.diamondObsidianHoe, "diamond-obsidian_hoe");
        registerItem(ModEmeraldMaterial.diamondObsidianPickaxe, "diamond-obsidian_pickaxe");
        registerItem(ModEmeraldMaterial.diamondObsidianSpade, "diamond-obsidian_spade");


        MinecraftForge.EVENT_BUS.register(ModEmeraldMaterial.emeraldBow);

    }

	public void registerItem(Item item, String name) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(item, 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, name), "inventory"));
    }
    
    public void registerItemFromBlock(Block block, String name) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(ModEmeraldMaterial.MODID, name), "inventory"));
    	
    }
    
    public void registerItemModelWithVariants(Item bowAndQuiver, String itemModel, String modelBase, int numVariants) {
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
