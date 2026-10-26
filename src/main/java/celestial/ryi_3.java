/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import org.apache.logging.log4j.Logger;

public class ryi_3
implements Thread.UncaughtExceptionHandler {
    private final Logger id_class;

    public ryi_3(Logger logger) {
        this.id_class = logger;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        this.id_class.error("Caught previously unhandled exception :");
        this.id_class.error(thread.getName(), throwable);
    }
}

