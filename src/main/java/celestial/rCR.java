/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;

public final class rCR
extends Enum<rCR>
implements rpH_2 {
    public static final /* enum */ rCR NORTH_SOUTH = new rCR("north_south");
    public static final /* enum */ rCR EAST_WEST = new rCR("east_west");
    public static final /* enum */ rCR ASCENDING_EAST = new rCR("ascending_east");
    public static final /* enum */ rCR ASCENDING_WEST = new rCR("ascending_west");
    public static final /* enum */ rCR ASCENDING_NORTH = new rCR("ascending_north");
    public static final /* enum */ rCR ASCENDING_SOUTH = new rCR("ascending_south");
    public static final /* enum */ rCR SOUTH_EAST = new rCR("south_east");
    public static final /* enum */ rCR SOUTH_WEST = new rCR("south_west");
    public static final /* enum */ rCR NORTH_WEST = new rCR("north_west");
    public static final /* enum */ rCR NORTH_EAST = new rCR("north_east");
    private final String name;
    private static final /* synthetic */ rCR[] $VALUES;

    private static /* synthetic */ rCR[] id_byte() {
        return new rCR[]{NORTH_SOUTH, EAST_WEST, ASCENDING_EAST, ASCENDING_WEST, ASCENDING_NORTH, ASCENDING_SOUTH, SOUTH_EAST, SOUTH_WEST, NORTH_WEST, NORTH_EAST};
    }

    private rCR(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rCR.id_byte();
    }

    public String toString() {
        return this.name;
    }

    public static rCR[] values() {
        return (rCR[])$VALUES.clone();
    }

    public static rCR valueOf(String string) {
        return Enum.valueOf(rCR.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public boolean id_break() {
        return this == ASCENDING_NORTH || this == ASCENDING_EAST || this == ASCENDING_SOUTH || this == ASCENDING_WEST;
    }
}

