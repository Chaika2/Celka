/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package celestial;

import celestial.rWD;
import celestial.rpY_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class rWU
implements JsonDeserializer<rWD>,
JsonSerializer<rWD> {
    public JsonElement id_class(rWD rWD2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (rWD2.id_break != null) {
            jsonObject.addProperty("max", (Number)rWD2.id_break);
        }
        if (rWD2.id_class != null) {
            jsonObject.addProperty("min", (Number)rWD2.id_class);
        }
        return jsonObject;
    }

    public rWD id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "value");
        Integer n = jsonObject.has("min") ? Integer.valueOf(rpY_2.id_extends(jsonObject, "min")) : null;
        Integer n2 = jsonObject.has("max") ? Integer.valueOf(rpY_2.id_extends(jsonObject, "max")) : null;
        return new rWD(n, n2);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.id_class((rWD)object, type, jsonSerializationContext);
    }
}

