/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYG;
import celestial.rYl_1;
import celestial.rqM_2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public final class rMN
extends Enum<rMN> {
    public static final /* enum */ rMN RED = new rMN(0, "red", rYl_1.id_case, rYl_1.id_this, rYl_1.h, rYl_1.id_long, rYl_1.N, rYl_1.id_float, rYl_1.c);
    public static final /* enum */ rMN SNOW = new rMN(1, "snow", rYl_1.id_char, rYl_1.id_abstract, rYl_1.Q);
    private static final rMN[] field_221088_c;
    private static final Map<String, rMN> TYPES_BY_NAME;
    private final int index;
    private final String name;
    private final List<rqM_2<rYG>> spawnBiomes;
    private static final /* synthetic */ rMN[] $VALUES;

    private static /* synthetic */ rMN[] id_byte() {
        return new rMN[]{RED, SNOW};
    }

    private rMN(int n2, String string2, rqM_2<rYG> ... rqM_2Array) {
        this.index = n2;
        this.name = string2;
        this.spawnBiomes = Arrays.asList(rqM_2Array);
    }

    static {
        $VALUES = rMN.id_byte();
        field_221088_c = (rMN[])Arrays.stream(rMN.values()).sorted(Comparator.comparingInt(rMN::id_break)).toArray(rMN[]::new);
        TYPES_BY_NAME = Arrays.stream(rMN.values()).collect(Collectors.toMap(rMN::id_class, rMN2 -> rMN2));
    }

    public static rMN[] values() {
        return (rMN[])$VALUES.clone();
    }

    public static rMN valueOf(String string) {
        return Enum.valueOf(rMN.class, string);
    }

    public static rMN id_class(int n) {
        if (n < 0 || n > field_221088_c.length) {
            n = 0;
        }
        return field_221088_c[n];
    }

    public static rMN id_class(Optional<rqM_2<rYG>> optional) {
        return optional.isPresent() && rMN.SNOW.spawnBiomes.contains(optional.get()) ? SNOW : RED;
    }

    public static rMN id_class(String string) {
        return TYPES_BY_NAME.getOrDefault(string, RED);
    }

    public String id_class() {
        return this.name;
    }

    public int id_break() {
        return this.index;
    }
}

