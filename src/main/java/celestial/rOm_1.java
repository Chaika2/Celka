/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.rBp_1;
import celestial.rON;
import celestial.rRR;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zH_2;

public class rOm_1
extends rBp_1 {
    private final rON id_catch;

    public rOm_1(rON rON2, double d) {
        super(rON2, d, 16);
        this.id_catch = rON2;
    }

    @Override
    protected boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        return !rRR2.id_finally(rfH_22.id_final()) ? false : zH_2.id_break(rRR2, rfH_22);
    }

    @Override
    public boolean id_class() {
        return this.id_catch.L() && this.id_catch.sx().id_class((eX_2)this.id_catch.Ps(), 9.0) ? super.id_class() : false;
    }

    @Override
    public boolean id_break() {
        return super.id_break() && this.id_catch.L() && this.id_catch.sx().id_class((eX_2)this.id_catch.Ps(), 9.0);
    }

    @Override
    public void id_throws() {
        super.id_throws();
        rfH_2 rfH_22 = this.id_catch.Bs();
        if (!this.id_catch.rT() && this.id_native()) {
            if (this.id_catch.id_while < 1) {
                this.id_catch.id_else(true);
            } else if (this.id_catch.id_while > 200) {
                rYB rYB2 = (rYB)this.id_catch.id_throws[7];
                rYB2.id_class((rhd_3)null, rfH_22, rqn_3.dp, rqL_2.BLOCKS, 0.3f, 0.9f + rYB2.id_int.nextFloat() * 0.2f);
                rYB2.id_class(this.id_throws.id_final(), (xc_3)xu_3.OX.id_continue().id_class(zH_2.id_final, rON.id_class(this.id_catch).nextInt(4) + 1), 3);
                this.id_catch.id_this(false);
                this.id_catch.id_else(false);
                this.id_catch.id_this(600);
            }
            if (this.id_catch.n()) {
                ++this.id_catch.id_while;
            }
        }
    }
}

