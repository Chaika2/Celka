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

public final class raU_2
extends Enum<raU_2>
implements rpH_2 {
    public static final /* enum */ raU_2 NORMAL = new raU_2("normal");
    public static final /* enum */ raU_2 MESA = new raU_2("mesa");
    public static final Codec<raU_2> field_236324_c_;
    private static final Map<String, raU_2> BY_NAME;
    private final String name;
    private static final /* synthetic */ raU_2[] $VALUES;

    private static /* synthetic */ raU_2[] id_byte() {
        return new raU_2[]{NORMAL, MESA};
    }

    private raU_2(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = raU_2.id_byte();
        field_236324_c_ = rpH_2.id_class(raU_2::values, raU_2::id_class);
        BY_NAME = Arrays.stream(raU_2.values()).collect(Collectors.toMap(raU_2::id_break, raU_22 -> raU_22));
    }

    public static raU_2[] values() {
        return (raU_2[])$VALUES.clone();
    }

    public static raU_2 valueOf(String string) {
        return Enum.valueOf(raU_2.class, string);
    }

    public static raU_2 id_class(int n) {
        return n >= 0 && n < raU_2.values().length ? raU_2.values()[n] : NORMAL;
    }

    @Override
    public String id_class() {
        return this.name;
    }

    private static raU_2 id_class(String string) {
        return BY_NAME.get(string);
    }

    public String id_break() {
        return this.name;
    }
}

