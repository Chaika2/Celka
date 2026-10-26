/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.JZ;
import celestial.Xh_1;
import celestial.hG_2;
import celestial.hY_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rsy_3;
import celestial.rzr_3;
import com.google.gson.JsonObject;

public class Jm_1
extends hG_2<JZ> {
    public static final rqO_2 id_class = new rqO_2("villager_trade");

    public void id_class(rhN_2 rhN_22, rsy_3 rsy_32, rdn_3 rdn_32) {
        rzr_3 rzr_32 = hY_2.id_break(rhN_22, rsy_32);
        this.id_class(rhN_22, (T jZ) -> jZ.id_class(rzr_32, rdn_32));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public JZ id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        ho_3 ho_33 = ho_3.id_class(jsonObject, "villager", rWl_12);
        Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("item"));
        return new JZ(ho_32, ho_33, xh_1);
    }
}

