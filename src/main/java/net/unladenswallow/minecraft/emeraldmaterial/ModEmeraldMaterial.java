package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.util.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomBlock;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomDoor;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomDoubleSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomHalfSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomStairs;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomTrapDoor;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomWall;
import net.unladenswallow.minecraft.emeraldmaterial.block.ItemBlockCustomSlab;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomArmor;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomAxe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomBow;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomPickaxe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemEmeraldBow;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemGoldBow;


@Mod(modid = ModEmeraldMaterial.MODID, useMetadata = true, acceptedMinecraftVersions="[1.8,1.9)", acceptableRemoteVersions="[1.8,1.9)")
public class ModEmeraldMaterial {

	public static final String MODID = "mod_emeraldmaterial";
	
	@SidedProxy(clientSide="net.unladenswallow.minecraft.emeraldmaterial.ClientProxy", serverSide="net.unladenswallow.minecraft.emeraldmaterial.ServerProxy")
	public static CommonProxy proxy;
	
	public static Item emeraldHelmet;
	public static Item emeraldChest;
	public static Item emeraldPants;
	public static Item emeraldBoots;
	
	public static Item emeraldSword;
	public static Item emeraldBroadsword;
	public static Item emeraldBow;

	public static Item emeraldAxe;
	public static Item emeraldHoe;
	public static Item emeraldPickaxe;
	public static Item emeraldSpade;
	
	public static Block emeraldStairs;
	public static Block emeraldWall;
	public static BlockCustomHalfSlab emeraldHalfSlab;
	public static Block emeraldDoubleSlab;

	public static Item emeraldDoor;
	public static BlockCustomDoor emeraldDoorBlock;
	public static Block emeraldTrapdoor;
	
	public static Item emeraldHorseArmor;
	

	public static Item obsidianIngot;
	public static Item obsidianHelmet;
	public static Item obsidianChest;
	public static Item obsidianPants;
	public static Item obsidianBoots;

	public static Item obsidianSword;
	public static Item obsidianBroadsword;
	public static Item obsidianBow;

	public static Item obsidianAxe;
	public static Item obsidianHoe;
	public static Item obsidianPickaxe;
	public static Item obsidianSpade;

	public static Block obsidianStairs;
	public static BlockCustomHalfSlab obsidianHalfSlab;
	public static Block obsidianDoubleSlab;
	public static Block obsidianWall;

	public static BlockCustomDoor obsidianDoorBlock;
	public static Item obsidianDoor;
	public static Block obsidianTrapdoor;

	public static Block polishedObsidian;
	
	public static Item lapisHelmet;
	public static Item lapisChest;
	public static Item lapisPants;
	public static Item lapisBoots;
	
	public static Item lapisSword;
	public static Item lapisBroadsword;
	public static Item lapisBow;

	public static Item lapisAxe;
	public static Item lapisHoe;
	public static Item lapisPickaxe;
	public static Item lapisSpade;

	public static Block lapisStairs;
	public static BlockCustomHalfSlab lapisHalfSlab;
	public static Block lapisDoubleSlab;
	public static Block lapisWall;

	public static BlockCustomDoor lapisDoorBlock;
	public static Item lapisDoor;
	public static Block lapisTrapdoor;

	public static Item redstoneHelmet;
	public static Item redstoneChest;
	public static Item redstonePants;
	public static Item redstoneBoots;
	
	public static Item redstoneSword;
	public static Item redstoneBroadsword;
	public static Item redstoneBow;

	public static Item redstoneAxe;
	public static Item redstoneHoe;
	public static Item redstonePickaxe;
	public static Item redstoneSpade;

	public static Block redstoneStairs;
	public static BlockCustomHalfSlab redstoneHalfSlab;
	public static Block redstoneDoubleSlab;
	public static Block redstoneWall;

	public static BlockCustomDoor redstoneDoorBlock;
	public static Item redstoneDoor;
	public static Block redstoneTrapdoor;

	
	public static Item goldBroadsword;
	public static Item goldBow;
	
	public static Block goldStairs;
	public static BlockCustomHalfSlab goldHalfSlab;
	public static Block goldDoubleSlab;
	public static Block goldWall;

	public static BlockCustomDoor goldDoorBlock;
	public static Item goldDoor;
	public static Block goldTrapdoor;


	public static Item ironBroadsword;
	public static Item ironBow;

	public static Block ironStairs;
	public static Block ironWall;
	public static BlockCustomHalfSlab ironHalfSlab;
	public static Block ironDoubleSlab;

	
	public static Item diamondBroadsword;
	public static Item diamondBow;

	public static Block diamondStairs;
	public static Block diamondWall;
	public static BlockCustomHalfSlab diamondHalfSlab;
	public static Block diamondDoubleSlab;

	public static Item diamondDoor;
	public static BlockCustomDoor diamondDoorBlock;
	public static Block diamondTrapdoor;

	
	public static Block diamondObsidianBlock;
	public static Item diamondObsidianIngot;
	public static Item diamondObsidianHelmet;
	public static Item diamondObsidianChest;
	public static Item diamondObsidianPants;
	public static Item diamondObsidianBoots;

	public static Item diamondObsidianSword;
	public static Item diamondObsidianBroadsword;
	public static Item diamondObsidianBow;

