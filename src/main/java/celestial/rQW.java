/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rQk_1;
import celestial.rWY;
import celestial.rpY_2;
import celestial.rzB_2;
import celestial.rzV_2;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class rQW
implements rWY<rQk_1> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQk_1 rQk_12, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject2 = new JsonObject();
        for (Map.Entry<String, rzV_2> entry : rQk_12.id_class.entrySet()) {
            jsonObject2.add(entry.getKey(), jsonSerializationContext.serialize((Object)entry.getValue()));
        }
        jsonObject.add("scores", (JsonElement)jsonObject2);
        jsonObject.add("entity", jsonSerializationContext.serialize((Object)rQk_12.id_break));
    }

    public rQk_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Set set = rpY_2.id_native(jsonObject, "scores").entrySet();
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        for (Map.Entry entry : set) {
            linkedHashMap.put((String)entry.getKey(), rpY_2.id_class((JsonElement)entry.getValue(), "score", jsonDeserializationContext, rzV_2.class));
        }
        return new rQk_1(linkedHashMap, rpY_2.id_class(jsonObject, "entity", jsonDeserializationContext, rzB_2.class));
    }
}

