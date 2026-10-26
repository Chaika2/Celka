/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JV;
import celestial.Jq_1;
import celestial.rHT;
import celestial.rJZ;
import celestial.rLQ;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rlB_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryO_2;
import celestial.xc_3;
import java.util.Random;

public class C_do
extends JV {
    protected C_do(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_final).booleanValue()) {
            double d = (double)rfH_22.b_() + 0.5;
            double d2 = rfH_22.c_();
            double d3 = (double)rfH_22.d_() + 0.5;
            if (random.nextDouble() < 0.1) {
                rYB2.id_class(d, d2, d3, rqn_3.Sw, rqL_2.BLOCKS, 1.0f, 1.0f, false);
            }
            rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
            rpB_2 rpB_22 = rpr_32.id_final();
            double d4 = 0.52;
            double d5 = random.nextDouble() * 0.6 - 0.3;
            double d6 = rpB_22 == rpB_2.X ? (double)rpr_32.id_implements() * 0.52 : d5;
            double d7 = random.nextDouble() * 6.0 / 16.0;
            double d8 = rpB_22 == rpB_2.Z ? (double)rpr_32.id_extends() * 0.52 : d5;
            rYB2.id_class(rLQ.id_double, d + d6, d2 + d7, d3 + d8, 0.0, 0.0, 0.0);
            rYB2.id_class(rLQ.id_try, d + d6, d2 + d7, d3 + d8, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void id_class(rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHT) {
            rhd_32.id_class((rJZ)((Object)ryO_22));
            rhd_32.id_break(rlB_2.z);
        }
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHT();
    }
}

