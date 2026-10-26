/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYG;
import celestial.rYQ;

public final class rYu_1
extends rYQ {
    public rYu_1(String string2) {
    }

    @Override
    public int id_class(double d, double d2, int n) {
        double d3 = rYG.id_case.id_class(d * 0.0225, d2 * 0.0225, false);
        return d3 < -0.1 ? 5011004 : 6975545;
    }
}

