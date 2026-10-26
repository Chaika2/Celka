/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.JD;
import celestial.Jq_1;
import celestial.Qr_1;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCc_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
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

public class zj_3
extends JD {
    public static final rCc_1 id_package = kE_2.p;
    private static final Map<rpr_3, rjC_2> id_int = Maps.newEnumMap((Map)ImmutableMap.of((Object)rpr_3.NORTH, (Object)xd_3.id_class(0.0, 4.5, 14.0, 16.0, 12.5, 16.0), (Object)rpr_3.SOUTH, (Object)xd_3.id_class(0.0, 4.5, 0.0, 16.0, 12.5, 2.0), (Object)rpr_3.EAST, (Object)xd_3.id_class(0.0, 4.5, 0.0, 2.0, 12.5, 16.0), (Object)rpr_3.WEST, (Object)xd_3.id_class(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)));

    public zj_3(Jq_1 jq_1, Qr_1 qr_1) {
        super(jq_1, qr_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_package, rpr_3.NORTH)).id_class(id_volatile, false));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_package, rqd_32.id_class(xc_32.id_byte(id_package)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_package)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_package, id_volatile);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32.id_case() == xc_32.id_byte(id_package) && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_int.get(xc_32.id_byte(id_package));
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3[] rpr_3Array;
        xc_3 xc_32 = this.id_continue();
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        for (rpr_3 rpr_32 : rpr_3Array = rxx_32.id_throws()) {
            rpr_3 rpr_33;
            if (!rpr_32.id_final().id_protected() || !(xc_32 = (xc_3)xc_32.id_class(id_package, rpr_33 = rpr_32.id_case())).id_class((rRR)rYB2, rfH_22)) continue;
            return (xc_3)xc_32.id_class(id_volatile, rXE2.id_class() == rXG.id_byte);
        }
        return null;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return rRR2.id_byte(rfH_22.id_break(xc_32.id_byte(id_package).id_case())).id_byte().id_break();
    }

    @Override
    public String id_volatile() {
        return this.id_case().id_break();
    }
}

