/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.util.MinecraftAccessor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class rrft_3
implements MinecraftAccessor {
    public static void id_class(long l) {
        try {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    public static void id_class(Runnable runnable, int n) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(runnable, (long)n, TimeUnit.MILLISECONDS);
        scheduledExecutorService.shutdown();
    }
}

