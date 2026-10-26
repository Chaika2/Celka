/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.nC_2;
import celestial.rLO;
import celestial.rLQ;
import celestial.rXG;

public class nn_3
implements CX<rLO> {
    protected final Ch_1 id_class;

    public nn_3(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        nC_2 nC_22 = new nC_2(gm_32, d, d2, d3, rXG.id_class, rLQ.W);
        nC_22.id_else = 0.01f;
        nC_22.id_class(0.582f, 0.448f, 0.082f);
        nC_22.id_class(this.id_class);
        return nC_22;
    }
}

