/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rQN;
import celestial.rQz_1;
import celestial.rWY;
import celestial.rpY_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQc_1
implements rWY<rQN> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQN rQN2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("term", jsonSerializationContext.serialize((Object)rQN2.id_class));
    }

    public rQN id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        rQz_1 rQz_12 = rpY_2.id_class(jsonObject, "term", jsonDeserializationContext, rQz_1.class);
        return new rQN(rQz_12);
    }
}

