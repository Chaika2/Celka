/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.XF;
import celestial.hG_2;
import celestial.hZ_2;
import celestial.hc_3;
import celestial.ho_3;
import celestial.rHO;
import celestial.rWl_1;
import celestial.rhN_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;

public class hN_2
extends hG_2<hc_3> {
    public static final rqO_2 id_class = new rqO_2("construct_beacon");

    public void id_class(rhN_2 rhN_22, rHO rHO2) {
        this.id_class(rhN_22, (T hc_32) -> hc_32.id_class(rHO2));
    }

    @Override
    public rqO_2 id_class() {
        return id_class;
    }

    @Override
    public /* synthetic */ hZ_2 id_class(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        return this.id_break(jsonObject, ho_32, rWl_12);
    }

    public hc_3 id_break(JsonObject jsonObject, ho_3 ho_32, rWl_1 rWl_12) {
        XF xF = XF.id_class(jsonObject.get("level"));
        return new hc_3(ho_32, xF);
    }
}

