package celestial;

import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

interface rom_3 extends roc_3 {
   @Override
   default CompletableFuture<Either<roC_2, rrEM>> doWork(
      roN_2 var1, rrEm_1 var2, rKd_1 var3, rrPt_1 var4, rrEZ var5, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> var6, List<roC_2> var7, roC_2 var8
   ) {
      if (!var8.id_goto().id_break(var1)) {
         this.doWork(var2, var3, var7, var8);
         if (var8 instanceof rok_3) {
            ((rok_3)var8).id_class(var1);
         }
      }

      return CompletableFuture.completedFuture(Either.left(var8));
   }

   void doWork(rrEm_1 var1, rKd_1 var2, List<roC_2> var3, roC_2 var4);
}
