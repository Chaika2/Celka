/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rpB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rsE_2;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xr_3;
import celestial.xu_3;
import celestial.xy_3;
import celestial.zO_2;
import celestial.zh_3;

public class WO
extends zh_3 {
    protected WO(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_33, rpm_3 rpm_32, rff_3 rff_32) {
        rdn_3 rdn_32 = rhd_33.id_protected(rpm_32);
        if (rdn_32.id_break() == rdy_3.JJ) {
            if (!rYB2.id_continue) {
                rpr_3 rpr_32 = rff_32.id_break();
                rpr_3 rpr_33 = rpr_32.id_final() == rpB_2.Y ? rhd_33.Pg().id_case() : rpr_32;
                rYB2.id_class((rhd_3)null, rfH_22, rqn_3.XS, rqL_2.BLOCKS, 1.0f, 1.0f);
                rYB2.id_class(rfH_22, (xc_3)xu_3.Br.id_continue().id_class(xy_3.id_volatile, rpr_33), 11);
                rsE_2 rsE_22 = new rsE_2(rYB2, (double)rfH_22.b_() + 0.5 + (double)rpr_33.id_implements() * 0.65, (double)rfH_22.c_() + 0.1, (double)rfH_22.d_() + 0.5 + (double)rpr_33.id_extends() * 0.65, new rdn_3(rdy_3.Jk, 4));
                rsE_22.id_catch(0.05 * (double)rpr_33.id_implements() + rYB2.id_int.nextDouble() * 0.02, 0.05, 0.05 * (double)rpr_33.id_extends() + rYB2.id_int.nextDouble() * 0.02);
                rYB2.a_(rsE_22);
                rdn_32.id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rpm_32));
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return super.id_class(xc_32, rYB2, rfH_22, rhd_33, rpm_32, rff_32);
    }

    @Override
    public zO_2 id_break() {
        return (zO_2)xu_3.Bo;
    }

    @Override
    public xr_3 id_implements() {
        return (xr_3)xu_3.BR;
    }
}

