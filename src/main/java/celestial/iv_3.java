/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.iL_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rVL;
import celestial.rqR_2;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.Logger;

public class iv_3
extends MapCodec<iZ_2<E>> {
    public final /* synthetic */ Collection id_class;
    public final /* synthetic */ Collection id_break;
    public final /* synthetic */ MutableObject id_byte;

    public iv_3(Collection collection, Collection collection2, MutableObject mutableObject) {
        this.id_class = collection;
        this.id_break = collection2;
        this.id_byte = mutableObject;
    }

    public <T> DataResult<iZ_2<E>> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        MutableObject mutableObject = new MutableObject((Object)DataResult.success((Object)ImmutableList.builder()));
        mapLike.entries().forEach(pair -> {
            DataResult dataResult = rVL.d.parse(dynamicOps, pair.getFirst());
            DataResult dataResult2 = dataResult.flatMap(il_32 -> this.id_class((il_3)il_32, dynamicOps, (Object)pair.getSecond()));
            mutableObject.setValue((Object)((DataResult)mutableObject.getValue()).apply2(ImmutableList.Builder::add, dataResult2));
        });
        ImmutableList immutableList = ((DataResult)mutableObject.getValue()).resultOrPartial(arg_0 -> ((Logger)iZ_2.id_class).error(arg_0)).map(ImmutableList.Builder::build).orElseGet(ImmutableList::of);
        return DataResult.success(new iZ_2(this.id_class, this.id_break, immutableList, () -> ((MutableObject)this.id_byte).getValue()));
    }

    public /* synthetic */ RecordBuilder encode(Object object, DynamicOps dynamicOps, RecordBuilder recordBuilder) {
        return this.id_class((iZ_2)object, dynamicOps, recordBuilder);
    }

    private <T, U> DataResult<iL_2<U>> id_class(il_3<U> il_32, DynamicOps<T> dynamicOps, T t) {
        return il_32.id_class().map(DataResult::success).orElseGet(() -> DataResult.error((String)("No codec for memory: " + il_32))).flatMap(codec -> codec.parse(dynamicOps, t)).map(in_32 -> new iL_2(il_32, Optional.of(in_32)));
    }

    public <T> RecordBuilder<T> id_class(iZ_2<E> iZ_22, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        iZ_22.id_case().forEach(iL_22 -> iL_22.id_class(dynamicOps, recordBuilder));
        return recordBuilder;
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return this.id_class.stream().flatMap(il_32 -> rqR_2.id_class(il_32.id_class().map(codec -> rVL.d.id_break((il_3<?>)il_32)))).map(rqO_22 -> dynamicOps.createString(rqO_22.toString()));
    }
}

