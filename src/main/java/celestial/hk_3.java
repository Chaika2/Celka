/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hG_2;
import celestial.hW_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rVL;
import celestial.rWl_1;
import celestial.rYB;
import celestial.rhN_2;
import celestial.rpY_2;
import celestial.rqM_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class hk_3
extends hG_2<hW_2> {
    public static final rqO_2 id_class = new rqO_2("changed_dimension");

    public void id_class(rhN_2 rhN_22, rqM_2<rYB> rqM_22, rqM_2<rYB> rqM_23) {
        this.id_class(rhN_22, (T hW_22) -> hW_22.id_class(rqM_22, rqM_23));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public hW_2 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        rqM_2<rYB> rqM_22 = jsonObject.has("from") ? rqM_2.id_class(rVL.id_static, new rqO_2(rpY_2.id_case(jsonObject, "from"))) : null;
        rqM_2<rYB> rqM_23 = jsonObject.has("to") ? rqM_2.id_class(rVL.id_static, new rqO_2(rpY_2.id_case(jsonObject, "to"))) : null;
        return new hW_2(ho_32, rqM_22, rqM_23);
    }
}

