/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 */
package celestial;

import celestial.rfU_2;
import celestial.rjU_2;
import celestial.ryU_2;
import javax.annotation.Nonnull;

public class ryD_2 {
    private static final double[] id_class = new double[]{0.0, 1.0, 4.0, 6.0, 4.0, 1.0, 0.0};

    @Nonnull
    public static rjU_2 id_class(rjU_2 rjU_22, ryU_2 ryU_22) {
        int n = rfU_2.id_byte(rjU_22.id_class());
        int n2 = rfU_2.id_byte(rjU_22.id_break());
        int n3 = rfU_2.id_byte(rjU_22.id_byte());
        double d = rjU_22.id_class() - (double)n;
        double d2 = rjU_22.id_break() - (double)n2;
        double d3 = rjU_22.id_byte() - (double)n3;
        double d4 = 0.0;
        rjU_2 rjU_23 = rjU_2.id_class;
        for (int i = 0; i < 6; ++i) {
            double d5 = rfU_2.id_protected(d, id_class[i + 1], id_class[i]);
            int n4 = n - 2 + i;
            for (int j = 0; j < 6; ++j) {
                double d6 = rfU_2.id_protected(d2, id_class[j + 1], id_class[j]);
                int n5 = n2 - 2 + j;
                for (int k = 0; k < 6; ++k) {
                    double d7 = rfU_2.id_protected(d3, id_class[k + 1], id_class[k]);
                    int n6 = n3 - 2 + k;
                    double d8 = d5 * d6 * d7;
                    d4 += d8;
                    rjU_23 = rjU_23.id_throws(ryU_22.fetch(n4, n5, n6).id_class(d8));
                }
            }
        }
        return rjU_23.id_class(1.0 / d4);
    }
}

