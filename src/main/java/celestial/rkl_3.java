/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rVL;
import celestial.rdn_3;
import celestial.rkH_2;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkv_3;
import celestial.rkw_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.ruu_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class rkl_3<T extends rkv_3>
implements rkf_3<T> {
    private final int id_synchronized;
    private final rkH_2<T> id_return;

    public rkl_3(rkH_2<T> rkH_22, int n) {
        this.id_synchronized = n;
        this.id_return = rkH_22;
    }

    @Override
    public void id_class(ruu_3 ruu_32, T t) {
        ruu_32.id_class(((rkv_3)t).id_byte);
        ((rkv_3)t).id_protected.id_class(ruu_32);
        ruu_32.id_class(((rkv_3)t).id_throws);
        ruu_32.writeFloat(((rkv_3)t).id_case);
        ruu_32.id_protected(((rkv_3)t).id_catch);
    }

    public T id_class(rqO_2 rqO_22, JsonObject jsonObject) {
        String string = rpY_2.id_class(jsonObject, "group", "");
        JsonArray jsonArray = rpY_2.id_byte(jsonObject, "ingredient") ? rpY_2.id_volatile(jsonObject, "ingredient") : rpY_2.id_native(jsonObject, "ingredient");
        rkg_3 rkg_32 = rkg_3.id_class((JsonElement)jsonArray);
        String string2 = rpY_2.id_case(jsonObject, "result");
        rqO_2 rqO_23 = new rqO_2(string2);
        rdn_3 rdn_32 = new rdn_3(rVL.id_for.id_break(rqO_23).orElseThrow(() -> new IllegalStateException("Item: " + string2 + " does not exist")));
        float f = rpY_2.id_class(jsonObject, "experience", 0.0f);
        int n = rpY_2.id_class(jsonObject, "cookingtime", this.id_synchronized);
        return this.id_return.create(rqO_22, string, rkg_32, rdn_32, f, n);
    }

    public T id_class(rqO_2 rqO_22, ruu_3 ruu_32) {
        String string = ruu_32.id_throws(Short.MAX_VALUE);
        rkg_3 rkg_32 = rkg_3.id_break(ruu_32);
        rdn_3 rdn_32 = ruu_32.id_extends();
        float f = ruu_32.readFloat();
        int n = ruu_32.id_case();
        return this.id_return.create(rqO_22, string, rkg_32, rdn_32, f, n);
    }

    @Override
    public /* synthetic */ rkw_3 id_break(rqO_2 rqO_22, ruu_3 ruu_32) {
        return this.id_class(rqO_22, ruu_32);
    }

    @Override
    public /* synthetic */ rkw_3 id_break(rqO_2 rqO_22, JsonObject jsonObject) {
        return this.id_class(rqO_22, jsonObject);
    }
}

