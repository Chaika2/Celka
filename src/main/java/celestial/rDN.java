/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUa_1;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xd_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDN
extends rUO<rUa_1> {
    public rDN(Codec<rUa_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUa_1 rUa_12) {
        boolean bl = false;
        int n = rUa_12.id_byte.id_class(random);
        for (int i = rfH_22.b_() - n; i <= rfH_22.b_() + n; ++i) {
            for (int j = rfH_22.d_() - n; j <= rfH_22.d_() + n; ++j) {
                int n2;
                int n3 = i - rfH_22.b_();
                if (n3 * n3 + (n2 = j - rfH_22.d_()) * n2 > n * n) continue;
                block2: for (int k = rfH_22.c_() - rUa_12.id_protected; k <= rfH_22.c_() + rUa_12.id_protected; ++k) {
                    rfH_2 rfH_23 = new rfH_2(i, k, j);
                    xd_3 xd_32 = rRI2.id_byte(rfH_23).id_break();
                    for (xc_3 xc_32 : rUa_12.id_throws) {
                        if (!xc_32.id_class(xd_32)) continue;
                        rRI2.id_class(rfH_23, rUa_12.id_break, 2);
                        bl = true;
                        continue block2;
                    }
                }
            }
        }
        return bl;
    }
}

