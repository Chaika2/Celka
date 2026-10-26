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
import celestial.xg_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDj_1
extends rUO<rUt_1> {
    public rDj_1(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        if (rRI2.id_finally(rfH_22) && rRI2.id_byte(rfH_22.id_break()).id_class(xu_3.Sh)) {
            xg_3.id_class(rRI2, rfH_22, random, 8);
            return true;
        }
        return false;
    }
}

