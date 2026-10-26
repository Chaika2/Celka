/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.xv_3;
import java.util.Random;

public class Wi_1
extends xd_3 {
    protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

    @Override
    public rjC_2 id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return rjw_3.id_break();
    }

    public Wi_1(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32 == rpr_3.UP && xc_33.id_class(xu_3.id_try)) {
            rRg_12.id_finally().id_class(rfH_22, this, 20);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        rYB2.id_finally().id_class(rfH_22, this, 20);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        xv_3.id_class((rRg_1)rrEm_12, rfH_22.id_final(), false);
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rjw_3.id_break();
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }
}

