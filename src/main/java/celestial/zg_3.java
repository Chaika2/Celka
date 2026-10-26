/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Jq_1;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCZ;
import celestial.rCc_1;
import celestial.rLQ;
import celestial.rLx_1;
import celestial.rRR;
import celestial.rRg_1;
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
import celestial.xu_3;
import celestial.zZ_2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public class zg_3
extends zZ_2 {
    public static final rCc_1 id_volatile = kE_2.p;
    private static final Map<rpr_3, rjC_2> id_final = Maps.newEnumMap((Map)ImmutableMap.of((Object)rpr_3.NORTH, (Object)xd_3.id_class(5.5, 3.0, 11.0, 10.5, 13.0, 16.0), (Object)rpr_3.SOUTH, (Object)xd_3.id_class(5.5, 3.0, 0.0, 10.5, 13.0, 5.0), (Object)rpr_3.WEST, (Object)xd_3.id_class(11.0, 3.0, 5.5, 16.0, 13.0, 10.5), (Object)rpr_3.EAST, (Object)xd_3.id_class(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)));

    protected zg_3(Jq_1 jq_1, rLx_1 rLx_12) {
        super(jq_1, rLx_12);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        double d = (double)rfH_22.b_() + 0.5;
        double d2 = (double)rfH_22.c_() + 0.7;
        double d3 = (double)rfH_22.d_() + 0.5;
        double d4 = 0.22;
        double d5 = 0.27;
        rpr_3 rpr_33 = rpr_32.id_case();
        rYB2.id_class(rLQ.id_double, d + 0.27 * (double)rpr_33.id_implements(), d2 + 0.22, d3 + 0.27 * (double)rpr_33.id_extends(), 0.0, 0.0, 0.0);
        rYB2.id_class(this.id_new, d + 0.27 * (double)rpr_33.id_implements(), d2 + 0.22, d3 + 0.27 * (double)rpr_33.id_extends(), 0.0, 0.0, 0.0);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32.id_case() == xc_32.id_byte(id_volatile) && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : xc_32;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return zg_3.id_private(xc_32);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3[] rpr_3Array;
        xc_3 xc_32 = this.id_continue();
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        for (rpr_3 rpr_32 : rpr_3Array = rxx_32.id_throws()) {
            rpr_3 rpr_33;
            if (!rpr_32.id_final().id_protected() || !(xc_32 = (xc_3)xc_32.id_class(id_volatile, rpr_33 = rpr_32.id_case())).id_class((rRR)rYB2, rfH_22)) continue;
            return xc_32;
        }
        return null;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32.id_case());
        xc_3 xc_33 = rRR2.id_byte(rfH_23);
        return xc_33.id_protected(rRR2, rfH_23, rpr_32);
    }

    public static rjC_2 id_private(xc_3 xc_32) {
        return id_final.get(xc_32.id_byte(id_volatile));
    }

    @Override
    public String id_volatile() {
        return this.id_case().id_break();
    }
}

