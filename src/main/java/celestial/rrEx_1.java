/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.is_3;
import celestial.rFA;
import celestial.rFC;
import celestial.rFb_1;
import celestial.rKd_1;
import celestial.rRu_1;
import celestial.rSm_1;
import celestial.rTQ;
import celestial.rTX;
import celestial.rTh_1;
import celestial.rVh_1;
import celestial.rYB;
import celestial.rZD;
import celestial.rcd_3;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rga_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.roF_2;
import celestial.roJ_2;
import celestial.roL_2;
import celestial.roN_2;
import celestial.roR_2;
import celestial.roZ_2;
import celestial.roj_3;
import celestial.rok_3;
import celestial.rol_3;
import celestial.roq_3;
import celestial.rov_3;
import celestial.roy_3;
import celestial.roz_3;
import celestial.rqR_2;
import celestial.rrEG;
import celestial.rrEJ;
import celestial.rrEM;
import celestial.rrEW;
import celestial.rrEX;
import celestial.rrEZ;
import celestial.rrEd_1;
import celestial.rrEi_1;
import celestial.rrEk_1;
import celestial.rrEl_1;
import celestial.rrEm_1;
import celestial.rrEz_1;
import celestial.rrGk_1;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrxr_3;
import celestial.ruP_2;
import celestial.ruS_2;
import celestial.rvA_2;
import celestial.ryI_2;
import celestial.ryT_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrEx_1
extends roj_3
implements rrEX {
    private static final Logger id_byte = LogManager.getLogger();
    public static final int id_break = 33 + roN_2.id_break();
    private final Long2ObjectLinkedOpenHashMap<rrEG> id_protected = new Long2ObjectLinkedOpenHashMap();
    private volatile Long2ObjectLinkedOpenHashMap<rrEG> id_throws = this.id_protected.clone();
    private final Long2ObjectLinkedOpenHashMap<rrEG> id_case = new Long2ObjectLinkedOpenHashMap();
    private final LongSet id_catch = new LongOpenHashSet();
    public final rrEm_1 id_private;
    private final rrEZ id_implements;
    private final rTQ<Runnable> id_finally;
    private final rKd_1 id_extends;
    private final Supplier<rrEi_1> id_native;
    private final rga_3 id_volatile;
    public final LongSet id_final = new LongOpenHashSet();
    private boolean id_package;
    private final roF_2 id_int;
    private final rTX<roL_2<Runnable>> id_new;
    private final rTX<roL_2<Runnable>> id_continue;
    private final roq_3 id_super;
    private final rrEz_1 id_this;
    private final AtomicInteger id_else = new AtomicInteger();
    private final rrPt_1 id_synchronized;
    private final File id_return;
    private final roy_3 id_public = new roy_3();
    private final Int2ObjectMap<rrEW> id_goto = new Int2ObjectOpenHashMap();
    private final Long2ByteMap id_while = new Long2ByteOpenHashMap();
    private final Queue<Runnable> id_try = Queues.newConcurrentLinkedQueue();
    public int id_instanceof;

    protected boolean id_byte() {
        if (!this.id_package) {
            return false;
        }
        this.id_throws = this.id_protected.clone();
        this.id_package = false;
        return true;
    }

    protected IntSupplier id_byte(long l) {
        return () -> {
            rrEG rrEG2 = this.id_break(l);
            return rrEG2 == null ? rov_3.id_class - 1 : Math.min(rrEG2.id_extends(), rov_3.id_class - 1);
        };
    }

    private rjh_3 id_byte(rhN_2 rhN_22) {
        rjh_3 rjh_32 = rjh_3.id_class(rhN_22);
        rhN_22.id_class(rjh_32);
        rhN_22.id_class.id_class(new rFA(rjh_32.id_break(), rjh_32.id_protected()));
        return rjh_32;
    }

    public CompletableFuture<Either<roJ_2, rrEM>> id_byte(rfj_3 rfj_32) {
        return this.id_class(rfj_32, 2, (int n) -> roN_2.id_volatile).thenApplyAsync(either -> either.mapLeft(list -> (roJ_2)list.get(list.size() / 2)), (Executor)this.id_finally);
    }

    private CompletableFuture<Either<roC_2, rrEM>> id_byte(rrEG rrEG2) {
        CompletableFuture<Either<roC_2, rrEM>> completableFuture = rrEG2.id_class(roN_2.id_volatile.id_throws());
        return completableFuture.thenApplyAsync(either -> {
            roN_2 roN_22 = rrEG.id_break(rrEG2.id_finally());
            return !roN_22.id_break(roN_2.id_volatile) ? rrEG.id_class : either.mapLeft(roC_22 -> {
                roJ_2 roJ_22;
                rfj_3 rfj_32 = rrEG2.id_implements();
                if (roC_22 instanceof roz_3) {
                    roJ_22 = ((roz_3)roC_22).id_final();
                } else {
                    roJ_22 = new roJ_2(this.id_private, (rok_3)roC_22);
                    rrEG2.id_class(new roz_3(roJ_22));
                }
                roJ_22.id_class(() -> rrEG.id_byte(rrEG2.id_finally()));
                roJ_22.id_throws();
                if (this.id_catch.add(rfj_32.id_class())) {
                    roJ_22.id_class(true);
                    this.id_private.id_class(roJ_22.id_volatile().values());
                    Iterable iterable = null;
                    ryI_2<an_3>[] ryI_2Array = roJ_22.id_final();
                    int n = ryI_2Array.length;
                    for (int i = 0; i < n; ++i) {
                        for (an_3 an_32 : ryI_2Array[i]) {
                            if (an_32 instanceof rhd_3 || this.id_private.id_private(an_32)) continue;
                            if (iterable == null) {
                                iterable = Lists.newArrayList((Object[])new an_3[]{an_32});
                                continue;
                            }
                            iterable.add(an_32);
                        }
                    }
                    if (iterable != null) {
                        iterable.forEach(roJ_22::id_break);
                    }
                }
                return roJ_22;
            });
        }, runnable -> this.id_continue.id_class(roF_2.id_class(runnable, rrEG2.id_implements().id_class(), rrEG2::id_finally)));
    }

    public rrEx_1(rrEm_1 rrEm_12, rrGk_1 rrGk_12, DataFixer dataFixer, rrPt_1 rrPt_12, Executor executor, rTQ<Runnable> rTQ2, rol_3 rol_32, rKd_1 rKd_12, roq_3 roq_32, Supplier<rrEi_1> supplier, int n, boolean bl) {
        super(new File(rrGk_12.id_class(rrEm_12.E()), "region"), dataFixer, bl);
        this.id_synchronized = rrPt_12;
        this.id_return = rrGk_12.id_class(rrEm_12.E());
        this.id_private = rrEm_12;
        this.id_extends = rKd_12;
        this.id_finally = rTQ2;
        rTh_1<Runnable> rTh_12 = rTh_1.id_class(executor, "worldgen");
        rTX<Runnable> rTX2 = rTX.id_class("main", rTQ2::id_private);
        this.id_super = roq_32;
        rTh_1<Runnable> rTh_13 = rTh_1.id_class(executor, "light");
        this.id_int = new roF_2((List<rTX<?>>)ImmutableList.of(rTh_12, rTX2, rTh_13), executor, Integer.MAX_VALUE);
        this.id_new = this.id_int.id_class(rTh_12, false);
        this.id_continue = this.id_int.id_class(rTX2, false);
        this.id_implements = new rrEZ(rol_32, this, this.id_private.id_default().id_break(), rTh_13, this.id_int.id_class(rTh_13, false));
        this.id_this = new rrEz_1(this, executor, rTQ2);
        this.id_native = supplier;
        this.id_volatile = new rga_3(new File(this.id_return, "poi"), dataFixer, bl);
        this.id_class(n);
    }

    private void id_class(rhN_2 rhN_22, ruS_2<?>[] ruS_2Array, roJ_2 roJ_22) {
        if (ruS_2Array[0] == null) {
            ruS_2Array[0] = new rZD(roJ_22, 65535);
            ruS_2Array[1] = new rFC(roJ_22.id_private(), this.id_implements, true);
        }
        rhN_22.id_class(roJ_22.id_private(), ruS_2Array[0], ruS_2Array[1]);
        ruP_2.id_class(this.id_private, roJ_22.id_private());
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        for (Object object : this.id_goto.values()) {
            an_3 an_32 = ((rrEW)object).id_byte;
            if (an_32 == rhN_22 || (Integer)an_32.id_throws[51] != roJ_22.id_private().id_break || (Integer)an_32.id_throws[53] != roJ_22.id_private().id_byte) continue;
            ((rrEW)object).id_break(rhN_22);
            if (an_32 instanceof is_3 && ((is_3)an_32).N() != null) {
                arrayList.add(an_32);
            }
            if (an_32.Bh().isEmpty()) continue;
            arrayList2.add(an_32);
        }
        if (!arrayList.isEmpty()) {
            for (Object object : arrayList) {
                rhN_22.id_class.id_class(new rvA_2((an_3)object, ((is_3)object).N()));
            }
        }
        if (!arrayList2.isEmpty()) {
            for (Object object : arrayList2) {
                rhN_22.id_class.id_class(new rFb_1((an_3)object));
            }
        }
    }

    protected rrEG id_class(long l) {
        return (rrEG)this.id_protected.get(l);
    }

    protected void id_class(an_3 an_32, ruS_2<?> ruS_22) {
        rrEW rrEW2 = (rrEW)this.id_goto.get(an_32.V());
        if (rrEW2 != null) {
            rrEW2.id_class(ruS_22);
        }
    }

    protected void id_class(an_3 an_32) {
        boolean bl = an_32 instanceof rSm_1;
        if (rrxr_3.BA.id_byte()) {
            bl = rrxr_3.BA.id_class(an_32);
        }
        if (!bl) {
            aI_2<?> aI_22 = an_32.BC();
            int n = aI_22.id_final() * 16;
            int n2 = aI_22.id_package();
            if (this.id_goto.containsKey(an_32.V())) {
                throw rqR_2.id_byte(new IllegalStateException("Entity is already tracked!"));
            }
            rrEW rrEW2 = new rrEW(this, an_32, n, n2, aI_22.id_int());
            this.id_goto.put(an_32.V(), (Object)rrEW2);
            rrEW2.id_class(this.id_private.id_continue());
            if (an_32 instanceof rhN_2) {
                rhN_2 rhN_22 = (rhN_2)an_32;
                this.id_class(rhN_22, true);
                for (rrEW rrEW3 : this.id_goto.values()) {
                    if (rrEW3.id_byte == rhN_22) continue;
                    rrEW3.id_break(rhN_22);
                }
            }
        }
    }

    @Override
    public Stream<rhN_2> id_class(rfj_3 rfj_32, boolean bl) {
        return this.id_public.id_class(rfj_32.id_class()).filter(rhN_22 -> {
            int n = rrEx_1.id_class(rfj_32, rhN_22, true);
            if (n > this.id_instanceof) {
                return false;
            }
            return !bl || n == this.id_instanceof;
        });
    }

    public void id_class(rhN_2 rhN_22) {
        boolean bl;
        for (rrEW rrEW2 : this.id_goto.values()) {
            if (rrEW2.id_byte == rhN_22) {
                rrEW2.id_class(this.id_private.id_continue());
                continue;
            }
            rrEW2.id_break(rhN_22);
        }
        int n = rfU_2.id_byte(rhN_22.rx()) >> 4;
        int n2 = rfU_2.id_byte(rhN_22.BO()) >> 4;
        rjh_3 rjh_32 = rhN_22.M();
        rjh_3 rjh_33 = rjh_3.id_class(rhN_22);
        long l = rjh_32.id_new().id_class();
        long l2 = rjh_33.id_new().id_class();
        boolean bl2 = this.id_public.id_protected(rhN_22);
        boolean bl3 = this.id_break(rhN_22);
        boolean bl4 = bl = rjh_32.id_continue() != rjh_33.id_continue();
        if (bl || bl2 != bl3) {
            this.id_byte(rhN_22);
            if (!bl2) {
                this.id_this.id_break(rjh_32, rhN_22);
            }
            if (!bl3) {
                this.id_this.id_class(rjh_33, rhN_22);
            }
            if (!bl2 && bl3) {
                this.id_public.id_class(rhN_22);
            }
            if (bl2 && !bl3) {
                this.id_public.id_break(rhN_22);
            }
            if (l != l2) {
                this.id_public.id_class(l, l2, rhN_22);
            }
        }
        int n3 = rjh_32.id_break();
        int n4 = rjh_32.id_protected();
        if (Math.abs(n3 - n) <= this.id_instanceof * 2 && Math.abs(n4 - n2) <= this.id_instanceof * 2) {
            int n5 = Math.min(n, n3) - this.id_instanceof;
            int n6 = Math.min(n2, n4) - this.id_instanceof;
            int n7 = Math.max(n, n3) + this.id_instanceof;
            int n8 = Math.max(n2, n4) + this.id_instanceof;
            for (int i = n5; i <= n7; ++i) {
                for (int j = n6; j <= n8; ++j) {
                    rfj_3 rfj_32 = new rfj_3(i, j);
                    boolean bl5 = rrEx_1.id_class(rfj_32, n3, n4) <= this.id_instanceof;
                    boolean bl6 = rrEx_1.id_class(rfj_32, n, n2) <= this.id_instanceof;
                    this.id_class(rhN_22, rfj_32, new ruS_2[2], bl5, bl6);
                }
            }
        } else {
            boolean bl7;
            boolean bl8;
            rfj_3 rfj_33;
            int n9;
            int n10;
            for (n10 = n3 - this.id_instanceof; n10 <= n3 + this.id_instanceof; ++n10) {
                for (n9 = n4 - this.id_instanceof; n9 <= n4 + this.id_instanceof; ++n9) {
                    rfj_33 = new rfj_3(n10, n9);
                    bl8 = true;
                    bl7 = false;
                    this.id_class(rhN_22, rfj_33, new ruS_2[2], true, false);
                }
            }
            for (n10 = n - this.id_instanceof; n10 <= n + this.id_instanceof; ++n10) {
                for (n9 = n2 - this.id_instanceof; n9 <= n2 + this.id_instanceof; ++n9) {
                    rfj_33 = new rfj_3(n10, n9);
                    bl8 = false;
                    bl7 = true;
                    this.id_class(rhN_22, rfj_33, new ruS_2[2], false, true);
                }
            }
        }
    }

    public CompletableFuture<Void> id_class(roJ_2 roJ_22) {
        return this.id_finally.id_case(() -> roJ_22.id_class(this.id_private));
    }

    private static int id_class(rfj_3 rfj_32, int n, int n2) {
        int n3 = rfj_32.id_break - n;
        int n4 = rfj_32.id_byte - n2;
        return Math.max(Math.abs(n3), Math.abs(n4));
    }

    private static double id_class(rfj_3 rfj_32, an_3 an_32) {
        double d = rfj_32.id_break * 16 + 8;
        double d2 = rfj_32.id_byte * 16 + 8;
        double d3 = d - an_32.rx();
        double d4 = d2 - an_32.BO();
        return d3 * d3 + d4 * d4;
    }

    public static int id_class(rfj_3 rfj_32, rhN_2 rhN_22, boolean bl) {
        int n;
        int n2;
        if (bl) {
            rjh_3 rjh_32 = rhN_22.M();
            n2 = rjh_32.id_break();
            n = rjh_32.id_protected();
        } else {
            n2 = rfU_2.id_byte(rhN_22.rx() / 16.0);
            n = rfU_2.id_byte(rhN_22.BO() / 16.0);
        }
        return rrEx_1.id_class(rfj_32, n2, n);
    }

    private byte id_class(rfj_3 rfj_32, roZ_2 roZ_22) {
        return this.id_while.put(rfj_32.id_class(), (byte)(roZ_22 == roZ_2.PROTOCHUNK ? -1 : 1));
    }

    public CompletableFuture<Either<roJ_2, rrEM>> id_class(rrEG rrEG2) {
        rfj_3 rfj_32 = rrEG2.id_implements();
        CompletableFuture<Either<List<roC_2>, rrEM>> completableFuture = this.id_class(rfj_32, 1, (int n) -> roN_2.id_volatile);
        CompletionStage completionStage = completableFuture.thenApplyAsync(either -> either.flatMap(list -> {
            roJ_2 roJ_22 = (roJ_2)list.get(list.size() / 2);
            roJ_22.id_else();
            return Either.left((Object)roJ_22);
        }), runnable -> this.id_continue.id_class(roF_2.id_class(rrEG2, runnable)));
        ((CompletableFuture)completionStage).thenAcceptAsync(either -> either.mapLeft(roJ_22 -> {
            this.id_else.getAndIncrement();
            ruS_2[] ruS_2Array = new ruS_2[2];
            this.id_class(rfj_32, false).forEach(rhN_22 -> this.id_class((rhN_2)rhN_22, ruS_2Array, (roJ_2)roJ_22));
            return Either.left((Object)roJ_22);
        }), runnable -> this.id_continue.id_class(roF_2.id_class(rrEG2, runnable)));
        return completionStage;
    }

    public void id_class(Writer writer) throws IOException {
        ryT_2 ryT_22 = ryT_2.id_class().id_class("x").id_class("z").id_class("level").id_class("in_memory").id_class("status").id_class("full_status").id_class("accessible_ready").id_class("ticking_ready").id_class("entity_ticking_ready").id_class("ticket").id_class("spawning").id_class("entity_count").id_class("block_entity_count").id_class(writer);
        for (Long2ObjectMap.Entry entry : this.id_throws.long2ObjectEntrySet()) {
            rfj_3 rfj_32 = new rfj_3(entry.getLongKey());
            rrEG rrEG2 = (rrEG)entry.getValue();
            Optional<roC_2> optional = Optional.ofNullable(rrEG2.id_case());
            Optional<Object> optional2 = optional.flatMap(roC_22 -> roC_22 instanceof roJ_2 ? Optional.of((roJ_2)roC_22) : Optional.empty());
            ryT_22.id_class(rfj_32.id_break, rfj_32.id_byte, rrEG2.id_finally(), optional.isPresent(), optional.map(roC_2::id_goto).orElse(null), optional2.map(roJ_2::id_instanceof).orElse(null), rrEx_1.id_class(rrEG2.id_byte()), rrEx_1.id_class(rrEG2.id_class()), rrEx_1.id_class(rrEG2.id_break()), this.id_this.id_byte(entry.getLongKey()), !this.id_throws(rfj_32), optional2.map(roJ_22 -> Stream.of(roJ_22.id_final()).mapToInt(ryI_2::size).sum()).orElse(0), optional2.map(roJ_22 -> roJ_22.id_volatile().size()).orElse(0));
        }
    }

    private static String id_class(CompletableFuture<Either<roJ_2, rrEM>> completableFuture) {
        try {
            Either either = completableFuture.getNow(null);
            return either != null ? (String)either.map(roJ_22 -> "done", rrEM2 -> "unloaded") : "not completed";
        }
        catch (CompletionException completionException) {
            return "failed " + completionException.getCause().getMessage();
        }
        catch (CancellationException cancellationException) {
            return "cancelled";
        }
    }

    public CompletableFuture<Either<roC_2, rrEM>> id_class(rrEG rrEG2, roN_2 roN_22) {
        rfj_3 rfj_32 = rrEG2.id_implements();
        if (roN_22 == roN_2.id_class) {
            return this.id_case(rfj_32);
        }
        CompletableFuture<Either<roC_2, rrEM>> completableFuture = rrEG2.id_class(roN_22.id_throws(), this);
        return completableFuture.thenComposeAsync(either -> {
            roC_2 roC_23;
            Optional optional = either.left();
            if (!optional.isPresent()) {
                return CompletableFuture.completedFuture(either);
            }
            if (roN_22 == roN_2.id_finally) {
                this.id_this.id_class(rrEl_1.id_throws, rfj_32, 33 + roN_2.id_class(roN_2.id_implements), rfj_32);
            }
            if ((roC_23 = (roC_2)optional.get()).id_goto().id_break(roN_22)) {
                CompletableFuture<Either<roC_2, rrEM>> completableFuture = roN_22 == roN_2.id_finally ? this.id_break(rrEG2, roN_22) : roN_22.id_class(this.id_private, this.id_synchronized, this.id_implements, roC_22 -> this.id_byte(rrEG2), roC_23);
                this.id_super.id_class(rfj_32, roN_22);
                return completableFuture;
            }
            return this.id_break(rrEG2, roN_22);
        }, (Executor)this.id_finally);
    }

    protected void id_class(rhN_2 rhN_22, rfj_3 rfj_32, ruS_2<?>[] ruS_2Array, boolean bl, boolean bl2) {
        if ((rYB)rhN_22.id_throws[7] == this.id_private) {
            rrEG rrEG2;
            if (rrxr_3.j.id_byte()) {
                rrxr_3.j.id_class(bl, bl2, rhN_22, rfj_32, this.id_private);
            }
            if (bl2 && !bl && (rrEG2 = this.id_break(rfj_32.id_class())) != null) {
                roJ_2 roJ_22 = rrEG2.id_protected();
                if (roJ_22 != null) {
                    this.id_class(rhN_22, ruS_2Array, roJ_22);
                }
                ruP_2.id_class(this.id_private, rfj_32);
            }
            if (!bl2 && bl) {
                rhN_22.id_class(rfj_32);
            }
        }
    }

    public rrEG id_class(long l, int n, rrEG rrEG2, int n2) {
        if (n2 > id_break && n > id_break) {
            return rrEG2;
        }
        if (rrEG2 != null) {
            rrEG2.id_class(n);
        }
        if (rrEG2 != null) {
            if (n > id_break) {
                this.id_final.add(l);
            } else {
                this.id_final.remove(l);
            }
        }
        if (n <= id_break && rrEG2 == null) {
            rrEG2 = (rrEG)this.id_case.remove(l);
            if (rrEG2 != null) {
                rrEG2.id_class(n);
            } else {
                rrEG2 = new rrEG(new rfj_3(l), n, this.id_implements, this.id_int, this);
            }
            this.id_protected.put(l, (Object)rrEG2);
            this.id_package = true;
        }
        return rrEG2;
    }

    private roN_2 id_class(roN_2 roN_22, int n) {
        roN_2 roN_23 = n == 0 ? roN_22.id_throws() : roN_2.id_class(roN_2.id_class(roN_22) + n);
        return roN_23;
    }

    protected void id_class(int n) {
        int n2 = rfU_2.id_class(n + 1, 3, 64);
        if (n2 != this.id_instanceof) {
            int n3 = this.id_instanceof;
            this.id_instanceof = n2;
            this.id_this.id_class(this.id_instanceof);
            for (rrEG rrEG2 : this.id_protected.values()) {
                rfj_3 rfj_32 = rrEG2.id_implements();
                ruS_2[] ruS_2Array = new ruS_2[2];
                this.id_class(rfj_32, false).forEach(rhN_22 -> {
                    int n2 = rrEx_1.id_class(rfj_32, rhN_22, true);
                    boolean bl = n2 <= n3;
                    boolean bl2 = n2 <= this.id_instanceof;
                    this.id_class((rhN_2)rhN_22, rfj_32, ruS_2Array, bl, bl2);
                });
            }
        }
    }

    private boolean id_class(roC_2 roC_22) {
        this.id_volatile.id_class(roC_22.id_private());
        if (!roC_22.id_continue()) {
            return false;
        }
        roC_22.id_class(this.id_private.r());
        roC_22.id_break(false);
        rfj_3 rfj_32 = roC_22.id_private();
        try {
            roN_2 roN_22 = roC_22.id_goto();
            if (roN_22.id_catch() != roZ_2.LEVELCHUNK) {
                if (this.id_private(rfj_32)) {
                    return false;
                }
                if (roN_22 == roN_2.id_class && roC_22.id_super().values().stream().noneMatch(rrrH::id_throws)) {
                    return false;
                }
            }
            rcd_3 rcd_32 = roR_2.id_class(this.id_private, roC_22);
            this.id_class(rfj_32, rcd_32);
            this.id_class(rfj_32, roN_22.id_catch());
            return true;
        }
        catch (Exception exception) {
            id_byte.error("Failed to save chunk {},{}", (Object)rfj_32.id_break, (Object)rfj_32.id_byte, (Object)exception);
            return false;
        }
    }

    private CompletableFuture<Either<List<roC_2>, rrEM>> id_class(rfj_3 rfj_32, int n, IntFunction<roN_2> intFunction) {
        ArrayList arrayList = Lists.newArrayList();
        int n2 = rfj_32.id_break;
        int n3 = rfj_32.id_byte;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                int n4 = Math.max(Math.abs(j), Math.abs(i));
                rfj_3 rfj_33 = new rfj_3(n2 + j, n3 + i);
                long l = rfj_33.id_class();
                rrEG rrEG2 = this.id_class(l);
                if (rrEG2 == null) {
                    return CompletableFuture.completedFuture(Either.right((Object)new rrEd_1(this, rfj_33)));
                }
                roN_2 roN_22 = intFunction.apply(n4);
                CompletableFuture<Either<roC_2, rrEM>> completableFuture = rrEG2.id_class(roN_22, this);
                arrayList.add(completableFuture);
            }
        }
        CompletableFuture completableFuture = rqR_2.id_break(arrayList);
        return completableFuture.thenApply(list -> {
            ArrayList arrayList = Lists.newArrayList();
            int n4 = 0;
            for (Either either : list) {
                Optional optional = either.left();
                if (!optional.isPresent()) {
                    int n5 = n4;
                    return Either.right((Object)new rrEk_1(this, n2, n5, n, n3, either));
                }
                arrayList.add((roC_2)optional.get());
                ++n4;
            }
            return Either.left((Object)arrayList);
        });
    }

    protected void id_class(boolean bl) {
        if (bl) {
            List list = this.id_throws.values().stream().filter(rrEG::id_native).peek(rrEG::id_volatile).collect(Collectors.toList());
            MutableBoolean mutableBoolean = new MutableBoolean();
            do {
                mutableBoolean.setFalse();
                list.stream().map(rrEG2 -> {
                    CompletableFuture<roC_2> completableFuture;
                    do {
                        completableFuture = rrEG2.id_catch();
                        this.id_finally.id_byte(completableFuture::isDone);
                    } while (completableFuture != rrEG2.id_catch());
                    return completableFuture.join();
                }).filter(roC_22 -> roC_22 instanceof roz_3 || roC_22 instanceof roJ_2).filter(this::id_class).forEach(roC_22 -> mutableBoolean.setTrue());
            } while (mutableBoolean.isTrue());
            this.id_break(() -> true);
            this.id_class();
            id_byte.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", (Object)this.id_return.getName());
        } else {
            this.id_throws.values().stream().filter(rrEG::id_native).forEach(rrEG2 -> {
                roC_2 roC_22 = rrEG2.id_catch().getNow(null);
                if (roC_22 instanceof roz_3 || roC_22 instanceof roJ_2) {
                    this.id_class(roC_22);
                    rrEG2.id_volatile();
                }
            });
        }
    }

    public void id_class(rhN_2 rhN_22, boolean bl) {
        boolean bl2 = this.id_break(rhN_22);
        boolean bl3 = this.id_public.id_byte(rhN_22);
        int n = rfU_2.id_byte(rhN_22.rx()) >> 4;
        int n2 = rfU_2.id_byte(rhN_22.BO()) >> 4;
        if (bl) {
            this.id_public.id_class(rfj_3.id_class(n, n2), rhN_22, bl2);
            this.id_byte(rhN_22);
            if (!bl2) {
                this.id_this.id_class(rjh_3.id_class(rhN_22), rhN_22);
            }
        } else {
            rjh_3 rjh_32 = rhN_22.M();
            this.id_public.id_class(rjh_32.id_new().id_class(), rhN_22);
            if (!bl3) {
                this.id_this.id_break(rjh_32, rhN_22);
            }
        }
        for (int i = n - this.id_instanceof; i <= n + this.id_instanceof; ++i) {
            for (int j = n2 - this.id_instanceof; j <= n2 + this.id_instanceof; ++j) {
                rfj_3 rfj_32 = new rfj_3(i, j);
                this.id_class(rhN_22, rfj_32, new ruS_2[2], !bl, bl);
            }
        }
    }

    protected void id_class(BooleanSupplier booleanSupplier) {
        this.id_volatile.id_class(booleanSupplier);
        if (!this.id_private.G()) {
            this.id_break(booleanSupplier);
        }
    }

    private void id_class(long l, rrEG rrEG2) {
        CompletableFuture<roC_2> completableFuture = rrEG2.id_catch();
        ((CompletableFuture)completableFuture.thenAcceptAsync(roC_22 -> {
            CompletableFuture<roC_2> completableFuture2 = rrEG2.id_catch();
            if (completableFuture2 != completableFuture) {
                this.id_class(l, rrEG2);
            } else if (this.id_case.remove(l, (Object)rrEG2) && roC_22 != null) {
                if (roC_22 instanceof roJ_2) {
                    ((roJ_2)roC_22).id_class(false);
                }
                this.id_class((roC_2)roC_22);
                if (this.id_catch.remove(l) && roC_22 instanceof roJ_2) {
                    roJ_2 roJ_22 = (roJ_2)roC_22;
                    this.id_private.id_class(roJ_22);
                }
                this.id_implements.id_class(roC_22.id_private());
                this.id_implements.id_break();
                this.id_super.id_class(roC_22.id_private(), null);
            }
        }, this.id_try::add)).whenComplete((void_, throwable) -> {
            if (throwable != null) {
                id_byte.error("Failed to save chunk " + rrEG2.id_implements(), throwable);
            }
        });
    }

    @Override
    public void close() throws IOException {
        try {
            this.id_int.close();
            this.id_volatile.close();
        }
        finally {
            super.close();
        }
    }

    protected rrEZ id_break() {
        return this.id_implements;
    }

    public CompletableFuture<Either<roJ_2, rrEM>> id_break(rrEG rrEG2) {
        return rrEG2.id_class(roN_2.id_volatile, this).thenApplyAsync(either -> either.mapLeft(roC_22 -> {
            roJ_2 roJ_22 = (roJ_2)roC_22;
            roJ_22.id_public();
            return roJ_22;
        }), runnable -> this.id_continue.id_class(roF_2.id_class(rrEG2, runnable)));
    }

    private void id_break(BooleanSupplier booleanSupplier) {
        Runnable runnable;
        LongIterator longIterator = this.id_final.iterator();
        int n = 0;
        while (longIterator.hasNext() && (booleanSupplier.getAsBoolean() || n < 200 || this.id_final.size() > 2000)) {
            long l = longIterator.nextLong();
            rrEG rrEG2 = (rrEG)this.id_protected.remove(l);
            if (rrEG2 != null) {
                this.id_case.put(l, (Object)rrEG2);
                this.id_package = true;
                ++n;
                this.id_class(l, rrEG2);
            }
            longIterator.remove();
        }
        while ((booleanSupplier.getAsBoolean() || this.id_try.size() > 2000) && (runnable = this.id_try.poll()) != null) {
            runnable.run();
        }
    }

    protected rrEG id_break(long l) {
        return (rrEG)this.id_throws.get(l);
    }

    private CompletableFuture<Either<roC_2, rrEM>> id_break(rrEG rrEG2, roN_2 roN_22) {
        rfj_3 rfj_32 = rrEG2.id_implements();
        CompletableFuture<Either<List<roC_2>, rrEM>> completableFuture = this.id_class(rfj_32, roN_22.id_case(), (int n) -> this.id_class(roN_22, n));
        return completableFuture.thenComposeAsync(either -> (CompletionStage)either.map(list -> {
            try {
                CompletableFuture<Either<roC_2, rrEM>> completableFuture = roN_22.id_class(this.id_private, this.id_extends, this.id_synchronized, this.id_implements, roC_22 -> this.id_byte(rrEG2), (List<roC_2>)list);
                this.id_super.id_class(rfj_32, roN_22);
                return completableFuture;
            }
            catch (Exception exception) {
                KY kY = KY.id_class(exception, "Exception generating new chunk");
                Ko_1 ko_1 = kY.id_class("Chunk to be generated");
                ko_1.id_class("Location", String.format("%d,%d", rfj_32.id_break, rfj_32.id_byte));
                ko_1.id_class("Position hash", rfj_3.id_class(rfj_32.id_break, rfj_32.id_byte));
                ko_1.id_class("Generator", this.id_extends);
                throw new KU(kY);
            }
        }, rrEM2 -> {
            this.id_protected(rfj_32);
            return CompletableFuture.completedFuture(Either.right((Object)rrEM2));
        }), runnable -> this.id_new.id_class(roF_2.id_class(rrEG2, runnable)));
    }

    protected void id_break(an_3 an_32) {
        Object object;
        if (an_32 instanceof rhN_2) {
            object = (rhN_2)an_32;
            this.id_class((rhN_2)object, false);
            for (rrEW rrEW2 : this.id_goto.values()) {
                rrEW2.id_class((rhN_2)object);
            }
        }
        if ((object = (rrEW)this.id_goto.remove(an_32.V())) != null) {
            ((rrEW)object).id_class();
        }
    }

    protected void id_break(an_3 an_32, ruS_2<?> ruS_22) {
        rrEW rrEW2 = (rrEW)this.id_goto.get(an_32.V());
        if (rrEW2 != null) {
            rrEW2.id_break(ruS_22);
        }
    }

    public String id_break(rfj_3 rfj_32) {
        rrEG rrEG2 = this.id_break(rfj_32.id_class());
        if (rrEG2 == null) {
            return "null";
        }
        String string = rrEG2.id_finally() + "\n";
        roN_2 roN_22 = rrEG2.id_throws();
        roC_2 roC_22 = rrEG2.id_case();
        if (roN_22 != null) {
            string = string + "St: \u00a7" + roN_22.id_byte() + roN_22 + "\u00a7r\n";
        }
        if (roC_22 != null) {
            string = string + "Ch: \u00a7" + roC_22.id_goto().id_byte() + roC_22.id_goto() + "\u00a7r\n";
        }
        rrEJ rrEJ2 = rrEG2.id_private();
        string = string + "\u00a7" + rrEJ2.ordinal() + rrEJ2;
        return string + "\u00a7r";
    }

    private boolean id_break(rhN_2 rhN_22) {
        return rhN_22.id_native() && !this.id_private.B().id_break(rRu_1.id_int);
    }

    public int id_throws() {
        return this.id_throws.size();
    }

    public boolean id_throws(rfj_3 rfj_32) {
        long l = rfj_32.id_class();
        return !this.id_this.id_protected(l) || this.id_public.id_class(l).noneMatch(rhN_22 -> !rhN_22.id_native() && rrEx_1.id_class(rfj_32, (an_3)rhN_22) < 16384.0);
    }

    private void id_catch(rfj_3 rfj_32) {
        this.id_while.put(rfj_32.id_class(), (byte)-1);
    }

    protected Iterable<rrEG> id_catch() {
        return Iterables.unmodifiableIterable((Iterable)this.id_throws.values());
    }

    private CompletableFuture<Either<roC_2, rrEM>> id_case(rfj_3 rfj_32) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                rcd_3 rcd_32 = this.id_implements(rfj_32);
                if (rcd_32 != null) {
                    boolean bl;
                    boolean bl2 = bl = rcd_32.id_byte("Level", 10) && rcd_32.id_int("Level").id_byte("Status", 8);
                    if (bl) {
                        rok_3 rok_32 = roR_2.id_class(this.id_private, this.id_synchronized, this.id_volatile, rfj_32, rcd_32);
                        rok_32.id_class(this.id_private.r());
                        this.id_class(rfj_32, rok_32.id_goto().id_catch());
                        return Either.left((Object)rok_32);
                    }
                    id_byte.error("Chunk file at {} is missing level data, skipping", (Object)rfj_32);
                }
            }
            catch (KU kU) {
                Throwable throwable = kU.getCause();
                if (!(throwable instanceof IOException)) {
                    this.id_catch(rfj_32);
                    throw kU;
                }
                id_byte.error("Couldn't load chunk {}", (Object)rfj_32, (Object)throwable);
            }
            catch (Exception exception) {
                id_byte.error("Couldn't load chunk {}", (Object)rfj_32, (Object)exception);
            }
            this.id_catch(rfj_32);
            return Either.left((Object)new rok_3(rfj_32, rVh_1.id_class));
        }, this.id_finally);
    }

    protected rrEz_1 id_case() {
        return this.id_this;
    }

    private rcd_3 id_implements(rfj_3 rfj_32) throws IOException {
        rcd_3 rcd_32 = this.id_class(rfj_32);
        return rcd_32 == null ? null : this.id_class(this.id_private.E(), this.id_native, rcd_32);
    }

    protected rga_3 id_implements() {
        return this.id_volatile;
    }

    protected void id_protected(rfj_3 rfj_32) {
        this.id_finally.id_private(rqR_2.id_class(() -> this.id_this.id_break(rrEl_1.id_throws, rfj_32, 33 + roN_2.id_class(roN_2.id_implements), rfj_32), () -> "release light ticket " + rfj_32));
    }

    public int id_protected() {
        return this.id_else.get();
    }

    private boolean id_private(rfj_3 rfj_32) {
        rcd_3 rcd_32;
        byte by = this.id_while.get(rfj_32.id_class());
        if (by != 0) {
            return by == 1;
        }
        try {
            rcd_32 = this.id_implements(rfj_32);
            if (rcd_32 == null) {
                this.id_catch(rfj_32);
                return false;
            }
        }
        catch (Exception exception) {
            id_byte.error("Failed to read chunk {}", (Object)rfj_32, (Object)exception);
            this.id_catch(rfj_32);
            return false;
        }
        roZ_2 roZ_22 = roR_2.id_class(rcd_32);
        return this.id_class(rfj_32, roZ_22) == 1;
    }

    protected void id_private() {
        ArrayList arrayList = Lists.newArrayList();
        List<rhN_2> list = this.id_private.id_continue();
        for (rrEW rrEW2 : this.id_goto.values()) {
            rjh_3 rjh_32 = rrEW2.id_throws;
            rjh_3 rjh_33 = rjh_3.id_class(rrEW2.id_byte);
            if (!Objects.equals(rjh_32, rjh_33)) {
                rrEW2.id_class(list);
                an_3 an_32 = rrEW2.id_byte;
                if (an_32 instanceof rhN_2) {
                    arrayList.add((rhN_2)an_32);
                }
                rrEW2.id_throws = rjh_33;
            }
            rrEW2.id_break.id_class();
        }
        if (!arrayList.isEmpty()) {
            for (rrEW rrEW2 : this.id_goto.values()) {
                rrEW2.id_class(arrayList);
            }
        }
    }
}

