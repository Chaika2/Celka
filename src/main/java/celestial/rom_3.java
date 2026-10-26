/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 */
package celestial;

import celestial.rKd_1;
import celestial.roC_2;
import celestial.roN_2;
import celestial.roc_3;
import celestial.rok_3;
import celestial.rrEM;
import celestial.rrEZ;
import celestial.rrEm_1;
import celestial.rrPt_1;
import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface rom_3
extends roc_3 {
    @Override
    default public CompletableFuture<Either<roC_2, rrEM>> doWork(roN_2 roN_22, rrEm_1 rrEm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, rrEZ rrEZ2, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> function, List<roC_2> list, roC_2 roC_22) {
        if (!roC_22.id_goto().id_break(roN_22)) {
            this.doWork(rrEm_12, rKd_12, list, roC_22);
            if (roC_22 instanceof rok_3) {
                ((rok_3)roC_22).id_class(roN_22);
            }
        }
        return CompletableFuture.completedFuture(Either.left((Object)roC_22));
    }

    public void doWork(rrEm_1 var1, rKd_1 var2, List<roC_2> var3, roC_2 var4);
}

