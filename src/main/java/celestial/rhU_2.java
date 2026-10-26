/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rLD;
import celestial.rLY;
import celestial.rRO;
import celestial.rRW;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rRz_1;
import celestial.rSN;
import celestial.rXE;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfo_3;
import celestial.rhL_2;
import celestial.rjG_2;
import celestial.rmE_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;

public class rhU_2
extends rhL_2 {
    private static final rut_3<Boolean> id_catch = rmE_2.id_class(rhU_2.class, ruw_3.id_implements);

    public rhU_2(rYB rYB2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(aI_2.rP, d, d2, d3, d4, d5, d6, rYB2);
    }

    public rhU_2(rYB rYB2, iB_2 iB_22, double d, double d2, double d3) {
        super(aI_2.rP, iB_22, d, d2, d3, rYB2);
    }

    public rhU_2(aI_2<? extends rhU_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhL_2>)aI_22, rYB2);
    }

    public void id_class(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_catch, bl);
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        super.id_class(rfo_32);
        if (!((rYB)this.id_throws[7]).id_continue) {
            boolean bl;
            an_3 an_32 = rfo_32.id_class();
            an_3 an_33 = this.id_else();
            if (an_33 instanceof iB_2) {
                iB_2 iB_22 = (iB_2)an_33;
                bl = an_32.id_break(rye_3.id_class(this, (an_3)iB_22), 8.0f);
                if (bl) {
                    if (an_32.BM()) {
                        this.id_class(iB_22, an_32);
                    } else {
                        iB_22.id_protected(5.0f);
                    }
                }
            } else {
                bl = an_32.id_break(rye_3.id_package, 5.0f);
            }
            if (bl && an_32 instanceof iB_2) {
                int n = 0;
                if (((rYB)this.id_throws[7]).id_abstract() == rRO.NORMAL) {
                    n = 10;
                } else if (((rYB)this.id_throws[7]).id_abstract() == rRO.HARD) {
                    n = 40;
                }
                if (n > 0) {
                    ((iB_2)an_32).id_break(new rLY(rLD.id_this, 20 * n, 1));
                }
            }
        }
    }

    @Override
    public float id_class(rRW rRW2, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2, float f) {
        return this.id_protected() && rSN.id_byte(xc_32) ? Math.min(0.8f, f) : f;
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        super.id_class(rjG_22);
        if (!((rYB)this.id_throws[7]).id_continue) {
            rRz_1 rRz_12 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) ? rRz_1.DESTROY : rRz_1.NONE;
            ((rYB)this.id_throws[7]).id_class(this, this.rx(), this.re(), this.BO(), 1.0f, false, rRz_12);
            this.PD();
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        return false;
    }

    @Override
    protected boolean id_throws() {
        return false;
    }

    @Override
    protected float id_catch() {
        return this.id_protected() ? 0.73f : super.id_catch();
    }

    public boolean id_protected() {
        return ((rmE_2)this.id_throws[49]).id_class(id_catch);
    }

    @Override
    public boolean Pz() {
        return false;
    }

    @Override
    public boolean rY() {
        return false;
    }

    @Override
    protected void m_() {
        ((rmE_2)this.id_throws[49]).id_class(id_catch, false);
    }
}

