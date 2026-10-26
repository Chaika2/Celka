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
import celestial.rfi_3;
import celestial.rfw_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrPY;
import celestial.rrsA_2;
import celestial.rrsN_2;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsZ_2
extends rrsN_2 {
    public static final Codec<rrsZ_2> id_throws = RecordCodecBuilder.create(instance -> rrsZ_2.id_class(instance).apply((Applicative)instance, rrsZ_2::new));

    public rrsZ_2(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    protected rrsA_2<?> id_class() {
        return rrsA_2.id_break;
    }

    @Override
    public List<rrPY> id_class(rKH rKH2, Random random, int n, rfH_2 rfH_22, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        int n2;
        rrsZ_2.id_class(rKH2, rfH_22.id_break());
        ArrayList arrayList = Lists.newArrayList();
        rpr_3 rpr_32 = rpb_3.HORIZONTAL.id_class(random);
        int n3 = n - random.nextInt(4) - 1;
        int n4 = 3 - random.nextInt(3);
        rfw_3 rfw_32 = new rfw_3();
        int n5 = rfH_22.b_();
        int n6 = rfH_22.d_();
        int n7 = 0;
        for (int i = 0; i < n; ++i) {
            n2 = rfH_22.c_() + i;
            if (i >= n3 && n4 > 0) {
                n5 += rpr_32.id_implements();
                n6 += rpr_32.id_extends();
                --n4;
            }
            if (!rrsZ_2.id_class(rKH2, random, (rfH_2)rfw_32.id_class(n5, n2, n6), set, rfi_32, rDv_12)) continue;
            n7 = n2 + 1;
        }
        arrayList.add(new rrPY(new rfH_2(n5, n7, n6), 1, false));
        n5 = rfH_22.b_();
        n6 = rfH_22.d_();
        rpr_3 rpr_33 = rpb_3.HORIZONTAL.id_class(random);
        if (rpr_33 != rpr_32) {
            n2 = n3 - random.nextInt(2) - 1;
            int n8 = 1 + random.nextInt(3);
            n7 = 0;
            for (int i = n2; i < n && n8 > 0; ++i, --n8) {
                if (i < 1) continue;
                int n9 = rfH_22.c_() + i;
                if (!rrsZ_2.id_class(rKH2, random, (rfH_2)rfw_32.id_class(n5 += rpr_33.id_implements(), n9, n6 += rpr_33.id_extends()), set, rfi_32, rDv_12)) continue;
                n7 = n9 + 1;
            }
            if (n7 > 1) {
                arrayList.add(new rrPY(new rfH_2(n5, n7, n6), 0, false));
            }
        }
        return arrayList;
    }
}

