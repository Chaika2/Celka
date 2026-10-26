/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class xA_2
extends xd_3 {
    public static final rCm_1 id_volatile = rCT.z;
    protected static final rjC_2[] id_final = new rjC_2[]{xd_3.id_class(1.0, 0.0, 1.0, 15.0, 8.0, 15.0), xd_3.id_class(3.0, 0.0, 1.0, 15.0, 8.0, 15.0), xd_3.id_class(5.0, 0.0, 1.0, 15.0, 8.0, 15.0), xd_3.id_class(7.0, 0.0, 1.0, 15.0, 8.0, 15.0), xd_3.id_class(9.0, 0.0, 1.0, 15.0, 8.0, 15.0), xd_3.id_class(11.0, 0.0, 1.0, 15.0, 8.0, 15.0), xd_3.id_class(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)};

    protected xA_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final[xc_32.id_byte(id_volatile)];
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
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return rRR2.id_byte(rfH_22.id_break()).id_byte().id_break();
    }

    private ryZ_2 id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        if (!rhd_32.id_else(false)) {
            return ryZ_2.PASS;
        }
        rhd_32.id_break(rlB_2.id_switch);
        rhd_32.sk().id_class(2, 0.1f);
        int n = xc_32.id_byte(id_volatile);
        if (n < 6) {
            rRg_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n + 1), 3);
        } else {
            rRg_12.id_class(rfH_22, false);
        }
        return ryZ_2.SUCCESS;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
            if (this.id_class((rRg_1)rYB2, rfH_22, xc_32, rhd_32).id_class()) {
                return ryZ_2.SUCCESS;
            }
            if (rdn_32.id_class()) {
                return ryZ_2.CONSUME;
            }
        }
        return this.id_class((rRg_1)rYB2, rfH_22, xc_32, rhd_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32 == rpr_3.DOWN && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return (7 - xc_32.id_byte(id_volatile)) * 2;
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }
}

