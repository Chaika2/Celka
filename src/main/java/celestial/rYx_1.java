/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rYd_1;
import celestial.rYk_1;
import celestial.rfH_2;
import celestial.rpH_2;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public abstract sealed class rYx_1
extends Enum<rYx_1>
implements rpH_2
permits rYd_1, rYk_1 {
    public static final /* enum */ rYx_1 NONE = new rYd_1("none");
    public static final /* enum */ rYx_1 FROZEN = new rYk_1("frozen");
    private final String name;
    public static final Codec<rYx_1> CODEC;
    private static final Map<String, rYx_1> NAME_TO_MODIFIER_MAP;
    private static final /* synthetic */ rYx_1[] $VALUES;

    private static /* synthetic */ rYx_1[] id_byte() {
        return new rYx_1[]{NONE, FROZEN};
    }

    public rYx_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rYx_1.id_byte();
        CODEC = rpH_2.id_class(rYx_1::values, rYx_1::id_class);
        NAME_TO_MODIFIER_MAP = Arrays.stream(rYx_1.values()).collect(Collectors.toMap(rYx_1::id_break, rYx_12 -> rYx_12));
    }

    public static rYx_1[] values() {
        return (rYx_1[])$VALUES.clone();
    }

    public static rYx_1 valueOf(String string) {
        return Enum.valueOf(rYx_1.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public static rYx_1 id_class(String string) {
        return NAME_TO_MODIFIER_MAP.get(string);
    }

    public abstract float id_class(rfH_2 var1, float var2);

    public String id_break() {
        return this.name;
    }
}

