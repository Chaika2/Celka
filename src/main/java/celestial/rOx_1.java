/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBk_1;
import celestial.rLQ;
import celestial.rOJ;
import celestial.rXE;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.xc_3;

public class rOx_1
extends rBk_1 {
    private int id_break;
    public final /* synthetic */ rOJ id_class;

    @Override
    public void id_byte() {
        this.id_break = 0;
    }

    public rOx_1(rOJ rOJ2) {
        this.id_class = rOJ2;
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_class.Sr();
        if (this.id_class.rT() && iB_22 != null) {
            return this.id_class.id_int(iB_22) < 100.0;
        }
        return false;
    }

    @Override
    public void id_throws() {
        ++this.id_break;
        iB_2 iB_22 = this.id_class.Sr();
        if (iB_22 != null) {
            rjU_2 rjU_22 = new rjU_2(this.id_class.rx() - iB_22.rx(), this.id_class.re() - iB_22.re(), this.id_class.BO() - iB_22.BO());
            xc_3 xc_32 = ((rYB)this.id_class.id_throws[7]).id_byte(new rfH_2(this.id_class.rx() + rjU_22.id_break, this.id_class.re() + rjU_22.id_byte, this.id_class.BO() + rjU_22.id_protected));
            rXE rXE2 = ((rYB)this.id_class.id_throws[7]).id_break(new rfH_2(this.id_class.rx() + rjU_22.id_break, this.id_class.re() + rjU_22.id_byte, this.id_class.BO() + rjU_22.id_protected));
            if (rXE2.id_class(rlG_2.id_break) || xc_32.id_catch()) {
                double d = rjU_22.id_case();
                if (d > 0.0) {
                    rjU_22.id_protected();
                    float f = 3.0f;
                    if (d > 5.0) {
                        f = (float)((double)f - (d - 5.0) / 5.0);
                    }
                    if (f > 0.0f) {
                        rjU_22 = rjU_22.id_class((double)f);
                    }
                }
                if (xc_32.id_catch()) {
                    rjU_22 = rjU_22.id_class(0.0, rjU_22.id_byte, 0.0);
                }
                this.id_class.id_byte((float)rjU_22.id_break / 20.0f, (float)rjU_22.id_byte / 20.0f, (float)rjU_22.id_protected / 20.0f);
            }
            if (this.id_break % 10 == 5) {
                ((rYB)this.id_class.id_throws[7]).id_class(rLQ.id_throws, this.id_class.rx(), this.id_class.re(), this.id_class.BO(), 0.0, 0.0, 0.0);
            }
        }
    }
}

