/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nonnull
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nonnull;
import org.apache.commons.lang3.Validate;

public class rqs_3<E>
extends AbstractList<E> {
    private final List<E> id_class;
    private final E id_break;

    protected rqs_3(List<E> list, E e) {
        this.id_class = list;
        this.id_break = e;
    }

    protected rqs_3() {
        this(Lists.newArrayList(), null);
    }

    @Override
    public E remove(int n) {
        return this.id_class.remove(n);
    }

    @Override
    public int size() {
        return this.id_class.size();
    }

    @Override
    @Nonnull
    public E get(int n) {
        return this.id_class.get(n);
    }

    @Override
    public void clear() {
        if (this.id_break == null) {
            super.clear();
        } else {
            for (int i = 0; i < this.size(); ++i) {
                this.set(i, this.id_break);
            }
        }
    }

    @Override
    public void add(int n, E e) {
        Validate.notNull(e);
        this.id_class.add(n, e);
    }

    public static <E> rqs_3<E> id_class(int n, E e) {
        Validate.notNull(e);
        Object[] objectArray = new Object[n];
        Arrays.fill(objectArray, e);
        return new rqs_3<Object>(Arrays.asList(objectArray), e);
    }

    public static <E> rqs_3<E> id_class() {
        return new rqs_3<E>();
    }

    @SafeVarargs
    public static <E> rqs_3<E> id_class(E e, E ... EArray) {
        return new rqs_3<E>(Arrays.asList(EArray), e);
    }

    @Override
    public E set(int n, E e) {
        Validate.notNull(e);
        return this.id_class.set(n, e);
    }
}

