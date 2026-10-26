/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rnb_3
extends Enum<rnb_3> {
    public static final /* enum */ rnb_3 CHANGE = new rnb_3();
    public static final /* enum */ rnb_3 REMOVE = new rnb_3();
    private static final /* synthetic */ rnb_3[] $VALUES;

    static {
        $VALUES = rnb_3.id_class();
    }

    public static rnb_3[] values() {
        return (rnb_3[])$VALUES.clone();
    }

    public static rnb_3 valueOf(String string) {
        return Enum.valueOf(rnb_3.class, string);
    }

    private static /* synthetic */ rnb_3[] id_class() {
        return new rnb_3[]{CHANGE, REMOVE};
    }
}

