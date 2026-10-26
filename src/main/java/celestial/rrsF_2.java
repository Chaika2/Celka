/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rDv_1;
import celestial.rKH;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.rrPY;
import celestial.rrsA_2;
import celestial.rrsv_3;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsF_2
extends rrsv_3 {
    public static final Codec<rrsF_2> id_case = RecordCodecBuilder.create(instance -> rrsF_2.id_class(instance).apply((Applicative)instance, rrsF_2::new));

    public rrsF_2(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    protected rrsA_2<?> id_class() {
        return rrsA_2.id_protected;
    }

    @Override
    public List<rrPY> id_class(rKH rKH2, Random random, int n, rfH_2 rfH_22, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.addAll(super.id_class(rKH2, random, n, rfH_22, set, rfi_32, rDv_12));
        for (int i = n - 2 - random.nextInt(4); i > n / 2; i -= 2 + random.nextInt(4)) {
            float f = random.nextFloat() * ((float)Math.PI * 2);
            int n2 = 0;
            int n3 = 0;
            for (int j = 0; j < 5; ++j) {
                n2 = (int)(1.5f + rfU_2.id_break(f) * (float)j);
                n3 = (int)(1.5f + rfU_2.id_class(f) * (float)j);
                rfH_2 rfH_23 = rfH_22.id_break(n2, i - 3 + j / 2, n3);
                rrsF_2.id_class(rKH2, random, rfH_23, set, rfi_32, rDv_12);
            }
            arrayList.add(new rrPY(rfH_22.id_break(n2, i, n3), -2, false));
        }
        return arrayList;
    }
}

