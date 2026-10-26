/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aL_2;
import celestial.aU_2;
import celestial.aa_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBO;
import celestial.rBa_1;
import celestial.rBc_1;
import celestial.rBl_1;
import celestial.rEM;
import celestial.rEi_1;
import celestial.rMZ;
import celestial.rOH;
import celestial.rON;
import celestial.rPD;
import celestial.rRO;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSB;
import celestial.rSk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhj_3;
import celestial.rhm_3;
import celestial.rkB_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.xc_3;
import celestial.xu_3;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;

public abstract class rEb_1
extends rEi_1
implements aa_3 {
    private final rBa_1<rEb_1> id_class = new rBa_1<rEb_1>(this, 1.0, 20, 15.0f);
    private final rBl_1 id_break = new rEM(this, this, 1.2, false);

    protected rEb_1(aI_2<? extends rEb_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
        this.sJ();
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        super.id_class(rRh_12);
        this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OM));
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        aU_22 = super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        this.id_class(rRh_12);
        this.id_break(rRh_12);
        this.sJ();
        this.id_byte(((Random)this.id_throws[40]).nextFloat() < 0.55f * rRh_12.id_byte());
        if (this.id_class(rXQ.HEAD).id_class()) {
            LocalDate localDate = LocalDate.now();
            int n = localDate.get(ChronoField.DAY_OF_MONTH);
            int n2 = localDate.get(ChronoField.MONTH_OF_YEAR);
            if (n2 == 10 && n == 31 && ((Random)this.id_throws[40]).nextFloat() < 0.25f) {
                this.id_class(rXQ.HEAD, new rdn_3(((Random)this.id_throws[40]).nextFloat() < 0.1f ? xu_3.BP : xu_3.Br));
                this.id_continue[rXQ.HEAD.id_break()] = 0.0f;
            }
        }
        return aU_22;
    }

    @Override
    public boolean id_class(rkB_2 rkB_22) {
        return rkB_22 == rdy_3.OM;
    }

    @Override
    public void id_class(rXQ rXQ2, rdn_3 rdn_32) {
        super.id_class(rXQ2, rdn_32);
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.sJ();
        }
    }

    @Override
    public void id_default() {
        boolean bl = this.F();
        if (bl) {
            rdn_3 rdn_32 = this.id_class(rXQ.HEAD);
            if (!rdn_32.id_class()) {
                if (rdn_32.id_throws()) {
                    rdn_32.id_break(rdn_32.id_catch() + ((Random)this.id_throws[40]).nextInt(2));
                    if (rdn_32.id_catch() >= rdn_32.id_private()) {
                        this.id_break(rXQ.HEAD);
                        this.id_class(rXQ.HEAD, rdn_3.id_break);
                    }
                }
                bl = false;
            }
            if (bl) {
                this.id_case(8);
            }
        }
        super.id_default();
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(this.L(), 0.15f, 1.0f);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 1.74f;
    }

    protected rhm_3 id_break(rdn_3 rdn_32, float f) {
        return rhj_3.id_class(this, rdn_32, f);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.sJ();
    }

    @Override
    public void id_break(iB_2 iB_22, float f) {
        rdn_3 rdn_32 = this.id_case(this.id_protected(rhj_3.id_class(this, rdy_3.OM)));
        rhm_3 rhm_32 = this.id_break(rdn_32, f);
        double d = iB_22.rx() - this.rx();
        double d2 = iB_22.id_byte(0.3333333333333333) - rhm_32.re();
        double d3 = iB_22.BO() - this.BO();
        double d4 = rfU_2.id_class(d * d + d3 * d3);
        rhm_32.id_byte(d, d2 + d4 * (double)0.2f, d3, 1.6f, 14 - ((rYB)this.id_throws[7]).id_abstract().id_class() * 4);
        this.id_class(rqn_3.JT, 1.0f, 1.0f / (this.Sa().nextFloat() * 0.4f + 0.8f));
        ((rYB)this.id_throws[7]).a_(rhm_32);
    }

    public static iz_3 id_throws() {
        return rEi_1.sm().id_class(iQ_2.id_protected, 0.25);
    }

    public abstract rqA_2 L();

    @Override
    protected void id_final() {
        this.id_package.id_class(2, new rSB(this));
        this.id_package.id_class(3, new rBO(this, 1.0));
        this.id_package.id_class(3, new rPD<rOH>(this, rOH.class, 6.0f, 1.0, 1.2));
        this.id_package.id_class(5, new rSk_1(this, 1.0));
        this.id_package.id_class(6, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(6, new rBC(this));
        this.id_int.id_class(1, new rBc_1(this, new Class[0]));
        this.id_int.id_class(2, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
        this.id_int.id_class(3, new rBI<rMZ>((is_3)this, rMZ.class, true));
        this.id_int.id_class(3, new rBI<rON>(this, rON.class, 10, true, false, rON.id_super));
    }

    @Override
    public void A() {
        super.A();
        if (this.ra() instanceof aA_2) {
            aA_2 aA_22 = (aA_2)this.ra();
            Float f = Float.valueOf(((Float)aA_22.id_private[23]).floatValue());
            this.id_private[23] = f;
        }
    }

    @Override
    public double Pv() {
        return -0.6;
    }

    public void sJ() {
        if ((rYB)this.id_throws[7] != null && !((rYB)this.id_throws[7]).id_continue) {
            this.id_package.id_class(this.id_break);
            this.id_package.id_class(this.id_class);
            rdn_3 rdn_32 = this.id_protected(rhj_3.id_class(this, rdy_3.OM));
            if (rdn_32.id_break() == rdy_3.OM) {
                int n = 20;
                if (((rYB)this.id_throws[7]).id_abstract() != rRO.HARD) {
                    n = 40;
                }
                this.id_class.id_class(n);
                this.id_package.id_class(4, this.id_class);
            } else {
                this.id_package.id_class(4, this.id_break);
            }
        }
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_break;
    }
}

