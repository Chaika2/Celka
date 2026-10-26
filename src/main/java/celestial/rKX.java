/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKG;
import celestial.rKb_1;
import celestial.rRz_1;
import celestial.rSa_1;
import celestial.rfH_2;
import celestial.rrEm_1;
import java.util.List;

public final class rKX
extends rKb_1 {
    @Override
    public void id_class(rrEm_1 rrEm_12, rKG rKG2, List<rSa_1> list, int n, rfH_2 rfH_22) {
        if (n >= 100) {
            rKG2.id_class(END);
            rKG2.id_case();
            for (rSa_1 rSa_12 : list) {
                rSa_12.id_class((rfH_2)null);
                rrEm_12.id_class(rSa_12, rSa_12.rx(), rSa_12.re(), rSa_12.BO(), 6.0f, rRz_1.NONE);
                rSa_12.PD();
            }
        } else if (n >= 80) {
            rrEm_12.id_byte(3001, new rfH_2(0, 128, 0), 0);
        } else if (n == 0) {
            for (rSa_1 rSa_13 : list) {
                rSa_13.id_class(new rfH_2(0, 128, 0));
            }
        } else if (n < 5) {
            rrEm_12.id_byte(3001, new rfH_2(0, 128, 0), 0);
        }
    }
}

