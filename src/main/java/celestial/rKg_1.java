/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap
 */
package celestial;

import celestial.rKj_1;
import celestial.rfj_3;
import celestial.rrBw_1;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;

public final class rKg_1
implements rKj_1 {
    private final rrBw_1 id_class;
    private final Long2IntLinkedOpenHashMap id_break;
    private final int id_byte;

    public rKg_1(Long2IntLinkedOpenHashMap long2IntLinkedOpenHashMap, int n, rrBw_1 rrBw_12) {
        this.id_break = long2IntLinkedOpenHashMap;
        this.id_byte = n;
        this.id_class = rrBw_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int id_class(int n, int n2) {
        long l = rfj_3.id_class(n, n2);
        Long2IntLinkedOpenHashMap long2IntLinkedOpenHashMap = this.id_break;
        synchronized (long2IntLinkedOpenHashMap) {
            int n3 = this.id_break.get(l);
            if (n3 != Integer.MIN_VALUE) {
                return n3;
            }
            int n4 = this.id_class.apply(n, n2);
            this.id_break.put(l, n4);
            if (this.id_break.size() > this.id_byte) {
                for (int i = 0; i < this.id_byte / 16; ++i) {
                    this.id_break.removeFirstInt();
                }
            }
            return n4;
        }
    }

    public int id_class() {
        return this.id_byte;
    }
}

