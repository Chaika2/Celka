/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dH_2;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rja_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rsB_2;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public class dr_3
extends dH_2 {
    private final xc_3 id_volatile;

    public dr_3(xd_3 xd_32, Jq_1 jq_1) {
        super(jq_1);
        this.id_volatile = xd_32.id_continue();
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return dr_3.id_class(rRg_12, rfH_22) ? this.id_volatile : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    private static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        boolean bl = false;
        rfw_3 rfw_32 = rfH_22.id_new();
        for (rpr_3 rpr_32 : rpr_3.values()) {
            xc_3 xc_32 = rRq_12.id_byte(rfw_32);
            if (rpr_32 == rpr_3.DOWN && !dr_3.id_private(xc_32)) continue;
            rfw_32.id_class((rja_3)rfH_22, rpr_32);
            xc_32 = rRq_12.id_byte(rfw_32);
            if (!dr_3.id_private(xc_32) || xc_32.id_protected(rRq_12, rfH_22, rpr_32.id_case())) continue;
            bl = true;
            break;
        }
        return bl;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32;
        rfH_2 rfH_22;
        rYB rYB2 = rxx_32.id_int();
        return dr_3.id_break(rYB2, rfH_22 = rxx_32.id_class(), xc_32 = rYB2.id_byte(rfH_22)) ? this.id_volatile : super.id_class(rxx_32);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, xc_3 xc_33, rsB_2 rsB_22) {
        if (dr_3.id_break(rYB2, rfH_22, xc_33)) {
            rYB2.id_class(rfH_22, this.id_volatile, 3);
        }
    }

    private static boolean id_break(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return dr_3.id_private(xc_32) || dr_3.id_class(rRq_12, rfH_22);
    }

    @Override
    public int id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_protected((rRq_1)rRq_12, (rfH_2)rfH_22).d;
    }

    private static boolean id_private(xc_3 xc_32) {
        return xc_32.id_volatile().id_class(rlG_2.id_break);
    }
}

