/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QZ;
import celestial.rDg_1;
import celestial.rDv_1;
import celestial.rKd_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public abstract class Qz_1
extends QZ {
    public static boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, int n, int n2) {
        xd_3 xd_32 = xc_32.id_break();
        return xd_32 == rRq_12.id_byte(rfH_22.id_break(n, 0, n2)).id_break() && xd_32 == rRq_12.id_byte(rfH_22.id_break(n + 1, 0, n2)).id_break() && xd_32 == rRq_12.id_byte(rfH_22.id_break(n, 0, n2 + 1)).id_break() && xd_32 == rRq_12.id_byte(rfH_22.id_break(n + 1, 0, n2 + 1)).id_break();
    }

    public boolean id_class(rrEm_1 rrEm_12, rKd_1 rKd_12, rfH_2 rfH_22, xc_3 xc_32, Random random, int n, int n2) {
        rDg_1<rDv_1, ?> rDg_12 = this.id_class(random);
        if (rDg_12 == null) {
            return false;
        }
        ((rDv_1)rDg_12.id_case).id_class();
        xc_3 xc_33 = xu_3.id_class.id_continue();
        rrEm_12.id_class(rfH_22.id_break(n, 0, n2), xc_33, 4);
        rrEm_12.id_class(rfH_22.id_break(n + 1, 0, n2), xc_33, 4);
        rrEm_12.id_class(rfH_22.id_break(n, 0, n2 + 1), xc_33, 4);
        rrEm_12.id_class(rfH_22.id_break(n + 1, 0, n2 + 1), xc_33, 4);
        if (rDg_12.id_class(rrEm_12, rKd_12, random, rfH_22.id_break(n, 0, n2))) {
            return true;
        }
        rrEm_12.id_class(rfH_22.id_break(n, 0, n2), xc_32, 4);
        rrEm_12.id_class(rfH_22.id_break(n + 1, 0, n2), xc_32, 4);
        rrEm_12.id_class(rfH_22.id_break(n, 0, n2 + 1), xc_32, 4);
        rrEm_12.id_class(rfH_22.id_break(n + 1, 0, n2 + 1), xc_32, 4);
        return false;
    }

    protected abstract rDg_1<rDv_1, ?> id_class(Random var1);

    @Override
    public boolean id_class(rrEm_1 rrEm_12, rKd_1 rKd_12, rfH_2 rfH_22, xc_3 xc_32, Random random) {
        for (int i = 0; i >= -1; --i) {
            for (int j = 0; j >= -1; --j) {
                if (!Qz_1.id_class(xc_32, rrEm_12, rfH_22, i, j)) continue;
                return this.id_class(rrEm_12, rKd_12, rfH_22, xc_32, random, i, j);
            }
        }
        return super.id_class(rrEm_12, rKd_12, rfH_22, xc_32, random);
    }
}

