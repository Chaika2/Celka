/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rMi_1;
import celestial.rOB;
import celestial.rPY;

public class rOS
extends rPY {
    private final rMi_1 id_implements;
    private double id_finally;

    public rOS(rMi_1 rMi_12) {
        super(rMi_12);
        this.id_implements = rMi_12;
    }

    @Override
    public void id_class() {
        if (rMi_1.id_class(this.id_implements) && !rMi_1.id_break(this.id_implements) && !((rOB)rMi_1.id_byte(this.id_implements)).id_byte()) {
            this.id_implements.id_implements(0.0);
        } else if (this.id_break()) {
            this.id_implements.id_implements(this.id_finally);
        }
        super.id_class();
    }

    @Override
    public void id_class(double d, double d2, double d3, double d4) {
        if (this.id_implements.rT()) {
            d4 = 1.5;
        }
        super.id_class(d, d2, d3, d4);
        if (d4 > 0.0) {
            this.id_finally = d4;
        }
    }
}

