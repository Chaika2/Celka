/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.Ci_1;
import celestial.gm_3;
import celestial.rLO;

public class ls_3
implements CX<rLO> {
    private final Ch_1 id_class;

    public ls_3(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        Ci_1 ci_1 = new Ci_1(gm_32, d, d2, d3, d4, d5, d6, this.id_class);
        float f = gm_32.id_int.nextFloat() * 0.5f + 0.35f;
        ci_1.id_class(1.0f * f, 0.0f * f, 1.0f * f);
        return ci_1;
    }
}

