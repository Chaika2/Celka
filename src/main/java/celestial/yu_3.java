/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hv_1;
import celestial.KY;
import celestial.QY;
import celestial.lD_2;
import celestial.le_3;
import celestial.rfj_3;
import celestial.rjU_2;
import celestial.yN_2;
import celestial.yQ_2;
import celestial.yZ_2;
import celestial.ym_3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class yu_3
extends yN_2 {
    private final yZ_2 id_throws;
    public final /* synthetic */ yQ_2 id_protected;

    public yu_3(yQ_2 yQ_22, double d, yZ_2 yZ_22) {
        this(yQ_22, null, d, yZ_22);
    }

    public yu_3(yQ_2 yQ_22, rfj_3 rfj_32, double d, yZ_2 yZ_22) {
        this.id_protected = yQ_22;
        super(yQ_22, rfj_32, d);
        this.id_throws = yZ_22;
    }

    @Override
    public void id_class() {
        this.id_break.set(true);
    }

    @Override
    public CompletableFuture<ym_3> id_class(Hv_1 hv_1) {
        if (this.id_break.get()) {
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
        }
        if (!this.id_protected.id_class()) {
            this.id_break.set(true);
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
        }
        if (this.id_break.get()) {
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
        }
        rjU_2 rjU_22 = this.id_protected.id_throws.id_break();
        float f = (float)rjU_22.id_break;
        float f2 = (float)rjU_22.id_byte;
        float f3 = (float)rjU_22.id_protected;
        le_3 le_32 = this.id_throws.id_catch;
        if (le_32 != null && this.id_throws.id_break.id_break(HU.id_implements())) {
            lD_2 lD_22 = hv_1.id_class(HU.id_implements());
            lD_22.id_break(HU.id_implements());
            this.id_protected.id_class(lD_22);
            lD_22.id_class(le_32);
            lD_22.id_protected((float)this.id_protected.id_super + f - (float)this.id_protected.id_native.b_(), (float)this.id_protected.id_this + f2 - (float)this.id_protected.id_native.c_(), (float)this.id_protected.id_else + f3 - (float)this.id_protected.id_native.d_());
            this.id_throws.id_catch = lD_22.id_implements();
            lD_22.id_finally();
            if (this.id_break.get()) {
                return CompletableFuture.completedFuture(ym_3.CANCELLED);
            }
            CompletionStage completionStage = this.id_protected.id_throws.id_class(hv_1.id_class(HU.id_implements()), this.id_protected.id_class(HU.id_implements())).thenApply(void_ -> ym_3.CANCELLED);
            return ((CompletableFuture)completionStage).handle((ym_32, throwable) -> {
                if (throwable != null && !(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
                    QY.id_instanceof().id_break(KY.id_class(throwable, "Rendering chunk"));
                }
                return this.id_break.get() ? ym_3.CANCELLED : ym_3.SUCCESSFUL;
            });
        }
        return CompletableFuture.completedFuture(ym_3.CANCELLED);
    }
}

