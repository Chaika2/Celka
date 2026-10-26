/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayTable
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Table
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
package celestial;

import celestial.rCC;
import celestial.rCZ;
import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class rCn_1<O, S> {
    private static final Function<Map.Entry<rCZ<?>, Comparable<?>>, String> id_class = new rCC();
    protected final O id_byte;
    private final ImmutableMap<rCZ<?>, Comparable<?>> id_break;
    private Table<rCZ<?>, Comparable<?>, S> id_throws;
    protected final MapCodec<S> id_protected;

    public <T extends Comparable<T>> T id_byte(rCZ<T> rCZ2) {
        Comparable comparable = (Comparable)this.id_break.get(rCZ2);
        if (comparable == null) {
            throw new IllegalArgumentException("Cannot get property " + rCZ2 + " as it does not exist in " + this.id_byte);
        }
        return (T)((Comparable)rCZ2.id_case().cast(comparable));
    }

    protected rCn_1(O o, ImmutableMap<rCZ<?>, Comparable<?>> immutableMap, MapCodec<S> mapCodec) {
        this.id_byte = o;
        this.id_break = immutableMap;
        this.id_protected = mapCodec;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id_byte);
        if (!this.id_goto().isEmpty()) {
            stringBuilder.append('[');
            stringBuilder.append(this.id_goto().entrySet().stream().map(id_class).collect(Collectors.joining(",")));
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    protected static <O, S extends rCn_1<O, S>> Codec<S> id_class(Codec<O> codec, Function<O, S> function) {
        return codec.dispatch("Name", rCn_12 -> rCn_12.id_byte, object -> {
            rCn_1 rCn_12 = (rCn_1)function.apply(object);
            return rCn_12.id_goto().isEmpty() ? Codec.unit((Object)rCn_12) : rCn_12.id_protected.fieldOf("Properties").codec();
        });
    }

    public void id_class(Map<Map<rCZ<?>, Comparable<?>>, S> map) {
        if (this.id_throws != null) {
            throw new IllegalStateException();
        }
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (Map.Entry entry : this.id_break.entrySet()) {
            rCZ rCZ2 = (rCZ)entry.getKey();
            for (Comparable comparable : rCZ2.id_class()) {
                if (comparable == entry.getValue()) continue;
                hashBasedTable.put((Object)rCZ2, (Object)comparable, map.get(this.id_break(rCZ2, comparable)));
            }
        }
        this.id_throws = hashBasedTable.isEmpty() ? hashBasedTable : ArrayTable.create((Table)hashBasedTable);
    }

    public <T extends Comparable<T>, V extends T> S id_class(rCZ<T> rCZ2, V v) {
        Comparable comparable = (Comparable)this.id_break.get(rCZ2);
        if (comparable == null) {
            throw new IllegalArgumentException("Cannot set property " + rCZ2 + " as it does not exist in " + this.id_byte);
        }
        if (comparable == v) {
            return (S)this;
        }
        Object object = this.id_throws.get(rCZ2, v);
        if (object == null) {
            throw new IllegalArgumentException("Cannot set property " + rCZ2 + " to " + v + " on " + this.id_byte + ", it is not an allowed value");
        }
        return (S)object;
    }

    protected static <T> T id_class(Collection<T> collection, T t) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(t)) continue;
            if (iterator.hasNext()) {
                return iterator.next();
            }
            return collection.iterator().next();
        }
        return iterator.next();
    }

    public <T extends Comparable<T>> S id_class(rCZ<T> rCZ2) {
        return this.id_class(rCZ2, (Comparable)rCn_1.id_class(rCZ2.id_class(), this.id_byte(rCZ2)));
    }

    public <T extends Comparable<T>> boolean id_break(rCZ<T> rCZ2) {
        return this.id_break.containsKey(rCZ2);
    }

    private Map<rCZ<?>, Comparable<?>> id_break(rCZ<?> rCZ2, Comparable<?> comparable) {
        HashMap hashMap = Maps.newHashMap(this.id_break);
        hashMap.put(rCZ2, comparable);
        return hashMap;
    }

    public ImmutableMap<rCZ<?>, Comparable<?>> id_goto() {
        return this.id_break;
    }

    public Collection<rCZ> id_public() {
        return Collections.unmodifiableCollection(this.id_break.keySet());
    }

    public <T extends Comparable<T>> Optional<T> id_protected(rCZ<T> rCZ2) {
        Comparable comparable = (Comparable)this.id_break.get(rCZ2);
        return comparable == null ? Optional.empty() : Optional.of((Comparable)rCZ2.id_case().cast(comparable));
    }
}

