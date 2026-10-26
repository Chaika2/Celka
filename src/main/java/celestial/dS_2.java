/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rfH_2;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class dS_2
extends xd_3 {
    private final xd_3 id_volatile;

    public dS_2(xd_3 xd_32, Jq_1 jq_1) {
        super(jq_1);
        this.id_volatile = xd_32;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        if (!this.id_class((rRq_1)rxx_32.id_int(), rxx_32.id_class())) {
            rxx_32.id_int().id_finally().id_class(rxx_32.id_class(), this, 60 + rxx_32.id_int().id_long().nextInt(40));
        }
        return this.id_continue();
    }

    protected boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        for (rpr_3 rpr_32 : rpr_3.values()) {
            rXE rXE2 = rRq_12.id_break(rfH_22.id_break(rpr_32));
            if (!rXE2.id_class(rlG_2.id_break)) continue;
            return true;
        }
        return false;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (!this.id_class((rRq_1)rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 60 + rRg_12.id_long().nextInt(40));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!this.id_class((rRq_1)rrEm_12, rfH_22)) {
            rrEm_12.id_class(rfH_22, this.id_volatile.id_continue(), 2);
        }
    }
}

