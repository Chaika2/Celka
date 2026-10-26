/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kX_2;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rUd_1;
import celestial.rUq_1;
import celestial.rYB;
import celestial.res_3;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rrsV_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class kg_3
extends xd_3
implements kX_2 {
    protected kg_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return rRq_12.id_byte(rfH_22.id_final()).id_catch();
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        xc_3 xc_33 = rrEm_12.id_byte(rfH_22);
        rfH_2 rfH_23 = rfH_22.id_final();
        if (xc_33.id_class(xu_3.XL)) {
            rUq_1.id_class(rrEm_12, random, rfH_23, rUd_1.id_extends, 3, 1);
        } else if (xc_33.id_class(xu_3.Xz)) {
            rUq_1.id_class(rrEm_12, random, rfH_23, rUd_1.id_native, 3, 1);
            rUq_1.id_class(rrEm_12, random, rfH_23, rUd_1.id_volatile, 3, 1);
            if (random.nextInt(8) == 0) {
                res_3.id_class((rRg_1)rrEm_12, random, rfH_23, 3, 1, 2);
            }
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!kg_3.id_break(xc_32, (rRR)rrEm_12, rfH_22)) {
            rrEm_12.id_break(rfH_22, xu_3.PR.id_continue());
        }
    }

    private static boolean id_break(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_final();
        xc_3 xc_33 = rRR2.id_byte(rfH_23);
        int n = rrsV_2.id_class(rRR2, xc_32, rfH_22, xc_33, rfH_23, rpr_3.UP, xc_33.id_break(rRR2, rfH_23));
        return n < rRR2.id_while();
    }
}

