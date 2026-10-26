/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.IU;
import celestial.Ir_1;
import celestial.fS_2;
import celestial.rpY_2;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class IB
implements JsonDeserializer<Ir_1> {
    protected Map<String, IU> id_class(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("variants")) {
            JsonObject jsonObject2 = rpY_2.id_native(jsonObject, "variants");
            for (Map.Entry entry : jsonObject2.entrySet()) {
                hashMap.put((String)entry.getKey(), (IU)jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), IU.class));
            }
        }
        return hashMap;
    }

    public Ir_1 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Map<String, IU> map = this.id_class(jsonDeserializationContext, jsonObject);
        fS_2 fS_22 = this.id_break(jsonDeserializationContext, jsonObject);
        if (!map.isEmpty() || fS_22 != null && !fS_22.id_break().isEmpty()) {
            return new Ir_1(map, fS_22);
        }
        throw new JsonParseException("Neither 'variants' nor 'multipart' found");
    }

    protected fS_2 id_break(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        if (!jsonObject.has("multipart")) {
            return null;
        }
        JsonArray jsonArray = rpY_2.id_volatile(jsonObject, "multipart");
        return (fS_2)jsonDeserializationContext.deserialize((JsonElement)jsonArray, fS_2.class);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

