/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 */
package celestial;

import celestial.rVL;
import celestial.rVq_1;
import celestial.rqM_2;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.stream.Stream;

public final class rVn_1<E>
extends MapCodec<rVL<E>> {
    private final rqM_2<? extends rVL<E>> id_class;

    private rVn_1(rqM_2<? extends rVL<E>> rqM_22) {
        this.id_class = rqM_22;
    }

    public String toString() {
        return "RegistryLookupCodec[" + this.id_class + "]";
    }

    public <T> DataResult<rVL<E>> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        return dynamicOps instanceof rVq_1 ? ((rVq_1)dynamicOps).id_class(this.id_class) : DataResult.error((String)"Not a registry ops");
    }

    public /* synthetic */ RecordBuilder encode(Object object, DynamicOps dynamicOps, RecordBuilder recordBuilder) {
        return this.id_class((rVL)object, dynamicOps, recordBuilder);
    }

    public <T> RecordBuilder<T> id_class(rVL<E> rVL2, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        return recordBuilder;
    }

    public static <E> rVn_1<E> id_class(rqM_2<? extends rVL<E>> rqM_22) {
        return new rVn_1<E>(rqM_22);
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return Stream.empty();
    }
}

