/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.iO_2;
import celestial.rGr_1;
import celestial.rKv_1;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rYG;
import celestial.rYh_1;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rrEj_1;
import celestial.rrEm_1;
import celestial.rrEq_1;
import celestial.xc_3;
import java.util.Random;

public class rrEw_1
implements rrEq_1 {
    private int id_class;

    @Override
    public int id_class(rrEm_1 rrEm_12, boolean bl, boolean bl2) {
        if (!bl) {
            return 0;
        }
        if (!rrEm_12.B().id_break(rRu_1.id_interface)) {
            return 0;
        }
        Random random = rrEm_12.id_int;
        --this.id_class;
        if (this.id_class > 0) {
            return 0;
        }
        this.id_class += 12000 + random.nextInt(1200);
        long l = rrEm_12.P() / 24000L;
        if (l >= 5L && rrEm_12.id_strictfp()) {
            if (random.nextInt(5) != 0) {
                return 0;
            }
            int n = rrEm_12.id_continue().size();
            if (n < 1) {
                return 0;
            }
            rhd_3 rhd_32 = rrEm_12.id_continue().get(random.nextInt(n));
            if (rhd_32.id_native()) {
                return 0;
            }
            if (rrEm_12.id_byte(rhd_32.Bs(), 2)) {
                return 0;
            }
            int n2 = (24 + random.nextInt(24)) * (random.nextBoolean() ? -1 : 1);
            int n3 = (24 + random.nextInt(24)) * (random.nextBoolean() ? -1 : 1);
            rfw_3 rfw_32 = rhd_32.Bs().id_new().id_byte(n2, 0, n3);
            if (!rrEm_12.id_class(rfw_32.b_() - 10, rfw_32.c_() - 10, rfw_32.d_() - 10, rfw_32.b_() + 10, rfw_32.c_() + 10, rfw_32.d_() + 10)) {
                return 0;
            }
            rYG rYG2 = rrEm_12.id_implements(rfw_32);
            rYh_1 rYh_12 = rYG2.id_this();
            if (rYh_12 == rYh_1.MUSHROOM) {
                return 0;
            }
            int n4 = 0;
            int n5 = (int)Math.ceil(rrEm_12.id_throws(rfw_32).id_break()) + 1;
            for (int i = 0; i < n5; ++i) {
                ++n4;
                rfw_32.b_(rrEm_12.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, (rfH_2)rfw_32).c_());
                if (i == 0) {
                    if (!this.id_class(rrEm_12, rfw_32, random, true)) {
                        break;
                    }
                } else {
                    this.id_class(rrEm_12, rfw_32, random, false);
                }
                rfw_32.a_(rfw_32.b_() + random.nextInt(5) - random.nextInt(5));
                rfw_32.c_(rfw_32.d_() + random.nextInt(5) - random.nextInt(5));
            }
            return n4;
        }
        return 0;
    }

    private boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, Random random, boolean bl) {
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        if (!rrEj_1.id_class((rRq_1)rrEm_12, rfH_22, xc_32, xc_32.id_volatile(), aI_2.W)) {
            return false;
        }
        if (!rGr_1.id_break(aI_2.W, (rRg_1)rrEm_12, iO_2.PATROL, rfH_22, random)) {
            return false;
        }
        rGr_1 rGr_12 = aI_2.W.id_class(rrEm_12);
        if (rGr_12 != null) {
            if (bl) {
                rGr_12.id_synchronized(true);
                rGr_12.sL();
            }
            rGr_12.id_new(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
            rGr_12.id_class(rrEm_12, rrEm_12.id_throws(rfH_22), iO_2.PATROL, (aU_2)null, (rcd_3)null);
            rrEm_12.id_class((an_3)rGr_12);
            return true;
        }
        return false;
    }
}

