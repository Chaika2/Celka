/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fJ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rSg_1;
import celestial.rjV_2;
import celestial.rqO_2;
import celestial.util.ColorHelper;
import java.util.Random;

public class qx_3
extends pV_2<rSg_1> {
    public qx_3(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    public rqO_2 id_class(rSg_1 rSg_12) {
        return fJ_2.id_class;
    }

    private static void id_class(rjV_2 rjV_22, Ok_1 ok_1, float f, float f2, int n, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        ok_1.id_class(rjV_22, f + (bl ? f9 : -f9), (float)(n * 16), f2 + (bl2 ? f9 : -f9)).id_class(f5, f6, f7, 0.3f).id_class();
        ok_1.id_class(rjV_22, f3 + (bl ? f8 : -f8), (float)((n + 1) * 16), f4 + (bl2 ? f8 : -f8)).id_class(f5, f6, f7, 0.3f).id_class();
        ok_1.id_class(rjV_22, f3 + (bl3 ? f8 : -f8), (float)((n + 1) * 16), f4 + (bl4 ? f8 : -f8)).id_class(f5, f6, f7, 0.3f).id_class();
        ok_1.id_class(rjV_22, f + (bl3 ? f9 : -f9), (float)(n * 16), f2 + (bl4 ? f9 : -f9)).id_class(f5, f6, f7, 0.3f).id_class();
    }

    @Override
    public void id_class(rSg_1 rSg_12, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        float[] fArray = new float[8];
        float[] fArray2 = new float[8];
        float f3 = 0.0f;
        float f4 = 0.0f;
        Random random = new Random(rSg_12.id_class);
        for (int i = 7; i >= 0; --i) {
            fArray[i] = f3;
            fArray2[i] = f4;
            f3 += (float)(random.nextInt(11) - 5);
            f4 += (float)(random.nextInt(11) - 5);
        }
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_else());
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        for (int i = 0; i < 4; ++i) {
            Random random2 = new Random(rSg_12.id_class);
            for (int j = 0; j < 3; ++j) {
                int n2 = 7;
                int n3 = 0;
                if (j > 0) {
                    n2 = 7 - j;
                }
                if (j > 0) {
                    n3 = n2 - 2;
                }
                float f5 = fArray[n2] - f3;
                float f6 = fArray2[n2] - f4;
                for (int k = n2; k >= n3; --k) {
                    float f7 = f5;
                    float f8 = f6;
                    if (j == 0) {
                        f5 += (float)(random2.nextInt(11) - 5);
                        f6 += (float)(random2.nextInt(11) - 5);
                    } else {
                        f5 += (float)(random2.nextInt(31) - 15);
                        f6 += (float)(random2.nextInt(31) - 15);
                    }
                    float f9 = 0.5f;
                    float f10 = 0.45f;
                    float f11 = 0.45f;
                    float f12 = 0.5f;
                    float f13 = 0.1f + (float)i * 0.2f;
                    if (j == 0) {
                        f13 = (float)((double)f13 * ((double)k * 0.1 + 1.0));
                    }
                    float f14 = 0.1f + (float)i * 0.2f;
                    if (j == 0) {
                        f14 *= (float)(k - 1) * 0.1f + 1.0f;
                    }
                    int n4 = ColorHelper.id_class(0.0f, 255);
                    float f15 = (float)ColorHelper.id_byte(n4) / 255.0f;
                    float f16 = (float)ColorHelper.id_protected(n4) / 255.0f;
                    float f17 = (float)ColorHelper.id_break(n4) / 255.0f;
                    qx_3.id_class(rjV_22, ok_1, f5, f6, k, f7, f8, f15, f16, f17, f13, f14, false, false, true, false);
                    qx_3.id_class(rjV_22, ok_1, f5, f6, k, f7, f8, f15, f16, f17, f13, f14, true, false, true, true);
                    qx_3.id_class(rjV_22, ok_1, f5, f6, k, f7, f8, f15, f16, f17, f13, f14, true, true, false, true);
                    qx_3.id_class(rjV_22, ok_1, f5, f6, k, f7, f8, f15, f16, f17, f13, f14, false, true, false, false);
                }
            }
        }
    }
}