	public static Item diamondObsidianAxe;
	public static Item diamondObsidianHoe;
	public static Item diamondObsidianPickaxe;
	public static Item diamondObsidianSpade;

	
	public static ModEmeraldMaterial instance = new ModEmeraldMaterial();

	public static EMEventHandler eventHandler = new EMEventHandler();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		ModEmeraldMaterial.proxy.preInit(preInitEvent);

		/* Items that are referenced by ItemMaterials must be defined before we use ItemMaterials */
		obsidianIngot = (new Item()).setUnlocalizedName("obsidianIngot").setCreativeTab(CreativeTabs.tabMaterials);
		diamondObsidianIngot = (new Item()).setUnlocalizedName("diamondObsidianIngot").setCreativeTab(CreativeTabs.tabMaterials);

		/* **************    Emerald Items and Blocks   ********************* */
		emeraldHelmet = new ItemCustomArmor("emeraldHelmet", 1, 0, ItemMaterials.emeraldArmorMaterial, Potion.moveSpeed);
		emeraldChest = new ItemCustomArmor("emeraldChest", 1, 1, ItemMaterials.emeraldArmorMaterial, Potion.moveSpeed);
		emeraldPants = new ItemCustomArmor("emeraldPants", 2, 2, ItemMaterials.emeraldArmorMaterial, Potion.moveSpeed);
		emeraldBoots = new ItemCustomArmor("emeraldBoots", 1, 3, ItemMaterials.emeraldArmorMaterial, Potion.moveSpeed);

		emeraldSword = (new ItemSword(ItemMaterials.emeraldToolMaterial)).setUnlocalizedName("emeraldSword");
		emeraldBroadsword = (new ItemSword(ItemMaterials.emeraldBroadswordMaterial)).setUnlocalizedName("emeraldBroadsword");
		emeraldBow = new ItemEmeraldBow();

		emeraldAxe = new ItemCustomAxe(ItemMaterials.emeraldToolMaterial, "emeraldAxe");
		(emeraldHoe = new ItemHoe(ItemMaterials.emeraldToolMaterial)).setUnlocalizedName("emeraldHoe"); // new ItemEmeraldHoe();
		emeraldPickaxe = new ItemCustomPickaxe(ItemMaterials.emeraldToolMaterial, "emeraldPickaxe");
		(emeraldSpade = new ItemSpade(ItemMaterials.emeraldToolMaterial)).setUnlocalizedName("emeraldSpade"); // new ItemEmeraldSpade();
		
		emeraldStairs = new BlockCustomStairs(Blocks.emerald_block, "emeraldStairs");
		emeraldWall = new BlockCustomWall(Blocks.emerald_block, "emeraldWall");
		emeraldHalfSlab = new BlockCustomHalfSlab(Blocks.emerald_block, "emeraldHalfSlab");
		emeraldDoubleSlab = new BlockCustomDoubleSlab(Blocks.emerald_block, emeraldHalfSlab, "emeraldDoubleSlab");

		emeraldDoorBlock = new BlockCustomDoor(Blocks.emerald_block, "emeraldDoor");
		(emeraldDoor = new ItemDoor(emeraldDoorBlock)).setUnlocalizedName("emeraldDoor");
		emeraldDoorBlock.setDropItem(emeraldDoor);
		emeraldTrapdoor = new BlockCustomTrapDoor(Blocks.emerald_block, "emeraldTrapdoor");

		(emeraldHorseArmor = new Item()).setUnlocalizedName("emeraldHorseArmor").setMaxStackSize(1).setCreativeTab(CreativeTabs.tabMisc);

		GameRegistry.registerItem(emeraldHelmet, "emerald_helmet");
		GameRegistry.registerItem(emeraldChest, "emerald_chest");
		GameRegistry.registerItem(emeraldPants, "emerald_pants");
		GameRegistry.registerItem(emeraldBoots, "emerald_boots");
		
		GameRegistry.registerItem(emeraldSword, "emerald_sword");
		GameRegistry.registerItem(emeraldBroadsword, "emerald_broadsword");
		GameRegistry.registerItem(emeraldBow, "emerald_bow");
		
		GameRegistry.registerItem(emeraldAxe, "emerald_axe");
		GameRegistry.registerItem(emeraldHoe, "emerald_hoe");
		GameRegistry.registerItem(emeraldPickaxe, "emerald_pickaxe");
		GameRegistry.registerItem(emeraldSpade, "emerald_spade");
		
		GameRegistry.registerBlock(emeraldStairs, "emerald_stairs");
		GameRegistry.registerBlock(emeraldWall, "emerald_wall");
		GameRegistry.registerBlock(emeraldHalfSlab, ItemBlockCustomSlab.class, "emerald_half_slab", emeraldHalfSlab, emeraldDoubleSlab);
		GameRegistry.registerBlock(emeraldDoubleSlab, ItemBlockCustomSlab.class, "emerald_double_slab", emeraldHalfSlab, emeraldDoubleSlab);

		GameRegistry.registerItem(emeraldDoor, "emerald_door");
		GameRegistry.registerBlock(emeraldDoorBlock, "emerald_door_block");
		GameRegistry.registerBlock(emeraldTrapdoor, "emerald_trapdoor");
		

		//		GameRegistry.registerItem(emeraldHorseArmor, "emerald_horse_armor");

