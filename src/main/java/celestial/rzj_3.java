/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rWK;
import celestial.rWn_1;
import celestial.rWy_1;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzV_2;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Map;

public class rzj_3 {
    private static final Map<rqO_2, Class<? extends rWK>> id_class = Maps.newHashMap();

    static {
        id_class.put(rWK.id_break, rzV_2.class);
        id_class.put(rWK.id_byte, rWn_1.class);
        id_class.put(rWK.id_class, rWy_1.class);
    }

    public static rWK id_class(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonPrimitive()) {
            return (rWK)jsonDeserializationContext.deserialize(jsonElement, rWy_1.class);
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String string = rpY_2.id_class(jsonObject, "type", rWK.id_break.toString());
        Class<? extends rWK> clazz = id_class.get(new rqO_2(string));
        if (clazz == null) {
            throw new JsonParseException("Unknown generator: " + string);
        }
        return (rWK)jsonDeserializationContext.deserialize((JsonElement)jsonObject, clazz);
    }

    public static JsonElement id_class(rWK rWK2, JsonSerializationContext jsonSerializationContext) {
        JsonElement jsonElement = jsonSerializationContext.serialize((Object)rWK2);
        if (jsonElement.isJsonObject()) {
            jsonElement.getAsJsonObject().addProperty("type", rWK2.id_class().toString());
        }
        return jsonElement;
    }
}

