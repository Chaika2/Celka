/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rNL;
import celestial.rQz_1;
import celestial.rWt_1;
import celestial.rzY_2;
import celestial.rza_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class rWw_1
extends rza_3<rWt_1> {
    public rWt_1 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        return new rWt_1(n, n2, rQz_1Array, rNLArray);
    }

    @Override
    public /* synthetic */ rzY_2 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        return this.id_class(jsonObject, jsonDeserializationContext, n, n2, rQz_1Array, rNLArray);
    }
}

