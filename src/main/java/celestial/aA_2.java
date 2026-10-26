/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iO_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rOQ;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;

public abstract class aA_2
extends is_3 {
    protected void id_byte(float f) {
    }

    protected aA_2(aI_2<? extends aA_2> aI_22, rYB rYB2) {
        super((aI_2<? extends is_3>)aI_22, rYB2);
    }

    public float id_class(rfH_2 rfH_22) {
        return this.id_class(rfH_22, (rYB)this.id_throws[7]);
    }

    @Override
    public boolean id_class(rRg_1 rRg_12, iO_2 iO_22) {
        return this.id_class(this.Bs(), rRg_12) >= 0.0f;
    }

    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        return 0.0f;
    }

    public boolean id_catch() {
        return !this.id_public().id_native();
    }

    protected double id_implements() {
        return 1.0;
    }

    @Override
    protected void id_private() {
        super.id_private();
        an_3 an_32 = this.N();
        if (an_32 != null && (rYB)an_32.id_throws[7] == (rYB)this.id_throws[7]) {
            this.id_class(an_32.Bs(), 5);
            float f = this.id_implements(an_32);
            if (this instanceof rOQ && ((rOQ)this).Sc()) {
                if (f > 10.0f) {
                    this.id_class(true, true);
                }
                return;
            }
            this.id_byte(f);
            if (f > 10.0f) {
                this.id_class(true, true);
                this.id_package.id_class(rBW.MOVE);
            } else if (f > 6.0f) {
                double d = (an_32.rx() - this.rx()) / (double)f;
                double d2 = (an_32.re() - this.re()) / (double)f;
                double d3 = (an_32.BO() - this.BO()) / (double)f;
                this.id_byte(this.rv().id_break(Math.copySign(d * d * 0.4, d), Math.copySign(d2 * d2 * 0.4, d2), Math.copySign(d3 * d3 * 0.4, d3)));
            } else {
                this.id_package.id_break(rBW.MOVE);
                float f2 = 2.0f;
                rjU_2 rjU_22 = new rjU_2(an_32.rx() - this.rx(), an_32.re() - this.re(), an_32.BO() - this.BO()).id_protected().id_class((double)Math.max(f - 2.0f, 0.0f));
                this.id_public().id_class(this.rx() + rjU_22.id_break, this.re() + rjU_22.id_byte, this.BO() + rjU_22.id_protected, this.id_implements());
            }
        }
    }
}

