/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rRq_1;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zq_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class reM_2
extends rUO<rUt_1> {
    private static final rpr_3[] id_class = rpr_3.values();

    public reM_2(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        rfw_3 rfw_32 = rfH_22.id_new();
        block0: for (int i = 64; i < 256; ++i) {
            rfw_32.id_class(rfH_22);
            rfw_32.id_byte(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
            rfw_32.b_(i);
            if (!rRI2.id_finally(rfw_32)) continue;
            for (rpr_3 rpr_32 : id_class) {
                if (rpr_32 == rpr_3.DOWN || !zq_3.id_class((rRq_1)rRI2, (rfH_2)rfw_32, rpr_32)) continue;
                rRI2.id_class((rfH_2)rfw_32, (xc_3)xu_3.BD.id_continue().id_class(zq_3.id_class(rpr_32), true), 2);
                continue block0;
            }
        }
        return true;
    }
}

