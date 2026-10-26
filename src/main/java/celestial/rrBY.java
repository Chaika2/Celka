/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rfH_2;
import celestial.rrBR;
import celestial.rrSL;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrBY
extends rrSL<rrBR> {
    public rrBY(Codec<rrBR> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rrBR rrBR2, rfH_2 rfH_22) {
        return random.nextFloat() < 1.0f / (float)rrBR2.id_break ? Stream.of(rfH_22) : Stream.empty();
    }
}

