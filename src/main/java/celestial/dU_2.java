/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kX_2;
import celestial.rDg_1;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rUN;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zS_2;
import java.util.List;
import java.util.Random;

public class dU_2
extends zS_2
implements kX_2 {
    public dU_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        rfH_2 rfH_23 = rfH_22.id_final();
        xc_3 xc_33 = xu_3.e.id_continue();
        block0: for (int i = 0; i < 128; ++i) {
            xc_3 xc_34;
            rfH_2 rfH_24 = rfH_23;
            for (int j = 0; j < i / 16; ++j) {
                if (!rrEm_12.id_byte((rfH_24 = rfH_24.id_break(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1)).id_break()).id_class(this) || rrEm_12.id_byte(rfH_24).id_new(rrEm_12, rfH_24)) continue block0;
            }
            xc_3 xc_35 = rrEm_12.id_byte(rfH_24);
            if (xc_35.id_class(xc_33.id_break()) && random.nextInt(10) == 0) {
                ((kX_2)((Object)xc_33.id_break())).id_class(rrEm_12, random, rfH_24, xc_35);
            }
            if (!xc_35.id_catch()) continue;
            if (random.nextInt(8) == 0) {
                List<rDg_1<?, ?>> list = rrEm_12.id_implements(rfH_24).id_throws().id_break();
                if (list.isEmpty()) continue;
                rDg_1<?, ?> rDg_12 = list.get(0);
                rUN rUN2 = (rUN)rDg_12.id_throws;
                xc_34 = rUN2.id_class(random, rfH_24, rDg_12.id_byte());
            } else {
                xc_34 = xc_33;
            }
            if (!xc_34.id_class((rRR)rrEm_12, rfH_24)) continue;
            rrEm_12.id_class(rfH_24, xc_34, 3);
        }
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return rRq_12.id_byte(rfH_22.id_final()).id_catch();
    }
}

