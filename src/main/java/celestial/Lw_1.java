/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Lw_1
extends Enum<Lw_1> {
    public static final /* enum */ Lw_1 UP = new Lw_1();
    public static final /* enum */ Lw_1 DOWN = new Lw_1();
    private static final /* synthetic */ Lw_1[] $VALUES;

    static {
        $VALUES = Lw_1.id_class();
    }

    public static Lw_1[] values() {
        return (Lw_1[])$VALUES.clone();
    }

    public static Lw_1 valueOf(String string) {
        return Enum.valueOf(Lw_1.class, string);
    }

    private static /* synthetic */ Lw_1[] id_class() {
        return new Lw_1[]{UP, DOWN};
    }
}

