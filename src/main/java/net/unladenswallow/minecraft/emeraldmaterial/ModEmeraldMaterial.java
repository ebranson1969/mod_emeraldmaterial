package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomBlock;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomDoor;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomDoubleSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomHalfSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomStairs;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomTrapDoor;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomWall;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomArmor;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomAxe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomBow;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomHoe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomPickaxe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomSpade;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemEmeraldBow;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemGoldBow;


@Mod(modid = ModEmeraldMaterial.MODID, useMetadata = true, acceptedMinecraftVersions="[1.12,1.13)", acceptableRemoteVersions="1.12,1.13)")
public class ModEmeraldMaterial {

	public static final String MODID = "mod_emeraldmaterial";
	public static final String RECIPE_GROUP_NAME = "mOre Materials";
	
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
	
	public static BlockCustomStairs emeraldStairs;
	public static BlockCustomWall emeraldWall;
	public static BlockCustomHalfSlab emeraldHalfSlab;
	public static BlockCustomDoubleSlab emeraldDoubleSlab;

	public static Item emeraldDoor;
	public static BlockCustomDoor emeraldDoorBlock;
	public static BlockCustomTrapDoor emeraldTrapdoor;
	

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

	public static BlockCustomStairs obsidianStairs;
	public static BlockCustomHalfSlab obsidianHalfSlab;
	public static BlockCustomDoubleSlab obsidianDoubleSlab;
	public static BlockCustomWall obsidianWall;

	public static BlockCustomDoor obsidianDoorBlock;
	public static Item obsidianDoor;
	public static BlockCustomTrapDoor obsidianTrapdoor;

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

	public static BlockCustomStairs lapisStairs;
	public static BlockCustomHalfSlab lapisHalfSlab;
	public static BlockCustomDoubleSlab lapisDoubleSlab;
	public static BlockCustomWall lapisWall;

	public static BlockCustomDoor lapisDoorBlock;
	public static Item lapisDoor;
	public static BlockCustomTrapDoor lapisTrapdoor;

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

	public static BlockCustomStairs redstoneStairs;
	public static BlockCustomHalfSlab redstoneHalfSlab;
	public static BlockCustomDoubleSlab redstoneDoubleSlab;
	public static BlockCustomWall redstoneWall;

	public static BlockCustomDoor redstoneDoorBlock;
	public static Item redstoneDoor;
	public static BlockCustomTrapDoor redstoneTrapdoor;

	
	public static Item goldBroadsword;
	public static Item goldBow;
	
	public static BlockCustomStairs goldStairs;
	public static BlockCustomHalfSlab goldHalfSlab;
	public static BlockCustomDoubleSlab goldDoubleSlab;
	public static BlockCustomWall goldWall;

	public static BlockCustomDoor goldDoorBlock;
	public static Item goldDoor;
	public static BlockCustomTrapDoor goldTrapdoor;


	public static Item ironBroadsword;
	public static Item ironBow;

	public static BlockCustomStairs ironStairs;
	public static BlockCustomWall ironWall;
	public static BlockCustomHalfSlab ironHalfSlab;
	public static BlockCustomDoubleSlab ironDoubleSlab;

	
	public static Item diamondBroadsword;
	public static Item diamondBow;

	public static BlockCustomStairs diamondStairs;
	public static BlockCustomWall diamondWall;
	public static BlockCustomHalfSlab diamondHalfSlab;
	public static BlockCustomDoubleSlab diamondDoubleSlab;

	public static Item diamondDoor;
	public static BlockCustomDoor diamondDoorBlock;
	public static BlockCustomTrapDoor diamondTrapdoor;

	
	public static BlockCustomBlock diamondObsidianBlock;
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

    public static BlockCustomStairs diamondObsidianStairs;
    public static BlockCustomWall diamondObsidianWall;
    public static BlockCustomHalfSlab diamondObsidianHalfSlab;
    public static BlockCustomDoubleSlab diamondObsidianDoubleSlab;

    public static Item diamondObsidianDoor;
    public static BlockCustomDoor diamondObsidianDoorBlock;
    public static BlockCustomTrapDoor diamondObsidianTrapdoor;

    
	public static ModEmeraldMaterial instance = new ModEmeraldMaterial();

	public static EMEventHandler eventHandler = new EMEventHandler();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
        MinecraftForge.EVENT_BUS.register(this);
		ModEmeraldMaterial.proxy.preInit(preInitEvent);

		/* Items that are referenced by ItemMaterials must be defined before we use ItemMaterials */
		obsidianIngot = (new Item())
		        .setUnlocalizedName("obsidian_ingot")
		        .setRegistryName("obsidian_ingot")
		        .setCreativeTab(CreativeTabs.MATERIALS);
		diamondObsidianIngot = (new Item())
		        .setUnlocalizedName("diamond-obsidian_ingot")
		        .setRegistryName("diamond-obsidian_ingot")
		        .setCreativeTab(CreativeTabs.MATERIALS);

