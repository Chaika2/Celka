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
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zO_2;
import celestial.zh_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class xr_3
extends xF_2 {
    public static final rCc_1 id_volatile = kE_2.p;
    private final zh_3 id_final;
    private static final Map<rpr_3, rjC_2> id_package = Maps.newEnumMap((Map)ImmutableMap.of((Object)rpr_3.SOUTH, (Object)xd_3.id_class(6.0, 0.0, 6.0, 10.0, 10.0, 16.0), (Object)rpr_3.WEST, (Object)xd_3.id_class(0.0, 0.0, 6.0, 10.0, 10.0, 10.0), (Object)rpr_3.NORTH, (Object)xd_3.id_class(6.0, 0.0, 0.0, 10.0, 10.0, 10.0), (Object)rpr_3.EAST, (Object)xd_3.id_class(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)));

    protected xr_3(zh_3 zh_32, Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH));
        this.id_final = zh_32;
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
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return new rdn_3(this.id_break());
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return !xc_33.id_class(this.id_final) && rpr_32 == xc_32.id_byte(id_volatile) ? (xc_3)this.id_final.id_break().id_continue().id_class(zO_2.id_volatile, 7) : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_package.get(xc_32.id_byte(id_volatile));
    }

    protected rdb_3 id_break() {
        if (this.id_final == xu_3.Pg) {
            return rdy_3.Jk;
        }
        return this.id_final == xu_3.Bg ? rdy_3.JW : rdy_3.id_class;
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_class(xu_3.PS);
    }
}

