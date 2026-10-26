/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.Wy_1;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rUJ;
import celestial.rUO;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUD
extends rUO<rUJ> {
    public rUD(Codec<rUJ> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUJ rUJ2) {
        int n = 0;
        int n2 = rUJ2.id_break().id_class(random);
        for (int i = 0; i < n2; ++i) {
            int n3 = random.nextInt(8) - random.nextInt(8);
            int n4 = random.nextInt(8) - random.nextInt(8);
            int n5 = rRI2.id_class(rKv_1.OCEAN_FLOOR, rfH_22.b_() + n3, rfH_22.d_() + n4);
            rfH_2 rfH_23 = new rfH_2(rfH_22.b_() + n3, n5, rfH_22.d_() + n4);
            xc_3 xc_32 = (xc_3)xu_3.hr.id_continue().id_class(Wy_1.id_volatile, random.nextInt(4) + 1);
            if (!rRI2.id_byte(rfH_23).id_class(xu_3.id_try) || !xc_32.id_class(rRI2, rfH_23)) continue;
            rRI2.id_class(rfH_23, xc_32, 2);
            ++n;
        }
        return n > 0;
    }
}

