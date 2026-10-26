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

import celestial.OD;
import celestial.Oj_1;
import celestial.rpY_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;

public class OV
implements JsonDeserializer<Oj_1>,
JsonSerializer<Oj_1> {
    public Oj_1 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "advancement");
        JsonObject jsonObject2 = rpY_2.id_class(jsonObject, "criteria", new JsonObject());
        Oj_1 oj_1 = new Oj_1();
        for (Map.Entry entry : jsonObject2.entrySet()) {
            String string = (String)entry.getKey();
            oj_1.id_class.put(string, OD.id_class(rpY_2.id_class((JsonElement)entry.getValue(), string)));
        }
        return oj_1;
    }

    public JsonElement id_class(Oj_1 oj_1, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        for (Map.Entry<String, OD> entry : oj_1.id_class.entrySet()) {
            OD oD = entry.getValue();
            if (!oD.id_class()) continue;
            jsonObject2.add(entry.getKey(), oD.id_throws());
        }
        if (!jsonObject2.entrySet().isEmpty()) {
            jsonObject.add("criteria", (JsonElement)jsonObject2);
        }
        jsonObject.addProperty("done", Boolean.valueOf(oj_1.id_class()));
        return jsonObject;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.id_class((Oj_1)object, type, jsonSerializationContext);
    }
}

