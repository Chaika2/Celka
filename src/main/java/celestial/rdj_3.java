/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.iB_2;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rkc_3;
import celestial.rlB_2;
import celestial.rpO_2;
import celestial.rpm_3;
import celestial.rym_3;

public class rdj_3
extends rdb_3 {
    @Override
    public rkc_3 id_byte(rdn_3 rdn_32) {
        return rkc_3.DRINK;
    }

    public rdj_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        return rpO_2.id_class(rYB2, rhd_32, rpm_32);
    }

    @Override
    public rdn_3 id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22) {
        if (iB_22 instanceof rhN_2) {
            rhN_2 rhN_22 = (rhN_2)iB_22;
            Oo_1.id_while.id_class(rhN_22, rdn_32);
            rhN_22.id_class(rlB_2.id_byte.id_break(this));
        }
        if (iB_22 instanceof rhd_3 && !((rhx_3)((rhd_3)iB_22).id_implements[18]).id_protected) {
            rdn_32.id_catch(1);
        }
        if (!rYB2.id_continue) {
            iB_22.SY();
        }
        return rdn_32.id_class() ? new rdn_3(rdy_3.hg) : rdn_32;
    }

    @Override
    public int id_break(rdn_3 rdn_32) {
        return 32;
    }
}

