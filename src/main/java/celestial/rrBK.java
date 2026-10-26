/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rfH_2;
import celestial.rrBj_1;
import celestial.rrSL;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBK
extends rrSL<rrBj_1> {
    public rrBK(Codec<rrBj_1> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rrBj_1 rrBj_12, rfH_2 rfH_22) {
        int n2 = rrBj_12.id_break + (random.nextFloat() < rrBj_12.id_byte ? rrBj_12.id_protected : 0);
        return IntStream.range(0, n2).mapToObj(n -> rfH_22);
    }
}

