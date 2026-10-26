/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 */
package celestial;

import celestial.rVL;
import celestial.rVp_1;
import celestial.rVq_1;
import celestial.rqM_2;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.function.Supplier;

public final class rVA<E>
implements Codec<Supplier<E>> {
    private final rqM_2<? extends rVL<E>> id_class;
    private final Codec<E> id_break;
    private final boolean id_byte;

    private rVA(rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec, boolean bl) {
        this.id_class = rqM_22;
        this.id_break = codec;
        this.id_byte = bl;
    }

    public String toString() {
        return "RegistryFileCodec[" + this.id_class + " " + this.id_break + "]";
    }

    public <T> DataResult<Pair<Supplier<E>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        return dynamicOps instanceof rVq_1 ? ((rVq_1)dynamicOps).id_class(t, this.id_class, this.id_break, this.id_byte) : this.id_break.decode(dynamicOps, t).map(pair -> pair.mapFirst(object -> () -> object));
    }

    public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
        return this.id_class((Supplier)object, dynamicOps, object2);
    }

    private static <E> rVA<E> id_class(rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec, boolean bl) {
        return new rVA<E>(rqM_22, codec, bl);
    }

    public static <E> rVA<E> id_class(rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec) {
        return rVA.id_class(rqM_22, codec, true);
    }

    public <T> DataResult<T> id_class(Supplier<E> supplier, DynamicOps<T> dynamicOps, T t) {
        return dynamicOps instanceof rVp_1 ? ((rVp_1)dynamicOps).id_class(supplier.get(), t, this.id_class, this.id_break) : this.id_break.encode(supplier.get(), dynamicOps, t);
    }

    public static <E> Codec<List<Supplier<E>>> id_break(rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec) {
        return Codec.either((Codec)rVA.id_class(rqM_22, codec, false).listOf(), (Codec)codec.xmap(object -> () -> object, Supplier::get).listOf()).xmap(either -> (List)either.map(list -> list, list -> list), Either::left);
    }
}

