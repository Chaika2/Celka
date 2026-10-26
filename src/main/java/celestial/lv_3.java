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
import java.util.Random;

public class lv_3
implements CX<rLO> {
    private final Ch_1 id_class;

    public lv_3(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        Random random = gm_32.id_int;
        double d7 = random.nextGaussian() * (double)1.0E-6f;
        double d8 = random.nextGaussian() * (double)1.0E-4f;
        double d9 = random.nextGaussian() * (double)1.0E-6f;
        lZ_2 lZ_22 = new lZ_2(gm_32, d, d2, d3, d7, d8, d9);
        lZ_22.id_class(this.id_class);
        lZ_22.id_class(0.9f, 0.4f, 0.5f);
        return lZ_22;
    }
}

