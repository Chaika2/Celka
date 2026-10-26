/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Me_1
extends Enum<Me_1> {
    public static final /* enum */ Me_1 BASE = new Me_1();
    public static final /* enum */ Me_1 ARB = new Me_1();
    public static final /* enum */ Me_1 EXT = new Me_1();
    private static final /* synthetic */ Me_1[] $VALUES;

    static {
        $VALUES = Me_1.id_class();
    }

    public static Me_1[] values() {
        return (Me_1[])$VALUES.clone();
    }

    public static Me_1 valueOf(String string) {
        return Enum.valueOf(Me_1.class, string);
    }

    private static /* synthetic */ Me_1[] id_class() {
        return new Me_1[]{BASE, ARB, EXT};
    }
}

