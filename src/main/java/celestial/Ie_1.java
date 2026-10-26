/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 */
package celestial;

import celestial.IK;
import celestial.IU;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Ie_1
implements JsonDeserializer<IU> {
    public IU id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        ArrayList arrayList = Lists.newArrayList();
        if (jsonElement.isJsonArray()) {
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            if (jsonArray.size() == 0) {
                throw new JsonParseException("Empty variant array");
            }
            for (JsonElement jsonElement2 : jsonArray) {
                arrayList.add((IK)jsonDeserializationContext.deserialize(jsonElement2, IK.class));
            }
        } else {
            arrayList.add((IK)jsonDeserializationContext.deserialize(jsonElement, IK.class));
        }
        return new IU(arrayList);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

