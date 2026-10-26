/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 */
package celestial;

import celestial.ev_3;
import celestial.rNx_1;
import celestial.rQz_1;
import celestial.rVL;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;

public class rNk_1
extends rzX_2<rNx_1> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNx_1 rNx_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNx_12, jsonSerializationContext);
        if (!rNx_12.id_byte.isEmpty()) {
            JsonArray jsonArray = new JsonArray();
            for (ev_3 ev_32 : rNx_12.id_byte) {
                rqO_2 rqO_22 = rVL.id_boolean.id_break(ev_32);
                if (rqO_22 == null) {
                    throw new IllegalArgumentException("Don't know how to serialize enchantment " + ev_32);
                }
                jsonArray.add((JsonElement)new JsonPrimitive(rqO_22.toString()));
            }
            jsonObject.add("enchantments", (JsonElement)jsonArray);
        }
    }

    public rNx_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("enchantments")) {
            for (JsonElement jsonElement : rpY_2.id_volatile(jsonObject, "enchantments")) {
                String string = rpY_2.id_class(jsonElement, "enchantment");
                ev_3 ev_32 = rVL.id_boolean.id_break(new rqO_2(string)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + string + "'"));
                arrayList.add(ev_32);
            }
        }
        return new rNx_1(rQz_1Array, arrayList);
    }
}

