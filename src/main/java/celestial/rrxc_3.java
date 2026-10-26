/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.lT_2;
import celestial.rRp_1;
import celestial.rfH_2;
import celestial.rrJI;
import celestial.xc_3;
import celestial.yX_2;

public class rrxc_3 {
    public static final float id_class(xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22) {
        float f = xc_32.id_case(rRp_12, rfH_22);
        return lT_2.id_class(f);
    }

    public static final int id_break(xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22) {
        if (rRp_12 instanceof rrJI) {
            rrJI rrJI2 = (rrJI)rRp_12;
            int[] nArray = rrJI2.id_protected();
            int n = rrJI2.id_protected(rfH_22);
            if (n >= 0 && n < nArray.length && nArray != null) {
                int n2 = nArray[n];
                if (n2 == -1) {
                    nArray[n] = n2 = yX_2.id_class(rRp_12, xc_32, rfH_22);
                }
                return n2;
            }
            return yX_2.id_class(rRp_12, xc_32, rfH_22);
        }
        return yX_2.id_class(rRp_12, xc_32, rfH_22);
    }
}

