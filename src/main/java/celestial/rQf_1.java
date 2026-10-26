/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rQI;
import celestial.rWY;
import celestial.rpY_2;
import celestial.rzV_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQf_1
implements rWY<rQI> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQI rQI2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("period", (Number)rQI2.id_class);
        jsonObject.add("value", jsonSerializationContext.serialize((Object)rQI2.id_break));
    }

    public rQI id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Long l = jsonObject.has("period") ? Long.valueOf(rpY_2.id_finally(jsonObject, "period")) : null;
        rzV_2 rzV_22 = rpY_2.id_class(jsonObject, "value", jsonDeserializationContext, rzV_2.class);
        return new rQI(l, rzV_22);
    }
}

