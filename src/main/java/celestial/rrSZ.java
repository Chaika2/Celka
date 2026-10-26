/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rfH_2;
import celestial.rrSL;
import celestial.rrSl_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSZ
extends rrSL<rrSl_1> {
    public rrSZ(Codec<rrSl_1> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rrSl_1 rrSl_12, rfH_2 rfH_22) {
        int n = rfH_22.b_();
        int n2 = rfH_22.d_();
        int n3 = random.nextInt(rrSl_12.id_protected - rrSl_12.id_byte) + rrSl_12.id_break;
        return Stream.of(new rfH_2(n, n3, n2));
    }
}

