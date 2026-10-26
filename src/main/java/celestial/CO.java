/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CM;
import celestial.CX;
import celestial.gm_3;
import celestial.rLO;

public class CO
implements CX<rLO> {
    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        return new CM(gm_32, d, d2, d3);
    }
}

