/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rmU_2
extends Enum<rmU_2> {
    public static final /* enum */ rmU_2 PRESS_SHIFT_KEY = new rmU_2();
    public static final /* enum */ rmU_2 RELEASE_SHIFT_KEY = new rmU_2();
    public static final /* enum */ rmU_2 STOP_SLEEPING = new rmU_2();
    public static final /* enum */ rmU_2 START_SPRINTING = new rmU_2();
    public static final /* enum */ rmU_2 STOP_SPRINTING = new rmU_2();
    public static final /* enum */ rmU_2 START_RIDING_JUMP = new rmU_2();
    public static final /* enum */ rmU_2 STOP_RIDING_JUMP = new rmU_2();
    public static final /* enum */ rmU_2 OPEN_INVENTORY = new rmU_2();
    public static final /* enum */ rmU_2 START_FALL_FLYING = new rmU_2();
    private static final /* synthetic */ rmU_2[] $VALUES;

    static {
        $VALUES = rmU_2.id_class();
    }

    public static rmU_2[] values() {
        return (rmU_2[])$VALUES.clone();
    }

    public static rmU_2 valueOf(String string) {
        return Enum.valueOf(rmU_2.class, string);
    }

    private static /* synthetic */ rmU_2[] id_class() {
        return new rmU_2[]{PRESS_SHIFT_KEY, RELEASE_SHIFT_KEY, STOP_SLEEPING, START_SPRINTING, STOP_SPRINTING, START_RIDING_JUMP, STOP_RIDING_JUMP, OPEN_INVENTORY, START_FALL_FLYING};
    }
}

