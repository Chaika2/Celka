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
import celestial.rfw_3;
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

public class rrsv_3
extends rrsN_2 {
    public static final Codec<rrsv_3> id_throws = RecordCodecBuilder.create(instance -> rrsv_3.id_class(instance).apply((Applicative)instance, rrsv_3::new));

    public rrsv_3(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    private static void id_class(rKH rKH2, Random random, rfw_3 rfw_32, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12, rfH_2 rfH_22, int n, int n2, int n3) {
        rfw_32.id_class(rfH_22, n, n2, n3);
        rrsv_3.id_class(rKH2, random, rfw_32, set, rfi_32, rDv_12);
    }

    @Override
    protected rrsA_2<?> id_class() {
        return rrsA_2.id_byte;
    }

    @Override
    public List<rrPY> id_class(rKH rKH2, Random random, int n, rfH_2 rfH_22, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        rfH_2 rfH_23 = rfH_22.id_break();
        rrsv_3.id_class(rKH2, rfH_23);
        rrsv_3.id_class(rKH2, rfH_23.id_extends());
        rrsv_3.id_class(rKH2, rfH_23.id_protected());
        rrsv_3.id_class(rKH2, rfH_23.id_protected().id_extends());
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < n; ++i) {
            rrsv_3.id_class(rKH2, random, rfw_32, set, rfi_32, rDv_12, rfH_22, 0, i, 0);
            if (i >= n - 1) continue;
            rrsv_3.id_class(rKH2, random, rfw_32, set, rfi_32, rDv_12, rfH_22, 1, i, 0);
            rrsv_3.id_class(rKH2, random, rfw_32, set, rfi_32, rDv_12, rfH_22, 1, i, 1);
            rrsv_3.id_class(rKH2, random, rfw_32, set, rfi_32, rDv_12, rfH_22, 0, i, 1);
        }
        return ImmutableList.of((Object)new rrPY(rfH_22.id_break(n), 0, true));
    }
}

