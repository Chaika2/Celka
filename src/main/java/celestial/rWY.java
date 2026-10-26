/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public interface rWY<T> {
    public void id_class(JsonObject var1, T var2, JsonSerializationContext var3);

    public T id_class(JsonObject var1, JsonDeserializationContext var2);
}

