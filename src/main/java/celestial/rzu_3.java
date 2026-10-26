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
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.rNL;
import celestial.rQz_1;
import celestial.rWK;
import celestial.rpY_2;
import celestial.rzE_2;
import celestial.rzN_2;
import celestial.rzV_2;
import celestial.rzj_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.apache.commons.lang3.ArrayUtils;

public class rzu_3
implements JsonDeserializer<rzN_2>,
JsonSerializer<rzN_2> {
    public JsonElement id_class(rzN_2 rzN_22, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("rolls", rzj_3.id_class(rzN_22.id_case, jsonSerializationContext));
        jsonObject.add("entries", jsonSerializationContext.serialize((Object)rzN_22.id_class));
        if (rzN_22.id_catch.id_break() != 0.0f && rzN_22.id_catch.id_byte() != 0.0f) {
            jsonObject.add("bonus_rolls", jsonSerializationContext.serialize((Object)rzN_22.id_catch));
        }
        if (!ArrayUtils.isEmpty((Object[])rzN_22.id_break)) {
            jsonObject.add("conditions", jsonSerializationContext.serialize((Object)rzN_22.id_break));
        }
        if (!ArrayUtils.isEmpty((Object[])rzN_22.id_protected)) {
            jsonObject.add("functions", jsonSerializationContext.serialize((Object)rzN_22.id_protected));
        }
        return jsonObject;
    }

    public rzN_2 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "loot pool");
        rzE_2[] rzE_2Array = rpY_2.id_class(jsonObject, "entries", jsonDeserializationContext, rzE_2[].class);
        rQz_1[] rQz_1Array = rpY_2.id_class(jsonObject, "conditions", new rQz_1[0], jsonDeserializationContext, rQz_1[].class);
        rNL[] rNLArray = rpY_2.id_class(jsonObject, "functions", new rNL[0], jsonDeserializationContext, rNL[].class);
        rWK rWK2 = rzj_3.id_class(jsonObject.get("rolls"), jsonDeserializationContext);
        rzV_2 rzV_22 = rpY_2.id_class(jsonObject, "bonus_rolls", new rzV_2(0.0f, 0.0f), jsonDeserializationContext, rzV_2.class);
        return new rzN_2(rzE_2Array, rQz_1Array, rNLArray, rWK2, rzV_22);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.id_class((rzN_2)object, type, jsonSerializationContext);
    }
}

