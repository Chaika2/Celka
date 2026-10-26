/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rQl_1;
import celestial.rWY;
import celestial.rpY_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQH
implements rWY<rQl_1> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQl_1 rQl_12, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("chance", (Number)Float.valueOf(rQl_12.id_class));
        jsonObject.addProperty("looting_multiplier", (Number)Float.valueOf(rQl_12.id_break));
    }

    public rQl_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return new rQl_1(rpY_2.id_implements(jsonObject, "chance"), rpY_2.id_implements(jsonObject, "looting_multiplier"));
    }
}

