/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.JX;
import celestial.hG_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rbZ_2;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class Jh_1
extends hG_2<JX> {
    public static final rqO_2 id_class = new rqO_2("tame_animal");

    public void id_class(rhN_2 rhN_22, rbZ_2 rbZ_22) {
        rzr_3 rzr_32 = hY_2.id_break(rhN_22, rbZ_22);
        this.id_class(rhN_22, (T jX) -> jX.id_class(rzr_32));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public JX id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        ho_3 ho_33 = ho_3.id_class(jsonObject, "entity", rWl_12);
        return new JX(ho_32, ho_33);
    }
}

