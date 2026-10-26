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
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.rVa_1;
import celestial.rgH_2;
import celestial.rgc_3;
import celestial.rgl_3;
import celestial.rgy_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rqX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;

public class rgm_3
implements JsonDeserializer<rgc_3>,
JsonSerializer<rgc_3> {
    private static rgl_3 id_byte(JsonObject jsonObject) {
        if (jsonObject.has("clickEvent")) {
            JsonObject jsonObject2 = rpY_2.id_native(jsonObject, "clickEvent");
            String string = rpY_2.id_class(jsonObject2, "action", (String)null);
            rgH_2 rgH_22 = string == null ? null : rgH_2.id_class(string);
            String string2 = rpY_2.id_class(jsonObject2, "value", (String)null);
            if (rgH_22 != null && string2 != null && rgH_22.id_class()) {
                return new rgl_3(rgH_22, string2);
            }
        }
        return null;
    }

    private static Boolean id_class(JsonObject jsonObject, String string) {
        return jsonObject.has(string) ? Boolean.valueOf(jsonObject.get(string).getAsBoolean()) : null;
    }

    public JsonElement id_class(rgc_3 rgc_32, Type type, JsonSerializationContext jsonSerializationContext) {
        if (rgc_32.id_catch()) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        if (rgc_32.id_protected != null) {
            jsonObject.addProperty("bold", rgc_32.id_protected);
        }
        if (rgc_32.id_throws != null) {
            jsonObject.addProperty("italic", rgc_32.id_throws);
        }
        if (rgc_32.id_case != null) {
            jsonObject.addProperty("underlined", rgc_32.id_case);
        }
        if (rgc_32.id_catch != null) {
            jsonObject.addProperty("strikethrough", rgc_32.id_catch);
        }
        if (rgc_32.id_private != null) {
            jsonObject.addProperty("obfuscated", rgc_32.id_private);
        }
        if (rgc_32.id_byte != null) {
            jsonObject.addProperty("color", rgc_32.id_byte.id_break());
        }
        if (rgc_32.id_extends != null) {
            jsonObject.add("insertion", jsonSerializationContext.serialize((Object)rgc_32.id_extends));
        }
        if (rgc_32.id_implements != null) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("action", rgc_32.id_implements.id_class().id_break());
            jsonObject2.addProperty("value", rgc_32.id_implements.id_break());
            jsonObject.add("clickEvent", (JsonElement)jsonObject2);
        }
        if (rgc_32.id_finally != null) {
            jsonObject.add("hoverEvent", (JsonElement)rgc_32.id_finally.id_byte());
        }
        if (rgc_32.id_native != null) {
            jsonObject.addProperty("font", rgc_32.id_native.toString());
        }
        return jsonObject;
    }

    public rgc_3 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject == null) {
                return null;
            }
            Boolean bl = rgm_3.id_class(jsonObject, "bold");
            Boolean bl2 = rgm_3.id_class(jsonObject, "italic");
            Boolean bl3 = rgm_3.id_class(jsonObject, "underlined");
            Boolean bl4 = rgm_3.id_class(jsonObject, "strikethrough");
            Boolean bl5 = rgm_3.id_class(jsonObject, "obfuscated");
            rVa_1 rVa_12 = rgm_3.id_throws(jsonObject);
            String string = rgm_3.id_protected(jsonObject);
            rgl_3 rgl_32 = rgm_3.id_byte(jsonObject);
            rgy_3 rgy_32 = rgm_3.id_break(jsonObject);
            rqO_2 rqO_22 = rgm_3.id_class(jsonObject);
            return new rgc_3(rVa_12, bl, bl2, bl3, bl4, bl5, rgl_32, rgy_32, string, rqO_22);
        }
        return null;
    }

    private static rqO_2 id_class(JsonObject jsonObject) {
        if (jsonObject.has("font")) {
            String string = rpY_2.id_case(jsonObject, "font");
            try {
                return new rqO_2(string);
            }
            catch (rqX_2 rqX_22) {
                throw new JsonSyntaxException("Invalid font name: " + string);
            }
        }
        return null;
    }

    private static rgy_3 id_break(JsonObject jsonObject) {
        JsonObject jsonObject2;
        rgy_3 rgy_32;
        if (jsonObject.has("hoverEvent") && (rgy_32 = rgy_3.id_class(jsonObject2 = rpY_2.id_native(jsonObject, "hoverEvent"))) != null && rgy_32.id_class().id_class()) {
            return rgy_32;
        }
        return null;
    }

    private static rVa_1 id_throws(JsonObject jsonObject) {
        if (jsonObject.has("color")) {
            String string = rpY_2.id_case(jsonObject, "color");
            return rVa_1.id_class(string);
        }
        return null;
    }

    private static String id_protected(JsonObject jsonObject) {
        return rpY_2.id_class(jsonObject, "insertion", (String)null);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.id_class((rgc_3)object, type, jsonSerializationContext);
    }
}

