/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.NT;
import celestial.NY;
import celestial.Nq_1;
import celestial.rpY_2;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class No_1
implements JsonDeserializer<NY> {
    private NT id_class(JsonObject jsonObject, NT nT) {
        NT nT2 = nT;
        if (jsonObject.has("type")) {
            nT2 = NT.id_class(rpY_2.id_case(jsonObject, "type"));
            Validate.notNull((Object)((Object)nT2), (String)"Invalid type", (Object[])new Object[0]);
        }
        return nT2;
    }

    private List<Nq_1> id_class(JsonObject jsonObject) {
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("sounds")) {
            JsonArray jsonArray = rpY_2.id_volatile(jsonObject, "sounds");
            for (int i = 0; i < jsonArray.size(); ++i) {
                JsonElement jsonElement = jsonArray.get(i);
                if (rpY_2.id_class(jsonElement)) {
                    String string = rpY_2.id_class(jsonElement, "sound");
                    arrayList.add(new Nq_1(string, 1.0f, 1.0f, 1, NT.FILE, false, false, 16));
                    continue;
                }
                arrayList.add(this.id_break(rpY_2.id_private(jsonElement, "sound")));
            }
        }
        return arrayList;
    }

    public NY id_class(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "entry");
        boolean bl = rpY_2.id_class(jsonObject, "replace", false);
        String string = rpY_2.id_class(jsonObject, "subtitle", (String)null);
        List<Nq_1> list = this.id_class(jsonObject);
        return new NY(list, bl, string);
    }

    private Nq_1 id_break(JsonObject jsonObject) {
        String string = rpY_2.id_case(jsonObject, "name");
        NT nT = this.id_class(jsonObject, NT.FILE);
        float f = rpY_2.id_class(jsonObject, "volume", 1.0f);
        Validate.isTrue((f > 0.0f ? 1 : 0) != 0, (String)"Invalid volume", (Object[])new Object[0]);
        float f2 = rpY_2.id_class(jsonObject, "pitch", 1.0f);
        Validate.isTrue((f2 > 0.0f ? 1 : 0) != 0, (String)"Invalid pitch", (Object[])new Object[0]);
        int n = rpY_2.id_class(jsonObject, "weight", 1);
        Validate.isTrue((n > 0 ? 1 : 0) != 0, (String)"Invalid weight", (Object[])new Object[0]);
        boolean bl = rpY_2.id_class(jsonObject, "preload", false);
        boolean bl2 = rpY_2.id_class(jsonObject, "stream", false);
        int n2 = rpY_2.id_class(jsonObject, "attenuation_distance", 16);
        return new Nq_1(string, f, f2, n, nT, bl2, bl, n2);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return this.id_class(jsonElement, type, jsonDeserializationContext);
    }
}

