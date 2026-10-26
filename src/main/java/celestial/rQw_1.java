/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.ev_3;
import celestial.rQt_1;
import celestial.rVL;
import celestial.rWY;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class rQw_1
implements rWY<rQt_1> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQt_1 rQt_12, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("enchantment", rVL.id_boolean.id_break(rQt_12.id_class).toString());
        jsonObject.add("chances", jsonSerializationContext.serialize((Object)rQt_12.id_break));
    }

    public rQt_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "enchantment"));
        ev_3 ev_32 = rVL.id_boolean.id_break(rqO_22).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + rqO_22));
        float[] fArray = rpY_2.id_class(jsonObject, "chances", jsonDeserializationContext, float[].class);
        return new rQt_1(ev_32, fArray);
    }
}

