/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rjb_3;
import celestial.rrTj_1;

public abstract class rjG_2 {
    protected final rjU_2 id_class;

    public abstract rjM_2 id_byte();

    protected rjG_2(rjU_2 rjU_22) {
        this.id_class = rjU_22;
    }

    public double id_class(an_3 an_32) {
        double d = this.id_class.id_break - an_32.rx();
        double d2 = this.id_class.id_byte - an_32.re();
        double d3 = this.id_class.id_protected - an_32.BO();
        return d * d + d2 * d2 + d3 * d3;
    }

    public static rjG_2 id_catch() {
        return new rjb_3(rjU_2.id_class);
    }

    public rjU_2 id_case() {
        return this.id_class;
    }

    public abstract rrTj_1 id_protected();
}

