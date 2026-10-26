/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCZ;
import celestial.rCc_1;
import celestial.rJD;
import celestial.rJR;
import celestial.rJZ;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlB_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpq_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;

public class zJ_2
extends xd_3 {
    private static final rgP_2 id_package = new rgn_3("container.stonecutter");
    public static final rCc_1 id_volatile = kE_2.p;
    protected static final rjC_2 id_final = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

    public zJ_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
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
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        rhd_32.id_class(xc_32.id_break(rYB2, rfH_22));
        rhd_32.id_break(rlB_2.C);
        return ryZ_2.CONSUME;
    }

    @Override
    public rJZ id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return new rJR((n, rhz_32, rhd_32) -> new rJD(n, rhz_32, rpq_3.id_class(rYB2, rfH_22)), id_package);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_case().id_case());
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return true;
    }
}

