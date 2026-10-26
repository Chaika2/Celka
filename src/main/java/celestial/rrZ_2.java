/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.il_3;
import celestial.rPW;
import celestial.rXA;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rrEm_1;
import celestial.rsq_3;
import celestial.xU_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class rrZ_2
extends rPW {
    private static final List<rdb_3> id_class = ImmutableList.of((Object)rdy_3.hP, (Object)rdy_3.kJ);

    private void id_class(rrEm_1 rrEm_12, xc_3 xc_32, rfH_2 rfH_22, xc_3 xc_33) {
        rrEm_12.id_byte(1500, rfH_22, xc_33 != xc_32 ? 1 : 0);
    }

    private void id_class(rsq_3 rsq_32) {
        rXA rXA2 = rsq_32.sd();
        if (rXA2.id_class(rdy_3.hS) <= 36) {
            int n = rXA2.id_class(rdy_3.hB);
            int n2 = 3;
            int n3 = 3;
            int n4 = Math.min(3, n / 3);
            if (n4 != 0) {
                int n5 = n4 * 3;
                rXA2.id_class(rdy_3.hB, n5);
                rdn_3 rdn_32 = rXA2.id_class(new rdn_3(rdy_3.hS, n4));
                if (!rdn_32.id_class()) {
                    rsq_32.id_class(rdn_32, 0.5f);
                }
            }
        }
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        rfK_2 rfK_22;
        xc_3 xc_32;
        Optional<rfK_2> optional = rsq_32.SF().id_byte(il_3.id_byte);
        if (optional.isPresent() && (xc_32 = rrEm_12.id_byte((rfK_22 = optional.get()).id_break())).id_class(xu_3.JG)) {
            this.id_class(rsq_32);
            this.id_class(rrEm_12, rsq_32, rfK_22, xc_32);
        }
    }

    private void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, rfK_2 rfK_22, xc_3 xc_32) {
        rfH_2 rfH_22 = rfK_22.id_break();
        if (xc_32.id_byte(xU_2.id_volatile) == 8) {
            xc_32 = xU_2.id_byte(xc_32, rrEm_12, rfH_22);
        }
        int n = 20;
        int n2 = 10;
        int[] nArray = new int[id_class.size()];
        rXA rXA2 = rsq_32.sd();
        int n3 = rXA2.id_else();
        xc_3 xc_33 = xc_32;
        for (int i = n3 - 1; i >= 0 && n > 0; --i) {
            int n4;
            rdn_3 rdn_32 = rXA2.id_extends(i);
            int n5 = id_class.indexOf(rdn_32.id_break());
            if (n5 == -1) continue;
            int n6 = rdn_32.id_char();
            nArray[n5] = n4 = nArray[n5] + n6;
            int n7 = Math.min(Math.min(n4 - 10, n), n6);
            if (n7 <= 0) continue;
            n -= n7;
            for (int j = 0; j < n7; ++j) {
                if ((xc_33 = xU_2.id_class(xc_33, rrEm_12, rdn_32, rfH_22)).id_byte(xU_2.id_volatile) != 7) continue;
                this.id_class(rrEm_12, xc_32, rfH_22, xc_33);
                return;
            }
        }
        this.id_class(rrEm_12, xc_32, rfH_22, xc_33);
    }
}

