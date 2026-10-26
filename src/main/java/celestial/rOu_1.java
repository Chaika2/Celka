/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBp_1;
import celestial.rON;
import celestial.rRR;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xu_3;

public class rOu_1
extends rBp_1 {
    private final rON id_catch;

    public rOu_1(rON rON2, double d) {
        super(rON2, rON2.n_() ? 2.0 : d, 24);
        this.id_catch = rON2;
        this.id_case = -1;
    }

    @Override
    protected boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        return rRR2.id_byte(rfH_22).id_class(xu_3.id_try);
    }

    @Override
    public boolean id_class() {
        if (this.id_catch.n_() && !this.id_catch.rT()) {
            return super.id_class();
        }
        return !this.id_catch.sc() && !this.id_catch.rT() && !this.id_catch.L() ? super.id_class() : false;
    }

    @Override
    public boolean id_break() {
        return !this.id_catch.rT() && this.id_protected <= 1200 && this.id_class((rYB)this.id_catch.id_throws[7], this.id_throws);
    }

    @Override
    public boolean id_extends() {
        return this.id_protected % 160 == 0;
    }
}

