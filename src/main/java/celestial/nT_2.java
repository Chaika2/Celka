/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.nH_2;
import celestial.rLO;
import celestial.rLQ;
import celestial.rXG;

public class nT_2
implements CX<rLO> {
    protected final Ch_1 id_class;

    public nT_2(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        nH_2 nH_22 = new nH_2(gm_32, d, d2, d3, rXG.id_byte, rLQ.E);
        nH_22.id_class(0.2f, 0.3f, 1.0f);
        nH_22.id_class(this.id_class);
        return nH_22;
    }
}

