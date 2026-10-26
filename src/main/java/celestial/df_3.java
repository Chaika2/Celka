/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Jq_1;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rxJ_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Maps;
import java.util.Map;

public class df_3
extends xd_3 {
    private static final Map<xd_3, xd_3> id_final = Maps.newHashMap();
    protected static final rjC_2 id_volatile = xd_3.id_class(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
    private final xd_3 id_package;

    public df_3(xd_3 xd_32, Jq_1 jq_1) {
        super(jq_1);
        this.id_package = xd_32;
        id_final.put(xd_32, this);
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return this.id_package == xu_3.id_class ? super.id_class(rRq_12, rfH_22, xc_32) : new rdn_3(this.id_package);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32 == rpr_3.DOWN && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        boolean bl;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rdb_3 rdb_32 = rdn_32.id_break();
        xd_3 xd_32 = rdb_32 instanceof rxJ_2 ? id_final.getOrDefault(((rxJ_2)rdb_32).id_catch(), xu_3.id_class) : xu_3.id_class;
        boolean bl2 = xd_32 == xu_3.id_class;
        boolean bl3 = bl = this.id_package == xu_3.id_class;
        if (bl2 != bl) {
            if (bl) {
                rYB2.id_class(rfH_22, xd_32.id_continue(), 3);
                rhd_32.id_break(rlB_2.J);
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                }
            } else {
                rdn_3 rdn_33 = new rdn_3(this.id_package);
                if (rdn_32.id_class()) {
                    rhd_32.id_class(rpm_32, rdn_33);
                } else if (!rhd_32.id_catch(rdn_33)) {
                    rhd_32.id_class(rdn_33, false);
                }
                rYB2.id_class(rfH_22, xu_3.SA.id_continue(), 3);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.CONSUME;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    public xd_3 id_break() {
        return this.id_package;
    }
}

