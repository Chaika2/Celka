/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlG_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class zW_2
extends xd_3 {
    public static final rCm_1 id_volatile = rCT.k;
    protected static final rjC_2 id_final = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

    protected zW_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (!xc_32.id_class(rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (rrEm_12.id_finally(rfH_22.id_final())) {
            int n = 1;
            while (rrEm_12.id_byte(rfH_22.id_catch(n)).id_class(this)) {
                ++n;
            }
            if (n < 3) {
                int n2 = xc_32.id_byte(id_volatile);
                if (n2 == 15) {
                    rrEm_12.id_break(rfH_22.id_final(), this.id_continue());
                    rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, 0), 4);
                } else {
                    rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n2 + 1), 4);
                }
            }
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_33 = rRR2.id_byte(rfH_22.id_break());
        if (xc_33.id_break() == this) {
            return true;
        }
        if (xc_33.id_class(xu_3.id_implements) || xc_33.id_class(xu_3.id_finally) || xc_33.id_class(xu_3.id_extends) || xc_33.id_class(xu_3.id_native) || xc_33.id_class(xu_3.id_throw) || xc_33.id_class(xu_3.id_interface)) {
            rfH_2 rfH_23 = rfH_22.id_break();
            for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
                xc_3 xc_34 = rRR2.id_byte(rfH_23.id_break(rpr_32));
                rXE rXE2 = rRR2.id_break(rfH_23.id_break(rpr_32));
                if (!rXE2.id_class(rlG_2.id_break) && !xc_34.id_class(xu_3.bj)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!xc_32.id_class((rRR)rrEm_12, rfH_22)) {
            rrEm_12.id_break(rfH_22, true);
        }
    }
}

