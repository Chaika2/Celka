/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hB_2;
import celestial.hP_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.hr_3;
import celestial.hs_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rzr_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public abstract class hG_2<T extends hZ_2>
implements hP_2<T> {
    private final Map<hs_3, Set<hB_2<T>>> id_class = Maps.newIdentityHashMap();

    protected abstract T id_class(JsonObject var1, ho_3 var2, rWl_1 var3);

    protected void id_class(rhN_2 rhN_22, Predicate<T> predicate) {
        hs_3 hs_32 = rhN_22.r();
        Set<hB_2<T>> set = this.id_class.get(hs_32);
        if (set != null && !set.isEmpty()) {
            rzr_3 rzr_32 = hY_2.id_break(rhN_22, rhN_22);
            List list = null;
            for (hB_2<Object> hB_22 : set) {
                hZ_2 hZ_22 = (hZ_2)hB_22.id_class();
                if (!hZ_22.id_byte().id_class(rzr_32) || !predicate.test(hZ_22)) continue;
                if (list == null) {
                    list = Lists.newArrayList();
                }
                list.add(hB_22);
            }
            if (list != null) {
                for (hB_2<Object> hB_22 : list) {
                    hB_22.id_class(hs_32);
                }
            }
        }
    }

    @Override
    public /* synthetic */ hr_3 id_class(JsonObject jsonObject, rWl_1 rWl_12) {
        return this.id_break(jsonObject, rWl_12);
    }

    @Override
    public final void id_class(hs_3 hs_32) {
        this.id_class.remove(hs_32);
    }

    @Override
    public final void id_class(hs_3 hs_33, hB_2<T> hB_22) {
        this.id_class.computeIfAbsent(hs_33, hs_32 -> Sets.newHashSet()).add(hB_22);
    }

    @Override
    public final void id_break(hs_3 hs_32, hB_2<T> hB_22) {
        Set<hB_2<T>> set = this.id_class.get(hs_32);
        if (set != null) {
            set.remove(hB_22);
            if (set.isEmpty()) {
                this.id_class.remove(hs_32);
            }
        }
    }

    public final T id_break(JsonObject jsonObject, rWl_1 rWl_12) {
        ho_3 ho_32 = ho_3.id_class(jsonObject, "player", rWl_12);
        return this.id_class(jsonObject, ho_32, rWl_12);
    }
}

