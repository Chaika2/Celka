/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rgP_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class rwa_3
implements JsonDeserializer<rgP_2> {
    public rVi_1 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonPrimitive()) {
            return new rgN_2(jsonElement.getAsString());
        }
        if (jsonElement.isJsonArray()) {
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            rVi_1 rVi_12 = null;
            for (JsonElement jsonElement2 : jsonArray) {
                rVi_1 rVi_13 = this.id_class(jsonElement2, jsonElement2.getClass(), jsonDeserializationContext);
                if (rVi_12 == null) {
                    rVi_12 = rVi_13;
                    continue;
                }
                rVi_12.id_class(rVi_13);
            }
            return rVi_12;
        }
        throw new JsonParseException("Don't know how to turn " + jsonElement + " into a Component");
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

