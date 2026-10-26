/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDg_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUU;
import celestial.rfH_2;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUe_1
extends rUO<rUU> {
    public rUe_1(Codec<rUU> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUU rUU2) {
        int n = random.nextInt(rUU2.id_break.size());
        rDg_1<?, ?> rDg_12 = rUU2.id_break.get(n).get();
        return rDg_12.id_class(rRI2, rKd_12, random, rfH_22);
    }
}

