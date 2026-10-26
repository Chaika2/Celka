/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rYN;
import celestial.rYc_1;
import celestial.rYu_1;
import celestial.rpH_2;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public abstract sealed class rYQ
extends Enum<rYQ>
implements rpH_2
permits rYN, rYc_1, rYu_1 {
    public static final /* enum */ rYQ NONE = new rYN("none");
    public static final /* enum */ rYQ DARK_FOREST = new rYc_1("dark_forest");
    public static final /* enum */ rYQ SWAMP = new rYu_1("swamp");
    private final String name;
    public static final Codec<rYQ> CODEC;
    private static final Map<String, rYQ> NAME_TO_MODIFIER_MAP;
    private static final /* synthetic */ rYQ[] $VALUES;

    private static /* synthetic */ rYQ[] id_byte() {
        return new rYQ[]{NONE, DARK_FOREST, SWAMP};
    }

    public rYQ(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rYQ.id_byte();
        CODEC = rpH_2.id_class(rYQ::values, rYQ::id_class);
        NAME_TO_MODIFIER_MAP = Arrays.stream(rYQ.values()).collect(Collectors.toMap(rYQ::id_break, rYQ2 -> rYQ2));
    }

    public static rYQ[] values() {
        return (rYQ[])$VALUES.clone();
    }

    public static rYQ valueOf(String string) {
        return Enum.valueOf(rYQ.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public static rYQ id_class(String string) {
        return NAME_TO_MODIFIER_MAP.get(string);
    }

    public abstract int id_class(double var1, double var3, int var5);

    public String id_break() {
        return this.name;
    }
}

