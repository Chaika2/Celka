/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rCf_1;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUV;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUK
extends rUO<rUV> {
    public rUK(Codec<rUV> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUV rUV2) {
        boolean bl = false;
        int n = random.nextInt(8) - random.nextInt(8);
        int n2 = random.nextInt(8) - random.nextInt(8);
        int n3 = rRI2.id_class(rKv_1.OCEAN_FLOOR, rfH_22.b_() + n, rfH_22.d_() + n2);
        rfH_2 rfH_23 = new rfH_2(rfH_22.b_() + n, n3, rfH_22.d_() + n2);
        if (rRI2.id_byte(rfH_23).id_class(xu_3.id_try)) {
            xc_3 xc_32;
            boolean bl2 = random.nextDouble() < (double)rUV2.id_break;
            xc_3 xc_33 = xc_32 = bl2 ? xu_3.rP.id_continue() : xu_3.rr.id_continue();
            if (xc_32.id_class(rRI2, rfH_23)) {
                if (bl2) {
                    xc_3 xc_34 = (xc_3)xc_32.id_class(zu_3.id_final, rCf_1.UPPER);
                    rfH_2 rfH_24 = rfH_23.id_final();
                    if (rRI2.id_byte(rfH_24).id_class(xu_3.id_try)) {
                        rRI2.id_class(rfH_23, xc_32, 2);
                        rRI2.id_class(rfH_24, xc_34, 2);
                    }
                } else {
                    rRI2.id_class(rfH_23, xc_32, 2);
                }
                bl = true;
            }
        }
        return bl;
    }
}

