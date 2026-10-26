/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ix_3;
import celestial.rLR;
import celestial.rLo_1;

public class rLg_1
extends rLR {
    protected final double id_class;

    protected rLg_1(rLo_1 rLo_12, int n, double d) {
        super(rLo_12, n);
        this.id_class = d;
    }

    @Override
    public double id_class(int n, ix_3 ix_32) {
        return this.id_class * (double)(n + 1);
    }
}

