/*
 * Decompiled with CFR 0.152.
 */
package celestial.util;

import java.util.ArrayList;
import java.util.Collection;

public class ReversedList<T>
extends ArrayList<T> {
    @Override
    public void add(int var1, T var2) {
        super.add(this.size() - var1, var2);
    }

    @Override
    public boolean add(T var1) {
        super.add(0, var1);
        return true;
    }

    @Override
    public boolean addAll(int var1, Collection<? extends T> var2) {
        return super.addAll(this.size() - var1, new ReversedList<T>());
    }

    @Override
    public boolean addAll(Collection<? extends T> var1) {
        return super.addAll(0, new ReversedList<T>());
    }
}

