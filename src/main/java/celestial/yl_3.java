/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 */
package celestial;

import celestial.rfH_2;
import celestial.rfj_3;
import celestial.yH_2;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntSupplier;

public class yl_3 {
    private final ThreadLocal<yH_2> id_class = ThreadLocal.withInitial(() -> new yH_2());
    private final Long2ObjectLinkedOpenHashMap<int[]> id_break = new Long2ObjectLinkedOpenHashMap(256, 0.25f);
    private final ReentrantReadWriteLock id_byte = new ReentrantReadWriteLock();

    public void id_class() {
        try {
            this.id_byte.writeLock().lock();
            this.id_break.clear();
        }
        finally {
            this.id_byte.writeLock().unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(int n, int n2) {
        try {
            this.id_byte.writeLock().lock();
            for (int i = -1; i <= 1; ++i) {
                for (int j = -1; j <= 1; ++j) {
                    long l = rfj_3.id_class(n + i, n2 + j);
                    this.id_break.remove(l);
                }
            }
        }
        finally {
            this.id_byte.writeLock().unlock();
        }
    }

    public int id_class(rfH_2 rfH_22, IntSupplier intSupplier) {
        int n;
        int n2 = rfH_22.b_() >> 4;
        int n3 = rfH_22.d_() >> 4;
        yH_2 yH_22 = this.id_class.get();
        if (yH_22.id_class != n2 || yH_22.id_break != n3) {
            yH_22.id_class = n2;
            yH_22.id_break = n3;
            yH_22.id_byte = this.id_break(n2, n3);
        }
        int n4 = rfH_22.b_() & 0xF;
        int n5 = rfH_22.d_() & 0xF;
        int n6 = n5 << 4 | n4;
        int n7 = yH_22.id_byte[n6];
        if (n7 != -1) {
            return n7;
        }
        yH_22.id_byte[n6] = n = intSupplier.getAsInt();
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int[] id_break(int n, int n2) {
        int[] nArray;
        long l = rfj_3.id_class(n, n2);
        this.id_byte.readLock().lock();
        try {
            nArray = (int[])this.id_break.get(l);
        }
        finally {
            this.id_byte.readLock().unlock();
        }
        if (nArray != null) {
            return nArray;
        }
        int[] nArray2 = new int[256];
        Arrays.fill(nArray2, -1);
        try {
            this.id_byte.writeLock().lock();
            if (this.id_break.size() >= 256) {
                this.id_break.removeFirst();
            }
            this.id_break.put(l, (Object)nArray2);
        }
        finally {
            this.id_byte.writeLock().unlock();
        }
        return nArray2;
    }
}

