/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.iO_2;
import celestial.rCa_1;
import celestial.rGB;
import celestial.rRh_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rXE;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rrEj_1;
import celestial.rrEm_1;
import celestial.rrEq_1;
import celestial.xc_3;
import java.util.Random;

public class rrEI
implements rrEq_1 {
    private int id_class;

    @Override
    public int id_class(rrEm_1 rrEm_12, boolean bl, boolean bl2) {
        if (!bl) {
            return 0;
        }
        if (!rrEm_12.B().id_break(rRu_1.id_goto)) {
            return 0;
        }
        Random random = rrEm_12.id_int;
        --this.id_class;
        if (this.id_class > 0) {
            return 0;
        }
        this.id_class += (60 + random.nextInt(60)) * 20;
        if (rrEm_12.id_void() < 5 && rrEm_12.id_default().id_break()) {
            return 0;
        }
        int n = 0;
        for (rhd_3 rhd_32 : rrEm_12.id_continue()) {
            rXE rXE2;
            xc_3 xc_32;
            rfH_2 rfH_22;
            rRh_1 rRh_12;
            if (rhd_32.id_native()) continue;
            rfH_2 rfH_23 = rhd_32.Bs();
            if (rrEm_12.id_default().id_break() && (rfH_23.c_() < rrEm_12.id_short() || !rrEm_12.id_case(rfH_23)) || !(rRh_12 = rrEm_12.id_throws(rfH_23)).id_class(random.nextFloat() * 3.0f)) continue;
            rCa_1 rCa_12 = ((rhN_2)rhd_32).id_long();
            int n2 = rfU_2.id_class(rCa_12.id_class(rlB_2.id_implements.id_break(rlB_2.id_volatile)), 1, Integer.MAX_VALUE);
            int n3 = 24000;
            if (random.nextInt(n2) < 72000 || !rrEj_1.id_class((rRq_1)rrEm_12, rfH_22 = rfH_23.id_break(20 + random.nextInt(15)).id_volatile(-10 + random.nextInt(21)).id_private(-10 + random.nextInt(21)), xc_32 = rrEm_12.id_byte(rfH_22), rXE2 = rrEm_12.id_break(rfH_22), aI_2.J)) continue;
            aU_2 aU_22 = null;
            int n4 = 1 + random.nextInt(rRh_12.id_class().id_class() + 1);
            for (int i = 0; i < n4; ++i) {
                rGB rGB2 = aI_2.J.id_class(rrEm_12);
                rGB2.id_class(rfH_22, 0.0f, 0.0f);
                aU_22 = rGB2.id_class(rrEm_12, rRh_12, iO_2.NATURAL, aU_22, (rcd_3)null);
                rrEm_12.id_class((an_3)rGB2);
            }
            n += n4;
        }
        return n;
    }
}

