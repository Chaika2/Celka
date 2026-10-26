/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rRu_1;
import celestial.rRz_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfo_3;
import celestial.rhv_3;
import celestial.rjG_2;
import celestial.rye_3;

public class rhH_2
extends rhv_3 {
    public int id_catch = 1;

    public rhH_2(rYB rYB2, iB_2 iB_22, double d, double d2, double d3) {
        super((aI_2<? extends rhv_3>)aI_2.id_const, iB_22, d, d2, d3, rYB2);
    }

    public rhH_2(rYB rYB2, double d, double d2, double d3, double d4, double d5, double d6) {
        super((aI_2<? extends rhv_3>)aI_2.id_const, d, d2, d3, d4, d5, d6, rYB2);
    }

    public rhH_2(aI_2<? extends rhH_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhv_3>)aI_22, rYB2);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("ExplosionPower", this.id_catch);
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        super.id_class(rfo_32);
        if (!((rYB)this.id_throws[7]).id_continue) {
            an_3 an_32 = rfo_32.id_class();
            an_3 an_33 = this.id_else();
            an_32.id_break(rye_3.id_class(this, an_33), 6.0f);
            if (an_33 instanceof iB_2) {
                this.id_class((iB_2)an_33, an_32);
            }
        }
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        super.id_class(rjG_22);
        if (!((rYB)this.id_throws[7]).id_continue) {
            boolean bl = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break);
            ((rYB)this.id_throws[7]).id_class((an_3)null, this.rx(), this.re(), this.BO(), this.id_catch, bl, bl ? rRz_1.DESTROY : rRz_1.NONE);
            this.PD();
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("ExplosionPower", 99)) {
            this.id_catch = rcd_32.id_private("ExplosionPower");
        }
    }
}

