/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rUJ;
import celestial.rfH_2;
import celestial.rrSL;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrSb_1
extends rrSL<rUJ> {
    public rrSb_1(Codec<rUJ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rUJ rUJ2, rfH_2 rfH_22) {
        return IntStream.range(0, random.nextInt(random.nextInt(rUJ2.id_break().id_class(random)) + 1)).mapToObj(n -> {
            int n2 = random.nextInt(16) + rfH_22.b_();
            int n3 = random.nextInt(16) + rfH_22.d_();
            int n4 = random.nextInt(120) + 4;
            return new rfH_2(n2, n4, n3);
        });
    }
}

