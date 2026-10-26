/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.lg_3;
import celestial.rpr_3;
import celestial.rqR_2;

public final class lV_2
extends Enum<lV_2> {
    public static final /* enum */ lV_2 DOWN = new lV_2(new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.NORTH, rpr_3.SOUTH}, 0.5f, true, new lg_3[]{lg_3.FLIP_WEST, lg_3.SOUTH, lg_3.FLIP_WEST, lg_3.FLIP_SOUTH, lg_3.WEST, lg_3.FLIP_SOUTH, lg_3.WEST, lg_3.SOUTH}, new lg_3[]{lg_3.FLIP_WEST, lg_3.NORTH, lg_3.FLIP_WEST, lg_3.FLIP_NORTH, lg_3.WEST, lg_3.FLIP_NORTH, lg_3.WEST, lg_3.NORTH}, new lg_3[]{lg_3.FLIP_EAST, lg_3.NORTH, lg_3.FLIP_EAST, lg_3.FLIP_NORTH, lg_3.EAST, lg_3.FLIP_NORTH, lg_3.EAST, lg_3.NORTH}, new lg_3[]{lg_3.FLIP_EAST, lg_3.SOUTH, lg_3.FLIP_EAST, lg_3.FLIP_SOUTH, lg_3.EAST, lg_3.FLIP_SOUTH, lg_3.EAST, lg_3.SOUTH});
    public static final /* enum */ lV_2 UP = new lV_2(new rpr_3[]{rpr_3.EAST, rpr_3.WEST, rpr_3.NORTH, rpr_3.SOUTH}, 1.0f, true, new lg_3[]{lg_3.EAST, lg_3.SOUTH, lg_3.EAST, lg_3.FLIP_SOUTH, lg_3.FLIP_EAST, lg_3.FLIP_SOUTH, lg_3.FLIP_EAST, lg_3.SOUTH}, new lg_3[]{lg_3.EAST, lg_3.NORTH, lg_3.EAST, lg_3.FLIP_NORTH, lg_3.FLIP_EAST, lg_3.FLIP_NORTH, lg_3.FLIP_EAST, lg_3.NORTH}, new lg_3[]{lg_3.WEST, lg_3.NORTH, lg_3.WEST, lg_3.FLIP_NORTH, lg_3.FLIP_WEST, lg_3.FLIP_NORTH, lg_3.FLIP_WEST, lg_3.NORTH}, new lg_3[]{lg_3.WEST, lg_3.SOUTH, lg_3.WEST, lg_3.FLIP_SOUTH, lg_3.FLIP_WEST, lg_3.FLIP_SOUTH, lg_3.FLIP_WEST, lg_3.SOUTH});
    public static final /* enum */ lV_2 NORTH = new lV_2(new rpr_3[]{rpr_3.UP, rpr_3.DOWN, rpr_3.EAST, rpr_3.WEST}, 0.8f, true, new lg_3[]{lg_3.UP, lg_3.FLIP_WEST, lg_3.UP, lg_3.WEST, lg_3.FLIP_UP, lg_3.WEST, lg_3.FLIP_UP, lg_3.FLIP_WEST}, new lg_3[]{lg_3.UP, lg_3.FLIP_EAST, lg_3.UP, lg_3.EAST, lg_3.FLIP_UP, lg_3.EAST, lg_3.FLIP_UP, lg_3.FLIP_EAST}, new lg_3[]{lg_3.DOWN, lg_3.FLIP_EAST, lg_3.DOWN, lg_3.EAST, lg_3.FLIP_DOWN, lg_3.EAST, lg_3.FLIP_DOWN, lg_3.FLIP_EAST}, new lg_3[]{lg_3.DOWN, lg_3.FLIP_WEST, lg_3.DOWN, lg_3.WEST, lg_3.FLIP_DOWN, lg_3.WEST, lg_3.FLIP_DOWN, lg_3.FLIP_WEST});
    public static final /* enum */ lV_2 SOUTH = new lV_2(new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.DOWN, rpr_3.UP}, 0.8f, true, new lg_3[]{lg_3.UP, lg_3.FLIP_WEST, lg_3.FLIP_UP, lg_3.FLIP_WEST, lg_3.FLIP_UP, lg_3.WEST, lg_3.UP, lg_3.WEST}, new lg_3[]{lg_3.DOWN, lg_3.FLIP_WEST, lg_3.FLIP_DOWN, lg_3.FLIP_WEST, lg_3.FLIP_DOWN, lg_3.WEST, lg_3.DOWN, lg_3.WEST}, new lg_3[]{lg_3.DOWN, lg_3.FLIP_EAST, lg_3.FLIP_DOWN, lg_3.FLIP_EAST, lg_3.FLIP_DOWN, lg_3.EAST, lg_3.DOWN, lg_3.EAST}, new lg_3[]{lg_3.UP, lg_3.FLIP_EAST, lg_3.FLIP_UP, lg_3.FLIP_EAST, lg_3.FLIP_UP, lg_3.EAST, lg_3.UP, lg_3.EAST});
    public static final /* enum */ lV_2 WEST = new lV_2(new rpr_3[]{rpr_3.UP, rpr_3.DOWN, rpr_3.NORTH, rpr_3.SOUTH}, 0.6f, true, new lg_3[]{lg_3.UP, lg_3.SOUTH, lg_3.UP, lg_3.FLIP_SOUTH, lg_3.FLIP_UP, lg_3.FLIP_SOUTH, lg_3.FLIP_UP, lg_3.SOUTH}, new lg_3[]{lg_3.UP, lg_3.NORTH, lg_3.UP, lg_3.FLIP_NORTH, lg_3.FLIP_UP, lg_3.FLIP_NORTH, lg_3.FLIP_UP, lg_3.NORTH}, new lg_3[]{lg_3.DOWN, lg_3.NORTH, lg_3.DOWN, lg_3.FLIP_NORTH, lg_3.FLIP_DOWN, lg_3.FLIP_NORTH, lg_3.FLIP_DOWN, lg_3.NORTH}, new lg_3[]{lg_3.DOWN, lg_3.SOUTH, lg_3.DOWN, lg_3.FLIP_SOUTH, lg_3.FLIP_DOWN, lg_3.FLIP_SOUTH, lg_3.FLIP_DOWN, lg_3.SOUTH});
    public static final /* enum */ lV_2 EAST = new lV_2(new rpr_3[]{rpr_3.DOWN, rpr_3.UP, rpr_3.NORTH, rpr_3.SOUTH}, 0.6f, true, new lg_3[]{lg_3.FLIP_DOWN, lg_3.SOUTH, lg_3.FLIP_DOWN, lg_3.FLIP_SOUTH, lg_3.DOWN, lg_3.FLIP_SOUTH, lg_3.DOWN, lg_3.SOUTH}, new lg_3[]{lg_3.FLIP_DOWN, lg_3.NORTH, lg_3.FLIP_DOWN, lg_3.FLIP_NORTH, lg_3.DOWN, lg_3.FLIP_NORTH, lg_3.DOWN, lg_3.NORTH}, new lg_3[]{lg_3.FLIP_UP, lg_3.NORTH, lg_3.FLIP_UP, lg_3.FLIP_NORTH, lg_3.UP, lg_3.FLIP_NORTH, lg_3.UP, lg_3.NORTH}, new lg_3[]{lg_3.FLIP_UP, lg_3.SOUTH, lg_3.FLIP_UP, lg_3.FLIP_SOUTH, lg_3.UP, lg_3.FLIP_SOUTH, lg_3.UP, lg_3.SOUTH});
    public final rpr_3[] corners;
    public final boolean doNonCubicWeight;
    public final lg_3[] vert0Weights;
    public final lg_3[] vert1Weights;
    public final lg_3[] vert2Weights;
    public final lg_3[] vert3Weights;
    private static final lV_2[] VALUES;
    private static final /* synthetic */ lV_2[] $VALUES;

    private lV_2(rpr_3[] rpr_3Array, float f, boolean bl, lg_3[] lg_3Array, lg_3[] lg_3Array2, lg_3[] lg_3Array3, lg_3[] lg_3Array4) {
        this.corners = rpr_3Array;
        this.doNonCubicWeight = bl;
        this.vert0Weights = lg_3Array;
        this.vert1Weights = lg_3Array2;
        this.vert2Weights = lg_3Array3;
        this.vert3Weights = lg_3Array4;
    }

    static {
        $VALUES = lV_2.id_class();
        VALUES = rqR_2.id_class(new lV_2[6], lV_2Array -> {
            lV_2Array[rpr_3.DOWN.id_byte()] = DOWN;
            lV_2Array[rpr_3.UP.id_byte()] = UP;
            lV_2Array[rpr_3.NORTH.id_byte()] = NORTH;
            lV_2Array[rpr_3.SOUTH.id_byte()] = SOUTH;
            lV_2Array[rpr_3.WEST.id_byte()] = WEST;
            lV_2Array[rpr_3.EAST.id_byte()] = EAST;
        });
    }

    public static lV_2[] values() {
        return (lV_2[])$VALUES.clone();
    }

    public static lV_2 valueOf(String string) {
        return Enum.valueOf(lV_2.class, string);
    }

    public static lV_2 id_class(rpr_3 rpr_32) {
        return VALUES[rpr_32.id_byte()];
    }

    private static /* synthetic */ lV_2[] id_class() {
        return new lV_2[]{DOWN, UP, NORTH, SOUTH, WEST, EAST};
    }
}

