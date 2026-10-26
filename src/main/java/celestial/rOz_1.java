/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBp_1;
import celestial.rLT;
import celestial.rOk_1;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xu_3;

public class rOz_1
extends rBp_1 {
    private final rOk_1 id_catch;

    public rOz_1(rOk_1 rOk_12, double d) {
        super(rOk_12, d, 8, 2);
        this.id_catch = rOk_12;
    }

    @Override
    protected boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        return rRR2.id_byte(rfH_22).id_class(xu_3.id_instanceof) && rRR2.id_byte(rfH_22.id_final()).id_class((rRq_1)rRR2, rfH_22, rLT.LAND);
    }

    @Override
    public boolean id_class() {
        return !this.id_catch.ry() && super.id_class();
    }

    @Override
    public boolean id_break() {
        return !this.id_catch.ry() && this.id_class((rYB)this.id_catch.id_throws[7], this.id_throws);
    }

    @Override
    public rfH_2 id_finally() {
        return this.id_throws;
    }

    @Override
    public boolean id_extends() {
        return this.id_protected % 20 == 0;
    }
}

