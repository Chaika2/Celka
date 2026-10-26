/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNv_1;
import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rzB_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNF
extends rzX_2<rNv_1> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNv_1 rNv_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNv_12, jsonSerializationContext);
        jsonObject.add("entity", jsonSerializationContext.serialize((Object)rNv_12.id_break));
    }

    public rNv_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rzB_2 rzB_22 = rpY_2.id_class(jsonObject, "entity", jsonDeserializationContext, rzB_2.class);
        return new rNv_1(rQz_1Array, rzB_22);
    }
}