		/* **************    Obsidian Items and Blocks   ********************* */
		obsidianHelmet = new ItemCustomArmor("obsidianHelmet", 1, 0, ItemMaterials.obsidianArmorMaterial, null);
		obsidianChest = new ItemCustomArmor("obsidianChest", 1, 1, ItemMaterials.obsidianArmorMaterial, null);
		obsidianPants = new ItemCustomArmor("obsidianPants", 2, 2, ItemMaterials.obsidianArmorMaterial, null);
		obsidianBoots = new ItemCustomArmor("obsidianBoots", 1, 3, ItemMaterials.obsidianArmorMaterial, null);

		obsidianAxe = new ItemCustomAxe(ItemMaterials.obsidianToolMaterial, "obsidianAxe");
		(obsidianHoe = new ItemHoe(ItemMaterials.obsidianToolMaterial)).setUnlocalizedName("obsidianHoe");
		obsidianPickaxe = new ItemCustomPickaxe(ItemMaterials.obsidianToolMaterial, "obsidianPickaxe");
		(obsidianSpade = new ItemSpade(ItemMaterials.obsidianToolMaterial)).setUnlocalizedName("obsidianSpade");

		obsidianSword = (new ItemSword(ItemMaterials.obsidianToolMaterial)).setUnlocalizedName("obsidianSword");
		obsidianBroadsword = (new ItemSword(ItemMaterials.obsidianBroadswordMaterial)).setUnlocalizedName("obsidianBroadsword");
		(obsidianBow = new ItemCustomBow("obsidianBow", "obsidian_bow")).setMaxDamage(600);
		
		obsidianStairs = new BlockCustomStairs(Blocks.obsidian, "obsidianStairs");
		obsidianWall = new BlockCustomWall(Blocks.obsidian, "obsidianWall");
		obsidianHalfSlab = new BlockCustomHalfSlab(Blocks.obsidian, "obsidianHalfSlab");
		obsidianDoubleSlab = new BlockCustomDoubleSlab(Blocks.obsidian, obsidianHalfSlab, "obsidianDoubleSlab");

		obsidianDoorBlock = new BlockCustomDoor(Blocks.obsidian, "obsidianDoor").setInteractive(true);
		(obsidianDoor = new ItemDoor(obsidianDoorBlock)).setUnlocalizedName("obsidianDoor");
		obsidianDoorBlock.setDropItem(obsidianDoor);
		obsidianTrapdoor = new BlockCustomTrapDoor(Blocks.obsidian, "obsidianTrapdoor");

		(polishedObsidian = new Block(Blocks.obsidian.getMaterial()))
		    .setUnlocalizedName("polishedObsidian")
		    .setCreativeTab(CreativeTabs.tabBlock)
		    .setHardness(ItemMaterials.getBlockHardness(Blocks.obsidian));
		
		GameRegistry.registerItem(obsidianIngot, "obsidian_ingot");
		GameRegistry.registerItem(obsidianHelmet, "obsidian_helmet");
		GameRegistry.registerItem(obsidianChest, "obsidian_chest");
		GameRegistry.registerItem(obsidianPants, "obsidian_pants");
		GameRegistry.registerItem(obsidianBoots, "obsidian_boots");
		
		GameRegistry.registerItem(obsidianSword, "obsidian_sword");
		GameRegistry.registerItem(obsidianBroadsword, "obsidian_broadsword");
		GameRegistry.registerItem(obsidianBow, "obsidian_bow");

		GameRegistry.registerItem(obsidianAxe, "obsidian_axe");
		GameRegistry.registerItem(obsidianHoe, "obsidian_hoe");
		GameRegistry.registerItem(obsidianPickaxe, "obsidian_pickaxe");
		GameRegistry.registerItem(obsidianSpade, "obsidian_spade");

		GameRegistry.registerBlock(obsidianStairs, "obsidian_stairs");
		GameRegistry.registerBlock(obsidianWall, "obsidian_wall");
		GameRegistry.registerBlock(obsidianHalfSlab, ItemBlockCustomSlab.class, "obsidian_half_slab", obsidianHalfSlab, obsidianDoubleSlab);
		GameRegistry.registerBlock(obsidianDoubleSlab, ItemBlockCustomSlab.class, "obsidian_double_slab", obsidianHalfSlab, obsidianDoubleSlab);

		GameRegistry.registerItem(obsidianDoor, "obsidian_door");
		GameRegistry.registerBlock(obsidianDoorBlock, "obsidian_door_block");
		GameRegistry.registerBlock(obsidianTrapdoor, "obsidian_trapdoor");
		
		GameRegistry.registerBlock(polishedObsidian, "polished_obsidian");

		
		/* **************    Lapis Items and Blocks   ********************* */
		lapisHelmet = new ItemCustomArmor("lapisHelmet", 1, 0, ItemMaterials.lapisArmorMaterial, Potion.waterBreathing);
		lapisChest = new ItemCustomArmor("lapisChest", 1, 1, ItemMaterials.lapisArmorMaterial, null);
		lapisPants = new ItemCustomArmor("lapisPants", 2, 2, ItemMaterials.lapisArmorMaterial, null);
		lapisBoots = new ItemCustomArmor("lapisBoots", 1, 3, ItemMaterials.lapisArmorMaterial, null);

