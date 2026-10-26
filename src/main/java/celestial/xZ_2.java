/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rHQ;
import celestial.rJr_1;
import celestial.rLQ;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rXn_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class xZ_2
extends dB_2 {
    public static final rCN[] id_volatile = new rCN[]{rCT.id_extends, rCT.id_native, rCT.id_volatile};
    protected static final rjC_2 id_final = rjw_3.id_class(xd_3.id_class(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), xd_3.id_class(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

    public xZ_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile[0], false)).id_class(id_volatile[1], false)).id_class(id_volatile[2], false));
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        double d = (double)rfH_22.b_() + 0.4 + (double)random.nextFloat() * 0.2;
        double d2 = (double)rfH_22.c_() + 0.7 + (double)random.nextFloat() * 0.3;
        double d3 = (double)rfH_22.d_() + 0.4 + (double)random.nextFloat() * 0.2;
        rYB2.id_class(rLQ.id_double, d, d2, d3, 0.0, 0.0, 0.0);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile[0], id_volatile[1], id_volatile[2]);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHQ();
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHQ) {
            rhd_32.id_class((rHQ)ryO_22);
            rhd_32.id_break(rlB_2.E);
        }
        return ryZ_2.CONSUME;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (rdn_32.id_this() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHQ) {
            ((rHQ)ryO_22).id_class(rdn_32.id_continue());
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break())) {
            ryO_2 ryO_22 = rYB2.id_class(rfH_22);
            if (ryO_22 instanceof rHQ) {
                rXn_1.id_class(rYB2, rfH_22, (rXu_1)((rHQ)ryO_22));
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return rJr_1.id_class(rYB2.id_class(rfH_22));
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }
}

