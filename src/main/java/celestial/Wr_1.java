/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.xc_3;
import java.util.Random;

public class Wr_1 {
    public static boolean id_class(xc_3 xc_32) {
        return xc_32.id_catch();
    }

    public static int id_class(Random random) {
        double d = 1.0;
        int n = 0;
        while (random.nextDouble() < d) {
            d *= 0.826;
            ++n;
        }
        return n;
    }
}

