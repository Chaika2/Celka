/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.rBk_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rja_3;
import celestial.rlG_2;

public class rBM
extends rBk_1 {
    private final aA_2 id_class;

    @Override
    public void id_byte() {
        rja_3 rja_32 = null;
        for (rfH_2 rfH_22 : rfH_2.id_break(rfU_2.id_byte(this.id_class.rx() - 2.0), rfU_2.id_byte(this.id_class.re() - 2.0), rfU_2.id_byte(this.id_class.BO() - 2.0), rfU_2.id_byte(this.id_class.rx() + 2.0), rfU_2.id_byte(this.id_class.re()), rfU_2.id_byte(this.id_class.BO() + 2.0))) {
            if (!((rYB)this.id_class.id_throws[7]).id_break(rfH_22).id_class(rlG_2.id_break)) continue;
            rja_32 = rfH_22;
            break;
        }
        if (rja_32 != null) {
            this.id_class.id_super().id_class(rja_32.b_(), rja_32.c_(), rja_32.d_(), 1.0);
        }
    }

    public rBM(aA_2 aA_22) {
        this.id_class = aA_22;
    }

    @Override
    public boolean id_class() {
        return this.id_class.BL() && !((rYB)this.id_class.id_throws[7]).id_break(this.id_class.Bs()).id_class(rlG_2.id_break);
    }
}

