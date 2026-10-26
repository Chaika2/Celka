/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.iX_2;
import celestial.rBU;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;

public class rBD
extends rBU {
    public rBD(aA_2 aA_22, double d, int n) {
        super(aA_22, d, n);
    }

    @Override
    protected rjU_2 id_catch() {
        rjU_2 rjU_22 = iX_2.id_class(this.id_class, 10, 7);
        int n = 0;
        while (rjU_22 != null && !((rYB)this.id_class.id_throws[7]).id_byte(new rfH_2(rjU_22)).id_class((rRq_1)((rYB)this.id_class.id_throws[7]), new rfH_2(rjU_22), rLT.WATER) && n++ < 10) {
            rjU_22 = iX_2.id_class(this.id_class, 10, 7);
        }
        return rjU_22;
    }
}

