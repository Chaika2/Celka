/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.ryi_3;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rFe_1
implements Runnable {
    private static final Logger id_protected = LogManager.getLogger();
    private static final AtomicInteger id_throws = new AtomicInteger(0);
    protected volatile boolean id_class;
    protected final String id_break;
    protected Thread id_byte;

    public boolean id_byte() {
        return this.id_class;
    }

    protected rFe_1(String string) {
        this.id_break = string;
    }

    public synchronized void id_class() {
        this.id_class = false;
        if (null != this.id_byte) {
            int n = 0;
            while (this.id_byte.isAlive()) {
                try {
                    this.id_byte.join(1000L);
                    if (++n >= 5) {
                        id_protected.warn("Waited {} seconds attempting force stop!", (Object)n);
                        continue;
                    }
                    if (!this.id_byte.isAlive()) continue;
                    id_protected.warn("Thread {} ({}) failed to exit after {} second(s)", (Object)this, (Object)this.id_byte.getState(), (Object)n, (Object)new Exception("Stack:"));
                    this.id_byte.interrupt();
                }
                catch (InterruptedException interruptedException) {}
            }
            id_protected.info("Thread {} stopped", (Object)this.id_break);
            this.id_byte = null;
        }
    }

    public synchronized boolean id_break() {
        if (this.id_class) {
            return true;
        }
        this.id_class = true;
        this.id_byte = new Thread((Runnable)this, this.id_break + " #" + id_throws.incrementAndGet());
        this.id_byte.setUncaughtExceptionHandler(new ryi_3(id_protected));
        this.id_byte.start();
        id_protected.info("Thread {} started", (Object)this.id_break);
        return true;
    }
}

