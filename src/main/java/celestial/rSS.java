/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.iA_2;
import celestial.iX_2;
import celestial.rBU;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rrEm_1;

public class rSS
extends rBU {
    public rSS(aA_2 aA_22, double d, boolean bl) {
        super(aA_22, d, 10, bl);
    }

    @Override
    public boolean id_class() {
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        rfH_2 rfH_22 = this.id_class.Bs();
        return rrEm_12.id_throw(rfH_22) ? false : super.id_class();
    }

    @Override
    protected rjU_2 id_catch() {
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        rfH_2 rfH_22 = this.id_class.Bs();
        rjh_3 rjh_32 = rjh_3.id_class(rfH_22);
        rjh_3 rjh_33 = iA_2.id_class(rrEm_12, rjh_32, 2);
        return rjh_33 != rjh_32 ? iX_2.id_break(this.id_class, 10, 7, rjU_2.id_protected(rjh_33.id_int())) : null;
    }
}

