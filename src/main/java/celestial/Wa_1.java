/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jj_1;
import celestial.Jq_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class Wa_1
extends Jj_1 {
    public Wa_1(Jq_1 jq_1) {
        super(jq_1, 2.0f);
    }

    public static boolean id_class(xd_3 xd_32) {
        return xd_32.id_class(rls_3.n);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return Wa_1.id_class(rRR2.id_byte(rfH_22.id_break()).id_break());
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return this.id_class(xc_32, rRg_12, rfH_22) ? this.id_continue() : xu_3.id_class.id_continue();
    }

    @Override
    protected boolean id_catch(xc_3 xc_32) {
        return true;
    }
}

