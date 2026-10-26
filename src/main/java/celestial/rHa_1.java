/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qs_1;
import celestial.an_3;
import celestial.iG_2;
import celestial.kD_2;
import celestial.ka_3;
import celestial.rCT;
import celestial.rCg_1;
import celestial.rHf_1;
import celestial.rRq_1;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhN_2;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjw_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.ryc_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Iterator;
import java.util.List;

public class rHa_1
extends ryO_2
implements rHf_1 {
    private xc_3 id_class;
    private rpr_3 id_break;
    private boolean id_byte;
    private boolean id_protected;
    private static final ThreadLocal<rpr_3> id_throws = ThreadLocal.withInitial(() -> null);
    private float id_case;
    private float id_catch;
    private long id_private;
    private int id_implements;

    public float id_byte(float f) {
        return (float)this.id_break.id_finally() * this.id_throws(this.id_class(f));
    }

    public rHa_1() {
        super(ryW_2.id_finally);
    }

    public rHa_1(xc_3 xc_32, rpr_3 rpr_32, boolean bl, boolean bl2) {
        this();
        this.id_class = xc_32;
        this.id_break = rpr_32;
        this.id_byte = bl;
        this.id_protected = bl2;
    }

    private void id_class(an_3 an_32, rpr_3 rpr_32, double d) {
        double d2;
        rpr_3 rpr_33;
        double d3;
        rfl_3 rfl_32;
        rfl_3 rfl_33 = an_32.rN();
        if (rfl_33.id_byte(rfl_32 = rjw_3.id_break().id_class().id_class(this.id_native)) && Math.abs((d3 = rHa_1.id_class(rfl_32, rpr_33 = rpr_32.id_case(), rfl_33) + 0.01) - (d2 = rHa_1.id_class(rfl_32, rpr_33, rfl_33.id_class(rfl_32)) + 0.01)) < 0.01) {
            d3 = Math.min(d3, d) + 0.01;
            rHa_1.id_class(rpr_32, an_32, d3, rpr_33);
        }
    }

    private rfl_3 id_class(rfl_3 rfl_32) {
        double d = this.id_throws(this.id_case);
        return rfl_32.id_protected((double)this.id_native.b_() + d * (double)this.id_break.id_implements(), (double)this.id_native.c_() + d * (double)this.id_break.id_finally(), (double)this.id_native.d_() + d * (double)this.id_break.id_extends());
    }

    public rjC_2 id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        rjC_2 rjC_22 = !this.id_byte && this.id_protected ? ((xc_3)this.id_class.id_class(kD_2.id_final, true)).id_extends(rRq_12, rfH_22) : rjw_3.id_class();
        rpr_3 rpr_32 = id_throws.get();
        if ((double)this.id_case < 1.0 && rpr_32 == this.id_extends()) {
            return rjC_22;
        }
        xc_3 xc_32 = this.id_finally() ? (xc_3)((xc_3)xu_3.rS.id_continue().id_class(ka_3.id_volatile, this.id_break)).id_class(ka_3.id_package, this.id_byte != 1.0f - this.id_case < 0.25f) : this.id_class;
        float f = this.id_throws(this.id_case);
        double d = (float)this.id_break.id_implements() * f;
        double d2 = (float)this.id_break.id_finally() * f;
        double d3 = (float)this.id_break.id_extends() * f;
        return rjw_3.id_class(rjC_22, xc_32.id_extends(rRq_12, rfH_22).id_class(d, d2, d3));
    }

    private static void id_class(rpr_3 rpr_32, an_3 an_32, double d, rpr_3 rpr_33) {
        id_throws.set(rpr_32);
        an_32.id_class(iG_2.PISTON, new rjU_2(d * (double)rpr_33.id_implements(), d * (double)rpr_33.id_finally(), d * (double)rpr_33.id_extends()));
        id_throws.set(null);
    }

    private static boolean id_class(rfl_3 rfl_32, an_3 an_32) {
        return an_32.r_() == Qs_1.NORMAL && an_32.BL() && an_32.rx() >= rfl_32.id_class && an_32.rx() <= rfl_32.id_protected && an_32.BO() >= rfl_32.id_byte && an_32.BO() <= rfl_32.id_case;
    }

    private static double id_class(rfl_3 rfl_32, rpr_3 rpr_32, rfl_3 rfl_33) {
        switch (rpr_32) {
            case EAST: {
                return rfl_32.id_protected - rfl_33.id_class;
            }
            case WEST: {
                return rfl_33.id_protected - rfl_32.id_class;
            }
            default: {
                return rfl_32.id_throws - rfl_33.id_break;
            }
            case DOWN: {
                return rfl_33.id_throws - rfl_32.id_break;
            }
            case SOUTH: {
                return rfl_32.id_case - rfl_33.id_byte;
            }
            case NORTH: 
        }
        return rfl_33.id_case - rfl_32.id_byte;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_class = rco_3.id_byte(rcd_32.id_int("blockState"));
        this.id_break = rpr_3.id_class(rcd_32.id_private("facing"));
        this.id_catch = this.id_case = rcd_32.id_finally("progress");
        this.id_byte = rcd_32.id_new("extending");
        this.id_protected = rcd_32.id_new("source");
    }

    public float id_class(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        return rfU_2.id_catch(f, this.id_catch, this.id_case);
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("blockState", rco_3.id_class(this.id_class));
        rcd_32.id_break("facing", this.id_break.id_byte());
        rcd_32.id_class("progress", this.id_catch);
        rcd_32.id_class("extending", this.id_byte);
        rcd_32.id_class("source", this.id_protected);
        return rcd_32;
    }

    public float id_break(float f) {
        return (float)this.id_break.id_implements() * this.id_throws(this.id_class(f));
    }

    private float id_throws(float f) {
        return this.id_byte ? f - 1.0f : 1.0f - f;
    }

    @Override
    public void id_throws() {
        this.id_private = this.id_extends.r();
        this.id_catch = this.id_case;
        if (this.id_catch >= 1.0f) {
            if (this.id_extends.id_continue && this.id_implements < 5) {
                ++this.id_implements;
            } else {
                this.id_extends.id_else(this.id_native);
                this.aa_();
                if (this.id_class != null && this.id_extends.id_byte(this.id_native).id_class(xu_3.rc)) {
                    xc_3 xc_32 = xd_3.id_break(this.id_class, this.id_extends, this.id_native);
                    if (xc_32.id_catch()) {
                        this.id_extends.id_class(this.id_native, this.id_class, 84);
                        xd_3.id_class(this.id_class, xc_32, this.id_extends, this.id_native, 3);
                    } else {
                        if (xc_32.id_break(rCT.id_throw) && xc_32.id_byte(rCT.id_throw).booleanValue()) {
                            xc_32 = (xc_3)xc_32.id_class(rCT.id_throw, false);
                        }
                        this.id_extends.id_class(this.id_native, xc_32, 67);
                        this.id_extends.id_class(this.id_native, xc_32.id_break(), this.id_native);
                    }
                }
            }
        } else {
            float f = this.id_case + 0.5f;
            this.id_case(f);
            this.id_catch(f);
            this.id_case = f;
            if (this.id_case >= 1.0f) {
                this.id_case = 1.0f;
            }
        }
    }

    public boolean id_finally() {
        return this.id_protected;
    }

    public boolean id_catch() {
        return this.id_byte;
    }

    private void id_catch(float f) {
        rpr_3 rpr_32;
        if (this.id_new() && (rpr_32 = this.id_extends()).id_final().id_protected()) {
            double d = this.id_class.id_extends(this.id_extends, this.id_native).id_byte(rpB_2.Y);
            rfl_3 rfl_32 = this.id_class(new rfl_3(0.0, d, 0.0, 1.0, 1.5000000999999998, 1.0));
            double d2 = f - this.id_case;
            for (an_3 an_33 : this.id_extends.id_break((an_3)null, rfl_32, an_32 -> rHa_1.id_class(rfl_32, an_32))) {
                rHa_1.id_class(rpr_32, an_33, d2, rpr_32);
            }
        }
    }

    public rpr_3 id_extends() {
        return this.id_byte ? this.id_break : this.id_break.id_case();
    }

    private void id_case(float f) {
        rfl_3 rfl_32;
        List<an_3> list;
        rpr_3 rpr_32 = this.id_extends();
        double d = f - this.id_case;
        rjC_2 rjC_22 = this.id_package().id_extends(this.id_extends, this.id_char());
        if (!rjC_22.id_break() && !(list = this.id_extends.id_class((an_3)null, ryc_3.id_class(rfl_32 = this.id_class(rjC_22.id_class()), rpr_32, d).id_break(rfl_32))).isEmpty()) {
            List<rfl_3> list2 = rjC_22.id_protected();
            boolean bl = this.id_class.id_class(xu_3.EN);
            Iterator<an_3> iterator = list.iterator();
            while (true) {
                rfl_3 rfl_33;
                rfl_3 rfl_34;
                rfl_3 rfl_35;
                if (!iterator.hasNext()) {
                    return;
                }
                an_3 an_32 = iterator.next();
                if (an_32.r_() == Qs_1.IGNORE) continue;
                if (bl) {
                    if (an_32 instanceof rhN_2) continue;
                    rjU_2 rjU_22 = an_32.rv();
                    double d2 = rjU_22.id_break;
                    double d3 = rjU_22.id_byte;
                    double d4 = rjU_22.id_protected;
                    switch (rpr_32.id_final()) {
                        case X: {
                            d2 = rpr_32.id_implements();
                            break;
                        }
                        case Y: {
                            d3 = rpr_32.id_finally();
                            break;
                        }
                        case Z: {
                            d4 = rpr_32.id_extends();
                        }
                    }
                    an_32.id_catch(d2, d3, d4);
                }
                double d5 = 0.0;
                Iterator<rfl_3> iterator2 = list2.iterator();
                while (!(!iterator2.hasNext() || (rfl_35 = ryc_3.id_class(this.id_class(rfl_34 = iterator2.next()), rpr_32, d)).id_byte(rfl_33 = an_32.rN()) && (d5 = Math.max(d5, rHa_1.id_class(rfl_35, rpr_32, rfl_33))) >= d)) {
                }
                if (d5 <= 0.0) continue;
                d5 = Math.min(d5, d) + 0.01;
                rHa_1.id_class(rpr_32, an_32, d5, rpr_32);
                if (this.id_byte || !this.id_protected) continue;
                this.id_class(an_32, rpr_32, d);
            }
        }
    }

    @Override
    public double id_implements() {
        return 68.0;
    }

    private boolean id_new() {
        return this.id_class.id_class(xu_3.Jh);
    }

    private xc_3 id_package() {
        return !this.id_catch() && this.id_finally() && this.id_class.id_break() instanceof kD_2 ? (xc_3)((xc_3)((xc_3)xu_3.rS.id_continue().id_class(ka_3.id_package, this.id_case > 0.25f)).id_class(ka_3.id_final, this.id_class.id_class(xu_3.D) ? rCg_1.STICKY : rCg_1.DEFAULT)).id_class(ka_3.id_volatile, this.id_class.id_byte(kD_2.id_volatile)) : this.id_class;
    }

    public float id_protected(float f) {
        return (float)this.id_break.id_extends() * this.id_throws(this.id_class(f));
    }

    public rpr_3 id_private() {
        return this.id_break;
    }

    public long id_final() {
        return this.id_private;
    }

    public void id_volatile() {
        if (this.id_extends != null && (this.id_catch < 1.0f || this.id_extends.id_continue)) {
            this.id_catch = this.id_case = 1.0f;
            this.id_extends.id_else(this.id_native);
            this.aa_();
            if (this.id_extends.id_byte(this.id_native).id_class(xu_3.rc)) {
                xc_3 xc_32 = this.id_protected ? xu_3.id_class.id_continue() : xd_3.id_break(this.id_class, this.id_extends, this.id_native);
                this.id_extends.id_class(this.id_native, xc_32, 3);
                this.id_extends.id_class(this.id_native, xc_32.id_break(), this.id_native);
            }
        }
    }

    public xc_3 id_native() {
        return this.id_class;
    }

    @Override
    public rcd_3 Z_() {
        return this.id_class(new rcd_3());
    }
}

