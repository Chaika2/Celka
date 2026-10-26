/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNH;
import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rzO_2;
import celestial.rzV_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNp_1
extends rzX_2<rNH> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNH rNH2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNH2, jsonSerializationContext);
        jsonObject.add("count", jsonSerializationContext.serialize((Object)rNH2.id_break));
        if (rNH2.id_byte()) {
            jsonObject.add("limit", jsonSerializationContext.serialize((Object)rNH2.id_byte));
        }
    }

    public rNH id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        int n = rpY_2.id_class(jsonObject, "limit", 0);
        return new rNH(rQz_1Array, rpY_2.id_class(jsonObject, "count", jsonDeserializationContext, rzV_2.class), n);
    }
}

