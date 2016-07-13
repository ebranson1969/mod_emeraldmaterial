package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
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
        registerItemModel(ModEmeraldMaterial.emeraldHelmet);
        registerItemModel(ModEmeraldMaterial.emeraldChest);
        registerItemModel(ModEmeraldMaterial.emeraldPants);
        registerItemModel(ModEmeraldMaterial.emeraldBoots);

        registerItemModel(ModEmeraldMaterial.emeraldSword);
        registerItemModel(ModEmeraldMaterial.emeraldBroadsword);
        registerItemModel(ModEmeraldMaterial.emeraldBow);
        
        registerItemModel(ModEmeraldMaterial.emeraldAxe);
        registerItemModel(ModEmeraldMaterial.emeraldHoe);
        registerItemModel(ModEmeraldMaterial.emeraldPickaxe);
        registerItemModel(ModEmeraldMaterial.emeraldSpade);

        registerItemModel(ModEmeraldMaterial.emeraldStairs);
        registerItemModel(ModEmeraldMaterial.emeraldWall);
//        registerItemFromBlock(ModEmeraldMaterial.emeraldHalfSlab);
//
//        registerItemModel(ModEmeraldMaterial.emeraldDoor);
//        registerItemFromBlock(ModEmeraldMaterial.emeraldTrapdoor);

        registerItemModel(ModEmeraldMaterial.obsidianIngot);
        registerItemModel(ModEmeraldMaterial.obsidianHelmet);
        registerItemModel(ModEmeraldMaterial.obsidianChest);
        registerItemModel(ModEmeraldMaterial.obsidianPants);
        registerItemModel(ModEmeraldMaterial.obsidianBoots);
        
        registerItemModel(ModEmeraldMaterial.obsidianSword);
        registerItemModel(ModEmeraldMaterial.obsidianBroadsword);
        registerItemModel(ModEmeraldMaterial.obsidianBow);
        
        registerItemModel(ModEmeraldMaterial.obsidianAxe);
        registerItemModel(ModEmeraldMaterial.obsidianHoe);
        registerItemModel(ModEmeraldMaterial.obsidianPickaxe);
        registerItemModel(ModEmeraldMaterial.obsidianSpade);

        registerItemModel(ModEmeraldMaterial.obsidianStairs);
        registerItemModel(ModEmeraldMaterial.obsidianWall);
//        registerItemFromBlock(ModEmeraldMaterial.obsidianHalfSlab);
//
//        registerItemModel(ModEmeraldMaterial.obsidianDoor);
//        registerItemFromBlock(ModEmeraldMaterial.obsidianTrapdoor);

        registerItemModel(ModEmeraldMaterial.polishedObsidian);

        
        registerItemModel(ModEmeraldMaterial.lapisHelmet);
        registerItemModel(ModEmeraldMaterial.lapisChest);
        registerItemModel(ModEmeraldMaterial.lapisPants);
        registerItemModel(ModEmeraldMaterial.lapisBoots);
        
        registerItemModel(ModEmeraldMaterial.lapisSword);
        registerItemModel(ModEmeraldMaterial.lapisBroadsword);
        registerItemModel(ModEmeraldMaterial.lapisBow);
        
        registerItemModel(ModEmeraldMaterial.lapisAxe);
        registerItemModel(ModEmeraldMaterial.lapisHoe);
        registerItemModel(ModEmeraldMaterial.lapisPickaxe);
        registerItemModel(ModEmeraldMaterial.lapisSpade);

        registerItemModel(ModEmeraldMaterial.lapisStairs);
        registerItemModel(ModEmeraldMaterial.lapisWall);
//        registerItemFromBlock(ModEmeraldMaterial.lapisHalfSlab);
//
//        registerItemModel(ModEmeraldMaterial.lapisDoor);
//        registerItemFromBlock(ModEmeraldMaterial.lapisTrapdoor);


        registerItemModel(ModEmeraldMaterial.redstoneHelmet);
        registerItemModel(ModEmeraldMaterial.redstoneChest);
        registerItemModel(ModEmeraldMaterial.redstonePants);
        registerItemModel(ModEmeraldMaterial.redstoneBoots);
        
        registerItemModel(ModEmeraldMaterial.redstoneSword);
        registerItemModel(ModEmeraldMaterial.redstoneBroadsword);
        registerItemModel(ModEmeraldMaterial.redstoneBow);
        
        registerItemModel(ModEmeraldMaterial.redstoneAxe);
        registerItemModel(ModEmeraldMaterial.redstoneHoe);
        registerItemModel(ModEmeraldMaterial.redstonePickaxe);
        registerItemModel(ModEmeraldMaterial.redstoneSpade);

        registerItemModel(ModEmeraldMaterial.redstoneStairs);
        registerItemModel(ModEmeraldMaterial.redstoneWall);
