package net.unladenswallow.minecraft.emeraldmaterial.item;

public class ItemEmeraldBow extends ItemCustomBow {
	
	public ItemEmeraldBow() {
		super("emerald_bow");
	}

	@Override
	protected boolean shotIsCritical(int itemUseDuration, float arrowDamage) {
        return (arrowDamage == 1.5F);
	}

	@Override
	protected float getArrowDamage(int itemUseDuration) {
        float f = (float)itemUseDuration / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (itemUseDuration > 50) {
        	f = 1.5F;
        }
        else if (f > 1.0F)
        {
            f = 1.0F;
        }
        return f;
	}

	@Override
	protected float getNewFovModifier(int itemInUseDuration) {
        float f = (float)itemInUseDuration / 20.0F;

        if (itemInUseDuration > 50) {
        	f = 3.0f;
        } else if (f > 1.0F) {
            f = 1.0F;
        } else {
            f *= f;
        }

        return f;
	}

}
