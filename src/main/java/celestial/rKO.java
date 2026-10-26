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

public final class rKO
extends rKb_1 {
    @Override
    public void id_class(rrEm_1 rrEm_12, rKG rKG2, List<rSa_1> list, int n, rfH_2 rfH_22) {
        if (n < 100) {
            if (n == 0 || n == 50 || n == 51 || n == 52 || n >= 95) {
                rrEm_12.id_byte(3001, new rfH_2(0, 128, 0), 0);
            }
        } else {
            rKG2.id_class(SUMMONING_PILLARS);
        }
    }
}

