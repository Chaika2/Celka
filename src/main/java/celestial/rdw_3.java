/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqn_3;
import celestial.rxI_2;
import celestial.rxP_2;
import celestial.rym_3;

public class rdw_3
extends rxP_2 {
    public rdw_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rxI_2.id_class(rYB2, rfU_2.id_byte(rhd_32.rx()), rfU_2.id_byte(rhd_32.BO()), (byte)0, true, false);
        rdn_3 rdn_33 = rhd_32.id_protected(rpm_32);
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rdn_33.id_catch(1);
        }
        rhd_32.id_class(rlB_2.id_byte.id_break(this));
        rhd_32.id_class(rqn_3.dj, 1.0f, 1.0f);
        if (rdn_33.id_class()) {
            return rym_3.id_class(rdn_32, rYB2.id_import());
        }
        if (!((rhz_3)rhd_32.id_implements[1]).id_throws(rdn_32.id_implements())) {
            rhd_32.id_class(rdn_32, false);
        }
        return rym_3.id_class(rdn_33, rYB2.id_import());
    }
}

