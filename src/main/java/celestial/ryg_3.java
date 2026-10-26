/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;

public class ryg_3 {
    public static float id_class(float f, float f2, float f3) {
        float f4 = 2.0f + f3 / 4.0f;
        float f5 = rfU_2.id_class(f2 - f / f4, f2 * 0.2f, 20.0f);
        return f * (1.0f - f5 / 25.0f);
    }

    public static float id_class(float f, float f2) {
        float f3 = rfU_2.id_class(f2, 0.0f, 20.0f);
        return f * (1.0f - f3 / 25.0f);
    }
}

