/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.Xh_1;
import celestial.rQL;
import celestial.rWY;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rQA
implements rWY<rQL> {
    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, rQL rQL2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("predicate", rQL2.id_class.id_class());
    }

    public rQL id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Xh_1 xh_1 = Xh_1.id_class(jsonObject.get("predicate"));
        return new rQL(xh_1);
    }
}

