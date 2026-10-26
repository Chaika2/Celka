/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.rNL;
import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rzE_2;
import celestial.rzY_2;
import celestial.rzb_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class rza_3<T extends rzY_2>
extends rzb_3<T> {
    @Override
    public /* synthetic */ rzE_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, T t, JsonSerializationContext jsonSerializationContext) {
        if (((rzY_2)t).id_protected != 1) {
            jsonObject.addProperty("weight", (Number)((rzY_2)t).id_protected);
        }
        if (((rzY_2)t).id_throws != 0) {
            jsonObject.addProperty("quality", (Number)((rzY_2)t).id_throws);
        }
        if (!ArrayUtils.isEmpty((Object[])((rzY_2)t).id_case)) {
            jsonObject.add("functions", jsonSerializationContext.serialize((Object)((rzY_2)t).id_case));
        }
    }

    public final T id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        int n = rpY_2.id_class(jsonObject, "weight", 1);
        int n2 = rpY_2.id_class(jsonObject, "quality", 0);
        rNL[] rNLArray = rpY_2.id_class(jsonObject, "functions", new rNL[0], jsonDeserializationContext, rNL[].class);
        return this.id_break(jsonObject, jsonDeserializationContext, n, n2, rQz_1Array, rNLArray);
    }

    protected abstract T id_break(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, rQz_1[] var5, rNL[] var6);
}

