/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.rQz_1;
import celestial.rWY;
import celestial.rpY_2;
import celestial.rzO_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class rzX_2<T extends rzO_2>
implements rWY<T> {
    public abstract T id_class(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3);

    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public void id_class(JsonObject jsonObject, T t, JsonSerializationContext jsonSerializationContext) {
        if (!ArrayUtils.isEmpty((Object[])((rzO_2)t).id_class)) {
            jsonObject.add("conditions", jsonSerializationContext.serialize((Object)((rzO_2)t).id_class));
        }
    }

    public final T id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        rQz_1[] rQz_1Array = rpY_2.id_class(jsonObject, "conditions", new rQz_1[0], jsonDeserializationContext, rQz_1[].class);
        return this.id_class(jsonObject, jsonDeserializationContext, rQz_1Array);
    }
}

