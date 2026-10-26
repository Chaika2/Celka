/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Jq_1;
import celestial.ds_3;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCc_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXG;
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
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dd_3
extends ds_3 {
    public static final rCc_1 id_final = kE_2.p;
    private static final Map<rpr_3, rjC_2> id_package = Maps.newEnumMap((Map)ImmutableMap.of((Object)rpr_3.NORTH, (Object)xd_3.id_class(0.0, 4.0, 5.0, 16.0, 12.0, 16.0), (Object)rpr_3.SOUTH, (Object)xd_3.id_class(0.0, 4.0, 0.0, 16.0, 12.0, 11.0), (Object)rpr_3.WEST, (Object)xd_3.id_class(5.0, 4.0, 0.0, 16.0, 12.0, 16.0), (Object)rpr_3.EAST, (Object)xd_3.id_class(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)));

    protected dd_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_final, rpr_3.NORTH)).id_class(id_volatile, true));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return rpr_32.id_case() == xc_32.id_byte(id_final) && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : xc_32;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rpr_3 rpr_32 = xc_32.id_byte(id_final);
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32.id_case());
        xc_3 xc_33 = rRR2.id_byte(rfH_23);
        return xc_33.id_protected(rRR2, rfH_23, rpr_32);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3[] rpr_3Array;
        xc_3 xc_32 = super.id_class(rxx_32);
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        for (rpr_3 rpr_32 : rpr_3Array = rxx_32.id_throws()) {
            if (!rpr_32.id_final().id_protected() || !(xc_32 = (xc_3)xc_32.id_class(id_final, rpr_32.id_case())).id_class((rRR)rYB2, rfH_22)) continue;
            return xc_32;
        }
        return null;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_final, id_volatile);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_package.get(xc_32.id_byte(id_final));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_final)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_final, rqd_32.id_class(xc_32.id_byte(id_final)));
    }
}

