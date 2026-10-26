/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDq_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rfH_2;
import celestial.xd_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDl_1
extends rUO<rDq_1> {
    public rDl_1(Codec<rDq_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDq_1 rDq_12) {
        while (true) {
            xd_3 xd_32;
            if (rfH_22.c_() <= 3 || !rRI2.id_finally(rfH_22.id_break()) && (rDl_1.id_break(xd_32 = rRI2.id_byte(rfH_22.id_break()).id_break()) || rDl_1.id_class(xd_32))) {
                if (rfH_22.c_() <= 3) {
                    return false;
                }
                for (int i = 0; i < 3; ++i) {
                    int n = random.nextInt(2);
                    int n2 = random.nextInt(2);
                    int n3 = random.nextInt(2);
                    float f = (float)(n + n2 + n3) * 0.333f + 0.5f;
                    for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22.id_break(-n, -n2, -n3), rfH_22.id_break(n, n2, n3))) {
                        if (!(rfH_23.id_private(rfH_22) <= (double)(f * f))) continue;
                        rRI2.id_class(rfH_23, rDq_12.id_break, 4);
                    }
                    rfH_22 = rfH_22.id_break(-1 + random.nextInt(2), -random.nextInt(2), -1 + random.nextInt(2));
                }
                return true;
            }
            rfH_22 = rfH_22.id_break();
        }
    }
}

