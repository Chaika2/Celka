/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfl_3;
import celestial.rrxN_2;

public class rrxO_2
extends rfl_3 {
    private int id_catch = -1;
    private boolean id_private = false;

    public rrxO_2(double d, double d2, double d3, double d4, double d5, double d6) {
        super(d, d2, d3, d4, d5, d6);
    }

    public boolean id_class(rrxN_2 rrxN_22, int n) {
        if (this.id_catch != n) {
            this.id_private = rrxN_22.id_class(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
            this.id_catch = n;
        }
        return this.id_private;
    }
}

