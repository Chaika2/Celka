/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.ds_3;
import celestial.rRg_1;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class dE_2
extends ds_3 {
    private final xd_3 id_final;

    protected dE_2(xd_3 xd_32, Jq_1 jq_1) {
        super(jq_1);
        this.id_final = xd_32;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32 == rpr_3.DOWN && !xc_32.id_class(rRg_12, rfH_22)) {
            return xu_3.id_class.id_continue();
        }
        this.id_class(xc_32, rRg_12, rfH_22);
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        this.id_class(xc_32, (rRg_1)rYB2, rfH_22);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!dE_2.id_case(xc_32, rrEm_12, rfH_22)) {
            rrEm_12.id_class(rfH_22, (xc_3)this.id_final.id_continue().id_class(id_volatile, false), 2);
        }
    }
}

