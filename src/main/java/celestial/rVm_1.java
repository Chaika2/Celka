/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.JsonOps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rDM;
import celestial.rDg_1;
import celestial.rKW;
import celestial.rRJ;
import celestial.rVC;
import celestial.rVF;
import celestial.rVL;
import celestial.rVZ;
import celestial.rVq_1;
import celestial.rVv_1;
import celestial.rVw_1;
import celestial.rVy_1;
import celestial.rYG;
import celestial.reP_2;
import celestial.reu_3;
import celestial.rqM_2;
import celestial.rqR_2;
import celestial.rrPx_1;
import celestial.rrSR;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.util.Map;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rVm_1 {
    private static final Logger id_class = LogManager.getLogger();
    public static final Map<rqM_2<? extends rVL<?>>, rVZ<?>> id_break = (Map)rqR_2.id_class(() -> {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        rVm_1.id_class(builder, rVL.id_void, rRJ.id_protected, rRJ.id_protected);
        rVm_1.id_class(builder, rVL.n, rYG.id_break, rYG.id_byte);
        rVm_1.id_class(builder, rVL.m, rrSR.id_class);
        rVm_1.id_class(builder, rVL.Z, rDM.id_class);
        rVm_1.id_class(builder, rVL.v, rDg_1.id_class);
        rVm_1.id_class(builder, rVL.F, reP_2.id_class);
        rVm_1.id_class(builder, rVL.L, rrPx_1.id_native);
        rVm_1.id_class(builder, rVL.A, reu_3.id_class);
        rVm_1.id_class(builder, rVL.u, rKW.id_class);
        return builder.build();
    });
    private static final rVv_1 id_byte = rqR_2.id_class(() -> {
        rVv_1 rVv_12 = new rVv_1();
        rRJ.id_class(rVv_12);
        id_break.keySet().stream().filter(rqM_22 -> !rqM_22.equals(rVL.id_void)).forEach(rqM_22 -> rVm_1.id_class(rVv_12, rqM_22));
        return rVv_12;
    });

    private static <E> void id_class(rVq_1<?> rVq_12, rVv_1 rVv_12, rVZ<E> rVZ2) {
        rqM_2 rqM_22 = rVZ2.id_class();
        rVC rVC3 = Optional.ofNullable(rVv_12.id_break.get(rqM_22)).map(rVC2 -> rVC2).orElseThrow(() -> new IllegalStateException("Missing registry: " + rqM_22));
        DataResult<rVC<E>> dataResult = rVq_12.id_class(rVC3, rVZ2.id_class(), rVZ2.id_break());
        dataResult.error().ifPresent(partialResult -> id_class.error("Error loading registry data: {}", (Object)partialResult.message()));
    }

    public rVL<rRJ> id_class() {
        return this.id_break(rVL.id_void);
    }

    public static void id_class(rVv_1 rVv_12, rVq_1<?> rVq_12) {
        for (rVZ<?> rVZ2 : id_break.values()) {
            rVm_1.id_class(rVq_12, rVv_12, rVZ2);
        }
    }

    public abstract <E> Optional<rVF<E>> id_class(rqM_2<? extends rVL<E>> var1);

    private static <E> void id_class(ImmutableMap.Builder<rqM_2<? extends rVL<?>>, rVZ<?>> builder, rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec, Codec<E> codec2) {
        builder.put(rqM_22, new rVZ<E>(rqM_22, codec, codec2));
    }

    private static <E> void id_class(ImmutableMap.Builder<rqM_2<? extends rVL<?>>, rVZ<?>> builder, rqM_2<? extends rVL<E>> rqM_22, Codec<E> codec) {
        builder.put(rqM_22, new rVZ<E>(rqM_22, codec, null));
    }

    private static <E> void id_class(rVv_1 rVv_12, rVw_1 rVw_12, rVZ<E> rVZ2) {
        rqM_2<rVL<E>> rqM_22 = rVZ2.id_class();
        boolean bl = !rqM_22.equals(rVL.u) && !rqM_22.equals(rVL.id_void);
        rVF<E> rVF2 = id_byte.id_break(rqM_22);
        rVF<E> rVF3 = rVv_12.id_break(rqM_22);
        for (Map.Entry entry : rVF2.id_throws()) {
            Object t = entry.getValue();
            if (bl) {
                rVw_12.id_class(id_byte, entry.getKey(), rVZ2.id_break(), rVF2.id_class(t), t, rVF2.id_protected(t));
                continue;
            }
            rVF3.id_class(rVF2.id_class(t), entry.getKey(), t, rVF2.id_protected(t));
        }
    }

    private static <R extends rVL<?>> void id_class(rVv_1 rVv_12, rqM_2<R> rqM_22) {
        rVL<rVL<?>> rVL2 = rVy_1.id_break;
        rVL<?> rVL3 = rVL2.id_class(rqM_22);
        if (rVL3 == null) {
            throw new IllegalStateException("Missing builtin registry: " + rqM_22);
        }
        rVm_1.id_class(rVv_12, rVL3);
    }

    private static <E> void id_class(rVv_1 rVv_12, rVL<E> rVL2) {
        rVF<E> rVF2 = rVv_12.id_class(rVL2.id_break()).orElseThrow(() -> new IllegalStateException("Missing registry: " + rVL2.id_break()));
        for (Map.Entry<rqM_2<E>, E> entry : rVL2.id_throws()) {
            E e = entry.getValue();
            rVF2.id_class(rVL2.id_class(e), entry.getKey(), e, rVL2.id_protected(e));
        }
    }

    public <E> rVF<E> id_break(rqM_2<? extends rVL<E>> rqM_22) {
        return this.id_class(rqM_22).orElseThrow(() -> new IllegalStateException("Missing registry: " + rqM_22));
    }

    public static rVv_1 id_break() {
        rVv_1 rVv_12 = new rVv_1();
        rVw_1 rVw_12 = new rVw_1();
        for (rVZ<?> rVZ2 : id_break.values()) {
            rVm_1.id_class(rVv_12, rVw_12, rVZ2);
        }
        rVq_1.id_class(JsonOps.INSTANCE, rVw_12, rVv_12);
        return rVv_12;
    }
}

