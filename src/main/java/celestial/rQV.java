/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rQj_1;
import celestial.rWY;
import celestial.rpY_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQV
implements rWY<rQj_1> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQj_1 rQj_12, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("raining", rQj_12.id_class);
        jsonObject.addProperty("thundering", rQj_12.id_break);
    }

    public rQj_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Boolean bl = jsonObject.has("raining") ? Boolean.valueOf(rpY_2.id_private(jsonObject, "raining")) : null;
        Boolean bl2 = jsonObject.has("thundering") ? Boolean.valueOf(rpY_2.id_private(jsonObject, "thundering")) : null;
        return new rQj_1(bl, bl2);
    }
}

