/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.hF_2;
import celestial.hG_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rbB_2;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rsq_3;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class hv_3
extends hG_2<hF_2> {
    public static final rqO_2 id_class = new rqO_2("cured_zombie_villager");

    public void id_class(rhN_2 rhN_22, rbB_2 rbB_22, rsq_3 rsq_32) {
        rzr_3 rzr_32 = hY_2.id_break(rhN_22, rbB_22);
        rzr_3 rzr_33 = hY_2.id_break(rhN_22, rsq_32);
        this.id_class(rhN_22, (T hF_22) -> hF_22.id_class(rzr_32, rzr_33));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public hF_2 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        ho_3 ho_33 = ho_3.id_class(jsonObject, "zombie", rWl_12);
        ho_3 ho_34 = ho_3.id_class(jsonObject, "villager", rWl_12);
        return new hF_2(ho_32, ho_33, ho_34);
    }
}

