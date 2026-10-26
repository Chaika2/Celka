/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rfH_2;
import celestial.rrSL;
import celestial.rrSQ;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrSM
extends rrSL<rrSQ> {
    public rrSM(Codec<rrSQ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rrSQ rrSQ2, rfH_2 rfH_22) {
        int n2 = 3 + random.nextInt(6);
        return IntStream.range(0, n2).mapToObj(n -> {
            int n2 = random.nextInt(16) + rfH_22.b_();
            int n3 = random.nextInt(16) + rfH_22.d_();
            int n4 = random.nextInt(28) + 4;
            return new rfH_2(n2, n4, n3);
        });
    }
}

