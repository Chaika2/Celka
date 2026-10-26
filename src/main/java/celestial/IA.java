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

import celestial.IL;
import celestial.rje_3;
import celestial.rpY_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class IA
implements JsonDeserializer<IL> {
    private static final rje_3 id_class = new rje_3(0.0f, 0.0f, 0.0f);
    private static final rje_3 id_break = new rje_3(0.0f, 0.0f, 0.0f);
    private static final rje_3 id_byte = new rje_3(1.0f, 1.0f, 1.0f);

    protected IA() {
    }

    public IL id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        rje_3 rje_32 = this.id_class(jsonObject, "rotation", id_class);
        rje_3 rje_33 = this.id_class(jsonObject, "translation", id_break);
        rje_33.id_class(0.0625f);
        rje_33.id_class(-5.0f, 5.0f);
        rje_3 rje_34 = this.id_class(jsonObject, "scale", id_byte);
        rje_34.id_class(-4.0f, 4.0f);
        return new IL(rje_32, rje_33, rje_34);
    }

    private rje_3 id_class(JsonObject jsonObject, String string, rje_3 rje_32) {
        if (!jsonObject.has(string)) {
            return rje_32;
        }
        JsonArray jsonArray = rpY_2.id_volatile(jsonObject, string);
        if (jsonArray.size() != 3) {
            throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray.size());
        }
        float[] fArray = new float[3];
        for (int i = 0; i < fArray.length; ++i) {
            fArray[i] = rpY_2.id_protected(jsonArray.get(i), string + "[" + i + "]");
        }
        return new rje_3(fArray[0], fArray[1], fArray[2]);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

