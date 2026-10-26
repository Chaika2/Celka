/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  it.unimi.dsi.fastutil.ints.IntSet
 */
package celestial;

import celestial.rrWp_1;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntSet;

public abstract class rrWy_1<T> {
    private final int id_class;
    private long id_break;
    private Int2ObjectOpenHashMap<rrWp_1<T>> id_byte = new Int2ObjectOpenHashMap();

    public rrWy_1(int n) {
        this.id_class = n;
    }

    public T id_class(int n) {
        rrWp_1<T> rrWp_12;
        long l = System.currentTimeMillis();
        if (!this.id_byte.isEmpty() && l >= this.id_break) {
            this.id_break = l + (long)this.id_class;
            long l2 = l - (long)this.id_class;
            IntSet intSet = this.id_byte.keySet();
            IntIterator intIterator = intSet.iterator();
            while (intIterator.hasNext()) {
                rrWp_1 rrWp_13;
                int n2 = intIterator.nextInt();
                if (n2 == n || (rrWp_13 = (rrWp_1)this.id_byte.get(n2)).id_break() > l2) continue;
                intIterator.remove();
            }
        }
        if ((rrWp_12 = (rrWp_1<T>)this.id_byte.get(n)) == null) {
            T t = this.id_break();
            rrWp_12 = new rrWp_1<T>(t);
            this.id_byte.put(n, rrWp_12);
        }
        rrWp_12.id_class(l);
        return rrWp_12.id_class();
    }

    protected abstract T id_break();
}

