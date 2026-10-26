/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rSU
extends Enum<rSU> {
    public static final /* enum */ rSU IN_WATER = new rSU();
    public static final /* enum */ rSU UNDER_WATER = new rSU();
    public static final /* enum */ rSU UNDER_FLOWING_WATER = new rSU();
    public static final /* enum */ rSU ON_LAND = new rSU();
    public static final /* enum */ rSU IN_AIR = new rSU();
    private static final /* synthetic */ rSU[] $VALUES;

    static {
        $VALUES = rSU.id_class();
    }

    public static rSU[] values() {
        return (rSU[])$VALUES.clone();
    }

    public static rSU valueOf(String string) {
        return Enum.valueOf(rSU.class, string);
    }

    private static /* synthetic */ rSU[] id_class() {
        return new rSU[]{IN_WATER, UNDER_WATER, UNDER_FLOWING_WATER, ON_LAND, IN_AIR};
    }
}

