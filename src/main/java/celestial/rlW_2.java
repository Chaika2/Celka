/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rVL;
import celestial.rVu_1;
import celestial.rlb_3;
import celestial.rlz_3;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public interface rlW_2<T> {
    public static <T> rlW_2<T> id_byte() {
        return rlW_2.id_class(ImmutableBiMap.of());
    }

    public static <T> rlW_2<T> id_class(Map<rqO_2, rlb_3<T>> map) {
        ImmutableBiMap immutableBiMap = ImmutableBiMap.copyOf(map);
        return new rlz_3((BiMap)immutableBiMap);
    }

    default public Collection<rqO_2> id_class(T t) {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry<rqO_2, rlb_3<T>> entry : this.id_class().entrySet()) {
            if (!entry.getValue().id_class(t)) continue;
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    default public void id_class(ruu_3 ruu_32, rVu_1<T> rVu_12) {
        Map<rqO_2, rlb_3<T>> map = this.id_class();
        ruu_32.id_protected(map.size());
        for (Map.Entry<rqO_2, rlb_3<T>> entry : map.entrySet()) {
            ruu_32.id_class(entry.getKey());
            ruu_32.id_protected(entry.getValue().id_class().size());
            for (T t : entry.getValue().id_class()) {
                ruu_32.id_protected(rVu_12.id_class(t));
            }
        }
    }

    public static <T> rlW_2<T> id_class(ruu_3 ruu_32, rVL<T> rVL2) {
        HashMap hashMap = Maps.newHashMap();
        int n = ruu_32.id_case();
        for (int i = 0; i < n; ++i) {
            rqO_2 rqO_22 = ruu_32.id_volatile();
            int n2 = ruu_32.id_case();
            ImmutableSet.Builder builder = ImmutableSet.builder();
            for (int j = 0; j < n2; ++j) {
                builder.add(rVL2.id_class(ruu_32.id_case()));
            }
            hashMap.put(rqO_22, rlb_3.id_class(builder.build()));
        }
        return rlW_2.id_class(hashMap);
    }

    public Map<rqO_2, rlb_3<T>> id_class();

    public rqO_2 id_class(rlb_3<T> var1);

    default public rlb_3<T> id_class(rqO_2 rqO_22) {
        return this.id_class().get(rqO_22);
    }

    default public Collection<rqO_2> id_break() {
        return this.id_class().keySet();
    }

    default public rqO_2 id_break(rlb_3<T> rlb_32) {
        rqO_2 rqO_22 = this.id_class(rlb_32);
        if (rqO_22 == null) {
            throw new IllegalStateException("Unrecognized tag");
        }
        return rqO_22;
    }

    public rlb_3<T> id_break(rqO_2 var1);
}

