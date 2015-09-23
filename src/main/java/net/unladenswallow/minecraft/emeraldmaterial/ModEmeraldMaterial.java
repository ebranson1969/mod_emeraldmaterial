package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockEmeraldDoubleSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockEmeraldHalfSlab;
import net.unladenswallow.minecraft.emeraldmaterial.block.BlockEmeraldStairs;
import net.unladenswallow.minecraft.emeraldmaterial.block.ItemBlockEmeraldSlab;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemEmeraldArmor;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemEmeraldAxe;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemEmeraldBow;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemEmeraldPickaxe;


@Mod(modid = ModEmeraldMaterial.MODID, name = ModEmeraldMaterial.MODNAME,
	version = ModEmeraldMaterial.VERSION, useMetadata = true)
public class ModEmeraldMaterial {

	public static final String MODID = "mod_emeraldmaterial";
	public static final String MODNAME = "Emerald Material Mod";
	public static final String VERSION = "1.8-0.1";
	
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
	
	public static Block emeraldStairs;
	public static Block emeraldHalfSlab;
	public static Block emeraldDoubleSlab;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		ModEmeraldMaterial.proxy.preInit(preInitEvent);
		
		emeraldHelmet = new ItemEmeraldArmor("emeraldHelmet", 1, 0);
		emeraldChest = new ItemEmeraldArmor("emeraldChest", 1, 1);
		emeraldPants = new ItemEmeraldArmor("emeraldPants", 2, 2);
		emeraldBoots = new ItemEmeraldArmor("emeraldBoots", 1, 3);
		emeraldBroadsword = (new ItemSword(EmeraldMaterials.broadswordMaterial)).setUnlocalizedName("emeraldBroadsword");
		emeraldSword = (new ItemSword(EmeraldMaterials.toolMaterial)).setUnlocalizedName("emeraldSword");
		emeraldBow = new ItemEmeraldBow();
		emeraldPickaxe = new ItemEmeraldPickaxe();
		emeraldAxe = new ItemEmeraldAxe();
		(emeraldSpade = new ItemSpade(EmeraldMaterials.toolMaterial)).setUnlocalizedName("emeraldSpade"); // new ItemEmeraldSpade();
		(emeraldHoe = new ItemHoe(EmeraldMaterials.toolMaterial)).setUnlocalizedName("emeraldHoe"); // new ItemEmeraldHoe();
		
		emeraldStairs = new BlockEmeraldStairs();
		emeraldHalfSlab = new BlockEmeraldHalfSlab();
		emeraldDoubleSlab = new BlockEmeraldDoubleSlab();
		
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
		
		GameRegistry.registerBlock(emeraldStairs, "emerald_stairs");
		GameRegistry.registerBlock(emeraldHalfSlab, ItemBlockEmeraldSlab.class, "emerald_half_slab", emeraldHalfSlab, emeraldDoubleSlab);
		GameRegistry.registerBlock(emeraldDoubleSlab, ItemBlockEmeraldSlab.class, "emerald_double_slab", emeraldHalfSlab, emeraldDoubleSlab);
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event) {
		ModEmeraldMaterial.proxy.init(event);
		EMLogger.info("Initializing " + ModEmeraldMaterial.MODNAME);
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
		
	}
	
	private void addSmelting() {
	}

}
