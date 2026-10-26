/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.HU;
import celestial.Hv_1;
import celestial.KY;
import celestial.QY;
import celestial.jm_3;
import celestial.lD_2;
import celestial.rTh_1;
import celestial.rYB;
import celestial.rjU_2;
import celestial.rrxA_2;
import celestial.rrxr_3;
import celestial.yN_2;
import celestial.yQ_2;
import celestial.yX_2;
import celestial.ym_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yz_3 {
    private static final Logger id_byte = LogManager.getLogger();
    private final PriorityQueue<yN_2> id_protected = Queues.newPriorityQueue();
    private final Queue<Hv_1> id_throws;
    private final Queue<Runnable> id_case = Queues.newConcurrentLinkedQueue();
    private volatile int id_catch;
    private volatile int id_private;
    public final Hv_1 id_implements;
    private final rTh_1<Runnable> id_finally;
    private final Executor id_extends;
    public rYB id_native;
    public final yX_2 id_volatile;
    private rjU_2 id_final = rjU_2.id_class;
    private final int id_package;
    private final List<Hv_1> id_int = new ArrayList<Hv_1>();
    public static final HU[] id_class = HU.id_public().toArray(new HU[0]);
    public static final boolean id_new = rrxr_3.rb.id_byte();
    public static final boolean id_continue = rrxr_3.Pt.id_byte();
    public static final boolean id_super = rrxr_3.Pt.id_byte();
    public static final boolean id_this = rrxr_3.rj.id_byte();
    public static int id_break;

    public boolean id_byte() {
        Runnable runnable;
        boolean bl = false;
        while ((runnable = this.id_case.poll()) != null) {
            runnable.run();
            bl = true;
        }
        return bl;
    }

    public boolean id_byte(yQ_2 yQ_22) {
        if (this.id_throws.isEmpty()) {
            return false;
        }
        yQ_22.id_class(this);
        return true;
    }

    public yz_3(rYB rYB2, yX_2 yX_22, Executor executor, boolean bl, Hv_1 hv_1) {
        this(rYB2, yX_22, executor, bl, hv_1, -1);
    }

    public yz_3(rYB rYB2, yX_2 yX_22, Executor executor, boolean bl, Hv_1 hv_1, int n) {
        this.id_native = rYB2;
        this.id_volatile = yX_22;
        int n2 = Math.max(1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (HU.id_public().stream().mapToInt(HU::id_goto).sum() * 4) - 1);
        int n3 = Runtime.getRuntime().availableProcessors();
        int n4 = bl ? n3 : Math.min(n3, 4);
        int n5 = Math.max(1, Math.min(n4, n2));
        if (n > 0) {
            n5 = n;
        }
        this.id_implements = hv_1;
        ArrayList arrayList = Lists.newArrayListWithExpectedSize((int)n5);
        try {
            for (int i = 0; i < n5; ++i) {
                arrayList.add(new Hv_1());
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            id_byte.warn("Allocated only {}/{} buffers", (Object)arrayList.size(), (Object)n5);
            int n6 = Math.min(arrayList.size() * 2 / 3, arrayList.size() - 1);
            for (int i = 0; i < n6; ++i) {
                arrayList.remove(arrayList.size() - 1);
            }
            System.gc();
        }
        this.id_throws = Queues.newConcurrentLinkedQueue((Iterable)arrayList);
        this.id_package = this.id_private = this.id_throws.size();
        this.id_extends = executor;
        this.id_finally = rTh_1.id_class(executor, "Chunk Renderer");
        this.id_finally.id_class(this::id_implements);
    }

    public void id_class(yN_2 yN_22) {
        this.id_finally.id_class(() -> {
            this.id_protected.offer(yN_22);
            this.id_catch = this.id_protected.size();
            this.id_implements();
        });
    }

    public CompletableFuture<Void> id_class(lD_2 lD_22, jm_3 jm_32) {
        return CompletableFuture.runAsync(() -> {}, this.id_case::add).thenCompose(void_ -> this.id_break(lD_22, jm_32));
    }

    public void id_class(rYB rYB2) {
        this.id_native = rYB2;
    }

    public void id_class(rjU_2 rjU_22) {
        this.id_final = rjU_22;
    }

    public String id_class() {
        return String.format("pC: %03d, pU: %02d, aB: %02d", this.id_catch, this.id_case.size(), this.id_private);
    }

    public void id_class(yQ_2 yQ_22) {
        yQ_22.id_extends();
    }

    public boolean id_break(yQ_2 yQ_22) {
        this.id_class(yQ_22);
        return true;
    }

    private CompletableFuture<Void> id_break(lD_2 lD_22, jm_3 jm_32) {
        return jm_32.id_break(lD_22);
    }

    public rjU_2 id_break() {
        return this.id_final;
    }

    public boolean id_throws() {
        return this.id_catch == 0 && this.id_case.isEmpty();
    }

    private void id_finally() {
        while (!this.id_protected.isEmpty()) {
            yN_2 yN_22 = this.id_protected.poll();
            if (yN_22 == null) continue;
            yN_22.id_class();
        }
        this.id_catch = 0;
    }

    public void id_catch() {
        long l = System.currentTimeMillis();
        if (this.id_int.size() <= 0) {
            while (this.id_int.size() != this.id_package) {
                this.id_byte();
                Hv_1 hv_1 = this.id_throws.poll();
                if (hv_1 != null) {
                    this.id_int.add(hv_1);
                }
                if (System.currentTimeMillis() <= l + 1000L) continue;
                break;
            }
        }
    }

    public void id_case() {
        this.id_finally();
        this.id_finally.close();
        this.id_throws.clear();
    }

    private void id_implements() {
        yN_2 yN_22;
        if (!this.id_throws.isEmpty() && (yN_22 = this.id_protected.poll()) != null) {
            Hv_1 hv_1 = this.id_throws.poll();
            if (hv_1 == null) {
                this.id_protected.add(yN_22);
                return;
            }
            this.id_catch = this.id_protected.size();
            this.id_private = this.id_throws.size();
            ((CompletableFuture)CompletableFuture.runAsync(() -> {}, this.id_extends).thenCompose(void_ -> yN_22.id_class(hv_1))).whenComplete((ym_32, throwable) -> {
                if (throwable != null) {
                    KY kY = KY.id_class(throwable, "Batching chunks");
                    QY.id_instanceof().id_break(QY.id_instanceof().id_class(kY));
                } else {
                    this.id_finally.id_class(() -> {
                        if (ym_32 == ym_3.SUCCESSFUL) {
                            hv_1.id_class();
                        } else {
                            hv_1.id_break();
                        }
                        this.id_throws.add(hv_1);
                        this.id_private = this.id_throws.size();
                        this.id_implements();
                    });
                }
            });
        }
    }

    public boolean id_protected(yQ_2 yQ_22) {
        return !this.id_throws.isEmpty() && yQ_22.id_class(rrxA_2.id_protected, this);
    }

    public void id_protected() {
        this.id_finally();
    }

    public void id_private() {
        this.id_throws.addAll(this.id_int);
        this.id_int.clear();
    }
}

