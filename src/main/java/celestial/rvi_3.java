/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rvi_3
extends Enum<rvi_3> {
    public static final /* enum */ rvi_3 INIT = new rvi_3();
    public static final /* enum */ rvi_3 ADD = new rvi_3();
    public static final /* enum */ rvi_3 REMOVE = new rvi_3();
    private static final /* synthetic */ rvi_3[] $VALUES;

    static {
        $VALUES = rvi_3.id_class();
    }

    public static rvi_3[] values() {
        return (rvi_3[])$VALUES.clone();
    }

    public static rvi_3 valueOf(String string) {
        return Enum.valueOf(rvi_3.class, string);
    }

    private static /* synthetic */ rvi_3[] id_class() {
        return new rvi_3[]{INIT, ADD, REMOVE};
    }
}

