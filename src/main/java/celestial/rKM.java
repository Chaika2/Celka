/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKG;
import celestial.rKb_1;
import celestial.rSa_1;
import celestial.rfH_2;
import celestial.rrEm_1;
import java.util.List;

public final class rKM
extends rKb_1 {
    @Override
    public void id_class(rrEm_1 rrEm_12, rKG rKG2, List<rSa_1> list, int n, rfH_2 rfH_22) {
        rfH_2 rfH_23 = new rfH_2(0, 128, 0);
        for (rSa_1 rSa_12 : list) {
            rSa_12.id_class(rfH_23);
        }
        rKG2.id_class(PREPARING_TO_SUMMON_PILLARS);
    }
}

