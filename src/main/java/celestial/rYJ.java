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

public final class rYJ
extends Enum<rYJ>
implements rpH_2 {
    public static final /* enum */ rYJ NONE = new rYJ("none");
    public static final /* enum */ rYJ RAIN = new rYJ("rain");
    public static final /* enum */ rYJ SNOW = new rYJ("snow");
    public static final Codec<rYJ> CODEC;
    private static final Map<String, rYJ> BY_NAME;
    private final String name;
    private static final /* synthetic */ rYJ[] $VALUES;

    private static /* synthetic */ rYJ[] id_byte() {
        return new rYJ[]{NONE, RAIN, SNOW};
    }

    private rYJ(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rYJ.id_byte();
        CODEC = rpH_2.id_class(rYJ::values, rYJ::id_class);
        BY_NAME = Arrays.stream(rYJ.values()).collect(Collectors.toMap(rYJ::id_break, rYJ2 -> rYJ2));
    }

    public static rYJ[] values() {
        return (rYJ[])$VALUES.clone();
    }

    public static rYJ valueOf(String string) {
        return Enum.valueOf(rYJ.class, string);
    }

    public static rYJ id_class(String string) {
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

