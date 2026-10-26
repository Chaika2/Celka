/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rCF;
import celestial.rQa_1;
import celestial.rQz_1;
import celestial.rVL;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzO_2;
import celestial.rzX_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.HashSet;

public class rNr_1
extends rzX_2<rQa_1> {
    @Override
    public void id_class(JsonObject jsonObject, rQa_1 rQa_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rQa_12, jsonSerializationContext);
        jsonObject.addProperty("block", rVL.id_strictfp.id_break(rQa_12.id_break).toString());
        JsonArray jsonArray = new JsonArray();
        rQa_12.id_byte.forEach(rCZ2 -> jsonArray.add(rCZ2.id_throws()));
        jsonObject.add("properties", (JsonElement)jsonArray);
    }

    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    public rQa_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "block"));
        xd_3 xd_32 = rVL.id_strictfp.id_break(rqO_22).orElseThrow(() -> new IllegalArgumentException("Can't find block " + rqO_22));
        rCF<xd_3, xc_3> rCF2 = xd_32.id_new();
        HashSet hashSet = Sets.newHashSet();
        JsonArray jsonArray = rpY_2.id_class(jsonObject, "properties", (JsonArray)null);
        if (jsonArray != null) {
            jsonArray.forEach(jsonElement -> hashSet.add(rCF2.id_class(rpY_2.id_class(jsonElement, "property"))));
        }
        return new rQa_1(rQz_1Array, xd_32, hashSet);
    }
}

