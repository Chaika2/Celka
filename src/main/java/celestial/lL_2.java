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

public class lL_2
implements CX<rLO> {
    private final Ch_1 id_class;

    public lL_2(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = (double)gm_32.id_int.nextFloat() * -1.9 * (double)gm_32.id_int.nextFloat() * 0.1;
        lZ_2 lZ_22 = new lZ_2(gm_32, d, d2, d3, 0.0, d7, 0.0);
        lZ_22.id_class(this.id_class);
        lZ_22.id_class(0.1f, 0.1f, 0.3f);
        lZ_22.id_class(0.001f, 0.001f);
        return lZ_22;
    }
}

