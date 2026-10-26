/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rYG;
import celestial.reX_2;
import celestial.rfH_2;
import celestial.rrSN;
import celestial.rrSu_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBe_1
extends rrSu_1<rrSN> {
    public rrBe_1(Codec<rrSN> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, rrSN rrSN2, rfH_2 rfH_22) {
        double d = rYG.id_case.id_class((double)rfH_22.b_() / 200.0, (double)rfH_22.d_() / 200.0, false);
        int n2 = d < rrSN2.id_break ? rrSN2.id_byte : rrSN2.id_protected;
        return IntStream.range(0, n2).mapToObj(n -> rfH_22);
    }
}

