/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rpn_3;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class rqE_2<T>
implements rpn_3<T> {
    private int id_class;
    private final IdentityHashMap<T, Integer> id_break;
    private final List<T> id_byte;

    public rqE_2() {
        this(512);
    }

    public rqE_2(int n) {
        this.id_byte = Lists.newArrayListWithExpectedSize((int)n);
        this.id_break = new IdentityHashMap(n);
    }

    @Override
    public Iterator<T> iterator() {
        return Iterators.filter(this.id_byte.iterator(), (Predicate)Predicates.notNull());
    }

    @Override
    public final T id_class(int n) {
        return n >= 0 && n < this.id_byte.size() ? (T)this.id_byte.get(n) : null;
    }

    public int id_class() {
        return this.id_break.size();
    }

    @Override
    public int id_class(T t) {
        Integer n = this.id_break.get(t);
        return n == null ? -1 : n;
    }

    public void id_class(T t, int n) {
        this.id_break.put(t, n);
        while (this.id_byte.size() <= n) {
            this.id_byte.add(null);
        }
        this.id_byte.set(n, t);
        if (this.id_class <= n) {
            this.id_class = n + 1;
        }
    }

    public void id_break(T t) {
        this.id_class(t, this.id_class);
    }
}

