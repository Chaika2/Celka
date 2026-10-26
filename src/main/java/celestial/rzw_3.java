/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import celestial.rQz_1;
import celestial.rpY_2;
import celestial.rzE_2;
import celestial.rzI_2;
import celestial.rzb_3;
import celestial.rzt_3;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class rzw_3
extends rzb_3<T> {
    public final /* synthetic */ rzI_2 id_class;

    public rzw_3(rzI_2 rzI_22) {
        this.id_class = rzI_22;
    }

    @Override
    public /* synthetic */ rzE_2 id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        return this.id_break(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    @Override
    public void id_class(JsonObject jsonObject, T t, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("children", jsonSerializationContext.serialize((Object)((rzt_3)t).id_protected));
    }

    public final T id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, rQz_1[] rQz_1Array) {
        rzE_2[] rzE_2Array = rpY_2.id_class(jsonObject, "children", jsonDeserializationContext, rzE_2[].class);
        return this.id_class.create(rzE_2Array, rQz_1Array);
    }
}

