/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpr_3;

public final class lg_3
extends Enum<lg_3> {
    public static final /* enum */ lg_3 DOWN = new lg_3(rpr_3.DOWN, false);
    public static final /* enum */ lg_3 UP = new lg_3(rpr_3.UP, false);
    public static final /* enum */ lg_3 NORTH = new lg_3(rpr_3.NORTH, false);
    public static final /* enum */ lg_3 SOUTH = new lg_3(rpr_3.SOUTH, false);
    public static final /* enum */ lg_3 WEST = new lg_3(rpr_3.WEST, false);
    public static final /* enum */ lg_3 EAST = new lg_3(rpr_3.EAST, false);
    public static final /* enum */ lg_3 FLIP_DOWN = new lg_3(rpr_3.DOWN, true);
    public static final /* enum */ lg_3 FLIP_UP = new lg_3(rpr_3.UP, true);
    public static final /* enum */ lg_3 FLIP_NORTH = new lg_3(rpr_3.NORTH, true);
    public static final /* enum */ lg_3 FLIP_SOUTH = new lg_3(rpr_3.SOUTH, true);
    public static final /* enum */ lg_3 FLIP_WEST = new lg_3(rpr_3.WEST, true);
    public static final /* enum */ lg_3 FLIP_EAST = new lg_3(rpr_3.EAST, true);
    public final int shape;
    private static final /* synthetic */ lg_3[] $VALUES;

    private lg_3(rpr_3 rpr_32, boolean bl) {
        this.shape = rpr_32.id_byte() + (bl ? rpr_3.values().length : 0);
    }

    static {
        $VALUES = lg_3.id_class();
    }

    public static lg_3[] values() {
        return (lg_3[])$VALUES.clone();
    }

    public static lg_3 valueOf(String string) {
        return Enum.valueOf(lg_3.class, string);
    }

    private static /* synthetic */ lg_3[] id_class() {
        return new lg_3[]{DOWN, UP, NORTH, SOUTH, WEST, EAST, FLIP_DOWN, FLIP_UP, FLIP_NORTH, FLIP_SOUTH, FLIP_WEST, FLIP_EAST};
    }
}

