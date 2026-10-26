/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;

public class rrEt_1 {
    private final rfH_2 id_class;
    private final double id_break;

    public rrEt_1(rfH_2 rfH_22, double d) {
        this.id_class = rfH_22;
        this.id_break = d;
    }

    public double id_class(rfH_2 rfH_22) {
        double d = this.id_class.id_private(rfH_22);
        return d == 0.0 ? Double.POSITIVE_INFINITY : this.id_break / Math.sqrt(d);
    }
}

