/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.reX_2;
import celestial.rfH_2;
import celestial.rrSQ;
import celestial.rrSu_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSz_1
extends rrSu_1<rrSQ> {
    public rrSz_1(Codec<rrSQ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, rrSQ rrSQ2, rfH_2 rfH_22) {
        int n = reX_22.id_break();
        int n2 = n - 5 + random.nextInt(10);
        return Stream.of(new rfH_2(rfH_22.b_(), n2, rfH_22.d_()));
    }
}

