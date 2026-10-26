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

import celestial.rgP_2;
import celestial.rpY_2;
import celestial.ruC_2;
import celestial.run_3;
import celestial.ruy_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class ruH_2
implements JsonDeserializer<run_3>,
JsonSerializer<run_3> {
    public JsonElement id_class(run_3 run_32, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (run_32.id_class() != null) {
            jsonObject.add("description", jsonSerializationContext.serialize((Object)run_32.id_class()));
        }
        if (run_32.id_break() != null) {
            jsonObject.add("players", jsonSerializationContext.serialize((Object)run_32.id_break()));
        }
        if (run_32.id_byte() != null) {
            jsonObject.add("version", jsonSerializationContext.serialize((Object)run_32.id_byte()));
        }
        if (run_32.id_protected() != null) {
            jsonObject.addProperty("favicon", run_32.id_protected());
        }
        return jsonObject;
    }

    public run_3 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "status");
        run_3 run_32 = new run_3();
        if (jsonObject.has("description")) {
            run_32.id_class((rgP_2)jsonDeserializationContext.deserialize(jsonObject.get("description"), rgP_2.class));
        }
        if (jsonObject.has("players")) {
            run_32.id_class((ruC_2)jsonDeserializationContext.deserialize(jsonObject.get("players"), ruC_2.class));
        }
        if (jsonObject.has("version")) {
            run_32.id_class((ruy_3)jsonDeserializationContext.deserialize(jsonObject.get("version"), ruy_3.class));
        }
        if (jsonObject.has("favicon")) {
            run_32.id_class(rpY_2.id_case(jsonObject, "favicon"));
        }
        return run_32;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.id_class((run_3)object, type, jsonSerializationContext);
    }
}

