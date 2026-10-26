/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAL;
import celestial.rAc_1;
import celestial.rAu_1;
import celestial.rqg_3;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface rAn_1
extends rAc_1 {
    @Override
    default public CompletableFuture<Void> id_class(rAu_1 rAu_12, rAL rAL2, Executor executor, Executor executor2) {
        return rAu_12.id_class(rqg_3.INSTANCE).thenRunAsync(() -> this.id_class(rAL2), executor2);
    }

    public void id_class(rAL var1);
}

