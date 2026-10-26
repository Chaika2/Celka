/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;

public class gE_2 {
    private double id_class;
    private double id_break;
    private double id_byte;

    public double id_class(double d, double d2) {
        this.id_class += d;
        double d3 = this.id_class - this.id_break;
        double d4 = rfU_2.id_protected(0.5, this.id_byte, d3);
        double d5 = Math.signum(d3);
        if (d5 * d3 > d5 * this.id_byte) {
            d3 = d4;
        }
        this.id_byte = d4;
        this.id_break += d3 * d2;
        return d3 * d2;
    }

    public void id_class() {
        this.id_class = 0.0;
        this.id_break = 0.0;
        this.id_byte = 0.0;
    }
}

