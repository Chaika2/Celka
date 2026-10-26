/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rHK;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rDf_1
extends rUO<rUt_1> {
    public rDf_1(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        rfj_3 rfj_32 = new rfj_3(rfH_22);
        List list = IntStream.rangeClosed(rfj_32.id_break(), rfj_32.id_protected()).boxed().collect(Collectors.toList());
        Collections.shuffle(list, random);
        List list2 = IntStream.rangeClosed(rfj_32.id_byte(), rfj_32.id_throws()).boxed().collect(Collectors.toList());
        Collections.shuffle(list2, random);
        rfw_3 rfw_32 = new rfw_3();
        for (Integer n : list) {
            for (Integer n2 : list2) {
                rfw_32.id_class(n, 0, (int)n2);
                rfH_2 rfH_23 = rRI2.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, (rfH_2)rfw_32);
                if (!rRI2.id_finally(rfH_23) && !rRI2.id_byte(rfH_23).id_extends(rRI2, rfH_23).id_break()) continue;
                rRI2.id_class(rfH_23, xu_3.re.id_continue(), 2);
                rHK.id_class(rRI2, random, rfH_23, rzl_3.id_break);
                xc_3 xc_32 = xu_3.rR.id_continue();
                for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
                    rfH_2 rfH_24 = rfH_23.id_break(rpr_32);
                    if (!xc_32.id_class(rRI2, rfH_24)) continue;
                    rRI2.id_class(rfH_24, xc_32, 2);
                }
                return true;
            }
        }
        return false;
    }
}

