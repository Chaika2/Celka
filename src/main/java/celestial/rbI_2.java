/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rbF_2;
import celestial.rfH_2;
import celestial.rjU_2;
import java.util.EnumSet;

public class rbI_2
extends rBk_1 {
    public final /* synthetic */ rbF_2 id_class;

    @Override
    public void id_byte() {
        rjU_2 rjU_22 = this.id_catch();
        if (rjU_22 != null) {
            rbF_2.id_instanceof(this.id_class).id_class(rbF_2.id_try(this.id_class).id_class(new rfH_2(rjU_22), 1), 1.0);
        }
    }

    public rbI_2(rbF_2 rbF_22) {
        this.id_class = rbF_22;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        return rbF_2.id_public(this.id_class).id_native() && rbF_2.id_goto(this.id_class).nextInt(10) == 0;
    }

    @Override
    public boolean id_break() {
        return rbF_2.id_while(this.id_class).id_volatile();
    }

    private rjU_2 id_catch() {
        rjU_2 rjU_22;
        if (this.id_class.sH() && !this.id_class.id_break(this.id_class.id_abstract, 22)) {
            rjU_2 rjU_23 = rjU_2.id_class(this.id_class.id_abstract);
            rjU_22 = rjU_23.id_protected(this.id_class.Ps()).id_protected();
        } else {
            rjU_22 = this.id_class.id_break(0.0f);
        }
        int n = 8;
        rjU_2 rjU_24 = iX_2.id_class(this.id_class, 8, 7, rjU_22, 1.5707964f, 2, 1);
        return rjU_24 != null ? rjU_24 : iX_2.id_class(this.id_class, 8, 4, -2, rjU_22, 1.5707963705062866);
    }
}

