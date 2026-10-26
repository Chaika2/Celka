/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.rlb_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class rlm_3<T>
implements rlb_3<T> {
    private final ImmutableList<T> id_break;
    private final Set<T> id_byte;
    protected final Class<?> id_class;

    private static <T> Class<?> id_byte(Set<T> set) {
        if (set.isEmpty()) {
            return Void.class;
        }
        Class<?> clazz = null;
        for (T t : set) {
            if (clazz == null) {
                clazz = t.getClass();
                continue;
            }
            clazz = rlm_3.id_class(clazz, t.getClass());
        }
        return clazz;
    }

    protected rlm_3(Set<T> set, Class<?> clazz) {
        this.id_class = clazz;
        this.id_byte = set;
        this.id_break = ImmutableList.copyOf(set);
    }

    private static Class<?> id_class(Class<?> clazz, Class<?> clazz2) {
        while (!clazz.isAssignableFrom(clazz2)) {
            clazz = clazz.getSuperclass();
        }
        return clazz;
    }

    @Override
    public List<T> id_class() {
        return this.id_break;
    }

    @Override
    public boolean id_class(T t) {
        return this.id_class.isInstance(t) && this.id_byte.contains(t);
    }

    public static <T> rlm_3<T> id_break(Set<T> set) {
        return new rlm_3<T>(set, rlm_3.id_byte(set));
    }

    public static <T> rlm_3<T> id_break() {
        return new rlm_3<T>(ImmutableSet.of(), Void.class);
    }
}

