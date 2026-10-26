/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfj_3;
import celestial.rrsw_3;

public abstract class rod_3
extends rrsw_3 {
    protected rod_3(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    protected int id_class(long l, long l2, int n) {
        int n2 = n;
        rfj_3 rfj_32 = new rfj_3(l);
        int n3 = rfj_32.id_break;
        int n4 = rfj_32.id_byte;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                long l3 = rfj_3.id_class(n3 + i, n4 + j);
                if (l3 == l) {
                    l3 = rfj_3.id_class;
                }
                if (l3 == l2) continue;
                int n5 = this.id_break(l3, l, this.id_byte(l3));
                if (n2 > n5) {
                    n2 = n5;
                }
                if (n2 != 0) continue;
                return n2;
            }
        }
        return n2;
    }

    @Override
    protected void id_class(long l, int n, boolean bl) {
        rfj_3 rfj_32 = new rfj_3(l);
        int n2 = rfj_32.id_break;
        int n3 = rfj_32.id_byte;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                long l2 = rfj_3.id_class(n2 + i, n3 + j);
                if (l2 == l) continue;
                this.id_break(l, l2, n, bl);
            }
        }
    }

    @Override
    protected boolean id_class(long l) {
        return l == rfj_3.id_class;
    }

    public void id_break(long l, int n, boolean bl) {
        this.id_class(rfj_3.id_class, l, n, bl);
    }

    protected abstract int id_break(long var1);

    @Override
    protected int id_break(long l, long l2, int n) {
        return l == rfj_3.id_class ? this.id_break(l2) : n + 1;
    }
}

