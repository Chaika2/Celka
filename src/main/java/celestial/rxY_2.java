/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eA_2;
import celestial.ee_3;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhp_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rym_3;

public class rxY_2
extends rdb_3
implements ee_3 {
    public rxY_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_33, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_33.id_protected(rpm_32);
        if ((rhp_3)rhd_33.id_implements[29] != null) {
            if (!rYB2.id_continue) {
                int n = ((rhp_3)rhd_33.id_implements[29]).id_break(rdn_32);
                rdn_32.id_class(n, rhd_33, (T rhd_32) -> rhd_32.id_byte(rpm_32));
            }
            rYB2.id_class((rhd_3)null, rhd_33.rx(), rhd_33.re(), rhd_33.BO(), rqn_3.Sz, rqL_2.NEUTRAL, 1.0f, 0.4f / (id_private.nextFloat() * 0.4f + 0.8f));
        } else {
            rYB2.id_class((rhd_3)null, rhd_33.rx(), rhd_33.re(), rhd_33.BO(), rqn_3.SN, rqL_2.NEUTRAL, 0.5f, 0.4f / (id_private.nextFloat() * 0.4f + 0.8f));
            if (!rYB2.id_continue) {
                int n = eA_2.id_byte(rdn_32);
                int n2 = eA_2.id_break(rdn_32);
                rYB2.a_(new rhp_3(rhd_33, rYB2, n2, n));
            }
            rhd_33.id_class(rlB_2.id_byte.id_break(this));
        }
        return rym_3.id_class(rdn_32, rYB2.id_import());
    }

    @Override
    public int id_protected() {
        return 1;
    }
}

