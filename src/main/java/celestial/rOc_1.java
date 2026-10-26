/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.iX_2;
import celestial.rBk_1;
import celestial.rON;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.xu_3;

public class rOc_1
extends rBk_1 {
    private final rON id_class;
    private final double id_break;
    private boolean id_byte;
    private int id_protected;

    @Override
    public void id_byte() {
        this.id_class.id_synchronized(true);
        this.id_byte = false;
        this.id_protected = 0;
    }

    public rOc_1(rON rON2, double d) {
        this.id_class = rON2;
        this.id_break = d;
    }

    @Override
    public boolean id_class() {
        if (this.id_class.n_()) {
            return false;
        }
        if (this.id_class.L()) {
            return true;
        }
        if (this.id_class.Sa().nextInt(700) != 0) {
            return false;
        }
        return !this.id_class.sx().id_class((eX_2)this.id_class.Ps(), 64.0);
    }

    @Override
    public boolean id_break() {
        return !this.id_class.sx().id_class((eX_2)this.id_class.Ps(), 7.0) && !this.id_byte && this.id_protected <= 600;
    }

    @Override
    public void id_throws() {
        rfH_2 rfH_22 = this.id_class.sx();
        boolean bl = rfH_22.id_class((eX_2)this.id_class.Ps(), 16.0);
        if (bl) {
            ++this.id_protected;
        }
        if (this.id_class.id_public().id_native()) {
            rjU_2 rjU_22 = rjU_2.id_protected(rfH_22);
            rjU_2 rjU_23 = iX_2.id_class(this.id_class, 16, 3, rjU_22, 0.3141592741012573);
            if (rjU_23 == null) {
                rjU_23 = iX_2.id_break(this.id_class, 8, 7, rjU_22);
            }
            if (rjU_23 != null && !bl && !((rYB)this.id_class.id_throws[7]).id_byte(new rfH_2(rjU_23)).id_class(xu_3.id_try)) {
                rjU_23 = iX_2.id_break(this.id_class, 16, 5, rjU_22);
            }
            if (rjU_23 == null) {
                this.id_byte = true;
                return;
            }
            this.id_class.id_public().id_class(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, this.id_break);
        }
    }

    @Override
    public void id_protected() {
        this.id_class.id_synchronized(false);
    }
}

