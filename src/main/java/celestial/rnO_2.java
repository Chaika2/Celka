/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rnO_2
extends Enum<rnO_2> {
    public static final /* enum */ rnO_2 PREFIX = new rnO_2();
    public static final /* enum */ rnO_2 NAME = new rnO_2();
    public static final /* enum */ rnO_2 SUFFIX = new rnO_2();
    private static final /* synthetic */ rnO_2[] $VALUES;

    static {
        $VALUES = rnO_2.id_class();
    }

    public static rnO_2[] values() {
        return (rnO_2[])$VALUES.clone();
    }

    public static rnO_2 valueOf(String string) {
        return Enum.valueOf(rnO_2.class, string);
    }

    private static /* synthetic */ rnO_2[] id_class() {
        return new rnO_2[]{PREFIX, NAME, SUFFIX};
    }
}

