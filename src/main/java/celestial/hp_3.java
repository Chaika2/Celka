/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.Xh_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.hq_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class hp_3
extends hG_2<hq_3> {
    public static final rqO_2 id_class = new rqO_2("enchanted_item");

    public void id_class(rhN_2 rhN_22, rdn_3 rdn_32, int n) {
        this.id_class(rhN_22, (T hq_32) -> hq_32.id_class(rdn_32, n));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public hq_3 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("item"));
        XF xF = XF.id_class(jsonObject.get("levels"));
        return new hq_3(ho_32, xh_1, xF);
    }
}

