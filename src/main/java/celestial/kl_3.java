/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.an_3;
import celestial.eA_2;
import celestial.iB_2;
import celestial.rLQ;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.xv_3;
import java.util.Random;

public class kl_3
extends xd_3 {
    public kl_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32 == rpr_3.UP && xc_33.id_class(xu_3.id_try)) {
            rRg_12.id_finally().id_class(rfH_22, this, 20);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        rfH_2 rfH_23 = rfH_22.id_final();
        if (rrEm_12.id_break(rfH_22).id_class(rlG_2.id_break)) {
            rrEm_12.id_class((rhd_3)null, rfH_22, rqn_3.Sk, rqL_2.BLOCKS, 0.5f, 2.6f + (rrEm_12.id_int.nextFloat() - rrEm_12.id_int.nextFloat()) * 0.8f);
            rrEm_12.id_class(rLQ.id_short, (double)rfH_23.b_() + 0.5, (double)rfH_23.c_() + 0.25, (double)rfH_23.d_() + 0.5, 8, 0.5, 0.25, 0.5, 0.0);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        rYB2.id_finally().id_class(rfH_22, this, 20);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (!an_32.q() && an_32 instanceof iB_2 && !eA_2.id_implements((iB_2)an_32)) {
            an_32.id_break(rye_3.id_throws, 1.0f);
        }
        super.id_class(rYB2, rfH_22, an_32);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        xv_3.id_class((rRg_1)rrEm_12, rfH_22.id_final(), true);
    }
}

