/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dM_2;
import celestial.rJR;
import celestial.rJZ;
import celestial.rJo_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rpq_3;
import celestial.ryZ_2;
import celestial.xc_3;

public class Wo_1
extends dM_2 {
    private static final rgP_2 id_volatile = new rgn_3("container.upgrade");

    protected Wo_1(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public rJZ id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return new rJR((n, rhz_32, rhd_32) -> new rJo_1(n, rhz_32, rpq_3.id_class(rYB2, rfH_22)), id_volatile);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        rhd_32.id_class(xc_32.id_break(rYB2, rfH_22));
        rhd_32.id_break(rlB_2.t);
        return ryZ_2.CONSUME;
    }
}

