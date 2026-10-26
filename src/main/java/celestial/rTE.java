/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTG;
import celestial.rqR_2;
import java.util.List;
import java.util.Random;

public class rTE {
    public static <T extends rTG> T id_class(Random random, List<T> list) {
        return rTE.id_class(random, list, rTE.id_class(list));
    }

    public static <T extends rTG> T id_class(List<T> list, int n) {
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            rTG rTG2 = (rTG)list.get(i);
            if ((n -= rTG2.id_byte) >= 0) continue;
            return (T)rTG2;
        }
        return (T)((rTG)null);
    }

    public static <T extends rTG> T id_class(Random random, List<T> list, int n) {
        if (n <= 0) {
            throw rqR_2.id_byte(new IllegalArgumentException());
        }
        int n2 = random.nextInt(n);
        return rTE.id_class(list, n2);
    }

    public static int id_class(List<? extends rTG> list) {
        int n = 0;
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            rTG rTG2 = list.get(i);
            n += rTG2.id_byte;
        }
        return n;
    }
}

