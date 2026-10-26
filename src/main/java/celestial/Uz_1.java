/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.rCv_1;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class Uz_1 {
    private static final Uz_1 id_class = new Uz_1((List<rCv_1<?>>)ImmutableList.of());
    private static final Comparator<rCv_1<?>> id_break = Comparator.comparing(rCv_12 -> rCv_12.id_class().id_throws());
    private final List<rCv_1<?>> id_byte;

    private Uz_1(List<rCv_1<?>> list) {
        this.id_byte = list;
    }

    public boolean equals(Object object) {
        return this == object || object instanceof Uz_1 && this.id_byte.equals(((Uz_1)object).id_byte);
    }

    public String toString() {
        return this.id_break();
    }

    public int hashCode() {
        return this.id_byte.hashCode();
    }

    public Uz_1 id_class(rCv_1<?> rCv_12) {
        return new Uz_1((List<rCv_1<?>>)ImmutableList.builder().addAll(this.id_byte).add(rCv_12).build());
    }

    public static Uz_1 id_class() {
        return id_class;
    }

    public static Uz_1 id_class(rCv_1<?> ... rCv_1Array) {
        return new Uz_1((List<rCv_1<?>>)ImmutableList.copyOf((Object[])rCv_1Array));
    }

    public Uz_1 id_class(Uz_1 uz_1) {
        return new Uz_1((List<rCv_1<?>>)ImmutableList.builder().addAll(this.id_byte).addAll(uz_1.id_byte).build());
    }

    public String id_break() {
        return this.id_byte.stream().sorted(id_break).map(rCv_1::toString).collect(Collectors.joining(","));
    }
}

