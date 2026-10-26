/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rJr_1;
import celestial.rRu_1;
import celestial.rXe_1;
import celestial.rYB;
import celestial.rhz_3;
import celestial.rpL_2;
import celestial.rpr_3;
import celestial.rsQ_2;
import celestial.rsd_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xt_3;
import celestial.xu_3;

public class rsk_3
extends rsQ_2 {
    @Override
    public xc_3 id_int() {
        return (xc_3)xu_3.re.id_continue().id_class(xt_3.id_final, rpr_3.NORTH);
    }

    public rsk_3(aI_2<? extends rsk_3> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    public rsk_3(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.r, d, d2, d3, rYB2);
    }

    @Override
    public rJr_1 id_class(int n, rhz_3 rhz_32) {
        return rXe_1.id_class(n, rhz_32, this);
    }

    @Override
    public void id_break(rye_3 rye_32) {
        super.id_break(rye_32);
        if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
            this.id_class((rpL_2)xu_3.re);
        }
    }

    @Override
    public int id_continue() {
        return 8;
    }

    @Override
    public int id_else() {
        return 27;
    }

    @Override
    public rsd_3 id_final() {
        return rsd_3.CHEST;
    }
}

