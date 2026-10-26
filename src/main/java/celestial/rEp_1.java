/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBk_1;
import celestial.rEy_1;
import celestial.rYB;
import celestial.rhH_2;
import celestial.rhd_3;
import celestial.rjU_2;

public class rEp_1
extends rBk_1 {
    private final rEy_1 id_break;
    public int id_class;

    @Override
    public void id_byte() {
        this.id_class = 0;
    }

    public rEp_1(rEy_1 rEy_12) {
        this.id_break = rEy_12;
    }

    @Override
    public boolean id_class() {
        return this.id_break.I_() != null;
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = this.id_break.I_();
        double d = 64.0;
        if (iB_22.id_int(this.id_break) < 4096.0 && this.id_break.id_while(iB_22)) {
            rYB rYB2 = (rYB)this.id_break.id_throws[7];
            ++this.id_class;
            if (this.id_class == 10 && !this.id_break.BF()) {
                rYB2.id_class((rhd_3)null, 1015, this.id_break.Bs(), 0);
            }
            if (this.id_class == 20) {
                double d2 = 4.0;
                rjU_2 rjU_22 = this.id_break.id_break(1.0f);
                double d3 = iB_22.rx() - (this.id_break.rx() + rjU_22.id_break * 4.0);
                double d4 = iB_22.id_byte(0.5) - (0.5 + this.id_break.id_byte(0.5));
                double d5 = iB_22.BO() - (this.id_break.BO() + rjU_22.id_protected * 4.0);
                if (!this.id_break.BF()) {
                    rYB2.id_class((rhd_3)null, 1016, this.id_break.Bs(), 0);
                }
                rhH_2 rhH_22 = new rhH_2(rYB2, this.id_break, d3, d4, d5);
                rhH_22.id_catch = this.id_break.id_catch();
                rhH_22.id_new(this.id_break.rx() + rjU_22.id_break * 4.0, this.id_break.id_byte(0.5) + 0.5, rhH_22.BO() + rjU_22.id_protected * 4.0);
                rYB2.a_(rhH_22);
                this.id_class = -40;
            }
        } else if (this.id_class > 0) {
            --this.id_class;
        }
        this.id_break.id_this(this.id_class > 10);
    }

    @Override
    public void id_protected() {
        this.id_break.id_this(false);
    }
}

