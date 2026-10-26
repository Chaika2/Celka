/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rQE;
import celestial.rQz_1;
import celestial.rWY;
import celestial.rpY_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQb_1
implements rWY<rQE> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQE rQE2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("terms", jsonSerializationContext.serialize((Object)rQE2.id_class));
    }

    public rQE id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        rQz_1[] rQz_1Array = rpY_2.id_class(jsonObject, "terms", jsonDeserializationContext, rQz_1[].class);
        return new rQE(rQz_1Array);
    }
}