//        registerItemFromBlock(ModEmeraldMaterial.redstoneHalfSlab);
//
//        registerItemModel(ModEmeraldMaterial.redstoneDoor);
//        registerItemFromBlock(ModEmeraldMaterial.redstoneTrapdoor);


        registerItemModel(ModEmeraldMaterial.goldBroadsword);
        registerItemModel(ModEmeraldMaterial.goldBow);

        registerItemModel(ModEmeraldMaterial.goldStairs);
        registerItemModel(ModEmeraldMaterial.goldWall);
//        registerItemFromBlock(ModEmeraldMaterial.goldHalfSlab);
//
//        registerItemModel(ModEmeraldMaterial.goldDoor);
//        registerItemFromBlock(ModEmeraldMaterial.goldTrapdoor);


        registerItemModel(ModEmeraldMaterial.ironBroadsword);
        registerItemModel(ModEmeraldMaterial.ironBow);

        registerItemModel(ModEmeraldMaterial.ironStairs);
        registerItemModel(ModEmeraldMaterial.ironWall);
//        registerItemFromBlock(ModEmeraldMaterial.ironHalfSlab);

        
        registerItemModel(ModEmeraldMaterial.diamondBroadsword);
        registerItemModel(ModEmeraldMaterial.diamondBow);

        registerItemModel(ModEmeraldMaterial.diamondStairs);
        registerItemModel(ModEmeraldMaterial.diamondWall);
        registerItemModel(ModEmeraldMaterial.diamondHalfSlab);

        registerItemModel(ModEmeraldMaterial.diamondDoor);
        registerItemModel(ModEmeraldMaterial.diamondTrapdoor);

        
        registerItemModel(ModEmeraldMaterial.diamondObsidianBlock);
        registerItemModel(ModEmeraldMaterial.diamondObsidianIngot);
        registerItemModel(ModEmeraldMaterial.diamondObsidianHelmet);
        registerItemModel(ModEmeraldMaterial.diamondObsidianChest);
        registerItemModel(ModEmeraldMaterial.diamondObsidianPants);
        registerItemModel(ModEmeraldMaterial.diamondObsidianBoots);
        
        registerItemModel(ModEmeraldMaterial.diamondObsidianSword);
        registerItemModel(ModEmeraldMaterial.diamondObsidianBroadsword);
        registerItemModel(ModEmeraldMaterial.diamondObsidianBow);
        
        registerItemModel(ModEmeraldMaterial.diamondObsidianAxe);
        registerItemModel(ModEmeraldMaterial.diamondObsidianHoe);
        registerItemModel(ModEmeraldMaterial.diamondObsidianPickaxe);
        registerItemModel(ModEmeraldMaterial.diamondObsidianSpade);

        registerItemModel(ModEmeraldMaterial.diamondObsidianStairs);
        registerItemModel(ModEmeraldMaterial.diamondObsidianWall);
//      registerItemFromBlock(ModEmeraldMaterial.diamondObsidianHalfSlab);
//
//      registerItemModel(ModEmeraldMaterial.diamondObsidianDoor);
//      registerItemFromBlock(ModEmeraldMaterial.diamondObsidianTrapdoor);


        MinecraftForge.EVENT_BUS.register(ModEmeraldMaterial.emeraldBow);

    }

    private void registerItemModel(Item item) {
        EMLogger.info("Registering item %s", item.getRegistryName());
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
            .register(item, 
                      0, 
                      new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    
    public void registerItemModel(Block block) {
        EMLogger.info("Registering block %s", block.getRegistryName());
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
    		.register(Item.getItemFromBlock(block), 
    		          0, 
    		          new ModelResourceLocation(block.getRegistryName(), "inventory"));
    	
    }
    
    public static String stripPrefix(String inString, String prefix) {
        return inString.replaceAll(prefix + ".", "");
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
