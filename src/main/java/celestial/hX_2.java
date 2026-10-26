/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.au_3;
import celestial.hG_2;
import celestial.hJ_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rbZ_2;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class hX_2
extends hG_2<hJ_2> {
    public static final rqO_2 id_class = new rqO_2("bred_animals");

    public void id_class(rhN_2 rhN_22, rbZ_2 rbZ_22, rbZ_2 rbZ_23, au_3 au_32) {
        rzr_3 rzr_32 = hY_2.id_break(rhN_22, rbZ_22);
        rzr_3 rzr_33 = hY_2.id_break(rhN_22, rbZ_23);
        rzr_3 rzr_34 = au_32 != null ? hY_2.id_break(rhN_22, au_32) : null;
        this.id_class(rhN_22, (T hJ_22) -> hJ_22.id_class(rzr_32, rzr_33, rzr_34));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public hJ_2 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        ho_3 ho_33 = ho_3.id_class(jsonObject, "parent", rWl_12);
        ho_3 ho_34 = ho_3.id_class(jsonObject, "partner", rWl_12);
        ho_3 ho_35 = ho_3.id_class(jsonObject, "child", rWl_12);
        return new hJ_2(ho_32, ho_33, ho_34, ho_35);
    }
}

