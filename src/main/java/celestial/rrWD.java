/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjV_2;

public class rrWD {
    public static final float id_class = (float)Math.PI;
    public static final float id_break = (float)Math.PI * 2;
    public static final float id_byte = 1.5707964f;
    private static final float[] id_protected;

    public static float id_byte(float f) {
        return f * 180.0f / rfU_2.id_break;
    }

    static {
        int n;
        id_protected = new float[65536];
        for (n = 0; n < 65536; ++n) {
            rrWD.id_protected[n] = (float)Math.asin((double)n / 32767.5 - 1.0);
        }
        for (n = -1; n < 2; ++n) {
            rrWD.id_protected[(int)(((double)n + 1.0) * 32767.5) & 0xFFFF] = (float)Math.asin(n);
        }
    }

    public static float id_class(double d) {
        return (float)((double)Math.round(d * 1.0E8) / 1.0E8);
    }

    public static double id_class(rfH_2 rfH_22, double d, double d2, double d3) {
        return rrWD.id_class((double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), d, d2, d3);
    }

    public static float id_class(rfH_2 rfH_22, float f, float f2, float f3) {
        return rrWD.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), f, f2, f3);
    }

    public static double id_class(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        return d7 * d7 + d8 * d8 + d9 * d9;
    }

    public static float id_class(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f - f4;
        float f8 = f2 - f5;
        float f9 = f3 - f6;
        return f7 * f7 + f8 * f8 + f9 * f9;
    }

    public static rjV_2 id_class() {
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class();
        return rjV_22;
    }

    public static int id_class(int[] nArray) {
        if (nArray.length <= 0) {
            return 0;
        }
        int n = rrWD.id_break(nArray);
        return n / nArray.length;
    }

    public static int id_class(int n) {
        int n2 = rfU_2.id_byte(n);
        return n == n2 ? n2 : n2 / 2;
    }

    public static boolean id_class(float f, float f2, float f3) {
        return Math.abs(f - f2) <= f3;
    }

    public static float id_class(float f) {
        return id_protected[(int)((double)(f + 1.0f) * 32767.5) & 0xFFFF];
    }

    public static float id_break(float f) {
        return 1.5707964f - id_protected[(int)((double)(f + 1.0f) * 32767.5) & 0xFFFF];
    }

    public static int id_break(int[] nArray) {
        if (nArray.length <= 0) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < nArray.length; ++i) {
            int n2 = nArray[i];
            n += n2;
        }
        return n;
    }

    public static float id_protected(float f) {
        return f / 180.0f * rfU_2.id_break;
    }
}

