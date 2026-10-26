/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrbx_3
extends Enum<rrbx_3> {
    public static final /* enum */ rrbx_3 UP = new rrbx_3();
    public static final /* enum */ rrbx_3 UP_RIGHT = new rrbx_3();
    public static final /* enum */ rrbx_3 RIGHT = new rrbx_3();
    public static final /* enum */ rrbx_3 DOWN_RIGHT = new rrbx_3();
    public static final /* enum */ rrbx_3 DOWN = new rrbx_3();
    public static final /* enum */ rrbx_3 DOWN_LEFT = new rrbx_3();
    public static final /* enum */ rrbx_3 LEFT = new rrbx_3();
    public static final /* enum */ rrbx_3 UP_LEFT = new rrbx_3();
    public static final rrbx_3[] VALUES;
    private static final /* synthetic */ rrbx_3[] $VALUES;

    static {
        $VALUES = rrbx_3.id_class();
        VALUES = rrbx_3.values();
    }

    public static rrbx_3[] values() {
        return (rrbx_3[])$VALUES.clone();
    }

    public static rrbx_3 valueOf(String string) {
        return Enum.valueOf(rrbx_3.class, string);
    }

    private static /* synthetic */ rrbx_3[] id_class() {
        return new rrbx_3[]{UP, UP_RIGHT, RIGHT, DOWN_RIGHT, DOWN, DOWN_LEFT, LEFT, UP_LEFT};
    }
}

