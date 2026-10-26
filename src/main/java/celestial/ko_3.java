/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.eA_2;
import celestial.eY_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class ko_3
extends xd_3 {
    public ko_3(Jq_1 jq_1) {
        super(jq_1);
    }

    protected int id_class(Random random) {
        if (this == xu_3.id_float) {
            return rfU_2.id_class(random, 0, 2);
        }
        if (this == xu_3.ri) {
            return rfU_2.id_class(random, 3, 7);
        }
        if (this == xu_3.Sk) {
            return rfU_2.id_class(random, 3, 7);
        }
        if (this == xu_3.m) {
            return rfU_2.id_class(random, 2, 5);
        }
        if (this == xu_3.sC) {
            return rfU_2.id_class(random, 2, 5);
        }
        return this == xu_3.id_void ? rfU_2.id_class(random, 0, 1) : 0;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, rdn_3 rdn_32) {
        int n;
        super.id_class(xc_32, rrEm_12, rfH_22, rdn_32);
        if (eA_2.id_class(eY_2.id_else, rdn_32) == 0 && (n = this.id_class(rrEm_12.id_int)) > 0) {
            this.id_class(rrEm_12, rfH_22, n);
        }
    }
}

