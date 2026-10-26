/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Lr_1
extends Enum<Lr_1> {
    public static final /* enum */ Lr_1 ALL = new Lr_1();
    public static final /* enum */ Lr_1 HIDDEN = new Lr_1();
    public static final /* enum */ Lr_1 BLOCKED = new Lr_1();
    private static final /* synthetic */ Lr_1[] $VALUES;

    static {
        $VALUES = Lr_1.id_class();
    }

    public static Lr_1[] values() {
        return (Lr_1[])$VALUES.clone();
    }

    public static Lr_1 valueOf(String string) {
        return Enum.valueOf(Lr_1.class, string);
    }

    private static /* synthetic */ Lr_1[] id_class() {
        return new Lr_1[]{ALL, HIDDEN, BLOCKED};
    }
}

