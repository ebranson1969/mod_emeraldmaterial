package net.unladenswallow.minecraft.emeraldmaterial.item;

/**
 * This bow is nearly identical to a standard bow, but pulls twice as fast
 *
 */
public class ItemGoldBow extends ItemCustomBow {
	
	public ItemGoldBow() {
		super("gold_bow");
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
	protected float getNewFovModifier(int itemInUseDuration) {
	    float f = (float)itemInUseDuration / 10.0F;

	    if (f > 1.0F) {
	        f = 1.0F;
	    } else {
	        f *= f;
	    }

	    return f;
	}

}
