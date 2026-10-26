/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpr_3;
import celestial.rxL_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class xC_2
extends xd_3 {
    protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
    private final rxL_2 id_final;

    protected xC_2(rxL_2 rxL_22, Jq_1 jq_1) {
        super(jq_1);
        this.id_final = rxL_22;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return !rRR2.id_finally(rfH_22.id_break());
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    public rxL_2 id_break() {
        return this.id_final;
    }
}

