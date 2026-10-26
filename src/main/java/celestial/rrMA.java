/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QF;
import celestial.Qw_1;
import celestial.VN;
import celestial.rgP_2;

public class rrMA
extends VN {
    public rrMA(String string) {
        super(string, null, null);
        this.rF = this::id_break;
        this.rL = this::id_class;
    }

    public rgP_2 id_class(Qw_1 qw_1, VN vN) {
        return qw_1.id_break(vN);
    }

    public void id_break(Qw_1 qw_1, int n) {
        qw_1.id_class((QF)this, n);
    }
}

