/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDT;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.xc_3;
import celestial.xd_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUq_1
extends rUO<rDT> {
    public rUq_1(Codec<rDT> codec) {
        super(codec);
    }

    public static boolean id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, rDT rDT2, int n, int n2) {
        xd_3 xd_32 = rRg_12.id_byte(rfH_22.id_break()).id_break();
        if (!xd_32.id_class(rls_3.c)) {
            return false;
        }
        int n3 = rfH_22.c_();
        if (n3 >= 1 && n3 + 1 < 256) {
            int n4 = 0;
            for (int i = 0; i < n * n; ++i) {
                rfH_2 rfH_23 = rfH_22.id_break(random.nextInt(n) - random.nextInt(n), random.nextInt(n2) - random.nextInt(n2), random.nextInt(n) - random.nextInt(n));
                xc_3 xc_32 = rDT2.id_break.id_class(random, rfH_23);
                if (!rRg_12.id_finally(rfH_23) || rfH_23.c_() <= 0 || !xc_32.id_class(rRg_12, rfH_23)) continue;
                rRg_12.id_class(rfH_23, xc_32, 2);
                ++n4;
            }
            return n4 > 0;
        }
        return false;
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDT rDT2) {
        return rUq_1.id_class(rRI2, random, rfH_22, rDT2, 8, 4);
    }
}

