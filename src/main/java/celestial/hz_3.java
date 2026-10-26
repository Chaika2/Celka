/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.an_3;
import celestial.hG_2;
import celestial.hQ_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class hz_3
extends hG_2<hQ_2> {
    public static final rqO_2 id_class = new rqO_2("channeled_lightning");

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public void id_class(rhN_2 rhN_22, Collection<? extends an_3> collection) {
        List list = collection.stream().map(an_32 -> hY_2.id_break(rhN_22, an_32)).collect(Collectors.toList());
        this.id_class(rhN_22, (T hQ_22) -> hQ_22.id_class(list));
    }

    public hQ_2 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        ho_3[] ho_3Array = ho_3.id_break(jsonObject, "victims", rWl_12);
        return new hQ_2(ho_32, ho_3Array);
    }
}

