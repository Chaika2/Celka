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
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzL_2;
import celestial.rzN_2;
import celestial.rzk_3;
import celestial.rzz_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.apache.commons.lang3.ArrayUtils;

public class rzn_3
implements JsonDeserializer<rzL_2>,
JsonSerializer<rzL_2> {
    public JsonElement id_class(rzL_2 rzL_22, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (rzL_22.id_protected != rzL_2.id_break) {
            rqO_2 rqO_22 = rzz_3.id_class(rzL_22.id_protected);
            if (rqO_22 != null) {
                jsonObject.addProperty("type", rqO_22.toString());
            } else {
                rzL_2.id_byte.warn("Failed to find id for param set " + rzL_22.id_protected);
            }
        }
        if (rzL_22.id_throws.length > 0) {
            jsonObject.add("pools", jsonSerializationContext.serialize((Object)rzL_22.id_throws));
        }
        if (!ArrayUtils.isEmpty((Object[])rzL_22.id_case)) {
            jsonObject.add("functions", jsonSerializationContext.serialize((Object)rzL_22.id_case));
        }
        return jsonObject;
    }

    public rzL_2 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        rNL[] rNLArray;
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "loot table");
        rzN_2[] rzN_2Array = rpY_2.id_class(jsonObject, "pools", new rzN_2[0], jsonDeserializationContext, rzN_2[].class);
        rzk_3 rzk_32 = null;
        if (jsonObject.has("type")) {
            rNLArray = rpY_2.id_case(jsonObject, "type");
            rzk_32 = rzz_3.id_class(new rqO_2((String)rNLArray));
        }
        rNLArray = rpY_2.id_class(jsonObject, "functions", new rNL[0], jsonDeserializationContext, rNL[].class);
        return new rzL_2(rzk_32 != null ? rzk_32 : rzz_3.id_extends, rzN_2Array, rNLArray);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.id_class((rzL_2)object, type, jsonSerializationContext);
    }
}

