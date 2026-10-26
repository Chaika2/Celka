/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.rFC;
import celestial.rFZ;
import celestial.rTX;
import celestial.rZD;
import celestial.rrbb_3;
import celestial.rrzB_2;
import celestial.ruS_2;
import com.google.common.collect.Queues;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rTQ<R extends Runnable>
implements Executor,
rTX<R> {
    private final String id_class;
    private static final Logger id_break = LogManager.getLogger();
    private final Queue<R> id_protected = Queues.newConcurrentLinkedQueue();
    private int id_throws;

    protected abstract boolean id_byte(R var1);

    public void id_byte(BooleanSupplier booleanSupplier) {
        ++this.id_throws;
        try {
            while (!booleanSupplier.getAsBoolean()) {
                if (this.k_()) continue;
                this.l_();
            }
        }
        finally {
            --this.id_throws;
        }
    }

    protected rTQ(String string) {
        this.id_class = string;
    }

    public <V> CompletableFuture<V> id_class(Supplier<V> supplier) {
        return this.y() ? CompletableFuture.supplyAsync(supplier, this) : CompletableFuture.completedFuture(supplier.get());
    }

    private CompletableFuture<Void> id_class(Runnable runnable) {
        return CompletableFuture.supplyAsync(() -> {
            runnable.run();
            return null;
        }, this);
    }

    private double id_class(R[] RArray) {
        double d = 0.0;
        for (int i = 0; i < RArray.length; ++i) {
            R r = RArray[i];
            d += this.id_protected((Runnable)r);
        }
        return d;
    }

    @Override
    public /* synthetic */ void id_class(Object object) {
        this.id_private((Runnable)object);
    }

    private int id_class(R[] RArray, double d) {
        double d2 = 0.0;
        for (int i = 0; i < RArray.length; ++i) {
            R r = RArray[i];
            if (!((d2 += this.id_protected((Runnable)r)) > d)) continue;
            return i + 1;
        }
        return RArray.length;
    }

    protected void rd() {
        int n = Integer.MAX_VALUE;
        if (rrbb_3.rh() && this == QY.id_instanceof()) {
            n = this.id_break();
        }
        while (this.k_() && --n > 0) {
        }
    }

    @Override
    public void execute(Runnable runnable) {
        if (this.y()) {
            this.id_private(this.id_break(runnable));
        } else {
            runnable.run();
        }
    }

    protected boolean y() {
        return !this.rX();
    }

    protected abstract R id_break(Runnable var1);

    private int id_break() {
        if (this.id_protected.isEmpty()) {
            return 0;
        }
        Runnable[] runnableArray = this.id_protected.toArray(new Runnable[this.id_protected.size()]);
        double d = this.id_class(runnableArray);
        if (d < 5.0) {
            return Integer.MAX_VALUE;
        }
        int n = runnableArray.length;
        int n2 = Math.max(rrbb_3.rz(), 1);
        double d2 = n * 10 / n2;
        return this.id_class(runnableArray, d2);
    }

    protected void id_throws(R r) {
        block2: {
            try {
                r.run();
            }
            catch (Exception exception) {
                id_break.fatal("Error executing task on {}", (Object)this.j_(), (Object)exception);
                if (!(exception.getCause() instanceof OutOfMemoryError)) break block2;
                OutOfMemoryError outOfMemoryError = (OutOfMemoryError)exception.getCause();
                throw outOfMemoryError;
            }
        }
    }

    protected abstract Thread P();

    public void id_catch(Runnable runnable) {
        if (!this.rX()) {
            this.id_class(runnable).join();
        } else {
            runnable.run();
        }
    }

    public CompletableFuture<Void> id_case(Runnable runnable) {
        if (this.y()) {
            return this.id_class(runnable);
        }
        runnable.run();
        return CompletableFuture.completedFuture(null);
    }

    private double id_protected(Runnable runnable) {
        if (runnable instanceof rrzB_2) {
            rrzB_2 rrzB_22 = (rrzB_2)runnable;
            ruS_2 ruS_22 = rrzB_22.id_class();
            if (ruS_22 instanceof rZD) {
                return 1.0;
            }
            if (ruS_22 instanceof rFC) {
                return 0.2;
            }
            if (ruS_22 instanceof rFZ) {
                return 2.6;
            }
        }
        return 0.0;
    }

    public void id_private(R r) {
        this.id_protected.add(r);
        LockSupport.unpark(this.P());
    }

    public int rJ() {
        return this.id_protected.size();
    }

    public boolean rX() {
        return Thread.currentThread() == this.P();
    }

    protected void rx() {
        this.id_protected.clear();
    }

    @Override
    public String j_() {
        return this.id_class;
    }

    protected boolean k_() {
        Runnable runnable = (Runnable)this.id_protected.peek();
        if (runnable == null) {
            return false;
        }
        if (this.id_throws == 0 && !this.id_byte(runnable)) {
            return false;
        }
        this.id_throws((Runnable)this.id_protected.remove());
        return true;
    }

    protected void l_() {
        Thread.yield();
        LockSupport.parkNanos("waiting for tasks", 100000L);
    }
}

