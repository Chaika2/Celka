/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.hY_2;
import celestial.rQx_1;
import celestial.rWY;
import celestial.rpY_2;
import celestial.rzB_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQd_1
implements rWY<rQx_1> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQx_1 rQx_12, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("predicate", rQx_12.id_class.id_class());
        jsonObject.add("entity", jsonSerializationContext.serialize((Object)rQx_12.id_break));
    }

    public rQx_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        hY_2 hY_22 = hY_2.id_class(jsonObject.get("predicate"));
        return new rQx_1(hY_22, rpY_2.id_class(jsonObject, "entity", jsonDeserializationContext, rzB_2.class));
    }
}

