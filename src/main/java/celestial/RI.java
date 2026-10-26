/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 */
package celestial;

import celestial.ruu_3;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface RI<T extends ArgumentType<?>> {
    public void id_class(T var1, ruu_3 var2);

    public T id_class(ruu_3 var1);

    public void id_class(T var1, JsonObject var2);
}

