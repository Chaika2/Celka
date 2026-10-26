/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.rpY_2;
import celestial.wD_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class wU_2
implements JsonDeserializer<wD_2> {
    protected wU_2() {
    }

    protected int id_class(JsonObject jsonObject) {
        int n = rpY_2.id_class(jsonObject, "rotation", 0);
        if (n >= 0 && n % 90 == 0 && n / 90 <= 3) {
            return n;
        }
        throw new JsonParseException("Invalid rotation " + n + " found, only 0/90/180/270 allowed");
    }

    public wD_2 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        float[] fArray = this.id_break(jsonObject);
        int n = this.id_class(jsonObject);
        return new wD_2(fArray, n);
    }

    private float[] id_break(JsonObject jsonObject) {
        if (!jsonObject.has("uv")) {
            return null;
        }
        JsonArray jsonArray = rpY_2.id_volatile(jsonObject, "uv");
        if (jsonArray.size() != 4) {
            throw new JsonParseException("Expected 4 uv values, found: " + jsonArray.size());
        }
        float[] fArray = new float[4];
        for (int i = 0; i < fArray.length; ++i) {
            fArray[i] = rpY_2.id_protected(jsonArray.get(i), "uv[" + i + "]");
        }
        return fArray;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

