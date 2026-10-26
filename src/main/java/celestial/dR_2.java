/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kk_3;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rja_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class dR_2
extends kk_3 {
    public static final rCm_1 id_volatile = rCT.J;

    public dR_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return rdn_3.id_break;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (xd_32 == this && this.id_class((rRq_1)rYB2, rfH_22, 2)) {
            this.id_byte(xc_32, rYB2, rfH_22);
        }
        super.id_class(xc_32, rYB2, rfH_22, xd_32, rfH_23, bl);
    }

    private boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, int n) {
        int n2 = 0;
        rfw_3 rfw_32 = new rfw_3();
        for (rpr_3 rpr_32 : rpr_3.values()) {
            rfw_32.id_class((rja_3)rfH_22, rpr_32);
            if (!rRq_12.id_byte(rfw_32).id_class(this) || ++n2 < n) continue;
            return false;
        }
        return true;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        this.id_break(xc_32, rrEm_12, rfH_22, random);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if ((random.nextInt(3) == 0 || this.id_class((rRq_1)rrEm_12, rfH_22, 4)) && rrEm_12.id_package(rfH_22) > 11 - xc_32.id_byte(id_volatile) - xc_32.id_break((rRq_1)rrEm_12, rfH_22) && this.id_throws(xc_32, rrEm_12, rfH_22)) {
            rfw_3 rfw_32 = new rfw_3();
            for (rpr_3 rpr_32 : rpr_3.values()) {
                rfw_32.id_class((rja_3)rfH_22, rpr_32);
                xc_3 xc_33 = rrEm_12.id_byte(rfw_32);
                if (!xc_33.id_class(this) || this.id_throws(xc_33, rrEm_12, (rfH_2)rfw_32)) continue;
                rrEm_12.id_synchronized().id_class(rfw_32, this, rfU_2.id_class(random, 20, 40));
            }
        } else {
            rrEm_12.id_synchronized().id_class(rfH_22, this, rfU_2.id_class(random, 20, 40));
        }
    }

    private boolean id_throws(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        int n = xc_32.id_byte(id_volatile);
        if (n < 3) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n + 1), 2);
            return false;
        }
        this.id_byte(xc_32, rYB2, rfH_22);
        return true;
    }
}

