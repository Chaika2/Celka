/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.WD;
import celestial.We_1;
import celestial.rRR;
import celestial.rfH_2;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rrsV_2;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public abstract class zS_2
extends We_1 {
    private static boolean id_byte(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_final();
        return zS_2.id_break(xc_32, rRR2, rfH_22) && !rRR2.id_break(rfH_23).id_class(rlG_2.id_break);
    }

    protected zS_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!zS_2.id_break(xc_32, (rRR)rrEm_12, rfH_22)) {
            rrEm_12.id_break(rfH_22, xu_3.id_finally.id_continue());
        } else if (rrEm_12.id_package(rfH_22.id_final()) >= 9) {
            xc_3 xc_33 = this.id_continue();
            for (int i = 0; i < 4; ++i) {
                rfH_2 rfH_23 = rfH_22.id_break(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                if (!rrEm_12.id_byte(rfH_23).id_class(xu_3.id_finally) || !zS_2.id_byte(xc_33, rrEm_12, rfH_23)) continue;
                rrEm_12.id_break(rfH_23, (xc_3)xc_33.id_class(id_volatile, rrEm_12.id_byte(rfH_23.id_final()).id_class(xu_3.Pq)));
            }
        }
    }

    private static boolean id_break(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_final();
        xc_3 xc_33 = rRR2.id_byte(rfH_23);
        if (xc_33.id_class(xu_3.Pq) && xc_33.id_byte(WD.id_volatile) == 1) {
            return true;
        }
        if (xc_33.id_volatile().id_throws() == 8) {
            return false;
        }
        int n = rrsV_2.id_class(rRR2, xc_32, rfH_22, xc_33, rfH_23, rpr_3.UP, xc_33.id_break(rRR2, rfH_23));
        return n < rRR2.id_while();
    }
}

