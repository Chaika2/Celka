/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.reX_2;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rrBg_1;
import celestial.rrSu_1;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBV
extends rrSu_1<rrBg_1> {
    public rrBV(Codec<rrBg_1> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, rrBg_1 rrBg_12, rfH_2 rfH_22) {
        rfj_3 rfj_32 = new rfj_3(rfH_22);
        BitSet bitSet = reX_22.id_class(rfj_32, rrBg_12.id_break);
        return IntStream.range(0, bitSet.length()).filter(n -> bitSet.get(n) && random.nextFloat() < rrBg_12.id_byte).mapToObj(n -> {
            int n2 = n & 0xF;
            int n3 = n >> 4 & 0xF;
            int n4 = n >> 8;
            return new rfH_2(rfj_32.id_break() + n2, n4, rfj_32.id_byte() + n3);
        });
    }
}

