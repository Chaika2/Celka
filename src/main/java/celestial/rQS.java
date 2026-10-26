/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNL;
import celestial.rQP;
import celestial.rQz_1;
import celestial.rdb_3;
import celestial.rlZ_2;
import celestial.rlb_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzY_2;
import celestial.rza_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class rQS
extends rza_3<rQP> {
    protected rQP id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "name"));
        rlb_3<rdb_3> rlb_32 = rlZ_2.id_class().id_break().id_class(rqO_22);
        if (rlb_32 == null) {
            throw new JsonParseException("Can't find tag: " + rqO_22);
        }
        boolean bl = rpY_2.id_private(jsonObject, "expand");
        return new rQP(rlb_32, bl, n, n2, rQz_1Array, rNLArray);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQP rQP2, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rQP2, jsonSerializationContext);
        jsonObject.addProperty("name", rlZ_2.id_class().id_break().id_break(rQP2.id_catch).toString());
        jsonObject.addProperty("expand", Boolean.valueOf(rQP2.id_private));
    }

    @Override
    protected /* synthetic */ rzY_2 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        return this.id_class(jsonObject, jsonDeserializationContext, n, n2, rQz_1Array, rNLArray);
    }
}

