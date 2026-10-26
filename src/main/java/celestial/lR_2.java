/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpr_3;
import celestial.rqR_2;

public final class lR_2
extends Enum<lR_2> {
    public static final /* enum */ lR_2 DOWN = new lR_2(0, 1, 2, 3);
    public static final /* enum */ lR_2 UP = new lR_2(2, 3, 0, 1);
    public static final /* enum */ lR_2 NORTH = new lR_2(3, 0, 1, 2);
    public static final /* enum */ lR_2 SOUTH = new lR_2(0, 1, 2, 3);
    public static final /* enum */ lR_2 WEST = new lR_2(3, 0, 1, 2);
    public static final /* enum */ lR_2 EAST = new lR_2(1, 2, 3, 0);
    public final int vert0;
    public final int vert1;
    public final int vert2;
    public final int vert3;
    private static final lR_2[] VALUES;
    private static final /* synthetic */ lR_2[] $VALUES;

    private lR_2(int n2, int n3, int n4, int n5) {
        this.vert0 = n2;
        this.vert1 = n3;
        this.vert2 = n4;
        this.vert3 = n5;
    }

    static {
        $VALUES = lR_2.id_class();
        VALUES = rqR_2.id_class(new lR_2[6], lR_2Array -> {
            lR_2Array[rpr_3.DOWN.id_byte()] = DOWN;
            lR_2Array[rpr_3.UP.id_byte()] = UP;
            lR_2Array[rpr_3.NORTH.id_byte()] = NORTH;
            lR_2Array[rpr_3.SOUTH.id_byte()] = SOUTH;
            lR_2Array[rpr_3.WEST.id_byte()] = WEST;
            lR_2Array[rpr_3.EAST.id_byte()] = EAST;
        });
    }

    public static lR_2[] values() {
        return (lR_2[])$VALUES.clone();
    }

    public static lR_2 valueOf(String string) {
        return Enum.valueOf(lR_2.class, string);
    }

    public static lR_2 id_class(rpr_3 rpr_32) {
        return VALUES[rpr_32.id_byte()];
    }

    private static /* synthetic */ lR_2[] id_class() {
        return new lR_2[]{DOWN, UP, NORTH, SOUTH, WEST, EAST};
    }
}

