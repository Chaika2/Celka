/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 */
package celestial;

import celestial.RI;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Supplier;

public class RE<T extends ArgumentType<?>>
implements RI<T> {
    private final Supplier<T> id_class;

    public RE(Supplier<T> supplier) {
        this.id_class = supplier;
    }

    @Override
    public void id_class(T t, JsonObject jsonObject) {
    }

    @Override
    public T id_class(ruu_3 ruu_32) {
        return (T)((ArgumentType)this.id_class.get());
    }

    @Override
    public void id_class(T t, ruu_3 ruu_32) {
    }
}

