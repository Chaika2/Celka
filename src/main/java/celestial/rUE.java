/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.aI_2;
import celestial.kK_2;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRf_1;
import celestial.rSa_1;
import celestial.rUG;
import celestial.rUM;
import celestial.rUO;
import celestial.rUb_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class rUE
extends rUO<rUM> {
    private static final LoadingCache<Long, List<rUG>> id_class = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build((CacheLoader)new rUb_1());

    public rUE(Codec<rUM> codec) {
        super(codec);
    }

    private void id_class(rRf_1 rRf_12, Random random, rUM rUM2, rUG rUG2) {
        int n = rUG2.id_byte();
        for (rfH_2 rfH_22 : rfH_2.id_class(new rfH_2(rUG2.id_class() - n, 0, rUG2.id_break() - n), new rfH_2(rUG2.id_class() + n, rUG2.id_protected() + 10, rUG2.id_break() + n))) {
            if (rfH_22.id_class(rUG2.id_class(), rfH_22.c_(), rUG2.id_break(), false) <= (double)(n * n + 1) && rfH_22.c_() < rUG2.id_protected()) {
                this.id_class(rRf_12, rfH_22, xu_3.rg.id_continue());
                continue;
            }
            if (rfH_22.c_() <= 65) continue;
            this.id_class(rRf_12, rfH_22, xu_3.id_class.id_continue());
        }
        if (rUG2.id_throws()) {
            int n2 = -2;
            int n3 = 2;
            int n4 = 3;
            rfw_3 rfw_32 = new rfw_3();
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    for (int k = 0; k <= 3; ++k) {
                        boolean bl;
                        boolean bl2 = rfU_2.id_class(i) == 2;
                        boolean bl3 = rfU_2.id_class(j) == 2;
                        boolean bl4 = bl = k == 3;
                        if (!bl2 && !bl3 && !bl) continue;
                        boolean bl5 = i == -2 || i == 2 || bl;
                        boolean bl6 = j == -2 || j == 2 || bl;
                        xc_3 xc_32 = (xc_3)((xc_3)((xc_3)((xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_volatile, bl5 && j != -2)).id_class(kK_2.id_package, bl5 && j != 2)).id_class(kK_2.id_int, bl6 && i != -2)).id_class(kK_2.id_final, bl6 && i != 2);
                        this.id_class(rRf_12, rfw_32.id_class(rUG2.id_class() + i, rUG2.id_protected() + k, rUG2.id_break() + j), xc_32);
                    }
                }
            }
        }
        rSa_1 rSa_12 = aI_2.id_super.id_class(rRf_12.id_byte());
        rSa_12.id_class(rUM2.id_protected());
        rSa_12.id_catch(rUM2.id_break());
        rSa_12.id_class((double)rUG2.id_class() + 0.5, (double)(rUG2.id_protected() + 1), (double)rUG2.id_break() + 0.5, random.nextFloat() * 360.0f, 0.0f);
        rRf_12.a_(rSa_12);
        this.id_class(rRf_12, new rfH_2(rUG2.id_class(), rUG2.id_protected(), rUG2.id_break()), xu_3.id_while.id_continue());
    }

    public static List<rUG> id_class(rRI rRI2) {
        Random random = new Random(rRI2.id_break());
        long l = random.nextLong() & 0xFFFFL;
        return (List)id_class.getUnchecked((Object)l);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUM rUM2) {
        List<rUG> list = rUM2.id_byte();
        if (list.isEmpty()) {
            list = rUE.id_class(rRI2);
        }
        for (rUG rUG2 : list) {
            if (!rUG2.id_class(rfH_22)) continue;
            this.id_class(rRI2, random, rUM2, rUG2);
        }
        return true;
    }
}

