/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lZ_2;
import celestial.rLO;

public class lF_2
implements CX<rLO> {
    private final Ch_1 id_class;

    public lF_2(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        lZ_2 lZ_22 = new lZ_2(gm_32, d, d2, d3);
        lZ_22.id_class(this.id_class);
        return lZ_22;
    }
}

