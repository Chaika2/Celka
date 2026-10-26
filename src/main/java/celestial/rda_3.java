/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aK_2;
import celestial.iB_2;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.ryZ_2;

public class rda_3
extends rdb_3 {
    public rda_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdn_3 rdn_32, rhd_3 rhd_32, iB_2 iB_22, rpm_3 rpm_32) {
        aK_2 aK_22;
        if (iB_22 instanceof aK_2 && iB_22.BM() && !(aK_22 = (aK_2)((Object)iB_22)).id_byte() && aK_22.id_class()) {
            if (!((rYB)rhd_32.id_throws[7]).id_continue) {
                aK_22.id_class(rqL_2.NEUTRAL);
                rdn_32.id_catch(1);
            }
            return ryZ_2.id_class(((rYB)rhd_32.id_throws[7]).id_continue);
        }
        return ryZ_2.PASS;
    }
}

