/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rWW;
import celestial.rWb_1;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkw_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class rWz_1
implements rkf_3<rWW> {
    @Override
    public void id_class(ruu_3 ruu_32, rWW rWW2) {
        rWW2.id_class.id_class(ruu_32);
        rWW2.id_break.id_class(ruu_32);
        ruu_32.id_class(rWW2.id_byte);
    }

    public rWW id_class(rqO_2 rqO_22, ruu_3 ruu_32) {
        rkg_3 rkg_32 = rkg_3.id_break(ruu_32);
        rkg_3 rkg_33 = rkg_3.id_break(ruu_32);
        rdn_3 rdn_32 = ruu_32.id_extends();
        return new rWW(rqO_22, rkg_32, rkg_33, rdn_32);
    }

    public rWW id_class(rqO_2 rqO_22, JsonObject jsonObject) {
        rkg_3 rkg_32 = rkg_3.id_class((JsonElement)rpY_2.id_native(jsonObject, "base"));
        rkg_3 rkg_33 = rkg_3.id_class((JsonElement)rpY_2.id_native(jsonObject, "addition"));
        rdn_3 rdn_32 = rWb_1.id_class(rpY_2.id_native(jsonObject, "result"));
        return new rWW(rqO_22, rkg_32, rkg_33, rdn_32);
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

