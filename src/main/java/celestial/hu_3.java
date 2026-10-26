/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Xh_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.hm_3;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class hu_3
extends hG_2<hm_3> {
    public static final rqO_2 id_class = new rqO_2("consume_item");

    public void id_class(rhN_2 rhN_22, rdn_3 rdn_32) {
        this.id_class(rhN_22, (T hm_32) -> hm_32.id_class(rdn_32));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public hm_3 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return new hm_3(ho_32, Xh_1.id_class(jsonObject.get("item")));
    }
}

