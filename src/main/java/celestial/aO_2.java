/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class aO_2
extends Enum<aO_2> {
    public static final /* enum */ aO_2 ALL = new aO_2("all", 1, 11);
    public static final /* enum */ aO_2 FIRE = new aO_2("fire", 10, 8);
    public static final /* enum */ aO_2 FALL = new aO_2("fall", 5, 6);
    public static final /* enum */ aO_2 EXPLOSION = new aO_2("explosion", 5, 8);
    public static final /* enum */ aO_2 PROJECTILE = new aO_2("projectile", 3, 6);
    private final String typeName;
    private final int minEnchantability;
    private final int levelCost;
    private static final /* synthetic */ aO_2[] $VALUES;

    private static /* synthetic */ aO_2[] id_byte() {
        return new aO_2[]{ALL, FIRE, FALL, EXPLOSION, PROJECTILE};
    }

    private aO_2(String string2, int n2, int n3) {
        this.typeName = string2;
        this.minEnchantability = n2;
        this.levelCost = n3;
    }

    static {
        $VALUES = aO_2.id_byte();
    }

    public static aO_2[] values() {
        return (aO_2[])$VALUES.clone();
    }

    public static aO_2 valueOf(String string) {
        return Enum.valueOf(aO_2.class, string);
    }

    public int id_class() {
        return this.minEnchantability;
    }

    public int id_break() {
        return this.levelCost;
    }
}

