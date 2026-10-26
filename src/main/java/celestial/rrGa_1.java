/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rpr_3;

public final class rrGa_1
extends Enum<rrGa_1> {
    public static final /* enum */ rrGa_1 DOWN = new rrGa_1(rpr_3.DOWN);
    public static final /* enum */ rrGa_1 UP = new rrGa_1(rpr_3.UP);
    public static final /* enum */ rrGa_1 NORTH = new rrGa_1(rpr_3.NORTH);
    public static final /* enum */ rrGa_1 SOUTH = new rrGa_1(rpr_3.SOUTH);
    public static final /* enum */ rrGa_1 WEST = new rrGa_1(rpr_3.WEST);
    public static final /* enum */ rrGa_1 EAST = new rrGa_1(rpr_3.EAST);
    public static final /* enum */ rrGa_1 NORTH_WEST = new rrGa_1(rpr_3.NORTH, rpr_3.WEST);
    public static final /* enum */ rrGa_1 NORTH_EAST = new rrGa_1(rpr_3.NORTH, rpr_3.EAST);
    public static final /* enum */ rrGa_1 SOUTH_WEST = new rrGa_1(rpr_3.SOUTH, rpr_3.WEST);
    public static final /* enum */ rrGa_1 SOUTH_EAST = new rrGa_1(rpr_3.SOUTH, rpr_3.EAST);
    public static final /* enum */ rrGa_1 DOWN_NORTH = new rrGa_1(rpr_3.DOWN, rpr_3.NORTH);
    public static final /* enum */ rrGa_1 DOWN_SOUTH = new rrGa_1(rpr_3.DOWN, rpr_3.SOUTH);
    public static final /* enum */ rrGa_1 UP_NORTH = new rrGa_1(rpr_3.UP, rpr_3.NORTH);
    public static final /* enum */ rrGa_1 UP_SOUTH = new rrGa_1(rpr_3.UP, rpr_3.SOUTH);
    public static final /* enum */ rrGa_1 DOWN_WEST = new rrGa_1(rpr_3.DOWN, rpr_3.WEST);
    public static final /* enum */ rrGa_1 DOWN_EAST = new rrGa_1(rpr_3.DOWN, rpr_3.EAST);
    public static final /* enum */ rrGa_1 UP_WEST = new rrGa_1(rpr_3.UP, rpr_3.WEST);
    public static final /* enum */ rrGa_1 UP_EAST = new rrGa_1(rpr_3.UP, rpr_3.EAST);
    private rpr_3 facing1;
    private rpr_3 facing2;
    private static final /* synthetic */ rrGa_1[] $VALUES;

    public int id_byte() {
        int n = this.facing1.id_implements();
        if (this.facing2 != null) {
            n += this.facing2.id_implements();
        }
        return n;
    }

    private rrGa_1(rpr_3 rpr_32) {
        this.facing1 = rpr_32;
    }

    private rrGa_1(rpr_3 rpr_32, rpr_3 rpr_33) {
        this.facing1 = rpr_32;
        this.facing2 = rpr_33;
    }

    static {
        $VALUES = rrGa_1.id_catch();
    }

    public static rrGa_1[] values() {
        return (rrGa_1[])$VALUES.clone();
    }

    public static rrGa_1 valueOf(String string) {
        return Enum.valueOf(rrGa_1.class, string);
    }

    public rfH_2 id_class(rfH_2 rfH_22) {
        rfH_22 = rfH_22.id_class(this.facing1, 1);
        if (this.facing2 != null) {
            rfH_22 = rfH_22.id_class(this.facing2, 1);
        }
        return rfH_22;
    }

    public rpr_3 id_class() {
        return this.facing1;
    }

    public rpr_3 id_break() {
        return this.facing2;
    }

    public int id_throws() {
        int n = this.facing1.id_extends();
        if (this.facing2 != null) {
            n += this.facing2.id_extends();
        }
        return n;
    }

    private static /* synthetic */ rrGa_1[] id_catch() {
        return new rrGa_1[]{DOWN, UP, NORTH, SOUTH, WEST, EAST, NORTH_WEST, NORTH_EAST, SOUTH_WEST, SOUTH_EAST, DOWN_NORTH, DOWN_SOUTH, UP_NORTH, UP_SOUTH, DOWN_WEST, DOWN_EAST, UP_WEST, UP_EAST};
    }

    public boolean id_case() {
        return this.facing2 != null;
    }

    public int id_protected() {
        int n = this.facing1.id_finally();
        if (this.facing2 != null) {
            n += this.facing2.id_finally();
        }
        return n;
    }
}

