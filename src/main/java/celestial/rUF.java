/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.We_1;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUF
extends rUO<rUt_1> {
    public rUF(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        rfw_3 rfw_32 = new rfw_3();
        rfw_3 rfw_33 = new rfw_3();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n = rfH_22.b_() + i;
                int n2 = rfH_22.d_() + j;
                int n3 = rRI2.id_class(rKv_1.MOTION_BLOCKING, n, n2);
                rfw_32.id_class(n, n3, n2);
                rfw_33.id_class(rfw_32).id_byte(rpr_3.DOWN, 1);
                rYG rYG2 = rRI2.id_implements(rfw_32);
                if (rYG2.id_class(rRI2, rfw_33, false)) {
                    rRI2.id_class((rfH_2)rfw_33, xu_3.PT.id_continue(), 2);
                }
                if (!rYG2.id_break(rRI2, rfw_32)) continue;
                rRI2.id_class((rfH_2)rfw_32, xu_3.Pq.id_continue(), 2);
                xc_3 xc_32 = rRI2.id_byte(rfw_33);
                if (!xc_32.id_break(We_1.id_volatile)) continue;
                rRI2.id_class((rfH_2)rfw_33, (xc_3)xc_32.id_class(We_1.id_volatile, true), 2);
            }
        }
        return true;
    }
}

