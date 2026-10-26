/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rFJ;
import celestial.rHy_1;
import celestial.rLQ;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhf_3;
import celestial.rhj_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rrTj_1;
import celestial.ruS_2;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xu_3;

public abstract class rhK_2
extends rhf_3 {
    protected rhK_2(aI_2<? extends rhK_2> aI_22, iB_2 iB_22, rYB rYB2) {
        this(aI_22, iB_22.rx(), iB_22.rH() - (double)0.1f, iB_22.BO(), rYB2);
        this.id_break(iB_22);
    }

    protected rhK_2(aI_2<? extends rhK_2> aI_22, double d, double d2, double d3, rYB rYB2) {
        this(aI_22, rYB2);
        this.id_new(d, d2, d3);
    }

    protected rhK_2(aI_2<? extends rhK_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhf_3>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        float f;
        rrTj_1 rrTj_12;
        super.id_this();
        rjG_2 rjG_22 = rhj_3.id_class((an_3)this, this::id_class);
        boolean bl = false;
        if (rjG_22.id_byte() == rjM_2.BLOCK) {
            rrTj_12 = ((rff_3)rjG_22).id_class();
            xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte((rfH_2)rrTj_12);
            if (xc_32.id_class(xu_3.Pi)) {
                this.id_protected((rfH_2)rrTj_12);
                bl = true;
            } else if (xc_32.id_class(xu_3.bw)) {
                ryO_2 ryO_22 = ((rYB)this.id_throws[7]).id_class((rfH_2)rrTj_12);
                if (ryO_22 instanceof rHy_1 && rHy_1.id_class(this)) {
                    ((rHy_1)ryO_22).id_break(this);
                }
                bl = true;
            }
        }
        if (rjG_22.id_byte() != rjM_2.MISS && !bl) {
            this.id_class(rjG_22);
        }
        this.Px();
        rrTj_12 = this.rv();
        double d = this.rx() + ((rjU_2)rrTj_12).id_break;
        double d2 = this.re() + ((rjU_2)rrTj_12).id_byte;
        double d3 = this.BO() + ((rjU_2)rrTj_12).id_protected;
        this.id_return();
        if (this.rT()) {
            for (int i = 0; i < 4; ++i) {
                ((rYB)this.id_throws[7]).id_class(rLQ.id_throws, d - ((rjU_2)rrTj_12).id_break * 0.25, d2 - ((rjU_2)rrTj_12).id_byte * 0.25, d3 - ((rjU_2)rrTj_12).id_protected * 0.25, ((rjU_2)rrTj_12).id_break, ((rjU_2)rrTj_12).id_byte, ((rjU_2)rrTj_12).id_protected);
            }
            f = 0.8f;
        } else {
            f = 0.99f;
        }
        this.id_byte(((rjU_2)rrTj_12).id_class((double)f));
        if (!this.rw()) {
            rjU_2 rjU_22 = this.rv();
            this.id_catch(rjU_22.id_break, rjU_22.id_byte - (double)this.id_throws(), rjU_22.id_protected);
        }
        this.id_new(d, d2, d3);
    }

    @Override
    public boolean id_class(double d) {
        double d2 = this.rN().id_class() * 4.0;
        if (Double.isNaN(d2)) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    public rjU_2 id_class(iB_2 iB_22) {
        return new rjU_2(iB_22.rx(), iB_22.rH() - (double)0.1f, iB_22.BO());
    }

    public float id_throws() {
        return 0.03f;
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

