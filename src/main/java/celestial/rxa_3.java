/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rpr_3;
import celestial.rsG_2;
import celestial.rsO_2;
import celestial.rsS_2;
import celestial.ryZ_2;

public class rxa_3
extends rdb_3 {
    private final aI_2<? extends rsS_2> id_class;

    public rxa_3(aI_2<? extends rsS_2> aI_22, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_class = aI_22;
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rsS_2 rsS_22;
        rfH_2 rfH_22 = rdH_22.id_class();
        rpr_3 rpr_32 = rdH_22.id_finally();
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        rhd_3 rhd_32 = rdH_22.id_final();
        rdn_3 rdn_32 = rdH_22.id_volatile();
        if (rhd_32 != null && !this.id_class(rhd_32, rpr_32, rdn_32, rfH_23)) {
            return ryZ_2.FAIL;
        }
        rYB rYB2 = rdH_22.id_int();
        if (this.id_class == aI_2.O) {
            rsS_22 = new rsO_2(rYB2, rfH_23, rpr_32);
        } else {
            if (this.id_class != aI_2.id_default) {
                return ryZ_2.id_class(rYB2.id_continue);
            }
            rsS_22 = new rsG_2(rYB2, rfH_23, rpr_32);
        }
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null) {
            aI_2.id_class(rYB2, rhd_32, rsS_22, rcd_32);
        }
        if (rsS_22.id_throws()) {
            if (!rYB2.id_continue) {
                rsS_22.id_private();
                rYB2.a_(rsS_22);
            }
            rdn_32.id_catch(1);
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.CONSUME;
    }

    protected boolean id_class(rhd_3 rhd_32, rpr_3 rpr_32, rdn_3 rdn_32, rfH_2 rfH_22) {
        return !rpr_32.id_final().id_byte() && rhd_32.id_class(rfH_22, rpr_32, rdn_32);
    }
}

