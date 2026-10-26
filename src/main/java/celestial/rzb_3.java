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
import celestial.rzE_2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class rzb_3<T extends rzE_2>
implements rWY<T> {
    public abstract T id_class(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3);

    @Override
    public /* synthetic */ Object id_class(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return this.id_break(jsonObject, jsonDeserializationContext);
    }

    @Override
    public /* synthetic */ void id_class(JsonObject jsonObject, Object object, JsonSerializationContext jsonSerializationContext) {
        this.id_break(jsonObject, (rzE_2)object, jsonSerializationContext);
    }

    @Override
    public abstract void id_class(JsonObject var1, T var2, JsonSerializationContext var3);

    public final T id_break(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        rQz_1[] rQz_1Array = rpY_2.id_class(jsonObject, "conditions", new rQz_1[0], jsonDeserializationContext, rQz_1[].class);
        return this.id_class(jsonObject, jsonDeserializationContext, rQz_1Array);
    }

    public final void id_break(JsonObject jsonObject, T t, JsonSerializationContext jsonSerializationContext) {
        if (!ArrayUtils.isEmpty((Object[])((rzE_2)t).id_byte)) {
            jsonObject.add("conditions", jsonSerializationContext.serialize((Object)((rzE_2)t).id_byte));
        }
        this.id_class(jsonObject, t, jsonSerializationContext);
    }
}

