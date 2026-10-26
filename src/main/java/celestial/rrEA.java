/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rod_3;
import celestial.rqv_3;
import celestial.rrEF;
import celestial.rrEG;
import celestial.rrEL;
import celestial.rrEx_1;

public class rrEA
extends rod_3 {
    public final /* synthetic */ rrEL id_class;

    @Override
    protected int id_byte(long l) {
        rrEG rrEG2;
        if (!this.id_class.id_class(l) && (rrEG2 = this.id_class.id_break(l)) != null) {
            return rrEG2.id_finally();
        }
        return rrEx_1.id_break + 1;
    }

    public rrEA(rrEL rrEL2) {
        this.id_class = rrEL2;
        super(rrEx_1.id_break + 2, 256, 256);
    }

    @Override
    protected void id_class(long l, int n) {
        int n2;
        rrEG rrEG2 = this.id_class.id_break(l);
        int n3 = n2 = rrEG2 == null ? rrEx_1.id_break + 1 : rrEG2.id_finally();
        if (n2 != n && (rrEG2 = this.id_class.id_class(l, n, rrEG2, n2)) != null) {
            this.id_class.id_private.add(rrEG2);
        }
    }

    @Override
    protected int id_break(long l) {
        rqv_3 rqv_32 = (rqv_3)this.id_class.id_protected.get(l);
        if (rqv_32 == null) {
            return Integer.MAX_VALUE;
        }
        return rqv_32.isEmpty() ? Integer.MAX_VALUE : ((rrEF)rqv_32.id_class()).id_break();
    }

    public int id_break(int n) {
        return this.id_class(n);
    }
}

