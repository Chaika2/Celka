/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rKG;
import celestial.rSa_1;
import celestial.rYB;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rrEm_1;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xu_3;
import java.util.List;

public class rxq_3
extends rdb_3 {
    public rxq_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        double d;
        double d2;
        rfH_2 rfH_22;
        rYB rYB2 = rdH_22.id_int();
        xc_3 xc_32 = rYB2.id_byte(rfH_22 = rdH_22.id_class());
        if (!xc_32.id_class(xu_3.rg) && !xc_32.id_class(xu_3.id_while)) {
            return ryZ_2.FAIL;
        }
        rfH_2 rfH_23 = rfH_22.id_final();
        if (!rYB2.id_finally(rfH_23)) {
            return ryZ_2.FAIL;
        }
        double d3 = rfH_23.b_();
        List<an_3> list = rYB2.id_class((an_3)null, new rfl_3(d3, d2 = (double)rfH_23.c_(), d = (double)rfH_23.d_(), d3 + 1.0, d2 + 2.0, d + 1.0));
        if (!list.isEmpty()) {
            return ryZ_2.FAIL;
        }
        if (rYB2 instanceof rrEm_1) {
            rSa_1 rSa_12 = new rSa_1(rYB2, d3 + 0.5, d2, d + 0.5);
            rSa_12.id_class(false);
            rYB2.a_(rSa_12);
            rKG rKG2 = ((rrEm_1)rYB2).Q();
            if (rKG2 != null) {
                rKG2.id_throws();
            }
        }
        rdH_22.id_volatile().id_catch(1);
        return ryZ_2.id_class(rYB2.id_continue);
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        return true;
    }
}

