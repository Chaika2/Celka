/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rFJ;
import celestial.rLQ;
import celestial.rLx_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfU_2;
import celestial.rhf_3;
import celestial.rhj_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.ruS_2;
import celestial.rye_3;

public abstract class rhL_2
extends rhf_3 {
    public double id_class;
    public double id_break;
    public double id_protected;

    public rhL_2(aI_2<? extends rhL_2> aI_22, iB_2 iB_22, double d, double d2, double d3, rYB rYB2) {
        this(aI_22, iB_22.rx(), iB_22.re(), iB_22.BO(), d, d2, d3, rYB2);
        this.id_break(iB_22);
        this.id_case(((Float)iB_22.id_throws[15]).floatValue(), ((Float)iB_22.id_throws[16]).floatValue());
    }

    public rhL_2(aI_2<? extends rhL_2> aI_22, double d, double d2, double d3, double d4, double d5, double d6, rYB rYB2) {
        this(aI_22, rYB2);
        this.id_class(d, d2, d3, ((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
        this.PX();
        double d7 = rfU_2.id_class(d4 * d4 + d5 * d5 + d6 * d6);
        if (d7 != 0.0) {
            this.id_class = d4 / d7 * 0.1;
            this.id_break = d5 / d7 * 0.1;
            this.id_protected = d6 / d7 * 0.1;
        }
    }

    protected rhL_2(aI_2<? extends rhL_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhf_3>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        an_3 an_32 = this.id_else();
        if (((rYB)this.id_throws[7]).id_continue || (an_32 == null || !((Boolean)an_32.id_throws[27]).booleanValue()) && ((rYB)this.id_throws[7]).id_int(this.Bs())) {
            rjG_2 rjG_22;
            super.id_this();
            if (this.id_throws()) {
                this.id_case(1);
            }
            if ((rjG_22 = rhj_3.id_class((an_3)this, this::id_class)).id_byte() != rjM_2.MISS) {
                this.id_class(rjG_22);
            }
            this.Px();
            rjU_2 rjU_22 = this.rv();
            double d = this.rx() + rjU_22.id_break;
            double d2 = this.re() + rjU_22.id_byte;
            double d3 = this.BO() + rjU_22.id_protected;
            rhj_3.id_class((an_3)this, 0.2f);
            float f = this.id_catch();
            if (this.rT()) {
                for (int i = 0; i < 4; ++i) {
                    float f2 = 0.25f;
                    ((rYB)this.id_throws[7]).id_class(rLQ.id_throws, d - rjU_22.id_break * 0.25, d2 - rjU_22.id_byte * 0.25, d3 - rjU_22.id_protected * 0.25, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
                }
                f = 0.8f;
            }
            this.id_byte(rjU_22.id_break(this.id_class, this.id_break, this.id_protected).id_class((double)f));
            ((rYB)this.id_throws[7]).id_class(this.id_case(), d, d2 + 0.5, d3, 0.0, 0.0, 0.0);
            this.id_new(d, d2, d3);
        } else {
            this.PD();
        }
    }

    @Override
    public float f() {
        return 1.0f;
    }

    @Override
    protected boolean id_class(an_3 an_32) {
        return super.id_class(an_32) && (Boolean)an_32.id_throws[38] == false;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("power", this.id_class(new double[]{this.id_class, this.id_break, this.id_protected}));
    }

    @Override
    public boolean id_class(double d) {
        double d2 = this.rN().id_class() * 4.0;
        if (Double.isNaN(d2)) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        rcy_3 rcy_32;
        super.id_break(rcd_32);
        if (rcd_32.id_byte("power", 9) && (rcy_32 = rcd_32.id_protected("power", 6)).size() == 3) {
            this.id_class = rcy_32.id_catch(0);
            this.id_break = rcy_32.id_catch(1);
            this.id_protected = rcy_32.id_catch(2);
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        this.rf();
        an_3 an_32 = rye_32.id_extends();
        if (an_32 != null) {
            rjU_2 rjU_22 = an_32.m();
            this.id_byte(rjU_22);
            this.id_class = rjU_22.id_break * 0.1;
            this.id_break = rjU_22.id_byte * 0.1;
            this.id_protected = rjU_22.id_protected * 0.1;
            this.id_break(an_32);
            return true;
        }
        return false;
    }

    protected boolean id_throws() {
        return true;
    }

    protected float id_catch() {
        return 0.95f;
    }

    protected rLx_1 id_case() {
        return rLQ.id_double;
    }

    @Override
    public float rX() {
        return 1.0f;
    }

    @Override
    public boolean rY() {
        return true;
    }

    @Override
    protected void m_() {
    }

    @Override
    public ruS_2<?> p_() {
        an_3 an_32 = this.id_else();
        int n = an_32 == null ? 0 : an_32.V();
        return new rFJ(this.V(), this.ro(), this.rx(), this.re(), this.BO(), ((Float)this.id_throws[16]).floatValue(), ((Float)this.id_throws[15]).floatValue(), this.BC(), n, new rjU_2(this.id_class, this.id_break, this.id_protected));
    }
}

