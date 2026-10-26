/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.IZ;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

public class Iv_1
implements JsonDeserializer<IZ> {
    protected Iv_1() {
    }

    protected Map<rqO_2, Float> id_class(JsonObject jsonObject) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        JsonObject jsonObject2 = rpY_2.id_native(jsonObject, "predicate");
        for (Map.Entry entry : jsonObject2.entrySet()) {
            linkedHashMap.put(new rqO_2((String)entry.getKey()), Float.valueOf(rpY_2.id_protected((JsonElement)entry.getValue(), (String)entry.getKey())));
        }
        return linkedHashMap;
    }

    public IZ id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "model"));
        Map<rqO_2, Float> map = this.id_class(jsonObject);
        return new IZ(rqO_22, map);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

