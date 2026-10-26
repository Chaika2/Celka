/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCV;
import celestial.rCm_1;
import celestial.rCu_1;
import celestial.rLQ;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;

public class kV_2
extends xd_3 {
    public static final rCu_1<rCV> id_volatile = rCT.j;
    public static final rCN id_final = rCT.id_return;
    public static final rCm_1 id_package = rCT.C;

    public kV_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rCV.HARP)).id_class(id_package, 0)).id_class(id_final, false));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        if (!rYB2.id_continue) {
            this.id_class(rYB2, rfH_22);
            rhd_32.id_break(rlB_2.h);
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, int n, int n2) {
        int n3 = xc_32.id_byte(id_package);
        float f = (float)Math.pow(2.0, (double)(n3 - 12) / 12.0);
        rYB2.id_class((rhd_3)null, rfH_22, xc_32.id_byte(id_volatile).id_break(), rqL_2.RECORDS, 3.0f, f);
        rYB2.id_class(rLQ.id_strictfp, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 1.2, (double)rfH_22.d_() + 0.5, (double)n3 / 24.0, 0.0, 0.0);
        return true;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        xc_32 = (xc_3)xc_32.id_class(id_package);
        rYB2.id_class(rfH_22, xc_32, 3);
        this.id_class(rYB2, rfH_22);
        rhd_32.id_break(rlB_2.X);
        return ryZ_2.CONSUME;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32 == rpr_3.DOWN ? (xc_3)xc_32.id_class(id_volatile, rCV.id_class(xc_33)) : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        boolean bl2 = rYB2.id_public(rfH_22);
        if (bl2 != xc_32.id_byte(id_final)) {
            if (bl2) {
                this.id_class(rYB2, rfH_22);
            }
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, bl2), 3);
        }
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22) {
        if (rYB2.id_byte(rfH_22.id_final()).id_catch()) {
            rYB2.id_class(rfH_22, this, 0, 0);
        }
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rCV.id_class(rxx_32.id_int().id_byte(rxx_32.id_class().id_break())));
    }
}

