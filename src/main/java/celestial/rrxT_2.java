/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrMn_1;
import celestial.rrbb_3;
import java.util.ArrayList;
import java.util.HashSet;

public class rrxT_2 {
    private int id_class;
    private int id_break;
    private rrMn_1[] id_byte;

    public rrMn_1[] id_byte() {
        return this.id_byte;
    }

    public rrxT_2(int n, int n2, rrMn_1[] rrMn_1Array) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = rrMn_1Array;
    }

    public rrxT_2(int n, rrMn_1[] rrMn_1Array) {
        this.id_class = n;
        this.id_byte = rrMn_1Array;
    }

    public String toString() {
        return "block." + this.id_class + ":" + this.id_break + "=" + rrbb_3.id_class(this.id_byte);
    }

    public int id_class() {
        return this.id_class;
    }

    public rrMn_1[] id_class(int n) {
        ArrayList<rrMn_1> arrayList = new ArrayList<rrMn_1>();
        for (int i = 0; i < this.id_byte.length; ++i) {
            rrMn_1 rrMn_12 = this.id_byte[i];
            if (rrMn_12.id_class() != n) continue;
            arrayList.add(rrMn_12);
        }
        return arrayList.toArray(new rrMn_1[arrayList.size()]);
    }

    public boolean id_class(int n, int n2) {
        for (int i = 0; i < this.id_byte.length; ++i) {
            rrMn_1 rrMn_12 = this.id_byte[i];
            if (!rrMn_12.id_class(n, n2)) continue;
            return true;
        }
        return false;
    }

    public int id_break() {
        return this.id_break;
    }

    public int[] id_protected() {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < this.id_byte.length; ++i) {
            rrMn_1 rrMn_12 = this.id_byte[i];
            int n = rrMn_12.id_class();
            hashSet.add(n);
        }
        Integer[] integerArray = hashSet.toArray(new Integer[hashSet.size()]);
        return rrbb_3.id_class(integerArray);
    }
}

