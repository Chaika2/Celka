/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rYB;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rls_3;
import celestial.rsM_2;
import celestial.ryZ_2;
import celestial.xd_3;

public class rdq_3
extends rdb_3 {
    public rdq_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rfH_2 rfH_22;
        rYB rYB2 = rdH_22.id_int();
        xd_3 xd_32 = rYB2.id_byte(rfH_22 = rdH_22.id_class()).id_break();
        if (xd_32.id_class(rls_3.id_default)) {
            rhd_3 rhd_32 = rdH_22.id_final();
            if (!rYB2.id_continue && rhd_32 != null) {
                rdq_3.id_class(rhd_32, rYB2, rfH_22);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }

    public static ryZ_2 id_class(rhd_3 rhd_32, rYB rYB2, rfH_2 rfH_22) {
        rsM_2 rsM_22 = null;
        boolean bl = false;
        double d = 7.0;
        int n = rfH_22.b_();
        int n2 = rfH_22.c_();
        int n3 = rfH_22.d_();
        for (is_3 is_32 : rYB2.id_class(is_3.class, new rfl_3((double)n - 7.0, (double)n2 - 7.0, (double)n3 - 7.0, (double)n + 7.0, (double)n2 + 7.0, (double)n3 + 7.0))) {
            if (is_32.N() != rhd_32) continue;
            if (rsM_22 == null) {
                rsM_22 = rsM_2.id_class(rYB2, rfH_22);
            }
            is_32.id_break(rsM_22, true);
            bl = true;
        }
        return bl ? ryZ_2.SUCCESS : ryZ_2.PASS;
    }
}

