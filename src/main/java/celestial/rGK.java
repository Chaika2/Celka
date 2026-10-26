/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rGg_1;
import celestial.rYB;
import celestial.rfH_2;
import java.util.EnumSet;

public class rGK
extends rBk_1 {
    public final /* synthetic */ rGg_1 id_class;

    public rGK(rGg_1 rGg_12) {
        this.id_class = rGg_12;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        return !this.id_class.id_super().id_break() && rGg_1.id_protected(this.id_class).nextInt(7) == 0;
    }

    @Override
    public boolean id_break() {
        return false;
    }

    @Override
    public void id_throws() {
        rfH_2 rfH_22 = this.id_class.sJ();
        if (rfH_22 == null) {
            rfH_22 = this.id_class.Bs();
        }
        for (int i = 0; i < 3; ++i) {
            rfH_2 rfH_23 = rfH_22.id_break(rGg_1.id_throws(this.id_class).nextInt(15) - 7, rGg_1.id_case(this.id_class).nextInt(11) - 5, rGg_1.id_catch(this.id_class).nextInt(15) - 7);
            if (!((rYB)this.id_class.id_throws[7]).id_finally(rfH_23)) continue;
            rGg_1.id_private(this.id_class).id_class((double)rfH_23.b_() + 0.5, (double)rfH_23.c_() + 0.5, (double)rfH_23.d_() + 0.5, 0.25);
            if (this.id_class.I_() != null) break;
            this.id_class.id_continue().id_class((double)rfH_23.b_() + 0.5, (double)rfH_23.c_() + 0.5, (double)rfH_23.d_() + 0.5, 180.0f, 20.0f);
            break;
        }
    }
}

