/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.iB_2;
import celestial.is_3;
import celestial.rfU_2;
import celestial.rpZ_2;
import celestial.rxm_3;

public class Iy_1 {
    public static <T extends is_3> void id_class(Iq_1 iq_1, Iq_1 iq_12, T t, float f, float f2) {
        float f3 = rfU_2.id_class(f * (float)Math.PI);
        float f4 = rfU_2.id_class((1.0f - (1.0f - f) * (1.0f - f)) * (float)Math.PI);
        iq_1.id_private = 0.0f;
        iq_12.id_private = 0.0f;
        iq_1.id_catch = 0.15707964f;
        iq_12.id_catch = -0.15707964f;
        if (t.Su() == rpZ_2.RIGHT) {
            iq_1.id_case = -1.8849558f + rfU_2.id_break(f2 * 0.09f) * 0.15f;
            iq_12.id_case = -0.0f + rfU_2.id_break(f2 * 0.19f) * 0.5f;
            iq_1.id_case += f3 * 2.2f - f4 * 0.4f;
            iq_12.id_case += f3 * 1.2f - f4 * 0.4f;
        } else {
            iq_1.id_case = -0.0f + rfU_2.id_break(f2 * 0.19f) * 0.5f;
            iq_12.id_case = -1.8849558f + rfU_2.id_break(f2 * 0.09f) * 0.15f;
            iq_1.id_case += f3 * 1.2f - f4 * 0.4f;
            iq_12.id_case += f3 * 2.2f - f4 * 0.4f;
        }
        Iy_1.id_class(iq_1, iq_12, f2);
    }

    public static void id_class(Iq_1 iq_1, Iq_1 iq_12, float f) {
        iq_1.id_private += rfU_2.id_break(f * 0.09f) * 0.05f + 0.05f;
        iq_12.id_private -= rfU_2.id_break(f * 0.09f) * 0.05f + 0.05f;
        iq_1.id_case += rfU_2.id_class(f * 0.067f) * 0.05f;
        iq_12.id_case -= rfU_2.id_class(f * 0.067f) * 0.05f;
    }

    public static void id_class(Iq_1 iq_1, Iq_1 iq_12, boolean bl, float f, float f2) {
        float f3;
        float f4 = rfU_2.id_class(f * (float)Math.PI);
        float f5 = rfU_2.id_class((1.0f - (1.0f - f) * (1.0f - f)) * (float)Math.PI);
        iq_12.id_private = 0.0f;
        iq_1.id_private = 0.0f;
        iq_12.id_catch = -(0.1f - f4 * 0.6f);
        iq_1.id_catch = 0.1f - f4 * 0.6f;
        iq_12.id_case = f3 = (float)(-Math.PI) / (bl ? 1.5f : 2.25f);
        iq_1.id_case = f3;
        iq_12.id_case += f4 * 1.2f - f5 * 0.4f;
        iq_1.id_case += f4 * 1.2f - f5 * 0.4f;
        Iy_1.id_class(iq_12, iq_1, f2);
    }

    public static void id_class(Iq_1 iq_1, Iq_1 iq_12, iB_2 iB_22, boolean bl) {
        Iq_1 iq_13 = bl ? iq_1 : iq_12;
        Iq_1 iq_14 = bl ? iq_12 : iq_1;
        iq_13.id_catch = bl ? -0.8f : 0.8f;
        iq_14.id_case = iq_13.id_case = -0.97079635f;
        float f = rxm_3.id_private(iB_22.sX());
        float f2 = rfU_2.id_class((float)iB_22.SU(), 0.0f, f);
        float f3 = f2 / f;
        iq_14.id_catch = rfU_2.id_catch(f3, 0.4f, 0.85f) * (float)(bl ? 1 : -1);
        iq_14.id_case = rfU_2.id_catch(f3, iq_14.id_case, -1.5707964f);
    }

    public static void id_class(Iq_1 iq_1, Iq_1 iq_12, Iq_1 iq_13, boolean bl) {
        Iq_1 iq_14 = bl ? iq_1 : iq_12;
        Iq_1 iq_15 = bl ? iq_12 : iq_1;
        iq_14.id_catch = (bl ? -0.3f : 0.3f) + iq_13.id_catch;
        iq_15.id_catch = (bl ? 0.6f : -0.6f) + iq_13.id_catch;
        iq_14.id_case = -1.5707964f + iq_13.id_case + 0.1f;
        iq_15.id_case = -1.5f + iq_13.id_case;
    }
}

