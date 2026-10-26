/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QP;
import celestial.Qs_1;
import celestial.eA_2;
import celestial.eY_2;
import celestial.rRo_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xm_3;
import celestial.xu_3;
import java.util.Random;

public class kk_3
extends xm_3 {
    protected void id_byte(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        if (rYB2.id_default().id_protected()) {
            rYB2.id_class(rfH_22, false);
        } else {
            rYB2.id_break(rfH_22, xu_3.id_try.id_continue());
            rYB2.id_class(rfH_22, xu_3.id_try, rfH_22);
        }
    }

    public kk_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (rrEm_12.id_class(rRo_1.BLOCK, rfH_22) > 11 - xc_32.id_break((rRq_1)rrEm_12, rfH_22)) {
            this.id_byte(xc_32, rrEm_12, rfH_22);
        }
    }

    @Override
    public void id_class(rYB rYB2, rhd_3 rhd_32, rfH_2 rfH_22, xc_3 xc_32, ryO_2 ryO_22, rdn_3 rdn_32) {
        super.id_class(rYB2, rhd_32, rfH_22, xc_32, ryO_22, rdn_32);
        if (eA_2.id_class(eY_2.id_else, rdn_32) == 0) {
            if (rYB2.id_default().id_protected()) {
                rYB2.id_class(rfH_22, false);
                return;
            }
            QP qP = rYB2.id_byte(rfH_22.id_break()).id_byte();
            if (qP.id_byte() || qP.id_class()) {
                rYB2.id_break(rfH_22, xu_3.id_try.id_continue());
            }
        }
    }

    @Override
    public Qs_1 id_protected(xc_3 xc_32) {
        return Qs_1.NORMAL;
    }
}

