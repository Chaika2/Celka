/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.rVL;
import celestial.rzH_2;
import celestial.rzT_2;
import celestial.rzp_3;
import com.mojang.datafixers.util.Pair;
import java.util.function.Function;

public class rzq_3<E, T extends rzH_2<E>> {
    private final rVL<T> id_class;
    private final String id_break;
    private final String id_byte;
    private final Function<E, T> id_protected;
    private Pair<T, rzp_3<? extends E>> id_throws;

    public rzq_3(rVL<T> rVL2, String string, String string2, Function<E, T> function) {
        this.id_class = rVL2;
        this.id_break = string;
        this.id_byte = string2;
        this.id_protected = function;
    }

    public Object id_class() {
        return new rzT_2<E, T>(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
    }
}

