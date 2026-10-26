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
import celestial.rUz_1;
import celestial.rfH_2;
import celestial.rfw_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUQ
extends rUO<rUz_1> {
    public rUQ(Codec<rUz_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUz_1 rUz_12) {
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n = rfH_22.b_() + i;
                int n2 = rfH_22.d_() + j;
                int n3 = rUz_12.id_break;
                rfw_32.id_class(n, n3, n2);
                if (!rRI2.id_byte(rfw_32).id_catch()) continue;
                rRI2.id_class((rfH_2)rfw_32, rUz_12.id_byte, 2);
            }
        }
        return true;
    }
}

