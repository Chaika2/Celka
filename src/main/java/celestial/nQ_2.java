/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.gm_3;
import celestial.nz_3;
import celestial.rLX;
import celestial.xc_3;
import celestial.xu_3;

public class nQ_2
implements CX<rLX> {
    @Override
    public CH id_class(rLX rLX2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        xc_3 xc_32 = rLX2.id_class();
        return !xc_32.id_catch() && !xc_32.id_class(xu_3.rc) ? new nz_3(gm_32, d, d2, d3, d4, d5, d6, xc_32).id_catch() : null;
    }
}

