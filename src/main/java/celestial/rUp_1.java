/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDR;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUy_1;
import celestial.rfH_2;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUp_1
extends rUO<rUy_1> {
    public rUp_1(Codec<rUy_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUy_1 rUy_12) {
        for (rDR rDR2 : rUy_12.id_break) {
            if (!(random.nextFloat() < rDR2.id_byte)) continue;
            return rDR2.id_class(rRI2, rKd_12, random, rfH_22);
        }
        return rUy_12.id_byte.get().id_class(rRI2, rKd_12, random, rfH_22);
    }
}

