/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDA;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rDz_1
extends rUO<rDA> {
    public rDz_1(Codec<rDA> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDA rDA2) {
        rfw_3 rfw_32;
        int n = this.id_class(random);
        if (!this.id_class((rRg_1)rRI2, rfH_22, n, rfw_32 = new rfw_3(), rDA2)) {
            return false;
        }
        this.id_class((rRg_1)rRI2, random, rfH_22, n, rfw_32, rDA2);
        this.id_class((rRg_1)rRI2, random, rfH_22, rDA2, n, rfw_32);
        return true;
    }

    protected abstract int id_class(int var1, int var2, int var3, int var4);

    protected abstract void id_class(rRg_1 var1, Random var2, rfH_2 var3, int var4, rfw_3 var5, rDA var6);

    protected boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, int n, rfw_3 rfw_32, rDA rDA2) {
        int n2 = rfH_22.c_();
        if (n2 >= 1 && n2 + n + 1 < 256) {
            xd_3 xd_32 = rRg_12.id_byte(rfH_22.id_break()).id_break();
            if (!rDz_1.id_break(xd_32) && !xd_32.id_class(rls_3.T)) {
                return false;
            }
            for (int i = 0; i <= n; ++i) {
                int n3 = this.id_class(-1, -1, rDA2.id_protected, i);
                for (int j = -n3; j <= n3; ++j) {
                    for (int k = -n3; k <= n3; ++k) {
                        xc_3 xc_32 = rRg_12.id_byte(rfw_32.id_class(rfH_22, j, i, k));
                        if (xc_32.id_catch() || xc_32.id_class(rls_3.id_void)) continue;
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    protected int id_class(Random random) {
        int n = random.nextInt(3) + 4;
        if (random.nextInt(12) == 0) {
            n *= 2;
        }
        return n;
    }

    protected void id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, rDA rDA2, int n, rfw_3 rfw_32) {
        for (int i = 0; i < n; ++i) {
            rfw_32.id_class(rfH_22).id_byte(rpr_3.UP, i);
            if (rRg_12.id_byte(rfw_32).id_implements(rRg_12, rfw_32)) continue;
            this.id_class(rRg_12, rfw_32, rDA2.id_byte.id_class(random, rfH_22));
        }
    }
}

