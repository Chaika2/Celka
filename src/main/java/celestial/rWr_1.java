/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntList
 */
package celestial;

import celestial.rVL;
import celestial.rWP;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rkw_3;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntList;

public class rWr_1 {
    public final Int2IntMap id_class = new Int2IntOpenHashMap();

    public static int id_byte(rdn_3 rdn_32) {
        return rVL.id_for.id_class(rdn_32.id_break());
    }

    public void id_class() {
        this.id_class.clear();
    }

    public boolean id_class(rkw_3<?> rkw_32, IntList intList) {
        return this.id_class(rkw_32, intList, 1);
    }

    public boolean id_class(rkw_3<?> rkw_32, IntList intList, int n) {
        return new rWP(this, rkw_32).id_class(n, intList);
    }

    public int id_class(rkw_3<?> rkw_32, int n, IntList intList) {
        return new rWP(this, rkw_32).id_break(n, intList);
    }

    public static rdn_3 id_class(int n) {
        return n == 0 ? rdn_3.id_break : new rdn_3(rdb_3.id_break(n));
    }

    public void id_class(rdn_3 rdn_32) {
        if (!(rdn_32.id_case() || rdn_32.id_public() || rdn_32.id_this())) {
            this.id_break(rdn_32);
        }
    }

    public void id_class(rdn_3 rdn_32, int n) {
        if (!rdn_32.id_class()) {
            int n2 = rWr_1.id_byte(rdn_32);
            int n3 = Math.min(n, rdn_32.id_char());
            this.id_break(n2, n3);
        }
    }

    public int id_class(int n, int n2) {
        int n3 = this.id_class.get(n);
        if (n3 >= n2) {
            this.id_class.put(n, n3 - n2);
            return n;
        }
        return 0;
    }

    public void id_break(int n, int n2) {
        this.id_class.put(n, this.id_class.get(n) + n2);
    }

    public void id_break(rdn_3 rdn_32) {
        this.id_class(rdn_32, 64);
    }

    public int id_break(rkw_3<?> rkw_32, IntList intList) {
        return this.id_class(rkw_32, Integer.MAX_VALUE, intList);
    }

    public boolean id_break(int n) {
        return this.id_class.get(n) > 0;
    }
}

