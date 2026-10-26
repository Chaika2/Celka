/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aU_2;
import celestial.am_3;
import celestial.an_3;
import celestial.au_3;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBI;
import celestial.rBP;
import celestial.rBj_1;
import celestial.rBv_1;
import celestial.rLO;
import celestial.rLQ;
import celestial.rMC;
import celestial.rMn_1;
import celestial.rON;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rbR_2;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rkg_3;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public class rMA
extends rbZ_2 {
    private static final rkg_3 id_super = rkg_3.id_class(rdy_3.Xz, rdy_3.XQ);
    private static final rut_3<Boolean> id_this = rmE_2.id_class(rMA.class, ruw_3.id_implements);
    private rMn_1<rhd_3> id_else;
    private rMC id_synchronized;

    @Override
    public int id_char() {
        return 900;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Mw;
    }

    @Override
    public void id_double() {
        if (this.id_super().id_break()) {
            double d = this.id_super().id_byte();
            if (d == 0.6) {
                this.id_class(iM_2.CROUCHING);
                this.c_(false);
            } else if (d == 1.33) {
                this.id_class(iM_2.STANDING);
                this.c_(true);
            } else {
                this.id_class(iM_2.STANDING);
                this.c_(false);
            }
        } else {
            this.id_class(iM_2.STANDING);
            this.c_(false);
        }
    }

    public rMA(aI_2<? extends rMA> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.n();
    }

    private void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_this, bl);
        this.n();
    }

    protected void n() {
        if (this.id_else == null) {
            this.id_else = new rMn_1<rhd_3>(this, rhd_3.class, 16.0f, 0.8, 1.33);
        }
        this.id_package.id_class(this.id_else);
        if (!this.sJ()) {
            this.id_package.id_class(4, this.id_else);
        }
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    @Override
    public void id_class(byte by) {
        if (by == 41) {
            this.id_else(true);
        } else if (by == 40) {
            this.id_else(false);
        } else {
            super.id_class(by);
        }
    }

    @Override
    public boolean id_class(rRR rRR2) {
        if (rRR2.id_protected(this) && !rRR2.id_protected(this.rN())) {
            rfH_2 rfH_22 = this.Bs();
            if (rfH_22.c_() < rRR2.id_short()) {
                return false;
            }
            xc_3 xc_32 = rRR2.id_byte(rfH_22.id_break());
            if (xc_32.id_class(xu_3.id_implements) || xc_32.id_class(rls_3.id_void)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Trusting", this.sJ());
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        if (aU_22 == null) {
            aU_22 = new am_3(1.0f);
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if ((this.id_synchronized == null || this.id_synchronized.id_private()) && !this.sJ() && this.id_extends(rdn_32) && rhd_32.id_int(this) < 9.0) {
            this.id_class(rhd_32, rdn_32);
            if (!((rYB)this.id_throws[7]).id_continue) {
                if (((Random)this.id_throws[40]).nextInt(3) == 0) {
                    this.id_this(true);
                    this.id_else(true);
                    ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)41);
                } else {
                    this.id_else(false);
                    ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)40);
                }
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return super.id_break(rhd_32, rpm_32);
    }

    public rMA id_break(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.M.id_class(rrEm_12);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("Trusting"));
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        return this.id_class(rye_32) ? false : super.id_break(rye_32, f);
    }

    public static boolean id_break(aI_2<rMA> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return random.nextInt(3) != 0;
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 0.3f).id_class(iQ_2.id_case, 3.0);
    }

    private float sx() {
        return (float)this.id_class(iQ_2.id_case);
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return id_super.id_class(rdn_32);
    }

    private void id_else(boolean bl) {
        rLO rLO2 = rLQ.id_long;
        if (!bl) {
            rLO2 = rLQ.id_double;
        }
        for (int i = 0; i < 7; ++i) {
            double d = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double d2 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double d3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            ((rYB)this.id_throws[7]).id_class(rLO2, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), d, d2, d3);
        }
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.MI;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        return an_32.id_break(rye_3.id_byte(this), this.sx());
    }

    @Override
    public boolean id_private(double d) {
        return !this.sJ() && (Integer)this.id_throws[41] > 2400;
    }

    @Override
    protected void id_final() {
        this.id_synchronized = new rMC(this, 0.6, id_super, true);
        this.id_package.id_class(1, new rSb_1(this));
        this.id_package.id_class(3, this.id_synchronized);
        this.id_package.id_class(7, new rBv_1(this, 0.3f));
        this.id_package.id_class(8, new rBj_1(this));
        this.id_package.id_class(9, new rBP(this, 0.8));
        this.id_package.id_class(10, new rSk_1((aA_2)this, 0.8, 1.0000001E-5f));
        this.id_package.id_class(11, new rBA(this, rhd_3.class, 10.0f));
        this.id_int.id_class(1, new rBI<rbR_2>((is_3)this, rbR_2.class, false));
        this.id_int.id_class(1, new rBI<rON>(this, rON.class, 10, false, false, rON.id_super));
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.5f * this.Bx(), this.PN() * 0.4f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Mf;
    }

    public boolean sJ() {
        return ((rmE_2)this.id_throws[49]).id_class(id_this);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_this, false);
    }
}

