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

public class rDn_1
extends rDz_1 {
    public rDn_1(Codec<rDA> codec) {
        super(codec);
    }

    @Override
    protected void id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, int n, rfw_3 rfw_32, rDA rDA2) {
        for (int i = n - 3; i <= n; ++i) {
            int n2 = i < n ? rDA2.id_protected : rDA2.id_protected - 1;
            int n3 = rDA2.id_protected - 2;
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n2; k <= n2; ++k) {
                    boolean bl;
                    boolean bl2 = j == -n2;
                    boolean bl3 = j == n2;
                    boolean bl4 = k == -n2;
                    boolean bl5 = k == n2;
                    boolean bl6 = bl2 || bl3;
                    boolean bl7 = bl = bl4 || bl5;
                    if (i < n && bl6 == bl) continue;
                    rfw_32.id_class(rfH_22, j, i, k);
                    if (rRg_12.id_byte(rfw_32).id_implements(rRg_12, rfw_32)) continue;
                    this.id_class(rRg_12, rfw_32, (xc_3)((xc_3)((xc_3)((xc_3)((xc_3)rDA2.id_break.id_class(random, rfH_22).id_class(kM_2.id_new, i >= n - 1)).id_class(kM_2.id_int, j < -n3)).id_class(kM_2.id_final, j > n3)).id_class(kM_2.id_volatile, k < -n3)).id_class(kM_2.id_package, k > n3));
                }
            }
        }
    }

    @Override
    protected int id_class(int n, int n2, int n3, int n4) {
        int n5 = 0;
        if (n4 < n2 && n4 >= n2 - 3) {
            n5 = n3;
        } else if (n4 == n2) {
            n5 = n3;
        }
        return n5;
    }
}

