/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCZ;
import celestial.rJL;
import celestial.rJR;
import celestial.rJZ;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rpq_3;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;

public class kC_2
extends kE_2 {
    private static final rgP_2 id_volatile = new rgn_3("container.loom");

    protected kC_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(p, rxx_32.id_case().id_case());
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{p});
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        rhd_32.id_class(xc_32.id_break(rYB2, rfH_22));
        rhd_32.id_break(rlB_2.n);
        return ryZ_2.CONSUME;
    }

    @Override
    public rJZ id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return new rJR((n, rhz_32, rhd_32) -> new rJL(n, rhz_32, rpq_3.id_class(rYB2, rfH_22)), id_volatile);
    }
}

