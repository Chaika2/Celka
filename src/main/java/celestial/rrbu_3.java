/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRp_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rrWr_1;
import celestial.rrbF_2;
import celestial.rrbN_2;
import celestial.xc_3;

public class rrbu_3
implements rrbF_2 {
    @Override
    public boolean id_byte() {
        return false;
    }

    @Override
    public int id_class(xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22) {
        rYG rYG2 = rrbN_2.id_class(rRp_12, rfH_22);
        return rrbN_2.id_case != null && rYG2 == rrWr_1.id_break ? rrbN_2.id_case.id_class(rYG2, rfH_22) : rYG2.id_catch();
    }
}

