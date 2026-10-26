/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rLT
extends Enum<rLT> {
    public static final /* enum */ rLT LAND = new rLT();
    public static final /* enum */ rLT WATER = new rLT();
    public static final /* enum */ rLT AIR = new rLT();
    private static final /* synthetic */ rLT[] $VALUES;

    static {
        $VALUES = rLT.id_class();
    }

    public static rLT[] values() {
        return (rLT[])$VALUES.clone();
    }

    public static rLT valueOf(String string) {
        return Enum.valueOf(rLT.class, string);
    }

    private static /* synthetic */ rLT[] id_class() {
        return new rLT[]{LAND, WATER, AIR};
    }
}

