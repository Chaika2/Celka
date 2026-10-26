/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.na_3;
import celestial.rLO;

public class ni_3
implements CX<rLO> {
    private final Ch_1 id_class;

    public ni_3(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        na_3 na_32 = new na_3(gm_32, d, d2, d3);
        na_32.id_class(this.id_class);
        return na_32;
    }
}

