/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.aU_2;
import celestial.aa_3;
import celestial.an_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBI;
import celestial.rBU;
import celestial.rBa_1;
import celestial.rBc_1;
import celestial.rEB;
import celestial.rEU;
import celestial.rEe_1;
import celestial.rEi_1;
import celestial.rEr_1;
import celestial.rGp_1;
import celestial.rGq_1;
import celestial.rLQ;
import celestial.rMZ;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSb_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rhj_3;
import celestial.rhm_3;
import celestial.rjU_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rsy_3;
import celestial.rye_3;
import java.util.Random;

public class rED
extends rGp_1
implements aa_3 {
    private int id_super;
    private final rjU_2[][] id_this;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.EZ;
    }

    public rED(aI_2<? extends rED> aI_22, rYB rYB2) {
        super((aI_2<? extends rGp_1>)aI_22, rYB2);
        this.id_finally = 5;
        this.id_this = new rjU_2[2][4];
        for (int i = 0; i < 4; ++i) {
            this.id_this[0][i] = rjU_2.id_class;
            this.id_this[1][i] = rjU_2.id_class;
        }
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OM));
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(int n, boolean bl) {
    }

    @Override
    protected rqA_2 sc() {
        return rqn_3.Eu;
    }

    @Override
    public void id_default() {
        super.id_default();
        if (((rYB)this.id_throws[7]).id_continue && this.Pp()) {
            --this.id_super;
            if (this.id_super < 0) {
                this.id_super = 0;
            }
            if ((Integer)this.id_private[10] != 1 && (Integer)this.id_throws[41] % 1200 != 0) {
                if ((Integer)this.id_private[10] == (Integer)this.id_private[11] - 1) {
                    this.id_super = 3;
                    for (int i = 0; i < 4; ++i) {
                        this.id_this[0][i] = this.id_this[1][i];
                        this.id_this[1][i] = new rjU_2(0.0, 0.0, 0.0);
                    }
                }
            } else {
                int n;
                this.id_super = 3;
                float f = -6.0f;
                int n2 = 13;
                for (n = 0; n < 4; ++n) {
                    this.id_this[0][n] = this.id_this[1][n];
                    this.id_this[1][n] = new rjU_2((double)(-6.0f + (float)((Random)this.id_throws[40]).nextInt(13)) * 0.5, Math.max(0, ((Random)this.id_throws[40]).nextInt(6) - 4), (double)(-6.0f + (float)((Random)this.id_throws[40]).nextInt(13)) * 0.5);
                }
                for (n = 0; n < 16; ++n) {
                    ((rYB)this.id_throws[7]).id_class(rLQ.id_case, this.id_break(0.5), this.Ph(), this.id_throws(0.5), 0.0, 0.0, 0.0);
                }
                ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.Ev, this.Pr(), 1.0f, 1.0f, false);
            }
        }
    }

    @Override
    public void id_break(iB_2 iB_22, float f) {
        rdn_3 rdn_32 = this.id_case(this.id_protected(rhj_3.id_class(this, rdy_3.OM)));
        rhm_3 rhm_32 = rhj_3.id_class(this, rdn_32, f);
        double d = iB_22.rx() - this.rx();
        double d2 = iB_22.id_byte(0.3333333333333333) - rhm_32.re();
        double d3 = iB_22.BO() - this.BO();
        double d4 = rfU_2.id_class(d * d + d3 * d3);
        rhm_32.id_byte(d, d2 + d4 * (double)0.2f, d3, 1.6f, 14 - ((rYB)this.id_throws[7]).id_abstract().id_class() * 4);
        this.id_class(rqn_3.JT, 1.0f, 1.0f / (this.Sa().nextFloat() * 0.4f + 0.8f));
        ((rYB)this.id_throws[7]).a_(rhm_32);
    }

    @Override
    public rEr_1 id_throws() {
        if (this.sn()) {
            return rEr_1.SPELLCASTING;
        }
        return this.v() ? rEr_1.BOW_AND_ARROW : rEr_1.CROSSED;
    }

    public rjU_2[] id_throw(float f) {
        if (this.id_super <= 0) {
            return this.id_this[1];
        }
        double d = ((float)this.id_super - f) / 3.0f;
        d = Math.pow(d, 0.25);
        rjU_2[] rjU_2Array = new rjU_2[4];
        for (int i = 0; i < 4; ++i) {
            rjU_2Array[i] = this.id_this[1][i].id_class(1.0 - d).id_throws(this.id_this[0][i].id_class(d));
        }
        return rjU_2Array;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Ec;
    }

    @Override
    public boolean id_final(an_3 an_32) {
        if (super.id_final(an_32)) {
            return true;
        }
        if (an_32 instanceof iB_2 && ((iB_2)an_32).sG() == aL_2.id_protected) {
            return this.BG() == null && an_32.BG() == null;
        }
        return false;
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rGq_1(this));
        this.id_package.id_class(4, new rEe_1(this));
        this.id_package.id_class(5, new rEU(this));
        this.id_package.id_class(6, new rBa_1<rED>(this, 0.5, 20, 15.0f));
        this.id_package.id_class(8, new rBU(this, 0.6));
        this.id_package.id_class(9, new rBA(this, rhd_3.class, 3.0f, 1.0f));
        this.id_package.id_class(10, new rBA(this, is_3.class, 8.0f));
        this.id_int.id_class(1, new rBc_1(this, rEB.class).id_class(new Class[0]));
        this.id_int.id_class(2, new rBI<rhd_3>((is_3)this, rhd_3.class, true).id_class(300));
        this.id_int.id_class(3, new rBI<rsy_3>((is_3)this, rsy_3.class, false).id_class(300));
        this.id_int.id_class(3, new rBI<rMZ>((is_3)this, rMZ.class, false).id_class(300));
    }

    @Override
    public rfl_3 PE() {
        return this.rN().id_byte(3.0, 0.0, 3.0);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Em;
    }

    public static iz_3 sN() {
        return rEi_1.sm().id_class(iQ_2.id_protected, 0.5).id_class(iQ_2.id_break, 18.0).id_class(iQ_2.id_class, 32.0);
    }

    @Override
    public rqA_2 sQ() {
        return rqn_3.Ec;
    }

    @Override
    protected void m_() {
        super.m_();
    }
}

