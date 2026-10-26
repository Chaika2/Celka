/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rpr_3;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public final class rpM_2
extends Enum<rpM_2> {
    public static final /* enum */ rpM_2 NORTH = new rpM_2(rpr_3.NORTH);
    public static final /* enum */ rpM_2 NORTH_EAST = new rpM_2(rpr_3.NORTH, rpr_3.EAST);
    public static final /* enum */ rpM_2 EAST = new rpM_2(rpr_3.EAST);
    public static final /* enum */ rpM_2 SOUTH_EAST = new rpM_2(rpr_3.SOUTH, rpr_3.EAST);
    public static final /* enum */ rpM_2 SOUTH = new rpM_2(rpr_3.SOUTH);
    public static final /* enum */ rpM_2 SOUTH_WEST = new rpM_2(rpr_3.SOUTH, rpr_3.WEST);
    public static final /* enum */ rpM_2 WEST = new rpM_2(rpr_3.WEST);
    public static final /* enum */ rpM_2 NORTH_WEST = new rpM_2(rpr_3.NORTH, rpr_3.WEST);
    private static final int NW_DIR_MASK;
    private static final int W_DIR_MASK;
    private static final int SW_DIR_MASK;
    private static final int S_DIR_MASK;
    private static final int SE_DIR_MASK;
    private static final int E_DIR_MASK;
    private static final int NE_DIR_MASK;
    private static final int N_DIR_MASK;
    private final Set<rpr_3> directions;
    private static final /* synthetic */ rpM_2[] $VALUES;

    private rpM_2(rpr_3 ... rpr_3Array) {
        this.directions = Sets.immutableEnumSet(Arrays.asList(rpr_3Array));
    }

    static {
        $VALUES = rpM_2.id_break();
        NW_DIR_MASK = 1 << NORTH_WEST.ordinal();
        W_DIR_MASK = 1 << WEST.ordinal();
        SW_DIR_MASK = 1 << SOUTH_WEST.ordinal();
        S_DIR_MASK = 1 << SOUTH.ordinal();
        SE_DIR_MASK = 1 << SOUTH_EAST.ordinal();
        E_DIR_MASK = 1 << EAST.ordinal();
        NE_DIR_MASK = 1 << NORTH_EAST.ordinal();
        N_DIR_MASK = 1 << NORTH.ordinal();
    }

    public static rpM_2[] values() {
        return (rpM_2[])$VALUES.clone();
    }

    public static rpM_2 valueOf(String string) {
        return Enum.valueOf(rpM_2.class, string);
    }

    public Set<rpr_3> id_class() {
        return this.directions;
    }

    private static /* synthetic */ rpM_2[] id_break() {
        return new rpM_2[]{NORTH, NORTH_EAST, EAST, SOUTH_EAST, SOUTH, SOUTH_WEST, WEST, NORTH_WEST};
    }
}

