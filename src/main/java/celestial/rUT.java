/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rUf_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rja_3;
import celestial.rpr_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUT
extends rUO<rUf_1> {
    public rUT(Codec<rUf_1> codec) {
        super(codec);
    }

    private int id_class(Random random, int n) {
        return Math.round((random.nextFloat() - random.nextFloat()) * (float)n);
    }

    private boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        rfw_3 rfw_32 = new rfw_3();
        for (rpr_3 rpr_32 : rpr_3.values()) {
            rfw_32.id_class((rja_3)rfH_22, rpr_32);
            if (!rRg_12.id_byte(rfw_32).id_catch()) continue;
            return true;
        }
        return false;
    }

    private void id_class(rfw_3 rfw_32, Random random, rfH_2 rfH_22, int n) {
        int n2 = this.id_class(random, n);
        int n3 = this.id_class(random, n);
        int n4 = this.id_class(random, n);
        rfw_32.id_class(rfH_22, n2, n3, n4);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUf_1 rUf_12) {
        int n = random.nextInt(rUf_12.id_byte + 1);
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < n; ++i) {
            this.id_class(rfw_32, random, rfH_22, Math.min(i, 7));
            if (!rUf_12.id_break.id_class(rRI2.id_byte(rfw_32), random) || this.id_class(rRI2, rfw_32)) continue;
            rRI2.id_class((rfH_2)rfw_32, rUf_12.id_protected, 2);
        }
        return true;
    }
}

