/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.UnboundedMapCodec
 */
package celestial;

import celestial.rVC;
import celestial.rVF;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rqM_2;
import celestial.rqO_2;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class rVv_1
extends rVm_1 {
    public static final Codec<rVv_1> id_class = rVv_1.id_byte();
    public final Map<? extends rqM_2<? extends rVL<?>>, ? extends rVC<?>> id_break;

    private static <E> DataResult<? extends Codec<E>> id_byte(rqM_2<? extends rVL<E>> rqM_22) {
        return Optional.ofNullable(rVm_1.id_break.get(rqM_22)).map(rVZ2 -> rVZ2.id_byte()).map(DataResult::success).orElseGet(() -> DataResult.error((String)("Unknown or not serializable registry: " + rqM_22)));
    }

    private static <E> Codec<rVv_1> id_byte() {
        Codec codec = rqO_2.id_class.xmap(rqM_2::id_class, rqM_2::id_class);
        Codec codec2 = codec.partialDispatch("type", rVC2 -> DataResult.success(rVC2.id_break()), rqM_22 -> rVv_1.id_byte(rqM_22).map(codec -> rVC.id_class(rqM_22, Lifecycle.experimental(), codec)));
        UnboundedMapCodec unboundedMapCodec = Codec.unboundedMap((Codec)codec, (Codec)codec2);
        return rVv_1.id_class(unboundedMapCodec);
    }

    private rVv_1(Map<? extends rqM_2<? extends rVL<?>>, ? extends rVC<?>> map) {
        this.id_break = map;
    }

    public rVv_1() {
        this(rVm_1.id_break.keySet().stream().collect(Collectors.toMap(Function.identity(), rVv_1::id_protected)));
    }

    @Override
    public <E> Optional<rVF<E>> id_class(rqM_2<? extends rVL<E>> rqM_22) {
        return Optional.ofNullable((rVF)this.id_break.get(rqM_22)).map(rVF2 -> rVF2);
    }

    private static <K extends rqM_2<? extends rVL<?>>, V extends rVC<?>> Codec<rVv_1> id_class(UnboundedMapCodec<K, V> unboundedMapCodec) {
        return unboundedMapCodec.xmap(rVv_1::new, rVv_12 -> (Map)rVv_12.id_break.entrySet().stream().filter(entry -> rVm_1.id_break.get(entry.getKey()).id_protected()).collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

    private static <E> rVC<?> id_protected(rqM_2<? extends rVL<?>> rqM_22) {
        return new rVC(rqM_22, Lifecycle.stable());
    }
}

