/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.iB_2;
import celestial.kO_2;
import celestial.rHO;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rxL_2;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;

public class xG_2
extends dB_2
implements kO_2 {
    public xG_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHO) {
            rhd_32.id_class((rHO)ryO_22);
            rhd_32.id_break(rlB_2.G);
        }
        return ryZ_2.CONSUME;
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (rdn_32.id_this() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHO) {
            ((rHO)ryO_22).id_class(rdn_32.id_continue());
        }
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHO();
    }

    @Override
    public rxL_2 id_break() {
        return rxL_2.WHITE;
    }
}

