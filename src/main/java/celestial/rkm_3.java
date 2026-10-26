/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.kv_3;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.ryZ_2;
import celestial.rym_3;
import celestial.xc_3;
import celestial.xu_3;

public class rkm_3
extends rdb_3 {
    public rkm_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    public static boolean id_class(rcd_3 rcd_32) {
        if (rcd_32 == null) {
            return false;
        }
        if (!rcd_32.id_byte("pages", 9)) {
            return false;
        }
        rcy_3 rcy_32 = rcd_32.id_protected("pages", 8);
        for (int i = 0; i < rcy_32.size(); ++i) {
            String string = rcy_32.id_implements(i);
            if (string.length() <= Short.MAX_VALUE) continue;
            return false;
        }
        return true;
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rhd_32.id_class(rdn_32, rpm_32);
        rhd_32.id_class(rlB_2.id_byte.id_break(this));
        return rym_3.id_class(rdn_32, rYB2.id_import());
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rfH_2 rfH_22;
        rYB rYB2 = rdH_22.id_int();
        xc_3 xc_32 = rYB2.id_byte(rfH_22 = rdH_22.id_class());
        if (xc_32.id_class(xu_3.Xs)) {
            return kv_3.id_class(rYB2, rfH_22, xc_32, rdH_22.id_volatile()) ? ryZ_2.id_class(rYB2.id_continue) : ryZ_2.PASS;
        }
        return ryZ_2.PASS;
    }
}

