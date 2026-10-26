/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rND;
import celestial.rQz_1;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rpY_2;
import celestial.rzB_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;

public class rNU
extends rzX_2<rND> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rND rND2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rND2, jsonSerializationContext);
        jsonObject.addProperty("replace", Boolean.valueOf(rND2.id_break));
        JsonArray jsonArray = new JsonArray();
        for (rgP_2 rgP_22 : rND2.id_byte) {
            jsonArray.add(rgB_2.id_break(rgP_22));
        }
        jsonObject.add("lore", (JsonElement)jsonArray);
        if (rND2.id_protected != null) {
            jsonObject.add("entity", jsonSerializationContext.serialize((Object)rND2.id_protected));
        }
    }

    public rND id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        boolean bl = rpY_2.id_class(jsonObject, "replace", false);
        List list = (List)Streams.stream((Iterable)rpY_2.id_volatile(jsonObject, "lore")).map(rgB_2::id_class).collect(ImmutableList.toImmutableList());
        rzB_2 rzB_22 = rpY_2.id_class(jsonObject, "entity", null, jsonDeserializationContext, rzB_2.class);
        return new rND(rQz_1Array, bl, list, rzB_22);
    }
}

