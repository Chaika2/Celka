/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.iB_2;
import celestial.rLD;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rkc_3;
import celestial.rlB_2;
import celestial.rpO_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rym_3;

public class rdr_3
extends rdb_3 {
    @Override
    public rkc_3 id_byte(rdn_3 rdn_32) {
        return rkc_3.DRINK;
    }

    public rdr_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        return rpO_2.id_class(rYB2, rhd_32, rpm_32);
    }

    @Override
    public rdn_3 id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22) {
        Object object;
        super.id_class(rdn_32, rYB2, iB_22);
        if (iB_22 instanceof rhN_2) {
            object = (rhN_2)iB_22;
            Oo_1.id_while.id_class((rhN_2)object, rdn_32);
            ((rhd_3)object).id_class(rlB_2.id_byte.id_break(this));
        }
        if (!rYB2.id_continue) {
            iB_22.id_protected(rLD.id_super);
        }
        if (rdn_32.id_class()) {
            return new rdn_3(rdy_3.Jn);
        }
        if (iB_22 instanceof rhd_3 && !((rhx_3)((rhd_3)iB_22).id_implements[18]).id_protected) {
            object = new rdn_3(rdy_3.Jn);
            rhd_3 rhd_32 = (rhd_3)iB_22;
            if (!((rhz_3)rhd_32.id_implements[1]).id_throws((rdn_3)object)) {
                rhd_32.id_class((rdn_3)object, false);
            }
        }
        return rdn_32;
    }

    @Override
    public int id_break(rdn_3 rdn_32) {
        return 40;
    }

    @Override
    public rqA_2 U_() {
        return rqn_3.sD;
    }

    @Override
    public rqA_2 V_() {
        return rqn_3.sD;
    }
}

