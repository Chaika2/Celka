/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rLQ;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class dh_3
extends xd_3 {
    public dh_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        rpr_3 rpr_32;
        if (random.nextInt(5) == 0 && (rpr_32 = rpr_3.id_class(random)) != rpr_3.UP) {
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            xc_3 xc_33 = rYB2.id_byte(rfH_23);
            if (!xc_32.id_native() || !xc_33.id_protected(rYB2, rfH_23, rpr_32.id_case())) {
                double d = rpr_32.id_implements() == 0 ? random.nextDouble() : 0.5 + (double)rpr_32.id_implements() * 0.6;
                double d2 = rpr_32.id_finally() == 0 ? random.nextDouble() : 0.5 + (double)rpr_32.id_finally() * 0.6;
                double d3 = rpr_32.id_extends() == 0 ? random.nextDouble() : 0.5 + (double)rpr_32.id_extends() * 0.6;
                rYB2.id_class(rLQ.u, (double)rfH_22.b_() + d, (double)rfH_22.c_() + d2, (double)rfH_22.d_() + d3, 0.0, 0.0, 0.0);
            }
        }
    }
}