		lapisAxe = new ItemCustomAxe(ItemMaterials.lapisToolMaterial, "lapisAxe");
		(lapisHoe = new ItemHoe(ItemMaterials.lapisToolMaterial)).setUnlocalizedName("lapisHoe");
		lapisPickaxe = new ItemCustomPickaxe(ItemMaterials.lapisToolMaterial, "lapisPickaxe");
		(lapisSpade = new ItemSpade(ItemMaterials.lapisToolMaterial)).setUnlocalizedName("lapisSpade");

		lapisSword = (new ItemSword(ItemMaterials.lapisToolMaterial)).setUnlocalizedName("lapisSword");
		lapisBroadsword = (new ItemSword(ItemMaterials.lapisBroadswordMaterial)).setUnlocalizedName("lapisBroadsword");
		(lapisBow = new ItemCustomBow("lapisBow", "lapis_bow")).setMaxDamage(200);
		
		lapisStairs = new BlockCustomStairs(Blocks.lapis_block, "lapisStairs");
		lapisWall = new BlockCustomWall(Blocks.lapis_block, "lapisWall");
		lapisHalfSlab = new BlockCustomHalfSlab(Blocks.lapis_block, "lapisHalfSlab");
		lapisDoubleSlab = new BlockCustomDoubleSlab(Blocks.lapis_block, lapisHalfSlab, "lapisDoubleSlab");

		lapisDoorBlock = new BlockCustomDoor(Blocks.lapis_block, "lapisDoor").setInteractive(true);
		(lapisDoor = new ItemDoor(lapisDoorBlock)).setUnlocalizedName("lapisDoor");
		lapisDoorBlock.setDropItem(lapisDoor);
		lapisTrapdoor = new BlockCustomTrapDoor(Blocks.lapis_block, "lapisTrapdoor");

		GameRegistry.registerItem(lapisHelmet, "lapis_helmet");
		GameRegistry.registerItem(lapisChest, "lapis_chest");
		GameRegistry.registerItem(lapisPants, "lapis_pants");
		GameRegistry.registerItem(lapisBoots, "lapis_boots");
		
		GameRegistry.registerItem(lapisSword, "lapis_sword");
		GameRegistry.registerItem(lapisBroadsword, "lapis_broadsword");
		GameRegistry.registerItem(lapisBow, "lapis_bow");

		GameRegistry.registerItem(lapisAxe, "lapis_axe");
		GameRegistry.registerItem(lapisHoe, "lapis_hoe");
		GameRegistry.registerItem(lapisPickaxe, "lapis_pickaxe");
		GameRegistry.registerItem(lapisSpade, "lapis_spade");

		GameRegistry.registerBlock(lapisStairs, "lapis_stairs");
		GameRegistry.registerBlock(lapisWall, "lapis_wall");
		GameRegistry.registerBlock(lapisHalfSlab, ItemBlockCustomSlab.class, "lapis_half_slab", lapisHalfSlab, lapisDoubleSlab);
		GameRegistry.registerBlock(lapisDoubleSlab, ItemBlockCustomSlab.class, "lapis_double_slab", lapisHalfSlab, lapisDoubleSlab);

		GameRegistry.registerItem(lapisDoor, "lapis_door");
		GameRegistry.registerBlock(lapisDoorBlock, "lapis_door_block");
		GameRegistry.registerBlock(lapisTrapdoor, "lapis_trapdoor");
		
		
		/* **************    Redstone Items and Blocks   ********************* */
		redstoneHelmet = new ItemCustomArmor("redstoneHelmet", 1, 0, ItemMaterials.redstoneArmorMaterial, Potion.nightVision);
		redstoneChest = new ItemCustomArmor("redstoneChest", 1, 1, ItemMaterials.redstoneArmorMaterial, null);
		redstonePants = new ItemCustomArmor("redstonePants", 2, 2, ItemMaterials.redstoneArmorMaterial, null);
		redstoneBoots = new ItemCustomArmor("redstoneBoots", 1, 3, ItemMaterials.redstoneArmorMaterial, null);

		redstoneAxe = new ItemCustomAxe(ItemMaterials.redstoneToolMaterial, "redstoneAxe");
		(redstoneHoe = new ItemHoe(ItemMaterials.redstoneToolMaterial)).setUnlocalizedName("redstoneHoe");
		redstonePickaxe = new ItemCustomPickaxe(ItemMaterials.redstoneToolMaterial, "redstonePickaxe");
		(redstoneSpade = new ItemSpade(ItemMaterials.redstoneToolMaterial)).setUnlocalizedName("redstoneSpade");

		redstoneSword = (new ItemSword(ItemMaterials.redstoneToolMaterial)).setUnlocalizedName("redstoneSword");
		redstoneBroadsword = (new ItemSword(ItemMaterials.redstoneBroadswordMaterial)).setUnlocalizedName("redstoneBroadsword");
		(redstoneBow = new ItemCustomBow("redstoneBow", "redstone_bow")).setMaxDamage(200);
		
		redstoneStairs = new BlockCustomStairs(Blocks.redstone_block, "redstoneStairs");
		redstoneWall = new BlockCustomWall(Blocks.redstone_block, "redstoneWall");
		redstoneHalfSlab = new BlockCustomHalfSlab(Blocks.redstone_block, "redstoneHalfSlab");
		redstoneDoubleSlab = new BlockCustomDoubleSlab(Blocks.redstone_block, redstoneHalfSlab, "redstoneDoubleSlab");

