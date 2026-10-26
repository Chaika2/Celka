/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.kM_2;
import celestial.rDA;
import celestial.rDz_1;
import celestial.rRg_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDL
extends rDz_1 {
    public rDL(Codec<rDA> codec) {
        super(codec);
    }

    @Override
    protected void id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, int n, rfw_3 rfw_32, rDA rDA2) {
        int n2 = rDA2.id_protected;
        for (int i = -n2; i <= n2; ++i) {
            for (int j = -n2; j <= n2; ++j) {
                boolean bl;
                boolean bl2 = i == -n2;
                boolean bl3 = i == n2;
                boolean bl4 = j == -n2;
                boolean bl5 = j == n2;
                boolean bl6 = bl2 || bl3;
                boolean bl7 = bl = bl4 || bl5;
                if (bl6 && bl) continue;
                rfw_32.id_class(rfH_22, i, n, j);
                if (rRg_12.id_byte(rfw_32).id_implements(rRg_12, rfw_32)) continue;
                boolean bl8 = bl2 || bl && i == 1 - n2;
                boolean bl9 = bl3 || bl && i == n2 - 1;
                boolean bl10 = bl4 || bl6 && j == 1 - n2;
                boolean bl11 = bl5 || bl6 && j == n2 - 1;
                this.id_class(rRg_12, rfw_32, (xc_3)((xc_3)((xc_3)((xc_3)rDA2.id_break.id_class(random, rfH_22).id_class(kM_2.id_int, bl8)).id_class(kM_2.id_final, bl9)).id_class(kM_2.id_volatile, bl10)).id_class(kM_2.id_package, bl11));
            }
        }
    }

    @Override
    protected int id_class(int n, int n2, int n3, int n4) {
        return n4 <= 3 ? 0 : n3;
    }
}

