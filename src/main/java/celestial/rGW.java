/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLf_1;
import celestial.rLp_1;
import celestial.rRq_1;
import celestial.rfH_2;

public class rGW
extends rLf_1 {
    @Override
    protected rLp_1 id_class(rRq_1 rRq_12, boolean bl, boolean bl2, rfH_2 rfH_22, rLp_1 rLp_12) {
        return rLp_12 == rLp_1.LEAVES ? rLp_1.OPEN : super.id_class(rRq_12, bl, bl2, rfH_22, rLp_12);
    }
}

