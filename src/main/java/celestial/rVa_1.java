/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.rgF_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public final class rVa_1 {
    public static final rVa_1 id_class = new rVa_1(-1, "unknown");
    private static final Map<rgF_2, rVa_1> id_break = (Map)Stream.of(rgF_2.values()).filter(rgF_2::id_byte).collect(ImmutableMap.toImmutableMap(Function.identity(), rgF_22 -> new rVa_1(rgF_22.id_protected(), rgF_22.id_throws())));
    private static final Map<String, rVa_1> id_byte = (Map)id_break.values().stream().collect(ImmutableMap.toImmutableMap(rVa_12 -> rVa_12.id_throws, Function.identity()));
    private final int id_protected;
    private final String id_throws;

    private String id_byte() {
        return String.format("#%06X", this.id_protected);
    }

    private rVa_1(int n, String string) {
        this.id_protected = n;
        this.id_throws = string;
    }

    public rVa_1(int n) {
        this.id_protected = n;
        this.id_throws = null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rVa_1 rVa_12 = (rVa_1)object;
            return this.id_protected == rVa_12.id_protected;
        }
        return false;
    }

    public String toString() {
        return this.id_throws != null ? this.id_throws : this.id_byte();
    }

    public int hashCode() {
        return Objects.hash(this.id_protected, this.id_throws);
    }

    public static rVa_1 id_class(int n) {
        return new rVa_1(n);
    }

    public static rVa_1 id_class(String string) {
        if (string.startsWith("#")) {
            try {
                int n = Integer.parseInt(string.substring(1), 16);
                return rVa_1.id_class(n);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        return id_byte.get(string);
    }

    public static rVa_1 id_class(rgF_2 rgF_22) {
        return id_break.get((Object)rgF_22);
    }

    public int id_class() {
        return this.id_protected;
    }

    public String id_break() {
        return this.id_throws != null ? this.id_throws : this.id_byte();
    }
}

