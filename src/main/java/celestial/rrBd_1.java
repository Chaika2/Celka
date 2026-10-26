/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrBd_1
extends Enum<rrBd_1> {
    public static final /* enum */ rrBd_1 NONE = new rrBd_1();
    public static final /* enum */ rrBd_1 TAIGA = new rrBd_1();
    public static final /* enum */ rrBd_1 EXTREME_HILLS = new rrBd_1();
    public static final /* enum */ rrBd_1 JUNGLE = new rrBd_1();
    public static final /* enum */ rrBd_1 MESA = new rrBd_1();
    public static final /* enum */ rrBd_1 BADLANDS_PLATEAU = new rrBd_1();
    public static final /* enum */ rrBd_1 PLAINS = new rrBd_1();
    public static final /* enum */ rrBd_1 SAVANNA = new rrBd_1();
    public static final /* enum */ rrBd_1 ICY = new rrBd_1();
    public static final /* enum */ rrBd_1 BEACH = new rrBd_1();
    public static final /* enum */ rrBd_1 FOREST = new rrBd_1();
    public static final /* enum */ rrBd_1 OCEAN = new rrBd_1();
    public static final /* enum */ rrBd_1 DESERT = new rrBd_1();
    public static final /* enum */ rrBd_1 RIVER = new rrBd_1();
    public static final /* enum */ rrBd_1 SWAMP = new rrBd_1();
    public static final /* enum */ rrBd_1 MUSHROOM = new rrBd_1();
    private static final /* synthetic */ rrBd_1[] $VALUES;

    static {
        $VALUES = rrBd_1.id_class();
    }

    public static rrBd_1[] values() {
        return (rrBd_1[])$VALUES.clone();
    }

    public static rrBd_1 valueOf(String string) {
        return Enum.valueOf(rrBd_1.class, string);
    }

    private static /* synthetic */ rrBd_1[] id_class() {
        return new rrBd_1[]{NONE, TAIGA, EXTREME_HILLS, JUNGLE, MESA, BADLANDS_PLATEAU, PLAINS, SAVANNA, ICY, BEACH, FOREST, OCEAN, DESERT, RIVER, SWAMP, MUSHROOM};
    }
}

