/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRR;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rfH_2;
import celestial.rjm_3;
import celestial.rpr_3;
import celestial.rxJ_2;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Map;

public class rku_3
extends rxJ_2 {
    protected final xd_3 id_class;

    @Override
    public xc_3 id_byte(rxx_3 rxx_32) {
        xc_3 xc_32 = this.id_class.id_class(rxx_32);
        xc_3 xc_33 = null;
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        for (rpr_3 rpr_32 : rxx_32.id_throws()) {
            xc_3 xc_34;
            if (rpr_32 == rpr_3.UP) continue;
            xc_3 xc_35 = xc_34 = rpr_32 == rpr_3.DOWN ? this.id_catch().id_class(rxx_32) : xc_32;
            if (xc_34 == null || !xc_34.id_class((rRR)rYB2, rfH_22)) continue;
            xc_33 = xc_34;
            break;
        }
        return xc_33 != null && rYB2.id_class(xc_33, rfH_22, rjm_3.id_break()) ? xc_33 : null;
    }

    public rku_3(xd_3 xd_32, xd_3 xd_33, rdO_2 rdO_22) {
        super(xd_32, rdO_22);
        this.id_class = xd_33;
    }

    @Override
    public void id_class(Map<xd_3, rdb_3> map, rdb_3 rdb_32) {
        super.id_class(map, rdb_32);
        map.put(this.id_class, rdb_32);
    }
}

