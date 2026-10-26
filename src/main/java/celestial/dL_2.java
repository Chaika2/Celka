/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.an_3;
import celestial.dB_2;
import celestial.rHp_1;
import celestial.rLQ;
import celestial.rRq_1;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rqM_2;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class dL_2
extends dB_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

    protected dL_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        double d = (double)rfH_22.b_() + random.nextDouble();
        double d2 = (double)rfH_22.c_() + 0.8;
        double d3 = (double)rfH_22.d_() + random.nextDouble();
        rYB2.id_class(rLQ.id_double, d, d2, d3, 0.0, 0.0, 0.0);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rXs_1 rXs_12) {
        return false;
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return rdn_3.id_break;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHp_1();
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (rYB2 instanceof rrEm_1 && !an_32.Pm() && !an_32.BP() && an_32.I() && rjw_3.id_byte(rjw_3.id_class(an_32.rN().id_protected(-rfH_22.b_(), -rfH_22.c_(), -rfH_22.d_())), xc_32.id_finally(rYB2, rfH_22), rjN_2.id_implements)) {
            rqM_2<rYB> rqM_22 = rYB2.E() == rYB.id_throws ? rYB.id_byte : rYB.id_throws;
            rrEm_1 rrEm_12 = ((rrEm_1)rYB2).id_const().id_class(rqM_22);
            if (rrEm_12 == null) {
                return;
            }
            an_32.id_class(rrEm_12);
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }
}

