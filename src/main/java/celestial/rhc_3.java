/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKv_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rls_3;
import celestial.roJ_2;
import celestial.rrEm_1;
import celestial.xc_3;

public class rhc_3 {
    protected static rfH_2 id_class(rrEm_1 rrEm_12, int n, int n2, boolean bl) {
        int n3;
        rfw_3 rfw_32 = new rfw_3(n, 0, n2);
        rYG rYG2 = rrEm_12.id_implements(rfw_32);
        boolean bl2 = rrEm_12.id_default().id_byte();
        xc_3 xc_32 = rYG2.id_throws().id_throws().id_class();
        if (bl && !xc_32.id_break().id_class(rls_3.P)) {
            return null;
        }
        roJ_2 roJ_22 = rrEm_12.id_throws(n >> 4, n2 >> 4);
        int n4 = n3 = bl2 ? rrEm_12.id_else().id_implements().id_byte() : roJ_22.id_class(rKv_1.MOTION_BLOCKING, n & 0xF, n2 & 0xF);
        if (n3 < 0) {
            return null;
        }
        int n5 = roJ_22.id_class(rKv_1.WORLD_SURFACE, n & 0xF, n2 & 0xF);
        if (n5 <= n3 && n5 > roJ_22.id_class(rKv_1.OCEAN_FLOOR, n & 0xF, n2 & 0xF)) {
            return null;
        }
        for (int i = n3 + 1; i >= 0; --i) {
            rfw_32.id_class(n, i, n2);
            xc_3 xc_33 = rrEm_12.id_byte(rfw_32);
            if (!xc_33.id_volatile().id_byte()) break;
            if (!xc_33.equals(xc_32)) continue;
            return rfw_32.id_final().id_int();
        }
        return null;
    }

    public static rfH_2 id_class(rrEm_1 rrEm_12, rfj_3 rfj_32, boolean bl) {
        for (int i = rfj_32.id_break(); i <= rfj_32.id_protected(); ++i) {
            for (int j = rfj_32.id_byte(); j <= rfj_32.id_throws(); ++j) {
                rfH_2 rfH_22 = rhc_3.id_class(rrEm_12, i, j, bl);
                if (rfH_22 == null) continue;
                return rfH_22;
            }
        }
        return null;
    }
}

