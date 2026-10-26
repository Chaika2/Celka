/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package celestial;

import celestial.rpY_2;
import celestial.rzV_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class rzg_3
implements JsonDeserializer<rzV_2>,
JsonSerializer<rzV_2> {
    public JsonElement id_class(rzV_2 rzV_22, Type type, JsonSerializationContext jsonSerializationContext) {
        if (rzV_22.id_protected == rzV_22.id_throws) {
            return new JsonPrimitive((Number)Float.valueOf(rzV_22.id_protected));
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("min", (Number)Float.valueOf(rzV_22.id_protected));
        jsonObject.addProperty("max", (Number)Float.valueOf(rzV_22.id_throws));
        return jsonObject;
    }

    public rzV_2 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (rpY_2.id_break(jsonElement)) {
            return new rzV_2(rpY_2.id_protected(jsonElement, "value"));
        }
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "value");
        float f = rpY_2.id_implements(jsonObject, "min");
        float f2 = rpY_2.id_implements(jsonObject, "max");
        return new rzV_2(f, f2);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.id_class((rzV_2)object, type, jsonSerializationContext);
    }
}

