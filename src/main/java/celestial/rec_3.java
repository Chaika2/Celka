/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.rpH_2;
import celestial.rpr_3;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public final class rec_3
extends Enum<rec_3>
implements rpH_2 {
    public static final /* enum */ rec_3 DOWN_EAST = new rec_3("down_east", rpr_3.DOWN, rpr_3.EAST);
    public static final /* enum */ rec_3 DOWN_NORTH = new rec_3("down_north", rpr_3.DOWN, rpr_3.NORTH);
    public static final /* enum */ rec_3 DOWN_SOUTH = new rec_3("down_south", rpr_3.DOWN, rpr_3.SOUTH);
    public static final /* enum */ rec_3 DOWN_WEST = new rec_3("down_west", rpr_3.DOWN, rpr_3.WEST);
    public static final /* enum */ rec_3 UP_EAST = new rec_3("up_east", rpr_3.UP, rpr_3.EAST);
    public static final /* enum */ rec_3 UP_NORTH = new rec_3("up_north", rpr_3.UP, rpr_3.NORTH);
    public static final /* enum */ rec_3 UP_SOUTH = new rec_3("up_south", rpr_3.UP, rpr_3.SOUTH);
    public static final /* enum */ rec_3 UP_WEST = new rec_3("up_west", rpr_3.UP, rpr_3.WEST);
    public static final /* enum */ rec_3 WEST_UP = new rec_3("west_up", rpr_3.WEST, rpr_3.UP);
    public static final /* enum */ rec_3 EAST_UP = new rec_3("east_up", rpr_3.EAST, rpr_3.UP);
    public static final /* enum */ rec_3 NORTH_UP = new rec_3("north_up", rpr_3.NORTH, rpr_3.UP);
    public static final /* enum */ rec_3 SOUTH_UP = new rec_3("south_up", rpr_3.SOUTH, rpr_3.UP);
    private static final Int2ObjectMap<rec_3> field_239637_m_;
    private final String field_239638_n_;
    private final rpr_3 field_239639_o_;
    private final rpr_3 field_239640_p_;
    private static final /* synthetic */ rec_3[] $VALUES;

    public rpr_3 id_byte() {
        return this.field_239639_o_;
    }

    private rec_3(String string2, rpr_3 rpr_32, rpr_3 rpr_33) {
        this.field_239638_n_ = string2;
        this.field_239640_p_ = rpr_32;
        this.field_239639_o_ = rpr_33;
    }

    static {
        $VALUES = rec_3.id_protected();
        field_239637_m_ = new Int2ObjectOpenHashMap(rec_3.values().length);
        for (rec_3 rec_32 : rec_3.values()) {
            field_239637_m_.put(rec_3.id_break(rec_32.field_239639_o_, rec_32.field_239640_p_), (Object)rec_32);
        }
    }

    public static rec_3[] values() {
        return (rec_3[])$VALUES.clone();
    }

    public static rec_3 valueOf(String string) {
        return Enum.valueOf(rec_3.class, string);
    }

    public static rec_3 id_class(rpr_3 rpr_32, rpr_3 rpr_33) {
        int n = rec_3.id_break(rpr_33, rpr_32);
        return (rec_3)field_239637_m_.get(n);
    }

    @Override
    public String id_class() {
        return this.field_239638_n_;
    }

    public rpr_3 id_break() {
        return this.field_239640_p_;
    }

    private static int id_break(rpr_3 rpr_32, rpr_3 rpr_33) {
        return rpr_32.ordinal() << 3 | rpr_33.ordinal();
    }

    private static /* synthetic */ rec_3[] id_protected() {
        return new rec_3[]{DOWN_EAST, DOWN_NORTH, DOWN_SOUTH, DOWN_WEST, UP_EAST, UP_NORTH, UP_SOUTH, UP_WEST, WEST_UP, EAST_UP, NORTH_UP, SOUTH_UP};
    }
}

