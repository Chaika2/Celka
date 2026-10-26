/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fH_2;
import celestial.fY_2;
import celestial.ff_3;
import celestial.fy_3;
import celestial.rAL;
import celestial.rqO_2;
import celestial.rqR_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class fl_3
extends fH_2 {
    private CompletableFuture<fy_3> id_class;

    public fl_3(rAL rAL2, rqO_2 rqO_22, Executor executor) {
        super(rqO_22);
        this.id_class = CompletableFuture.supplyAsync(() -> fy_3.id_class(rAL2, rqO_22), executor);
    }

    public CompletableFuture<Void> id_class() {
        return this.id_class == null ? CompletableFuture.completedFuture(null) : this.id_class.thenApply(fy_32 -> null);
    }

    @Override
    protected fy_3 id_class(rAL rAL2) {
        if (this.id_class != null) {
            fy_3 fy_32 = this.id_class.join();
            this.id_class = null;
            return fy_32;
        }
        return fy_3.id_class(rAL2, this.id_byte);
    }

    @Override
    public void id_class(fY_2 fY_22, rAL rAL2, rqO_2 rqO_22, Executor executor) {
        this.id_class = CompletableFuture.supplyAsync(() -> fy_3.id_class(rAL2, this.id_byte), rqR_2.id_case());
        this.id_class.thenRunAsync(() -> fY_22.id_class(this.id_byte, (ff_3)this), fl_3.id_class(executor));
    }

    private static Executor id_class(Executor executor) {
        return runnable -> executor.execute(() -> RenderSystem.recordRenderCall(runnable::run));
    }
}

