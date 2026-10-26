/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNR;
import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rzO_2;
import celestial.rzV_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNY
extends rzX_2<rNR> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNR rNR2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNR2, jsonSerializationContext);
        jsonObject.add("damage", jsonSerializationContext.serialize((Object)rNR2.id_byte));
    }

    public rNR id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return new rNR(rQz_1Array, rpY_2.id_class(jsonObject, "damage", jsonDeserializationContext, rzV_2.class));
    }
}

