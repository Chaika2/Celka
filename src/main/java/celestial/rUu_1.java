/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUu_1
extends rUO<rUt_1> {
    public rUu_1(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        if (!rRI2.id_finally(rfH_22)) {
            return false;
        }
        xc_3 xc_32 = rRI2.id_byte(rfH_22.id_final());
        if (!(xc_32.id_class(xu_3.PR) || xc_32.id_class(xu_3.PK) || xc_32.id_class(xu_3.Ju))) {
            return false;
        }
        rRI2.id_class(rfH_22, xu_3.Pa.id_continue(), 2);
        for (int i = 0; i < 1500; ++i) {
            rfH_2 rfH_23 = rfH_22.id_break(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
            if (!rRI2.id_byte(rfH_23).id_catch()) continue;
            int n = 0;
            for (rpr_3 rpr_32 : rpr_3.values()) {
                if (rRI2.id_byte(rfH_23.id_break(rpr_32)).id_class(xu_3.Pa)) {
                    ++n;
                }
                if (n > 1) break;
            }
            if (n != true) continue;
            rRI2.id_class(rfH_23, xu_3.Pa.id_continue(), 2);
        }
        return true;
    }
}

