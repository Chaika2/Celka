/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.rqR_2;
import celestial.rrMB;
import celestial.rrko_1;

public class fz_3 {
    private static final float[] id_class = rqR_2.id_class(new float[256], fArray -> {
        for (int i = 0; i < ((float[])fArray).length; ++i) {
            fArray[i] = (float)Math.pow((float)i / 255.0f, 2.2);
        }
    });

    private static int id_class(int n, int n2, int n3, int n4, int n5) {
        float f = fz_3.id_class(n >> n5);
        float f2 = fz_3.id_class(n2 >> n5);
        float f3 = fz_3.id_class(n3 >> n5);
        float f4 = fz_3.id_class(n4 >> n5);
        float f5 = (float)((double)((float)Math.pow((double)(f + f2 + f3 + f4) * 0.25, 0.45454545454545453)));
        return (int)((double)f5 * 255.0);
    }

    private static float id_class(int n) {
        return id_class[n & 0xFF];
    }

    public static fN_2[] id_class(fN_2 fN_22, int n) {
        return fz_3.id_class(fN_22, n, null);
    }

    private static int id_class(int n, int n2, int n3, int n4, boolean bl) {
        return rrMB.id_class(n, n2, n3, n4);
    }

    public static fN_2[] id_class(fN_2 fN_22, int n, rrko_1 rrko_12) {
        fN_2[] fN_2Array = new fN_2[n + 1];
        fN_2Array[0] = fN_22;
        if (n > 0) {
            boolean bl = false;
            for (int i = 1; i <= n; ++i) {
                fN_2 fN_23 = fN_2Array[i - 1];
                fN_2 fN_24 = new fN_2(fN_23.id_class() >> 1, fN_23.id_break() >> 1, false);
                int n2 = fN_24.id_class();
                int n3 = fN_24.id_break();
                for (int j = 0; j < n2; ++j) {
                    for (int k = 0; k < n3; ++k) {
                        if (rrko_12 != null) {
                            fN_24.id_class(j, k, rrko_12.id_class(fN_23.id_class(j * 2 + 0, k * 2 + 0), fN_23.id_class(j * 2 + 1, k * 2 + 0), fN_23.id_class(j * 2 + 0, k * 2 + 1), fN_23.id_class(j * 2 + 1, k * 2 + 1)));
                            continue;
                        }
                        fN_24.id_class(j, k, fz_3.id_class(fN_23.id_class(j * 2 + 0, k * 2 + 0), fN_23.id_class(j * 2 + 1, k * 2 + 0), fN_23.id_class(j * 2 + 0, k * 2 + 1), fN_23.id_class(j * 2 + 1, k * 2 + 1), bl));
                    }
                }
                fN_2Array[i] = fN_24;
            }
        }
        return fN_2Array;
    }
}

