/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.IU;
import celestial.fB_2;
import celestial.fE_2;
import celestial.fG_2;
import celestial.fP_2;
import celestial.fb_3;
import celestial.rpY_2;
import com.google.common.collect.Streams;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class fM_2
implements JsonDeserializer<fb_3> {
    public static fB_2 id_class(JsonObject jsonObject) {
        Set set = jsonObject.entrySet();
        if (set.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
        }
        if (set.size() == 1) {
            if (jsonObject.has("OR")) {
                List list = Streams.stream((Iterable)rpY_2.id_volatile(jsonObject, "OR")).map(jsonElement -> fM_2.id_class(jsonElement.getAsJsonObject())).collect(Collectors.toList());
                return new fE_2(list);
            }
            if (jsonObject.has("AND")) {
                List list = Streams.stream((Iterable)rpY_2.id_volatile(jsonObject, "AND")).map(jsonElement -> fM_2.id_class(jsonElement.getAsJsonObject())).collect(Collectors.toList());
                return new fP_2(list);
            }
            return fM_2.id_class((Map.Entry)set.iterator().next());
        }
        return new fP_2(set.stream().map(fM_2::id_class).collect(Collectors.toList()));
    }

    private static fB_2 id_class(Map.Entry<String, JsonElement> entry) {
        return new fG_2(entry.getKey(), entry.getValue().getAsString());
    }

    public fb_3 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        return new fb_3(this.id_break(jsonObject), (IU)jsonDeserializationContext.deserialize(jsonObject.get("apply"), IU.class));
    }

    private fB_2 id_break(JsonObject jsonObject) {
        return jsonObject.has("when") ? fM_2.id_class(rpY_2.id_native(jsonObject, "when")) : fB_2.id_class;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

