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

public final class rip_3
extends Enum<rip_3>
implements rpH_2 {
    public static final /* enum */ rip_3 WARM = new rip_3("warm");
    public static final /* enum */ rip_3 COLD = new rip_3("cold");
    public static final Codec<rip_3> field_236998_c_;
    private static final Map<String, rip_3> BY_NAME;
    private final String name;
    private static final /* synthetic */ rip_3[] $VALUES;

    private static /* synthetic */ rip_3[] id_byte() {
        return new rip_3[]{WARM, COLD};
    }

    private rip_3(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rip_3.id_byte();
        field_236998_c_ = rpH_2.id_class(rip_3::values, rip_3::id_class);
        BY_NAME = Arrays.stream(rip_3.values()).collect(Collectors.toMap(rip_3::id_break, rip_32 -> rip_32));
    }

    public static rip_3[] values() {
        return (rip_3[])$VALUES.clone();
    }

    public static rip_3 valueOf(String string) {
        return Enum.valueOf(rip_3.class, string);
    }

    public static rip_3 id_class(String string) {
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

