/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDo_1;
import celestial.rRg_1;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.xc_3;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class rDD
extends rDo_1 {
    public rDD(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    protected boolean id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        rfw_3 rfw_32 = rfH_22.id_new();
        int n = random.nextInt(3) + 1;
        for (int i = 0; i < n; ++i) {
            if (!this.id_break(rRg_12, random, rfw_32, xc_32)) {
                return true;
            }
            rfw_32.id_class(rpr_3.UP);
        }
        rfH_2 rfH_23 = rfw_32.id_int();
        int n2 = random.nextInt(3) + 2;
        ArrayList arrayList = Lists.newArrayList((Iterable)rpb_3.HORIZONTAL);
        Collections.shuffle(arrayList, random);
        for (rpr_3 rpr_32 : arrayList.subList(0, n2)) {
            rfw_32.id_class(rfH_23);
            rfw_32.id_class(rpr_32);
            int n3 = random.nextInt(5) + 2;
            int n4 = 0;
            for (int i = 0; i < n3 && this.id_break(rRg_12, random, rfw_32, xc_32); ++i) {
                rfw_32.id_class(rpr_3.UP);
                if (i != 0 && (++n4 < 2 || !(random.nextFloat() < 0.25f))) continue;
                rfw_32.id_class(rpr_32);
                n4 = 0;
            }
        }
        return true;
    }
}

