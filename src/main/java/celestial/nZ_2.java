/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.nm_3;
import celestial.rLO;
import celestial.rLQ;
import celestial.rXG;

public class nZ_2
implements CX<rLO> {
    protected final Ch_1 id_class;

    public nZ_2(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        nm_3 nm_32 = new nm_3(gm_32, d, d2, d3, rXG.id_class, rLQ.k);
        nm_32.id_else *= 0.01f;
        nm_32.id_this = 100;
        nm_32.id_class(0.622f, 0.508f, 0.082f);
        nm_32.id_class(this.id_class);
        return nm_32;
    }
}

