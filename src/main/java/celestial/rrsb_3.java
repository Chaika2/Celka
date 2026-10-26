/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rYG;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.rrsE_2;
import celestial.rrsG_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrsb_3
extends rrsE_2<rrsG_2> {
    public rrsb_3(Codec<rrsG_2> codec) {
        super(codec);
    }

    @Override
    public void id_class(Random random, roC_2 roC_22, rYG rYG2, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, int n4, long l, rrsG_2 rrsG_22) {
        double d2 = rYG.id_case.id_class((double)n * 0.25, (double)n2 * 0.25, false);
        if (d2 > 0.0) {
            int n5 = n & 0xF;
            int n6 = n2 & 0xF;
            rfw_3 rfw_32 = new rfw_3();
            for (int i = n3; i >= 0; --i) {
                rfw_32.id_class(n5, i, n6);
                if (roC_22.id_byte(rfw_32).id_catch()) continue;
                if (i != 62 || roC_22.id_byte(rfw_32).id_class(xc_33.id_break())) break;
                roC_22.id_class(rfw_32, xc_33, false);
                break;
            }
        }
        rrsE_2.id_synchronized.id_class(random, roC_22, rYG2, n, n2, n3, d, xc_32, xc_33, n4, l, rrsG_22);
    }
}

