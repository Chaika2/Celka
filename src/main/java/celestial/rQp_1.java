/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rQy_1;
import celestial.rWY;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQp_1
implements rWY<rQy_1> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQy_1 rQy_12, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("name", rQy_12.id_break.toString());
    }

    public rQy_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        rqO_2 rqO_22 = new rqO_2(rpY_2.id_case(jsonObject, "name"));
        return new rQy_1(rqO_22);
    }
}

