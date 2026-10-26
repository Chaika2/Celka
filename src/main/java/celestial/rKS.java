/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.OptionalDynamic
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rTv_1;
import celestial.rYB;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rfj_3;
import celestial.rjh_3;
import celestial.roY_2;
import celestial.rqR_2;
import celestial.rqu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rKS<R>
implements AutoCloseable {
    private static final Logger id_class = LogManager.getLogger();
    private final roY_2 id_break;
    private final Long2ObjectMap<Optional<R>> id_byte = new Long2ObjectOpenHashMap();
    private final LongLinkedOpenHashSet id_protected = new LongLinkedOpenHashSet();
    private final Function<Runnable, Codec<R>> id_throws;
    private final Function<Runnable, R> id_case;
    private final DataFixer id_catch;
    private final rTv_1 id_private;

    private rcd_3 id_byte(rfj_3 rfj_32) {
        try {
            return this.id_break.id_class(rfj_32);
        }
        catch (IOException iOException) {
            id_class.error("Error reading chunk {} data from disk", (Object)rfj_32, (Object)iOException);
            return null;
        }
    }

    protected Optional<R> id_byte(long l) {
        return (Optional)this.id_byte.get(l);
    }

    public rKS(File file, Function<Runnable, Codec<R>> function, Function<Runnable, R> function2, DataFixer dataFixer, rTv_1 rTv_12, boolean bl) {
        this.id_throws = function;
        this.id_case = function2;
        this.id_catch = dataFixer;
        this.id_private = rTv_12;
        this.id_break = new roY_2(file, bl, file.getName());
    }

    private <T> Dynamic<T> id_class(rfj_3 rfj_32, DynamicOps<T> dynamicOps) {
        HashMap hashMap = Maps.newHashMap();
        for (int i = 0; i < 16; ++i) {
            long l = rjh_3.id_class(rfj_32, i).id_continue();
            this.id_protected.remove(l);
            Optional optional = (Optional)this.id_byte.get(l);
            if (optional == null || !optional.isPresent()) continue;
            DataResult dataResult = this.id_throws.apply(() -> this.id_class(l)).encodeStart(dynamicOps, optional.get());
            String string = Integer.toString(i);
            dataResult.resultOrPartial(arg_0 -> ((Logger)id_class).error(arg_0)).ifPresent(object -> hashMap.put(dynamicOps.createString(string), object));
        }
        return new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of((Object)dynamicOps.createString("Sections"), (Object)dynamicOps.createMap((Map)hashMap), (Object)dynamicOps.createString("DataVersion"), (Object)dynamicOps.createInt(rqu_3.id_class().getWorldVersion()))));
    }

    protected void id_class(BooleanSupplier booleanSupplier) {
        while (!this.id_protected.isEmpty() && booleanSupplier.getAsBoolean()) {
            rfj_3 rfj_32 = rjh_3.id_class(this.id_protected.firstLong()).id_new();
            this.id_protected(rfj_32);
        }
    }

    protected void id_class(long l) {
        Optional optional = (Optional)this.id_byte.get(l);
        if (optional != null && optional.isPresent()) {
            this.id_protected.add(l);
        } else {
            id_class.warn("No data for position: {}", (Object)rjh_3.id_class(l));
        }
    }

    public void id_class(rfj_3 rfj_32) {
        if (!this.id_protected.isEmpty()) {
            for (int i = 0; i < 16; ++i) {
                long l = rjh_3.id_class(rfj_32, i).id_continue();
                if (!this.id_protected.contains(l)) continue;
                this.id_protected(rfj_32);
                return;
            }
        }
    }

    private static int id_class(Dynamic<?> dynamic) {
        return dynamic.get("DataVersion").asInt(1945);
    }

    private <T> void id_class(rfj_3 rfj_32, DynamicOps<T> dynamicOps, T t) {
        if (t == null) {
            for (int i = 0; i < 16; ++i) {
                this.id_byte.put(rjh_3.id_class(rfj_32, i).id_continue(), Optional.empty());
            }
        } else {
            int n;
            Dynamic dynamic2 = new Dynamic(dynamicOps, t);
            int n2 = rKS.id_class(dynamic2);
            boolean bl = n2 != (n = rqu_3.id_class().getWorldVersion());
            Dynamic dynamic3 = this.id_catch.update(this.id_private.id_class(), dynamic2, n2, n);
            OptionalDynamic optionalDynamic = dynamic3.get("Sections");
            for (int i = 0; i < 16; ++i) {
                long l = rjh_3.id_class(rfj_32, i).id_continue();
                Optional optional = optionalDynamic.get(Integer.toString(i)).result().flatMap(dynamic -> this.id_throws.apply(() -> this.id_class(l)).parse(dynamic).resultOrPartial(arg_0 -> ((Logger)id_class).error(arg_0)));
                this.id_byte.put(l, optional);
                optional.ifPresent(object -> {
                    this.id_break(l);
                    if (bl) {
                        this.id_class(l);
                    }
                });
            }
        }
    }

    @Override
    public void close() throws IOException {
        this.id_break.close();
    }

    protected void id_break(long l) {
    }

    private void id_break(rfj_3 rfj_32) {
        this.id_class(rfj_32, rcf_3.id_class, this.id_byte(rfj_32));
    }

    protected boolean id_break(rjh_3 rjh_32) {
        return rYB.id_protected(rjh_3.id_catch(rjh_32.id_byte()));
    }

    protected R id_throws(long l) {
        Optional<R> optional = this.id_protected(l);
        if (optional.isPresent()) {
            return optional.get();
        }
        R r = this.id_case.apply(() -> this.id_class(l));
        this.id_byte.put(l, Optional.of(r));
        return r;
    }

    private void id_protected(rfj_3 rfj_32) {
        Dynamic<rcZ_2> dynamic = this.id_class(rfj_32, rcf_3.id_class);
        rcZ_2 rcZ_22 = (rcZ_2)dynamic.getValue();
        if (rcZ_22 instanceof rcd_3) {
            this.id_break.id_class(rfj_32, (rcd_3)rcZ_22);
        } else {
            id_class.error("Expected compound tag, got {}", (Object)rcZ_22);
        }
    }

    protected Optional<R> id_protected(long l) {
        rjh_3 rjh_32 = rjh_3.id_class(l);
        if (this.id_break(rjh_32)) {
            return Optional.empty();
        }
        Optional<R> optional = this.id_byte(l);
        if (optional != null) {
            return optional;
        }
        this.id_break(rjh_32.id_new());
        optional = this.id_byte(l);
        if (optional == null) {
            throw rqR_2.id_byte(new IllegalStateException());
        }
        return optional;
    }
}

