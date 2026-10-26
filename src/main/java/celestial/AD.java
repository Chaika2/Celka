/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AK;
import celestial.CH;
import celestial.CX;
import celestial.gm_3;
import celestial.rLk_1;

public class AD
implements CX<rLk_1> {
    @Override
    public CH id_class(rLk_1 rLk_12, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        return new AK(gm_32, d, d2, d3, d4, d5, d6, rLk_12.id_class());
    }
}

