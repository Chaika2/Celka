/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Jk_1;
import celestial.Xh_1;
import celestial.an_3;
import celestial.hG_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class Jd_1
extends hG_2<Jk_1> {
    public static final rqO_2 id_class = new rqO_2("thrown_item_picked_up_by_entity");

    public void id_class(rhN_2 rhN_22, rdn_3 rdn_32, an_3 an_32) {
        rzr_3 rzr_32 = hY_2.id_break(rhN_22, an_32);
        this.id_class(rhN_22, (T jk_1) -> jk_1.id_class(rhN_22, rdn_32, rzr_32));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    protected /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    protected Jk_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("item"));
        ho_3 ho_33 = ho_3.id_class(jsonObject, "entity", rWl_12);
        return new Jk_1(ho_32, xh_1, ho_33);
    }
}

