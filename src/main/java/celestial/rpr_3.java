/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package celestial;

import celestial.an_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rjY_2;
import celestial.rja_3;
import celestial.rje_3;
import celestial.rji_3;
import celestial.rpB_2;
import celestial.rpG_2;
import celestial.rpH_2;
import celestial.rqR_2;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public final class rpr_3
extends Enum<rpr_3>
implements rpH_2 {
    public static final /* enum */ rpr_3 DOWN = new rpr_3(0, 1, -1, "down", rpG_2.NEGATIVE, rpB_2.Y, new rja_3(0, -1, 0));
    public static final /* enum */ rpr_3 UP = new rpr_3(1, 0, -1, "up", rpG_2.POSITIVE, rpB_2.Y, new rja_3(0, 1, 0));
    public static final /* enum */ rpr_3 NORTH = new rpr_3(2, 3, 2, "north", rpG_2.NEGATIVE, rpB_2.Z, new rja_3(0, 0, -1));
    public static final /* enum */ rpr_3 SOUTH = new rpr_3(3, 2, 0, "south", rpG_2.POSITIVE, rpB_2.Z, new rja_3(0, 0, 1));
    public static final /* enum */ rpr_3 WEST = new rpr_3(4, 5, 1, "west", rpG_2.NEGATIVE, rpB_2.X, new rja_3(-1, 0, 0));
    public static final /* enum */ rpr_3 EAST = new rpr_3(5, 4, 3, "east", rpG_2.POSITIVE, rpB_2.X, new rja_3(1, 0, 0));
    private final int index;
    private final int opposite;
    private final int horizontalIndex;
    private final String name;
    private final rpB_2 axis;
    private final rpG_2 axisDirection;
    private final rja_3 directionVec;
    public static final rpr_3[] VALUES;
    private static final Map<String, rpr_3> NAME_LOOKUP;
    public static final rpr_3[] BY_INDEX;
    private static final rpr_3[] BY_HORIZONTAL_INDEX;
    private static final Long2ObjectMap<rpr_3> BY_LONG;
    private static final /* synthetic */ rpr_3[] $VALUES;

    public int id_byte() {
        return this.index;
    }

    public rja_3 id_int() {
        return this.directionVec;
    }

    private rpr_3(int n2, int n3, int n4, String string2, rpG_2 rpG_22, rpB_2 rpB_22, rja_3 rja_32) {
        this.index = n2;
        this.horizontalIndex = n4;
        this.opposite = n3;
        this.name = string2;
        this.axis = rpB_22;
        this.axisDirection = rpG_22;
        this.directionVec = rja_32;
    }

    static {
        $VALUES = rpr_3.id_new();
        VALUES = rpr_3.values();
        NAME_LOOKUP = Arrays.stream(VALUES).collect(Collectors.toMap(rpr_3::id_volatile, rpr_32 -> rpr_32));
        BY_INDEX = (rpr_3[])Arrays.stream(VALUES).sorted(Comparator.comparingInt(rpr_32 -> rpr_32.index)).toArray(rpr_3[]::new);
        BY_HORIZONTAL_INDEX = (rpr_3[])Arrays.stream(VALUES).filter(rpr_32 -> rpr_32.id_final().id_protected()).sorted(Comparator.comparingInt(rpr_32 -> rpr_32.horizontalIndex)).toArray(rpr_3[]::new);
        BY_LONG = (Long2ObjectMap)Arrays.stream(VALUES).collect(Collectors.toMap(rpr_32 -> new rfH_2(rpr_32.id_int()).id_package(), rpr_32 -> rpr_32, (rpr_32, rpr_33) -> {
            throw new IllegalArgumentException("Duplicate keys");
        }, Long2ObjectOpenHashMap::new));
    }

    public String toString() {
        return this.name;
    }

    public static rpr_3[] values() {
        return (rpr_3[])$VALUES.clone();
    }

    public static rpr_3 valueOf(String string) {
        return Enum.valueOf(rpr_3.class, string);
    }

    public static rpr_3 id_class(double d, double d2, double d3) {
        return rpr_3.id_class((float)d, (float)d2, (float)d3);
    }

    public static rpr_3 id_class(float f, float f2, float f3) {
        rpr_3 rpr_32 = NORTH;
        float f4 = Float.MIN_VALUE;
        for (rpr_3 rpr_33 : VALUES) {
            float f5 = f * (float)rpr_33.directionVec.b_() + f2 * (float)rpr_33.directionVec.c_() + f3 * (float)rpr_33.directionVec.d_();
            if (!(f5 > f4)) continue;
            f4 = f5;
            rpr_32 = rpr_33;
        }
        return rpr_32;
    }

    public static rpr_3 id_class(rjV_2 rjV_22, rpr_3 rpr_32) {
        rja_3 rja_32 = rpr_32.id_int();
        rji_3 rji_32 = new rji_3(rja_32.b_(), rja_32.c_(), rja_32.d_(), 0.0f);
        rji_32.id_class(rjV_22);
        return rpr_3.id_class(rji_32.id_class(), rji_32.id_break(), rji_32.id_byte());
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public static rpr_3 id_class(int n, int n2, int n3) {
        return (rpr_3)BY_LONG.get(rfH_2.id_throws(n, n2, n3));
    }

    public static rpr_3 id_class(rpB_2 rpB_22, rpG_2 rpG_22) {
        switch (rpB_22) {
            case X: {
                return rpG_22 == rpG_2.POSITIVE ? EAST : WEST;
            }
            case Y: {
                return rpG_22 == rpG_2.POSITIVE ? UP : DOWN;
            }
        }
        return rpG_22 == rpG_2.POSITIVE ? SOUTH : NORTH;
    }

    public static rpr_3 id_class(double d) {
        return rpr_3.id_break(rfU_2.id_byte(d / 90.0 + 0.5) & 3);
    }

    public static rpr_3[] id_class(an_3 an_32) {
        rpr_3 rpr_32;
        float f = an_32.id_case(1.0f) * ((float)Math.PI / 180);
        float f2 = -an_32.id_throws(1.0f) * ((float)Math.PI / 180);
        float f3 = rfU_2.id_class(f);
        float f4 = rfU_2.id_break(f);
        float f5 = rfU_2.id_class(f2);
        float f6 = rfU_2.id_break(f2);
        boolean bl = f5 > 0.0f;
        boolean bl2 = f3 < 0.0f;
        boolean bl3 = f6 > 0.0f;
        float f7 = bl ? f5 : -f5;
        float f8 = bl2 ? -f3 : f3;
        float f9 = bl3 ? f6 : -f6;
        float f10 = f7 * f4;
        float f11 = f9 * f4;
        rpr_3 rpr_33 = bl ? EAST : WEST;
        rpr_3 rpr_34 = bl2 ? UP : DOWN;
        rpr_3 rpr_35 = rpr_32 = bl3 ? SOUTH : NORTH;
        if (f7 > f9) {
            if (f8 > f10) {
                return rpr_3.id_class(rpr_34, rpr_33, rpr_32);
            }
            return f11 > f8 ? rpr_3.id_class(rpr_33, rpr_32, rpr_34) : rpr_3.id_class(rpr_33, rpr_34, rpr_32);
        }
        if (f8 > f11) {
            return rpr_3.id_class(rpr_34, rpr_32, rpr_33);
        }
        return f10 > f8 ? rpr_3.id_class(rpr_32, rpr_33, rpr_34) : rpr_3.id_class(rpr_32, rpr_34, rpr_33);
    }

    public boolean id_class(float f) {
        float f2 = f * ((float)Math.PI / 180);
        float f3 = -rfU_2.id_class(f2);
        float f4 = rfU_2.id_break(f2);
        return (float)this.directionVec.b_() * f3 + (float)this.directionVec.d_() * f4 > 0.0f;
    }

    private static rpr_3[] id_class(rpr_3 rpr_32, rpr_3 rpr_33, rpr_3 rpr_34) {
        return new rpr_3[]{rpr_32, rpr_33, rpr_34, rpr_34.id_case(), rpr_33.id_case(), rpr_32.id_case()};
    }

    public static rpr_3 id_class(rpG_2 rpG_22, rpB_2 rpB_22) {
        for (rpr_3 rpr_32 : VALUES) {
            if (rpr_32.id_throws() != rpG_22 || rpr_32.id_final() != rpB_22) continue;
            return rpr_32;
        }
        throw new IllegalArgumentException("No such direction: " + rpG_22 + " " + rpB_22);
    }

    public static rpr_3 id_class(Random random) {
        return rqR_2.id_class(VALUES, random);
    }

    public static rpr_3 id_class(int n) {
        return BY_INDEX[rfU_2.id_class(n % BY_INDEX.length)];
    }

    public static rpr_3 id_class(String string) {
        return string == null ? null : NAME_LOOKUP.get(string.toLowerCase(Locale.ROOT));
    }

    public rjY_2 id_break() {
        rjY_2 rjY_22 = rje_3.id_break.id_byte(90.0f);
        switch (this) {
            case DOWN: {
                return rje_3.id_break.id_byte(180.0f);
            }
            case UP: {
                return rjY_2.id_class.id_catch();
            }
            case NORTH: {
                rjY_22.id_class(rje_3.id_case.id_byte(180.0f));
                return rjY_22;
            }
            case SOUTH: {
                return rjY_22;
            }
            case WEST: {
                rjY_22.id_class(rje_3.id_case.id_byte(90.0f));
                return rjY_22;
            }
        }
        rjY_22.id_class(rje_3.id_case.id_byte(-90.0f));
        return rjY_22;
    }

    public static rpr_3 id_break(int n) {
        return BY_HORIZONTAL_INDEX[rfU_2.id_class(n % BY_HORIZONTAL_INDEX.length)];
    }

    public rpG_2 id_throws() {
        return this.axisDirection;
    }

    public int id_finally() {
        return this.directionVec.c_();
    }

    public rpr_3 id_catch() {
        switch (this) {
            case NORTH: {
                return EAST;
            }
            case SOUTH: {
                return WEST;
            }
            case WEST: {
                return NORTH;
            }
            case EAST: {
                return SOUTH;
            }
        }
        throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
    }

    public int id_extends() {
        return this.directionVec.d_();
    }

    public rpr_3 id_case() {
        return VALUES[this.opposite];
    }

    public int id_implements() {
        return this.directionVec.b_();
    }

    private static /* synthetic */ rpr_3[] id_new() {
        return new rpr_3[]{DOWN, UP, NORTH, SOUTH, WEST, EAST};
    }

    public float id_package() {
        return (this.horizontalIndex & 3) * 90;
    }

    public int id_protected() {
        return this.horizontalIndex;
    }

    public rpr_3 id_private() {
        switch (this) {
            case NORTH: {
                return WEST;
            }
            case SOUTH: {
                return EAST;
            }
            case WEST: {
                return SOUTH;
            }
            case EAST: {
                return NORTH;
            }
        }
        throw new IllegalStateException("Unable to get CCW facing of " + this);
    }

    public rpB_2 id_final() {
        return this.axis;
    }

    public String id_volatile() {
        return this.name;
    }

    public rje_3 id_native() {
        return new rje_3(this.id_implements(), this.id_finally(), this.id_extends());
    }
}

