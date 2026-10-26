/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Jp_1
extends Enum<Jp_1> {
    public static final /* enum */ Jp_1 NONE = new Jp_1();
    public static final /* enum */ Jp_1 XZ = new Jp_1();
    public static final /* enum */ Jp_1 XYZ = new Jp_1();
    private static final /* synthetic */ Jp_1[] $VALUES;

    static {
        $VALUES = Jp_1.id_class();
    }

    public static Jp_1[] values() {
        return (Jp_1[])$VALUES.clone();
    }

    public static Jp_1 valueOf(String string) {
        return Enum.valueOf(Jp_1.class, string);
    }

    private static /* synthetic */ Jp_1[] id_class() {
        return new Jp_1[]{NONE, XZ, XYZ};
    }
}

