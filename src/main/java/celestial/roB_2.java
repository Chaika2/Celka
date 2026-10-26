/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class roB_2
extends Enum<roB_2> {
    public static final /* enum */ roB_2 GROWING = new roB_2(4259712);
    public static final /* enum */ roB_2 SHRINKING = new roB_2(0xFF3030);
    public static final /* enum */ roB_2 STATIONARY = new roB_2(2138367);
    private final int color;
    private static final /* synthetic */ roB_2[] $VALUES;

    private roB_2(int n2) {
        this.color = n2;
    }

    static {
        $VALUES = roB_2.id_break();
    }

    public static roB_2[] values() {
        return (roB_2[])$VALUES.clone();
    }

    public static roB_2 valueOf(String string) {
        return Enum.valueOf(roB_2.class, string);
    }

    public int id_class() {
        return this.color;
    }

    private static /* synthetic */ roB_2[] id_break() {
        return new roB_2[]{GROWING, SHRINKING, STATIONARY};
    }
}

