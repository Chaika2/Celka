/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rHn_1;
import celestial.rRo_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;

public class dX_2
extends dB_2 {
    public static final rCm_1 id_volatile = rCT.H;
    public static final rCN id_final = rCT.id_int;
    protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

    public static void id_byte(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        if (rYB2.id_default().id_break()) {
            int n = rYB2.id_class(rRo_1.SKY, rfH_22) - rYB2.id_void();
            float f = rYB2.id_throws(1.0f);
            boolean bl = xc_32.id_byte(id_final);
            if (bl) {
                n = 15 - n;
            } else if (n > 0) {
                float f2 = f < (float)Math.PI ? 0.0f : (float)Math.PI * 2;
                f += (f2 - f) * 0.2f;
                n = Math.round((float)n * rfU_2.id_break(f));
            }
            n = rfU_2.id_class(n, 0, 15);
            if (xc_32.id_byte(id_volatile) != n) {
                rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n), 3);
            }
        }
    }

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    public dX_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0)).id_class(id_final, false));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_package;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHn_1();
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rhd_32.sD()) {
            if (rYB2.id_continue) {
                return ryZ_2.SUCCESS;
            }
            xc_3 xc_33 = (xc_3)xc_32.id_class(id_final);
            rYB2.id_class(rfH_22, xc_33, 4);
            dX_2.id_byte(xc_33, rYB2, rfH_22);
            return ryZ_2.CONSUME;
        }
        return super.id_class(xc_32, rYB2, rfH_22, rhd_32, rpm_32, rff_32);
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_volatile);
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return true;
    }
}

