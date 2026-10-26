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

import celestial.IP;
import celestial.fS_2;
import celestial.fb_3;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class fs_3
implements JsonDeserializer<fS_2> {
    private final IP id_class;

    public fs_3(IP iP) {
        this.id_class = iP;
    }

    private List<fb_3> id_class(JsonDeserializationContext jsonDeserializationContext, JsonArray jsonArray) {
        ArrayList arrayList = Lists.newArrayList();
        for (JsonElement jsonElement : jsonArray) {
            arrayList.add((fb_3)jsonDeserializationContext.deserialize(jsonElement, fb_3.class));
        }
        return arrayList;
    }

    public fS_2 id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return new fS_2(this.id_class.id_class(), this.id_class(jsonDeserializationContext, jsonElement.getAsJsonArray()));
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

