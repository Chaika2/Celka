/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;

public interface rzp_3<T> {
    public JsonElement id_class(T var1, JsonSerializationContext var2);

    public T id_class(JsonElement var1, JsonDeserializationContext var2);
}

