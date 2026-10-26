/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rjM_2
extends Enum<rjM_2> {
    public static final /* enum */ rjM_2 NONE = new rjM_2();
    public static final /* enum */ rjM_2 MISS = new rjM_2();
    public static final /* enum */ rjM_2 BLOCK = new rjM_2();
    public static final /* enum */ rjM_2 ENTITY = new rjM_2();
    private static final /* synthetic */ rjM_2[] $VALUES;

    static {
        $VALUES = rjM_2.id_class();
    }

    public static rjM_2[] values() {
        return (rjM_2[])$VALUES.clone();
    }

    public static rjM_2 valueOf(String string) {
        return Enum.valueOf(rjM_2.class, string);
    }

    private static /* synthetic */ rjM_2[] id_class() {
        return new rjM_2[]{NONE, MISS, BLOCK, ENTITY};
    }
}

