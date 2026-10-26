/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCi_1;
import celestial.rHu_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rlB_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.ryO_2;
import celestial.ryQ_2;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xt_3;

public class zL_2
extends xt_3 {
    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    public zL_2(Jq_1 jq_1) {
        super(jq_1, () -> ryW_2.id_byte);
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return rfU_2.id_class(rHu_1.id_class(rRq_12, rfH_22), 0, 15);
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new ryQ_2();
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return rpr_32 == rpr_3.UP ? xc_32.id_break(rRq_12, rfH_22, rpr_32) : 0;
    }

    @Override
    protected rCi_1<rqO_2> id_break() {
        return rlB_2.id_implements.id_break(rlB_2.x);
    }
}

