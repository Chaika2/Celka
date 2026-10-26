/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rGz_1;
import celestial.rRO;
import celestial.rYB;
import celestial.rhg_3;
import celestial.rqn_3;
import java.util.EnumSet;

public class rGQ
extends rBk_1 {
    private int id_break;
    public final /* synthetic */ rGz_1 id_class;

    @Override
    public void id_byte() {
        this.id_break = 20;
        this.id_class.id_class(100);
    }

    public rGQ(rGz_1 rGz_12) {
        this.id_class = rGz_12;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 != null && iB_22.BM()) {
            return ((rYB)this.id_class.id_throws[7]).id_abstract() != rRO.PEACEFUL;
        }
        return false;
    }

    @Override
    public void id_throws() {
        if (((rYB)this.id_class.id_throws[7]).id_abstract() != rRO.PEACEFUL) {
            --this.id_break;
            iB_2 iB_22 = this.id_class.I_();
            this.id_class.id_continue().id_class(iB_22, 180.0f, 180.0f);
            double d = this.id_class.id_int(iB_22);
            if (d < 400.0) {
                if (this.id_break <= 0) {
                    this.id_break = 20 + rGz_1.id_class(this.id_class).nextInt(10) * 20 / 2;
                    ((rYB)this.id_class.id_throws[7]).a_(new rhg_3((rYB)this.id_class.id_throws[7], this.id_class, iB_22, this.id_class.n().id_final()));
                    this.id_class.id_class(rqn_3.JQ, 2.0f, (rGz_1.id_break(this.id_class).nextFloat() - rGz_1.id_byte(this.id_class).nextFloat()) * 0.2f + 1.0f);
                }
            } else {
                this.id_class.id_byte((iB_2)null);
            }
            super.id_throws();
        }
    }

    @Override
    public void id_protected() {
        this.id_class.id_class(0);
    }
}

