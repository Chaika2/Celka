/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAL;
import celestial.rAc_1;
import celestial.rAu_1;
import celestial.rrfc_3;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class jY_2<T>
implements rAc_1 {
    protected abstract void id_class(T var1, rAL var2);

    @Override
    public final CompletableFuture<Void> id_class(rAu_1 rAu_12, rAL rAL2, Executor executor, Executor executor2) {
        rrfc_3.id_class();
        return ((CompletableFuture)CompletableFuture.supplyAsync(() -> this.id_break(rAL2), executor).thenCompose(rAu_12::id_class)).thenAcceptAsync(object -> this.id_class(object, rAL2), executor2);
    }

    protected abstract T id_break(rAL var1);
}

