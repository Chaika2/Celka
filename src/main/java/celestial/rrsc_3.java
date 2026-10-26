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
import celestial.reS_2;
import celestial.rfH_2;
import celestial.rfi_3;
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

public class rrsc_3
extends rrsN_2 {
    public static final Codec<rrsc_3> id_throws = RecordCodecBuilder.create(instance -> rrsc_3.id_class(instance).apply((Applicative)instance, rrsc_3::new));

    public rrsc_3(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    protected rrsA_2<?> id_class() {
        return rrsA_2.id_throws;
    }

    @Override
    public List<rrPY> id_class(rKH rKH2, Random random, int n, rfH_2 rfH_22, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        int n2;
        int n3;
        ArrayList arrayList = Lists.newArrayList();
        rfH_2 rfH_23 = rfH_22.id_break();
        rrsc_3.id_class(rKH2, rfH_23);
        rrsc_3.id_class(rKH2, rfH_23.id_extends());
        rrsc_3.id_class(rKH2, rfH_23.id_protected());
        rrsc_3.id_class(rKH2, rfH_23.id_protected().id_extends());
        rpr_3 rpr_32 = rpb_3.HORIZONTAL.id_class(random);
        int n4 = n - random.nextInt(4);
        int n5 = 2 - random.nextInt(3);
        int n6 = rfH_22.b_();
        int n7 = rfH_22.c_();
        int n8 = rfH_22.d_();
        int n9 = n6;
        int n10 = n8;
        int n11 = n7 + n - 1;
        for (n3 = 0; n3 < n; ++n3) {
            rfH_2 rfH_24;
            if (n3 >= n4 && n5 > 0) {
                n9 += rpr_32.id_implements();
                n10 += rpr_32.id_extends();
                --n5;
            }
            if (!reS_2.id_protected(rKH2, rfH_24 = new rfH_2(n9, n2 = n7 + n3, n10))) continue;
            rrsc_3.id_class(rKH2, random, rfH_24, set, rfi_32, rDv_12);
            rrsc_3.id_class(rKH2, random, rfH_24.id_extends(), set, rfi_32, rDv_12);
            rrsc_3.id_class(rKH2, random, rfH_24.id_protected(), set, rfi_32, rDv_12);
            rrsc_3.id_class(rKH2, random, rfH_24.id_extends().id_protected(), set, rfi_32, rDv_12);
        }
        arrayList.add(new rrPY(new rfH_2(n9, n11, n10), 0, true));
        for (n3 = -1; n3 <= 2; ++n3) {
            for (n2 = -1; n2 <= 2; ++n2) {
                if (n3 >= 0 && n3 <= 1 && n2 >= 0 && n2 <= 1 || random.nextInt(3) > 0) continue;
                int n12 = random.nextInt(3) + 2;
                for (int i = 0; i < n12; ++i) {
                    rrsc_3.id_class(rKH2, random, new rfH_2(n6 + n3, n11 - i - 1, n8 + n2), set, rfi_32, rDv_12);
                }
                arrayList.add(new rrPY(new rfH_2(n9 + n3, n11, n10 + n2), 0, false));
            }
        }
        return arrayList;
    }
}

