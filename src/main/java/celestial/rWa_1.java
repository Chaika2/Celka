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
import celestial.rVL;
import celestial.rWe_1;
import celestial.rdb_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzY_2;
import celestial.rza_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rWa_1
extends rza_3<rWe_1> {
    protected rWe_1 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        rdb_3 rdb_32 = rpY_2.id_catch(jsonObject, "name");
        return new rWe_1(rdb_32, n, n2, rQz_1Array, rNLArray);
    }

    @Override
    public void id_class(JsonObject jsonObject, rWe_1 rWe_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rWe_12, jsonSerializationContext);
        rqO_2 rqO_22 = rVL.id_for.id_break(rWe_12.id_catch);
        if (rqO_22 == null) {
            throw new IllegalArgumentException("Can't serialize unknown item " + rWe_12.id_catch);
        }
        jsonObject.addProperty("name", rqO_22.toString());
    }

    @Override
    protected /* synthetic */ rzY_2 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        return this.id_class(jsonObject, jsonDeserializationContext, n, n2, rQz_1Array, rNLArray);
    }
}

