/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class roK_2
extends Enum<roK_2> {
    public static final /* enum */ roK_2 HIGH = new roK_2();
    public static final /* enum */ roK_2 LOW = new roK_2();
    private static final /* synthetic */ roK_2[] $VALUES;

    static {
        $VALUES = roK_2.id_class();
    }

    public static roK_2[] values() {
        return (roK_2[])$VALUES.clone();
    }

    public static roK_2 valueOf(String string) {
        return Enum.valueOf(roK_2.class, string);
    }

    private static /* synthetic */ roK_2[] id_class() {
        return new roK_2[]{HIGH, LOW};
    }
}

