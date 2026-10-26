/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jj_1;
import celestial.Oo_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.rFJ;
import celestial.rRO;
import celestial.rRR;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.ruS_2;
import celestial.xc_3;
import java.util.List;
import java.util.Random;

public class rSg_1
extends an_3 {
    private int id_break;
    public long id_class;
    private int id_protected;
    private boolean id_catch;
    private rhN_2 id_private;

    public rSg_1(aI_2<? extends rSg_1> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
        Boolean bl = true;
        this.id_throws[56] = bl;
        this.id_break = 2;
        this.id_class = ((Random)this.id_throws[40]).nextLong();
        this.id_protected = ((Random)this.id_throws[40]).nextInt(3) + 1;
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.id_break == 2) {
            rRO rRO2 = ((rYB)this.id_throws[7]).id_abstract();
            if (rRO2 == rRO.NORMAL || rRO2 == rRO.HARD) {
                this.id_class(4);
            }
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.GO, rqL_2.WEATHER, 10000.0f, 0.8f + ((Random)this.id_throws[40]).nextFloat() * 0.2f);
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.GM, rqL_2.WEATHER, 2.0f, 0.5f + ((Random)this.id_throws[40]).nextFloat() * 0.2f);
        }
        --this.id_break;
        if (this.id_break < 0) {
            if (this.id_protected == 0) {
                this.PD();
            } else if (this.id_break < -((Random)this.id_throws[40]).nextInt(10)) {
                --this.id_protected;
                this.id_break = 1;
                this.id_class = ((Random)this.id_throws[40]).nextLong();
                this.id_class(0);
            }
        }
        if (this.id_break >= 0) {
            if (!((rYB)this.id_throws[7] instanceof rrEm_1)) {
                ((rYB)this.id_throws[7]).id_byte(2);
            } else if (!this.id_catch) {
                double d = 3.0;
                List<an_3> list = ((rYB)this.id_throws[7]).id_break((an_3)this, new rfl_3(this.rx() - 3.0, this.re() - 3.0, this.BO() - 3.0, this.rx() + 3.0, this.re() + 6.0 + 3.0, this.BO() + 3.0), an_3::BM);
                for (an_3 an_32 : list) {
                    an_32.id_class((rrEm_1)((rYB)this.id_throws[7]), this);
                }
                if (this.id_private != null) {
                    Oo_1.id_char.id_class(this.id_private, list);
                }
            }
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
    }

    private void id_class(int n) {
        if (!this.id_catch && !((rYB)this.id_throws[7]).id_continue && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_class)) {
            rfH_2 rfH_22 = this.Bs();
            xc_3 xc_32 = Jj_1.id_class((rYB)this.id_throws[7], rfH_22);
            if (((rYB)this.id_throws[7]).id_byte(rfH_22).id_catch() && xc_32.id_class((rRR)((rYB)this.id_throws[7]), rfH_22)) {
                ((rYB)this.id_throws[7]).id_break(rfH_22, xc_32);
            }
            for (int i = 0; i < n; ++i) {
                rfH_2 rfH_23 = rfH_22.id_break(((Random)this.id_throws[40]).nextInt(3) - 1, ((Random)this.id_throws[40]).nextInt(3) - 1, ((Random)this.id_throws[40]).nextInt(3) - 1);
                xc_32 = Jj_1.id_class((rYB)this.id_throws[7], rfH_23);
                if (!((rYB)this.id_throws[7]).id_byte(rfH_23).id_catch() || !xc_32.id_class((rRR)((rYB)this.id_throws[7]), rfH_23)) continue;
                ((rYB)this.id_throws[7]).id_break(rfH_23, xc_32);
            }
        }
    }

    @Override
    public boolean id_class(double d) {
        double d2 = 64.0 * rSg_1.Br();
        return d < d2 * d2;
    }

    public void id_class(boolean bl) {
        this.id_catch = bl;
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
    }

    public void id_protected(rhN_2 rhN_22) {
        this.id_private = rhN_22;
    }

    @Override
    public rqL_2 Pr() {
        return rqL_2.WEATHER;
    }

    @Override
    protected void m_() {
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