		redstoneDoorBlock = new BlockCustomDoor(Blocks.redstone_block, "redstoneDoor").setInteractive(true);
		(redstoneDoor = new ItemDoor(redstoneDoorBlock)).setUnlocalizedName("redstoneDoor");
		redstoneDoorBlock.setDropItem(redstoneDoor);
		redstoneTrapdoor = new BlockCustomTrapDoor(Blocks.redstone_block, "redstoneTrapdoor");

		GameRegistry.registerItem(redstoneHelmet, "redstone_helmet");
		GameRegistry.registerItem(redstoneChest, "redstone_chest");
		GameRegistry.registerItem(redstonePants, "redstone_pants");
		GameRegistry.registerItem(redstoneBoots, "redstone_boots");
		
		GameRegistry.registerItem(redstoneSword, "redstone_sword");
		GameRegistry.registerItem(redstoneBroadsword, "redstone_broadsword");
		GameRegistry.registerItem(redstoneBow, "redstone_bow");

		GameRegistry.registerItem(redstoneAxe, "redstone_axe");
		GameRegistry.registerItem(redstoneHoe, "redstone_hoe");
		GameRegistry.registerItem(redstonePickaxe, "redstone_pickaxe");
		GameRegistry.registerItem(redstoneSpade, "redstone_spade");

		GameRegistry.registerBlock(redstoneStairs, "redstone_stairs");
		GameRegistry.registerBlock(redstoneWall, "redstone_wall");
		GameRegistry.registerBlock(redstoneHalfSlab, ItemBlockCustomSlab.class, "redstone_half_slab", redstoneHalfSlab, redstoneDoubleSlab);
		GameRegistry.registerBlock(redstoneDoubleSlab, ItemBlockCustomSlab.class, "redstone_double_slab", redstoneHalfSlab, redstoneDoubleSlab);

		GameRegistry.registerItem(redstoneDoor, "redstone_door");
		GameRegistry.registerBlock(redstoneDoorBlock, "redstone_door_block");
		GameRegistry.registerBlock(redstoneTrapdoor, "redstone_trapdoor");
		
		
		/* **************    Gold Blocks   ********************* */
		goldBroadsword = (new ItemSword(ItemMaterials.goldBroadswordMaterial)).setUnlocalizedName("goldBroadsword");
		goldBow = new ItemGoldBow();

		goldStairs = new BlockCustomStairs(Blocks.gold_block, "goldStairs");
		goldWall = new BlockCustomWall(Blocks.gold_block, "goldWall");
		goldHalfSlab = new BlockCustomHalfSlab(Blocks.gold_block, "goldHalfSlab");
		goldDoubleSlab = new BlockCustomDoubleSlab(Blocks.gold_block, goldHalfSlab, "goldDoubleSlab");

		goldDoorBlock = new BlockCustomDoor(Blocks.gold_block, "goldDoor").setInteractive(true);
		(goldDoor = new ItemDoor(goldDoorBlock)).setUnlocalizedName("goldDoor");
		goldDoorBlock.setDropItem(goldDoor);
		goldTrapdoor = new BlockCustomTrapDoor(Blocks.gold_block, "goldTrapdoor");

		GameRegistry.registerItem(goldBroadsword, "gold_broadsword");
		GameRegistry.registerItem(goldBow, "gold_bow");

		GameRegistry.registerBlock(goldStairs, "gold_stairs");
		GameRegistry.registerBlock(goldWall, "gold_wall");
		GameRegistry.registerBlock(goldHalfSlab, ItemBlockCustomSlab.class, "gold_half_slab", goldHalfSlab, goldDoubleSlab);
		GameRegistry.registerBlock(goldDoubleSlab, ItemBlockCustomSlab.class, "gold_double_slab", goldHalfSlab, goldDoubleSlab);

		GameRegistry.registerItem(goldDoor, "gold_door");
		GameRegistry.registerBlock(goldDoorBlock, "gold_door_block");
		GameRegistry.registerBlock(goldTrapdoor, "gold_trapdoor");
		
		
		
		/* **************    Iron Blocks   ********************* */
		ironBroadsword = (new ItemSword(ItemMaterials.ironBroadswordMaterial)).setUnlocalizedName("ironBroadsword");
		(ironBow = new ItemCustomBow("ironBow", "iron_bow")).setMaxDamage(430);

		ironStairs = new BlockCustomStairs(Blocks.iron_block, "ironStairs");
		ironWall = new BlockCustomWall(Blocks.iron_block, "ironWall");
		ironHalfSlab = new BlockCustomHalfSlab(Blocks.iron_block, "ironHalfSlab");
		ironDoubleSlab = new BlockCustomDoubleSlab(Blocks.iron_block, ironHalfSlab, "ironDoubleSlab");

		GameRegistry.registerItem(ironBroadsword, "iron_broadsword");
		GameRegistry.registerItem(ironBow, "iron_bow");

