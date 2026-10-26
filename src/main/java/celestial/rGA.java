/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.rBI;
import celestial.rEK;
import celestial.rGC;
import celestial.rGH;
import celestial.rGl_1;
import celestial.rGn_1;
import celestial.rGy_1;
import celestial.rLQ;
import celestial.rLx_1;
import celestial.rMZ;
import celestial.rRI;
import celestial.rRO;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rYB;
import celestial.rYl_1;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqO_2;
import celestial.rqm_3;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.rzl_3;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class rGA
extends is_3
implements rEK {
    private static final rut_3<Integer> id_super = rmE_2.id_class(rGA.class, ruw_3.id_break);
    public float id_class;
    public float id_break;
    public float id_protected;
    private boolean id_this;

    @Override
    protected boolean id_boolean() {
        return this.sk() > 0;
    }

    @Override
    public void id_byte(an_3 an_32) {
        super.id_byte(an_32);
        if (an_32 instanceof rMZ && this.n()) {
            this.id_private((iB_2)an_32);
        }
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return this.sW() ? rqn_3.xW : rqn_3.Jf;
    }

    public static boolean id_byte(aI_2<rGA> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        if (rRg_12.id_abstract() != rRO.PEACEFUL) {
            boolean bl;
            if (Objects.equals(rRg_12.id_protected(rfH_22), Optional.of(rYl_1.id_catch)) && rfH_22.c_() > 50 && rfH_22.c_() < 70 && random.nextFloat() < 0.5f && random.nextFloat() < rRg_12.id_interface() && rRg_12.id_package(rfH_22) <= random.nextInt(8)) {
                return rGA.id_class(aI_22, rRg_12, iO_22, rfH_22, random);
            }
            if (!(rRg_12 instanceof rRI)) {
                return false;
            }
            rfj_3 rfj_32 = new rfj_3(rfH_22);
            boolean bl2 = bl = rqm_3.id_class(rfj_32.id_break, rfj_32.id_byte, ((rRI)rRg_12).id_break(), 987234911L).nextInt(10) == 0;
            if (random.nextInt(10) == 0 && bl && rfH_22.c_() < 40) {
                return rGA.id_class(aI_22, rRg_12, iO_22, rfH_22, random);
            }
        }
        return false;
    }

    public rGA(aI_2<? extends rGA> aI_22, rYB rYB2) {
        super((aI_2<? extends is_3>)aI_22, rYB2);
        this.id_native = new rGy_1(this);
    }

    @Override
    public void id_this() {
        this.id_break += (this.id_class - this.id_break) * 0.5f;
        this.id_protected = this.id_break;
        super.id_this();
        if (((Boolean)this.id_throws[20]).booleanValue() && !this.id_this) {
            int n = this.sk();
            for (int i = 0; i < n * 8; ++i) {
                float f = ((Random)this.id_throws[40]).nextFloat() * ((float)Math.PI * 2);
                float f2 = ((Random)this.id_throws[40]).nextFloat() * 0.5f + 0.5f;
                float f3 = rfU_2.id_class(f) * (float)n * 0.5f * f2;
                float f4 = rfU_2.id_break(f) * (float)n * 0.5f * f2;
                ((rYB)this.id_throws[7]).id_class(this.id_catch(), this.rx() + (double)f3, this.re(), this.BO() + (double)f4, 0.0, 0.0, 0.0);
            }
            this.id_class(this.sx(), this.Si(), ((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f) / 0.8f);
            this.id_class = -0.5f;
        } else if (!((Boolean)this.id_throws[20]).booleanValue() && this.id_this) {
            this.id_class = 1.0f;
        }
        this.id_this = (Boolean)this.id_throws[20];
        this.L();
    }

    protected boolean n() {
        return !this.sW() && this.id_try();
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_super.equals(rut_32)) {
            this.q_();
            Float f = Float.valueOf(((Float)this.id_private[25]).floatValue());
            this.id_throws[15] = f;
            Float f2 = Float.valueOf(((Float)this.id_private[25]).floatValue());
            this.id_private[23] = f2;
            if (this.rT() && ((Random)this.id_throws[40]).nextInt(20) == 0) {
                this.U();
            }
        }
        super.id_class(rut_32);
    }

    protected void id_class(int n, boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_super, n);
        this.PX();
        this.q_();
        this.id_byte(iQ_2.id_class).id_class(n * n);
        this.id_byte(iQ_2.id_protected).id_class(0.2f + 0.1f * (float)n);
        this.id_byte(iQ_2.id_case).id_class(n);
        if (bl) {
            this.id_public(this.SK());
        }
        this.id_finally = n;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        int n = ((Random)this.id_throws[40]).nextInt(3);
        if (n < 2 && ((Random)this.id_throws[40]).nextFloat() < 0.5f * rRh_12.id_byte()) {
            ++n;
        }
        int n2 = 1 << n;
        this.id_class(n2, true);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    public static /* synthetic */ boolean id_class(rGA rGA2) {
        return (Boolean)rGA2.id_throws[20];
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Size", this.sk() - 1);
        rcd_32.id_class("wasOnGround", this.id_this);
    }

    protected rqA_2 sd() {
        return this.sW() ? rqn_3.xz : rqn_3.Jj;
    }

    @Override
    protected rqO_2 id_short() {
        return this.sk() == 1 ? this.BC().id_finally() : rzl_3.id_class;
    }

    @Override
    public int r() {
        return 0;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 0.625f * ap_32.id_break;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        int n = rcd_32.id_private("Size");
        if (n < 0) {
            n = 0;
        }
        this.id_class(n + 1, false);
        super.id_break(rcd_32);
        this.id_this = rcd_32.id_new("wasOnGround");
    }

    public float id_throws() {
        float f = this.sW() ? 1.4f : 0.8f;
        return ((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f) * f;
    }

    protected void L() {
        this.id_class *= 0.6f;
    }

    protected rqA_2 sx() {
        return this.sW() ? rqn_3.xQ : rqn_3.JV;
    }

    public int sk() {
        return ((rmE_2)this.id_throws[49]).id_class(id_super);
    }

    @Override
    public void PD() {
        int n = this.sk();
        if (!((rYB)this.id_throws[7]).id_continue && n > 1 && this.Sl()) {
            rgP_2 rgP_22 = this.rD();
            boolean bl = this.c();
            float f = (float)n / 4.0f;
            int n2 = n / 2;
            int n3 = 2 + ((Random)this.id_throws[40]).nextInt(3);
            for (int i = 0; i < n3; ++i) {
                float f2 = ((float)(i % 2) - 0.5f) * f;
                float f3 = ((float)(i / 2) - 0.5f) * f;
                rGA rGA2 = this.BC().id_class((rYB)this.id_throws[7]);
                if (this.O()) {
                    rGA2.b();
                }
                rGA2.id_break(rgP_22);
                rGA2.id_protected(bl);
                rGA2.id_catch(this.rg());
                rGA2.id_class(n2, true);
                rGA2.id_class(this.rx() + (double)f2, this.re() + 0.5, this.BO() + (double)f3, ((Random)this.id_throws[40]).nextFloat() * 360.0f, 0.0f);
                ((rYB)this.id_throws[7]).a_(rGA2);
            }
        }
        super.PD();
    }

    protected rLx_1 id_catch() {
        return rLQ.id_static;
    }

    @Override
    protected void id_continue(boolean bl) {
        rjU_2 rjU_22 = this.rv();
        this.id_catch(rjU_22.id_break, this.ST(), rjU_22.id_protected);
        Boolean bl2 = true;
        this.id_throws[57] = bl2;
    }

    protected int id_implements() {
        return ((Random)this.id_throws[40]).nextInt(20) + 10;
    }

    protected void id_private(iB_2 iB_22) {
        if (this.BM()) {
            int n = this.sk();
            if (this.id_int(iB_22) < 0.6 * (double)n * 0.6 * (double)n && this.id_while(iB_22) && iB_22.id_break(rye_3.id_byte(this), this.sJ())) {
                this.id_class(rqn_3.Jw, 1.0f, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f);
                this.id_class((iB_2)this, (an_3)iB_22);
            }
        }
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rGl_1(this));
        this.id_package.id_class(2, new rGn_1(this));
        this.id_package.id_class(3, new rGC(this));
        this.id_package.id_class(5, new rGH(this));
        this.id_int.id_class(1, new rBI<rhd_3>(this, rhd_3.class, 10, true, false, iB_22 -> Math.abs(iB_22.re() - this.re()) <= 4.0));
        this.id_int.id_class(3, new rBI<rMZ>((is_3)this, rMZ.class, true));
    }

    protected boolean sz() {
        return this.sk() > 0;
    }

    public aI_2<? extends rGA> BC() {
        return super.BC();
    }

    @Override
    protected rqA_2 Bt() {
        return this.sW() ? rqn_3.xk : rqn_3.JI;
    }

    protected float sJ() {
        return (float)this.id_class(iQ_2.id_case);
    }

    public boolean sW() {
        return this.sk() <= 1;
    }

    @Override
    protected float Si() {
        return 0.4f * (float)this.sk();
    }

    @Override
    public ap_3 a_(iM_2 iM_22) {
        return super.a_(iM_22).id_class(0.255f * (float)this.sk());
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_super, 1);
    }

    @Override
    public void q_() {
        double d = this.rx();
        double d2 = this.re();
        double d3 = this.BO();
        super.q_();
        this.id_new(d, d2, d3);
    }

    @Override
    public void c_(rhd_3 rhd_32) {
        if (this.n()) {
            this.id_private(rhd_32);
        }
    }
}

