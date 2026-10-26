/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rVL;
import celestial.rWk_1;
import celestial.rWx_1;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkw_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class rWd_1<T extends rWx_1>
implements rkf_3<T> {
    public final rWk_1<T> id_synchronized;

    protected rWd_1(rWk_1<T> rWk_12) {
        this.id_synchronized = rWk_12;
    }

    @Override
    public void id_class(ruu_3 ruu_32, T t) {
        ruu_32.id_class(((rWx_1)t).id_protected);
        ((rWx_1)t).id_class.id_class(ruu_32);
        ruu_32.id_class(((rWx_1)t).id_break);
    }

    public T id_class(rqO_2 rqO_22, ruu_3 ruu_32) {
        String string = ruu_32.id_throws(Short.MAX_VALUE);
        rkg_3 rkg_32 = rkg_3.id_break(ruu_32);
        rdn_3 rdn_32 = ruu_32.id_extends();
        return this.id_synchronized.create(rqO_22, string, rkg_32, rdn_32);
    }

    public T id_class(rqO_2 rqO_22, JsonObject jsonObject) {
        String string = rpY_2.id_class(jsonObject, "group", "");
        rkg_3 rkg_32 = rpY_2.id_byte(jsonObject, "ingredient") ? rkg_3.id_class((JsonElement)rpY_2.id_volatile(jsonObject, "ingredient")) : rkg_3.id_class((JsonElement)rpY_2.id_native(jsonObject, "ingredient"));
        String string2 = rpY_2.id_case(jsonObject, "result");
        int n = rpY_2.id_extends(jsonObject, "count");
        rdn_3 rdn_32 = new rdn_3(rVL.id_for.id_class(new rqO_2(string2)), n);
        return this.id_synchronized.create(rqO_22, string, rkg_32, rdn_32);
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

