/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$PartialResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap
 */
package celestial;

import celestial.rVL;
import celestial.rVT;
import celestial.rVp_1;
import celestial.rVq_1;
import celestial.rVv_1;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public final class rVw_1
implements rVT {
    private final Map<rqM_2<?>, JsonElement> id_class = Maps.newIdentityHashMap();
    private final Object2IntMap<rqM_2<?>> id_break = new Object2IntOpenCustomHashMap(rqR_2.id_extends());
    private final Map<rqM_2<?>, Lifecycle> id_byte = Maps.newIdentityHashMap();

    @Override
    public <E> DataResult<Pair<E, OptionalInt>> id_class(DynamicOps<JsonElement> dynamicOps, rqM_2<? extends rVL<E>> rqM_22, rqM_2<E> rqM_23, Decoder<E> decoder) {
        JsonElement jsonElement = this.id_class.get(rqM_23);
        return jsonElement == null ? DataResult.error((String)("Unknown element: " + rqM_23)) : decoder.parse(dynamicOps, (Object)jsonElement).setLifecycle(this.id_byte.get(rqM_23)).map(object -> Pair.of((Object)object, (Object)OptionalInt.of(this.id_break.getInt((Object)rqM_23))));
    }

    @Override
    public Collection<rqO_2> id_class(rqM_2<? extends rVL<?>> rqM_22) {
        return this.id_class.keySet().stream().filter(rqM_23 -> rqM_23.id_class(rqM_22)).map(rqM_23 -> new rqO_2(rqM_23.id_class().id_byte(), rqM_22.id_class().id_break() + "/" + rqM_23.id_class().id_break() + ".json")).collect(Collectors.toList());
    }

    public <E> void id_class(rVv_1 rVv_12, rqM_2<E> rqM_22, Encoder<E> encoder, int n, E e, Lifecycle lifecycle) {
        DataResult dataResult = encoder.encodeStart(rVp_1.id_class(JsonOps.INSTANCE, rVv_12), e);
        Optional optional = dataResult.error();
        if (optional.isPresent()) {
            rVq_1.id_break.error("Error adding element: {}", (Object)((DataResult.PartialResult)optional.get()).message());
        } else {
            this.id_class.put(rqM_22, (JsonElement)dataResult.result().get());
            this.id_break.put(rqM_22, n);
            this.id_byte.put(rqM_22, lifecycle);
        }
    }
}

