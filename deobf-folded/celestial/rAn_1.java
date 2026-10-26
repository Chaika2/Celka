package celestial;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface rAn_1 extends rAc_1 {
   @Override
   default CompletableFuture<Void> id_class(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      return var1.id_class(rqg_3.INSTANCE).thenRunAsync(() -> this.id_class(var2), var4);
   }

   void id_class(rAL var1);
}
