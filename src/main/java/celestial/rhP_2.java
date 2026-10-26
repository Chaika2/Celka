/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.aa_3;
import celestial.an_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBF;
import celestial.rBP;
import celestial.rBY;
import celestial.rBe_1;
import celestial.rBx_1;
import celestial.rLQ;
import celestial.rOK;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rSs_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhB_2;
import celestial.rhS_2;
import celestial.rhd_3;
import celestial.rhs_3;
import celestial.rhw_3;
import celestial.rjU_2;
import celestial.rkg_3;
import celestial.rlc_3;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxL_2;
import celestial.rye_3;
import celestial.xC_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class rhP_2
extends rOK
implements aa_3 {
    private static final rkg_3 id_try = rkg_3.id_class(rdy_3.hB, xu_3.Ey.id_case());
    private static final rut_3<Integer> id_instanceof = rmE_2.id_class(rhP_2.class, ruw_3.id_break);
    private static final rut_3<Integer> id_throw = rmE_2.id_class(rhP_2.class, ruw_3.id_break);
    private static final rut_3<Integer> id_interface = rmE_2.id_class(rhP_2.class, ruw_3.id_break);
    public boolean id_char;
    private rhP_2 id_abstract;
    private rhP_2 id_long;

    @Override
    protected boolean id_byte(rhd_3 rhd_32, rdn_3 rdn_32) {
        rqA_2 rqA_22;
        int n = 0;
        int n2 = 0;
        float f = 0.0f;
        boolean bl = false;
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 == rdy_3.hB) {
            n = 10;
            n2 = 3;
            f = 2.0f;
        } else if (rdb_32 == xu_3.Ey.id_case()) {
            n = 90;
            n2 = 6;
            f = 10.0f;
            if (this.sm() && this.O_() == 0 && this.sk()) {
                bl = true;
                this.id_throws(rhd_32);
            }
        }
        if (this.Ss() < this.SK() && f > 0.0f) {
            this.id_protected(f);
            bl = true;
        }
        if (this.n_() && n > 0) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_char, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), 0.0, 0.0, 0.0);
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.d_(n);
            }
            bl = true;
        }
        if (n2 > 0 && (bl || !this.sm()) && this.sn() < this.sT()) {
            bl = true;
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_return(n2);
            }
        }
        if (bl && !this.BF() && (rqA_22 = this.sy()) != null) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), this.sy(), this.Pr(), 1.0f, 1.0f + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f);
        }
        return bl;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.GW;
    }

    public rhP_2(aI_2<? extends rhP_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rOK>)aI_22, rYB2);
    }

    @Override
    protected rqA_2 sp() {
        return rqn_3.GJ;
    }

    @Override
    protected void sl() {
        if (!((rYB)this.id_throws[7]).id_continue) {
            super.sl();
            this.id_class(rhP_2.id_volatile(this.id_synchronized.id_extends(1)));
        }
    }

    public rxL_2 sa() {
        int n = ((rmE_2)this.id_throws[49]).id_class(id_throw);
        return n == -1 ? null : rxL_2.id_class(n);
    }

    private void id_class(rxL_2 rxL_22) {
        ((rmE_2)this.id_throws[49]).id_break(id_throw, rxL_22 == null ? -1 : rxL_22.id_break());
    }

    @Override
    public boolean id_class(float f, float f2) {
        int n = this.id_implements(f, f2);
        if (n <= 0) {
            return false;
        }
        if (f >= 6.0f) {
            this.id_break(rye_3.id_extends, (float)n);
            if (this.BP()) {
                for (an_3 an_32 : this.PP()) {
                    an_32.id_break(rye_3.id_extends, n);
                }
            }
        }
        this.sM();
        return true;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        int n;
        this.Es();
        if (aU_22 instanceof rhs_3) {
            n = ((rhs_3)aU_22).id_class;
        } else {
            n = ((Random)this.id_throws[40]).nextInt(4);
            aU_22 = new rhs_3(n);
        }
        this.id_public(n);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public boolean id_class(rbZ_2 rbZ_22) {
        return rbZ_22 != this && rbZ_22 instanceof rhP_2 && this.sj() && ((rhP_2)rbZ_22).sj();
    }

    public void id_class(rhP_2 rhP_22) {
        this.id_abstract = rhP_22;
        this.id_abstract.id_long = this;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Variant", this.se());
        rcd_32.id_break("Strength", this.sD());
        if (!this.id_synchronized.id_extends(1).id_class()) {
            rcd_32.id_class("DecorItem", this.id_synchronized.id_extends(1).id_break(new rcd_3()));
        }
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        rxL_2 rxL_22 = this.sa();
        super.id_class(rXu_12);
        rxL_2 rxL_23 = this.sa();
        if ((Integer)this.id_throws[41] > 20 && rxL_23 != null && rxL_23 != rxL_22) {
            this.id_class(rqn_3.GN, 0.5f, 1.0f);
        }
    }

    @Override
    public boolean id_class() {
        return false;
    }

    protected rhP_2 si() {
        return aI_2.id_transient.id_class((rYB)this.id_throws[7]);
    }

    @Override
    public int sc() {
        return this.sD();
    }

    public int se() {
        return rfU_2.id_class((int)((rmE_2)this.id_throws[49]).id_class(id_interface), 0, 3);
    }

    @Override
    protected void sd() {
        this.id_class(rqn_3.Gx, 1.0f, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f);
    }

    @Override
    public boolean sw() {
        return false;
    }

    public rhP_2 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        rhP_2 rhP_22 = this.si();
        this.id_class(au_32, rhP_22);
        rhP_2 rhP_23 = (rhP_2)au_32;
        int n = ((Random)this.id_throws[40]).nextInt(Math.max(this.sD(), rhP_23.sD())) + 1;
        if (((Random)this.id_throws[40]).nextFloat() < 0.03f) {
            ++n;
        }
        rhP_22.id_goto(n);
        rhP_22.id_public(((Random)this.id_throws[40]).nextBoolean() ? this.se() : rhP_23.se());
        return rhP_22;
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.GQ, 0.15f, 1.0f);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        this.id_goto(rcd_32.id_private("Strength"));
        super.id_break(rcd_32);
        this.id_public(rcd_32.id_private("Variant"));
        if (rcd_32.id_byte("DecorItem", 10)) {
            this.id_synchronized.id_break(1, rdn_3.id_class(rcd_32.id_int("DecorItem")));
        }
        this.sl();
    }

    @Override
    public void id_break(iB_2 iB_22, float f) {
        this.id_private(iB_22);
    }

    @Override
    protected int sx() {
        return this.sJ() ? 2 + 3 * this.sc() : super.sx();
    }

    @Override
    public boolean so() {
        return !this.id_synchronized.id_extends(1).id_class();
    }

    @Override
    public void id_catch(an_3 an_32) {
        if (this.id_synchronized(an_32)) {
            float f = rfU_2.id_break(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180));
            float f2 = rfU_2.id_class(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180));
            an_32.id_new(this.rx() + (double)(0.3f * f2), this.re() + this.PS() + an_32.Pv(), this.BO() - (double)(0.3f * f));
        }
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return id_try.id_class(rdn_32);
    }

    private void id_goto(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_instanceof, Math.max(1, Math.min(5, n)));
    }

    @Override
    protected double id_implements() {
        return 2.0;
    }

    public void id_try(boolean bl) {
        this.id_char = bl;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.GX;
    }

    public void id_public(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_interface, n);
    }

    private void id_private(iB_2 iB_22) {
        rhw_3 rhw_32 = new rhw_3((rYB)this.id_throws[7], this);
        double d = iB_22.rx() - this.rx();
        double d2 = iB_22.id_byte(0.3333333333333333) - rhw_32.re();
        double d3 = iB_22.BO() - this.BO();
        float f = rfU_2.id_class(d * d + d3 * d3) * 0.2f;
        rhw_32.id_byte(d, d2 + (double)f, d3, 1.5f, 10.0f);
        if (!this.BF()) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.Gz, this.Pr(), 1.0f, 1.0f + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f);
        }
        ((rYB)this.id_throws[7]).a_(rhw_32);
        this.id_char = true;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rSs_1(this, 1.2));
        this.id_package.id_class(2, new rBF(this, 2.1f));
        this.id_package.id_class(3, new rBe_1(this, 1.25, 40, 20.0f));
        this.id_package.id_class(3, new rBY(this, 1.2));
        this.id_package.id_class(4, new rBP(this, 1.0));
        this.id_package.id_class(5, new rBx_1(this, 1.0));
        this.id_package.id_class(6, new rSk_1(this, 0.7));
        this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(8, new rBC(this));
        this.id_int.id_class(1, new rhS_2(this));
        this.id_int.id_class(2, new rhB_2(this));
    }

    private static rxL_2 id_volatile(rdn_3 rdn_32) {
        xd_3 xd_32 = xd_3.id_class(rdn_32.id_break());
        return xd_32 instanceof xC_2 ? ((xC_2)xd_32).id_break() : null;
    }

    @Override
    public boolean id_native(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        return rlc_3.id_catch.id_class(rdb_32);
    }

    @Override
    protected void st() {
        if (!this.EB() && this.n_()) {
            super.st();
        }
    }

    @Override
    public double PS() {
        return (double)this.Bm() * 0.67;
    }

    @Override
    protected boolean BK() {
        return this.Sl() || this.sF();
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.75 * (double)this.Bx(), (double)this.PN() * 0.5);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Gd;
    }

    @Override
    protected rqA_2 sy() {
        return rqn_3.Gk;
    }

    @Override
    public int sT() {
        return 30;
    }

    @Override
    public void sI() {
        rqA_2 rqA_22 = this.sp();
        if (rqA_22 != null) {
            this.id_class(rqA_22, this.Si(), this.SN());
        }
    }

    public int sD() {
        return ((rmE_2)this.id_throws[49]).id_class(id_instanceof);
    }

    public boolean EB() {
        return this.id_abstract != null;
    }

    private void Es() {
        int n = ((Random)this.id_throws[40]).nextFloat() < 0.04f ? 5 : 3;
        this.id_goto(1 + ((Random)this.id_throws[40]).nextInt(n));
    }

    @Override
    public boolean sY() {
        return true;
    }

    public boolean EP() {
        return this.id_long != null;
    }

    public rhP_2 ES() {
        return this.id_abstract;
    }

    public boolean sK() {
        return false;
    }

    public void Er() {
        if (this.id_abstract != null) {
            this.id_abstract.id_long = null;
        }
        this.id_abstract = null;
    }

    public static iz_3 sU() {
        return rhP_2.n().id_class(iQ_2.id_break, 40.0);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_instanceof, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_throw, -1);
        ((rmE_2)this.id_throws[49]).id_class(id_interface, 0);
    }
}

