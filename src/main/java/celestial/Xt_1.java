/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Xw_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class Xt_1
extends hG_2<Xw_1> {
    public static final rqO_2 id_class = new rqO_2("player_generates_container_loot");

    public void id_class(rhN_2 rhN_22, rqO_2 rqO_22) {
        this.id_class(rhN_22, (T xw_1) -> xw_1.id_break(rqO_22));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    protected /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    protected Xw_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "loot_table"));
        return new Xw_1(ho_32, rqO_22);
    }
}

