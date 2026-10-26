/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QP;
import celestial.an_3;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlG_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class xL_2
extends xd_3 {
    public static final rCm_1 id_volatile = rCT.k;
    protected static final rjC_2 id_final = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
    protected static final rjC_2 id_package = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    protected xL_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            xc_3 xc_33 = rRR2.id_byte(rfH_22.id_break(rpr_32));
            QP qP = xc_33.id_byte();
            if (!qP.id_break() && !rRR2.id_break(rfH_22.id_break(rpr_32)).id_class(rlG_2.id_byte)) continue;
            return false;
        }
        xc_3 xc_34 = rRR2.id_byte(rfH_22.id_break());
        return (xc_34.id_class(xu_3.Pw) || xc_34.id_class(xu_3.id_throw) || xc_34.id_class(xu_3.id_interface)) && !rRR2.id_byte(rfH_22.id_final()).id_byte().id_class();
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        an_32.id_break(rye_3.id_finally, 1.0f);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (!xc_32.id_class(rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        rfH_2 rfH_23 = rfH_22.id_final();
        if (rrEm_12.id_finally(rfH_23)) {
            int n = 1;
            while (rrEm_12.id_byte(rfH_22.id_catch(n)).id_class(this)) {
                ++n;
            }
            if (n < 3) {
                int n2 = xc_32.id_byte(id_volatile);
                if (n2 == 15) {
                    rrEm_12.id_break(rfH_23, this.id_continue());
                    xc_3 xc_33 = (xc_3)xc_32.id_class(id_volatile, 0);
                    rrEm_12.id_class(rfH_22, xc_33, 4);
                    xc_33.id_class(rrEm_12, rfH_23, this, rfH_22, false);
                } else {
                    rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n2 + 1), 4);
                }
            }
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_package;
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!xc_32.id_class((rRR)rrEm_12, rfH_22)) {
            rrEm_12.id_break(rfH_22, true);
        }
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }
}

