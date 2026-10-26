/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rBp_1;
import celestial.rEx_1;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;

public class rEk_1
extends rBp_1 {
    private final rEx_1 id_catch;

    @Override
    public void id_byte() {
        this.id_catch.id_this(false);
        rEx_1.id_class(this.id_catch, this.id_catch.id_break);
        super.id_byte();
    }

    public rEk_1(rEx_1 rEx_12, double d) {
        super(rEx_12, d, 8, 2);
        this.id_catch = rEx_12;
    }

    @Override
    protected boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_final();
        return rRR2.id_finally(rfH_23) && rRR2.id_finally(rfH_23.id_final()) ? rRR2.id_byte(rfH_22).id_class((rRq_1)rRR2, rfH_22, (an_3)this.id_catch) : false;
    }

    @Override
    public boolean id_class() {
        return super.id_class() && !((rYB)this.id_catch.id_throws[7]).id_strictfp() && this.id_catch.rT() && this.id_catch.re() >= (double)(((rYB)this.id_catch.id_throws[7]).id_short() - 3);
    }

    @Override
    public boolean id_break() {
        return super.id_break();
    }

    @Override
    public void id_protected() {
        super.id_protected();
    }
}

