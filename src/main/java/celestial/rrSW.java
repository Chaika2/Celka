/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.reX_2;
import celestial.rfH_2;
import celestial.rrBR;
import celestial.rrSu_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSW
extends rrSu_1<rrBR> {
    public rrSW(Codec<rrBR> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, rrBR rrBR2, rfH_2 rfH_22) {
        if (random.nextInt(rrBR2.id_break) == 0) {
            int n = random.nextInt(16) + rfH_22.b_();
            int n2 = random.nextInt(16) + rfH_22.d_();
            int n3 = random.nextInt(reX_22.id_class());
            return Stream.of(new rfH_2(n, n3, n2));
        }
        return Stream.empty();
    }
}

