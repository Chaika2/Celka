/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.rWO;
import celestial.rWb_1;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkw_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rqs_3;
import celestial.ruu_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class rWh_1
implements rkf_3<rWO> {
    public rWO id_class(rqO_2 rqO_22, ruu_3 ruu_32) {
        String string = ruu_32.id_throws(Short.MAX_VALUE);
        int n = ruu_32.id_case();
        rqs_3<rkg_3> rqs_32 = rqs_3.id_class(n, rkg_3.id_class);
        for (int i = 0; i < rqs_32.size(); ++i) {
            rqs_32.set(i, rkg_3.id_break(ruu_32));
        }
        rdn_3 rdn_32 = ruu_32.id_extends();
        return new rWO(rqO_22, string, rdn_32, rqs_32);
    }

    @Override
    public void id_class(ruu_3 ruu_32, rWO rWO2) {
        ruu_32.id_class(rWO2.id_break);
        ruu_32.id_protected(rWO2.id_protected.size());
        for (rkg_3 rkg_32 : rWO2.id_protected) {
            rkg_32.id_class(ruu_32);
        }
        ruu_32.id_class(rWO2.id_byte);
    }

    private static rqs_3<rkg_3> id_class(JsonArray jsonArray) {
        rqs_3<rkg_3> rqs_32 = rqs_3.id_class();
        for (int i = 0; i < jsonArray.size(); ++i) {
            rkg_3 rkg_32 = rkg_3.id_class(jsonArray.get(i));
            if (rkg_32.id_protected()) continue;
            rqs_32.add(rkg_32);
        }
        return rqs_32;
    }

    public rWO id_class(rqO_2 rqO_22, JsonObject jsonObject) {
        String string = rpY_2.id_class(jsonObject, "group", "");
        rqs_3<rkg_3> rqs_32 = rWh_1.id_class(rpY_2.id_volatile(jsonObject, "ingredients"));
        if (rqs_32.isEmpty()) {
            throw new JsonParseException("No ingredients for shapeless recipe");
        }
        if (rqs_32.size() > 9) {
            throw new JsonParseException("Too many ingredients for shapeless recipe");
        }
        rdn_3 rdn_32 = rWb_1.id_class(rpY_2.id_native(jsonObject, "result"));
        return new rWO(rqO_22, string, rdn_32, rqs_32);
    }

    @Override
    public /* synthetic */ rkw_3 id_break(rqO_2 rqO_22, JsonObject jsonObject) {
        return this.id_class(rqO_22, jsonObject);
    }

    @Override
    public /* synthetic */ rkw_3 id_break(rqO_2 rqO_22, ruu_3 ruu_32) {
        return this.id_class(rqO_22, ruu_32);
    }
}

