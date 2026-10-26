/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rEy_1;
import celestial.rPY;
import celestial.rPo_1;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rjU_2;

public class rET
extends rPY {
    private final rEy_1 id_implements;
    private int id_finally;

    public rET(rEy_1 rEy_12) {
        super(rEy_12);
        this.id_implements = rEy_12;
    }

    @Override
    public void id_class() {
        if (this.id_private == rPo_1.MOVE_TO && this.id_finally-- <= 0) {
            this.id_finally += this.id_implements.Sa().nextInt(5) + 2;
            rjU_2 rjU_22 = new rjU_2(this.id_break - this.id_implements.rx(), this.id_byte - this.id_implements.re(), this.id_protected - this.id_implements.BO());
            double d = rjU_22.id_case();
            if (this.id_class(rjU_22 = rjU_22.id_protected(), rfU_2.id_throws(d))) {
                this.id_implements.id_byte(this.id_implements.rv().id_throws(rjU_22.id_class(0.1)));
            } else {
                this.id_private = rPo_1.WAIT;
            }
        }
    }

    private boolean id_class(rjU_2 rjU_22, int n) {
        rfl_3 rfl_32 = this.id_implements.rN();
        for (int i = 1; i < n; ++i) {
            if (((rYB)this.id_implements.id_throws[7]).a_(this.id_implements, rfl_32 = rfl_32.id_protected(rjU_22))) continue;
            return false;
        }
        return true;
    }
}

