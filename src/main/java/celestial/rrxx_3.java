/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class rrxx_3
implements Set<HU> {
    private boolean[] id_class = new boolean[HU.s.length];

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public /* synthetic */ boolean add(Object object) {
        return this.id_class((HU)object);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public Iterator<HU> iterator() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof HU ? this.id_break((HU)object) : false;
    }

    public boolean id_class(HU hU) {
        this.id_class[hU.id_protected()] = true;
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends HU> collection) {
        throw new UnsupportedOperationException("Not supported");
    }

    public boolean id_break(HU hU) {
        return this.id_class[hU.id_protected()];
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not supported");
    }
}

