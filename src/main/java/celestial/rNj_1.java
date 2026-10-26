/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNI;
import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rzE_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Arrays;

public class rNj_1
extends rzX_2<rNI> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNI rNI2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNI2, jsonSerializationContext);
        jsonObject.add("entries", jsonSerializationContext.serialize(rNI2.id_break));
    }

    public rNI id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rzE_2[] rzE_2Array = rpY_2.id_class(jsonObject, "entries", jsonDeserializationContext, rzE_2[].class);
        return new rNI(rQz_1Array, Arrays.asList(rzE_2Array));
    }
}

