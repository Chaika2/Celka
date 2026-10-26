/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.rKv_1;
import celestial.rLC;
import celestial.rLq_1;
import celestial.rST;
import celestial.rSp_1;
import celestial.rSu_1;
import celestial.rUs_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;

public class rSf_1
extends rSp_1 {
    private boolean id_break;
    private rLC id_byte;
    private rjU_2 id_protected;

    @Override
    public void id_byte() {
        this.id_break = true;
        this.id_byte = null;
        this.id_protected = null;
    }

    public rSf_1(rSu_1 rSu_12) {
        super(rSu_12);
    }

    @Override
    public void id_break() {
        if (!this.id_break && this.id_byte != null) {
            rfH_2 rfH_22 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class);
            if (!rfH_22.id_class((eX_2)this.id_class.Ps(), 10.0)) {
                this.id_class.L().id_class(rST.id_class);
            }
        } else {
            this.id_break = false;
            this.id_finally();
        }
    }

    private void id_finally() {
        int n = this.id_class.id_catch();
        rjU_2 rjU_22 = this.id_class.id_byte(1.0f);
        int n2 = this.id_class.id_continue(-rjU_22.id_break * 40.0, 105.0, -rjU_22.id_protected * 40.0);
        if (this.id_class.n() != null && this.id_class.n().id_byte() > 0) {
            if ((n2 %= 12) < 0) {
                n2 += 12;
            }
        } else {
            n2 -= 12;
            n2 &= 7;
            n2 += 12;
        }
        this.id_byte = this.id_class.id_class(n, n2, (rLq_1)null);
        this.id_extends();
    }

    private void id_extends() {
        if (this.id_byte != null) {
            this.id_byte.id_class();
            if (!this.id_byte.id_byte()) {
                double d;
                rfH_2 rfH_22 = this.id_byte.id_catch();
                this.id_byte.id_class();
                while ((d = (double)((float)rfH_22.c_() + this.id_class.Sa().nextFloat() * 20.0f)) < (double)rfH_22.c_()) {
                }
                this.id_protected = new rjU_2(rfH_22.b_(), d, rfH_22.d_());
            }
        }
    }

    @Override
    public rjU_2 id_case() {
        return this.id_protected;
    }

    public rST<rSf_1> id_protected() {
        return rST.id_throws;
    }
}

