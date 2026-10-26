/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ryI_2<T>
extends AbstractCollection<T> {
    private final Map<Class<?>, List<T>> id_class = Maps.newHashMap();
    private final Class<T> id_break;
    private final List<T> id_byte = Lists.newArrayList();

    public ryI_2(Class<T> clazz) {
        this.id_break = clazz;
        this.id_class.put(clazz, this.id_byte);
    }

    @Override
    public boolean remove(Object object) {
        boolean bl = false;
        for (Map.Entry<Class<?>, List<T>> entry : this.id_class.entrySet()) {
            if (!entry.getKey().isInstance(object)) continue;
            List<T> list = entry.getValue();
            bl |= list.remove(object);
        }
        return bl;
    }

    @Override
    public int size() {
        return this.id_byte.size();
    }

    @Override
    public boolean add(T t) {
        boolean bl = false;
        for (Map.Entry<Class<?>, List<T>> entry : this.id_class.entrySet()) {
            if (!entry.getKey().isInstance(t)) continue;
            bl |= entry.getValue().add(t);
        }
        return bl;
    }

    @Override
    public Iterator<T> iterator() {
        return this.id_byte.isEmpty() ? Collections.emptyIterator() : Iterators.unmodifiableIterator(this.id_byte.iterator());
    }

    @Override
    public boolean contains(Object object) {
        return this.id_class(object.getClass()).contains(object);
    }

    public List<T> id_class() {
        return ImmutableList.copyOf(this.id_byte);
    }

    public <S> Collection<S> id_class(Class<S> clazz2) {
        if (!this.id_break.isAssignableFrom(clazz2)) {
            throw new IllegalArgumentException("Don't know how to search for " + clazz2);
        }
        List list = this.id_class.computeIfAbsent(clazz2, clazz -> this.id_byte.stream().filter(clazz::isInstance).collect(Collectors.toList()));
        return Collections.unmodifiableCollection(list);
    }
}

