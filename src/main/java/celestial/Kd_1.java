/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QP;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.xc_3;
import java.util.Random;

public class Kd_1 {
    public double id_class;
    public double id_break;

    public void id_class(Random random, double d, double d2, double d3, double d4) {
        this.id_class = rfU_2.id_class(random, d, d3);
        this.id_break = rfU_2.id_class(random, d2, d4);
    }

    public boolean id_class(double d, double d2, double d3, double d4) {
        boolean bl = false;
        if (this.id_class < d) {
            this.id_class = d;
            bl = true;
        } else if (this.id_class > d3) {
            this.id_class = d3;
            bl = true;
        }
        if (this.id_break < d2) {
            this.id_break = d2;
            bl = true;
        } else if (this.id_break > d4) {
            this.id_break = d4;
            bl = true;
        }
        return bl;
    }

    public int id_class(rRq_1 rRq_12, int n) {
        rfw_3 rfw_32 = new rfw_3(this.id_class, (double)(n + 1), this.id_break);
        boolean bl = rRq_12.id_byte(rfw_32).id_catch();
        rfw_32.id_class(rpr_3.DOWN);
        boolean bl2 = rRq_12.id_byte(rfw_32).id_catch();
        while (rfw_32.c_() > 0) {
            rfw_32.id_class(rpr_3.DOWN);
            boolean bl3 = rRq_12.id_byte(rfw_32).id_catch();
            if (!bl3 && bl2 && bl) {
                return rfw_32.c_() + 1;
            }
            bl = bl2;
            bl2 = bl3;
        }
        return n + 1;
    }

    public double id_class(Kd_1 kd_1) {
        double d = this.id_class - kd_1.id_class;
        double d2 = this.id_break - kd_1.id_break;
        return Math.sqrt(d * d + d2 * d2);
    }

    public void id_class() {
        double d = this.id_break();
        this.id_class /= d;
        this.id_break /= d;
    }

    public boolean id_break(rRq_1 rRq_12, int n) {
        rfH_2 rfH_22 = new rfH_2(this.id_class, (double)(this.id_class(rRq_12, n) - 1), this.id_break);
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        QP qP = xc_32.id_byte();
        return rfH_22.c_() < n && !qP.id_class() && qP != QP.id_final;
    }

    public void id_break(Kd_1 kd_1) {
        this.id_class -= kd_1.id_class;
        this.id_break -= kd_1.id_break;
    }

    public float id_break() {
        return rfU_2.id_class(this.id_class * this.id_class + this.id_break * this.id_break);
    }
}

