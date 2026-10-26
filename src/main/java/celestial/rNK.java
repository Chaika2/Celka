/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNo_1;
import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rNK
extends rzX_2<rNo_1> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNo_1 rNo_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNo_12, jsonSerializationContext);
        jsonObject.addProperty("name", rNo_12.id_break.toString());
        if (rNo_12.id_byte != 0L) {
            jsonObject.addProperty("seed", (Number)rNo_12.id_byte);
        }
    }

    public rNo_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "name"));
        long l = rpY_2.id_class(jsonObject, "seed", 0L);
        return new rNo_1(rQz_1Array, rqO_22, l);
    }
}

