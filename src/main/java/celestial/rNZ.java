/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rNm_1;
import celestial.rQz_1;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class rNZ
extends rzX_2<rNm_1> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    public rNm_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return new rNm_1(rQz_1Array);
    }
}

