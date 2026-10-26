/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDT;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDp_1
extends rUO<rDT> {
    public rDp_1(Codec<rDT> codec) {
        super(codec);
    }

    private void id_class(rRg_1 rRg_12, rfH_2 rfH_22, Random random, rDT rDT2) {
        if (rRg_12.id_finally(rfH_22) && this.id_class(rRg_12, rfH_22, random)) {
            rRg_12.id_class(rfH_22, rDT2.id_break.id_class(random, rfH_22), 4);
        }
    }

    private boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, Random random) {
        rfH_2 rfH_23 = rfH_22.id_break();
        xc_3 xc_32 = rRg_12.id_byte(rfH_23);
        return xc_32.id_class(xu_3.bt) ? random.nextBoolean() : xc_32.id_protected(rRg_12, rfH_23, rpr_3.UP);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDT rDT2) {
        if (rfH_22.c_() < 5) {
            return false;
        }
        int n = 2 + random.nextInt(2);
        int n2 = 2 + random.nextInt(2);
        for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22.id_break(-n, 0, -n2), rfH_22.id_break(n, 1, n2))) {
            int n3;
            int n4 = rfH_22.b_() - rfH_23.b_();
            if ((float)(n4 * n4 + (n3 = rfH_22.d_() - rfH_23.d_()) * n3) <= random.nextFloat() * 10.0f - random.nextFloat() * 6.0f) {
                this.id_class(rRI2, rfH_23, random, rDT2);
                continue;
            }
            if (!((double)random.nextFloat() < 0.031)) continue;
            this.id_class(rRI2, rfH_23, random, rDT2);
        }
        return true;
    }
}

