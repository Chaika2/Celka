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
import java.util.stream.Stream;

public class rrSd_1
extends rrSL<rrSQ> {
    public rrSd_1(Codec<rrSQ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rrSQ rrSQ2, rfH_2 rfH_22) {
        int n = random.nextInt(8) + 4 + rfH_22.b_();
        int n2 = random.nextInt(8) + 4 + rfH_22.d_();
        return Stream.of(new rfH_2(n, rfH_22.c_(), n2));
    }
}

