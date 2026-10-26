/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTQ;
import java.util.concurrent.locks.LockSupport;

public class Nw_1
extends rTQ<Runnable> {
    private Thread id_class = this.id_byte();
    private volatile boolean id_break;

    @Override
    protected boolean id_byte(Runnable runnable) {
        return !this.id_break;
    }

    private Thread id_byte() {
        Thread thread = new Thread(this::id_protected);
        thread.setDaemon(true);
        thread.setName("Sound engine");
        thread.start();
        return thread;
    }

    public Nw_1() {
        super("Sound executor");
    }

    public void id_break() {
        this.id_break = true;
        this.id_class.interrupt();
        try {
            this.id_class.join();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        this.rx();
        this.id_break = false;
        this.id_class = this.id_byte();
    }

    @Override
    protected Runnable id_break(Runnable runnable) {
        return runnable;
    }

    @Override
    protected Thread P() {
        return this.id_class;
    }

    private void id_protected() {
        while (!this.id_break) {
            this.id_byte(() -> this.id_break);
        }
    }

    @Override
    protected void l_() {
        LockSupport.park("waiting for tasks");
    }
}

