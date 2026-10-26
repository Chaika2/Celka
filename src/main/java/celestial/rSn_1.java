/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.eX_2;
import celestial.rKv_1;
import celestial.rLC;
import celestial.rLq_1;
import celestial.rST;
import celestial.rSa_1;
import celestial.rSp_1;
import celestial.rSu_1;
import celestial.rUs_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rye_3;

public class rSn_1
extends rSp_1 {
    private static final ay_3 id_break = new ay_3().id_class(64.0);
    private rLC id_byte;
    private rjU_2 id_protected;
    private boolean id_throws;

    @Override
    public void id_byte() {
        this.id_byte = null;
        this.id_protected = null;
    }

    public rSn_1(rSu_1 rSu_12) {
        super(rSu_12);
    }

    private void id_class(rhd_3 rhd_32) {
        this.id_class.L().id_class(rST.id_break);
        this.id_class.L().id_break(rST.id_break).id_class(rhd_32);
    }

    @Override
    public void id_class(rSa_1 rSa_12, rfH_2 rfH_22, rye_3 rye_32, rhd_3 rhd_32) {
        if (rhd_32 != null && !((rhx_3)rhd_32.id_implements[18]).id_class) {
            this.id_class(rhd_32);
        }
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
        int n;
        if (this.id_byte != null && this.id_byte.id_byte()) {
            rfH_2 rfH_22 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, new rfH_2(rUs_1.id_class));
            int n2 = n = this.id_class.n() == null ? 0 : this.id_class.n().id_byte();
            if (this.id_class.Sa().nextInt(n + 3) == 0) {
                this.id_class.L().id_class(rST.id_byte);
                return;
            }
            double d = 64.0;
            rhd_3 rhd_32 = ((rYB)this.id_class.id_throws[7]).id_class(id_break, (double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_());
            if (rhd_32 != null) {
                d = rfH_22.id_class((eX_2)rhd_32.Ps(), true) / 512.0;
            }
            if (!(rhd_32 == null || ((rhx_3)rhd_32.id_implements[18]).id_class || this.id_class.Sa().nextInt(rfU_2.id_class((int)d) + 2) != 0 && this.id_class.Sa().nextInt(n + 2) != 0)) {
                this.id_class(rhd_32);
                return;
            }
        }
        if (this.id_byte == null || this.id_byte.id_byte()) {
            int n3;
            n = n3 = this.id_class.id_catch();
            if (this.id_class.Sa().nextInt(8) == 0) {
                this.id_throws = !this.id_throws;
                n = n3 + 6;
            }
            n = this.id_throws ? ++n : --n;
            if (this.id_class.n() != null && this.id_class.n().id_byte() >= 0) {
                if ((n %= 12) < 0) {
                    n += 12;
                }
            } else {
                n -= 12;
                n &= 7;
                n += 12;
            }
            this.id_byte = this.id_class.id_class(n3, n, (rLq_1)null);
            if (this.id_byte != null) {
                this.id_byte.id_class();
            }
        }
        this.id_extends();
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

    public rST<rSn_1> id_protected() {
        return rST.id_class;
    }
}

