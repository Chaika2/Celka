/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rfH_2;
import celestial.rrSB;
import celestial.rrSL;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSS
extends rrSL<rrSB> {
    public rrSS(Codec<rrSB> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rrSB rrSB2, rfH_2 rfH_22) {
        int n = rrSB2.id_break;
        int n2 = rrSB2.id_byte;
        int n3 = rfH_22.b_();
        int n4 = rfH_22.d_();
        int n5 = random.nextInt(n2) + random.nextInt(n2) - n2 + n;
        return Stream.of(new rfH_2(n3, n5, n4));
    }
}

