/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAE;
import celestial.rAJ;
import celestial.rAL;
import celestial.rAc_1;
import celestial.rqR_2;
import celestial.rqg_3;
import com.google.common.base.Stopwatch;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAX
extends rAE<rAJ> {
    private static final Logger id_protected = LogManager.getLogger();
    private final Stopwatch id_throws = Stopwatch.createUnstarted();

    public rAX(rAL rAL3, List<rAc_1> list, Executor executor, Executor executor4, CompletableFuture<rqg_3> completableFuture) {
        super(executor, executor4, rAL3, list, (rAu_12, rAL2, rAc_12, executor2, executor3) -> {
            AtomicLong atomicLong = new AtomicLong();
            AtomicLong atomicLong2 = new AtomicLong();
            CompletableFuture<Void> completableFuture = rAc_12.id_class(rAu_12, rAL2, runnable -> executor2.execute(() -> {
                long l = rqR_2.id_byte();
                runnable.run();
                atomicLong.addAndGet(rqR_2.id_byte() - l);
            }), runnable -> executor3.execute(() -> {
                long l = rqR_2.id_byte();
                runnable.run();
                atomicLong2.addAndGet(rqR_2.id_byte() - l);
            }));
            return completableFuture.thenApplyAsync(void_ -> new rAJ(rAc_12.i_(), atomicLong, atomicLong2), executor4);
        }, completableFuture);
        this.id_throws.start();
        this.id_byte.thenAcceptAsync(this::id_class, executor4);
    }

    private void id_class(List<rAJ> list) {
        this.id_throws.stop();
        int n = 0;
        id_protected.info("Resource reload finished after " + this.id_throws.elapsed(TimeUnit.MILLISECONDS) + " ms");
        for (rAJ rAJ2 : list) {
            int n2 = (int)((double)rAJ2.id_break.get() / 1000000.0);
            int n3 = (int)((double)rAJ2.id_byte.get() / 1000000.0);
            int n4 = n2 + n3;
            String string = rAJ2.id_class;
            id_protected.info(string + " took approximately " + n4 + " ms (" + n2 + " ms preparing, " + n3 + " ms applying)");
            n += n3;
        }
        id_protected.info("Total blocking time: " + n + " ms");
    }
}

