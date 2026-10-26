/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rUJ;
import celestial.rfH_2;
import celestial.rrSL;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class rrSG
extends rrSL<rUJ> {
    public rrSG(Codec<rUJ> codec) {
        super(codec);
    }

    @Override
    public Stream<rfH_2> id_class(Random random, rUJ rUJ2, rfH_2 rfH_22) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < random.nextInt(random.nextInt(rUJ2.id_break().id_class(random)) + 1) + 1; ++i) {
            int n = random.nextInt(16) + rfH_22.b_();
            int n2 = random.nextInt(16) + rfH_22.d_();
            int n3 = random.nextInt(120) + 4;
            arrayList.add(new rfH_2(n, n3, n2));
        }
        return arrayList.stream();
    }
}

