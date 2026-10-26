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

public final class rKu_1
extends Enum<rKu_1>
implements rpH_2 {
    public static final /* enum */ rKu_1 AIR = new rKu_1("air");
    public static final /* enum */ rKu_1 LIQUID = new rKu_1("liquid");
    public static final Codec<rKu_1> field_236074_c_;
    private static final Map<String, rKu_1> BY_NAME;
    private final String name;
    private static final /* synthetic */ rKu_1[] $VALUES;

    private static /* synthetic */ rKu_1[] id_byte() {
        return new rKu_1[]{AIR, LIQUID};
    }

    private rKu_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rKu_1.id_byte();
        field_236074_c_ = rpH_2.id_class(rKu_1::values, rKu_1::id_class);
        BY_NAME = Arrays.stream(rKu_1.values()).collect(Collectors.toMap(rKu_1::id_break, rKu_12 -> rKu_12));
    }

    public static rKu_1[] values() {
        return (rKu_1[])$VALUES.clone();
    }

    public static rKu_1 valueOf(String string) {
        return Enum.valueOf(rKu_1.class, string);
    }

    public static rKu_1 id_class(String string) {
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

