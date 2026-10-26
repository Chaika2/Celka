/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rGg_1;
import celestial.rjU_2;
import celestial.rqn_3;
import java.util.EnumSet;

public class rGR
extends rBk_1 {
    public final /* synthetic */ rGg_1 id_class;

    @Override
    public void id_byte() {
        iB_2 iB_22 = this.id_class.I_();
        rjU_2 rjU_22 = iB_22.id_new(1.0f);
        rGg_1.id_break(this.id_class).id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, 1.0);
        this.id_class.id_this(true);
        this.id_class.id_class(rqn_3.dD, 1.0f, 1.0f);
    }

    public rGR(rGg_1 rGg_12) {
        this.id_class = rGg_12;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (this.id_class.I_() != null && !this.id_class.id_super().id_break() && rGg_1.id_class(this.id_class).nextInt(7) == 0) {
            return this.id_class.id_int(this.id_class.I_()) > 4.0;
        }
        return false;
    }

    @Override
    public boolean id_break() {
        return this.id_class.id_super().id_break() && this.id_class.sx() && this.id_class.I_() != null && this.id_class.I_().BM();
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = this.id_class.I_();
        if (this.id_class.rN().id_byte(iB_22.rN())) {
            this.id_class.id_public(iB_22);
            this.id_class.id_this(false);
        } else {
            double d = this.id_class.id_int(iB_22);
            if (d < 9.0) {
                rjU_2 rjU_22 = iB_22.id_new(1.0f);
                rGg_1.id_byte(this.id_class).id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, 1.0);
            }
        }
    }

    @Override
    public void id_protected() {
        this.id_class.id_this(false);
    }
}

