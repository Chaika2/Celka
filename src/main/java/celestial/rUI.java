/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rUf_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;

public class rUI
extends rUO<rUf_1> {
    public rUI(Codec<rUf_1> codec) {
        super(codec);
    }

    protected boolean id_class(rRg_1 rRg_12, Random random, rUf_1 rUf_12, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2, int n3, int n4, int n5) {
        double d7;
        double d8;
        double d9;
        double d10;
        int n6;
        int n7 = 0;
        BitSet bitSet = new BitSet(n4 * n5 * n4);
        rfw_3 rfw_32 = new rfw_3();
        int n8 = rUf_12.id_byte;
        double[] dArray = new double[n8 * 4];
        for (n6 = 0; n6 < n8; ++n6) {
            float f = (float)n6 / (float)n8;
            d10 = rfU_2.id_protected((double)f, d, d2);
            d9 = rfU_2.id_protected((double)f, d5, d6);
            d8 = rfU_2.id_protected((double)f, d3, d4);
            d7 = random.nextDouble() * (double)n8 / 16.0;
            double d11 = ((double)(rfU_2.id_class((float)Math.PI * f) + 1.0f) * d7 + 1.0) / 2.0;
            dArray[n6 * 4 + 0] = d10;
            dArray[n6 * 4 + 1] = d9;
            dArray[n6 * 4 + 2] = d8;
            dArray[n6 * 4 + 3] = d11;
        }
        for (n6 = 0; n6 < n8 - 1; ++n6) {
            if (dArray[n6 * 4 + 3] <= 0.0) continue;
            for (int i = n6 + 1; i < n8; ++i) {
                if (dArray[i * 4 + 3] <= 0.0 || !((d7 = dArray[n6 * 4 + 3] - dArray[i * 4 + 3]) * d7 > (d10 = dArray[n6 * 4 + 0] - dArray[i * 4 + 0]) * d10 + (d9 = dArray[n6 * 4 + 1] - dArray[i * 4 + 1]) * d9 + (d8 = dArray[n6 * 4 + 2] - dArray[i * 4 + 2]) * d8)) continue;
                if (d7 > 0.0) {
                    dArray[i * 4 + 3] = -1.0;
                    continue;
                }
                dArray[n6 * 4 + 3] = -1.0;
            }
        }
        for (n6 = 0; n6 < n8; ++n6) {
            double d12 = dArray[n6 * 4 + 3];
            if (d12 < 0.0) continue;
            double d13 = dArray[n6 * 4 + 0];
            double d14 = dArray[n6 * 4 + 1];
            double d15 = dArray[n6 * 4 + 2];
            int n9 = Math.max(rfU_2.id_byte(d13 - d12), n);
            int n10 = Math.max(rfU_2.id_byte(d14 - d12), n2);
            int n11 = Math.max(rfU_2.id_byte(d15 - d12), n3);
            int n12 = Math.max(rfU_2.id_byte(d13 + d12), n9);
            int n13 = Math.max(rfU_2.id_byte(d14 + d12), n10);
            int n14 = Math.max(rfU_2.id_byte(d15 + d12), n11);
            for (int i = n9; i <= n12; ++i) {
                double d16 = ((double)i + 0.5 - d13) / d12;
                if (!(d16 * d16 < 1.0)) continue;
                for (int j = n10; j <= n13; ++j) {
                    double d17 = ((double)j + 0.5 - d14) / d12;
                    if (!(d16 * d16 + d17 * d17 < 1.0)) continue;
                    for (int k = n11; k <= n14; ++k) {
                        int n15;
                        double d18 = ((double)k + 0.5 - d15) / d12;
                        if (!(d16 * d16 + d17 * d17 + d18 * d18 < 1.0) || bitSet.get(n15 = i - n + (j - n2) * n4 + (k - n3) * n4 * n5)) continue;
                        bitSet.set(n15);
                        rfw_32.id_class(i, j, k);
                        if (!rUf_12.id_break.id_class(rRg_12.id_byte(rfw_32), random)) continue;
                        rRg_12.id_class((rfH_2)rfw_32, rUf_12.id_protected, 2);
                        ++n7;
                    }
                }
            }
        }
        return n7 > 0;
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUf_1 rUf_12) {
        float f = random.nextFloat() * (float)Math.PI;
        float f2 = (float)rUf_12.id_byte / 8.0f;
        int n = rfU_2.id_case(((float)rUf_12.id_byte / 16.0f * 2.0f + 1.0f) / 2.0f);
        double d = (double)rfH_22.b_() + Math.sin(f) * (double)f2;
        double d2 = (double)rfH_22.b_() - Math.sin(f) * (double)f2;
        double d3 = (double)rfH_22.d_() + Math.cos(f) * (double)f2;
        double d4 = (double)rfH_22.d_() - Math.cos(f) * (double)f2;
        int n2 = 2;
        double d5 = rfH_22.c_() + random.nextInt(3) - 2;
        double d6 = rfH_22.c_() + random.nextInt(3) - 2;
        int n3 = rfH_22.b_() - rfU_2.id_case(f2) - n;
        int n4 = rfH_22.c_() - 2 - n;
        int n5 = rfH_22.d_() - rfU_2.id_case(f2) - n;
        int n6 = 2 * (rfU_2.id_case(f2) + n);
        int n7 = 2 * (2 + n);
        for (int i = n3; i <= n3 + n6; ++i) {
            for (int j = n5; j <= n5 + n6; ++j) {
                if (n4 > rRI2.id_class(rKv_1.OCEAN_FLOOR_WG, i, j)) continue;
                return this.id_class(rRI2, random, rUf_12, d, d2, d3, d4, d5, d6, n3, n4, n5, n6, n7);
            }
        }
        return false;
    }
}

