/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjU_2;
import celestial.rrbb_3;

public class rrbz_3 {
    private rjU_2 id_class = null;
    private long id_break = System.currentTimeMillis();

    public rjU_2 id_class(double d, double d2, double d3) {
        if (this.id_class == null) {
            this.id_class = new rjU_2(d, d2, d3);
            return this.id_class;
        }
        long l = System.currentTimeMillis();
        long l2 = l - this.id_break;
        if (l2 == 0L) {
            return this.id_class;
        }
        this.id_break = l;
        if (Math.abs(d - this.id_class.id_break) < 0.004 && Math.abs(d2 - this.id_class.id_byte) < 0.004 && Math.abs(d3 - this.id_class.id_protected) < 0.004) {
            return this.id_class;
        }
        double d4 = (double)l2 * 0.001;
        d4 = rrbb_3.id_class(d4, 0.0, 1.0);
        double d5 = d - this.id_class.id_break;
        double d6 = d2 - this.id_class.id_byte;
        double d7 = d3 - this.id_class.id_protected;
        double d8 = this.id_class.id_break + d5 * d4;
        double d9 = this.id_class.id_byte + d6 * d4;
        double d10 = this.id_class.id_protected + d7 * d4;
        this.id_class = new rjU_2(d8, d9, d10);
        return this.id_class;
    }
}

