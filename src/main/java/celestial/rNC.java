/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNn_1;
import celestial.rQz_1;
import celestial.rWD;
import celestial.rpY_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNC
extends rzX_2<rNn_1> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNn_1 rNn_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNn_12, jsonSerializationContext);
        jsonObject.add("limit", jsonSerializationContext.serialize((Object)rNn_12.id_break));
    }

    public rNn_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rWD rWD2 = rpY_2.id_class(jsonObject, "limit", jsonDeserializationContext, rWD.class);
        return new rNn_1(rQz_1Array, rWD2);
    }
}

