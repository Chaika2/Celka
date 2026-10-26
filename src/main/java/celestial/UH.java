/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.dQ_2;
import celestial.eJ_2;
import celestial.iB_2;
import celestial.iP_2;
import celestial.rHk_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rls_3;
import celestial.rpJ_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.xO_2;
import celestial.xc_3;

public class UH
extends eJ_2 {
    private static boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        int n;
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        if (xc_32.id_class(rls_3.k) && (n = xc_32.id_byte(xO_2.id_final).intValue()) >= 5) {
            rrEm_12.id_class((rhd_3)null, rfH_22, rqn_3.f, rqL_2.BLOCKS, 1.0f, 1.0f);
            xO_2.id_class(rrEm_12, rfH_22);
            ((xO_2)xc_32.id_break()).id_class((rYB)rrEm_12, xc_32, rfH_22, (rhd_3)null, rHk_1.BEE_RELEASED);
            return true;
        }
        return false;
    }

    @Override
    protected rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rrEm_1 rrEm_12 = uq_1.id_catch();
        if (!rrEm_12.id_import()) {
            rfH_2 rfH_22 = uq_1.id_protected().id_break(uq_1.id_throws().id_byte(dQ_2.id_volatile));
            this.id_class(UH.id_class(rrEm_12, rfH_22) || UH.id_break(rrEm_12, rfH_22));
            if (this.id_break() && rdn_32.id_class(1, rrEm_12.id_long(), (rhN_2)null)) {
                rdn_32.id_throws(0);
            }
        }
        return rdn_32;
    }

    private static boolean id_break(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        for (iB_2 iB_22 : rrEm_12.id_class(iB_2.class, new rfl_3(rfH_22), rpJ_2.id_catch)) {
            iP_2 iP_22;
            if (!(iB_22 instanceof iP_2) || !(iP_22 = (iP_2)((Object)iB_22)).id_class()) continue;
            iP_22.id_class(rqL_2.BLOCKS);
            return true;
        }
        return false;
    }
}

