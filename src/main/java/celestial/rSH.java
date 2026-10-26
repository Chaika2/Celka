/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.rKv_1;
import celestial.rLC;
import celestial.rLq_1;
import celestial.rST;
import celestial.rSp_1;
import celestial.rSu_1;
import celestial.rUs_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjU_2;

public class rSH
extends rSp_1 {
    private static final ay_3 id_break = new ay_3().id_class(128.0);
    private rLC id_byte;
    private rjU_2 id_protected;

    @Override
    public void id_byte() {
        this.id_byte = null;
        this.id_protected = null;
    }

    public rSH(rSu_1 rSu_12) {
        super(rSu_12);
    }

    @Override
    public void id_break() {
        double d;
        double d2 = d = this.id_protected == null ? 0.0 : this.id_protected.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
        if (d < 100.0 || d > 22500.0 || ((Boolean)this.id_class.id_throws[23]).booleanValue() || ((Boolean)this.id_class.id_throws[24]).booleanValue()) {
            this.id_finally();
        }
    }

    private void id_finally() {
        if (this.id_byte == null || this.id_byte.id_byte()) {
            int n;
            Object object;
            int n2 = this.id_class.id_catch();
            rfH_2 rfH_22 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class);
            rhd_3 rhd_32 = ((rYB)this.id_class.id_throws[7]).id_class(id_break, (double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_());
            if (rhd_32 != null) {
                object = new rjU_2(rhd_32.rx(), 0.0, rhd_32.BO()).id_protected();
                n = this.id_class.id_continue(-((rjU_2)object).id_break * 40.0, 105.0, -((rjU_2)object).id_protected * 40.0);
            } else {
                n = this.id_class.id_continue(40.0, rfH_22.c_(), 0.0);
            }
            object = new rLq_1(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
            this.id_byte = this.id_class.id_class(n2, n, (rLq_1)object);
            if (this.id_byte != null) {
                this.id_byte.id_class();
            }
        }
        this.id_extends();
        if (this.id_byte != null && this.id_byte.id_byte()) {
            this.id_class.L().id_class(rST.id_protected);
        }
    }

    private void id_extends() {
        if (this.id_byte != null && !this.id_byte.id_byte()) {
            double d;
            rfH_2 rfH_22 = this.id_byte.id_catch();
            this.id_byte.id_class();
            double d2 = rfH_22.b_();
            double d3 = rfH_22.d_();
            while ((d = (double)((float)rfH_22.c_() + this.id_class.Sa().nextFloat() * 20.0f)) < (double)rfH_22.c_()) {
            }
            this.id_protected = new rjU_2(d2, d, d3);
        }
    }

    @Override
    public rjU_2 id_case() {
        return this.id_protected;
    }

    public rST<rSH> id_protected() {
        return rST.id_byte;
    }
}

