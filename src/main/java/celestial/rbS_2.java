/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.rPa_1;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rbB_2;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.xu_3;

public class rbS_2
extends rPa_1 {
    public final /* synthetic */ rbB_2 id_catch;

    public rbS_2(rbB_2 rbB_22, aA_2 aA_22, double d, int n) {
        this.id_catch = rbB_22;
        super(xu_3.OX, aA_22, d, n);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22) {
        rYB2.id_class((rhd_3)null, rfH_22, rqn_3.dn, rqL_2.BLOCKS, 0.7f, 0.9f + rYB2.id_int.nextFloat() * 0.2f);
    }

    @Override
    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        rRg_12.id_class((rhd_3)null, rfH_22, rqn_3.Wo, rqL_2.HOSTILE, 0.5f, 0.9f + rbB_2.id_class(this.id_catch).nextFloat() * 0.2f);
    }

    @Override
    public double id_private() {
        return 1.14;
    }
}

