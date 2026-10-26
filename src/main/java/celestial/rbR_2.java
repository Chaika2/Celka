/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBP;
import celestial.rBY;
import celestial.rBx_1;
import celestial.rLp_1;
import celestial.rSO;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rkg_3;
import celestial.rpL_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rye_3;
import celestial.xc_3;
import java.util.Random;

public class rbR_2
extends rbZ_2 {
    private static final rkg_3 id_while = rkg_3.id_class(rdy_3.hP, rdy_3.JW, rdy_3.Jk, rdy_3.kJ);
    public float id_super;
    public float id_this;
    public float id_else;
    public float id_synchronized;
    public float id_return = 1.0f;
    public int id_public = ((Random)this.id_throws[40]).nextInt(6000) + 6000;
    public boolean id_goto;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.rg;
    }

    @Override
    protected int id_byte(rhd_3 rhd_32) {
        return this.n() ? 10 : super.id_byte(rhd_32);
    }

    public rbR_2(aI_2<? extends rbR_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.id_class(rLp_1.WATER, 0.0f);
    }

    public void id_this(boolean bl) {
        this.id_goto = bl;
    }

    public boolean n() {
        return this.id_goto;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("IsChickenJockey", this.id_goto);
        rcd_32.id_break("EggLayTime", this.id_public);
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    @Override
    public void id_default() {
        super.id_default();
        this.id_synchronized = this.id_super;
        this.id_else = this.id_this;
        this.id_this = (float)((double)this.id_this + (double)((Boolean)this.id_throws[20] != false ? -1 : 4) * 0.3);
        this.id_this = rfU_2.id_class(this.id_this, 0.0f, 1.0f);
        if (!((Boolean)this.id_throws[20]).booleanValue() && this.id_return < 1.0f) {
            this.id_return = 1.0f;
        }
        this.id_return = (float)((double)this.id_return * 0.9);
        rjU_2 rjU_22 = this.rv();
        if (!((Boolean)this.id_throws[20]).booleanValue() && rjU_22.id_byte < 0.0) {
            this.id_byte(rjU_22.id_throws(1.0, 0.6, 1.0));
        }
        this.id_super += this.id_return * 2.0f;
        if (!((rYB)this.id_throws[7]).id_continue && this.BM() && !this.n_() && !this.n() && --this.id_public <= 0) {
            this.id_class(rqn_3.rV, 1.0f, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f);
            this.id_class((rpL_2)rdy_3.XJ);
            this.id_public = ((Random)this.id_throws[40]).nextInt(6000) + 6000;
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_goto = rcd_32.id_new("IsChickenJockey");
        if (rcd_32.id_throws("EggLayTime")) {
            this.id_public = rcd_32.id_private("EggLayTime");
        }
    }

    public rbR_2 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.id_finally.id_class(rrEm_12);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.rR, 0.15f, 1.0f);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return this.n_() ? ap_32.id_break * 0.85f : ap_32.id_break * 0.92f;
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_class, 4.0).id_class(iQ_2.id_protected, 0.25);
    }

    @Override
    public void id_catch(an_3 an_32) {
        super.id_catch(an_32);
        float f = rfU_2.id_class(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180));
        float f2 = rfU_2.id_break(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180));
        float f3 = 0.1f;
        float f4 = 0.0f;
        an_32.id_new(this.rx() + (double)(0.1f * f), this.id_byte(0.5) + an_32.Pv() + 0.0, this.BO() - (double)(0.1f * f2));
        if (an_32 instanceof iB_2) {
            Float f5 = Float.valueOf(((Float)this.id_private[23]).floatValue());
            ((iB_2)an_32).id_private[23] = f5;
        }
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return id_while.id_class(rdn_32);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.rf;
    }

    @Override
    public boolean id_private(double d) {
        return this.n();
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rBY(this, 1.4));
        this.id_package.id_class(2, new rBP(this, 1.0));
        this.id_package.id_class(3, new rSO((aA_2)this, 1.0, false, id_while));
        this.id_package.id_class(4, new rBx_1(this, 1.1));
        this.id_package.id_class(5, new rSk_1(this, 1.0));
        this.id_package.id_class(6, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(7, new rBC(this));
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.rj;
    }
}

