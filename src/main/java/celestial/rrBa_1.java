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

public class rrBa_1
extends rrSL<rUJ> {
    public rrBa_1(Codec<rUJ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rUJ rUJ2, rfH_2 rfH_22) {
        return IntStream.range(0, rUJ2.id_break().id_class(random)).mapToObj(n -> rfH_22);
    }
}

