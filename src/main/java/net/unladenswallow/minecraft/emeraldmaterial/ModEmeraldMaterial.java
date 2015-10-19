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
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockEmeraldDoor;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockEmeraldDoubleSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockEmeraldHalfSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockCustomStairs;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockEmeraldWall;
import net.unladenswallow.minecraft.emeraldmaterial.block.ItemBlockEmeraldSlab;
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
	
	public static Item emeraldBoots;
	public static Item emeraldHelmet;
	public static Item emeraldChest;
	public static Item emeraldPants;
	public static Item emeraldBroadsword;
	public static Item emeraldSword;
	public static Item emeraldBow;
	public static Item emeraldPickaxe;
	public static Item emeraldAxe;
	public static Item emeraldSpade;
	public static Item emeraldHoe;
	public static Item emeraldDoor;
	public static Item emeraldHorseArmor;
	
	public static Block emeraldStairs;
	public static Block emeraldHalfSlab;
	public static Block emeraldDoubleSlab;
	public static Block emeraldWall;
	public static Block emeraldDoorBlock;
	
	public static Item obsidianBoots;
	public static Item obsidianHelmet;
	public static Item obsidianChest;
	public static Item obsidianPants;
	public static Item obsidianSword;
	public static Item obsidianPickaxe;
	public static Item obsidianAxe;
	public static Item obsidianSpade;
	public static Item obsidianHoe;
	public static Item obsidianBow;

	public static Block polishedObsidian;
	
	private static int nextModEntityId = 0;
	
	public static ModEmeraldMaterial instance = new ModEmeraldMaterial();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		ModEmeraldMaterial.proxy.preInit(preInitEvent);
		
		emeraldHelmet = new ItemCustomArmor("emeraldHelmet", 1, 0, ItemMaterials.emeraldArmorMaterial, Potion.moveSpeed);
		emeraldChest = new ItemCustomArmor("emeraldChest", 1, 1, ItemMaterials.emeraldArmorMaterial, Potion.moveSpeed);
		emeraldPants = new ItemCustomArmor("emeraldPants", 2, 2, ItemMaterials.emeraldArmorMaterial, Potion.moveSpeed);
		emeraldBoots = new ItemCustomArmor("emeraldBoots", 1, 3, ItemMaterials.emeraldArmorMaterial, Potion.moveSpeed);
		emeraldBroadsword = (new ItemSword(ItemMaterials.emeraldBroadswordMaterial)).setUnlocalizedName("emeraldBroadsword");
		emeraldSword = (new ItemSword(ItemMaterials.emeraldToolMaterial)).setUnlocalizedName("emeraldSword");
		emeraldBow = new ItemEmeraldBow();
		emeraldPickaxe = new ItemCustomPickaxe(ItemMaterials.emeraldToolMaterial, "emeraldPickaxe");
		emeraldAxe = new ItemCustomAxe(ItemMaterials.emeraldToolMaterial, "emeraldAxe");
		(emeraldSpade = new ItemSpade(ItemMaterials.emeraldToolMaterial)).setUnlocalizedName("emeraldSpade"); // new ItemEmeraldSpade();
		(emeraldHoe = new ItemHoe(ItemMaterials.emeraldToolMaterial)).setUnlocalizedName("emeraldHoe"); // new ItemEmeraldHoe();
		(emeraldHorseArmor = new Item()).setUnlocalizedName("emeraldHorseArmor").setMaxStackSize(1).setCreativeTab(CreativeTabs.tabMisc);
		
		emeraldStairs = new BlockCustomStairs(Blocks.emerald_block, "emeraldStairs");
		emeraldHalfSlab = new BlockEmeraldHalfSlab();
		emeraldDoubleSlab = new BlockEmeraldDoubleSlab();
		emeraldWall = new BlockEmeraldWall();

		emeraldDoorBlock = new BlockEmeraldDoor();
		(emeraldDoor = new ItemDoor(emeraldDoorBlock)).setUnlocalizedName("emeraldDoor"); //new ItemEmeraldDoor();

		obsidianHelmet = new ItemCustomArmor("obsidianHelmet", 1, 0, ItemMaterials.obsidianArmorMaterial, Potion.fireResistance);
		obsidianChest = new ItemCustomArmor("obsidianChest", 1, 1, ItemMaterials.obsidianArmorMaterial, Potion.fireResistance);
		obsidianPants = new ItemCustomArmor("obsidianPants", 2, 2, ItemMaterials.obsidianArmorMaterial, Potion.fireResistance);
		obsidianBoots = new ItemCustomArmor("obsidianBoots", 1, 3, ItemMaterials.obsidianArmorMaterial, Potion.fireResistance);
		obsidianSword = (new ItemSword(ItemMaterials.obsidianToolMaterial)).setUnlocalizedName("obsidianSword");
		obsidianPickaxe = new ItemCustomPickaxe(ItemMaterials.obsidianToolMaterial, "obsidianPickaxe");
		obsidianAxe = new ItemCustomAxe(ItemMaterials.obsidianToolMaterial, "obsidianAxe");
		(obsidianSpade = new ItemSpade(ItemMaterials.obsidianToolMaterial)).setUnlocalizedName("obsidianSpade");
		(obsidianHoe = new ItemHoe(ItemMaterials.obsidianToolMaterial)).setUnlocalizedName("obsidianHoe");
		(obsidianBow = new ItemCustomBow("obsidianBow", "obsidian_bow")).setMaxDamage(600);
		
		(polishedObsidian = new Block(Blocks.obsidian.getMaterial())).setUnlocalizedName("polishedObsidian").setCreativeTab(CreativeTabs.tabBlock);
		
		GameRegistry.registerItem(emeraldHelmet, "emerald_helmet");
		GameRegistry.registerItem(emeraldChest, "emerald_chest");
		GameRegistry.registerItem(emeraldPants, "emerald_pants");
		GameRegistry.registerItem(emeraldBoots, "emerald_boots");
		GameRegistry.registerItem(emeraldBroadsword, "emerald_broadsword");
		GameRegistry.registerItem(emeraldSword, "emerald_sword");
		GameRegistry.registerItem(emeraldBow, "emerald_bow");
		GameRegistry.registerItem(emeraldPickaxe, "emerald_pickaxe");
		GameRegistry.registerItem(emeraldAxe, "emerald_axe");
		GameRegistry.registerItem(emeraldSpade, "emerald_spade");
		GameRegistry.registerItem(emeraldHoe, "emerald_hoe");
		GameRegistry.registerItem(emeraldDoor, "emerald_door");
		GameRegistry.registerItem(emeraldHorseArmor, "emerald_horse_armor");
		
		GameRegistry.registerBlock(emeraldStairs, "emerald_stairs");
		GameRegistry.registerBlock(emeraldHalfSlab, ItemBlockEmeraldSlab.class, "emerald_half_slab", emeraldHalfSlab, emeraldDoubleSlab);
		GameRegistry.registerBlock(emeraldDoubleSlab, ItemBlockEmeraldSlab.class, "emerald_double_slab", emeraldHalfSlab, emeraldDoubleSlab);
		GameRegistry.registerBlock(emeraldWall, "emerald_wall");
		GameRegistry.registerBlock(emeraldDoorBlock, "emerald_door_block");
		
		GameRegistry.registerItem(obsidianHelmet, "obsidian_helmet");
		GameRegistry.registerItem(obsidianChest, "obsidian_chest");
		GameRegistry.registerItem(obsidianPants, "obsidian_pants");
		GameRegistry.registerItem(obsidianBoots, "obsidian_boots");
		GameRegistry.registerItem(obsidianSword, "obsidian_sword");
		GameRegistry.registerItem(obsidianPickaxe, "obsidian_pickaxe");
		GameRegistry.registerItem(obsidianAxe, "obsidian_axe");
		GameRegistry.registerItem(obsidianSpade, "obsidian_spade");
		GameRegistry.registerItem(obsidianHoe, "obsidian_hoe");
		GameRegistry.registerItem(obsidianBow, "obsidian_bow");

		GameRegistry.registerBlock(polishedObsidian, "polished_obsidian");

		/* This is probably a dangerous way of doing this.  We could conflict with another mod or future
			vanilla entities */
