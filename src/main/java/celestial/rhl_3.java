/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.ai_3;
import celestial.an_3;
import celestial.rFJ;
import celestial.rLQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhf_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rsE_2;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import java.util.Random;

public class rhl_3
extends an_3
implements ai_3 {
    private static final rut_3<rdn_3> id_class = rmE_2.id_class(rhl_3.class, ruw_3.id_catch);
    private double id_break;
    private double id_protected;
    private double id_catch;
    private int id_private;
    private boolean id_implements;

    public rhl_3(aI_2<? extends rhl_3> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    public rhl_3(rYB rYB2, double d, double d2, double d3) {
        this((aI_2<? extends rhl_3>)aI_2.id_while, rYB2);
        this.id_private = 0;
        this.id_new(d, d2, d3);
    }

    @Override
    public void id_this() {
        super.id_this();
        rjU_2 rjU_22 = this.rv();
        double d = this.rx() + rjU_22.id_break;
        double d2 = this.re() + rjU_22.id_byte;
        double d3 = this.BO() + rjU_22.id_protected;
        float f = rfU_2.id_class(rhl_3.id_case(rjU_22));
        Float f2 = Float.valueOf(rhf_3.id_break(((Float)this.id_throws[18]).floatValue(), (float)(rfU_2.id_protected(rjU_22.id_byte, (double)f) * 57.2957763671875)));
        this.id_throws[16] = f2;
        Float f3 = Float.valueOf(rhf_3.id_break(((Float)this.id_throws[17]).floatValue(), (float)(rfU_2.id_protected(rjU_22.id_break, rjU_22.id_protected) * 57.2957763671875)));
        this.id_throws[15] = f3;
        if (!((rYB)this.id_throws[7]).id_continue) {
            double d4 = this.id_break - d;
            double d5 = this.id_catch - d3;
            float f4 = (float)Math.sqrt(d4 * d4 + d5 * d5);
            float f5 = (float)rfU_2.id_protected(d5, d4);
            double d6 = rfU_2.id_protected(0.0025, (double)f, (double)f4);
            double d7 = rjU_22.id_byte;
            if (f4 < 1.0f) {
                d6 *= 0.8;
                d7 *= 0.8;
            }
            int n = this.re() < this.id_protected ? 1 : -1;
            rjU_22 = new rjU_2(Math.cos(f5) * d6, d7 + ((double)n - d7) * (double)0.015f, Math.sin(f5) * d6);
            this.id_byte(rjU_22);
        }
        float f6 = 0.25f;
        if (this.rT()) {
            for (int i = 0; i < 4; ++i) {
                ((rYB)this.id_throws[7]).id_class(rLQ.id_throws, d - rjU_22.id_break * 0.25, d2 - rjU_22.id_byte * 0.25, d3 - rjU_22.id_protected * 0.25, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
            }
        } else {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_transient, d - rjU_22.id_break * 0.25 + ((Random)this.id_throws[40]).nextDouble() * 0.6 - 0.3, d2 - rjU_22.id_byte * 0.25 - 0.5, d3 - rjU_22.id_protected * 0.25 + ((Random)this.id_throws[40]).nextDouble() * 0.6 - 0.3, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_new(d, d2, d3);
            ++this.id_private;
            if (this.id_private > 80 && !((rYB)this.id_throws[7]).id_continue) {
                this.id_class(rqn_3.Bn, 1.0f, 1.0f);
                this.PD();
                if (this.id_implements) {
                    ((rYB)this.id_throws[7]).a_(new rsE_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), this.id_class()));
                } else {
                    ((rYB)this.id_throws[7]).id_byte(2003, this.Bs(), 0);
                }
            }
        } else {
            this.id_volatile(d, d2, d3);
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        rdn_3 rdn_32 = this.id_protected();
        if (!rdn_32.id_class()) {
            rcd_32.id_class("Item", rdn_32.id_break(new rcd_3()));
        }
    }

    public void id_class(rfH_2 rfH_22) {
        double d;
        double d2 = rfH_22.b_();
        int n = rfH_22.c_();
        double d3 = rfH_22.d_();
        double d4 = d2 - this.rx();
        float f = rfU_2.id_class(d4 * d4 + (d = d3 - this.BO()) * d);
        if (f > 12.0f) {
            this.id_break = this.rx() + d4 / (double)f * 12.0;
            this.id_catch = this.BO() + d / (double)f * 12.0;
            this.id_protected = this.re() + 8.0;
        } else {
            this.id_break = d2;
            this.id_protected = n;
            this.id_catch = d3;
        }
        this.id_private = 0;
        this.id_implements = ((Random)this.id_throws[40]).nextInt(5) > 0;
    }

    @Override
    public rdn_3 id_class() {
        rdn_3 rdn_32 = this.id_protected();
        return rdn_32.id_class() ? new rdn_3(rdy_3.JT) : rdn_32;
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
        rdn_3 rdn_32 = rdn_3.id_class(rcd_32.id_int("Item"));
        this.id_break(rdn_32);
    }

    public void id_break(rdn_3 rdn_33) {
        if (rdn_33.id_break() != rdy_3.JT || rdn_33.id_final()) {
            this.BQ().id_break(id_class, rqR_2.id_class(rdn_33.id_implements(), rdn_32 -> rdn_32.id_throws(1)));
        }
    }

    @Override
    public boolean rt() {
        return false;
    }

    @Override
    public void id_extends(double d, double d2, double d3) {
        this.id_catch(d, d2, d3);
        if (((Float)this.id_throws[18]).floatValue() == 0.0f && ((Float)this.id_throws[17]).floatValue() == 0.0f) {
            float f = rfU_2.id_class(d * d + d3 * d3);
            Float f2 = Float.valueOf((float)(rfU_2.id_protected(d, d3) * 57.2957763671875));
            this.id_throws[15] = f2;
            Float f3 = Float.valueOf((float)(rfU_2.id_protected(d2, (double)f) * 57.2957763671875));
            this.id_throws[16] = f3;
            Float f4 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
            this.id_throws[17] = f4;
            Float f5 = Float.valueOf(((Float)this.id_throws[16]).floatValue());
            this.id_throws[18] = f5;
        }
    }

    private rdn_3 id_protected() {
        return this.BQ().id_class(id_class);
    }

    @Override
    public float rX() {
        return 1.0f;
    }

    @Override
    protected void m_() {
        this.BQ().id_class(id_class, rdn_3.id_break);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

