/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.XO;
import celestial.Xh_1;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.ho_3;
import celestial.rWl_1;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class XM
extends hG_2<XO> {
    public static final rqO_2 id_class = new rqO_2("item_durability_changed");

    public void id_class(rhN_2 rhN_22, rdn_3 rdn_32, int n) {
        this.id_class(rhN_22, (T xO) -> xO.id_class(rdn_32, n));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public XO id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("item"));
        XF xF = XF.id_class(jsonObject.get("durability"));
        XF xF2 = XF.id_class(jsonObject.get("delta"));
        return new XO(ho_32, xh_1, xF, xF2);
    }
}

