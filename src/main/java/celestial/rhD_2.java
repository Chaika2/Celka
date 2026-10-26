/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.eA_2;
import celestial.iB_2;
import celestial.rSg_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfo_3;
import celestial.rhN_2;
import celestial.rhZ_2;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;

public class rhD_2
extends rhm_3 {
    private static final rut_3<Byte> id_implements = rmE_2.id_class(rhD_2.class, ruw_3.id_class);
    private static final rut_3<Boolean> id_finally = rmE_2.id_class(rhD_2.class, ruw_3.id_implements);
    private rdn_3 id_extends = new rdn_3(rdy_3.kY);
    private boolean id_native;
    public int id_private;

    @Override
    public float id_int() {
        return 0.99f;
    }

    public rhD_2(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.g, d, d2, d3, rYB2);
    }

    public rhD_2(rYB rYB2, iB_2 iB_22, rdn_3 rdn_32) {
        super(aI_2.g, iB_22, rYB2);
        this.id_extends = rdn_32.id_implements();
        ((rmE_2)this.id_throws[49]).id_break(id_implements, (byte)eA_2.id_case(rdn_32));
        ((rmE_2)this.id_throws[49]).id_break(id_finally, rdn_32.id_else());
    }

    public rhD_2(aI_2<? extends rhD_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhm_3>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        if (this.id_break > 4) {
            this.id_native = true;
        }
        an_3 an_32 = this.id_else();
        if ((this.id_native || this.id_new()) && an_32 != null) {
            byte by = ((rmE_2)this.id_throws[49]).id_class(id_implements);
            if (by > 0 && !this.id_public()) {
                if (!((rYB)this.id_throws[7]).id_continue && this.id_protected == rhZ_2.ALLOWED) {
                    this.id_class(this.id_catch(), 0.1f);
                }
                this.PD();
            } else if (by > 0) {
                this.id_byte(true);
                rjU_2 rjU_22 = new rjU_2(an_32.rx() - this.rx(), an_32.rH() - this.re(), an_32.BO() - this.BO());
                this.id_volatile(this.rx(), this.re() + rjU_22.id_byte * 0.015 * (double)by, this.BO());
                if (((rYB)this.id_throws[7]).id_continue) {
                    Double d = this.re();
                    this.id_throws[35] = d;
                }
                double d = 0.05 * (double)by;
                this.id_byte(this.rv().id_class(0.95).id_throws(rjU_22.id_protected().id_class(d)));
                if (this.id_private == 0) {
                    this.id_class(rqn_3.dX, 10.0f, 1.0f);
                }
                ++this.id_private;
            }
        }
        super.id_this();
    }

    @Override
    protected rfo_3 id_class(rjU_2 rjU_22, rjU_2 rjU_23) {
        return this.id_native ? null : super.id_class(rjU_22, rjU_23);
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        rfH_2 rfH_22;
        an_3 an_32;
        an_3 an_33 = rfo_32.id_class();
        float f = 8.0f;
        if (an_33 instanceof iB_2) {
            an_32 = (iB_2)an_33;
            f += eA_2.id_class(this.id_extends, ((iB_2)an_32).sG());
        }
        rye_3 rye_32 = rye_3.id_class((an_3)this, (an_32 = this.id_else()) == null ? this : an_32);
        this.id_native = true;
        rqA_2 rqA_22 = rqn_3.dO;
        if (an_33.id_break(rye_32, f)) {
            if (an_33.BC() == aI_2.id_else) {
                return;
            }
            if (an_33 instanceof iB_2) {
                iB_2 iB_22 = (iB_2)an_33;
                if (an_32 instanceof iB_2) {
                    eA_2.id_class(iB_22, an_32);
                    eA_2.id_break((iB_2)an_32, (an_3)iB_22);
                }
                this.id_class(iB_22);
            }
        }
        this.id_byte(this.rv().id_throws(-0.01, -0.1, -0.01));
        float f2 = 1.0f;
        if ((rYB)this.id_throws[7] instanceof rrEm_1 && ((rYB)this.id_throws[7]).S() && eA_2.id_private(this.id_extends) && ((rYB)this.id_throws[7]).id_case(rfH_22 = an_33.Bs())) {
            rSg_1 rSg_12 = aI_2.id_boolean.id_class((rYB)this.id_throws[7]);
            rSg_12.a_(rjU_2.id_protected(rfH_22));
            rSg_12.id_protected(an_32 instanceof rhN_2 ? (rhN_2)an_32 : null);
            ((rYB)this.id_throws[7]).a_(rSg_12);
            rqA_22 = rqn_3.dW;
            f2 = 5.0f;
        }
        this.id_class(rqA_22, f2, 1.0f);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Trident", this.id_extends.id_break(new rcd_3()));
        rcd_32.id_class("DealtDamage", this.id_native);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("Trident", 10)) {
            this.id_extends = rdn_3.id_class(rcd_32.id_int("Trident"));
        }
        this.id_native = rcd_32.id_new("DealtDamage");
        ((rmE_2)this.id_throws[49]).id_break(id_implements, (byte)eA_2.id_case(this.id_extends));
    }

    @Override
    protected rqA_2 id_throws() {
        return rqn_3.dh;
    }

    @Override
    protected rdn_3 id_catch() {
        return this.id_extends.id_implements();
    }

    public boolean id_super() {
        return ((rmE_2)this.id_throws[49]).id_class(id_finally);
    }

    private boolean id_public() {
        an_3 an_32 = this.id_else();
        if (an_32 != null && an_32.BM()) {
            return !(an_32 instanceof rhN_2) || !an_32.id_native();
        }
        return false;
    }

    @Override
    public void id_protected() {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_implements);
        if (this.id_protected != rhZ_2.ALLOWED || by <= 0) {
            super.id_protected();
        }
    }

    @Override
    public boolean id_final(double d, double d2, double d3) {
        return true;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_implements, (byte)0);
        ((rmE_2)this.id_throws[49]).id_class(id_finally, false);
    }

    @Override
    public void c_(rhd_3 rhd_32) {
        an_3 an_32 = this.id_else();
        if (an_32 == null || an_32.ro() == rhd_32.ro()) {
            super.c_(rhd_32);
        }
    }
}

