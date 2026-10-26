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
import celestial.reE_2;
import celestial.rfH_2;
import com.mojang.serialization.Codec;
import java.util.Random;

public class reG_2
extends rUO<reE_2> {
    public reG_2(Codec<reE_2> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, reE_2 reE_22) {
        boolean bl = random.nextBoolean();
        return bl ? reE_22.id_break.get().id_class(rRI2, rKd_12, random, rfH_22) : reE_22.id_byte.get().id_class(rRI2, rKd_12, random, rfH_22);
    }
}

