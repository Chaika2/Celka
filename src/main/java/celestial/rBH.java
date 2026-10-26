/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.eX_2;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rKv_1;
import celestial.rLy_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rrEm_1;
import java.util.EnumSet;
import java.util.Random;

public class rBH
extends rBk_1 {
    private final aA_2 id_class;
    private final int id_break;
    private rfH_2 id_byte;

    public rBH(aA_2 aA_22, int n) {
        this.id_class = aA_22;
        this.id_break = n;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (this.id_class.BP()) {
            return false;
        }
        if (((rYB)this.id_class.id_throws[7]).id_strictfp()) {
            return false;
        }
        if (this.id_class.Sa().nextInt(this.id_break) != 0) {
            return false;
        }
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        rfH_2 rfH_23 = this.id_class.Bs();
        if (!rrEm_12.id_byte(rfH_23, 6)) {
            return false;
        }
        rjU_2 rjU_22 = iX_2.id_class(this.id_class, 15, 7, rfH_22 -> -rrEm_12.id_break(rjh_3.id_class(rfH_22)));
        this.id_byte = rjU_22 == null ? null : new rfH_2(rjU_22);
        return this.id_byte != null;
    }

    @Override
    public boolean id_break() {
        return this.id_byte != null && !this.id_class.id_public().id_native() && this.id_class.id_public().id_catch().equals(this.id_byte);
    }

    @Override
    public void id_throws() {
        rLy_1 rLy_12;
        if (this.id_byte != null && (rLy_12 = this.id_class.id_public()).id_native() && !this.id_byte.id_class((eX_2)this.id_class.Ps(), 10.0)) {
            rjU_2 rjU_22 = rjU_2.id_protected(this.id_byte);
            rjU_2 rjU_23 = this.id_class.Ps();
            rjU_2 rjU_24 = rjU_23.id_protected(rjU_22);
            rjU_22 = rjU_24.id_class(0.4).id_throws(rjU_22);
            rjU_2 rjU_25 = rjU_22.id_protected(rjU_23).id_protected().id_class(10.0).id_throws(rjU_23);
            rfH_2 rfH_22 = new rfH_2(rjU_25);
            if (!rLy_12.id_class((double)(rfH_22 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rfH_22)).b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), 1.0)) {
                this.id_catch();
            }
        }
    }

    private void id_catch() {
        Random random = this.id_class.Sa();
        rfH_2 rfH_22 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, this.id_class.Bs().id_break(-8 + random.nextInt(16), 0, -8 + random.nextInt(16)));
        this.id_class.id_public().id_class((double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), 1.0);
    }
}

