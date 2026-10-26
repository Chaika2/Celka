/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNJ;
import celestial.rNh_1;
import celestial.rNs_1;
import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.ArrayList;

public class rNX
extends rzX_2<rNs_1> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNs_1 rNs_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNs_12, jsonSerializationContext);
        jsonObject.addProperty("source", rNs_12.id_break.sourceName);
        JsonArray jsonArray = new JsonArray();
        rNs_12.id_byte.stream().map(rNh_1::id_class).forEach(arg_0 -> ((JsonArray)jsonArray).add(arg_0));
        jsonObject.add("ops", (JsonElement)jsonArray);
    }

    public rNs_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rNJ rNJ2 = rNJ.id_class(rpY_2.id_case(jsonObject, "source"));
        ArrayList arrayList = Lists.newArrayList();
        for (JsonElement jsonElement : rpY_2.id_volatile(jsonObject, "ops")) {
            JsonObject jsonObject2 = rpY_2.id_private(jsonElement, "op");
            arrayList.add(rNh_1.id_class(jsonObject2));
        }
        return new rNs_1(rQz_1Array, rNJ2, arrayList);
    }
}

