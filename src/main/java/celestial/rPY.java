/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iQ_2;
import celestial.is_3;
import celestial.rLn_1;
import celestial.rLp_1;
import celestial.rLy_1;
import celestial.rPo_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjC_2;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.xc_3;
import celestial.xd_3;

public class rPY {
    protected final is_3 id_class;
    protected double id_break;
    protected double id_byte;
    protected double id_protected;
    protected double id_throws;
    protected float id_case;
    protected float id_catch;
    protected rPo_1 id_private = rPo_1.WAIT;

    public double id_byte() {
        return this.id_throws;
    }

    public rPY(is_3 is_32) {
        this.id_class = is_32;
    }

    protected float id_class(float f, float f2, float f3) {
        float f4;
        float f5 = rfU_2.id_catch(f2 - f);
        if (f5 > f3) {
            f5 = f3;
        }
        if (f5 < -f3) {
            f5 = -f3;
        }
        if ((f4 = f + f5) < 0.0f) {
            f4 += 360.0f;
        } else if (f4 > 360.0f) {
            f4 -= 360.0f;
        }
        return f4;
    }

    public void id_class() {
        if (this.id_private == rPo_1.STRAFE) {
            float f;
            float f2 = (float)this.id_class.id_class(iQ_2.id_protected);
            float f3 = (float)this.id_throws * f2;
            float f4 = this.id_case;
            float f5 = this.id_catch;
            float f6 = rfU_2.id_byte(f4 * f4 + f5 * f5);
            if (f6 < 1.0f) {
                f6 = 1.0f;
            }
            f6 = f3 / f6;
            float f7 = rfU_2.id_class(((Float)this.id_class.id_throws[15]).floatValue() * ((float)Math.PI / 180));
            float f8 = rfU_2.id_break(((Float)this.id_class.id_throws[15]).floatValue() * ((float)Math.PI / 180));
            float f9 = (f4 *= f6) * f8 - (f5 *= f6) * f7;
            if (!this.id_break(f9, f = f5 * f8 + f4 * f7)) {
                this.id_case = 1.0f;
                this.id_catch = 0.0f;
            }
            this.id_class.id_super(f3);
            this.id_class.id_catch(this.id_case);
            this.id_class.id_try(this.id_catch);
            this.id_private = rPo_1.WAIT;
        } else if (this.id_private == rPo_1.MOVE_TO) {
            this.id_private = rPo_1.WAIT;
            double d = this.id_break - this.id_class.rx();
            double d2 = this.id_protected - this.id_class.BO();
            double d3 = this.id_byte - this.id_class.re();
            double d4 = d * d + d3 * d3 + d2 * d2;
            if (d4 < 2.500000277905201E-7) {
                this.id_class.id_catch(0.0f);
                return;
            }
            float f = (float)(rfU_2.id_protected(d2, d) * 57.2957763671875) - 90.0f;
            Float f10 = Float.valueOf(this.id_class(((Float)this.id_class.id_throws[15]).floatValue(), f, 90.0f));
            this.id_class.id_throws[15] = f10;
            this.id_class.id_super((float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected)));
            rfH_2 rfH_22 = this.id_class.Bs();
            xc_3 xc_32 = ((rYB)this.id_class.id_throws[7]).id_byte(rfH_22);
            xd_3 xd_32 = xc_32.id_break();
            rjC_2 rjC_22 = xc_32.id_extends((rYB)this.id_class.id_throws[7], rfH_22);
            if (d3 > (double)((Float)this.id_class.id_throws[37]).floatValue() && d * d + d2 * d2 < (double)Math.max(1.0f, this.id_class.PN()) || !rjC_22.id_break() && this.id_class.re() < rjC_22.id_byte(rpB_2.Y) + (double)rfH_22.c_() && !xd_32.id_class(rls_3.id_int) && !xd_32.id_class(rls_3.id_default)) {
                this.id_class.id_else().id_class();
                this.id_private = rPo_1.JUMPING;
            }
        } else if (this.id_private == rPo_1.JUMPING) {
            this.id_class.id_super((float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected)));
            if (this.id_class.BL()) {
                this.id_private = rPo_1.WAIT;
            }
        } else {
            this.id_class.id_catch(0.0f);
        }
    }

    public void id_class(float f, float f2) {
        this.id_private = rPo_1.STRAFE;
        this.id_case = f;
        this.id_catch = f2;
        this.id_throws = 0.25;
    }

    public void id_class(double d, double d2, double d3, double d4) {
        this.id_break = d;
        this.id_byte = d2;
        this.id_protected = d3;
        this.id_throws = d4;
        if (this.id_private != rPo_1.JUMPING) {
            this.id_private = rPo_1.MOVE_TO;
        }
    }

    public boolean id_break() {
        return this.id_private == rPo_1.MOVE_TO;
    }

    private boolean id_break(float f, float f2) {
        rLn_1 rLn_12;
        rLy_1 rLy_12 = this.id_class.id_public();
        return rLy_12 == null || (rLn_12 = rLy_12.id_int()) == null || rLn_12.id_class((rYB)this.id_class.id_throws[7], rfU_2.id_byte(this.id_class.rx() + (double)f), rfU_2.id_byte(this.id_class.re()), rfU_2.id_byte(this.id_class.BO() + (double)f2)) == rLp_1.WALKABLE;
    }

    public double id_throws() {
        return this.id_byte;
    }

    public double id_case() {
        return this.id_protected;
    }

    public double id_protected() {
        return this.id_break;
    }
}

