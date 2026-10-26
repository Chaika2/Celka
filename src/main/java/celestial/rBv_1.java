/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rjU_2;
import java.util.EnumSet;

public class rBv_1
extends rBk_1 {
    private final is_3 id_class;
    private iB_2 id_break;
    private final float id_byte;

    @Override
    public void id_byte() {
        rjU_2 rjU_22 = this.id_class.rv();
        rjU_2 rjU_23 = new rjU_2(this.id_break.rx() - this.id_class.rx(), 0.0, this.id_break.BO() - this.id_class.BO());
        if (rjU_23.id_catch() > 1.0E-7) {
            rjU_23 = rjU_23.id_protected().id_class(0.4).id_throws(rjU_22.id_class(0.2));
        }
        this.id_class.id_catch(rjU_23.id_break, this.id_byte, rjU_23.id_protected);
    }

    public rBv_1(is_3 is_32, float f) {
        this.id_class = is_32;
        this.id_byte = f;
        this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (this.id_class.BP()) {
            return false;
        }
        this.id_break = this.id_class.I_();
        if (this.id_break == null) {
            return false;
        }
        double d = this.id_class.id_int(this.id_break);
        if (!(d < 4.0) && !(d > 16.0)) {
            if (!this.id_class.BL()) {
                return false;
            }
            return this.id_class.Sa().nextInt(5) == 0;
        }
        return false;
    }

    @Override
    public boolean id_break() {
        return !this.id_class.BL();
    }
}

