/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.nt_3;
import celestial.rLO;
import celestial.rXG;

public class nf_3
implements CX<rLO> {
    protected final Ch_1 id_class;

    public nf_3(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLO rLO2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        nt_3 nt_32 = new nt_3(gm_32, d, d2, d3, rXG.id_class);
        nt_32.id_class = true;
        nt_32.id_this = (int)(28.0 / (Math.random() * 0.8 + 0.2));
        nt_32.id_class(0.51171875f, 0.03125f, 0.890625f);
        nt_32.id_class(this.id_class);
        return nt_32;
    }
}

