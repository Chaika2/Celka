/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.rHy_1;
import celestial.rLQ;
import celestial.rRq_1;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.ryO_2;
import celestial.xc_3;
import java.util.Random;

public class dF_2
extends dB_2 {
    protected dF_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rXs_1 rXs_12) {
        return false;
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return rdn_3.id_break;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHy_1) {
            int n = ((rHy_1)ryO_22).id_extends();
            for (int i = 0; i < n; ++i) {
                double d = (double)rfH_22.b_() + random.nextDouble();
                double d2 = (double)rfH_22.c_() + random.nextDouble();
                double d3 = (double)rfH_22.d_() + random.nextDouble();
                double d4 = (random.nextDouble() - 0.5) * 0.5;
                double d5 = (random.nextDouble() - 0.5) * 0.5;
                double d6 = (random.nextDouble() - 0.5) * 0.5;
                int n2 = random.nextInt(2) * 2 - 1;
                if (random.nextBoolean()) {
                    d3 = (double)rfH_22.d_() + 0.5 + 0.25 * (double)n2;
                    d6 = random.nextFloat() * 2.0f * (float)n2;
                } else {
                    d = (double)rfH_22.b_() + 0.5 + 0.25 * (double)n2;
                    d4 = random.nextFloat() * 2.0f * (float)n2;
                }
                rYB2.id_class(rLQ.id_transient, d, d2, d3, d4, d5, d6);
            }
        }
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHy_1();
    }
}

