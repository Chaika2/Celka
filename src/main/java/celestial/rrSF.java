/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.reX_2;
import celestial.rfH_2;
import celestial.rrSO;
import celestial.rrSx_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class rrSF<DC extends rrSx_1>
extends rrSO<DC> {
    public rrSF(Codec<DC> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, DC DC2, rfH_2 rfH_22) {
        int n = rfH_22.b_();
        int n2 = rfH_22.d_();
        int n3 = reX_22.id_class(this.id_class(DC2), n, n2);
        return n3 > 0 ? Stream.of(new rfH_2(n, n3, n2)) : Stream.of(new rfH_2[0]);
    }
}

