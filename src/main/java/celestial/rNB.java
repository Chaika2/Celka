/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNP;
import celestial.rNS;
import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNB
extends rzX_2<rNP> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNP rNP2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNP2, jsonSerializationContext);
        jsonObject.addProperty("source", rNP2.id_break.name);
    }

    public rNP id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rNS rNS2 = rNS.id_class(rpY_2.id_case(jsonObject, "source"));
        return new rNP(rQz_1Array, rNS2);
    }
}

