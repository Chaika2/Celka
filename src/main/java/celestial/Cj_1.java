/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Cf_1;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.rLO;

public class Cj_1
implements CX<rLO> {
    private final Ch_1 id_class;

    public Cj_1(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        Cf_1 cf_1 = new Cf_1(gm_32, d, d2, d3);
        cf_1.id_class(this.id_class);
        return cf_1;
    }
}

