/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.LT;
import celestial.Lt_1;
import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.List;

public class LI
extends AbstractList<E> {
    private final List<E> id_break = Lists.newArrayList();
    public final /* synthetic */ LT id_class;

    public LI(LT lT) {
        this.id_class = lT;
    }

    @Override
    public /* synthetic */ Object remove(int n) {
        return this.id_break(n);
    }

    @Override
    public int size() {
        return this.id_break.size();
    }

    @Override
    public /* synthetic */ Object get(int n) {
        return this.id_class(n);
    }

    @Override
    public /* synthetic */ void add(int n, Object object) {
        this.id_break(n, (Lt_1)object);
    }

    public E id_class(int n) {
        return (Lt_1)this.id_break.get(n);
    }

    public E id_class(int n, E e) {
        Lt_1 lt_1 = (Lt_1)this.id_break.set(n, e);
        this.id_class.id_case(e);
        return lt_1;
    }

    @Override
    public /* synthetic */ Object set(int n, Object object) {
        return this.id_class(n, (Lt_1)object);
    }

    public E id_break(int n) {
        return (Lt_1)this.id_break.remove(n);
    }

    public void id_break(int n, E e) {
        this.id_break.add(n, e);
        this.id_class.id_case(e);
    }
}

