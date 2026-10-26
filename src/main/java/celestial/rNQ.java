/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNW;
import celestial.rQz_1;
import celestial.rWK;
import celestial.rpY_2;
import celestial.rzO_2;
import celestial.rzX_2;
import celestial.rzj_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNQ
extends rzX_2<rNW> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNW rNW2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNW2, jsonSerializationContext);
        jsonObject.add("levels", rzj_3.id_class(rNW2.id_break, jsonSerializationContext));
        jsonObject.addProperty("treasure", Boolean.valueOf(rNW2.id_byte));
    }

    public rNW id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rWK rWK2 = rzj_3.id_class(jsonObject.get("levels"), jsonDeserializationContext);
        boolean bl = rpY_2.id_class(jsonObject, "treasure", false);
        return new rNW(rQz_1Array, rWK2, bl);
    }
}

