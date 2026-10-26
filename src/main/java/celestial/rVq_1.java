/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Supplier
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAL;
import celestial.rTF;
import celestial.rVC;
import celestial.rVF;
import celestial.rVI;
import celestial.rVL;
import celestial.rVT;
import celestial.rVm_1;
import celestial.rVv_1;
import celestial.rqM_2;
import celestial.rqO_2;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVq_1<T>
extends rTF<T> {
    public static final Logger id_break = LogManager.getLogger();
    private final rVT id_byte;
    private final rVv_1 id_protected;
    private final Map<rqM_2<? extends rVL<?>>, rVI<?>> id_throws;
    private final rVq_1<JsonElement> id_case;

    private rVq_1(DynamicOps<T> dynamicOps, rVT rVT2, rVv_1 rVv_12, IdentityHashMap<rqM_2<? extends rVL<?>>, rVI<?>> identityHashMap) {
        super(dynamicOps);
        this.id_byte = rVT2;
        this.id_protected = rVv_12;
        this.id_throws = identityHashMap;
        this.id_case = dynamicOps == JsonOps.INSTANCE ? this : new rVq_1<T>(JsonOps.INSTANCE, rVT2, rVv_12, (IdentityHashMap<rqM_2<rVL<?>>, rVI<?>>)identityHashMap);
    }

    public static <T> rVq_1<T> id_class(DynamicOps<T> dynamicOps, rAL rAL2, rVv_1 rVv_12) {
        return rVq_1.id_class(dynamicOps, rVT.id_class(rAL2), rVv_12);
    }

    protected <E> DataResult<rVL<E>> id_class(rqM_2<? extends rVL<E>> rqM_22) {
        return this.id_protected.id_class(rqM_22).map(rVF2 -> DataResult.success((Object)rVF2, (Lifecycle)rVF2.id_byte())).orElseGet(() -> DataResult.error((String)("Unknown registry: " + rqM_22)));
    }

    public static <T> rVq_1<T> id_class(DynamicOps<T> dynamicOps, rVT rVT2, rVv_1 rVv_12) {
        rVq_1<T> rVq_12 = new rVq_1<T>(dynamicOps, rVT2, rVv_12, Maps.newIdentityHashMap());
        rVm_1.id_class(rVv_12, rVq_12);
        return rVq_12;
    }

    public <E> DataResult<rVC<E>> id_class(rVC<E> rVC3, rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec) {
        Collection<rqO_2> collection = this.id_byte.id_class(rqM_22);
        DataResult dataResult = DataResult.success(rVC3, (Lifecycle)Lifecycle.stable());
        String string = rqM_22.id_class().id_break() + "/";
        for (rqO_2 rqO_22 : collection) {
            String string2 = rqO_22.id_break();
            if (!string2.endsWith(".json")) {
                id_break.warn("Skipping resource {} since it is not a json file", (Object)rqO_22);
                continue;
            }
            if (!string2.startsWith(string)) {
                id_break.warn("Skipping resource {} since it does not have a registry name prefix", (Object)rqO_22);
                continue;
            }
            String string3 = string2.substring(string.length(), string2.length() - ".json".length());
            rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), string3);
            dataResult = dataResult.flatMap(rVC2 -> this.id_class((rqM_2)rqM_22, (rVF)rVC2, codec, rqO_23).map(supplier -> rVC2));
        }
        return dataResult.setPartial(rVC3);
    }

    protected <E> DataResult<Pair<java.util.function.Supplier<E>, T>> id_class(T t, rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec, boolean bl) {
        Optional optional = this.id_protected.id_class(rqM_22);
        if (!optional.isPresent()) {
            return DataResult.error((String)("Unknown registry: " + rqM_22));
        }
        rVF rVF2 = optional.get();
        DataResult dataResult = rqO_2.id_class.decode(this.id_class, t);
        if (!dataResult.result().isPresent()) {
            return !bl ? DataResult.error((String)"Inline definitions not allowed here") : codec.decode((DynamicOps)this, t).map(pair -> pair.mapFirst(object -> () -> object));
        }
        Pair pair2 = (Pair)dataResult.result().get();
        rqO_2 rqO_22 = (rqO_2)pair2.getFirst();
        return this.id_class(rqM_22, rVF2, codec, rqO_22).map(supplier -> Pair.of((Object)supplier, (Object)pair2.getSecond()));
    }

    private <E> DataResult<java.util.function.Supplier<E>> id_class(rqM_2<? extends rVL<E>> rqM_22, rVF<E> rVF2, Codec<E> codec, rqO_2 rqO_22) {
        Pair pair2;
        rqM_2 rqM_23 = rqM_2.id_class(rqM_22, rqO_22);
        rVI<E> rVI2 = this.id_break(rqM_22);
        DataResult dataResult = rVI2.id_class.get(rqM_23);
        if (dataResult != null) {
            return dataResult;
        }
        Supplier supplier = Suppliers.memoize(() -> {
            Object t = rVF2.id_class(rqM_23);
            if (t == null) {
                throw new RuntimeException("Error during recursive registry parsing, element resolved too early: " + rqM_23);
            }
            return t;
        });
        rVI2.id_class.put(rqM_23, DataResult.success((Object)supplier));
        DataResult dataResult2 = this.id_byte.id_class((DynamicOps<JsonElement>)this.id_case, rqM_22, rqM_23, codec);
        Optional optional = dataResult2.result();
        if (optional.isPresent()) {
            pair2 = (Pair)optional.get();
            rVF2.id_class((OptionalInt)pair2.getSecond(), rqM_23, pair2.getFirst(), dataResult2.lifecycle());
        }
        pair2 = !optional.isPresent() && rVF2.id_class(rqM_23) != null ? DataResult.success(() -> rVF2.id_class(rqM_23), (Lifecycle)Lifecycle.stable()) : dataResult2.map(pair -> () -> rVF2.id_class(rqM_23));
        rVI2.id_class.put(rqM_23, pair2);
        return pair2;
    }

    private <E> rVI<E> id_break(rqM_2<? extends rVL<E>> rqM_23) {
        return this.id_throws.computeIfAbsent(rqM_23, rqM_22 -> new rVI());
    }
}

