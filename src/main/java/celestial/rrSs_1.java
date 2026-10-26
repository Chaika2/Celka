/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKv_1;
import celestial.reX_2;
import celestial.rfH_2;
import celestial.rrSQ;
import celestial.rrSu_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSs_1
extends rrSu_1<rrSQ> {
    public rrSs_1(Codec<rrSQ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, rrSQ rrSQ2, rfH_2 rfH_22) {
        int n;
        int n2;
        int n3;
        if (random.nextInt(700) == 0 && (n3 = reX_22.id_class(rKv_1.MOTION_BLOCKING, n2 = random.nextInt(16) + rfH_22.b_(), n = random.nextInt(16) + rfH_22.d_())) > 0) {
            int n4 = n3 + 3 + random.nextInt(7);
            return Stream.of(new rfH_2(n2, n4, n));
        }
        return Stream.empty();
    }
}

