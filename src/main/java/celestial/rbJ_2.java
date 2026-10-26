/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rbJ_2
extends Enum<rbJ_2> {
    public static final /* enum */ rbJ_2 ATTACKING_WITH_MELEE_WEAPON = new rbJ_2();
    public static final /* enum */ rbJ_2 CROSSBOW_HOLD = new rbJ_2();
    public static final /* enum */ rbJ_2 CROSSBOW_CHARGE = new rbJ_2();
    public static final /* enum */ rbJ_2 ADMIRING_ITEM = new rbJ_2();
    public static final /* enum */ rbJ_2 DANCING = new rbJ_2();
    public static final /* enum */ rbJ_2 DEFAULT = new rbJ_2();
    private static final /* synthetic */ rbJ_2[] $VALUES;

    static {
        $VALUES = rbJ_2.id_class();
    }

    public static rbJ_2[] values() {
        return (rbJ_2[])$VALUES.clone();
    }

    public static rbJ_2 valueOf(String string) {
        return Enum.valueOf(rbJ_2.class, string);
    }

    private static /* synthetic */ rbJ_2[] id_class() {
        return new rbJ_2[]{ATTACKING_WITH_MELEE_WEAPON, CROSSBOW_HOLD, CROSSBOW_CHARGE, ADMIRING_ITEM, DANCING, DEFAULT};
    }
}

