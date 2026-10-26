/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.XN;
import celestial.rQZ;
import celestial.rWY;
import celestial.rfH_2;
import celestial.rpY_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQv_1
implements rWY<rQZ> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQZ rQZ2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("predicate", rQZ2.id_class.id_class());
        if (rQZ2.id_break.b_() != 0) {
            jsonObject.addProperty("offsetX", (Number)rQZ2.id_break.b_());
        }
        if (rQZ2.id_break.c_() != 0) {
            jsonObject.addProperty("offsetY", (Number)rQZ2.id_break.c_());
        }
        if (rQZ2.id_break.d_() != 0) {
            jsonObject.addProperty("offsetZ", (Number)rQZ2.id_break.d_());
        }
    }

    public rQZ id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        XN xN = XN.id_class(jsonObject.get("predicate"));
        int n = rpY_2.id_class(jsonObject, "offsetX", 0);
        int n2 = rpY_2.id_class(jsonObject, "offsetY", 0);
        int n3 = rpY_2.id_class(jsonObject, "offsetZ", 0);
        return new rQZ(xN, new rfH_2(n, n2, n3));
    }
}

