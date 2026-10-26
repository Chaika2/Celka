/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CR;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.rLO;

public class CY
implements CX<rLO> {
    private final Ch_1 id_class;

    public CY(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        CR cR = new CR(gm_32, d, d2, d3, d4, d5, d6);
        cR.id_class(this.id_class);
        return cR;
    }
}

