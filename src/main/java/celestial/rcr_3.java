/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rNi_1;
import celestial.rQz_1;
import celestial.rVi_1;
import celestial.rgB_2;
import celestial.rpY_2;
import celestial.rzB_2;
import celestial.rzO_2;
import celestial.rzX_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rcr_3
extends rzX_2<rNi_1> {
    @Override
    public /* synthetic */ rzO_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, rNi_1 rNi_12, JsonSerializationContext jsonSerializationContext) {
        super.id_class(jsonObject, rNi_12, jsonSerializationContext);
        if (rNi_12.id_byte != null) {
            jsonObject.add("name", rgB_2.id_break(rNi_12.id_byte));
        }
        if (rNi_12.id_protected != null) {
            jsonObject.add("entity", jsonSerializationContext.serialize((Object)rNi_12.id_protected));
        }
    }

    public rNi_1 id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rVi_1 rVi_12 = rgB_2.id_class(jsonObject.get("name"));
        rzB_2 rzB_22 = rpY_2.id_class(jsonObject, "entity", null, jsonDeserializationContext, rzB_2.class);
        return new rNi_1(rQz_1Array, rVi_12, rzB_22);
    }
}

