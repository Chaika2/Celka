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

public class rrSE
extends rrSL<rrSQ> {
    public rrSE(Codec<rrSQ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rrSQ rrSQ2, rfH_2 rfH_22) {
        Stream<rfH_2> stream = Stream.empty();
        if (random.nextInt(14) == 0) {
            stream = Stream.concat(stream, Stream.of(rfH_22.id_break(random.nextInt(16), 55 + random.nextInt(16), random.nextInt(16))));
            if (random.nextInt(4) == 0) {
                stream = Stream.concat(stream, Stream.of(rfH_22.id_break(random.nextInt(16), 55 + random.nextInt(16), random.nextInt(16))));
            }
            return stream;
        }
        return Stream.empty();
    }
}

