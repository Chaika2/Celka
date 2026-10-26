/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.Uy_1;
import celestial.dQ_2;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsX_2;

public class UU
extends Uy_1 {
    @Override
    protected rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rrEm_1 rrEm_12 = uq_1.id_catch();
        rfH_2 rfH_22 = uq_1.id_protected().id_break(uq_1.id_throws().id_byte(dQ_2.id_volatile));
        rsX_2 rsX_22 = new rsX_2(rrEm_12, (double)rfH_22.b_() + 0.5, rfH_22.c_(), (double)rfH_22.d_() + 0.5, null);
        rrEm_12.a_(rsX_22);
        ((rYB)rrEm_12).id_class((rhd_3)null, rsX_22.rx(), rsX_22.re(), rsX_22.BO(), rqn_3.db, rqL_2.BLOCKS, 1.0f, 1.0f);
        rdn_32.id_catch(1);
        return rdn_32;
    }
}

