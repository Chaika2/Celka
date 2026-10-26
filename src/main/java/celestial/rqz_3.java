/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjh_3;
import celestial.rrsw_3;

public abstract class rqz_3
extends rrsw_3 {
    protected rqz_3(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    protected int id_class(long l, long l2, int n) {
        int n2 = n;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    long l3 = rjh_3.id_class(l, i, j, k);
                    if (l3 == l) {
                        l3 = Long.MAX_VALUE;
                    }
                    if (l3 == l2) continue;
                    int n3 = this.id_break(l3, l, this.id_byte(l3));
                    if (n2 > n3) {
                        n2 = n3;
                    }
                    if (n2 != 0) continue;
                    return n2;
                }
            }
        }
        return n2;
    }

    @Override
    protected void id_class(long l, int n, boolean bl) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    long l2 = rjh_3.id_class(l, i, j, k);
                    if (l2 == l) continue;
                    this.id_break(l, l2, n, bl);
                }
            }
        }
    }

    @Override
    protected boolean id_class(long l) {
        return l == Long.MAX_VALUE;
    }

    public void id_break(long l, int n, boolean bl) {
        this.id_class(Long.MAX_VALUE, l, n, bl);
    }

    protected abstract int id_break(long var1);

    @Override
    protected int id_break(long l, long l2, int n) {
        return l == Long.MAX_VALUE ? this.id_break(l2) : n + 1;
    }
}

