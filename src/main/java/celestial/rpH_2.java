/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Keyable
 */
package celestial;

import celestial.rpp_3;
import celestial.rpy_3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public interface rpH_2 {
    public static Keyable id_class(rpH_2[] rpH_2Array) {
        return new rpp_3(rpH_2Array);
    }

    public static <E extends rpH_2> Codec<E> id_class(ToIntFunction<E> toIntFunction, IntFunction<E> intFunction, Function<? super String, ? extends E> function) {
        return new rpy_3(toIntFunction, intFunction, function);
    }

    public static <E extends Enum<E>> Codec<E> id_class(Supplier<E[]> supplier, Function<? super String, ? extends E> function) {
        Enum[] enumArray = (Enum[])supplier.get();
        return rpH_2.id_class(object -> ((Enum)object).ordinal(), n -> enumArray[n], function);
    }

    public String id_class();
}

