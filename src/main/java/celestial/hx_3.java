/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.hG_2;
import celestial.hZ_2;
import celestial.hd_3;
import celestial.ho_3;
import celestial.rLi_1;
import celestial.rVL;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class hx_3
extends hG_2<hd_3> {
    public static final rqO_2 id_class = new rqO_2("brewed_potion");

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    public void id_class(rhN_2 rhN_22, rLi_1 rLi_12) {
        this.id_class(rhN_22, (T hd_32) -> hd_32.id_class(rLi_12));
    }

    public hd_3 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        rLi_1 rLi_12 = null;
        if (jsonObject.has("potion")) {
            rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "potion"));
            rLi_12 = rVL.id_double.id_break(rqO_22).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + rqO_22 + "'"));
        }
        return new hd_3(ho_32, rLi_12);
    }
}

