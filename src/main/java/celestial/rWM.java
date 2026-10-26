/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rWb_1;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkw_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rqs_3;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import java.util.Map;

public class rWM
implements rkf_3<rWb_1> {
    @Override
    public void id_class(ruu_3 ruu_32, rWb_1 rWb_12) {
        ruu_32.id_protected(rWb_12.id_class);
        ruu_32.id_protected(rWb_12.id_break);
        ruu_32.id_class(rWb_12.id_case);
        for (rkg_3 rkg_32 : rWb_12.id_byte) {
            rkg_32.id_class(ruu_32);
        }
        ruu_32.id_class(rWb_12.id_protected);
    }

    public rWb_1 id_class(rqO_2 rqO_22, ruu_3 ruu_32) {
        int n = ruu_32.id_case();
        int n2 = ruu_32.id_case();
        String string = ruu_32.id_throws(Short.MAX_VALUE);
        rqs_3<rkg_3> rqs_32 = rqs_3.id_class(n * n2, rkg_3.id_class);
        for (int i = 0; i < rqs_32.size(); ++i) {
            rqs_32.set(i, rkg_3.id_break(ruu_32));
        }
        rdn_3 rdn_32 = ruu_32.id_extends();
        return new rWb_1(rqO_22, string, n, n2, rqs_32, rdn_32);
    }

    public rWb_1 id_class(rqO_2 rqO_22, JsonObject jsonObject) {
        String string = rpY_2.id_class(jsonObject, "group", "");
        Map<String, rkg_3> map = rWb_1.id_break(rpY_2.id_native(jsonObject, "key"));
        String[] stringArray = rWb_1.id_class(rWb_1.id_class(rpY_2.id_volatile(jsonObject, "pattern")));
        int n = stringArray[0].length();
        int n2 = stringArray.length;
        rqs_3<rkg_3> rqs_32 = rWb_1.id_class(stringArray, map, n, n2);
        rdn_3 rdn_32 = rWb_1.id_class(rpY_2.id_native(jsonObject, "result"));
        return new rWb_1(rqO_22, string, n, n2, rqs_32, rdn_32);
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

