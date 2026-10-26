/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rpH_2;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class rYh_1
extends Enum<rYh_1>
implements rpH_2 {
    public static final /* enum */ rYh_1 NONE = new rYh_1("none");
    public static final /* enum */ rYh_1 TAIGA = new rYh_1("taiga");
    public static final /* enum */ rYh_1 EXTREME_HILLS = new rYh_1("extreme_hills");
    public static final /* enum */ rYh_1 JUNGLE = new rYh_1("jungle");
    public static final /* enum */ rYh_1 MESA = new rYh_1("mesa");
    public static final /* enum */ rYh_1 PLAINS = new rYh_1("plains");
    public static final /* enum */ rYh_1 SAVANNA = new rYh_1("savanna");
    public static final /* enum */ rYh_1 ICY = new rYh_1("icy");
    public static final /* enum */ rYh_1 THEEND = new rYh_1("the_end");
    public static final /* enum */ rYh_1 BEACH = new rYh_1("beach");
    public static final /* enum */ rYh_1 FOREST = new rYh_1("forest");
    public static final /* enum */ rYh_1 OCEAN = new rYh_1("ocean");
    public static final /* enum */ rYh_1 DESERT = new rYh_1("desert");
    public static final /* enum */ rYh_1 RIVER = new rYh_1("river");
    public static final /* enum */ rYh_1 SWAMP = new rYh_1("swamp");
    public static final /* enum */ rYh_1 MUSHROOM = new rYh_1("mushroom");
    public static final /* enum */ rYh_1 NETHER = new rYh_1("nether");
    public static final Codec<rYh_1> CODEC;
    private static final Map<String, rYh_1> BY_NAME;
    private final String name;
    private static final /* synthetic */ rYh_1[] $VALUES;

    private static /* synthetic */ rYh_1[] id_byte() {
        return new rYh_1[]{NONE, TAIGA, EXTREME_HILLS, JUNGLE, MESA, PLAINS, SAVANNA, ICY, THEEND, BEACH, FOREST, OCEAN, DESERT, RIVER, SWAMP, MUSHROOM, NETHER};
    }

    private rYh_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rYh_1.id_byte();
        CODEC = rpH_2.id_class(rYh_1::values, rYh_1::id_class);
        BY_NAME = Arrays.stream(rYh_1.values()).collect(Collectors.toMap(rYh_1::id_break, rYh_12 -> rYh_12));
    }

    public static rYh_1[] values() {
        return (rYh_1[])$VALUES.clone();
    }

    public static rYh_1 valueOf(String string) {
        return Enum.valueOf(rYh_1.class, string);
    }

    public static rYh_1 id_class(String string) {
        return BY_NAME.get(string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public String id_break() {
        return this.name;
    }
}

