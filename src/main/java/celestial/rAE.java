/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rAG;
import celestial.rAL;
import celestial.rAN;
import celestial.rAb_1;
import celestial.rAc_1;
import celestial.rqR_2;
import celestial.rqg_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class rAE<S>
implements rAN {
    protected final rAL id_class;
    protected final CompletableFuture<rqg_3> id_break = new CompletableFuture();
    protected final CompletableFuture<List<S>> id_byte;
    public final Set<rAc_1> id_protected;
    private final int id_throws;
    private int id_case;
    private int id_catch;
    private final AtomicInteger id_private = new AtomicInteger();
    private final AtomicInteger id_implements = new AtomicInteger();

    @Override
    public boolean id_byte() {
        return this.id_break.isDone();
    }

    protected rAE(Executor executor, Executor executor2, rAL rAL2, List<rAc_1> list, rAb_1<S> rAb_12, CompletableFuture<rqg_3> completableFuture) {
        this.id_class = rAL2;
        this.id_throws = list.size();
        this.id_private.incrementAndGet();
        completableFuture.thenRun(this.id_implements::incrementAndGet);
        ArrayList arrayList = Lists.newArrayList();
        CompletableFuture<rqg_3> completableFuture2 = completableFuture;
        this.id_protected = Sets.newHashSet(list);
        for (rAc_1 rAc_12 : list) {
            CompletableFuture<rqg_3> completableFuture3 = completableFuture2;
            CompletableFuture<S> completableFuture4 = rAb_12.create(new rAG(this, executor2, rAc_12, completableFuture3), rAL2, rAc_12, runnable -> {
                this.id_private.incrementAndGet();
                executor.execute(() -> {
                    runnable.run();
                    this.id_implements.incrementAndGet();
                });
            }, runnable -> {
                ++this.id_case;
                executor2.execute(() -> {
                    runnable.run();
                    ++this.id_catch;
                });
            });
            arrayList.add(completableFuture4);
            completableFuture2 = completableFuture4;
        }
        this.id_byte = rqR_2.id_break(arrayList);
    }

    @Override
    public CompletableFuture<rqg_3> id_class() {
        return this.id_byte.thenApply(list -> rqg_3.INSTANCE);
    }

    public static rAE<Void> id_class(rAL rAL3, List<rAc_1> list, Executor executor, Executor executor4, CompletableFuture<rqg_3> completableFuture) {
        return new rAE<Void>(executor, executor4, rAL3, list, (rAu_12, rAL2, rAc_12, executor2, executor3) -> rAc_12.id_class(rAu_12, rAL2, executor, executor3), completableFuture);
    }

    @Override
    public float id_break() {
        int n = this.id_throws - this.id_protected.size();
        float f = this.id_implements.get() * 2 + this.id_catch * 2 + n * 1;
        float f2 = this.id_private.get() * 2 + this.id_case * 2 + this.id_throws * 1;
        return f / f2;
    }

    @Override
    public void id_throws() {
        if (this.id_byte.isCompletedExceptionally()) {
            this.id_byte.join();
        }
    }

    @Override
    public boolean id_protected() {
        return this.id_byte.isDone();
    }
}