		/* **************    Emerald Items and Blocks   ********************* */
		emeraldHelmet = new ItemCustomArmor("emerald_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.emeraldArmorMaterial, null);
		emeraldChest = new ItemCustomArmor("emerald_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.emeraldArmorMaterial, null);
		emeraldPants = new ItemCustomArmor("emerald_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.emeraldArmorMaterial, null);
		emeraldBoots = new ItemCustomArmor("emerald_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.emeraldArmorMaterial, null);
		((ItemCustomArmor)emeraldHelmet).addFullSetEffect(MobEffects.SPEED);
        ((ItemCustomArmor)emeraldHelmet).addFullSetEffect(MobEffects.HASTE);

		emeraldSword = (new ItemSword(ItemMaterials.emeraldToolMaterial))
		        .setUnlocalizedName("emerald_sword")
		        .setRegistryName("emerald_sword");
		emeraldBroadsword = (new ItemSword(ItemMaterials.emeraldBroadswordMaterial))
		        .setUnlocalizedName("emerald_broadsword")
		        .setRegistryName("emerald_broadsword");
		emeraldBow = new ItemEmeraldBow();

		emeraldAxe = new ItemCustomAxe(ItemMaterials.emeraldToolMaterial, "emerald_axe");
		emeraldHoe = new ItemCustomHoe(ItemMaterials.emeraldToolMaterial, "emerald_hoe");
		emeraldPickaxe = new ItemCustomPickaxe(ItemMaterials.emeraldToolMaterial, "emerald_pickaxe");
		emeraldSpade = new ItemCustomSpade(ItemMaterials.emeraldToolMaterial, "emerald_spade");
		
		emeraldStairs = new BlockCustomStairs(Blocks.EMERALD_BLOCK, "emerald_stairs");
		emeraldWall = new BlockCustomWall(Blocks.EMERALD_BLOCK, "emerald_wall");
		emeraldHalfSlab = new BlockCustomHalfSlab(Blocks.EMERALD_BLOCK, "emerald_half_slab");
		emeraldDoubleSlab = new BlockCustomDoubleSlab(Blocks.EMERALD_BLOCK, emeraldHalfSlab, "emerald_double_slab");

		emeraldDoorBlock = new BlockCustomDoor(Blocks.EMERALD_BLOCK, "emerald_door");
		(emeraldDoor = new ItemDoor(emeraldDoorBlock))
		    .setUnlocalizedName("emerald_door")
		    .setRegistryName("emerald_door");
		emeraldDoorBlock.setDropItem(emeraldDoor);
		emeraldTrapdoor = new BlockCustomTrapDoor(Blocks.EMERALD_BLOCK, "emerald_trapdoor");

		

		//		GameRegistry.register(emeraldHorseArmor, "emerald_horse_armor");

		/* **************    Obsidian Items and Blocks   ********************* */
		obsidianHelmet = new ItemCustomArmor("obsidian_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.obsidianArmorMaterial, null);
		obsidianChest = new ItemCustomArmor("obsidian_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.obsidianArmorMaterial, null);
		obsidianPants = new ItemCustomArmor("obsidian_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.obsidianArmorMaterial, null);
		obsidianBoots = new ItemCustomArmor("obsidian_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.obsidianArmorMaterial, null);

		obsidianAxe = new ItemCustomAxe(ItemMaterials.obsidianToolMaterial, "obsidian_axe");
		obsidianHoe = new ItemCustomHoe(ItemMaterials.obsidianToolMaterial, "obsidian_hoe");
		obsidianPickaxe = new ItemCustomPickaxe(ItemMaterials.obsidianToolMaterial, "obsidian_pickaxe");
		obsidianSpade = new ItemCustomSpade(ItemMaterials.obsidianToolMaterial, "obsidian_spade");

		obsidianSword = (new ItemSword(ItemMaterials.obsidianToolMaterial))
		    .setUnlocalizedName("obsidian_sword")
		    .setRegistryName("obsidian_sword");
		obsidianBroadsword = (new ItemSword(ItemMaterials.obsidianBroadswordMaterial))
		    .setUnlocalizedName("obsidian_broadsword")
		    .setRegistryName("obsidian_broadsword");
		(obsidianBow = new ItemCustomBow("obsidian_bow")).setMaxDamage(600);
		
		obsidianStairs = new BlockCustomStairs(Blocks.OBSIDIAN, "obsidian_stairs");
		obsidianWall = new BlockCustomWall(Blocks.OBSIDIAN, "obsidian_wall");
		obsidianHalfSlab = new BlockCustomHalfSlab(Blocks.OBSIDIAN, "obsidian_half_slab");
		obsidianDoubleSlab = new BlockCustomDoubleSlab(Blocks.OBSIDIAN, obsidianHalfSlab, "obsidian_double_slab");

		obsidianDoorBlock = new BlockCustomDoor(Blocks.OBSIDIAN, "obsidian_door").setInteractive(true);
		(obsidianDoor = new ItemDoor(obsidianDoorBlock))
		    .setUnlocalizedName("obsidian_door")
		    .setRegistryName("obsidian_door");
		obsidianDoorBlock.setDropItem(obsidianDoor);
		obsidianTrapdoor = new BlockCustomTrapDoor(Blocks.OBSIDIAN, "obsidian_trapdoor");

		(polishedObsidian = new Block(Blocks.OBSIDIAN.getDefaultState().getMaterial()))
		    .setUnlocalizedName("polished_obsidian")
		    .setRegistryName("polished_obsidian")
		    .setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
		    .setHardness(ItemMaterials.getBlockHardness(Blocks.OBSIDIAN));
		

		
		/* **************    Lapis Items and Blocks   ********************* */
		lapisHelmet = new ItemCustomArmor("lapis_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.lapisArmorMaterial, null);
		lapisChest = new ItemCustomArmor("lapis_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.lapisArmorMaterial, null);
		lapisPants = new ItemCustomArmor("lapis_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.lapisArmorMaterial, null);
		lapisBoots = new ItemCustomArmor("lapis_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.lapisArmorMaterial, null);
        ((ItemCustomArmor)lapisHelmet).addFullSetEffect(MobEffects.WATER_BREATHING);
        ((ItemCustomArmor)lapisHelmet).addFullSetEffect(MobEffects.LUCK);

		lapisAxe = new ItemCustomAxe(ItemMaterials.lapisToolMaterial, "lapis_axe");
		lapisHoe = new ItemCustomHoe(ItemMaterials.lapisToolMaterial, "lapis_hoe");
		lapisPickaxe = new ItemCustomPickaxe(ItemMaterials.lapisToolMaterial, "lapis_pickaxe");
		lapisSpade = new ItemCustomSpade(ItemMaterials.lapisToolMaterial, "lapis_spade");

		lapisSword = (new ItemSword(ItemMaterials.lapisToolMaterial))
		        .setUnlocalizedName("lapis_sword")
		        .setRegistryName("lapis_sword");
		lapisBroadsword = (new ItemSword(ItemMaterials.lapisBroadswordMaterial))
		        .setUnlocalizedName("lapis_broadsword")
		        .setRegistryName("lapis_broadsword");
		(lapisBow = new ItemCustomBow("lapis_bow")).setMaxDamage(200);
		
		lapisStairs = new BlockCustomStairs(Blocks.LAPIS_BLOCK, "lapis_stairs");
		lapisWall = new BlockCustomWall(Blocks.LAPIS_BLOCK, "lapis_wall");
		lapisHalfSlab = new BlockCustomHalfSlab(Blocks.LAPIS_BLOCK, "lapis_half_slab");
		lapisDoubleSlab = new BlockCustomDoubleSlab(Blocks.LAPIS_BLOCK, lapisHalfSlab, "lapis_double_slab");

		lapisDoorBlock = new BlockCustomDoor(Blocks.LAPIS_BLOCK, "lapis_door").setInteractive(true);
		(lapisDoor = new ItemDoor(lapisDoorBlock))
		    .setUnlocalizedName("lapis_door")
		    .setRegistryName("lapis_door");
		lapisDoorBlock.setDropItem(lapisDoor);
		lapisTrapdoor = new BlockCustomTrapDoor(Blocks.LAPIS_BLOCK, "lapis_trapdoor");

		
		/* **************    Redstone Items and Blocks   ********************* */
		redstoneHelmet = new ItemCustomArmor("redstone_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.redstoneArmorMaterial, null);
		redstoneChest = new ItemCustomArmor("redstone_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.redstoneArmorMaterial, null);
		redstonePants = new ItemCustomArmor("redstone_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.redstoneArmorMaterial, null);
		redstoneBoots = new ItemCustomArmor("redstone_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.redstoneArmorMaterial, null);
        ((ItemCustomArmor)redstoneHelmet).addFullSetEffect(MobEffects.NIGHT_VISION);

		redstoneAxe = new ItemCustomAxe(ItemMaterials.redstoneToolMaterial, "redstone_axe");
		redstoneHoe = new ItemCustomHoe(ItemMaterials.redstoneToolMaterial, "redstone_hoe");
		redstonePickaxe = new ItemCustomPickaxe(ItemMaterials.redstoneToolMaterial, "redstone_pickaxe");
		redstoneSpade = new ItemCustomSpade(ItemMaterials.redstoneToolMaterial, "redstone_spade");

		redstoneSword = (new ItemSword(ItemMaterials.redstoneToolMaterial))
		        .setUnlocalizedName("redstone_sword")
		        .setRegistryName("redstone_sword");
		redstoneBroadsword = (new ItemSword(ItemMaterials.redstoneBroadswordMaterial))
		        .setUnlocalizedName("redstone_broadsword")
		        .setRegistryName("redstone_broadsword");
		(redstoneBow = new ItemCustomBow("redstone_bow")).setMaxDamage(200);
		
		redstoneStairs = new BlockCustomStairs(Blocks.REDSTONE_BLOCK, "redstone_stairs");
		redstoneWall = new BlockCustomWall(Blocks.REDSTONE_BLOCK, "redstone_wall");
		redstoneHalfSlab = new BlockCustomHalfSlab(Blocks.REDSTONE_BLOCK, "redstone_half_slab");
		redstoneDoubleSlab = new BlockCustomDoubleSlab(Blocks.REDSTONE_BLOCK, redstoneHalfSlab, "redstone_double_slab");

		redstoneDoorBlock = new BlockCustomDoor(Blocks.REDSTONE_BLOCK, "redstone_door").setInteractive(true);
		(redstoneDoor = new ItemDoor(redstoneDoorBlock))
		    .setUnlocalizedName("redstone_door")
		    .setRegistryName("redstone_door");
		redstoneDoorBlock.setDropItem(redstoneDoor);
		redstoneTrapdoor = new BlockCustomTrapDoor(Blocks.REDSTONE_BLOCK, "redstone_trapdoor");

		
		/* **************    Gold Blocks   ********************* */
		goldBroadsword = (new ItemSword(ItemMaterials.goldBroadswordMaterial))
		        .setUnlocalizedName("gold_broadsword")
		        .setRegistryName("gold_broadsword");
		goldBow = new ItemGoldBow();

		goldStairs = new BlockCustomStairs(Blocks.GOLD_BLOCK, "gold_stairs");
		goldWall = new BlockCustomWall(Blocks.GOLD_BLOCK, "gold_wall");
		goldHalfSlab = new BlockCustomHalfSlab(Blocks.GOLD_BLOCK, "gold_half_slab");
		goldDoubleSlab = new BlockCustomDoubleSlab(Blocks.GOLD_BLOCK, goldHalfSlab, "gold_double_slab");

		goldDoorBlock = new BlockCustomDoor(Blocks.GOLD_BLOCK, "gold_door").setInteractive(true);
		(goldDoor = new ItemDoor(goldDoorBlock))
		    .setUnlocalizedName("gold_door")
		    .setRegistryName("gold_door");
		goldDoorBlock.setDropItem(goldDoor);
		goldTrapdoor = new BlockCustomTrapDoor(Blocks.GOLD_BLOCK, "gold_trapdoor");

		
		
		/* **************    Iron Blocks   ********************* */
		ironBroadsword = (new ItemSword(ItemMaterials.ironBroadswordMaterial))
		        .setUnlocalizedName("iron_broadsword")
		        .setRegistryName("iron_broadsword");
		(ironBow = new ItemCustomBow("iron_bow")).setMaxDamage(430);

		ironStairs = new BlockCustomStairs(Blocks.IRON_BLOCK, "iron_stairs");
		ironWall = new BlockCustomWall(Blocks.IRON_BLOCK, "iron_wall");
		ironHalfSlab = new BlockCustomHalfSlab(Blocks.IRON_BLOCK, "iron_half_slab");
		ironDoubleSlab = new BlockCustomDoubleSlab(Blocks.IRON_BLOCK, ironHalfSlab, "iron_double_slab");

		
		/* **************    Diamond Blocks   ********************* */
		diamondBroadsword = (new ItemSword(ItemMaterials.diamondBroadswordMaterial))
		        .setUnlocalizedName("diamond_broadsword")
		        .setRegistryName("diamond_broadsword");
		(diamondBow = new ItemCustomBow("diamond_bow")).setMaxDamage(480);

		diamondStairs = new BlockCustomStairs(Blocks.DIAMOND_BLOCK, "diamond_stairs");
		diamondWall = new BlockCustomWall(Blocks.DIAMOND_BLOCK, "diamond_wall");
		diamondHalfSlab = new BlockCustomHalfSlab(Blocks.DIAMOND_BLOCK, "diamond_half_slab");
		diamondDoubleSlab = new BlockCustomDoubleSlab(Blocks.DIAMOND_BLOCK, diamondHalfSlab, "diamond_double_slab");

		diamondDoorBlock = new BlockCustomDoor(Blocks.DIAMOND_BLOCK, "diamond_door");
		(diamondDoor = new ItemDoor(diamondDoorBlock))
		    .setUnlocalizedName("diamond_door")
		    .setRegistryName("diamond_door");
		diamondDoorBlock.setDropItem(diamondDoor);
		diamondTrapdoor = new BlockCustomTrapDoor(Blocks.DIAMOND_BLOCK, "diamond_trapdoor");

		
		/* **************    Diamond-Infused Obsidian Items and Blocks   ********************* */
		diamondObsidianBlock = new BlockCustomBlock(Blocks.OBSIDIAN.getDefaultState().getMaterial(), 
		                                            "diamond-obsidian_block", 
		                                            ItemMaterials.getBlockHardness(Blocks.OBSIDIAN), 
		                                            ItemMaterials.guessResistance(Blocks.OBSIDIAN));
		diamondObsidianHelmet = new ItemCustomArmor("diamond-obsidian_helmet", 1, EntityEquipmentSlot.HEAD, ItemMaterials.diamondObsidianArmorMaterial, null);
		diamondObsidianChest = new ItemCustomArmor("diamond-obsidian_chest", 1, EntityEquipmentSlot.CHEST, ItemMaterials.diamondObsidianArmorMaterial, null);
		diamondObsidianPants = new ItemCustomArmor("diamond-obsidian_pants", 2, EntityEquipmentSlot.LEGS, ItemMaterials.diamondObsidianArmorMaterial, null);
		diamondObsidianBoots = new ItemCustomArmor("diamond-obsidian_boots", 1, EntityEquipmentSlot.FEET, ItemMaterials.diamondObsidianArmorMaterial, null);

		diamondObsidianAxe = new ItemCustomAxe(ItemMaterials.diamondObsidianToolMaterial, "diamond-obsidian_axe");
		diamondObsidianHoe = new ItemCustomHoe(ItemMaterials.diamondObsidianToolMaterial, "diamond-obsidian_hoe");
		diamondObsidianPickaxe = new ItemCustomPickaxe(ItemMaterials.diamondObsidianToolMaterial, "diamond-obsidian_pickaxe") {
			@Override
		    public float getStrVsBlock(ItemStack stack, IBlockState blockstate)
		    {
		        return blockstate.getBlock() == Blocks.OBSIDIAN ? 16.0f : super.getStrVsBlock(stack, blockstate);
		    }
		};
		diamondObsidianSpade = new ItemCustomSpade(ItemMaterials.diamondObsidianToolMaterial, "diamond-obsidian_spade");

		diamondObsidianSword = (new ItemSword(ItemMaterials.diamondObsidianToolMaterial))
		        .setUnlocalizedName("diamond-obsidian_sword")
		        .setRegistryName("diamond-obsidian_sword");
		diamondObsidianBroadsword = (new ItemSword(ItemMaterials.diamondObsidianBroadswordMaterial))
		        .setUnlocalizedName("diamond-obsidian_broadsword")
		        .setRegistryName("diamond-obsidian_broadsword");
		(diamondObsidianBow = new ItemCustomBow("diamond-obsidian_bow")).setMaxDamage(600);

        diamondObsidianStairs = new BlockCustomStairs(diamondObsidianBlock, "diamond-obsidian_stairs");
        diamondObsidianWall = new BlockCustomWall(diamondObsidianBlock, "diamond-obsidian_wall");
        diamondObsidianHalfSlab = new BlockCustomHalfSlab(diamondObsidianBlock, "diamond-obsidian_half_slab");
        diamondObsidianDoubleSlab = new BlockCustomDoubleSlab(diamondObsidianBlock, diamondObsidianHalfSlab, "diamond-obsidian_double_slab");

        diamondObsidianDoorBlock = new BlockCustomDoor(diamondObsidianBlock, "diamond-obsidian_door");
        (diamondObsidianDoor = new ItemDoor(diamondObsidianDoorBlock))
            .setUnlocalizedName("diamond-obsidian_door")
            .setRegistryName("diamond-obsidian_door");
        diamondObsidianDoorBlock.setDropItem(diamondObsidianDoor);
        diamondObsidianTrapdoor = new BlockCustomTrapDoor(diamondObsidianBlock, "diamond-obsidian_trapdoor");

		MinecraftForge.EVENT_BUS.register(eventHandler);
	}
	
   @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
       event.getRegistry().register(emeraldHelmet);
       event.getRegistry().register(emeraldChest);
       event.getRegistry().register(emeraldPants);
       event.getRegistry().register(emeraldBoots);
       
       event.getRegistry().register(emeraldSword);
       event.getRegistry().register(emeraldBroadsword);
       event.getRegistry().register(emeraldBow);
       
       event.getRegistry().register(emeraldAxe);
       event.getRegistry().register(emeraldHoe);
       event.getRegistry().register(emeraldPickaxe);
       event.getRegistry().register(emeraldSpade);
       
       event.getRegistry().register(emeraldStairs.getItemBlock());
       event.getRegistry().register(emeraldWall.getItemBlock());
       event.getRegistry().register(new ItemSlab(emeraldHalfSlab, emeraldHalfSlab, emeraldDoubleSlab).setRegistryName("emerald_half_slab"));

       event.getRegistry().register(emeraldDoor);
       event.getRegistry().register(emeraldTrapdoor.getItemBlock());

       
       event.getRegistry().register(obsidianIngot);
       event.getRegistry().register(obsidianHelmet);
       event.getRegistry().register(obsidianChest);
       event.getRegistry().register(obsidianPants);
       event.getRegistry().register(obsidianBoots);
       
       event.getRegistry().register(obsidianSword);
       event.getRegistry().register(obsidianBroadsword);
       event.getRegistry().register(obsidianBow);

       event.getRegistry().register(obsidianAxe);
       event.getRegistry().register(obsidianHoe);
       event.getRegistry().register(obsidianPickaxe);
       event.getRegistry().register(obsidianSpade);

       event.getRegistry().register(obsidianStairs.getItemBlock());
       event.getRegistry().register(obsidianWall.getItemBlock());
       event.getRegistry().register(new ItemSlab(obsidianHalfSlab, obsidianHalfSlab, obsidianDoubleSlab).setRegistryName("obsidian_half_slab"));

       event.getRegistry().register(obsidianDoor);
       event.getRegistry().register(obsidianTrapdoor.getItemBlock());
       
       
       event.getRegistry().register(lapisHelmet);
       event.getRegistry().register(lapisChest);
       event.getRegistry().register(lapisPants);
       event.getRegistry().register(lapisBoots);
       
       event.getRegistry().register(lapisSword);
       event.getRegistry().register(lapisBroadsword);
       event.getRegistry().register(lapisBow);

       event.getRegistry().register(lapisAxe);
       event.getRegistry().register(lapisHoe);
       event.getRegistry().register(lapisPickaxe);
       event.getRegistry().register(lapisSpade);

       event.getRegistry().register(lapisStairs.getItemBlock());
       event.getRegistry().register(lapisWall.getItemBlock());
       event.getRegistry().register(new ItemSlab(lapisHalfSlab, lapisHalfSlab, lapisDoubleSlab).setRegistryName("lapis_half_slab"));

       event.getRegistry().register(lapisDoor);
       event.getRegistry().register(lapisTrapdoor.getItemBlock());
       

       event.getRegistry().register(redstoneHelmet);
       event.getRegistry().register(redstoneChest);
       event.getRegistry().register(redstonePants);
       event.getRegistry().register(redstoneBoots);
       
       event.getRegistry().register(redstoneSword);
       event.getRegistry().register(redstoneBroadsword);
       event.getRegistry().register(redstoneBow);

       event.getRegistry().register(redstoneAxe);
       event.getRegistry().register(redstoneHoe);
       event.getRegistry().register(redstonePickaxe);
       event.getRegistry().register(redstoneSpade);

       event.getRegistry().register(redstoneStairs.getItemBlock());
       event.getRegistry().register(redstoneWall.getItemBlock());
       event.getRegistry().register(new ItemSlab(redstoneHalfSlab, redstoneHalfSlab, redstoneDoubleSlab).setRegistryName("redstone_half_slab"));

       event.getRegistry().register(redstoneDoor);
       event.getRegistry().register(redstoneTrapdoor.getItemBlock());
       
       
       event.getRegistry().register(goldBroadsword);
       event.getRegistry().register(goldBow);

       event.getRegistry().register(goldStairs.getItemBlock());
       event.getRegistry().register(goldWall.getItemBlock());
       event.getRegistry().register(new ItemSlab(goldHalfSlab, goldHalfSlab, goldDoubleSlab).setRegistryName("gold_half_slab"));

       event.getRegistry().register(goldDoor);
       event.getRegistry().register(goldTrapdoor.getItemBlock());
       

       event.getRegistry().register(ironBroadsword);
       event.getRegistry().register(ironBow);

       event.getRegistry().register(ironStairs.getItemBlock());
       event.getRegistry().register(ironWall.getItemBlock());
       event.getRegistry().register(new ItemSlab(ironHalfSlab, ironHalfSlab, ironDoubleSlab).setRegistryName("iron_half_slab"));

       
       event.getRegistry().register(diamondBroadsword);
       event.getRegistry().register(diamondBow);

       event.getRegistry().register(diamondStairs.getItemBlock());
       event.getRegistry().register(diamondWall.getItemBlock());
       event.getRegistry().register(new ItemSlab(diamondHalfSlab, diamondHalfSlab, diamondDoubleSlab).setRegistryName("diamond_half_slab"));

       event.getRegistry().register(diamondDoor);
       event.getRegistry().register(diamondTrapdoor.getItemBlock());


       event.getRegistry().register(diamondObsidianBlock.getItemBlock());
       event.getRegistry().register(diamondObsidianIngot);
       event.getRegistry().register(diamondObsidianHelmet);
       event.getRegistry().register(diamondObsidianChest);
       event.getRegistry().register(diamondObsidianPants);
       event.getRegistry().register(diamondObsidianBoots);
       
       event.getRegistry().register(diamondObsidianSword);
       event.getRegistry().register(diamondObsidianBroadsword);
       event.getRegistry().register(diamondObsidianBow);

       event.getRegistry().register(diamondObsidianAxe);
       event.getRegistry().register(diamondObsidianHoe);
       event.getRegistry().register(diamondObsidianPickaxe);
       event.getRegistry().register(diamondObsidianSpade);

       event.getRegistry().register(diamondObsidianStairs.getItemBlock());
       event.getRegistry().register(diamondObsidianWall.getItemBlock());
       event.getRegistry().register(new ItemSlab(diamondObsidianHalfSlab, diamondObsidianHalfSlab, diamondObsidianDoubleSlab).setRegistryName("diamond-obsidian_half_slab"));

       event.getRegistry().register(diamondObsidianDoor);
       event.getRegistry().register(diamondObsidianTrapdoor.getItemBlock());

   }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(emeraldStairs);
        event.getRegistry().register(emeraldWall);
        event.getRegistry().register(emeraldHalfSlab);
        event.getRegistry().register(emeraldDoubleSlab);
        event.getRegistry().register(emeraldDoorBlock);
        event.getRegistry().register(emeraldTrapdoor);
        
        event.getRegistry().register(obsidianStairs);
        event.getRegistry().register(obsidianWall);
        event.getRegistry().register(obsidianHalfSlab);
        event.getRegistry().register(obsidianDoubleSlab);
        event.getRegistry().register(obsidianDoorBlock);
        event.getRegistry().register(obsidianTrapdoor);
        event.getRegistry().register(polishedObsidian);

        event.getRegistry().register(lapisStairs);
        event.getRegistry().register(lapisWall);
        event.getRegistry().register(lapisHalfSlab);
        event.getRegistry().register(lapisDoubleSlab);
        event.getRegistry().register(lapisDoorBlock);
        event.getRegistry().register(lapisTrapdoor);

        event.getRegistry().register(redstoneStairs);
        event.getRegistry().register(redstoneWall);
        event.getRegistry().register(redstoneHalfSlab);
        event.getRegistry().register(redstoneDoubleSlab);
        event.getRegistry().register(redstoneDoorBlock);
        event.getRegistry().register(redstoneTrapdoor);

        event.getRegistry().register(goldStairs);
        event.getRegistry().register(goldWall);
        event.getRegistry().register(goldHalfSlab);
        event.getRegistry().register(goldDoubleSlab);
        event.getRegistry().register(goldDoorBlock);
        event.getRegistry().register(goldTrapdoor);

        event.getRegistry().register(ironStairs);
        event.getRegistry().register(ironWall);
        event.getRegistry().register(ironHalfSlab);
        event.getRegistry().register(ironDoubleSlab);

        event.getRegistry().register(diamondStairs);
        event.getRegistry().register(diamondWall);
        event.getRegistry().register(diamondHalfSlab);
        event.getRegistry().register(diamondDoubleSlab);
        event.getRegistry().register(diamondDoorBlock);
        event.getRegistry().register(diamondTrapdoor);

        event.getRegistry().register(diamondObsidianBlock);
        event.getRegistry().register(diamondObsidianStairs);
        event.getRegistry().register(diamondObsidianWall);
        event.getRegistry().register(diamondObsidianHalfSlab);
        event.getRegistry().register(diamondObsidianDoubleSlab);
        event.getRegistry().register(diamondObsidianDoorBlock);
        event.getRegistry().register(diamondObsidianTrapdoor);
    }
   
	@EventHandler
	public void init (FMLInitializationEvent event) {
		ModEmeraldMaterial.proxy.init(event);
		EMLogger.info("Initializing " + ModEmeraldMaterial.MODID);
		addRecipes();
		addSmelting();
	}
	
	private void addRecipes() {
		addArmorRecipes(Items.EMERALD, emeraldHelmet, emeraldChest, emeraldPants, emeraldBoots);
		addToolRecipes(Items.EMERALD, emeraldAxe, emeraldHoe, emeraldPickaxe, emeraldSpade);
		addWeaponRecipes(Items.EMERALD, emeraldSword, emeraldBroadsword, emeraldBow);
		addBlockRecipes(Blocks.EMERALD_BLOCK, emeraldStairs, emeraldWall, emeraldHalfSlab);
		addMiscRecipes(Items.EMERALD, emeraldDoor);
		
		addArmorRecipes(obsidianIngot, obsidianHelmet, obsidianChest, obsidianPants, obsidianBoots);
		addToolRecipes(obsidianIngot, obsidianAxe, obsidianHoe, obsidianPickaxe, obsidianSpade);
		addWeaponRecipes(obsidianIngot, obsidianSword, obsidianBroadsword, obsidianBow);
		addBlockRecipes(Blocks.OBSIDIAN, obsidianStairs, obsidianWall, obsidianHalfSlab);
		addMiscRecipes(obsidianIngot, obsidianDoor);
		
		ItemStack lapis = new ItemStack(Items.DYE, 1, 4);
		addArmorRecipes(lapis, lapisHelmet, lapisChest, lapisPants, lapisBoots);
		addToolRecipes(lapis, lapisAxe, lapisHoe, lapisPickaxe, lapisSpade);
		addWeaponRecipes(lapis, lapisSword, lapisBroadsword, lapisBow);
		addBlockRecipes(Blocks.LAPIS_BLOCK, lapisStairs, lapisWall, lapisHalfSlab);
		addMiscRecipes(lapis, lapisDoor);

		addArmorRecipes(Items.REDSTONE, redstoneHelmet, redstoneChest, redstonePants, redstoneBoots);
		addToolRecipes(Items.REDSTONE, redstoneAxe, redstoneHoe, redstonePickaxe, redstoneSpade);
		addWeaponRecipes(Items.REDSTONE, redstoneSword, redstoneBroadsword, redstoneBow);
		addBlockRecipes(Blocks.REDSTONE_BLOCK, redstoneStairs, redstoneWall, redstoneHalfSlab);
		addMiscRecipes(Items.REDSTONE, redstoneDoor);

		addWeaponRecipes(Items.IRON_INGOT, null, ironBroadsword, ironBow);
        addBlockRecipes(Blocks.IRON_BLOCK, ironStairs, ironWall, ironHalfSlab);

        addWeaponRecipes(Items.GOLD_INGOT, null, goldBroadsword, goldBow);
        addBlockRecipes(Blocks.GOLD_BLOCK, goldStairs, goldWall, goldHalfSlab);
        addMiscRecipes(Items.GOLD_INGOT, goldDoor);

		addWeaponRecipes(Items.DIAMOND, null, diamondBroadsword, diamondBow);
        addBlockRecipes(Blocks.DIAMOND_BLOCK, diamondStairs, diamondWall, diamondHalfSlab);
        addMiscRecipes(Items.DIAMOND, diamondDoor);

		addArmorRecipes(diamondObsidianIngot, diamondObsidianHelmet, diamondObsidianChest, diamondObsidianPants, diamondObsidianBoots);
		addToolRecipes(diamondObsidianIngot, diamondObsidianAxe, diamondObsidianHoe, diamondObsidianPickaxe, diamondObsidianSpade);
		addWeaponRecipes(diamondObsidianIngot, diamondObsidianSword, diamondObsidianBroadsword, diamondObsidianBow);
        addBlockRecipes(diamondObsidianBlock, diamondObsidianStairs, diamondObsidianWall, diamondObsidianHalfSlab);
        addMiscRecipes(diamondObsidianIngot, diamondObsidianDoor);
		
		GameRegistry.addShapelessRecipe(diamondObsidianBlock.getRegistryName(), new ResourceLocation(""), new ItemStack(diamondObsidianBlock), Ingredient.func_193369_a(new ItemStack(Blocks.OBSIDIAN)), Ingredient.func_193367_a(Items.DIAMOND), Ingredient.func_193367_a(Items.QUARTZ));
		
	}
	
	/**
	 * Add a Shaped Recipe using GameRegistry.
	 * 
	 * Creating recipes via GameRegistry is deprecated in 1.12, but heck if I'm going to
	 * create a hundred JSON files when I already have code to do it.
	 * 
	 * @param stack
	 * @param params
	 */
	private void addShapedRecipe(ItemStack output, Object... params) {
	    GameRegistry.addShapedRecipe(output.getItem().getRegistryName(), new ResourceLocation(RECIPE_GROUP_NAME), output, params);
	}
	
	
	private void addMiscRecipes(Item recipeItem, Item door) {
		addMiscRecipes(new ItemStack(recipeItem), door);
	}
	@SuppressWarnings("unused") // Possible future use
    private void addMiscRecipes(Block recipeBlock, Item door) {
		addMiscRecipes(new ItemStack(recipeBlock), door);
	}
	private void addMiscRecipes(ItemStack recipeItemStack, Item door) {
		if (door != null) {
			addShapedRecipe(new ItemStack(door, 3),
					"AA",
					"AA",
					"AA",
					'A', recipeItemStack);
		}
	}

    @SuppressWarnings("unused") // Possible future use
	private void addBlockRecipes(Item recipeItem, Block stairs, Block wall, Block halfSlab) {
		addBlockRecipes(new ItemStack(recipeItem), stairs, wall, halfSlab);
	}
	private void addBlockRecipes(Block recipeBlock, Block stairs, Block wall, Block halfSlab) {
		addBlockRecipes(new ItemStack(recipeBlock), stairs, wall, halfSlab);
	}
	private void addBlockRecipes(ItemStack recipeItemStack, Block stairs, Block wall, Block halfSlab) {
		if (halfSlab != null) {
			addShapedRecipe(new ItemStack(halfSlab, 6),
					"AAA",
					"   ",
					"   ",
					'A', recipeItemStack);
			addShapedRecipe(new ItemStack(halfSlab, 6),
					"   ",
					"AAA",
					"   ",
					'A', recipeItemStack);
			addShapedRecipe(new ItemStack(halfSlab, 6),
					"   ",
					"   ",
					"AAA",
					'A', recipeItemStack);
		}
		if (stairs != null) {
			addShapedRecipe(new ItemStack(stairs, 4),
					"A  ",
					"AA ",
					"AAA",
					'A', recipeItemStack);
			addShapedRecipe(new ItemStack(stairs, 4),
					"  A",
					" AA",
					"AAA",
					'A', recipeItemStack);
		}
		if (wall != null) {
			addShapedRecipe(new ItemStack(wall, 6),
					"   ",
					"AAA",
					"AAA",
					'A', recipeItemStack);
			addShapedRecipe(new ItemStack(wall, 6),
					"AAA",
					"AAA",
					"   ",
					'A', recipeItemStack);
		}
	}

	private void addWeaponRecipes(Item recipeItem, Item sword, Item broadsword, Item bow) {
		addWeaponRecipes(new ItemStack(recipeItem), sword, broadsword, bow);
	}
    @SuppressWarnings("unused") // Possible future use
	private void addWeaponRecipes(Block recipeBlock, Item sword, Item broadsword, Item bow) {
		addWeaponRecipes(new ItemStack(recipeBlock), sword, broadsword, bow);
	}
	private void addWeaponRecipes(ItemStack recipeItemStack, Item sword, Item broadsword, Item bow) {
		if (sword != null) {
			addShapedRecipe(new ItemStack(sword),
					" A ",
					" A ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (broadsword != null) {
			addShapedRecipe(new ItemStack(broadsword),
					"AAA",
					"AAA",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (bow != null) {
			addShapedRecipe(new ItemStack(bow),
					"IS ",
					"I A",
					"IS ",
					'A', recipeItemStack,
					'S', Items.STICK,
					'I', Items.STRING);
			addShapedRecipe(new ItemStack(bow),
					" SI",
					"A I",
					" SI",
					'A', recipeItemStack,
					'S', Items.STICK,
					'I', Items.STRING);
		}
	}

	private void addToolRecipes(Item recipeItem, Item axe, Item hoe, Item pickaxe, Item spade) {
		addToolRecipes(new ItemStack(recipeItem), axe, hoe, pickaxe, spade);
	}
    @SuppressWarnings("unused") // Possible future use
	private void addToolRecipes(Block recipeBlock, Item axe, Item hoe, Item pickaxe, Item spade) {
		addToolRecipes(new ItemStack(recipeBlock), axe, hoe, pickaxe, spade);
	}
	private void addToolRecipes(ItemStack recipeItemStack, Item axe, Item hoe, Item pickaxe, Item spade) {
		if (axe != null) {
			addShapedRecipe(new ItemStack(axe),
					"AA ",
					"AS ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
			addShapedRecipe(new ItemStack(axe),
					" AA",
					" SA",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (hoe != null) {
			addShapedRecipe(new ItemStack(hoe),
					"AA ",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
			addShapedRecipe(new ItemStack(hoe),
					" AA",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (pickaxe != null) {
			addShapedRecipe(new ItemStack(pickaxe),
					"AAA",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
		if (spade != null) {
			addShapedRecipe(new ItemStack(spade),
					" A ",
					" S ",
					" S ",
					'A', recipeItemStack,
					'S', Items.STICK);
		}
	}

	private void addArmorRecipes(Item recipeItem, Item helmet, Item chest, Item pants, Item boots) {
		addArmorRecipes(new ItemStack(recipeItem), helmet, chest, pants, boots);
	}
    @SuppressWarnings("unused") // Possible future use
	private void addArmorRecipes(Block recipeBlock, Item helmet, Item chest, Item pants, Item boots) {
		addArmorRecipes(new ItemStack(recipeBlock), helmet, chest, pants, boots);
	}
	private void addArmorRecipes(ItemStack recipeItemStack, Item helmet, Item chest, Item pants, Item boots) {
		if (helmet != null) {
			addShapedRecipe(new ItemStack(helmet),
					"AAA",
					"A A",
					"   ",
					'A', recipeItemStack);
		}
		if (chest != null) {
			addShapedRecipe(new ItemStack(chest),
					"A A",
					"AAA",
					"AAA",
					'A', recipeItemStack);
		}
		if (pants != null) {
			addShapedRecipe(new ItemStack(pants),
					"AAA",
					"A A",
					"A A",
					'A', recipeItemStack);
		}
		if (boots != null) {
			addShapedRecipe(new ItemStack(boots),
					"   ",
					"A A",
					"A A",
					'A', recipeItemStack);
		}
	}

	private void addSmelting() {
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(obsidianIngot), 1.2f);
		GameRegistry.addSmelting(diamondObsidianBlock, new ItemStack(diamondObsidianIngot), 1.5f);
	}

}
