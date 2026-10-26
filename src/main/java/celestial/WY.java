/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.xm_3;

public class WY
extends xm_3 {
    public WY(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        double d = Math.abs(an_32.rv().id_byte);
        if (d < 0.1 && !an_32.Pc()) {
            double d2 = 0.4 + d * 0.2;
            an_32.id_byte(an_32.rv().id_throws(d2, 1.0, d2));
        }
        super.id_class(rYB2, rfH_22, an_32);
    }

    private void id_class(an_3 an_32) {
        rjU_2 rjU_22 = an_32.rv();
        if (rjU_22.id_byte < 0.0) {
            double d = an_32 instanceof iB_2 ? 1.0 : 0.8;
            an_32.id_catch(rjU_22.id_break, -rjU_22.id_byte * d, rjU_22.id_protected);
        }
    }

    @Override
    public void id_class(rRq_1 rRq_12, an_3 an_32) {
        if (an_32.PR()) {
            super.id_class(rRq_12, an_32);
        } else {
            this.id_class(an_32);
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32, float f) {
        if (an_32.PR()) {
            super.id_class(rYB2, rfH_22, an_32, f);
        } else {
            an_32.id_class(f, 0.0f);
        }
    }
}

