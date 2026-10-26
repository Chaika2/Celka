/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rRq_1;
import celestial.rYB;
import java.util.EnumSet;

public class rBj_1
extends rBk_1 {
    private final rRq_1 id_class;
    private final is_3 id_break;
    private iB_2 id_byte;
    private int id_protected;

    public rBj_1(is_3 is_32) {
        this.id_break = is_32;
        this.id_class = (rYB)is_32.id_throws[7];
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_break.I_();
        if (iB_22 == null) {
            return false;
        }
        this.id_byte = iB_22;
        return true;
    }

    @Override
    public boolean id_break() {
        if (!this.id_byte.BM()) {
            return false;
        }
        if (this.id_break.id_int(this.id_byte) > 225.0) {
            return false;
        }
        return !this.id_break.id_public().id_native() || this.id_class();
    }

    @Override
    public void id_throws() {
        this.id_break.id_continue().id_class(this.id_byte, 30.0f, 30.0f);
        double d = this.id_break.PN() * 2.0f * this.id_break.PN() * 2.0f;
        double d2 = this.id_break.id_class(this.id_byte.rx(), this.id_byte.re(), this.id_byte.BO());
        double d3 = 0.8;
        if (d2 > d && d2 < 16.0) {
            d3 = 1.33;
        } else if (d2 < 225.0) {
            d3 = 0.6;
        }
        this.id_break.id_public().id_class((an_3)this.id_byte, d3);
        this.id_protected = Math.max(this.id_protected - 1, 0);
        if (!(d2 > d) && this.id_protected <= 0) {
            this.id_protected = 20;
            this.id_break.id_public(this.id_byte);
        }
    }

    @Override
    public void id_protected() {
        this.id_byte = null;
        this.id_break.id_public().id_final();
    }
}

