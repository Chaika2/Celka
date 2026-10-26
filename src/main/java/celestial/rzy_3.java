/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;
import celestial.rzH_2;
import celestial.rzq_3;
import java.util.function.Function;

public class rzy_3 {
    public static <E, T extends rzH_2<E>> rzq_3<E, T> id_class(rVL<T> rVL2, String string, String string2, Function<E, T> function) {
        return new rzq_3<E, T>(rVL2, string, string2, function);
    }
}

