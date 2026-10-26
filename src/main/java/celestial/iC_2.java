/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class iC_2
extends Enum<iC_2> {
    public static final /* enum */ iC_2 VALUE_PRESENT = new iC_2();
    public static final /* enum */ iC_2 VALUE_ABSENT = new iC_2();
    public static final /* enum */ iC_2 REGISTERED = new iC_2();
    private static final /* synthetic */ iC_2[] $VALUES;

    static {
        $VALUES = iC_2.id_class();
    }

    public static iC_2[] values() {
        return (iC_2[])$VALUES.clone();
    }

    public static iC_2 valueOf(String string) {
        return Enum.valueOf(iC_2.class, string);
    }

    private static /* synthetic */ iC_2[] id_class() {
        return new iC_2[]{VALUE_PRESENT, VALUE_ABSENT, REGISTERED};
    }
}

