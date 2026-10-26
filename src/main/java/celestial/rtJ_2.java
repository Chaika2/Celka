/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rtJ_2
extends Enum<rtJ_2> {
    public static final /* enum */ rtJ_2 X = new rtJ_2();
    public static final /* enum */ rtJ_2 Y = new rtJ_2();
    public static final /* enum */ rtJ_2 Z = new rtJ_2();
    private static final /* synthetic */ rtJ_2[] $VALUES;

    static {
        $VALUES = rtJ_2.id_class();
    }

    public static rtJ_2[] values() {
        return (rtJ_2[])$VALUES.clone();
    }

    public static rtJ_2 valueOf(String string) {
        return Enum.valueOf(rtJ_2.class, string);
    }

    private static /* synthetic */ rtJ_2[] id_class() {
        return new rtJ_2[]{X, Y, Z};
    }
}

