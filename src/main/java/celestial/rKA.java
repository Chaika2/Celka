/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rKj_1;
import celestial.rrBw_1;

public interface rKA<R extends rKj_1>
extends rKC {
    default public int id_class(int n, int n2, int n3, int n4) {
        int n5 = this.id_class(4);
        if (n5 == 0) {
            return n;
        }
        if (n5 == 1) {
            return n2;
        }
        return n5 == 2 ? n3 : n4;
    }

    default public int id_class(int n, int n2) {
        return this.id_class(2) == 0 ? n : n2;
    }

    default public R id_class(rrBw_1 rrBw_12, R r, R r2) {
        return this.id_class(rrBw_12);
    }

    default public R id_class(rrBw_1 rrBw_12, R r) {
        return this.id_class(rrBw_12);
    }

    public R id_class(rrBw_1 var1);

    public void id_class(long var1, long var3);
}

