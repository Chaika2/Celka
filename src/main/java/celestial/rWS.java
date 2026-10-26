/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.eA_2;
import celestial.ev_3;
import celestial.rVL;
import celestial.rWN;
import celestial.rXk_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class rWS
extends rWN {
    public rWS(rqO_2 rqO_22) {
        super(rqO_22);
    }

    @Override
    public boolean id_class(rXk_1 rXk_12, rYB rYB2) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_3 rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            arrayList.add(rdn_32);
            if (arrayList.size() <= 1) continue;
            rdn_3 rdn_33 = (rdn_3)arrayList.get(0);
            if (rdn_32.id_break() == rdn_33.id_break() && rdn_33.id_char() == 1 && rdn_32.id_char() == 1 && rdn_33.id_break().id_extends()) continue;
            return false;
        }
        return arrayList.size() == 2;
    }

    @Override
    public rdn_3 id_class(rXk_1 rXk_12) {
        Object object;
        rdn_3 rdn_32;
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < rXk_12.id_else(); ++i) {
            rdn_32 = rXk_12.id_extends(i);
            if (rdn_32.id_class()) continue;
            arrayList.add(rdn_32);
            if (arrayList.size() <= 1) continue;
            object = (rdn_3)arrayList.get(0);
            if (rdn_32.id_break() == ((rdn_3)object).id_break() && ((rdn_3)object).id_char() == 1 && rdn_32.id_char() == 1 && ((rdn_3)object).id_break().id_extends()) continue;
            return rdn_3.id_break;
        }
        if (arrayList.size() == 2) {
            rdn_3 rdn_33 = (rdn_3)arrayList.get(0);
            rdn_32 = (rdn_3)arrayList.get(1);
            if (rdn_33.id_break() == rdn_32.id_break() && rdn_33.id_char() == 1 && rdn_32.id_char() == 1 && rdn_33.id_break().id_extends()) {
                object = rdn_33.id_break();
                int n = ((rdb_3)object).id_finally() - rdn_33.id_catch();
                int n2 = ((rdb_3)object).id_finally() - rdn_32.id_catch();
                int n3 = n + n2 + ((rdb_3)object).id_finally() * 5 / 100;
                int n4 = ((rdb_3)object).id_finally() - n3;
                if (n4 < 0) {
                    n4 = 0;
                }
                rdn_3 rdn_34 = new rdn_3(rdn_33.id_break());
                rdn_34.id_break(n4);
                HashMap hashMap = Maps.newHashMap();
                Map<ev_3, Integer> map = eA_2.id_class(rdn_33);
                Map<ev_3, Integer> map2 = eA_2.id_class(rdn_32);
                rVL.id_boolean.id_case().filter(ev_3::id_byte).forEach(ev_32 -> {
                    int n = Math.max(map.getOrDefault(ev_32, 0), map2.getOrDefault(ev_32, 0));
                    if (n > 0) {
                        hashMap.put(ev_32, n);
                    }
                });
                if (!hashMap.isEmpty()) {
                    eA_2.id_class(hashMap, rdn_34);
                }
                return rdn_34;
            }
        }
        return rdn_3.id_break;
    }

    @Override
    public boolean id_class(int n, int n2) {
        return n * n2 >= 2;
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_package;
    }
}

