/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CE;
import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.rLO;

public class Cb_1
implements CX<rLO> {
    private final Ch_1 id_class;

    public Cb_1(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        CE cE = new CE(gm_32, d, d2, d3);
        cE.id_class(this.id_class);
        return cE;
    }
}

