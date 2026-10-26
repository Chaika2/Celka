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
import celestial.rrEM;
import celestial.rrEZ;
import celestial.rrEm_1;
import celestial.rrPt_1;
import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface roc_3 {
    public CompletableFuture<Either<roC_2, rrEM>> doWork(roN_2 var1, rrEm_1 var2, rKd_1 var3, rrPt_1 var4, rrEZ var5, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> var6, List<roC_2> var7, roC_2 var8);
}

