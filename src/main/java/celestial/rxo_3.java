/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jj_1;
import celestial.Oo_1;
import celestial.rCT;
import celestial.rYB;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdS_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xn_3;

public class rxo_3
extends rdb_3
implements rdS_2 {
    public rxo_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public String id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            rdn_3 rdn_33 = ((rhz_3)rhd_32.id_implements[1]).id_extends(i);
            if (rdn_33.id_break() != rdy_3.Pz) continue;
            n += rdn_33.id_char();
        }
        return "" + n;
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rfH_2 rfH_22;
        rhd_3 rhd_33 = rdH_22.id_final();
        rYB rYB2 = rdH_22.id_int();
        xc_3 xc_32 = rYB2.id_byte(rfH_22 = rdH_22.id_class());
        if (xn_3.id_implements(xc_32)) {
            rYB2.id_class(rhd_33, rfH_22, rqn_3.Sc, rqL_2.BLOCKS, 1.0f, id_private.nextFloat() * 0.4f + 0.8f);
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(rCT.id_continue, true), 11);
            if (rhd_33 != null) {
                rdH_22.id_volatile().id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rdH_22.id_package()));
            }
            return ryZ_2.id_class(rYB2.id_import());
        }
        rfH_2 rfH_23 = rfH_22.id_break(rdH_22.id_finally());
        if (Jj_1.id_class(rYB2, rfH_23, rdH_22.id_case())) {
            rYB2.id_class(rhd_33, rfH_23, rqn_3.Sc, rqL_2.BLOCKS, 1.0f, id_private.nextFloat() * 0.4f + 0.8f);
            xc_3 xc_33 = Jj_1.id_class(rYB2, rfH_23);
            rYB2.id_class(rfH_23, xc_33, 11);
            rdn_3 rdn_32 = rdH_22.id_volatile();
            if (rhd_33 instanceof rhN_2) {
                Oo_1.id_goto.id_class((rhN_2)rhd_33, rfH_23, rdn_32);
                rdn_32.id_class(1, rhd_33, (T rhd_32) -> rhd_32.id_byte(rdH_22.id_package()));
            }
            return ryZ_2.id_class(rYB2.id_import());
        }
        return ryZ_2.FAIL;
    }

    @Override
    public rdn_3 id_catch() {
        return new rdn_3(rdy_3.Pz);
    }
}

