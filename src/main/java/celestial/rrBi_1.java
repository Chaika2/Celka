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
import celestial.rrSO;
import celestial.rrSQ;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBi_1
extends rrSO<rrSQ> {
    public rrBi_1(Codec<rrSQ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, rrSQ rrSQ2, rfH_2 rfH_22) {
        return IntStream.range(0, 16).mapToObj(n -> {
            int n2 = n / 4;
            int n3 = n % 4;
            int n4 = n2 * 4 + 1 + random.nextInt(3) + rfH_22.b_();
            int n5 = n3 * 4 + 1 + random.nextInt(3) + rfH_22.d_();
            int n6 = reX_22.id_class(this.id_class(rrSQ2), n4, n5);
            return new rfH_2(n4, n6, n5);
        });
    }

    @Override
    protected rKv_1 id_class(rrSQ rrSQ2) {
        return rKv_1.MOTION_BLOCKING;
    }
}

