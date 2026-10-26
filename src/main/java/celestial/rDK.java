/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDo_1;
import celestial.rRg_1;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDK
extends rDo_1 {
    public rDK(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    protected boolean id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        int n = random.nextInt(3) + 3;
        int n2 = random.nextInt(3) + 3;
        int n3 = random.nextInt(3) + 3;
        int n4 = random.nextInt(3) + 1;
        rfw_3 rfw_32 = rfH_22.id_new();
        for (int i = 0; i <= n2; ++i) {
            for (int j = 0; j <= n; ++j) {
                for (int k = 0; k <= n3; ++k) {
                    rfw_32.id_class(i + rfH_22.b_(), j + rfH_22.c_(), k + rfH_22.d_());
                    rfw_32.id_byte(rpr_3.DOWN, n4);
                    if ((i != 0 && i != n2 || j != 0 && j != n) && (k != 0 && k != n3 || j != 0 && j != n) && (i != 0 && i != n2 || k != 0 && k != n3) && (i == 0 || i == n2 || j == 0 || j == n || k == 0 || k == n3) && !(random.nextFloat() < 0.1f) && this.id_break(rRg_12, random, rfw_32, xc_32)) continue;
                }
            }
        }
        return true;
    }
}

