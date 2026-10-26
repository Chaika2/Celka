/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqR_2;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class rqY_2
extends ForkJoinWorkerThread {
    public rqY_2(ForkJoinPool forkJoinPool) {
        super(forkJoinPool);
    }

    @Override
    protected void onTermination(Throwable throwable) {
        if (throwable != null) {
            rqR_2.id_catch.warn("{} died", (Object)this.getName(), (Object)throwable);
        } else {
            rqR_2.id_catch.debug("{} shutdown", (Object)this.getName());
        }
        super.onTermination(throwable);
    }
}

