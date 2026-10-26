/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rYG;
import celestial.rfH_2;
import celestial.rrSH;
import celestial.rrSL;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rrBU
extends rrSL<rrSH> {
    public rrBU(Codec<rrSH> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rrSH rrSH2, rfH_2 rfH_22) {
        double d = rYG.id_case.id_class((double)rfH_22.b_() / rrSH2.id_byte, (double)rfH_22.d_() / rrSH2.id_byte, false);
        int n2 = (int)Math.ceil((d + rrSH2.id_protected) * (double)rrSH2.id_break);
        return IntStream.range(0, n2).mapToObj(n -> rfH_22);
    }
}