		GameRegistry.registerBlock(ironStairs, "iron_stairs");
		GameRegistry.registerBlock(ironWall, "iron_wall");
		GameRegistry.registerBlock(ironHalfSlab, ItemBlockCustomSlab.class, "iron_half_slab", ironHalfSlab, ironDoubleSlab);
		GameRegistry.registerBlock(ironDoubleSlab, ItemBlockCustomSlab.class, "iron_double_slab", ironHalfSlab, ironDoubleSlab);

		
		/* **************    Diamond Blocks   ********************* */
		diamondBroadsword = (new ItemSword(ItemMaterials.diamondBroadswordMaterial)).setUnlocalizedName("diamondBroadsword");
		(diamondBow = new ItemCustomBow("diamondBow", "diamond_bow")).setMaxDamage(480);

		diamondStairs = new BlockCustomStairs(Blocks.diamond_block, "diamondStairs");
		diamondWall = new BlockCustomWall(Blocks.diamond_block, "diamondWall");
		diamondHalfSlab = new BlockCustomHalfSlab(Blocks.diamond_block, "diamondHalfSlab");
		diamondDoubleSlab = new BlockCustomDoubleSlab(Blocks.diamond_block, diamondHalfSlab, "diamondDoubleSlab");

		diamondDoorBlock = new BlockCustomDoor(Blocks.diamond_block, "diamondDoor");
		(diamondDoor = new ItemDoor(diamondDoorBlock)).setUnlocalizedName("diamondDoor");
		diamondDoorBlock.setDropItem(diamondDoor);
		diamondTrapdoor = new BlockCustomTrapDoor(Blocks.diamond_block, "diamondTrapdoor");

		GameRegistry.registerItem(diamondBroadsword, "diamond_broadsword");
		GameRegistry.registerItem(diamondBow, "diamond_bow");

		GameRegistry.registerBlock(diamondStairs, "diamond_stairs");
		GameRegistry.registerBlock(diamondWall, "diamond_wall");
		GameRegistry.registerBlock(diamondHalfSlab, ItemBlockCustomSlab.class, "diamond_half_slab", diamondHalfSlab, diamondDoubleSlab);
		GameRegistry.registerBlock(diamondDoubleSlab, ItemBlockCustomSlab.class, "diamond_double_slab", diamondHalfSlab, diamondDoubleSlab);

		GameRegistry.registerItem(diamondDoor, "diamond_door");
		GameRegistry.registerBlock(diamondDoorBlock, "diamond_door_block");
		GameRegistry.registerBlock(diamondTrapdoor, "diamond_trapdoor");

		
		/* **************    Diamond-Infused Obsidian Items and Blocks   ********************* */
		diamondObsidianBlock = (new BlockCustomBlock(Blocks.obsidian.getMaterial())).setUnlocalizedName("diamondObsidianBlock").setCreativeTab(CreativeTabs.tabBlock);
		diamondObsidianHelmet = new ItemCustomArmor("diamondObsidianHelmet", 1, 0, ItemMaterials.diamondObsidianArmorMaterial, null);
		diamondObsidianChest = new ItemCustomArmor("diamondObsidianChest", 1, 1, ItemMaterials.diamondObsidianArmorMaterial, null);
		diamondObsidianPants = new ItemCustomArmor("diamondObsidianPants", 2, 2, ItemMaterials.diamondObsidianArmorMaterial, null);
		diamondObsidianBoots = new ItemCustomArmor("diamondObsidianBoots", 1, 3, ItemMaterials.diamondObsidianArmorMaterial, null);

		diamondObsidianAxe = new ItemCustomAxe(ItemMaterials.diamondObsidianToolMaterial, "diamondObsidianAxe");
		(diamondObsidianHoe = new ItemHoe(ItemMaterials.diamondObsidianToolMaterial)).setUnlocalizedName("diamondObsidianHoe");
		diamondObsidianPickaxe = new ItemCustomPickaxe(ItemMaterials.diamondObsidianToolMaterial, "diamondObsidianPickaxe") {
			@Override
		    public float getStrVsBlock(ItemStack stack, Block block)
		    {
		        return block == Blocks.obsidian ? 16.0f : super.getStrVsBlock(stack, block);
		    }
		};
		(diamondObsidianSpade = new ItemSpade(ItemMaterials.diamondObsidianToolMaterial)).setUnlocalizedName("diamondObsidianSpade");

		diamondObsidianSword = (new ItemSword(ItemMaterials.diamondObsidianToolMaterial)).setUnlocalizedName("diamondObsidianSword");
		diamondObsidianBroadsword = (new ItemSword(ItemMaterials.diamondObsidianBroadswordMaterial)).setUnlocalizedName("diamondObsidianBroadsword");
		(diamondObsidianBow = new ItemCustomBow("diamondObsidianBow", "diamond-obsidian_bow")).setMaxDamage(600);

		GameRegistry.registerBlock(diamondObsidianBlock, "diamond-obsidian_block");
		GameRegistry.registerItem(diamondObsidianIngot, "diamond-obsidian_ingot");
		GameRegistry.registerItem(diamondObsidianHelmet, "diamond-obsidian_helmet");
		GameRegistry.registerItem(diamondObsidianChest, "diamond-obsidian_chest");
		GameRegistry.registerItem(diamondObsidianPants, "diamond-obsidian_pants");
		GameRegistry.registerItem(diamondObsidianBoots, "diamond-obsidian_boots");
		
