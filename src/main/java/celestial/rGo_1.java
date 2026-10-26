/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rGg_1;
import celestial.rPY;
import celestial.rPo_1;
import celestial.rfU_2;
import celestial.rjU_2;

public class rGo_1
extends rPY {
    public final /* synthetic */ rGg_1 id_implements;

    public rGo_1(rGg_1 rGg_12, rGg_1 rGg_13) {
        this.id_implements = rGg_12;
        super(rGg_13);
    }

    @Override
    public void id_class() {
        if (this.id_private == rPo_1.MOVE_TO) {
            rjU_2 rjU_22 = new rjU_2(this.id_break - this.id_implements.rx(), this.id_byte - this.id_implements.re(), this.id_protected - this.id_implements.BO());
            double d = rjU_22.id_case();
            if (d < this.id_implements.rN().id_class()) {
                this.id_private = rPo_1.WAIT;
                this.id_implements.id_byte(this.id_implements.rv().id_class(0.5));
            } else {
                this.id_implements.id_byte(this.id_implements.rv().id_throws(rjU_22.id_class(this.id_throws * 0.05 / d)));
                if (this.id_implements.I_() == null) {
                    rjU_2 rjU_23 = this.id_implements.rv();
                    Float f = Float.valueOf(-((float)rfU_2.id_protected(rjU_23.id_break, rjU_23.id_protected)) * 57.295776f);
                    this.id_implements.id_throws[15] = f;
                    Float f2 = Float.valueOf(((Float)this.id_implements.id_throws[15]).floatValue());
                    this.id_implements.id_private[23] = f2;
                } else {
                    double d2 = this.id_implements.I_().rx() - this.id_implements.rx();
                    double d3 = this.id_implements.I_().BO() - this.id_implements.BO();
                    Float f = Float.valueOf(-((float)rfU_2.id_protected(d2, d3)) * 57.295776f);
                    this.id_implements.id_throws[15] = f;
                    Float f3 = Float.valueOf(((Float)this.id_implements.id_throws[15]).floatValue());
                    this.id_implements.id_private[23] = f3;
                }
            }
        }
    }
}

