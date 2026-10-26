/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rCZ;
import celestial.rpH_2;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class rCu_1<T extends Enum<T>>
extends rCZ<T> {
    private final ImmutableSet<T> id_class;
    private final Map<String, T> id_break = Maps.newHashMap();

    protected rCu_1(String string, Class<T> clazz, Collection<T> collection) {
        super(string, clazz);
        this.id_class = ImmutableSet.copyOf(collection);
        for (Enum enum_ : collection) {
            String string2 = ((rpH_2)((Object)enum_)).id_class();
            if (this.id_break.containsKey(string2)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + string2 + "'");
            }
            this.id_break.put(string2, enum_);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof rCu_1 && super.equals(object)) {
            rCu_1 rCu_12 = (rCu_1)object;
            return this.id_class.equals(rCu_12.id_class) && this.id_break.equals(rCu_12.id_break);
        }
        return false;
    }

    public static <T extends Enum<T>> rCu_1<T> id_class(String string, Class<T> clazz) {
        return rCu_1.id_class(string, clazz, Predicates.alwaysTrue());
    }

    public static <T extends Enum<T>> rCu_1<T> id_class(String string, Class<T> clazz, Predicate<T> predicate) {
        return rCu_1.id_class(string, clazz, Arrays.stream((Enum[])clazz.getEnumConstants()).filter(predicate).collect(Collectors.toList()));
    }

    public static <T extends Enum<T>> rCu_1<T> id_class(String string, Class<T> clazz, T ... TArray) {
        return rCu_1.id_class(string, clazz, Lists.newArrayList((Object[])TArray));
    }

    public static <T extends Enum<T>> rCu_1<T> id_class(String string, Class<T> clazz, Collection<T> collection) {
        return new rCu_1<T>(string, clazz, collection);
    }

    @Override
    public Collection<T> id_class() {
        return this.id_class;
    }

    @Override
    public String id_class(T t) {
        return ((rpH_2)t).id_class();
    }

    @Override
    public int id_break() {
        int n = super.id_break();
        n = 31 * n + this.id_class.hashCode();
        return 31 * n + this.id_break.hashCode();
    }

    @Override
    public Optional<T> id_break(String string) {
        return Optional.ofNullable((Enum)this.id_break.get(string));
    }
}

