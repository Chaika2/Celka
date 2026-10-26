/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rDv_1;
import celestial.rKH;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rrPY;
import celestial.rrsA_2;
import celestial.rrsN_2;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsL_2
extends rrsN_2 {
    public static final Codec<rrsL_2> id_throws = RecordCodecBuilder.create(instance -> rrsL_2.id_class(instance).apply((Applicative)instance, rrsL_2::new));

    public rrsL_2(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    protected rrsA_2<?> id_class() {
        return rrsA_2.id_class;
    }

    @Override
    public List<rrPY> id_class(rKH rKH2, Random random, int n, rfH_2 rfH_22, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        rrsL_2.id_class(rKH2, rfH_22.id_break());
        for (int i = 0; i < n; ++i) {
            rrsL_2.id_class(rKH2, random, rfH_22.id_break(i), set, rfi_32, rDv_12);
        }
        return ImmutableList.of((Object)new rrPY(rfH_22.id_break(n), 0, false));
    }
}

