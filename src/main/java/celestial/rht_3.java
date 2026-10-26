/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rht_3
extends Enum<rht_3> {
    public static final /* enum */ rht_3 ABOVE_WATER = new rht_3();
    public static final /* enum */ rht_3 INSIDE_WATER = new rht_3();
    public static final /* enum */ rht_3 INVALID = new rht_3();
    private static final /* synthetic */ rht_3[] $VALUES;

    static {
        $VALUES = rht_3.id_class();
    }

    public static rht_3[] values() {
        return (rht_3[])$VALUES.clone();
    }

    public static rht_3 valueOf(String string) {
        return Enum.valueOf(rht_3.class, string);
    }

    private static /* synthetic */ rht_3[] id_class() {
        return new rht_3[]{ABOVE_WATER, INSIDE_WATER, INVALID};
    }
}

