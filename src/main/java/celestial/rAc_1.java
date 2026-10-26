/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAL;
import celestial.rAu_1;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface rAc_1 {
    public CompletableFuture<Void> id_class(rAu_1 var1, rAL var2, Executor var3, Executor var4);

    default public String i_() {
        return this.getClass().getSimpleName();
    }
}

