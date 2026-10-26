/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CV;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.rLc_1;

public class Cg_1
implements CX<rLc_1> {
    private final Ch_1 id_class;

    public Cg_1(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLc_1 rLc_12, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        return new CV(gm_32, d, d2, d3, d4, d5, d6, rLc_12, this.id_class);
    }
}

