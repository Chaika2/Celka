/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class ryk_3
extends Enum<ryk_3> {
    public static final /* enum */ ryk_3 SINGLE = new ryk_3();
    public static final /* enum */ ryk_3 FIRST = new ryk_3();
    public static final /* enum */ ryk_3 SECOND = new ryk_3();
    private static final /* synthetic */ ryk_3[] $VALUES;

    static {
        $VALUES = ryk_3.id_class();
    }

    public static ryk_3[] values() {
        return (ryk_3[])$VALUES.clone();
    }

    public static ryk_3 valueOf(String string) {
        return Enum.valueOf(ryk_3.class, string);
    }

    private static /* synthetic */ ryk_3[] id_class() {
        return new ryk_3[]{SINGLE, FIRST, SECOND};
    }
}

