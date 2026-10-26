/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rLQ;
import celestial.rLx_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class zZ_2
extends xd_3 {
    protected static final rjC_2 id_int = xd_3.id_class(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
    protected final rLx_1 id_new;

    protected zZ_2(Jq_1 jq_1, rLx_1 rLx_12) {
        super(jq_1);
        this.id_new = rLx_12;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return zZ_2.id_class(rRR2, rfH_22.id_break(), rpr_3.UP);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        double d = (double)rfH_22.b_() + 0.5;
        double d2 = (double)rfH_22.c_() + 0.7;
        double d3 = (double)rfH_22.d_() + 0.5;
        rYB2.id_class(rLQ.id_double, d, d2, d3, 0.0, 0.0, 0.0);
        rYB2.id_class(this.id_new, d, d2, d3, 0.0, 0.0, 0.0);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_int;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32 == rpr_3.DOWN && !this.id_class(xc_32, rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }
}

