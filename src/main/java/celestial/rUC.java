/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.kN_2;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUC
extends rUO<rUt_1> {
    public rUC(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        int n = 0;
        int n2 = rRI2.id_class(rKv_1.OCEAN_FLOOR, rfH_22.b_(), rfH_22.d_());
        rfH_2 rfH_23 = new rfH_2(rfH_22.b_(), n2, rfH_22.d_());
        if (rRI2.id_byte(rfH_23).id_class(xu_3.id_try)) {
            xc_3 xc_32 = xu_3.OM.id_continue();
            xc_3 xc_33 = xu_3.OO.id_continue();
            int n3 = 1 + random.nextInt(10);
            for (int i = 0; i <= n3; ++i) {
                if (rRI2.id_byte(rfH_23).id_class(xu_3.id_try) && rRI2.id_byte(rfH_23.id_final()).id_class(xu_3.id_try) && xc_33.id_class(rRI2, rfH_23)) {
                    if (i == n3) {
                        rRI2.id_class(rfH_23, (xc_3)xc_32.id_class(kN_2.id_int, random.nextInt(4) + 20), 2);
                        ++n;
                    } else {
                        rRI2.id_class(rfH_23, xc_33, 2);
                    }
                } else if (i > 0) {
                    rfH_2 rfH_24 = rfH_23.id_break();
                    if (!xc_32.id_class(rRI2, rfH_24) || rRI2.id_byte(rfH_24.id_break()).id_class(xu_3.OM)) break;
                    rRI2.id_class(rfH_24, (xc_3)xc_32.id_class(kN_2.id_int, random.nextInt(4) + 20), 2);
                    ++n;
                    break;
                }
                rfH_23 = rfH_23.id_final();
            }
        }
        return n > 0;
    }
}

