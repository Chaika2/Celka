/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rja_3;
import celestial.rje_3;

public class rjP_2 {
    private static final float id_class = 127.0f;
    private static final float id_break = 0.007874016f;

    public static float id_byte(int n) {
        return (float)((byte)(n >> 16 & 0xFF)) * 0.007874016f;
    }

    private static int id_class(float f) {
        return (int)(rfU_2.id_class(f, -1.0f, 1.0f) * 127.0f) & 0xFF;
    }

    public static float id_class(int n) {
        return (float)((byte)(n & 0xFF)) * 0.007874016f;
    }

    public static int id_class(rja_3 rja_32) {
        return rjP_2.id_class(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    public static int id_class(float f, float f2, float f3) {
        int n = rjP_2.id_class(f);
        int n2 = rjP_2.id_class(f2);
        int n3 = rjP_2.id_class(f3);
        return n3 << 16 | n2 << 8 | n;
    }

    public static int id_class(rje_3 rje_32) {
        return rjP_2.id_class(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte());
    }

    public static float id_break(int n) {
        return (float)((byte)(n >> 8 & 0xFF)) * 0.007874016f;
    }
}

