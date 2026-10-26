/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Ni_1
extends Enum<Ni_1> {
    public static final /* enum */ Ni_1 STATIC = new Ni_1();
    public static final /* enum */ Ni_1 STREAMING = new Ni_1();
    private static final /* synthetic */ Ni_1[] $VALUES;

    static {
        $VALUES = Ni_1.id_class();
    }

    public static Ni_1[] values() {
        return (Ni_1[])$VALUES.clone();
    }

    public static Ni_1 valueOf(String string) {
        return Enum.valueOf(Ni_1.class, string);
    }

    private static /* synthetic */ Ni_1[] id_class() {
        return new Ni_1[]{STATIC, STREAMING};
    }
}

