/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rtJ_2;
import celestial.rtx_3;

public final class rtX_2
extends Enum<rtX_2> {
    public static final /* enum */ rtX_2 DOWN = new rtX_2(rtx_3.NEGATIVE, rtJ_2.Y);
    public static final /* enum */ rtX_2 UP = new rtX_2(rtx_3.POSITIVE, rtJ_2.Y);
    public static final /* enum */ rtX_2 NORTH = new rtX_2(rtx_3.NEGATIVE, rtJ_2.Z);
    public static final /* enum */ rtX_2 SOUTH = new rtX_2(rtx_3.POSITIVE, rtJ_2.Z);
    public static final /* enum */ rtX_2 WEST = new rtX_2(rtx_3.NEGATIVE, rtJ_2.X);
    public static final /* enum */ rtX_2 EAST = new rtX_2(rtx_3.POSITIVE, rtJ_2.X);
    private final rtJ_2 axis;
    private final rtx_3 axisDirection;
    private static final /* synthetic */ rtX_2[] $VALUES;

    private static /* synthetic */ rtX_2[] id_byte() {
        return new rtX_2[]{DOWN, UP, NORTH, SOUTH, WEST, EAST};
    }

    private rtX_2(rtx_3 rtx_32, rtJ_2 rtJ_22) {
        this.axis = rtJ_22;
        this.axisDirection = rtx_32;
    }

    static {
        $VALUES = rtX_2.id_byte();
    }

    public static rtX_2[] values() {
        return (rtX_2[])$VALUES.clone();
    }

    public static rtX_2 valueOf(String string) {
        return Enum.valueOf(rtX_2.class, string);
    }

    public rtx_3 id_class() {
        return this.axisDirection;
    }

    public rtJ_2 id_break() {
        return this.axis;
    }
}