		GameRegistry.registerItem(diamondObsidianSword, "diamond-obsidian_sword");
		GameRegistry.registerItem(diamondObsidianBroadsword, "diamond-obsidian_broadsword");
		GameRegistry.registerItem(diamondObsidianBow, "diamond-obsidian_bow");

		GameRegistry.registerItem(diamondObsidianAxe, "diamond-obsidian_axe");
		GameRegistry.registerItem(diamondObsidianHoe, "diamond-obsidian_hoe");
		GameRegistry.registerItem(diamondObsidianPickaxe, "diamond-obsidian_pickaxe");
		GameRegistry.registerItem(diamondObsidianSpade, "diamond-obsidian_spade");


		//		EntityRegistry.registerModEntity(EntityCustomHorse.class, "CustomHorse", ++nextModEntityId, MODID,
//					80, 3, false);
		
		MinecraftForge.EVENT_BUS.register(eventHandler);
		FMLCommonHandler.instance().bus().register(eventHandler);
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event) {
		ModEmeraldMaterial.proxy.init(event);
		EMLogger.info("Initializing " + ModEmeraldMaterial.MODID);
		addRecipes();
		addSmelting();
	}
	
	private void addRecipes() {
		addArmorRecipes(Items.emerald, emeraldHelmet, emeraldChest, emeraldPants, emeraldBoots);
		addToolRecipes(Items.emerald, emeraldAxe, emeraldHoe, emeraldPickaxe, emeraldSpade);
		addWeaponRecipes(Items.emerald, emeraldSword, emeraldBroadsword, emeraldBow);
		addBlockRecipes(Blocks.emerald_block, emeraldStairs, emeraldWall, emeraldHalfSlab);
		addMiscRecipes(Items.emerald, emeraldDoor);
		
		addArmorRecipes(obsidianIngot, obsidianHelmet, obsidianChest, obsidianPants, obsidianBoots);
		addToolRecipes(obsidianIngot, obsidianAxe, obsidianHoe, obsidianPickaxe, obsidianSpade);
		addWeaponRecipes(obsidianIngot, obsidianSword, obsidianBroadsword, obsidianBow);
		addBlockRecipes(Blocks.obsidian, obsidianStairs, obsidianWall, obsidianHalfSlab);
		addMiscRecipes(obsidianIngot, obsidianDoor);
		
		ItemStack lapis = new ItemStack(Items.dye, 1, 4);
		addArmorRecipes(lapis, lapisHelmet, lapisChest, lapisPants, lapisBoots);
		addToolRecipes(lapis, lapisAxe, lapisHoe, lapisPickaxe, lapisSpade);
		addWeaponRecipes(lapis, lapisSword, lapisBroadsword, lapisBow);
		addBlockRecipes(Blocks.lapis_block, lapisStairs, lapisWall, lapisHalfSlab);
		addMiscRecipes(lapis, lapisDoor);

		addArmorRecipes(Items.redstone, redstoneHelmet, redstoneChest, redstonePants, redstoneBoots);
		addToolRecipes(Items.redstone, redstoneAxe, redstoneHoe, redstonePickaxe, redstoneSpade);
		addWeaponRecipes(Items.redstone, redstoneSword, redstoneBroadsword, redstoneBow);
		addBlockRecipes(Blocks.redstone_block, redstoneStairs, redstoneWall, redstoneHalfSlab);
		addMiscRecipes(Items.redstone, redstoneDoor);

		addWeaponRecipes(Items.iron_ingot, null, ironBroadsword, ironBow);

		addWeaponRecipes(Items.diamond, null, diamondBroadsword, diamondBow);

		addArmorRecipes(diamondObsidianIngot, diamondObsidianHelmet, diamondObsidianChest, diamondObsidianPants, diamondObsidianBoots);
		addToolRecipes(diamondObsidianIngot, diamondObsidianAxe, diamondObsidianHoe, diamondObsidianPickaxe, diamondObsidianSpade);
		addWeaponRecipes(diamondObsidianIngot, diamondObsidianSword, diamondObsidianBroadsword, diamondObsidianBow);
		
		GameRegistry.addShapelessRecipe(new ItemStack(diamondObsidianBlock), Blocks.obsidian, Items.diamond, Items.quartz);
		
	}
	
	private void addMiscRecipes(Item recipeItem, Item door) {
		addMiscRecipes(new ItemStack(recipeItem), door);
	}
	private void addMiscRecipes(Block recipeBlock, Item door) {
		addMiscRecipes(new ItemStack(recipeBlock), door);
	}
	private void addMiscRecipes(ItemStack recipeItemStack, Item door) {
		if (door != null) {
			GameRegistry.addRecipe(new ItemStack(door, 3),
					" AA",
					" AA",
					" AA",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(door, 3),
					"AA ",
					"AA ",
					"AA ",
					'A', recipeItemStack);
		}
	}

	private void addBlockRecipes(Item recipeItem, Block stairs, Block wall, Block halfSlab) {
		addBlockRecipes(new ItemStack(recipeItem), stairs, wall, halfSlab);
	}
	private void addBlockRecipes(Block recipeBlock, Block stairs, Block wall, Block halfSlab) {
		addBlockRecipes(new ItemStack(recipeBlock), stairs, wall, halfSlab);
	}
	private void addBlockRecipes(ItemStack recipeItemStack, Block stairs, Block wall, Block halfSlab) {
		if (halfSlab != null) {
			GameRegistry.addRecipe(new ItemStack(halfSlab, 6),
					"AAA",
					"   ",
					"   ",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(halfSlab, 6),
					"   ",
					"AAA",
					"   ",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(halfSlab, 6),
					"   ",
					"   ",
					"AAA",
					'A', recipeItemStack);
		}
		if (stairs != null) {
			GameRegistry.addRecipe(new ItemStack(stairs, 4),
					"A  ",
					"AA ",
					"AAA",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(stairs, 4),
					"  A",
					" AA",
					"AAA",
					'A', recipeItemStack);
		}
		if (wall != null) {
			GameRegistry.addRecipe(new ItemStack(wall, 6),
					"   ",
					"AAA",
					"AAA",
					'A', recipeItemStack);
			GameRegistry.addRecipe(new ItemStack(wall, 6),
					"AAA",
					"AAA",
					"   ",
					'A', recipeItemStack);
		}
	}

	private void addWeaponRecipes(Item recipeItem, Item sword, Item broadsword, Item bow) {
		addWeaponRecipes(new ItemStack(recipeItem), sword, broadsword, bow);
	}
	private void addWeaponRecipes(Block recipeBlock, Item sword, Item broadsword, Item bow) {
		addWeaponRecipes(new ItemStack(recipeBlock), sword, broadsword, bow);
	}
	private void addWeaponRecipes(ItemStack recipeItemStack, Item sword, Item broadsword, Item bow) {
		if (sword != null) {
			GameRegistry.addRecipe(new ItemStack(sword),
					" A ",
					" A ",
					" S ",
					'A', recipeItemStack,
					'S', Items.stick);
		}
		if (broadsword != null) {
			GameRegistry.addRecipe(new ItemStack(broadsword),
					"AAA",
					"AAA",
					" S ",
					'A', recipeItemStack,
					'S', Items.stick);
		}
		if (bow != null) {
			GameRegistry.addRecipe(new ItemStack(bow),
					"IS ",
					"I A",
					"IS ",
					'A', recipeItemStack,
					'S', Items.stick,
					'I', Items.string);
			GameRegistry.addRecipe(new ItemStack(bow),
					" SI",
					"A I",
					" SI",
					'A', recipeItemStack,
					'S', Items.stick,
					'I', Items.string);
		}
	}

	private void addToolRecipes(Item recipeItem, Item axe, Item hoe, Item pickaxe, Item spade) {
		addToolRecipes(new ItemStack(recipeItem), axe, hoe, pickaxe, spade);
	}
	private void addToolRecipes(Block recipeBlock, Item axe, Item hoe, Item pickaxe, Item spade) {
		addToolRecipes(new ItemStack(recipeBlock), axe, hoe, pickaxe, spade);
	}
	private void addToolRecipes(ItemStack recipeItemStack, Item axe, Item hoe, Item pickaxe, Item spade) {
		if (axe != null) {
			GameRegistry.addRecipe(new ItemStack(axe),
					"AA ",
					"AS ",
					" S ",
					'A', recipeItemStack,
					'S', Items.stick);
			GameRegistry.addRecipe(new ItemStack(axe),
					" AA",
					" SA",
					" S ",
					'A', recipeItemStack,
					'S', Items.stick);
		}
		if (hoe != null) {
			GameRegistry.addRecipe(new ItemStack(hoe),
					"AA ",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.stick);
			GameRegistry.addRecipe(new ItemStack(hoe),
					" AA",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.stick);
		}
		if (pickaxe != null) {
			GameRegistry.addRecipe(new ItemStack(pickaxe),
					"AAA",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.stick);
		}
		if (spade != null) {
			GameRegistry.addRecipe(new ItemStack(spade),
					" A ",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.stick);
		}
	}

	private void addArmorRecipes(Item recipeItem, Item helmet, Item chest, Item pants, Item boots) {
		addArmorRecipes(new ItemStack(recipeItem), helmet, chest, pants, boots);
	}
	private void addArmorRecipes(Block recipeBlock, Item helmet, Item chest, Item pants, Item boots) {
		addArmorRecipes(new ItemStack(recipeBlock), helmet, chest, pants, boots);
	}
	private void addArmorRecipes(ItemStack recipeItemStack, Item helmet, Item chest, Item pants, Item boots) {
		if (helmet != null) {
			GameRegistry.addRecipe(new ItemStack(helmet),
					"AAA",
					"A A",
					"   ",
					'A', recipeItemStack);
		}
		if (chest != null) {
			GameRegistry.addRecipe(new ItemStack(chest),
					"A A",
					"AAA",
					"AAA",
					'A', recipeItemStack);
		}
		if (pants != null) {
			GameRegistry.addRecipe(new ItemStack(pants),
					"AAA",
					"A A",
					"A A",
					'A', recipeItemStack);
		}
		if (boots != null) {
			GameRegistry.addRecipe(new ItemStack(boots),
					"   ",
					"A A",
					"A A",
					'A', recipeItemStack);
		}
	}

	private void addSmelting() {
		GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(obsidianIngot), 1.2f);
		GameRegistry.addSmelting(diamondObsidianBlock, new ItemStack(diamondObsidianIngot), 1.5f);
	}

}
