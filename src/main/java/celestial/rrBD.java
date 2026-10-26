/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKv_1;
import celestial.rUJ;
import celestial.reX_2;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rrSu_1;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class rrBD
extends rrSu_1<rUJ> {
    public rrBD(Codec<rUJ> codec) {
        super(codec);
    }

    private static boolean id_class(xc_3 xc_32) {
        return xc_32.id_catch() || xc_32.id_class(xu_3.id_try) || xc_32.id_class(xu_3.id_instanceof);
    }

    private static int id_class(reX_2 reX_22, int n, int n2, int n3, int n4) {
        rfw_3 rfw_32 = new rfw_3(n, n2, n3);
        int n5 = 0;
        xc_3 xc_32 = reX_22.id_class(rfw_32);
        for (int i = n2; i >= 1; --i) {
            rfw_32.b_(i - 1);
            xc_3 xc_33 = reX_22.id_class(rfw_32);
            if (!rrBD.id_class(xc_33) && rrBD.id_class(xc_32) && !xc_33.id_class(xu_3.id_while)) {
                if (n5 == n4) {
                    return rfw_32.c_() + 1;
                }
                ++n5;
            }
            xc_32 = xc_33;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, rUJ rUJ2, rfH_2 rfH_22) {
        boolean bl;
        ArrayList arrayList = Lists.newArrayList();
        int n = 0;
        do {
            bl = false;
            for (int i = 0; i < rUJ2.id_break().id_class(random); ++i) {
                int n2;
                int n3;
                int n4 = random.nextInt(16) + rfH_22.b_();
                int n5 = rrBD.id_class(reX_22, n4, n3 = reX_22.id_class(rKv_1.MOTION_BLOCKING, n4, n2 = random.nextInt(16) + rfH_22.d_()), n2, n);
                if (n5 == Integer.MAX_VALUE) continue;
                arrayList.add(new rfH_2(n4, n5, n2));
                bl = true;
            }
            ++n;
        } while (bl);
        return arrayList.stream();
    }
}

