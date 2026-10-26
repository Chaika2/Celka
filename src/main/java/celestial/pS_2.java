/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Ordering
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.gm_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rja_3;
import celestial.yD_2;
import celestial.yK_2;
import celestial.yX_2;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class pS_2
implements yD_2 {
    private final QY id_class;
    private final Map<Long, Map<rfH_2, Integer>> id_break = Maps.newTreeMap((Comparator)Ordering.natural().reverse());

    public pS_2(QY qY) {
        this.id_class = qY;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        Object object;
        long l = ((gm_3)this.id_class.id_class[56]).r();
        int n = 200;
        double d4 = 0.0025;
        HashSet hashSet = Sets.newHashSet();
        HashMap hashMap = Maps.newHashMap();
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_return());
        Iterator<Map.Entry<Long, Map<rfH_2, Integer>>> iterator = this.id_break.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Long, Map<rfH_2, Integer>> entry = iterator.next();
            Long object2 = (Long)entry.getKey();
            object = (Map)entry.getValue();
            long l2 = l - object2;
            if (l2 > 200L) {
                iterator.remove();
                continue;
            }
            for (Map.Entry entry2 : object.entrySet()) {
                rfH_2 rfH_22 = (rfH_2)entry2.getKey();
                Integer n2 = (Integer)entry2.getValue();
                if (!hashSet.add(rfH_22)) continue;
                rfl_3 rfl_32 = new rfl_3(rfH_2.id_protected).id_class(0.002).id_break(0.0025 * (double)l2).id_protected(rfH_22.b_(), rfH_22.c_(), rfH_22.d_()).id_protected(-d, -d2, -d3);
                yX_2.id_class(ml_1, ok_1, rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_case, 1.0f, 1.0f, 1.0f, 1.0f);
                hashMap.put(rfH_22, n2);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            object = (rfH_2)entry.getKey();
            Integer n3 = (Integer)entry.getValue();
            yK_2.id_class(String.valueOf(n3), ((rja_3)object).b_(), ((rja_3)object).c_(), ((rja_3)object).d_(), -1);
        }
    }

    public void id_class(long l2, rfH_2 rfH_22) {
        Map map = this.id_break.computeIfAbsent(l2, l -> Maps.newHashMap());
        int n = map.getOrDefault(rfH_22, 0);
        map.put(rfH_22, n + 1);
    }
}

