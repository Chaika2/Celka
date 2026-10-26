/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 */
package celestial;

import celestial.rVC;
import celestial.rVL;
import celestial.rVq_1;
import celestial.rqM_2;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public final class rVH<E>
implements Codec<rVC<E>> {
    private final Codec<rVC<E>> id_class;
    private final rqM_2<? extends rVL<E>> id_break;
    private final Codec<E> id_byte;

    private rVH(rqM_2<? extends rVL<E>> rqM_22, Lifecycle lifecycle, Codec<E> codec) {
        this.id_class = rVC.id_byte(rqM_22, lifecycle, codec);
        this.id_break = rqM_22;
        this.id_byte = codec;
    }

    public String toString() {
        return "RegistryDataPackCodec[" + this.id_class + " " + this.id_break + " " + this.id_byte + "]";
    }

    public <T> DataResult<Pair<rVC<E>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        DataResult dataResult = this.id_class.decode(dynamicOps, t);
        return dynamicOps instanceof rVq_1 ? dataResult.flatMap(pair -> ((rVq_1)dynamicOps).id_class((rVC)pair.getFirst(), this.id_break, this.id_byte).map(object -> Pair.of((Object)object, (Object)pair.getSecond()))) : dataResult;
    }

    public /* synthetic */ DataResult encode(Object object, DynamicOps dynamicOps, Object object2) {
        return this.id_class((rVC)object, dynamicOps, object2);
    }

    public static <E> rVH<E> id_class(rqM_2<? extends rVL<E>> rqM_22, Lifecycle lifecycle, Codec<E> codec) {
        return new rVH<E>(rqM_22, lifecycle, codec);
    }

    public <T> DataResult<T> id_class(rVC<E> rVC2, DynamicOps<T> dynamicOps, T t) {
        return this.id_class.encode(rVC2, dynamicOps, t);
    }
}

