/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.roQ_2;
import celestial.yQ_2;

public class rrzb_3 {
    public static double id_class(int n) {
        double d = (double)n / 4096.0;
        double d2 = (d *= 0.995) * 2.0 - 1.0;
        d2 = rfU_2.id_class(d2, -1.0, 1.0);
        return rfU_2.id_class(1.0 - d2 * d2);
    }

    public static int id_class(yQ_2 yQ_22) {
        roQ_2[] roQ_2Array = yQ_22.id_volatile().id_byte();
        if (roQ_2Array == null) {
            return 0;
        }
        int n = yQ_22.id_throws().c_() >> 4;
        roQ_2 roQ_22 = roQ_2Array[n];
        return roQ_22 == null ? (short)0 : roQ_22.id_extends();
    }

    public static double id_break(yQ_2 yQ_22) {
        int n = rrzb_3.id_class(yQ_22);
        return rrzb_3.id_class(n);
    }
}

