/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.ev_3;
import celestial.rQK;
import celestial.rQR;
import celestial.rQo_1;
import celestial.rQz_1;
import celestial.rVL;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class rQU
extends rzX_2<rQR> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQR rQR2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rQR2, jsonSerializationContext);
        jsonObject.addProperty("enchantment", rVL.id_boolean.id_break(rQR2.id_byte).toString());
        jsonObject.addProperty("formula", rQR2.id_protected.id_class().toString());
        JsonObject jsonObject2 = new JsonObject();
        rQR2.id_protected.id_class(jsonObject2, jsonSerializationContext);
        if (jsonObject2.size() > 0) {
            jsonObject.add("parameters", (JsonElement)jsonObject2);
        }
    }

    public rQR id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "enchantment"));
        ev_3 ev_32 = rVL.id_boolean.id_break(rqO_22).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + rqO_22));
        rqO_2 rqO_23 = new rqO_2(rpY_2.id_case(jsonObject, "formula"));
        rQK rQK2 = rQR.id_break.get(rqO_23);
        if (rQK2 == null) {
            throw new JsonParseException("Invalid formula id: " + rqO_23);
        }
        rQo_1 rQo_12 = jsonObject.has("parameters") ? rQK2.deserialize(rpY_2.id_native(jsonObject, "parameters"), jsonDeserializationContext) : rQK2.deserialize(new JsonObject(), jsonDeserializationContext);
        return new rQR(rQz_1Array, ev_32, rQo_12);
    }
}

