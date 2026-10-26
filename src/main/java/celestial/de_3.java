/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dq_3;
import celestial.dy_3;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class de_3
extends xd_3 {
    protected static final rjC_2 id_volatile = dy_3.id_final;

    protected de_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_33 = rRR2.id_byte(rfH_22.id_final());
        return !xc_33.id_byte().id_break() || xc_33.id_break() instanceof dq_3;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return !this.id_continue().id_class((rRR)rxx_32.id_int(), rxx_32.id_class()) ? xd_3.id_class(this.id_continue(), xu_3.id_finally.id_continue(), rxx_32.id_int(), rxx_32.id_class()) : super.id_class(rxx_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32 == rpr_3.UP && !xc_32.id_class(rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        dy_3.id_byte(xc_32, rrEm_12, rfH_22);
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return true;
    }
}

