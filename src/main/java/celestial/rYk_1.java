/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYG;
import celestial.rYx_1;
import celestial.rfH_2;

public final class rYk_1
extends rYx_1 {
    public rYk_1(String string2) {
    }

    @Override
    public float id_class(rfH_2 rfH_22, float f) {
        double d;
        double d2;
        double d3 = rYG.id_implements.id_class((double)rfH_22.b_() * 0.05, (double)rfH_22.d_() * 0.05, false) * 7.0;
        double d4 = d3 + (d2 = rYG.id_case.id_class((double)rfH_22.b_() * 0.2, (double)rfH_22.d_() * 0.2, false));
        if (d4 < 0.3 && (d = rYG.id_case.id_class((double)rfH_22.b_() * 0.09, (double)rfH_22.d_() * 0.09, false)) < 0.8) {
            return 0.2f;
        }
        return f;
    }
}

