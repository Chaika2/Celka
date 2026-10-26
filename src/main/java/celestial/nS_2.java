/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.nB_2;
import celestial.rLO;

public class nS_2
implements CX<rLO> {
    private final Ch_1 id_class;

    public nS_2(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        return new nB_2(gm_32, d, d2, d3, d4, d5, d6, this.id_class);
    }
}

