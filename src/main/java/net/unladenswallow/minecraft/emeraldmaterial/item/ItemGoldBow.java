package net.unladenswallow.minecraft.emeraldmaterial.item;

/**
 * This bow is nearly identical to a standard bow, but pulls twice as fast
 *
 */
public class ItemGoldBow extends ItemCustomBow {
	
	public ItemGoldBow() {
		super("goldBow", "gold_bow");
		this.setModelVariantCount(3);
	}

	@Override
	protected float getArrowDamage(int itemUseDuration) {
        float f = (float)itemUseDuration / 10.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }
        return f;
	}

	@Override
	protected int getModelVariation(int useTime) {
    	if(useTime >= 11) {
    		return 2;
        } else if(useTime > 5) {
            return 1;
        } else {
            return 0;
        }
	}

}
