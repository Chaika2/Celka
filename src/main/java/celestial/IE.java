/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.IG;
import celestial.IM;
import celestial.IS;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rpB_2;
import celestial.rpY_2;
import celestial.rpr_3;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;

public class IE
implements JsonDeserializer<IS> {
    private rpB_2 id_byte(JsonObject jsonObject) {
        String string = rpY_2.id_case(jsonObject, "axis");
        rpB_2 rpB_22 = rpB_2.id_class(string.toLowerCase(Locale.ROOT));
        if (rpB_22 == null) {
            throw new JsonParseException("Invalid rotation axis: " + string);
        }
        return rpB_22;
    }

    protected IE() {
    }

    private rpr_3 id_class(String string) {
        rpr_3 rpr_32 = rpr_3.id_class(string);
        if (rpr_32 == null) {
            throw new JsonParseException("Unknown facing: " + string);
        }
        return rpr_32;
    }

    private Map<rpr_3, IG> id_class(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Map<rpr_3, IG> map = this.id_break(jsonDeserializationContext, jsonObject);
        if (map.isEmpty()) {
            throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
        }
        return map;
    }

    private rje_3 id_class(JsonObject jsonObject, String string) {
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

    private IM id_class(JsonObject jsonObject) {
        IM iM = null;
        if (jsonObject.has("rotation")) {
            JsonObject jsonObject2 = rpY_2.id_native(jsonObject, "rotation");
            rje_3 rje_32 = this.id_class(jsonObject2, "origin");
            rje_32.id_class(0.0625f);
            rpB_2 rpB_22 = this.id_byte(jsonObject2);
            float f = this.id_break(jsonObject2);
            boolean bl = rpY_2.id_class(jsonObject2, "rescale", false);
            iM = new IM(rje_32, rpB_22, f, bl);
        }
        return iM;
    }

    public IS id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        rje_3 rje_32 = this.id_throws(jsonObject);
        rje_3 rje_33 = this.id_protected(jsonObject);
        IM iM = this.id_class(jsonObject);
        Map<rpr_3, IG> map = this.id_class(jsonDeserializationContext, jsonObject);
        if (jsonObject.has("shade") && !rpY_2.id_break(jsonObject, "shade")) {
            throw new JsonParseException("Expected shade to be a Boolean");
        }
        boolean bl = rpY_2.id_class(jsonObject, "shade", true);
        return new IS(rje_32, rje_33, map, iM, bl);
    }

    private Map<rpr_3, IG> id_break(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        EnumMap enumMap = Maps.newEnumMap(rpr_3.class);
        JsonObject jsonObject2 = rpY_2.id_native(jsonObject, "faces");
        for (Map.Entry entry : jsonObject2.entrySet()) {
            rpr_3 rpr_32 = this.id_class((String)entry.getKey());
            enumMap.put(rpr_32, (IG)jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), IG.class));
        }
        return enumMap;
    }

    private float id_break(JsonObject jsonObject) {
        float f = rpY_2.id_implements(jsonObject, "angle");
        if (f != 0.0f && rfU_2.id_throws(f) != 22.5f && rfU_2.id_throws(f) != 45.0f) {
            throw new JsonParseException("Invalid rotation " + f + " found, only -45/-22.5/0/22.5/45 allowed");
        }
        return f;
    }

    private rje_3 id_throws(JsonObject jsonObject) {
        rje_3 rje_32 = this.id_class(jsonObject, "from");
        if (!(rje_32.id_class() < -16.0f || rje_32.id_break() < -16.0f || rje_32.id_byte() < -16.0f || rje_32.id_class() > 32.0f || rje_32.id_break() > 32.0f || rje_32.id_byte() > 32.0f)) {
            return rje_32;
        }
        throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + rje_32);
    }

    private rje_3 id_protected(JsonObject jsonObject) {
        rje_3 rje_32 = this.id_class(jsonObject, "to");
        if (!(rje_32.id_class() < -16.0f || rje_32.id_break() < -16.0f || rje_32.id_byte() < -16.0f || rje_32.id_class() > 32.0f || rje_32.id_break() > 32.0f || rje_32.id_byte() > 32.0f)) {
            return rje_32;
        }
        throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + rje_32);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

