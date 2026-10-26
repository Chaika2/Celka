/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rTX;
import celestial.rfj_3;
import celestial.rhN_2;
import celestial.rjh_3;
import celestial.roA_2;
import celestial.roF_2;
import celestial.roJ_2;
import celestial.roL_2;
import celestial.roN_2;
import celestial.rqv_3;
import celestial.rrEA;
import celestial.rrEC;
import celestial.rrEF;
import celestial.rrEG;
import celestial.rrEM;
import celestial.rrEl_1;
import celestial.rrEn_1;
import celestial.rrEx_1;
import celestial.rrxr_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrEL {
    private static final Logger id_class = LogManager.getLogger();
    public static final int id_break = 33 + roN_2.id_class(roN_2.id_volatile) - 2;
    public final Long2ObjectMap<ObjectSet<rhN_2>> id_byte = new Long2ObjectOpenHashMap();
    public final Long2ObjectOpenHashMap<rqv_3<rrEF<?>>> id_protected = new Long2ObjectOpenHashMap();
    private final rrEA id_throws = new rrEA(this);
    private final rrEn_1 id_case = new rrEn_1(this, 8);
    private final rrEC id_catch = new rrEC(this, 65);
    public final Set<rrEG> id_private = Sets.newHashSet();
    public final roF_2 id_implements;
    public final rTX<roL_2<Runnable>> id_finally;
    public final rTX<roA_2> id_extends;
    public final LongSet id_native = new LongOpenHashSet();
    public final Executor id_volatile;
    private long id_final;
    private final Long2ObjectOpenHashMap<rqv_3<rrEF<?>>> id_package = new Long2ObjectOpenHashMap();

    public <T> void id_byte(rrEl_1<T> rrEl_12, rfj_3 rfj_32, int n, T t) {
        this.id_class(rfj_32.id_class(), new rrEF<T>(rrEl_12, 33 - n, t));
    }

    public String id_byte() {
        return this.id_implements.id_class();
    }

    protected String id_byte(long l) {
        rqv_3 rqv_32 = (rqv_3)this.id_protected.get(l);
        String string = rqv_32 != null && !rqv_32.isEmpty() ? ((rrEF)rqv_32.id_class()).toString() : "no_ticket";
        return string;
    }

    protected rrEL(Executor executor, Executor executor2) {
        roF_2 roF_22;
        rTX<Runnable> rTX2 = rTX.id_class("player ticket throttler", executor2::execute);
        this.id_implements = roF_22 = new roF_2((List<rTX<?>>)ImmutableList.of(rTX2), executor, 4);
        this.id_finally = roF_22.id_class(rTX2, true);
        this.id_extends = roF_22.id_class(rTX2);
        this.id_volatile = executor2;
    }

    public void id_class(rjh_3 rjh_32, rhN_2 rhN_22) {
        long l2 = rjh_32.id_new().id_class();
        ((ObjectSet)this.id_byte.computeIfAbsent(l2, l -> new ObjectOpenHashSet())).add((Object)rhN_22);
        this.id_case.id_break(l2, 0, true);
        this.id_catch.id_break(l2, 0, true);
    }

    protected void id_class(rfj_3 rfj_32, boolean bl) {
        rrEF<rfj_3> rrEF2 = new rrEF<rfj_3>(rrEl_1.id_protected, 31, rfj_32);
        if (bl) {
            this.id_class(rfj_32.id_class(), rrEF2);
        } else {
            this.id_break(rfj_32.id_class(), rrEF2);
        }
    }

    protected void id_class() {
        ++this.id_final;
        ObjectIterator objectIterator = this.id_protected.long2ObjectEntrySet().fastIterator();
        while (objectIterator.hasNext()) {
            Long2ObjectMap.Entry entry = (Long2ObjectMap.Entry)objectIterator.next();
            if (((rqv_3)entry.getValue()).removeIf(rrEF2 -> rrEF2.id_break(this.id_final))) {
                this.id_throws.id_break(entry.getLongKey(), rrEL.id_class((rqv_3)entry.getValue()), false);
            }
            if (!((rqv_3)entry.getValue()).isEmpty()) continue;
            objectIterator.remove();
        }
    }

    protected void id_class(int n) {
        this.id_catch.id_break(n);
    }

    private static int id_class(rqv_3<rrEF<?>> rqv_32) {
        return !rqv_32.isEmpty() ? rqv_32.id_class().id_break() : rrEx_1.id_break + 1;
    }

    public boolean id_class(rrEx_1 rrEx_12) {
        boolean bl;
        this.id_case.id_class();
        this.id_catch.id_class();
        int n = Integer.MAX_VALUE - this.id_throws.id_break(Integer.MAX_VALUE);
        boolean bl2 = bl = n != 0;
        if (bl) {
            // empty if block
        }
        if (!this.id_private.isEmpty()) {
            this.id_private.forEach(rrEG2 -> rrEG2.id_class(rrEx_12));
            this.id_private.clear();
            return true;
        }
        if (!this.id_native.isEmpty()) {
            LongIterator longIterator = this.id_native.iterator();
            while (longIterator.hasNext()) {
                long l = longIterator.nextLong();
                if (!this.id_case(l).stream().anyMatch(rrEF2 -> rrEF2.id_class() == rrEl_1.id_byte)) continue;
                rrEG rrEG3 = rrEx_12.id_class(l);
                if (rrEG3 == null) {
                    throw new IllegalStateException();
                }
                CompletableFuture<Either<roJ_2, rrEM>> completableFuture = rrEG3.id_break();
                completableFuture.thenAccept(either -> this.id_volatile.execute(() -> this.id_extends.id_class(roF_2.id_class(() -> {}, l, false))));
            }
            this.id_native.clear();
        }
        return bl;
    }

    public void id_class(long l2, rrEF<?> rrEF2) {
        rqv_3<rrEF<?>> rqv_32 = this.id_case(l2);
        int n = rrEL.id_class(rqv_32);
        rrEF<?> rrEF3 = rqv_32.id_class(rrEF2);
        rrEF3.id_class(this.id_final);
        if (rrEF2.id_break() < n) {
            this.id_throws.id_break(l2, rrEF2.id_break(), true);
        }
        if (rrxr_3.id_break(rrEF2, rrxr_3.Pj, new Object[0])) {
            rqv_3 rqv_33 = (rqv_3)this.id_package.computeIfAbsent(l2, l -> rqv_3.id_class(4));
            rqv_33.id_class(rrEF3);
        }
    }

    protected abstract rrEG id_class(long var1, int var3, rrEG var4, int var5);

    protected abstract boolean id_class(long var1);

    public <T> void id_class(rrEl_1<T> rrEl_12, rfj_3 rfj_32, int n, T t) {
        this.id_class(rfj_32.id_class(), new rrEF<T>(rrEl_12, n, t));
    }

    protected abstract rrEG id_break(long var1);

    public <T> void id_break(rrEl_1<T> rrEl_12, rfj_3 rfj_32, int n, T t) {
        rrEF<T> rrEF2 = new rrEF<T>(rrEl_12, n, t);
        this.id_break(rfj_32.id_class(), rrEF2);
    }

    public void id_break(rjh_3 rjh_32, rhN_2 rhN_22) {
        long l = rjh_32.id_new().id_class();
        ObjectSet objectSet = (ObjectSet)this.id_byte.get(l);
        objectSet.remove((Object)rhN_22);
        if (objectSet.isEmpty()) {
            this.id_byte.remove(l);
            this.id_case.id_break(l, Integer.MAX_VALUE, false);
            this.id_catch.id_break(l, Integer.MAX_VALUE, false);
        }
    }

    public void id_break(long l, rrEF<?> rrEF2) {
        rqv_3 rqv_32;
        rqv_3<rrEF<?>> rqv_33 = this.id_case(l);
        if (rqv_33.remove(rrEF2)) {
            // empty if block
        }
        if (rqv_33.isEmpty()) {
            this.id_protected.remove(l);
        }
        this.id_throws.id_break(l, rrEL.id_class(rqv_33), false);
        if (rrxr_3.id_break(rrEF2, rrxr_3.Pj, new Object[0]) && (rqv_32 = (rqv_3)this.id_package.get(l)) != null) {
            rqv_32.remove(rrEF2);
        }
    }

    public int id_break() {
        this.id_case.id_class();
        return this.id_case.id_class.size();
    }

    public <T> void id_throws(rrEl_1<T> rrEl_12, rfj_3 rfj_32, int n, T t) {
        rrEF rrEF2 = (rrEF)rrxr_3.Pf.id_class(rrEl_12, 33 - n, t, true);
        this.id_class(rfj_32.id_class(), rrEF2);
    }

    public boolean id_throws(long l) {
        rqv_3 rqv_32 = (rqv_3)this.id_package.get(l);
        return rqv_32 != null && !rqv_32.isEmpty();
    }

    private rqv_3<rrEF<?>> id_case(long l2) {
        return (rqv_3)this.id_protected.computeIfAbsent(l2, l -> rqv_3.id_class(4));
    }

    public <T> void id_case(rrEl_1<T> rrEl_12, rfj_3 rfj_32, int n, T t) {
        rrEF rrEF2 = (rrEF)rrxr_3.Pf.id_class(rrEl_12, 33 - n, t, true);
        this.id_break(rfj_32.id_class(), rrEF2);
    }

    public boolean id_protected(long l) {
        this.id_case.id_class();
        return this.id_case.id_class.containsKey(l);
    }

    public <T> void id_protected(rrEl_1<T> rrEl_12, rfj_3 rfj_32, int n, T t) {
        rrEF<T> rrEF2 = new rrEF<T>(rrEl_12, 33 - n, t);
        this.id_break(rfj_32.id_class(), rrEF2);
    }
}

