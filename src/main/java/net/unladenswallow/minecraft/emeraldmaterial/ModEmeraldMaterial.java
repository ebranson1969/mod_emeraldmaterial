package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.block.Block;
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
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomDoor;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomDoubleSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomHalfSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomStairs;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomWall;
import net.unladenswallow.minecraft.emeraldmaterial.block.ItemBlockCustomSlab;
import net.unladenswallow.minecraft.emeraldmaterial.entity.EntityCustomHorse;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomArmor;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomAxe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomBow;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomPickaxe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemEmeraldBow;


@Mod(modid = ModEmeraldMaterial.MODID, useMetadata = true)
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
	
	public static Item emeraldHorseArmor;
	

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

	private static int nextModEntityId = 0;
	
	public static ModEmeraldMaterial instance = new ModEmeraldMaterial();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		ModEmeraldMaterial.proxy.preInit(preInitEvent);
		
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
		

		//		GameRegistry.registerItem(emeraldHorseArmor, "emerald_horse_armor");

		/* **************    Obsidian Items and Blocks   ********************* */
		obsidianHelmet = new ItemCustomArmor("obsidianHelmet", 1, 0, ItemMaterials.obsidianArmorMaterial, Potion.fireResistance);
		obsidianChest = new ItemCustomArmor("obsidianChest", 1, 1, ItemMaterials.obsidianArmorMaterial, Potion.fireResistance);
		obsidianPants = new ItemCustomArmor("obsidianPants", 2, 2, ItemMaterials.obsidianArmorMaterial, Potion.fireResistance);
		obsidianBoots = new ItemCustomArmor("obsidianBoots", 1, 3, ItemMaterials.obsidianArmorMaterial, Potion.fireResistance);

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

		(polishedObsidian = new Block(Blocks.obsidian.getMaterial())).setUnlocalizedName("polishedObsidian").setCreativeTab(CreativeTabs.tabBlock);
		
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
		
		GameRegistry.registerBlock(polishedObsidian, "polished_obsidian");

		/* **************    Lapis Items and Blocks   ********************* */
		lapisHelmet = new ItemCustomArmor("lapisHelmet", 1, 0, ItemMaterials.lapisArmorMaterial, null);
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
		
		
//		EntityRegistry.registerModEntity(EntityCustomHorse.class, "CustomHorse", ++nextModEntityId, MODID,
//					80, 3, false);
//		MinecraftForge.EVENT_BUS.register(new EMEventHandler());
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
		
		addArmorRecipes(Blocks.obsidian, obsidianHelmet, obsidianChest, obsidianPants, obsidianBoots);
		addToolRecipes(Blocks.obsidian, obsidianAxe, obsidianHoe, obsidianPickaxe, obsidianSpade);
		addWeaponRecipes(Blocks.obsidian, obsidianSword, obsidianBroadsword, obsidianBow);
		addBlockRecipes(Blocks.obsidian, obsidianStairs, obsidianWall, obsidianHalfSlab);
		addMiscRecipes(Blocks.obsidian, obsidianDoor);
		
		ItemStack lapis = new ItemStack(Items.dye, 1, 4);
		addArmorRecipes(lapis, lapisHelmet, lapisChest, lapisPants, lapisBoots);
		addToolRecipes(lapis, lapisAxe, lapisHoe, lapisPickaxe, lapisSpade);
		addWeaponRecipes(lapis, lapisSword, lapisBroadsword, lapisBow);
		addBlockRecipes(Blocks.lapis_block, lapisStairs, lapisWall, lapisHalfSlab);
		addMiscRecipes(lapis, lapisDoor);
	}
	
	private void addMiscRecipes(Item recipeItem, Item door) {
		addMiscRecipes(new ItemStack(recipeItem), door);
	}
	private void addMiscRecipes(Block recipeBlock, Item door) {
		addMiscRecipes(new ItemStack(recipeBlock), door);
	}
	private void addMiscRecipes(ItemStack recipeItemStack, Item door) {
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

	private void addBlockRecipes(Item recipeItem, Block stairs, Block wall, Block halfSlab) {
		addBlockRecipes(new ItemStack(recipeItem), stairs, wall, halfSlab);
	}
	private void addBlockRecipes(Block recipeBlock, Block stairs, Block wall, Block halfSlab) {
		addBlockRecipes(new ItemStack(recipeBlock), stairs, wall, halfSlab);
	}
	private void addBlockRecipes(ItemStack recipeItemStack, Block stairs, Block wall, Block halfSlab) {
		GameRegistry.addRecipe(new ItemStack(emeraldHalfSlab, 6),
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

	private void addWeaponRecipes(Item recipeItem, Item sword, Item broadsword, Item bow) {
		addWeaponRecipes(new ItemStack(recipeItem), sword, broadsword, bow);
	}
	private void addWeaponRecipes(Block recipeBlock, Item sword, Item broadsword, Item bow) {
		addWeaponRecipes(new ItemStack(recipeBlock), sword, broadsword, bow);
	}
	private void addWeaponRecipes(ItemStack recipeItemStack, Item sword, Item broadsword, Item bow) {
		GameRegistry.addRecipe(new ItemStack(sword),
				" A ",
				" A ",
				" S ",
				'A', recipeItemStack,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(broadsword),
				"AAA",
				"AAA",
				" S ",
				'A', recipeItemStack,
				'S', Items.stick);
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

	private void addToolRecipes(Item recipeItem, Item axe, Item hoe, Item pickaxe, Item spade) {
		addToolRecipes(new ItemStack(recipeItem), axe, hoe, pickaxe, spade);
	}
	private void addToolRecipes(Block recipeBlock, Item axe, Item hoe, Item pickaxe, Item spade) {
		addToolRecipes(new ItemStack(recipeBlock), axe, hoe, pickaxe, spade);
	}
	private void addToolRecipes(ItemStack recipeItemStack, Item axe, Item hoe, Item pickaxe, Item spade) {
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
		GameRegistry.addRecipe(new ItemStack(pickaxe),
				"AAA",
				" S ",
				" S ",
				'A', recipeItemStack,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(spade),
				" A ",
				" S ",
				" S ",
				'A', recipeItemStack,
				'S', Items.stick);
	}

	private void addArmorRecipes(Item recipeItem, Item helmet, Item chest, Item pants, Item boots) {
		addArmorRecipes(new ItemStack(recipeItem), helmet, chest, pants, boots);
	}
	private void addArmorRecipes(Block recipeBlock, Item helmet, Item chest, Item pants, Item boots) {
		addArmorRecipes(new ItemStack(recipeBlock), helmet, chest, pants, boots);
	}
	private void addArmorRecipes(ItemStack recipeItemStack, Item helmet, Item chest, Item pants, Item boots) {
		GameRegistry.addRecipe(new ItemStack(helmet),
				"AAA",
				"A A",
				"   ",
				'A', recipeItemStack);
		GameRegistry.addRecipe(new ItemStack(chest),
				"A A",
				"AAA",
				"AAA",
				'A', recipeItemStack);
		GameRegistry.addRecipe(new ItemStack(pants),
				"AAA",
				"A A",
				"A A",
				'A', recipeItemStack);
		GameRegistry.addRecipe(new ItemStack(boots),
				"   ",
				"A A",
				"A A",
				'A', recipeItemStack);
	}

	private void addSmelting() {
	}

}
