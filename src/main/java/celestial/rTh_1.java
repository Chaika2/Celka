/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2BooleanFunction
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rTW;
import celestial.rTX;
import celestial.rTx_1;
import celestial.rqu_3;
import it.unimi.dsi.fastutil.ints.Int2BooleanFunction;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rTh_1<T>
implements AutoCloseable,
Runnable,
rTX<T> {
    private static final Logger id_break = LogManager.getLogger();
    private final AtomicInteger id_byte = new AtomicInteger(0);
    public final rTx_1<? super T, ? extends Runnable> id_class;
    private final Executor id_protected;
    private final String id_throws;

    private void id_byte() {
        int n;
        while (!this.id_byte.compareAndSet(n = this.id_byte.get(), n & 0xFFFFFFFD)) {
        }
    }

    public rTh_1(rTx_1<? super T, ? extends Runnable> rTx_12, Executor executor, String string) {
        this.id_protected = executor;
        this.id_class = rTx_12;
        this.id_throws = string;
    }

    @Override
    public void run() {
        try {
            this.id_class(n -> n == 0);
        }
        finally {
            this.id_byte();
            this.id_catch();
        }
    }

    public String toString() {
        return this.id_throws + " " + this.id_byte.get() + " " + this.id_class.id_break();
    }

    private int id_class(Int2BooleanFunction int2BooleanFunction) {
        int n = 0;
        while (int2BooleanFunction.get(n) && this.id_case()) {
            ++n;
        }
        return n;
    }

    @Override
    public void id_class(T t) {
        this.id_class.id_class(t);
        this.id_catch();
    }

    public static rTh_1<Runnable> id_class(Executor executor, String string) {
        return new rTh_1<Runnable>(new rTW(new ConcurrentLinkedQueue()), executor, string);
    }

    @Override
    public void close() {
        int n;
        while (!this.id_byte.compareAndSet(n = this.id_byte.get(), n | 1)) {
        }
    }

    private boolean id_break() {
        int n;
        do {
            if (((n = this.id_byte.get()) & 3) == 0) continue;
            return false;
        } while (!this.id_byte.compareAndSet(n, n | 2));
        return true;
    }

    private boolean id_throws() {
        return (this.id_byte.get() & 2) != 0;
    }

    private void id_catch() {
        if (this.id_protected() && this.id_break()) {
            try {
                this.id_protected.execute(this);
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                try {
                    this.id_protected.execute(this);
                }
                catch (RejectedExecutionException rejectedExecutionException2) {
                    id_break.error("Cound not schedule mailbox", (Throwable)rejectedExecutionException2);
                }
            }
        }
    }

    private boolean id_case() {
        String string;
        Thread thread;
        if (!this.id_throws()) {
            return false;
        }
        Runnable runnable = this.id_class.id_class();
        if (runnable == null) {
            return false;
        }
        if (rqu_3.id_byte) {
            thread = Thread.currentThread();
            string = thread.getName();
            thread.setName(this.id_throws);
        } else {
            thread = null;
            string = null;
        }
        runnable.run();
        if (thread != null) {
            thread.setName(string);
        }
        return true;
    }

    private boolean id_protected() {
        if ((this.id_byte.get() & 1) != 0) {
            return false;
        }
        return !this.id_class.id_break();
    }

    @Override
    public String j_() {
        return this.id_throws;
    }
}

