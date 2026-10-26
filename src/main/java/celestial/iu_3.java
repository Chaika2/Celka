/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iJ_2;
import celestial.rfU_2;

public class iu_3
extends iJ_2 {
    private final double id_class;
    private final double id_break;

    public iu_3(String string, double d, double d2, double d3) {
        super(string, d);
        this.id_class = d2;
        this.id_break = d3;
        if (d2 > d3) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (d < d2) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (d > d3) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }

    @Override
    public double id_class(double d) {
        return rfU_2.id_class(d, this.id_class, this.id_break);
    }
}

