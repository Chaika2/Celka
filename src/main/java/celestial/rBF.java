/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rYB;
import celestial.rhP_2;
import celestial.rjU_2;
import celestial.rsM_2;
import java.util.EnumSet;
import java.util.List;

public class rBF
extends rBk_1 {
    public final rhP_2 id_class;
    private double id_break;
    private int id_byte;

    public rBF(rhP_2 rhP_22, double d) {
        this.id_class = rhP_22;
        this.id_break = d;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    private boolean id_class(rhP_2 rhP_22, int n) {
        if (n > 8) {
            return false;
        }
        if (rhP_22.EB()) {
            if (rhP_22.ES().z()) {
                return true;
            }
            rhP_2 rhP_23 = rhP_22.ES();
            return this.id_class(rhP_23, ++n);
        }
        return false;
    }

    @Override
    public boolean id_class() {
        if (!this.id_class.z() && !this.id_class.EB()) {
            double d;
            rhP_2 rhP_22;
            List<an_3> list = ((rYB)this.id_class.id_throws[7]).id_break((an_3)this.id_class, this.id_class.rN().id_byte(9.0, 4.0, 9.0), an_32 -> {
                aI_2<?> aI_22 = an_32.BC();
                return aI_22 == aI_2.id_transient || aI_22 == aI_2.R;
            });
            is_3 is_32 = null;
            double d2 = Double.MAX_VALUE;
            for (an_3 an_33 : list) {
                rhP_22 = (rhP_2)an_33;
                if (!rhP_22.EB() || rhP_22.EP() || (d = this.id_class.id_int(rhP_22)) > d2) continue;
                d2 = d;
                is_32 = rhP_22;
            }
            if (is_32 == null) {
                for (an_3 an_33 : list) {
                    rhP_22 = (rhP_2)an_33;
                    if (!rhP_22.z() || rhP_22.EP() || (d = this.id_class.id_int(rhP_22)) > d2) continue;
                    d2 = d;
                    is_32 = rhP_22;
                }
            }
            if (is_32 == null) {
                return false;
            }
            if (d2 < 4.0) {
                return false;
            }
            if (!is_32.z() && !this.id_class((rhP_2)is_32, 1)) {
                return false;
            }
            this.id_class.id_class((rhP_2)is_32);
            return true;
        }
        return false;
    }

    @Override
    public boolean id_break() {
        if (this.id_class.EB() && this.id_class.ES().BM() && this.id_class(this.id_class, 0)) {
            double d = this.id_class.id_int(this.id_class.ES());
            if (d > 676.0) {
                if (this.id_break <= 3.0) {
                    this.id_break *= 1.2;
                    this.id_byte = 40;
                    return true;
                }
                if (this.id_byte == 0) {
                    return false;
                }
            }
            if (this.id_byte > 0) {
                --this.id_byte;
            }
            return true;
        }
        return false;
    }

    @Override
    public void id_throws() {
        if (this.id_class.EB() && !(this.id_class.N() instanceof rsM_2)) {
            rhP_2 rhP_22 = this.id_class.ES();
            double d = this.id_class.id_implements(rhP_22);
            float f = 2.0f;
            rjU_2 rjU_22 = new rjU_2(rhP_22.rx() - this.id_class.rx(), rhP_22.re() - this.id_class.re(), rhP_22.BO() - this.id_class.BO()).id_protected().id_class(Math.max(d - 2.0, 0.0));
            this.id_class.id_public().id_class(this.id_class.rx() + rjU_22.id_break, this.id_class.re() + rjU_22.id_byte, this.id_class.BO() + rjU_22.id_protected, this.id_break);
        }
    }

    @Override
    public void id_protected() {
        this.id_class.Er();
        this.id_break = 2.1;
    }
}

