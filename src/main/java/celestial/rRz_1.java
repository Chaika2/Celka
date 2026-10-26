/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rRz_1
extends Enum<rRz_1> {
    public static final /* enum */ rRz_1 NONE = new rRz_1();
    public static final /* enum */ rRz_1 BREAK = new rRz_1();
    public static final /* enum */ rRz_1 DESTROY = new rRz_1();
    private static final /* synthetic */ rRz_1[] $VALUES;

    static {
        $VALUES = rRz_1.id_class();
    }

    public static rRz_1[] values() {
        return (rRz_1[])$VALUES.clone();
    }

    public static rRz_1 valueOf(String string) {
        return Enum.valueOf(rRz_1.class, string);
    }

    private static /* synthetic */ rRz_1[] id_class() {
        return new rRz_1[]{NONE, BREAK, DESTROY};
    }
}

