/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.Wv_1;
import celestial.dQ_2;
import celestial.eJ_2;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xu_3;

public class eP_2
extends eJ_2 {
    @Override
    public rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rpr_3 rpr_32 = uq_1.id_throws().id_byte(dQ_2.id_volatile);
        rfH_2 rfH_22 = uq_1.id_protected().id_break(rpr_32);
        rrEm_1 rrEm_12 = uq_1.id_catch();
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        this.id_class(true);
        if (xc_32.id_class(xu_3.Jk)) {
            if (xc_32.id_byte(Wv_1.id_volatile) != 4) {
                Wv_1.id_class((rYB)rrEm_12, rfH_22, xc_32);
                rdn_32.id_catch(1);
            } else {
                this.id_class(false);
            }
            return rdn_32;
        }
        return super.id_class(uq_1, rdn_32);
    }
}

