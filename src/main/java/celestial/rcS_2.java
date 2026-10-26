/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.rLR;
import celestial.rQz_1;
import celestial.rVL;
import celestial.rcP_2;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzO_2;
import celestial.rzV_2;
import celestial.rzX_2;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;

public class rcS_2
extends rzX_2<rcP_2> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rcP_2 rcP_22, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rcP_22, jsonSerializationContext);
        if (!rcP_22.id_break.isEmpty()) {
            JsonArray jsonArray = new JsonArray();
            for (rLR rLR2 : rcP_22.id_break.keySet()) {
                JsonObject jsonObject2 = new JsonObject();
                rqO_2 rqO_22 = rVL.id_const.id_break(rLR2);
                if (rqO_22 == null) {
                    throw new IllegalArgumentException("Don't know how to serialize mob effect " + rLR2);
                }
                jsonObject2.add("type", (JsonElement)new JsonPrimitive(rqO_22.toString()));
                jsonObject2.add("duration", jsonSerializationContext.serialize((Object)rcP_22.id_break.get(rLR2)));
                jsonArray.add((JsonElement)jsonObject2);
            }
            jsonObject.add("effects", (JsonElement)jsonArray);
        }
    }

    public rcP_2 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("effects")) {
            for (JsonElement jsonElement : rpY_2.id_volatile(jsonObject, "effects")) {
                String string = rpY_2.id_case(jsonElement.getAsJsonObject(), "type");
                rLR rLR2 = rVL.id_const.id_break(new rqO_2(string)).orElseThrow(() -> new JsonSyntaxException("Unknown mob effect '" + string + "'"));
                rzV_2 rzV_22 = rpY_2.id_class(jsonElement.getAsJsonObject(), "duration", jsonDeserializationContext, rzV_2.class);
                hashMap.put(rLR2, rzV_22);
            }
        }
        return new rcP_2(rQz_1Array, hashMap);
    }
}

