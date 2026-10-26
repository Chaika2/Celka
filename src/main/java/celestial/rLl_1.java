/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.is_3;
import celestial.rLC;
import celestial.rLH;
import celestial.rLn_1;
import celestial.rLq_1;
import celestial.rLv_1;
import celestial.rRU;
import celestial.rfH_2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class rLl_1 {
    private final rLq_1[] id_class = new rLq_1[32];
    private final int id_break;
    private final rLn_1 id_byte;
    private final rLH id_protected = new rLH();

    public rLl_1(rLn_1 rLn_12, int n) {
        this.id_byte = rLn_12;
        this.id_break = n;
    }

    private rLC id_class(rLq_1 rLq_12, rfH_2 rfH_22, boolean bl) {
        ArrayList arrayList = Lists.newArrayList();
        rLq_1 rLq_13 = rLq_12;
        arrayList.add(0, rLq_12);
        while (rLq_13.id_private != null) {
            rLq_13 = rLq_13.id_private;
            arrayList.add(0, rLq_13);
        }
        return new rLC(arrayList, rfH_22, bl);
    }

    public rLC id_class(rRU rRU2, is_3 is_32, Set<rfH_2> set, float f, int n, float f2) {
        this.id_protected.id_class();
        this.id_byte.id_class(rRU2, is_32);
        rLq_1 rLq_12 = this.id_byte.id_break();
        Map<rLv_1, rfH_2> map = set.stream().collect(Collectors.toMap(rfH_22 -> this.id_byte.id_class((double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_()), Function.identity()));
        rLC rLC2 = this.id_class(rLq_12, map, f, n, f2);
        this.id_byte.id_class();
        return rLC2;
    }

    private rLC id_class(rLq_1 rLq_12, Map<rLv_1, rfH_2> map, float f, int n, float f2) {
        Object object;
        Set<rLv_1> set = map.keySet();
        rLq_12.id_throws = 0.0f;
        rLq_12.id_catch = rLq_12.id_case = this.id_class(rLq_12, set);
        this.id_protected.id_class();
        this.id_protected.id_class(rLq_12);
        ImmutableSet immutableSet = ImmutableSet.of();
        int n2 = 0;
        HashSet hashSet = Sets.newHashSetWithExpectedSize((int)set.size());
        int n3 = (int)((float)this.id_break * f2);
        while (!this.id_protected.id_byte() && ++n2 < n3) {
            object = this.id_protected.id_break();
            ((rLq_1)object).id_implements = true;
            for (rLv_1 rLv_13 : set) {
                if (!(((rLq_1)object).id_byte(rLv_13) <= (float)n)) continue;
                rLv_13.id_break();
                hashSet.add(rLv_13);
            }
            if (!hashSet.isEmpty()) break;
            if (((rLq_1)object).id_class(rLq_12) >= f) continue;
            int n4 = this.id_byte.id_class(this.id_class, (rLq_1)object);
            for (int i = 0; i < n4; ++i) {
                rLq_1 rLq_13 = this.id_class[i];
                float f3 = ((rLq_1)object).id_class(rLq_13);
                rLq_13.id_finally = ((rLq_1)object).id_finally + f3;
                float f4 = ((rLq_1)object).id_throws + f3 + rLq_13.id_extends;
                if (!(rLq_13.id_finally < f) || rLq_13.id_protected() && !(f4 < rLq_13.id_throws)) continue;
                rLq_13.id_private = object;
                rLq_13.id_throws = f4;
                rLq_13.id_case = this.id_class(rLq_13, set) * 1.5f;
                if (rLq_13.id_protected()) {
                    this.id_protected.id_class(rLq_13, rLq_13.id_throws + rLq_13.id_case);
                    continue;
                }
                rLq_13.id_catch = rLq_13.id_throws + rLq_13.id_case;
                this.id_protected.id_class(rLq_13);
            }
        }
        object = !hashSet.isEmpty() ? hashSet.stream().map(rLv_12 -> this.id_class(rLv_12.id_class(), (rfH_2)map.get(rLv_12), true)).min(Comparator.comparingInt(rLC::id_throws)) : set.stream().map(rLv_12 -> this.id_class(rLv_12.id_class(), (rfH_2)map.get(rLv_12), false)).min(Comparator.comparingDouble(rLC::id_final).thenComparingInt(rLC::id_throws));
        return !((Optional)object).isPresent() ? null : (rLC)((Optional)object).get();
    }

    private float id_class(rLq_1 rLq_12, Set<rLv_1> set) {
        float f = Float.MAX_VALUE;
        for (rLv_1 rLv_12 : set) {
            float f2 = rLq_12.id_class(rLv_12);
            rLv_12.id_class(f2, rLq_12);
            f = Math.min(f2, f);
        }
        return f;
    }
}

