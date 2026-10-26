/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rym_3;

public class rpO_2 {
    public static rdn_3 id_class(rdn_3 rdn_32, rhd_3 rhd_32, rdn_3 rdn_33) {
        return rpO_2.id_class(rdn_32, rhd_32, rdn_33, true);
    }

    public static rdn_3 id_class(rdn_3 rdn_32, rhd_3 rhd_32, rdn_3 rdn_33, boolean bl) {
        boolean bl2 = ((rhx_3)rhd_32.id_implements[18]).id_protected;
        if (bl && bl2) {
            if (!((rhz_3)rhd_32.id_implements[1]).id_implements(rdn_33)) {
                ((rhz_3)rhd_32.id_implements[1]).id_throws(rdn_33);
            }
            return rdn_32;
        }
        if (!bl2) {
            rdn_32.id_catch(1);
        }
        if (rdn_32.id_class()) {
            return rdn_33;
        }
        if (!((rhz_3)rhd_32.id_implements[1]).id_throws(rdn_33)) {
            rhd_32.id_class(rdn_33, false);
        }
        return rdn_32;
    }

    public static rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rhd_32.id_break(rpm_32);
        return rym_3.id_break(rhd_32.id_protected(rpm_32));
    }
}

