/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.an_3;
import celestial.gm_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rng_3;
import celestial.roC_2;
import celestial.roN_2;
import celestial.rqM_2;
import celestial.rrEm_1;
import celestial.rrbb_3;
import celestial.ryO_2;
import java.util.UUID;

public class rrWq_1 {
    public static ryO_2 id_class(rfH_2 rfH_22) {
        rrEm_1 rrEm_12 = rrWq_1.id_class();
        if (rrEm_12 == null) {
            return null;
        }
        roC_2 roC_22 = rrEm_12.id_else().id_break(rfH_22.b_() >> 4, rfH_22.d_() >> 4, roN_2.id_volatile, false);
        return roC_22 == null ? null : roC_22.id_class(rfH_22);
    }

    public static an_3 id_class(UUID uUID) {
        rrEm_1 rrEm_12 = rrWq_1.id_class();
        return rrEm_12 == null ? null : rrEm_12.id_break(uUID);
    }

    public static rrEm_1 id_class() {
        QY qY = rrbb_3.X();
        gm_3 gm_32 = (gm_3)qY.id_class[56];
        if (gm_32 == null) {
            return null;
        }
        if (!qY.id_switch()) {
            return null;
        }
        rng_3 rng_32 = qY.id_this();
        if (rng_32 == null) {
            return null;
        }
        rqM_2<rYB> rqM_22 = gm_32.E();
        if (rqM_22 == null) {
            return null;
        }
        try {
            return rng_32.id_class(rqM_22);
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }
}

