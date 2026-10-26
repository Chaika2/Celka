/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class ryB_2
extends Enum<ryB_2> {
    public static final /* enum */ ryB_2 CLOSED = new ryB_2();
    public static final /* enum */ ryB_2 OPENING = new ryB_2();
    public static final /* enum */ ryB_2 OPENED = new ryB_2();
    public static final /* enum */ ryB_2 CLOSING = new ryB_2();
    private static final /* synthetic */ ryB_2[] $VALUES;

    static {
        $VALUES = ryB_2.id_class();
    }

    public static ryB_2[] values() {
        return (ryB_2[])$VALUES.clone();
    }

    public static ryB_2 valueOf(String string) {
        return Enum.valueOf(ryB_2.class, string);
    }

    private static /* synthetic */ ryB_2[] id_class() {
        return new ryB_2[]{CLOSED, OPENING, OPENED, CLOSING};
    }
}

