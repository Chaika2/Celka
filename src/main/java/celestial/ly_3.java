/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.QY;
import celestial.an_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rjU_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rpr_3;
import celestial.rrLt_1;
import celestial.rrQX;
import celestial.rrxr_3;
import celestial.xc_3;
import celestial.xu_3;

public class ly_3 {
    private boolean id_class;
    private rRq_1 id_break;
    private an_3 id_byte;
    private rjU_2 id_protected = rjU_2.id_class;
    private rjU_2 id_throws = rjU_2.id_class;
    private final rfw_3 id_case = new rfw_3();
    private final rje_3 id_catch = new rje_3(0.0f, 0.0f, 1.0f);
    private final rje_3 id_private = new rje_3(0.0f, 1.0f, 0.0f);
    private final rje_3 id_implements = new rje_3(1.0f, 0.0f, 0.0f);
    private float id_finally;
    private float id_extends;
    private final rjY_2 id_native = new rjY_2(0.0f, 0.0f, 0.0f, 1.0f);
    private boolean id_volatile;
    private boolean id_final;
    private float id_package;
    private float id_int;

    public rfH_2 id_byte() {
        return this.id_case;
    }

    public float id_int() {
        return this.id_package;
    }

    public float id_class(float f) {
        return rfU_2.id_catch(f, this.id_int, this.id_package);
    }

    protected void id_class(rjU_2 rjU_22) {
        this.id_protected = rjU_22;
        this.id_case.id_break(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public void id_class(float f, float f2) {
        this.id_finally = f2;
        this.id_extends = f;
        this.id_native.id_class(0.0f, 0.0f, 0.0f, 1.0f);
        this.id_native.id_class(rje_3.id_protected.id_byte(-f));
        this.id_native.id_class(rje_3.id_break.id_byte(f2));
        this.id_catch.id_break(0.0f, 0.0f, 1.0f);
        this.id_catch.id_class(this.id_native);
        this.id_private.id_break(0.0f, 1.0f, 0.0f);
        this.id_private.id_class(this.id_native);
        this.id_implements.id_break(1.0f, 0.0f, 0.0f);
        this.id_implements.id_class(this.id_native);
    }

    private double id_class(double d) {
        return d;
    }

    public void id_class(QY qY, rRq_1 rRq_12, an_3 an_32, boolean bl, boolean bl2, float f) {
        Object object;
        this.id_class = true;
        this.id_break = rRq_12;
        this.id_byte = an_32;
        this.id_volatile = bl;
        this.id_final = bl2;
        rrLt_1 rrLt_12 = rrLt_1.id_class(an_32.Pt(), an_32.Ps(), false);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLt_12);
        rjU_2 rjU_22 = rrLt_12.id_break();
        rjU_2 rjU_23 = rrLt_12.id_class();
        boolean bl3 = rrLt_12.id_byte();
        cb_3 cb_32 = (cb_3)qY.id_class[57];
        if (an_32 == cb_32 && cb_32.s() != null) {
            object = cb_32.s().id_class();
            this.id_class(((PX)object).id_throws(), ((PX)object).id_protected());
        } else {
            this.id_class(an_32.id_throws(f), an_32.id_case(f));
        }
        this.id_break(rfU_2.id_protected((double)f, rjU_22.id_break, rjU_23.id_break), rfU_2.id_protected((double)f, rjU_22.id_byte, rjU_23.id_byte) + (double)rfU_2.id_catch(f, this.id_int, this.id_package), rfU_2.id_protected((double)f, rjU_22.id_protected, rjU_23.id_protected));
        this.id_throws = this.id_protected;
        if (bl3) {
            return;
        }
        if (bl) {
            if (bl2) {
                this.id_class(this.id_extends + 180.0f, -this.id_finally);
            }
            this.id_class(-this.id_class(4.0), 0.0, 0.0);
        } else if (an_32 instanceof iB_2 && ((iB_2)an_32).Sc()) {
            object = ((iB_2)an_32).Bi();
            this.id_class(object != null ? ((rpr_3)object).id_package() - 180.0f : 0.0f, 0.0f);
            this.id_class(0.0, 0.3, 0.0);
        }
    }

    public void id_class(double d, double d2, double d3) {
        double d4 = (double)this.id_catch.id_class() * d + (double)this.id_private.id_class() * d2 + (double)this.id_implements.id_class() * d3;
        double d5 = (double)this.id_catch.id_break() * d + (double)this.id_private.id_break() * d2 + (double)this.id_implements.id_break() * d3;
        double d6 = (double)this.id_catch.id_byte() * d + (double)this.id_private.id_byte() * d2 + (double)this.id_implements.id_byte() * d3;
        this.id_class(new rjU_2(this.id_protected.id_break + d4, this.id_protected.id_byte + d5, this.id_protected.id_protected + d6));
    }

    public void id_class() {
        if (this.id_byte != null) {
            this.id_int = this.id_package;
            this.id_package += (this.id_byte.Bx() - this.id_package) * 0.5f;
        }
    }

    public void id_break(float f, float f2) {
        this.id_extends = f;
        this.id_finally = f2;
    }

    public rjU_2 id_break() {
        return this.id_protected;
    }

    protected void id_break(double d, double d2, double d3) {
        this.id_class(new rjU_2(d, d2, d3));
    }

    public float id_throws() {
        return this.id_extends;
    }

    public rXE id_finally() {
        if (!this.id_class) {
            return rXG.id_class.id_private();
        }
        rXE rXE2 = this.id_break.id_break(this.id_case);
        return !rXE2.id_byte() && this.id_protected.id_byte >= (double)((float)this.id_case.c_() + rXE2.id_class(this.id_break, (rfH_2)this.id_case)) ? rXG.id_class.id_private() : rXE2;
    }

    public an_3 id_catch() {
        return this.id_byte;
    }

    public xc_3 id_extends() {
        return !this.id_class ? xu_3.id_class.id_continue() : this.id_break.id_byte(this.id_case);
    }

    public rjY_2 id_case() {
        return this.id_native;
    }

    public boolean id_implements() {
        return this.id_volatile;
    }

    public rjU_2 id_new() {
        return this.id_throws;
    }

    public void id_package() {
        this.id_break = null;
        this.id_byte = null;
        this.id_class = false;
    }

    public float id_protected() {
        return this.id_finally;
    }

    public boolean id_private() {
        return this.id_class;
    }

    public final rje_3 id_final() {
        return this.id_private;
    }

    public final rje_3 id_volatile() {
        return this.id_catch;
    }

    public xc_3 id_native() {
        if (!this.id_class) {
            return xu_3.id_class.id_continue();
        }
        xc_3 xc_32 = this.id_break.id_byte(this.id_case);
        if (rrxr_3.u.id_byte()) {
            xc_32 = (xc_3)rrxr_3.id_private(xc_32, rrxr_3.u, this.id_break, this.id_case, this.id_protected);
        }
        return xc_32;
    }
}

