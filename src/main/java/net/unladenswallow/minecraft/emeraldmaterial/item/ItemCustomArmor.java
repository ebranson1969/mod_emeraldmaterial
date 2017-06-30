package net.unladenswallow.minecraft.emeraldmaterial.item;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.unladenswallow.minecraft.emeraldmaterial.EMLogger;

public class ItemCustomArmor extends ItemArmor {

	private List<ArmorEffect> fullSetEffects = new ArrayList<ArmorEffect>();
	
	public ItemCustomArmor(String unlocalizedName, int renderIndex, EntityEquipmentSlot armorType, ArmorMaterial material, Potion fullSetEffect) {
		super(material, renderIndex, armorType);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		if (fullSetEffect != null) {
		    this.addFullSetEffect(fullSetEffect);
		}
	}
	
    public void addFullSetEffect(Potion effect, int amplifier) {
	    fullSetEffects.add(new ArmorEffect(effect, amplifier));
	}

    public void addFullSetEffect(Potion effect) {
        this.addFullSetEffect(effect, 0);
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (!this.fullSetEffects.isEmpty() && playerIsWearingFullSet(player)) {
		    for (ArmorEffect effect : fullSetEffects) {
	            this.affectPlayer(player, effect.getEffect(), effect.getAmplifier());
		    }
		}
	}
	
	private boolean playerIsWearingFullSet(EntityPlayer player) {
		return (playerIsWearingInSlot(player, 0)
			&& playerIsWearingInSlot(player, 1)
			&& playerIsWearingInSlot(player, 2)
			&& playerIsWearingInSlot(player, 3)
			   );
	}

	private boolean playerIsWearingInSlot(EntityPlayer player, int armorSlot) {
	    // As of 1.11, InventoryPlayer.armorItemInSlot() is ClientSide only
	    int inventorySlot = player.inventory.mainInventory.size() + armorSlot;
	    ItemStack stackInSlot = player.inventory.getStackInSlot(inventorySlot);
		return stackInSlot != null 
				&& stackInSlot.getItem() instanceof ItemArmor 
				&& ((ItemArmor)(stackInSlot.getItem())).getArmorMaterial() == this.getArmorMaterial();
	}
	
	private void affectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 20 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 200)
	        player.addPotionEffect(new PotionEffect(potion, 399, amplifier, true, false));
	}
	
	private class ArmorEffect {
        private Potion effect;
        public ArmorEffect(Potion effect, int amplifier) {
            this.effect = effect;
            this.amplifier = amplifier;
        }
	    private int amplifier;
        public Potion getEffect() {
            return effect;
        }
        public void setEffect(Potion effect) {
            this.effect = effect;
        }
        public int getAmplifier() {
            return amplifier;
        }
        public void setAmplifier(int amplifier) {
            this.amplifier = amplifier;
        }
	}
}
