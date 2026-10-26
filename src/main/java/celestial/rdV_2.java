/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jo_1;
import celestial.UT;
import celestial.dQ_2;
import celestial.rCR;
import celestial.rYB;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdg_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rsJ_2;
import celestial.rsd_3;
import celestial.ryZ_2;
import celestial.xc_3;

public class rdV_2
extends rdb_3 {
    private static final UT id_class = new rdg_3();
    public final rsd_3 id_break;

    public rdV_2(rsd_3 rsd_32, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_break = rsd_32;
        dQ_2.id_class(this, id_class);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rfH_2 rfH_22;
        rYB rYB2 = rdH_22.id_int();
        xc_3 xc_32 = rYB2.id_byte(rfH_22 = rdH_22.id_class());
        if (!xc_32.id_class(rls_3.id_float)) {
            return ryZ_2.FAIL;
        }
        rdn_3 rdn_32 = rdH_22.id_volatile();
        if (!rYB2.id_continue) {
            rCR rCR2 = xc_32.id_break() instanceof Jo_1 ? xc_32.id_byte(((Jo_1)xc_32.id_break()).id_implements()) : rCR.NORTH_SOUTH;
            double d = 0.0;
            if (rCR2.id_break()) {
                d = 0.5;
            }
            rsJ_2 rsJ_22 = rsJ_2.id_class(rYB2, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.0625 + d, (double)rfH_22.d_() + 0.5, this.id_break);
            if (rdn_32.id_this()) {
                rsJ_22.id_break(rdn_32.id_continue());
            }
            rYB2.a_(rsJ_22);
        }
        rdn_32.id_catch(1);
        return ryZ_2.id_class(rYB2.id_continue);
    }
}

