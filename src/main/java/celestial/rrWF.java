/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAu_1;
import java.util.concurrent.CompletableFuture;

public class rrWF
implements rAu_1 {
    @Override
    public <T> CompletableFuture<T> id_class(T t) {
        return CompletableFuture.completedFuture(t);
    }
}

