/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Xf_1;
import celestial.an_3;
import celestial.hG_2;
import celestial.hL_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rye_3;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class XI
extends hG_2<Xf_1> {
    public static final rqO_2 id_class = new rqO_2("player_hurt_entity");

    public void id_class(rhN_2 rhN_22, an_3 an_32, rye_3 rye_32, float f, float f2, boolean bl) {
        rzr_3 rzr_32 = hY_2.id_break(rhN_22, an_32);
        this.id_class(rhN_22, (T xf_1) -> xf_1.id_class(rhN_22, rzr_32, rye_32, f, f2, bl));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public Xf_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        hL_2 hL_22 = hL_2.id_class(jsonObject.get("damage"));
        ho_3 ho_33 = ho_3.id_class(jsonObject, "entity", rWl_12);
        return new Xf_1(ho_32, hL_22, ho_33);
    }
}

