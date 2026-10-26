/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.rYB;
import celestial.rdE_2;
import celestial.rdn_3;
import celestial.rfU_2;

public class rdF_2
implements rdE_2 {
    private double id_class;
    private double id_break;
    private long id_byte;

    private double id_class(rYB rYB2, double d) {
        if (rYB2.r() != this.id_byte) {
            this.id_byte = rYB2.r();
            double d2 = d - this.id_class;
            d2 = rfU_2.id_byte(d2 + 0.5, 1.0) - 0.5;
            this.id_break += d2 * 0.1;
            this.id_break *= 0.9;
            this.id_class = rfU_2.id_byte(this.id_class + this.id_break, 1.0);
        }
        return this.id_class;
    }

    @Override
    public float call(rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) {
        an_3 an_32;
        an_3 an_33 = an_32 = iB_22 != null ? iB_22 : rdn_32.id_try();
        if (an_32 == null) {
            return 0.0f;
        }
        if (gm_32 == null && (rYB)an_32.id_throws[7] instanceof gm_3) {
            gm_32 = (gm_3)((rYB)an_32.id_throws[7]);
        }
        if (gm_32 == null) {
            return 0.0f;
        }
        double d = gm_32.id_default().id_throws() ? (double)gm_32.id_protected(1.0f) : Math.random();
        d = this.id_class(gm_32, d);
        return (float)d;
    }
}

