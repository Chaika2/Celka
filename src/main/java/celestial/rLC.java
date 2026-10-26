/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.an_3;
import celestial.rLq_1;
import celestial.rLv_1;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.ruu_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class rLC {
    private final List<rLq_1> id_class;
    private rLq_1[] id_break = new rLq_1[0];
    private rLq_1[] id_byte = new rLq_1[0];
    private Set<rLv_1> id_protected;
    private int id_throws;
    private final rfH_2 id_case;
    private final float id_catch;
    private final boolean id_private;

    public boolean id_byte() {
        return this.id_throws >= this.id_class.size();
    }

    public void id_byte(int n) {
        this.id_throws = n;
    }

    public rLC(List<rLq_1> list, rfH_2 rfH_22, boolean bl) {
        this.id_class = list;
        this.id_case = rfH_22;
        this.id_catch = list.isEmpty() ? Float.MAX_VALUE : this.id_class.get(this.id_class.size() - 1).id_class(this.id_case);
        this.id_private = bl;
    }

    public String toString() {
        return "Path(length=" + this.id_class.size() + ")";
    }

    public boolean id_class(rLC rLC2) {
        if (rLC2 == null) {
            return false;
        }
        if (rLC2.id_class.size() != this.id_class.size()) {
            return false;
        }
        for (int i = 0; i < this.id_class.size(); ++i) {
            rLq_1 rLq_12 = this.id_class.get(i);
            rLq_1 rLq_13 = rLC2.id_class.get(i);
            if (rLq_12.id_class == rLq_13.id_class && rLq_12.id_break == rLq_13.id_break && rLq_12.id_byte == rLq_13.id_byte) continue;
            return false;
        }
        return true;
    }

    public rjU_2 id_class(an_3 an_32) {
        return this.id_class(an_32, this.id_throws);
    }

    public rjU_2 id_class(an_3 an_32, int n) {
        rLq_1 rLq_12 = this.id_class.get(n);
        double d = (double)rLq_12.id_class + (double)((int)(an_32.PN() + 1.0f)) * 0.5;
        double d2 = rLq_12.id_break;
        double d3 = (double)rLq_12.id_byte + (double)((int)(an_32.PN() + 1.0f)) * 0.5;
        return new rjU_2(d, d2, d3);
    }

    public static rLC id_class(ruu_3 ruu_32) {
        boolean bl = ruu_32.readBoolean();
        int n = ruu_32.readInt();
        int n2 = ruu_32.readInt();
        HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < n2; ++i) {
            hashSet.add(rLv_1.id_class(ruu_32));
        }
        rfH_2 rfH_22 = new rfH_2(ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt());
        ArrayList arrayList = Lists.newArrayList();
        int n3 = ruu_32.readInt();
        for (int i = 0; i < n3; ++i) {
            arrayList.add(rLq_1.id_break(ruu_32));
        }
        rLq_1[] rLq_1Array = new rLq_1[ruu_32.readInt()];
        for (int i = 0; i < rLq_1Array.length; ++i) {
            rLq_1Array[i] = rLq_1.id_break(ruu_32);
        }
        rLq_1[] rLq_1Array2 = new rLq_1[ruu_32.readInt()];
        for (int i = 0; i < rLq_1Array2.length; ++i) {
            rLq_1Array2[i] = rLq_1.id_break(ruu_32);
        }
        rLC rLC2 = new rLC(arrayList, rfH_22, bl);
        rLC2.id_break = rLq_1Array;
        rLC2.id_byte = rLq_1Array2;
        rLC2.id_protected = hashSet;
        rLC2.id_throws = n;
        return rLC2;
    }

    public void id_class() {
        ++this.id_throws;
    }

    public void id_class(int n, rLq_1 rLq_12) {
        this.id_class.set(n, rLq_12);
    }

    public rLq_1 id_class(int n) {
        return this.id_class.get(n);
    }

    public boolean id_break() {
        return this.id_throws <= 0;
    }

    public void id_break(int n) {
        if (this.id_class.size() > n) {
            this.id_class.subList(n, this.id_class.size()).clear();
        }
    }

    public int id_throws() {
        return this.id_class.size();
    }

    public boolean id_finally() {
        return this.id_private;
    }

    public rfH_2 id_catch() {
        return this.id_class.get(this.id_throws).id_byte();
    }

    public rLq_1[] id_extends() {
        return this.id_break;
    }

    public int id_case() {
        return this.id_throws;
    }

    public rLq_1 id_implements() {
        return this.id_throws > 0 ? this.id_class.get(this.id_throws - 1) : null;
    }

    public rLq_1 id_protected() {
        return !this.id_class.isEmpty() ? this.id_class.get(this.id_class.size() - 1) : null;
    }

    public rfH_2 id_protected(int n) {
        return this.id_class.get(n).id_byte();
    }

    public rLq_1 id_private() {
        return this.id_class.get(this.id_throws);
    }

    public float id_final() {
        return this.id_catch;
    }

    public rfH_2 id_volatile() {
        return this.id_case;
    }

    public rLq_1[] id_native() {
        return this.id_byte;
    }
}

