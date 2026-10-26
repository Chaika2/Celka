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

public class rrSn_1
extends rrSL<rrSQ> {
    public rrSn_1(Codec<rrSQ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rrSQ rrSQ2, rfH_2 rfH_22) {
        int n = random.nextInt(16) + rfH_22.b_();
        int n2 = random.nextInt(16) + rfH_22.d_();
        int n3 = rfH_22.c_();
        return Stream.of(new rfH_2(n, n3, n2));
    }
}

