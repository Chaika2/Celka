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
import celestial.rqR_2;
import celestial.xc_3;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class rDY
extends rDo_1 {
    public rDY(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    protected boolean id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        if (!this.id_break(rRg_12, random, rfH_22, xc_32)) {
            return false;
        }
        rpr_3 rpr_32 = rpb_3.HORIZONTAL.id_class(random);
        int n = random.nextInt(2) + 2;
        ArrayList arrayList = Lists.newArrayList((Object[])new rpr_3[]{rpr_32, rpr_32.id_catch(), rpr_32.id_private()});
        Collections.shuffle(arrayList, random);
        block0: for (rpr_3 rpr_33 : arrayList.subList(0, n)) {
            int n2;
            int n3;
            rpr_3 rpr_34;
            rfw_3 rfw_32 = rfH_22.id_new();
            int n4 = random.nextInt(2) + 1;
            rfw_32.id_class(rpr_33);
            if (rpr_33 == rpr_32) {
                rpr_34 = rpr_32;
                n3 = random.nextInt(3) + 2;
            } else {
                rfw_32.id_class(rpr_3.UP);
                rpr_3[] rpr_3Array = new rpr_3[]{rpr_33, rpr_3.UP};
                rpr_34 = rqR_2.id_class(rpr_3Array, random);
                n3 = random.nextInt(3) + 3;
            }
            for (n2 = 0; n2 < n4 && this.id_break(rRg_12, random, rfw_32, xc_32); ++n2) {
                rfw_32.id_class(rpr_34);
            }
            rfw_32.id_class(rpr_34.id_case());
            rfw_32.id_class(rpr_3.UP);
            for (n2 = 0; n2 < n3; ++n2) {
                rfw_32.id_class(rpr_32);
                if (!this.id_break(rRg_12, random, rfw_32, xc_32)) continue block0;
                if (!(random.nextFloat() < 0.25f)) continue;
                rfw_32.id_class(rpr_3.UP);
            }
        }
        return true;
    }
}

