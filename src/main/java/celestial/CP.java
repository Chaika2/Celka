/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.Cr_1;
import celestial.Cy_1;
import celestial.QY;
import celestial.gm_3;
import celestial.rLO;

public class CP
implements CX<rLO> {
    private final Ch_1 id_class;

    public CP(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        Cr_1 cr_1 = new Cr_1(gm_32, d, d2, d3, d4, d5, d6, (Cy_1)QY.id_instanceof().id_class[12], this.id_class);
        cr_1.id_throws(0.99f);
        return cr_1;
    }
}

