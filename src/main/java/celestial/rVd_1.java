/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCt_1;
import celestial.rHu_1;
import celestial.rRg_1;
import celestial.rVX;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xt_3;

public final class rVd_1
extends rVX {
    public rVd_1(xd_3 ... xd_3Array) {
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_33.id_class(xc_32.id_break()) && rpr_32.id_final().id_protected() && xc_32.id_byte(xt_3.id_package) == rCt_1.SINGLE && xc_33.id_byte(xt_3.id_package) == rCt_1.SINGLE) {
            rpr_3 rpr_33 = xc_32.id_byte(xt_3.id_final);
            if (rpr_32.id_final() != rpr_33.id_final() && rpr_33 == xc_33.id_byte(xt_3.id_final)) {
                rCt_1 rCt_12 = rpr_32 == rpr_33.id_catch() ? rCt_1.LEFT : rCt_1.RIGHT;
                rRg_12.id_class(rfH_23, (xc_3)xc_33.id_class(xt_3.id_package, rCt_12.id_break()), 18);
                if (rpr_33 == rpr_3.NORTH || rpr_33 == rpr_3.EAST) {
                    ryO_2 ryO_22 = rRg_12.id_class(rfH_22);
                    ryO_2 ryO_23 = rRg_12.id_class(rfH_23);
                    if (ryO_22 instanceof rHu_1 && ryO_23 instanceof rHu_1) {
                        rHu_1.id_class((rHu_1)ryO_22, (rHu_1)ryO_23);
                    }
                }
                return (xc_3)xc_32.id_class(xt_3.id_package, rCt_12);
            }
        }
        return xc_32;
    }
}

