/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.Xx_1;
import celestial.an_3;
import celestial.hG_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class XJ
extends hG_2<Xx_1> {
    public static final rqO_2 id_class = new rqO_2("killed_by_crossbow");

    @Override
    public void id_class(rhN_2 rhN_22, Collection<an_3> collection) {
        ArrayList arrayList = Lists.newArrayList();
        HashSet hashSet = Sets.newHashSet();
        for (an_3 an_32 : collection) {
            hashSet.add(an_32.BC());
            arrayList.add(hY_2.id_break(rhN_22, an_32));
        }
        this.id_class(rhN_22, (T xx_1) -> xx_1.id_class(arrayList, hashSet.size()));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public Xx_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        ho_3[] ho_3Array = ho_3.id_break(jsonObject, "victims", rWl_12);
        XF xF = XF.id_class(jsonObject.get("unique_entity_types"));
        return new Xx_1(ho_32, ho_3Array, xF);
    }
}

