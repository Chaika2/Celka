/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.JU;
import celestial.Jq_1;
import celestial.WI;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCZ;
import celestial.rCc_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class zV_2
extends JU {
    public static final rCc_1 id_volatile = kE_2.p;
    private static final Map<rpr_3, rjC_2> id_final = Maps.newEnumMap((Map)ImmutableMap.of((Object)rpr_3.NORTH, (Object)xd_3.id_class(4.0, 4.0, 8.0, 12.0, 12.0, 16.0), (Object)rpr_3.SOUTH, (Object)xd_3.id_class(4.0, 4.0, 0.0, 12.0, 12.0, 8.0), (Object)rpr_3.EAST, (Object)xd_3.id_class(0.0, 4.0, 4.0, 8.0, 12.0, 12.0), (Object)rpr_3.WEST, (Object)xd_3.id_class(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)));

    protected zV_2(WI wI, Jq_1 jq_1) {
        super(wI, jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3[] rpr_3Array;
        xc_3 xc_32 = this.id_continue();
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        for (rpr_3 rpr_32 : rpr_3Array = rxx_32.id_throws()) {
            if (!rpr_32.id_final().id_protected()) continue;
            rpr_3 rpr_33 = rpr_32.id_case();
            xc_32 = (xc_3)xc_32.id_class(id_volatile, rpr_33);
            if (rYB2.id_byte(rfH_22.id_break(rpr_32)).id_class(rxx_32)) continue;
            return xc_32;
        }
        return null;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final.get(xc_32.id_byte(id_volatile));
    }

    @Override
    public String id_volatile() {
        return this.id_case().id_break();
    }
}

