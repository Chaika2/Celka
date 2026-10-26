/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNL;
import celestial.rQz_1;
import celestial.rWq_1;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzY_2;
import celestial.rza_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rWT
extends rza_3<rWq_1> {
    protected rWq_1 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "name"));
        return new rWq_1(rqO_22, n, n2, rQz_1Array, rNLArray);
    }

    @Override
    public void id_class(JsonObject jsonObject, rWq_1 rWq_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rWq_12, jsonSerializationContext);
        jsonObject.addProperty("name", rWq_12.id_catch.toString());
    }

    @Override
    protected /* synthetic */ rzY_2 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        return this.id_class(jsonObject, jsonDeserializationContext, n, n2, rQz_1Array, rNLArray);
    }
}

