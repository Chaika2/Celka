/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rDg_1;
import celestial.rDv_1;
import celestial.rKd_1;
import celestial.rRg_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public abstract class QZ {
    private boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        for (rfH_2 rfH_23 : rfw_3.id_class(rfH_22.id_break().id_native(2).id_class(2), rfH_22.id_final().id_private(2).id_volatile(2))) {
            if (!rRg_12.id_byte(rfH_23).id_class(rls_3.id_strictfp)) continue;
            return true;
        }
        return false;
    }

    public boolean id_class(rrEm_1 rrEm_12, rKd_1 rKd_12, rfH_2 rfH_22, xc_3 xc_32, Random random) {
        rDg_1<rDv_1, ?> rDg_12 = this.id_class(random, this.id_class(rrEm_12, rfH_22));
        if (rDg_12 == null) {
            return false;
        }
        rrEm_12.id_class(rfH_22, xu_3.id_class.id_continue(), 4);
        ((rDv_1)rDg_12.id_case).id_class();
        if (rDg_12.id_class(rrEm_12, rKd_12, random, rfH_22)) {
            return true;
        }
        rrEm_12.id_class(rfH_22, xc_32, 4);
        return false;
    }

    protected abstract rDg_1<rDv_1, ?> id_class(Random var1, boolean var2);
}

