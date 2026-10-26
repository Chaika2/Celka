/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CA;
import celestial.CJ;
import celestial.Ok_1;
import celestial.an_3;
import celestial.gm_3;
import celestial.ly_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rqJ_2;
import celestial.rrGi_1;
import celestial.xc_3;
import celestial.yX_2;
import java.util.Random;
import java.util.stream.Stream;

public abstract class CH {
    private static final rfl_3 id_class = new rfl_3(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    protected final gm_3 id_byte;
    protected double id_protected;
    protected double id_throws;
    protected double id_case;
    protected double id_catch;
    protected double id_private;
    protected double id_implements;
    protected double id_finally;
    protected double id_extends;
    protected double id_native;
    private rfl_3 id_break = id_class;
    protected boolean id_volatile;
    protected boolean id_final = true;
    private boolean id_instanceof;
    protected boolean id_package;
    protected float id_int = 0.6f;
    protected float id_new = 1.8f;
    protected final Random id_continue = new Random();
    protected int id_super;
    protected int id_this;
    protected float id_else;
    protected float id_synchronized = 1.0f;
    protected float id_return = 1.0f;
    protected float id_public = 1.0f;
    protected float id_goto = 1.0f;
    protected float id_while;
    protected float id_try;
    private rrGi_1 id_throw = new rrGi_1();

    public CH id_byte(float f) {
        this.id_finally *= (double)f;
        this.id_extends = (this.id_extends - (double)0.1f) * (double)f + (double)0.1f;
        this.id_native *= (double)f;
        return this;
    }

    private boolean id_byte(double d, double d2, double d3) {
        if (!(this.id_int > 1.0f) && !(this.id_new > 1.0f)) {
            double d4;
            double d5;
            int n = rfU_2.id_byte(this.id_catch);
            int n2 = rfU_2.id_byte(this.id_private);
            int n3 = rfU_2.id_byte(this.id_implements);
            this.id_throw.id_class(n, n2, n3);
            xc_3 xc_32 = this.id_byte.id_byte(this.id_throw);
            if (!xc_32.id_catch()) {
                return true;
            }
            double d6 = d > 0.0 ? this.id_break.id_protected : (d5 = d < 0.0 ? this.id_break.id_class : this.id_catch);
            double d7 = d2 > 0.0 ? this.id_break.id_throws : (d4 = d2 < 0.0 ? this.id_break.id_break : this.id_private);
            double d8 = d3 > 0.0 ? this.id_break.id_case : (d3 < 0.0 ? this.id_break.id_byte : this.id_implements);
            int n4 = rfU_2.id_byte(d5 + d);
            int n5 = rfU_2.id_byte(d4 + d2);
            int n6 = rfU_2.id_byte(d8 + d3);
            if (n4 != n || n5 != n2 || n6 != n3) {
                this.id_throw.id_class(n4, n5, n6);
                xc_3 xc_33 = this.id_byte.id_byte(this.id_throw);
                if (!xc_33.id_catch()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    protected CH(gm_3 gm_32, double d, double d2, double d3) {
        this.id_byte = gm_32;
        this.id_class(0.2f, 0.2f);
        this.id_break(d, d2, d3);
        this.id_protected = d;
        this.id_throws = d2;
        this.id_case = d3;
        this.id_this = (int)(4.0f / (this.id_continue.nextFloat() * 0.9f + 0.1f));
    }

    public CH(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        this(gm_32, d, d2, d3);
        this.id_finally = d4 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.id_extends = d5 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.id_native = d6 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        float f = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        float f2 = rfU_2.id_class(this.id_finally * this.id_finally + this.id_extends * this.id_extends + this.id_native * this.id_native);
        this.id_finally = this.id_finally / (double)f2 * (double)f * (double)0.4f;
        this.id_extends = this.id_extends / (double)f2 * (double)f * (double)0.4f + (double)0.1f;
        this.id_native = this.id_native / (double)f2 * (double)f * (double)0.4f;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.id_catch + "," + this.id_private + "," + this.id_implements + "), RGBA (" + this.id_synchronized + "," + this.id_return + "," + this.id_public + "," + this.id_goto + "), Age " + this.id_super;
    }

    public abstract void id_class(Ok_1 var1, ly_3 var2, float var3);

    public void id_class(double d, double d2, double d3) {
        if (!this.id_instanceof) {
            double d4 = d;
            double d5 = d2;
            double d6 = d3;
            if (this.id_final && (d != 0.0 || d2 != 0.0 || d3 != 0.0) && this.id_byte(d, d2, d3)) {
                rjU_2 rjU_22 = an_3.id_class(null, new rjU_2(d, d2, d3), this.id_volatile(), this.id_byte, rjm_3.id_break(), new rqJ_2<rjC_2>(Stream.empty()), false, false);
                d = rjU_22.id_break;
                d2 = rjU_22.id_byte;
                d3 = rjU_22.id_protected;
            }
            if (d != 0.0 || d2 != 0.0 || d3 != 0.0) {
                this.id_class(this.id_volatile().id_protected(d, d2, d3));
                this.id_extends();
            }
            if (Math.abs(d5) >= (double)1.0E-5f && Math.abs(d2) < (double)1.0E-5f) {
                this.id_instanceof = true;
            }
            boolean bl = this.id_volatile = d5 != d2 && d5 < 0.0;
            if (d4 != d) {
                this.id_finally = 0.0;
            }
            if (d6 != d3) {
                this.id_native = 0.0;
            }
        }
    }

    protected void id_class(float f, float f2) {
        if (f != this.id_int || f2 != this.id_new) {
            this.id_int = f;
            this.id_new = f2;
            rfl_3 rfl_32 = this.id_volatile();
            double d = (rfl_32.id_class + rfl_32.id_protected - (double)f) / 2.0;
            double d2 = (rfl_32.id_byte + rfl_32.id_case - (double)f) / 2.0;
            this.id_class(new rfl_3(d, rfl_32.id_break, d2, d + (double)this.id_int, rfl_32.id_break + (double)this.id_new, d2 + (double)this.id_int));
        }
    }

    public void id_class(float f, float f2, float f3) {
        this.id_synchronized = f;
        this.id_return = f2;
        this.id_public = f3;
    }

    public abstract CJ id_class();

    public void id_class(rfl_3 rfl_32) {
        this.id_break = rfl_32;
    }

    public void id_class(int n) {
        this.id_this = n;
    }

    public void id_break(double d, double d2, double d3) {
        this.id_catch = d;
        this.id_private = d2;
        this.id_implements = d3;
        float f = this.id_int / 2.0f;
        float f2 = this.id_new;
        this.id_class(new rfl_3(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)f2, d3 + (double)f));
    }

    protected int id_break(float f) {
        rfH_2 rfH_22 = new rfH_2(this.id_catch, this.id_private, this.id_implements);
        return this.id_byte.id_int(rfH_22) ? yX_2.id_class(this.id_byte, rfH_22) : 0;
    }

    protected void id_throws(float f) {
        this.id_goto = f;
    }

    public void id_finally() {
        this.id_package = true;
    }

    protected void id_extends() {
        rfl_3 rfl_32 = this.id_volatile();
        this.id_catch = (rfl_32.id_class + rfl_32.id_protected) / 2.0;
        this.id_private = rfl_32.id_break;
        this.id_implements = (rfl_32.id_byte + rfl_32.id_case) / 2.0;
    }

    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            this.id_extends -= 0.04 * (double)this.id_else;
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_finally *= (double)0.98f;
            this.id_extends *= (double)0.98f;
            this.id_native *= (double)0.98f;
            if (this.id_volatile) {
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
        }
    }

    public int id_implements() {
        return this.id_this;
    }

    public CH id_protected(float f) {
        this.id_class(0.2f * f, 0.2f * f);
        return this;
    }

    public boolean id_final() {
        return !(this instanceof CA);
    }

    public rfl_3 id_volatile() {
        return this.id_break;
    }

    public boolean id_native() {
        return !this.id_package;
    }
}

