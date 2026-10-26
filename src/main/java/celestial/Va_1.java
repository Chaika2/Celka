/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Vi_1;
import celestial.rgP_2;
import celestial.rpo_3;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;

public final class Va_1 {
    private final String id_class;
    private final Vi_1 id_break;
    private final int id_byte;
    private final rpo_3<rgP_2> id_protected;
    public static final Map<String, Va_1> id_throws = Maps.newHashMap();

    public String id_byte() {
        return this.id_class;
    }

    public Va_1(String string, Vi_1 vi_1, int n) {
        this.id_class = string;
        this.id_break = vi_1;
        this.id_byte = n;
        this.id_protected = new rpo_3<rgP_2>(() -> vi_1.field_237522_f_.apply(n, string));
        id_throws.put(string, this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Va_1 va_1 = (Va_1)object;
            return this.id_byte == va_1.id_byte && this.id_break == va_1.id_break;
        }
        return false;
    }

    public String toString() {
        return this.id_class;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id_break, this.id_byte});
    }

    public Vi_1 id_class() {
        return this.id_break;
    }

    public int id_break() {
        return this.id_byte;
    }

    public OptionalInt id_throws() {
        if (this.id_byte >= 48 && this.id_byte <= 57) {
            return OptionalInt.of(this.id_byte - 48);
        }
        return this.id_byte >= 320 && this.id_byte <= 329 ? OptionalInt.of(this.id_byte - 320) : OptionalInt.empty();
    }

    public rgP_2 id_protected() {
        return this.id_protected.id_class();
    }
}

