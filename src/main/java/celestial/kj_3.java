/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kX_2;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class kj_3
extends xd_3
implements kX_2 {
    public kj_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        boolean bl = false;
        boolean bl2 = false;
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22.id_break(-1, -1, -1), rfH_22.id_break(1, 1, 1))) {
            xc_3 xc_33 = rrEm_12.id_byte(rfH_23);
            if (xc_33.id_class(xu_3.Xz)) {
                bl2 = true;
            }
            if (xc_33.id_class(xu_3.XL)) {
                bl = true;
            }
            if (!bl2 || !bl) continue;
            break;
        }
        if (bl2 && bl) {
            rrEm_12.id_class(rfH_22, random.nextBoolean() ? xu_3.Xz.id_continue() : xu_3.XL.id_continue(), 3);
        } else if (bl2) {
            rrEm_12.id_class(rfH_22, xu_3.Xz.id_continue(), 3);
        } else if (bl) {
            rrEm_12.id_class(rfH_22, xu_3.XL.id_continue(), 3);
        }
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        if (!rRq_12.id_byte(rfH_22.id_final()).id_class(rRq_12, rfH_22)) {
            return false;
        }
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22.id_break(-1, -1, -1), rfH_22.id_break(1, 1, 1))) {
            if (!rRq_12.id_byte(rfH_23).id_class(rls_3.c)) continue;
            return true;
        }
        return false;
    }
}

