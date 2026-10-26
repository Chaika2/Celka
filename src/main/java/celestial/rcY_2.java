/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcD_2;
import celestial.rcL_2;
import celestial.rcM_2;
import celestial.rcN_2;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rch_3;
import celestial.rcn_3;
import celestial.rcq_3;
import celestial.rct_3;
import celestial.rcu_3;
import celestial.rcv_3;
import celestial.rcy_3;
import celestial.rcz_3;

public class rcY_2 {
    private static final rcv_3<?>[] id_class = new rcv_3[]{rcN_2.id_class, rch_3.id_class, rcD_2.id_class, rcn_3.id_class, rct_3.id_class, rcu_3.id_break, rcz_3.id_break, rcM_2.id_class, rca_3.id_class, rcy_3.id_class, rcd_3.id_break, rcL_2.id_class, rcq_3.id_class};

    public static rcv_3<?> id_class(int n) {
        return n >= 0 && n < id_class.length ? id_class[n] : rcv_3.id_class(n);
    }
}

