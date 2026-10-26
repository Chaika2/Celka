/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.DN;
import celestial.DQ;
import celestial.DS;
import celestial.DW;
import celestial.Dc_1;
import celestial.Dk_1;
import celestial.Uz_1;
import celestial.rCZ;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Dd_1 {
    private final Map<Uz_1, List<DS>> id_class = Maps.newHashMap();

    private void id_byte() {
        List<rCZ<?>> list = this.id_break();
        Stream<Uz_1> stream = Stream.of(Uz_1.id_class());
        for (rCZ<?> rCZ2 : list) {
            stream = stream.flatMap(uz_1 -> rCZ2.id_byte().map(uz_1::id_class));
        }
        List list2 = stream.filter(uz_1 -> !this.id_class.containsKey(uz_1)).collect(Collectors.toList());
        if (!list2.isEmpty()) {
            throw new IllegalStateException("Missing definition for properties: " + list2);
        }
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> DN<T1, T2, T3> id_class(rCZ<T1> rCZ2, rCZ<T2> rCZ3, rCZ<T3> rCZ4) {
        return new DN<T1, T2, T3>(rCZ2, rCZ3, rCZ4);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> DW<T1, T2, T3, T4> id_class(rCZ<T1> rCZ2, rCZ<T2> rCZ3, rCZ<T3> rCZ4, rCZ<T4> rCZ5) {
        return new DW<T1, T2, T3, T4>(rCZ2, rCZ3, rCZ4, rCZ5);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> Dk_1<T1, T2, T3, T4, T5> id_class(rCZ<T1> rCZ2, rCZ<T2> rCZ3, rCZ<T3> rCZ4, rCZ<T4> rCZ5, rCZ<T5> rCZ6) {
        return new Dk_1<T1, T2, T3, T4, T5>(rCZ2, rCZ3, rCZ4, rCZ5, rCZ6);
    }

    public Map<Uz_1, List<DS>> id_class() {
        this.id_byte();
        return ImmutableMap.copyOf(this.id_class);
    }

    protected void id_class(Uz_1 uz_1, List<DS> list) {
        List<DS> list2 = this.id_class.put(uz_1, list);
        if (list2 != null) {
            throw new IllegalStateException("Value " + uz_1 + " is already defined");
        }
    }

    public static <T1 extends Comparable<T1>> DQ<T1> id_class(rCZ<T1> rCZ2) {
        return new DQ<T1>(rCZ2);
    }

    public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> Dc_1<T1, T2> id_class(rCZ<T1> rCZ2, rCZ<T2> rCZ3) {
        return new Dc_1<T1, T2>(rCZ2, rCZ3);
    }

    public abstract List<rCZ<?>> id_break();
}

