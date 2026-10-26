/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rCy_1;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUV;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.xP_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDc_1
extends rUO<rUV> {
    private static final xc_3 id_class = (xc_3)((xc_3)((xc_3)xu_3.hs.id_continue().id_class(xP_2.id_int, 1)).id_class(xP_2.id_new, rCy_1.NONE)).id_class(xP_2.id_continue, 0);
    private static final xc_3 b = (xc_3)((xc_3)id_class.id_class(xP_2.id_new, rCy_1.LARGE)).id_class(xP_2.id_continue, 1);
    private static final xc_3 M = (xc_3)id_class.id_class(xP_2.id_new, rCy_1.LARGE);
    private static final xc_3 O = (xc_3)id_class.id_class(xP_2.id_new, rCy_1.SMALL);

    public rDc_1(Codec<rUV> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUV rUV2) {
        int n = 0;
        rfw_3 rfw_32 = rfH_22.id_new();
        rfw_3 rfw_33 = rfH_22.id_new();
        if (rRI2.id_finally(rfw_32)) {
            if (xu_3.hs.id_continue().id_class(rRI2, (rfH_2)rfw_32)) {
                int n2;
                int n3 = random.nextInt(12) + 5;
                if (random.nextFloat() < rUV2.id_break) {
                    n2 = random.nextInt(4) + 1;
                    for (int i = rfH_22.b_() - n2; i <= rfH_22.b_() + n2; ++i) {
                        for (int j = rfH_22.d_() - n2; j <= rfH_22.d_() + n2; ++j) {
                            int n4;
                            int n5 = i - rfH_22.b_();
                            if (n5 * n5 + (n4 = j - rfH_22.d_()) * n4 > n2 * n2) continue;
                            rfw_33.id_class(i, rRI2.id_class(rKv_1.WORLD_SURFACE, i, j) - 1, j);
                            if (!rDc_1.id_break(rRI2.id_byte(rfw_33).id_break())) continue;
                            rRI2.id_class((rfH_2)rfw_33, xu_3.id_native.id_continue(), 2);
                        }
                    }
                }
                for (n2 = 0; n2 < n3 && rRI2.id_finally(rfw_32); ++n2) {
                    rRI2.id_class((rfH_2)rfw_32, id_class, 2);
                    rfw_32.id_byte(rpr_3.UP, 1);
                }
                if (rfw_32.c_() - rfH_22.c_() >= 3) {
                    rRI2.id_class((rfH_2)rfw_32, b, 2);
                    rRI2.id_class((rfH_2)rfw_32.id_byte(rpr_3.DOWN, 1), M, 2);
                    rRI2.id_class((rfH_2)rfw_32.id_byte(rpr_3.DOWN, 1), O, 2);
                }
            }
            ++n;
        }
        return n > 0;
    }
}

