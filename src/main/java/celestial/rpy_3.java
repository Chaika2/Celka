/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rpH_2;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class rpy_3
implements Codec<E> {
    public final /* synthetic */ ToIntFunction id_class;
    public final /* synthetic */ IntFunction id_break;
    public final /* synthetic */ Function id_byte;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rpy_3(ToIntFunction toIntFunction, IntFunction intFunction, Function function) {
        this.id_class = toIntFunction;
        this.id_break = intFunction;
        this.id_byte = function;
    }

    public String toString() {
        return "StringRepresentable[" + this.id_class + "]";
    }

    public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> dynamicOps, T t) {
        return dynamicOps.compressMaps() ? dynamicOps.getNumberValue(t).flatMap(number -> Optional.ofNullable((rpH_2)this.id_break.apply(number.intValue())).map(DataResult::success).orElseGet(() -> DataResult.error((String)("Unknown element id: " + number)))).map(rpH_22 -> Pair.of((Object)rpH_22, (Object)dynamicOps.empty())) : dynamicOps.getStringValue(t).flatMap(string -> Optional.ofNullable((rpH_2)this.id_byte.apply(string)).map(DataResult::success).orElseGet(() -> DataResult.error((String)("Unknown element name: " + string)))).map(rpH_22 -> Pair.of((Object)rpH_22, (Object)dynamicOps.empty()));
    }

    public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
        return this.id_class((rpH_2)object, dynamicOps, object2);
    }

    public <T> DataResult<T> id_class(E e, DynamicOps<T> dynamicOps, T t) {
        return dynamicOps.compressMaps() ? dynamicOps.mergeToPrimitive(t, dynamicOps.createInt(this.id_class.applyAsInt(e))) : dynamicOps.mergeToPrimitive(t, dynamicOps.createString(e.id_class()));
    }
}

