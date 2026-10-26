/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.Ju_1;
import celestial.Xh_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class Jc_1
extends hG_2<Ju_1> {
    public static final rqO_2 id_class = new rqO_2("used_totem");

    public void id_class(rhN_2 rhN_22, rdn_3 rdn_32) {
        this.id_class(rhN_22, (T ju_1) -> ju_1.id_class(rdn_32));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public Ju_1 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("item"));
        return new Ju_1(ho_32, xh_1);
    }
}

