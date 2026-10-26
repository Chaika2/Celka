/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.is_3;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.ryZ_2;

public class rdY_2
extends rdb_3 {
    public rdY_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdn_3 rdn_32, rhd_3 rhd_32, iB_2 iB_22, rpm_3 rpm_32) {
        if (rdn_32.id_this() && !(iB_22 instanceof rhd_3)) {
            if (!((rYB)rhd_32.id_throws[7]).id_continue && iB_22.BM()) {
                iB_22.id_break(rdn_32.id_continue());
                if (iB_22 instanceof is_3) {
                    ((is_3)iB_22).b();
                }
                rdn_32.id_catch(1);
            }
            return ryZ_2.id_class(((rYB)rhd_32.id_throws[7]).id_continue);
        }
        return ryZ_2.PASS;
    }
}

