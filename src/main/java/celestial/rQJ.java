/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.hn_3;
import celestial.rQX;
import celestial.rWY;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQJ
implements rWY<rQX> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQX rQX2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("predicate", rQX2.id_class.id_class());
    }

    public rQX id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        hn_3 hn_32 = hn_3.id_class(jsonObject.get("predicate"));
        return new rQX(hn_32);
    }
}

