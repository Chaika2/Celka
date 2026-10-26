/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.reX_2;
import celestial.rfH_2;
import celestial.rrSu_1;
import celestial.rrSx_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class rrSL<DC extends rrSx_1>
extends rrSu_1<DC> {
    public rrSL(Codec<DC> codec) {
        super(codec);
    }

    @Override
    public final Stream<rfH_2> id_class(reX_2 reX_22, Random random, DC DC2, rfH_2 rfH_22) {
        return this.id_class(random, DC2, rfH_22);
    }

    protected abstract Stream<rfH_2> id_class(Random var1, DC var2, rfH_2 var3);
}

