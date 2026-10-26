/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rHk_1
extends Enum<rHk_1> {
    public static final /* enum */ rHk_1 HONEY_DELIVERED = new rHk_1();
    public static final /* enum */ rHk_1 BEE_RELEASED = new rHk_1();
    public static final /* enum */ rHk_1 EMERGENCY = new rHk_1();
    private static final /* synthetic */ rHk_1[] $VALUES;

    static {
        $VALUES = rHk_1.id_class();
    }

    public static rHk_1[] values() {
        return (rHk_1[])$VALUES.clone();
    }

    public static rHk_1 valueOf(String string) {
        return Enum.valueOf(rHk_1.class, string);
    }

    private static /* synthetic */ rHk_1[] id_class() {
        return new rHk_1[]{HONEY_DELIVERED, BEE_RELEASED, EMERGENCY};
    }
}

