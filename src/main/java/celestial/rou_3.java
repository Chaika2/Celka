/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 */
package celestial;

import celestial.roC_2;
import celestial.roN_2;
import celestial.rrEM;
import celestial.rrEZ;
import celestial.rrEm_1;
import celestial.rrPt_1;
import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface rou_3 {
    public CompletableFuture<Either<roC_2, rrEM>> doWork(roN_2 var1, rrEm_1 var2, rrPt_1 var3, rrEZ var4, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> var5, roC_2 var6);
}

