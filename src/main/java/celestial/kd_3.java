/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.kJ_2;
import celestial.kh_3;
import celestial.rCT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rfH_2;
import celestial.xc_3;

public interface kd_3
extends kJ_2,
kh_3 {
    @Override
    default public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXs_1 rXs_12) {
        return xc_32.id_byte(rCT.id_throw) == false && rXs_12 == rXG.id_byte;
    }

    @Override
    default public boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2) {
        if (!xc_32.id_byte(rCT.id_throw).booleanValue() && rXE2.id_class() == rXG.id_byte) {
            if (!rRg_12.id_import()) {
                rRg_12.id_class(rfH_22, (xc_3)xc_32.id_class(rCT.id_throw, true), 3);
                rRg_12.id_extends().id_class(rfH_22, rXE2.id_class(), rXE2.id_class().id_class(rRg_12));
            }
            return true;
        }
        return false;
    }

    @Override
    default public rXs_1 id_break(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32) {
        if (xc_32.id_byte(rCT.id_throw).booleanValue()) {
            rRg_12.id_class(rfH_22, (xc_3)xc_32.id_class(rCT.id_throw, false), 3);
            return rXG.id_byte;
        }
        return rXG.id_class;
    }
}

