/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rBk_1;
import celestial.rYB;
import celestial.rbZ_2;
import java.util.List;

public class rBx_1
extends rBk_1 {
    private final rbZ_2 id_class;
    private rbZ_2 id_break;
    private final double id_byte;
    private int id_protected;

    @Override
    public void id_byte() {
        this.id_protected = 0;
    }

    public rBx_1(rbZ_2 rbZ_22, double d) {
        this.id_class = rbZ_22;
        this.id_byte = d;
    }

    @Override
    public boolean id_class() {
        if (this.id_class.O_() >= 0) {
            return false;
        }
        List<?> list = ((rYB)this.id_class.id_throws[7]).id_class(this.id_class.getClass(), this.id_class.rN().id_byte(8.0, 4.0, 8.0));
        rbZ_2 rbZ_22 = null;
        double d = Double.MAX_VALUE;
        for (rbZ_2 rbZ_23 : list) {
            double d2;
            if (rbZ_23.O_() < 0 || (d2 = this.id_class.id_int(rbZ_23)) > d) continue;
            d = d2;
            rbZ_22 = rbZ_23;
        }
        if (rbZ_22 == null) {
            return false;
        }
        if (d < 9.0) {
            return false;
        }
        this.id_break = rbZ_22;
        return true;
    }

    @Override
    public boolean id_break() {
        if (this.id_class.O_() >= 0) {
            return false;
        }
        if (!this.id_break.BM()) {
            return false;
        }
        double d = this.id_class.id_int(this.id_break);
        return !(d < 9.0) && !(d > 256.0);
    }

    @Override
    public void id_throws() {
        if (--this.id_protected <= 0) {
            this.id_protected = 10;
            this.id_class.id_public().id_class((an_3)this.id_break, this.id_byte);
        }
    }

    @Override
    public void id_protected() {
        this.id_break = null;
    }
}