//		EntityList.addMapping(EntityCustomHorse.class, "EntityCustomHorse", 124);
		EntityRegistry.registerModEntity(EntityCustomHorse.class, "CustomHorse", ++nextModEntityId, MODID,
					80, 3, false);
		MinecraftForge.EVENT_BUS.register(new EMEventHandler());
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event) {
		ModEmeraldMaterial.proxy.init(event);
		EMLogger.info("Initializing " + ModEmeraldMaterial.MODID);
		addRecipes();
		addSmelting();
	}
	
	private void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(emeraldHelmet),
				"AAA",
				"A A",
				"   ",
				'A', Items.emerald);
		GameRegistry.addRecipe(new ItemStack(emeraldChest),
				"A A",
				"AAA",
				"AAA",
				'A', Items.emerald);
		GameRegistry.addRecipe(new ItemStack(emeraldPants),
				"AAA",
				"A A",
				"A A",
				'A', Items.emerald);
		GameRegistry.addRecipe(new ItemStack(emeraldBoots),
				"   ",
				"A A",
				"A A",
				'A', Items.emerald);
		GameRegistry.addRecipe(new ItemStack(emeraldAxe),
				"AA ",
				"AS ",
				" S ",
				'A', Items.emerald,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(emeraldAxe),
				" AA",
				" SA",
				" S ",
				'A', Items.emerald,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(emeraldHoe),
				"AA ",
				" S ",
				" S ",
				'A', Items.emerald,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(emeraldHoe),
				" AA",
				" S ",
				" S ",
				'A', Items.emerald,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(emeraldPickaxe),
				"AAA",
				" S ",
				" S ",
				'A', Items.emerald,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(emeraldSpade),
				" A ",
				" S ",
				" S ",
				'A', Items.emerald,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(emeraldSword),
				" A ",
				" A ",
				" S ",
				'A', Items.emerald,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(emeraldBroadsword),
				"AAA",
				"AAA",
				" S ",
				'A', Items.emerald,
				'S', Items.stick);
		GameRegistry.addRecipe(new ItemStack(emeraldBow),
				"IS ",
				"I E",
				"IS ",
				'E', Items.emerald,
				'S', Items.stick,
				'I', Items.string);
		
		GameRegistry.addRecipe(new ItemStack(emeraldHalfSlab, 6),
				"EEE",
				"   ",
				"   ",
				'E', Blocks.emerald_block);
		GameRegistry.addRecipe(new ItemStack(emeraldHalfSlab, 6),
				"   ",
				"EEE",
				"   ",
				'E', Blocks.emerald_block);
		GameRegistry.addRecipe(new ItemStack(emeraldHalfSlab, 6),
				"   ",
				"   ",
				"EEE",
				'E', Blocks.emerald_block);

		GameRegistry.addRecipe(new ItemStack(emeraldStairs, 4),
				"E  ",
				"EE ",
				"EEE",
				'E', Blocks.emerald_block);
		GameRegistry.addRecipe(new ItemStack(emeraldStairs, 4),
				"  E",
				" EE",
				"EEE",
				'E', Blocks.emerald_block);
		GameRegistry.addRecipe(new ItemStack(emeraldWall, 6),
				"   ",
				"EEE",
				"EEE",
				'E', Blocks.emerald_block);
		GameRegistry.addRecipe(new ItemStack(emeraldWall, 6),
				"EEE",
				"EEE",
				"   ",
				'E', Blocks.emerald_block);
		GameRegistry.addRecipe(new ItemStack(emeraldDoor, 3),
				" EE",
				" EE",
				" EE",
				'E', Blocks.emerald_block);
		GameRegistry.addRecipe(new ItemStack(emeraldDoor, 3),
				"EE ",
				"EE ",
				"EE ",
				'E', Blocks.emerald_block);
		
	}
	
	private void addSmelting() {
	}

}
