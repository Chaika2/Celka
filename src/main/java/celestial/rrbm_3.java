/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRN;
import celestial.rRp_1;
import celestial.rfH_2;
import celestial.rrbF_2;
import celestial.rrbN_2;
import celestial.xc_3;

public class rrbm_3
implements rrbF_2 {
    @Override
    public boolean id_byte() {
        return rrbN_2.id_protected == null;
    }

    @Override
    public int id_class(xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22) {
        return rrbN_2.id_protected != null ? rrbN_2.id_protected.id_class(rRp_12, rfH_22) : rRN.id_class();
    }
}

