/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rQz_1;
import celestial.rcs_3;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class rcE_2
extends rzX_2<rcs_3> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    public rcs_3 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return new rcs_3(rQz_1Array);
    }
}

