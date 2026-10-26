/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.dQ_2;
import celestial.eU_2;
import celestial.is_3;
import celestial.rXQ;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdS_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rxS_2;
import celestial.rym_3;

public class rxH_2
extends rdb_3
implements eU_2,
rdS_2 {
    private static final rdn_3 id_class = new rdn_3(rdy_3.dc);

    public rxH_2(rdO_2 rdO_22) {
        super(rdO_22);
        dQ_2.id_class(this, rxS_2.id_class);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        rdn_3 rdn_33 = rhd_32.id_class(rXQ2);
        if (rdn_33.id_class()) {
            rhd_32.id_class(rXQ2, rdn_32.id_implements());
            rdn_32.id_throws(0);
            return rym_3.id_class(rdn_32, rYB2.id_import());
        }
        return rym_3.id_protected(rdn_32);
    }

    @Override
    public String id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            rdn_3 rdn_33 = ((rhz_3)rhd_32.id_implements[1]).id_extends(i);
            if (rdn_33.id_break() != rdy_3.dc) continue;
            n += rdn_33.id_char();
        }
        return "" + n;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return rdn_33.id_break() == rdy_3.ko;
    }

    @Override
    public rdn_3 id_catch() {
        return id_class;
    }

    public static boolean id_protected(rdn_3 rdn_32) {
        return rdn_32.id_catch() < rdn_32.id_private() - 1;
    }
}

