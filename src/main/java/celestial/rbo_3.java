/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.ay_3;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBD;
import celestial.rBG;
import celestial.rBM;
import celestial.rBc_1;
import celestial.rBh_1;
import celestial.rBl_1;
import celestial.rBr_1;
import celestial.rEI;
import celestial.rLQ;
import celestial.rLw_1;
import celestial.rLx_1;
import celestial.rLy_1;
import celestial.rOl_1;
import celestial.rPD;
import celestial.rPj_1;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rbD_2;
import celestial.rbK_2;
import celestial.rbU_2;
import celestial.rbe_3;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rlc_3;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqM_2;
import celestial.rqn_3;
import celestial.rsE_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

public class rbo_3
extends rOl_1 {
    private static final rut_3<rfH_2> id_break = rmE_2.id_class(rbo_3.class, ruw_3.id_native);
    private static final rut_3<Boolean> id_protected = rmE_2.id_class(rbo_3.class, ruw_3.id_implements);
    private static final rut_3<Integer> id_super = rmE_2.id_class(rbo_3.class, ruw_3.id_break);
    public static final ay_3 id_this = new ay_3().id_class(10.0).id_break().id_class().id_byte();
    public static final Predicate<rsE_2> id_class = rsE_22 -> !rsE_22.id_package() && rsE_22.BM() && rsE_22.rT();

    public static /* synthetic */ Random id_byte(rbo_3 rbo_32) {
        return (Random)rbo_32.id_throws[40];
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Pj;
    }

    public rbo_3(aI_2<? extends rbo_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rOl_1>)aI_22, rYB2);
        this.id_native = new rbK_2(this);
        this.id_extends = new rPj_1(this, 10);
        this.id_byte(true);
    }

    @Override
    public int S() {
        return 1;
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_protected, bl);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.c()) {
            this.id_throws(this.ri());
        } else {
            if (this.Pk()) {
                this.id_break(2400);
            } else {
                this.id_break(this.n() - 1);
                if (this.n() <= 0) {
                    this.id_break(rye_3.id_this, 1.0f);
                }
                if (((Boolean)this.id_throws[20]).booleanValue()) {
                    this.id_byte(this.rv().id_break((((Random)this.id_throws[40]).nextFloat() * 2.0f - 1.0f) * 0.2f, 0.5, (((Random)this.id_throws[40]).nextFloat() * 2.0f - 1.0f) * 0.2f));
                    Float f = Float.valueOf(((Random)this.id_throws[40]).nextFloat() * 360.0f);
                    this.id_throws[15] = f;
                    Boolean bl = false;
                    this.id_throws[20] = bl;
                    Boolean bl2 = true;
                    this.id_throws[57] = bl2;
                }
            }
            if (((rYB)this.id_throws[7]).id_continue && this.rT() && this.rv().id_catch() > 0.03) {
                rjU_2 rjU_22 = this.id_break(0.0f);
                float f = rfU_2.id_break(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180)) * 0.3f;
                float f2 = rfU_2.id_class(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180)) * 0.3f;
                float f3 = 1.2f - ((Random)this.id_throws[40]).nextFloat() * 0.7f;
                for (int i = 0; i < 2; ++i) {
                    ((rYB)this.id_throws[7]).id_class(rLQ.X, this.rx() - rjU_22.id_break * (double)f3 + (double)f, this.re() - rjU_22.id_byte, this.BO() - rjU_22.id_protected * (double)f3 + (double)f2, 0.0, 0.0, 0.0);
                    ((rYB)this.id_throws[7]).id_class(rLQ.X, this.rx() - rjU_22.id_break * (double)f3 - (double)f, this.re() - rjU_22.id_byte, this.BO() - rjU_22.id_protected * (double)f3 - (double)f2, 0.0, 0.0, 0.0);
                }
            }
        }
    }

    public int n() {
        return ((rmE_2)this.id_throws[49]).id_class(id_super);
    }

    @Override
    public void id_class(byte by) {
        if (by == 38) {
            this.id_class(rLQ.id_char);
        } else {
            super.id_class(by);
        }
    }

    private void id_class(rLx_1 rLx_12) {
        for (int i = 0; i < 7; ++i) {
            double d = ((Random)this.id_throws[40]).nextGaussian() * 0.01;
            double d2 = ((Random)this.id_throws[40]).nextGaussian() * 0.01;
            double d3 = ((Random)this.id_throws[40]).nextGaussian() * 0.01;
            ((rYB)this.id_throws[7]).id_class(rLx_12, this.id_break(1.0), this.Ph() + 0.2, this.id_protected(1.0), d, d2, d3);
        }
    }

    @Override
    protected void id_class(int n) {
    }

    public static /* synthetic */ Random id_class(rbo_3 rbo_32) {
        return (Random)rbo_32.id_throws[40];
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_throws(this.ri());
        Float f = Float.valueOf(0.0f);
        this.id_throws[16] = f;
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("TreasurePosX", this.id_throws().b_());
        rcd_32.id_break("TreasurePosY", this.id_throws().c_());
        rcd_32.id_break("TreasurePosZ", this.id_throws().d_());
        rcd_32.id_class("GotFish", this.L());
        rcd_32.id_break("Moistness", this.n());
    }

    @Override
    public int r() {
        return 1;
    }

    public static /* synthetic */ Random id_break(rbo_3 rbo_32) {
        return (Random)rbo_32.id_throws[40];
    }

    @Override
    protected void id_break(rsE_2 rsE_22) {
        rdn_3 rdn_32;
        if (this.id_class(rXQ.MAINHAND).id_class() && this.id_private(rdn_32 = rsE_22.id_protected())) {
            this.id_class(rsE_22);
            this.id_class(rXQ.MAINHAND, rdn_32);
            this.id_new[rXQ.MAINHAND.id_break()] = 2.0f;
            this.id_class((an_3)rsE_22, rdn_32.id_char());
            rsE_22.PD();
        }
    }

    public static boolean id_break(aI_2<rbo_3> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        if (rfH_22.c_() > 45 && rfH_22.c_() < rRg_12.id_short()) {
            Optional<rqM_2<rYG>> optional = rRg_12.id_protected(rfH_22);
            return (!Objects.equals(optional, Optional.of(rYl_1.id_class)) || !Objects.equals(optional, Optional.of(rYl_1.id_goto))) && rRg_12.id_break(rfH_22).id_class(rlG_2.id_break);
        }
        return false;
    }

    @Override
    protected ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (!rdn_32.id_class() && rdn_32.id_break().id_class(rlc_3.id_switch)) {
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_class(rqn_3.Pf, 1.0f, 1.0f);
            }
            this.id_this(true);
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return super.id_break(rhd_32, rpm_32);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        int n = rcd_32.id_private("TreasurePosX");
        int n2 = rcd_32.id_private("TreasurePosY");
        int n3 = rcd_32.id_private("TreasurePosZ");
        this.id_implements(new rfH_2(n, n2, n3));
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("GotFish"));
        this.id_break(rcd_32.id_private("Moistness"));
    }

    @Override
    protected rLy_1 id_break(rYB rYB2) {
        return new rLw_1(this, rYB2);
    }

    public void id_break(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_super, n);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 0.3f;
    }

    public rfH_2 id_throws() {
        return ((rmE_2)this.id_throws[49]).id_class(id_break);
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        if (!this.id_class(rXQ2).id_class()) {
            return false;
        }
        return rXQ2 == rXQ.MAINHAND && super.id_throws(rdn_32);
    }

    public boolean L() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected);
    }

    protected boolean sx() {
        rfH_2 rfH_22 = this.id_public().id_catch();
        return rfH_22 != null ? rfH_22.id_class((eX_2)this.Ps(), 12.0) : false;
    }

    public void id_implements(rfH_2 rfH_22) {
        ((rmE_2)this.id_throws[49]).id_break(id_break, rfH_22);
    }

    @Override
    protected boolean id_new(an_3 an_32) {
        return true;
    }

    @Override
    protected int id_new(int n) {
        return this.ri();
    }

    @Override
    protected rqA_2 id_static() {
        return this.rT() ? rqn_3.Pt : rqn_3.PT;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        boolean bl = an_32.id_break(rye_3.id_byte(this), (int)this.id_class(iQ_2.id_case));
        if (bl) {
            this.id_class((iB_2)this, an_32);
            this.id_class(rqn_3.Pw, 1.0f, 1.0f);
        }
        return bl;
    }

    @Override
    public boolean id_protected(rhd_3 rhd_32) {
        return true;
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        if (this.id_try() && this.rT()) {
            this.id_class(this.sB(), rjU_22);
            this.id_class(iG_2.SELF, this.rv());
            this.id_byte(this.rv().id_class(0.9));
            if (this.I_() == null) {
                this.id_byte(this.rv().id_break(0.0, -0.005, 0.0));
            }
        } else {
            super.id_private(rjU_22);
        }
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rBr_1(this));
        this.id_package.id_class(0, new rBM(this));
        this.id_package.id_class(1, new rbU_2(this));
        this.id_package.id_class(2, new rbe_3(this, 4.0));
        this.id_package.id_class(4, new rBD(this, 1.0, 10));
        this.id_package.id_class(4, new rBC(this));
        this.id_package.id_class(5, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(5, new rBG(this, 10));
        this.id_package.id_class(6, new rBl_1(this, 1.2f, true));
        this.id_package.id_class(8, new rbD_2(this));
        this.id_package.id_class(8, new rBh_1(this));
        this.id_package.id_class(9, new rPD<rEI>(this, rEI.class, 8.0f, 1.0, 1.0));
        this.id_int.id_class(1, new rBc_1(this, rEI.class).id_class(new Class[0]));
    }

    @Override
    public int ri() {
        return 4800;
    }

    @Override
    protected rqA_2 BB() {
        return rqn_3.PY;
    }

    @Override
    protected rqA_2 BJ() {
        return rqn_3.PR;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.PI;
    }

    public static iz_3 sJ() {
        return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 1.2f).id_class(iQ_2.id_case, 3.0);
    }

    @Override
    public boolean SO() {
        return false;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_break, rfH_2.id_protected);
        ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
        ((rmE_2)this.id_throws[49]).id_class(id_super, 2400);
    }
}

