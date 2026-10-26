/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lC_2;
import celestial.rLO;
import java.util.Random;

public class ll_3
implements CX<rLO> {
    private final Ch_1 id_class;

    public ll_3(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        Random random = gm_32.id_int;
        double d7 = (double)random.nextFloat() * -1.9 * (double)random.nextFloat() * 0.1;
        double d8 = (double)random.nextFloat() * -0.5 * (double)random.nextFloat() * 0.1 * 5.0;
        double d9 = (double)random.nextFloat() * -1.9 * (double)random.nextFloat() * 0.1;
        return new lC_2(gm_32, d, d2, d3, d7, d8, d9, 1.0f, this.id_class);
    }
}

