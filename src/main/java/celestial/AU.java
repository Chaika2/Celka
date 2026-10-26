/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AK;
import celestial.CH;
import celestial.CX;
import celestial.gm_3;
import celestial.rLO;
import celestial.rdn_3;
import celestial.rdy_3;

public class AU
implements CX<rLO> {
    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        return new AK(gm_32, d, d2, d3, new rdn_3(rdy_3.XO));
    }
}

