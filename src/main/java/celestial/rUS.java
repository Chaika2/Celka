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
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUS
extends rUO<rUt_1> {
    public rUS(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        float f = random.nextInt(3) + 4;
        int n = 0;
        while (f > 0.5f) {
            for (int i = rfU_2.id_protected(-f); i <= rfU_2.id_case(f); ++i) {
                for (int j = rfU_2.id_protected(-f); j <= rfU_2.id_case(f); ++j) {
                    if (!((float)(i * i + j * j) <= (f + 1.0f) * (f + 1.0f))) continue;
                    this.id_class(rRI2, rfH_22.id_break(i, n, j), xu_3.Sh.id_continue());
                }
            }
            f = (float)((double)f - ((double)random.nextInt(2) + 0.5));
            --n;
        }
        return true;
    }
}

