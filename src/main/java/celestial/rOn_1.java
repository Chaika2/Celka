/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iX_2;
import celestial.rBk_1;
import celestial.rON;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import java.util.Random;

public class rOn_1
extends rBk_1 {
    private final rON id_class;
    private final double id_break;
    private boolean id_byte;

    @Override
    public void id_byte() {
        int n = 512;
        int n2 = 4;
        Random random = rON.id_byte(this.id_class);
        int n3 = random.nextInt(1025) - 512;
        int n4 = random.nextInt(9) - 4;
        int n5 = random.nextInt(1025) - 512;
        if ((double)n4 + this.id_class.re() > (double)(((rYB)this.id_class.id_throws[7]).id_short() - 1)) {
            n4 = 0;
        }
        rfH_2 rfH_22 = new rfH_2((double)n3 + this.id_class.rx(), (double)n4 + this.id_class.re(), (double)n5 + this.id_class.BO());
        this.id_class.id_finally(rfH_22);
        this.id_class.id_return(true);
        this.id_byte = false;
    }

    public rOn_1(rON rON2, double d) {
        this.id_class = rON2;
        this.id_break = d;
    }

    @Override
    public boolean id_class() {
        return !this.id_class.sc() && !this.id_class.L() && this.id_class.rT();
    }

    @Override
    public boolean id_break() {
        return !this.id_class.id_public().id_native() && !this.id_byte && !this.id_class.sc() && !this.id_class.sQ() && !this.id_class.L();
    }

    @Override
    public void id_throws() {
        if (this.id_class.id_public().id_native()) {
            rjU_2 rjU_22 = rjU_2.id_protected(this.id_class.sd());
            rjU_2 rjU_23 = iX_2.id_class(this.id_class, 16, 3, rjU_22, 0.3141592741012573);
            if (rjU_23 == null) {
                rjU_23 = iX_2.id_break(this.id_class, 8, 7, rjU_22);
            }
            if (rjU_23 != null) {
                int n = rfU_2.id_byte(rjU_23.id_break);
                int n2 = rfU_2.id_byte(rjU_23.id_protected);
                int n3 = 34;
                if (!((rYB)this.id_class.id_throws[7]).id_class(n - 34, 0, n2 - 34, n + 34, 0, n2 + 34)) {
                    rjU_23 = null;
                }
            }
            if (rjU_23 == null) {
                this.id_byte = true;
                return;
            }
            this.id_class.id_public().id_class(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, this.id_break);
        }
    }

    @Override
    public void id_protected() {
        this.id_class.id_return(false);
        super.id_protected();
    }
}

