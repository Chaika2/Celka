/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.iB_2;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rjU_2;
import java.util.EnumSet;

public class rBt_1
extends rBk_1 {
    private final aA_2 id_class;
    private iB_2 id_break;
    private double id_byte;
    private double id_protected;
    private double id_throws;
    private final double id_case;
    private final float id_catch;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_class(this.id_byte, this.id_protected, this.id_throws, this.id_case);
    }

    public rBt_1(aA_2 aA_22, double d, float f) {
        this.id_class = aA_22;
        this.id_case = d;
        this.id_catch = f;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        this.id_break = this.id_class.I_();
        if (this.id_break == null) {
            return false;
        }
        if (this.id_break.id_int(this.id_class) > (double)(this.id_catch * this.id_catch)) {
            return false;
        }
        rjU_2 rjU_22 = iX_2.id_break(this.id_class, 16, 7, this.id_break.Ps());
        if (rjU_22 == null) {
            return false;
        }
        this.id_byte = rjU_22.id_break;
        this.id_protected = rjU_22.id_byte;
        this.id_throws = rjU_22.id_protected;
        return true;
    }

    @Override
    public boolean id_break() {
        return !this.id_class.id_public().id_native() && this.id_break.BM() && this.id_break.id_int(this.id_class) < (double)(this.id_catch * this.id_catch);
    }

    @Override
    public void id_protected() {
        this.id_break = null;
    }
}

