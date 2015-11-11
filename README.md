# mOre Usable Materials Mod by FreneticFeline

mOre Usable Materials Mod is a Minecraft Forge mod that provides the ability to
construct, tools, weapons, armor, additional blocks and more from Emerald,
Obsidian, Lapis, Redstone, Iron, Gold, and Diamond.  It also adds a better-than-diamond
material called Diamond-Infused Obsidian.

## New Item Materials

### Emerald
The Emerald material's properties fall somewhere between Iron and Diamond.
Whenever a full set of Emerald armor is worn, the player receives the Speed
effect.

### Obsidian  
Obsidian blocks can be smelted into Obsidian Ingots, which can be used to
make the items.  The obsidian material's properties are roughly the same
as iron, except with extremely high durability.  Also, each piece of Obsidian
armor gives a 22% reduction in explosion and fire damage, as well as a 15%
reduction to lava damage.

### Redstone
The Redstone material's properties are roughly the same as cobblestone and
chain mail.  Whenever a full set of Redstone armor is worn, the player receives
the Night Vision effect.

### Lapis
The Lapis material's properties are roughly the same as cobblestone and
chain mail.  Each item automatically receives a random low level enchantment
when it is crafted.  Whenever a full set of Lapis armor is worn, the player receives
the Water Breathing effect.

### Diamond-Infused Obsidian
The Diamond-Infused Obsidian material's properties are better than diamond in
all respects.  It is similar to Obsidian in that it has extremely high durability
and provides the same explosion, fire and lava damage reductions.


## Added Items
The following items are added for each type of material, if they aren't already
available.  

- Spade
- Hoe
- Axe
- Pickaxe
- Sword
- Broadsword (1 point higher damage than equivalent Sword)
- Bow (may have special attributes)
- Helmet
- Chest
- Pants
- Boots

## Added Blocks
The following blocks are added for each type of material, if they aren't already
available. Most are only useful in Creative Mode, as they are impractical in a
survival game.

- Stairs
- Slab
- Wall
- Door
- Trapdoor

## Installation Requirements
mOre Usable Materials Mod versions 1.8-x.x require Minecraft 1.8 with compatible version
of MinecraftForge installed.

## Installation Instructions
Copy the `mod_ffMOreUsableMaterials_forge-1.8-x.x.jar` file to the `mods` directory in your Minecraft
data directory.

## Usage Instructions
Obsidian material items
are crafted with Obsidian Ingots, which are created by smelting Obsidian blocks.  Diamond-Infused
Obsidian items are created with Diamond-Infused Obsidian Ingots, which are created by smelting
Diamond-Infused Obsidan blocks.  Diamond-Infused Obsidian blocks are crafted with a shapeless recipe
of one Obsidian block, one Diamond and one Nether Quartz.

### Obvious recipes
All items that already exist for other materials are crafted with recipes similar to those of existing materials,
with the main ingredient replaced with the expected items.

### Non-obvious recipes
The new item Broadsword is crafted with the following recipe, where 'X' represents the appropriate ingredient
for the type of Broadsword being crafted, and 'I' represents a Stick.

    XXX
    XXX
    _I_
  
The various types of bows are constructed with the same recipe as a vanilla bow, but with the middle Stick
replaced by the appropriate ingredient. ('X' = appropriate item for material; 'S' = String; 'I' = Stick)

    SI_
    S_X
    SI_
    
## Development Setup Instructions
Follow the standard Forge mod development setup instructions.  They can be found
in the file named `README-MinecraftForge.txt`

## ToDo
- Melt items in furnace to obtain source ingots
- Better graphics for diamond-infused items
- Something special for redstone items (fire? lightning? thorns?)
- Fix client/server sync of auto-enchantment on Lapis items
- Increase generation rate of Emerald Ore blocks

