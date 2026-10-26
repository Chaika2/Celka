/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAC;
import celestial.rAL;
import celestial.rAN;
import celestial.rAc_1;
import celestial.rqg_3;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface rAv_1
extends AutoCloseable,
rAL {
    public void id_class(rAc_1 var1);

    public rAN id_class(Executor var1, Executor var2, CompletableFuture<rqg_3> var3, List<rAC> var4);

    default public CompletableFuture<rqg_3> id_class(Executor executor, Executor executor2, List<rAC> list, CompletableFuture<rqg_3> completableFuture) {
        return this.id_class(executor, executor2, completableFuture, list).id_class();
    }

    @Override
    public void close();
}

