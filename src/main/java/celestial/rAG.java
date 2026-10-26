/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAE;
import celestial.rAc_1;
import celestial.rAu_1;
import celestial.rqg_3;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;

public class rAG
implements rAu_1 {
    public final /* synthetic */ Executor id_class;
    public final /* synthetic */ rAc_1 id_break;
    public final /* synthetic */ CompletableFuture id_byte;
    public final /* synthetic */ rAE id_protected;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rAG(rAE rAE2, Executor executor, rAc_1 rAc_12, CompletableFuture completableFuture) {
        this.id_protected = rAE2;
        this.id_class = executor;
        this.id_break = rAc_12;
        this.id_byte = completableFuture;
    }

    @Override
    public <T> CompletableFuture<T> id_class(T t) {
        this.id_class.execute(() -> {
            this.id_protected.id_protected.remove(this.id_break);
            if (this.id_protected.id_protected.isEmpty()) {
                this.id_protected.id_break.complete(rqg_3.INSTANCE);
            }
        });
        return this.id_protected.id_break.thenCombine((CompletionStage)this.id_byte, (rqg_32, object2) -> t);
    }
}

