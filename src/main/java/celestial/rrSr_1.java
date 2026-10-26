/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.reX_2;
import celestial.rfH_2;
import celestial.rrSP;
import celestial.rrSu_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrSr_1
extends rrSu_1<rrSP> {
    public rrSr_1(Codec<rrSP> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, rrSP rrSP2, rfH_2 rfH_23) {
        return rrSP2.id_class().id_class(reX_22, random, rfH_23).flatMap(rfH_22 -> rrSP2.id_break().id_class(reX_22, random, (rfH_2)rfH_22));
    }
}

