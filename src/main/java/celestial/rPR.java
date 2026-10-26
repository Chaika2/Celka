/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rfU_2;
import celestial.rjU_2;

public class rPR {
    protected final is_3 id_class;
    protected float id_break;
    protected float id_byte;
    protected boolean id_protected;
    protected double id_throws;
    protected double id_case;
    protected double id_catch;

    public boolean id_byte() {
        return this.id_protected;
    }

    public rPR(is_3 is_32) {
        this.id_class = is_32;
    }

    public void id_class() {
        if (this.id_break()) {
            Float f = Float.valueOf(0.0f);
            this.id_class.id_throws[16] = f;
        }
        if (this.id_protected) {
            this.id_protected = false;
            Float f = Float.valueOf(this.id_class(((Float)this.id_class.id_private[25]).floatValue(), this.id_private(), this.id_break));
            this.id_class.id_private[25] = f;
            Float f2 = Float.valueOf(this.id_class(((Float)this.id_class.id_throws[16]).floatValue(), this.id_catch(), this.id_byte));
            this.id_class.id_throws[16] = f2;
        } else {
            Float f = Float.valueOf(this.id_class(((Float)this.id_class.id_private[25]).floatValue(), ((Float)this.id_class.id_private[23]).floatValue(), 10.0f));
            this.id_class.id_private[25] = f;
        }
        if (!this.id_class.id_public().id_native()) {
            Float f = Float.valueOf(rfU_2.id_break(((Float)this.id_class.id_private[25]).floatValue(), ((Float)this.id_class.id_private[23]).floatValue(), (float)this.id_class.S()));
            this.id_class.id_private[25] = f;
        }
    }

    public void id_class(rjU_2 rjU_22) {
        this.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    private static double id_class(an_3 an_32) {
        return an_32 instanceof iB_2 ? an_32.rH() : (an_32.rN().id_break + an_32.rN().id_throws) / 2.0;
    }

    protected float id_class(float f, float f2, float f3) {
        float f4 = rfU_2.id_byte(f, f2);
        float f5 = rfU_2.id_class(f4, -f3, f3);
        return f + f5;
    }

    public void id_class(an_3 an_32, float f, float f2) {
        this.id_class(an_32.rx(), rPR.id_class(an_32), an_32.BO(), f, f2);
    }

    public void id_class(double d, double d2, double d3, float f, float f2) {
        this.id_throws = d;
        this.id_case = d2;
        this.id_catch = d3;
        this.id_break = f;
        this.id_byte = f2;
        this.id_protected = true;
    }

    public void id_class(double d, double d2, double d3) {
        this.id_class(d, d2, d3, this.id_class.s(), this.id_class.r());
    }

    protected boolean id_break() {
        return true;
    }

    public double id_throws() {
        return this.id_case;
    }

    protected float id_catch() {
        double d = this.id_throws - this.id_class.rx();
        double d2 = this.id_case - this.id_class.rH();
        double d3 = this.id_catch - this.id_class.BO();
        double d4 = rfU_2.id_class(d * d + d3 * d3);
        return (float)(-(rfU_2.id_protected(d2, d4) * 57.2957763671875));
    }

    public double id_case() {
        return this.id_catch;
    }

    public double id_protected() {
        return this.id_throws;
    }

    protected float id_private() {
        double d = this.id_throws - this.id_class.rx();
        double d2 = this.id_catch - this.id_class.BO();
        return (float)(rfU_2.id_protected(d2, d) * 57.2957763671875) - 90.0f;
    }
}

