/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aa_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iQ_2;
import celestial.ic_3;
import celestial.id_3;
import celestial.ix_3;
import celestial.iz_3;
import celestial.rAB;
import celestial.rAS;
import celestial.rBA;
import celestial.rBC;
import celestial.rBc_1;
import celestial.rBe_1;
import celestial.rBw_1;
import celestial.rEB;
import celestial.rEi_1;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rLi_1;
import celestial.rSb_1;
import celestial.rSh_1;
import celestial.rSk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhI_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rGi_1
extends rEB
implements aa_3 {
    private static final UUID id_protected = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
    private static final ix_3 id_super = new ix_3(id_protected, "Drinking speed penalty", -0.25, id_3.ADDITION);
    private static final rut_3<Boolean> id_this = rmE_2.id_class(rGi_1.class, ruw_3.id_implements);
    private int id_else;
    private rBw_1<rEB> id_synchronized;
    private rSh_1<rhd_3> id_return;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.kK;
    }

    public rGi_1(aI_2<? extends rGi_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rEB>)aI_22, rYB2);
    }

    @Override
    public void id_class(byte by) {
        if (by == 15) {
            for (int i = 0; i < ((Random)this.id_throws[40]).nextInt(35) + 10; ++i) {
                ((rYB)this.id_throws[7]).id_class(rLQ.G, this.rx() + ((Random)this.id_throws[40]).nextGaussian() * (double)0.13f, this.rN().id_throws + 0.5 + ((Random)this.id_throws[40]).nextGaussian() * (double)0.13f, this.BO() + ((Random)this.id_throws[40]).nextGaussian() * (double)0.13f, 0.0, 0.0, 0.0);
            }
        } else {
            super.id_class(by);
        }
    }

    @Override
    public void id_class(int n, boolean bl) {
    }

    @Override
    public void id_default() {
        if (!((rYB)this.id_throws[7]).id_continue && this.BM()) {
            this.id_synchronized.id_private();
            if (this.id_synchronized.id_catch() <= 0) {
                this.id_return.id_class(true);
            } else {
                this.id_return.id_class(false);
            }
            if (this.id_throws()) {
                if (this.id_else-- <= 0) {
                    List<rLY> list;
                    this.id_public(false);
                    rdn_3 rdn_32 = this.ss();
                    this.id_class(rXQ.MAINHAND, rdn_3.id_break);
                    if (rdn_32.id_break() == rdy_3.JA && (list = rAB.id_class(rdn_32)) != null) {
                        for (rLY rLY2 : list) {
                            this.id_break(new rLY(rLY2));
                        }
                    }
                    this.id_byte(iQ_2.id_protected).id_protected(id_super);
                }
            } else {
                rLi_1 rLi_12 = null;
                if (((Random)this.id_throws[40]).nextFloat() < 0.15f && ((an_3)this).id_class(rlG_2.id_break) && !this.id_break(rLD.id_volatile)) {
                    rLi_12 = rAS.id_public;
                } else if (((Random)this.id_throws[40]).nextFloat() < 0.15f && (this.Pz() || this.SJ() != null && this.SJ().id_int()) && !this.id_break(rLD.id_native)) {
                    rLi_12 = rAS.id_volatile;
                } else if (((Random)this.id_throws[40]).nextFloat() < 0.05f && this.Ss() < this.SK()) {
                    rLi_12 = rAS.id_while;
                } else if (((Random)this.id_throws[40]).nextFloat() < 0.5f && this.I_() != null && !this.id_break(rLD.id_class) && this.I_().id_int(this) > 121.0) {
                    rLi_12 = rAS.id_package;
                }
                if (rLi_12 != null) {
                    this.id_class(rXQ.MAINHAND, rAB.id_class(new rdn_3(rdy_3.JA), rLi_12));
                    this.id_else = this.ss().id_extends();
                    this.id_public(true);
                    if (!this.BF()) {
                        ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.ko, this.Pr(), 1.0f, 0.8f + ((Random)this.id_throws[40]).nextFloat() * 0.4f);
                    }
                    ic_3 ic_32 = this.id_byte(iQ_2.id_protected);
                    ic_32.id_protected(id_super);
                    ic_32.id_break(id_super);
                }
            }
            if (((Random)this.id_throws[40]).nextFloat() < 7.5E-4f) {
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)15);
            }
        }
        super.id_default();
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 1.62f;
    }

    @Override
    public void id_break(iB_2 iB_22, float f) {
        if (!this.id_throws()) {
            rjU_2 rjU_22 = iB_22.rv();
            double d = iB_22.rx() + rjU_22.id_break - this.rx();
            double d2 = iB_22.rH() - (double)1.1f - this.re();
            double d3 = iB_22.BO() + rjU_22.id_protected - this.BO();
            float f2 = rfU_2.id_class(d * d + d3 * d3);
            rLi_1 rLi_12 = rAS.id_instanceof;
            if (iB_22 instanceof rEB) {
                rLi_12 = iB_22.Ss() <= 4.0f ? rAS.id_while : rAS.id_long;
                this.id_byte((iB_2)null);
            } else if (f2 >= 8.0f && !iB_22.id_break(rLD.id_break)) {
                rLi_12 = rAS.id_continue;
            } else if (iB_22.Ss() >= 8.0f && !iB_22.id_break(rLD.id_super)) {
                rLi_12 = rAS.id_interface;
            } else if (f2 <= 3.0f && !iB_22.id_break(rLD.id_continue) && ((Random)this.id_throws[40]).nextFloat() < 0.25f) {
                rLi_12 = rAS.id_default;
            }
            rhI_2 rhI_22 = new rhI_2((rYB)this.id_throws[7], this);
            rhI_22.id_break(rAB.id_class(new rdn_3(rdy_3.kk), rLi_12));
            rhI_2 rhI_23 = rhI_22;
            Float f3 = Float.valueOf(((Float)rhI_23.id_throws[16]).floatValue() - -20.0f);
            rhI_23.id_throws[16] = f3;
            rhI_22.id_byte(d, d2 + (double)(f2 * 0.2f), d3, 0.75f, 8.0f);
            if (!this.BF()) {
                ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.kD, this.Pr(), 1.0f, 0.8f + ((Random)this.id_throws[40]).nextFloat() * 0.4f);
            }
            ((rYB)this.id_throws[7]).a_(rhI_22);
        }
    }

    @Override
    protected float id_throws(rye_3 rye_32, float f) {
        f = super.id_throws(rye_32, f);
        if (rye_32.id_extends() == this) {
            f = 0.0f;
        }
        if (rye_32.id_this()) {
            f = (float)((double)f * 0.15);
        }
        return f;
    }

    public boolean id_throws() {
        return this.BQ().id_class(id_this);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.kg;
    }

    public void id_public(boolean bl) {
        this.BQ().id_break(id_this, bl);
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_synchronized = new rBw_1<rEB>(this, rEB.class, true, iB_22 -> iB_22 != null && this.sd() && iB_22.BC() != aI_2.a);
        this.id_return = new rSh_1<rhd_3>(this, rhd_3.class, 10, true, false, (Predicate<iB_2>)null);
        this.id_package.id_class(1, new rSb_1(this));
        this.id_package.id_class(2, new rBe_1(this, 1.0, 60, 10.0f));
        this.id_package.id_class(2, new rSk_1(this, 1.0));
        this.id_package.id_class(3, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(3, new rBC(this));
        this.id_int.id_class(1, new rBc_1(this, rEB.class));
        this.id_int.id_class(2, this.id_synchronized);
        this.id_int.id_class(3, this.id_return);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.kY;
    }

    public static iz_3 sN() {
        return rEi_1.sm().id_class(iQ_2.id_class, 26.0).id_class(iQ_2.id_protected, 0.25);
    }

    @Override
    public boolean su() {
        return false;
    }

    @Override
    public rqA_2 sQ() {
        return rqn_3.kR;
    }

    @Override
    protected void m_() {
        super.m_();
        this.BQ().id_class(id_this, false);
    }
}

