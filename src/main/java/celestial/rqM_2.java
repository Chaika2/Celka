/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rVL;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

public class rqM_2<T> {
    private static final Map<String, rqM_2<?>> id_class = Collections.synchronizedMap(Maps.newIdentityHashMap());
    private final rqO_2 id_break;
    private final rqO_2 id_byte;

    private rqM_2(rqO_2 rqO_22, rqO_2 rqO_23) {
        this.id_break = rqO_22;
        this.id_byte = rqO_23;
    }

    public String toString() {
        return "ResourceKey[" + this.id_break + " / " + this.id_byte + "]";
    }

    public rqO_2 id_class() {
        return this.id_byte;
    }

    public static <T> rqM_2<T> id_class(rqM_2<? extends rVL<T>> rqM_22, rqO_2 rqO_22) {
        return rqM_2.id_class(rqM_22.id_byte, rqO_22);
    }

    private static <T> rqM_2<T> id_class(rqO_2 rqO_22, rqO_2 rqO_23) {
        String string2 = (rqO_22 + ":" + rqO_23).intern();
        return id_class.computeIfAbsent(string2, string -> new rqM_2(rqO_22, rqO_23));
    }

    public static <T> rqM_2<rVL<T>> id_class(rqO_2 rqO_22) {
        return rqM_2.id_class(rVL.id_break, rqO_22);
    }

    public boolean id_class(rqM_2<? extends rVL<?>> rqM_22) {
        return this.id_break.equals(rqM_22.id_class());
    }

    public static <T> Function<rqO_2, rqM_2<T>> id_break(rqM_2<? extends rVL<T>> rqM_22) {
        return rqO_22 -> rqM_2.id_class(rqM_22, rqO_22);
    }
}

