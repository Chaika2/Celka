/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jj_1;
import celestial.rYB;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xn_3;

public class rxf_3
extends rdb_3 {
    public rxf_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rYB rYB2 = rdH_22.id_int();
        rfH_2 rfH_22 = rdH_22.id_class();
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        boolean bl = false;
        if (xn_3.id_implements(xc_32)) {
            this.id_class(rYB2, rfH_22);
            rYB2.id_break(rfH_22, (xc_3)xc_32.id_class(xn_3.id_final, true));
            bl = true;
        } else if (Jj_1.id_class(rYB2, rfH_22 = rfH_22.id_break(rdH_22.id_finally()), rdH_22.id_case())) {
            this.id_class(rYB2, rfH_22);
            rYB2.id_break(rfH_22, Jj_1.id_class(rYB2, rfH_22));
            bl = true;
        }
        if (bl) {
            rdH_22.id_volatile().id_catch(1);
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.FAIL;
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22) {
        rYB2.id_class((rhd_3)null, rfH_22, rqn_3.SE, rqL_2.BLOCKS, 1.0f, (id_private.nextFloat() - id_private.nextFloat()) * 0.2f + 1.0f);
    }
}

