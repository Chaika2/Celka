/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CX;
import celestial.Ch_1;
import celestial.QY;
import celestial.dH_2;
import celestial.gm_3;
import celestial.nK_2;
import celestial.rLX;
import celestial.rfH_2;
import celestial.xN_2;
import celestial.xc_3;

public class nD_2
implements CX<rLX> {
    private final Ch_1 id_class;

    public nD_2(Ch_1 ch_1) {
        this.id_class = ch_1;
    }

    @Override
    public CH id_class(rLX rLX2, gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        xc_3 xc_32 = rLX2.id_class();
        if (!xc_32.id_catch() && xc_32.id_private() == xN_2.INVISIBLE) {
            return null;
        }
        rfH_2 rfH_22 = new rfH_2(d, d2, d3);
        int n = QY.id_instanceof().s().id_class(xc_32, gm_32, rfH_22);
        if (xc_32.id_break() instanceof dH_2) {
            n = ((dH_2)xc_32.id_break()).id_catch(xc_32, gm_32, rfH_22);
        }
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        return new nK_2(gm_32, d, d2, d3, f, f2, f3, this.id_class);
    }
}

