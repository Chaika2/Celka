/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rLQ;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class zD_2
extends xd_3 {
    protected zD_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (rYB2.id_default().id_protected()) {
            rYB2.id_class(rfH_22, xu_3.N.id_continue(), 3);
            rYB2.id_byte(2009, rfH_22, 0);
            rYB2.id_class((rhd_3)null, rfH_22, rqn_3.Sk, rqL_2.BLOCKS, 1.0f, (1.0f + rYB2.id_long().nextFloat() * 0.2f) * 0.7f);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        rpr_3 rpr_32 = rpr_3.id_class(random);
        if (rpr_32 != rpr_3.UP) {
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            xc_3 xc_33 = rYB2.id_byte(rfH_23);
            if (!xc_32.id_native() || !xc_33.id_protected(rYB2, rfH_23, rpr_32.id_case())) {
                double d = rfH_22.b_();
                double d2 = rfH_22.c_();
                double d3 = rfH_22.d_();
                if (rpr_32 == rpr_3.DOWN) {
                    d2 -= 0.05;
                    d += random.nextDouble();
                    d3 += random.nextDouble();
                } else {
                    d2 += random.nextDouble() * 0.8;
                    if (rpr_32.id_final() == rpB_2.X) {
                        d3 += random.nextDouble();
                        d = rpr_32 == rpr_3.EAST ? (d += 1.0) : (d += 0.05);
                    } else {
                        d += random.nextDouble();
                        d3 = rpr_32 == rpr_3.SOUTH ? (d3 += 1.0) : (d3 += 0.05);
                    }
                }
                rYB2.id_class(rLQ.id_volatile, d, d2, d3, 0.0, 0.0, 0.0);
            }
        }
    }
}

