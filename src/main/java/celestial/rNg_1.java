/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNV;
import celestial.rQz_1;
import celestial.rWK;
import celestial.rzO_2;
import celestial.rzX_2;
import celestial.rzj_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNg_1
extends rzX_2<rNV> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNV rNV2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNV2, jsonSerializationContext);
        jsonObject.add("count", rzj_3.id_class(rNV2.id_break, jsonSerializationContext));
    }

    public rNV id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rWK rWK2 = rzj_3.id_class(jsonObject.get("count"), jsonDeserializationContext);
        return new rNV(rQz_1Array, rWK2);
    }
}

