/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rLQ;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.zS_2;
import java.util.Random;

public class kq_3
extends zS_2 {
    public kq_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        super.id_class(xc_32, rYB2, rfH_22, random);
        if (random.nextInt(10) == 0) {
            rYB2.id_class(rLQ.id_const, (double)rfH_22.b_() + random.nextDouble(), (double)rfH_22.c_() + 1.1, (double)rfH_22.d_() + random.nextDouble(), 0.0, 0.0, 0.0);
        }
    }
}

