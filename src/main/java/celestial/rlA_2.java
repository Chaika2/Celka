/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 */
package celestial;

import celestial.rlE_2;
import celestial.rlF_2;
import celestial.rlG_2;
import celestial.rlQ_2;
import celestial.rlW_2;
import celestial.rlc_3;
import celestial.rls_3;
import celestial.rqO_2;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class rlA_2 {
    private static final Map<rqO_2, rlF_2<?>> id_class = Maps.newHashMap();

    public static <T> rlF_2<T> id_class(rqO_2 rqO_22, Function<rlQ_2, rlW_2<T>> function) {
        rlF_2<T> rlF_22 = new rlF_2<T>(function);
        rlF_2<T> rlF_23 = id_class.putIfAbsent(rqO_22, rlF_22);
        if (rlF_23 != null) {
            throw new IllegalStateException("Duplicate entry for static tag collection: " + rqO_22);
        }
        return rlF_22;
    }

    private static /* synthetic */ void id_class(Multimap multimap, rlQ_2 rlQ_22, rqO_2 rqO_22, rlF_2 rlF_22) {
        multimap.putAll((Object)rqO_22, rlF_22.id_break(rlQ_22));
    }

    public static void id_class(rlQ_2 rlQ_22) {
        id_class.values().forEach(rlF_22 -> rlF_22.id_class(rlQ_22));
    }

    public static void id_class() {
        id_class.values().forEach(rlF_2::id_class);
    }

    public static void id_break() {
        rlF_2[] rlF_2Array = new rlF_2[]{rls_3.id_class, rlc_3.id_class, rlG_2.id_class, rlE_2.id_class};
        boolean bl = Stream.of(rlF_2Array).anyMatch(rlF_22 -> !id_class.containsValue(rlF_22));
        if (bl) {
            throw new IllegalStateException("Missing helper registrations");
        }
    }

    public static Multimap<rqO_2, rqO_2> id_break(rlQ_2 rlQ_22) {
        HashMultimap hashMultimap = HashMultimap.create();
        id_class.forEach((arg_0, arg_1) -> rlA_2.id_class((Multimap)hashMultimap, rlQ_22, arg_0, arg_1));
        return hashMultimap;
    }
}

