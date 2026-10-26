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
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.rNq_1;
import celestial.rNt_1;
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
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;

public class rNw_1
extends rzX_2<rNq_1> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNq_1 rNq_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNq_12, jsonSerializationContext);
        JsonArray jsonArray = new JsonArray();
        for (rNt_1 rNt_12 : rNq_12.id_break) {
            jsonArray.add((JsonElement)rNt_12.id_class(jsonSerializationContext));
        }
        jsonObject.add("modifiers", (JsonElement)jsonArray);
    }

    public rNq_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        JsonArray jsonArray = rpY_2.id_volatile(jsonObject, "modifiers");
        ArrayList arrayList = Lists.newArrayListWithExpectedSize((int)jsonArray.size());
        for (JsonElement jsonElement : jsonArray) {
            arrayList.add(rNt_1.id_class(rpY_2.id_private(jsonElement, "modifier"), jsonDeserializationContext));
        }
        if (arrayList.isEmpty()) {
            throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
        }
        return new rNq_1(rQz_1Array, arrayList);
    }
}

