/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;

public class rdA_2 {
    public double id_class;
    private double id_break;
    private long id_byte;

    public boolean id_class(long l) {
        return this.id_byte != l;
    }

    public void id_class(long l, double d) {
        this.id_byte = l;
        double d2 = d - this.id_class;
        d2 = rfU_2.id_byte(d2 + 0.5, 1.0) - 0.5;
        this.id_break += d2 * 0.1;
        this.id_break *= 0.8;
        this.id_class = rfU_2.id_byte(this.id_class + this.id_break, 1.0);
    }
}

