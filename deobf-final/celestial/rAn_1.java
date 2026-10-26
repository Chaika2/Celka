package celestial;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface rAn_1 extends rAc_1 {
   @Override
   default CompletableFuture<Void> class_(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      return var1.class_(rqg_3.INSTANCE).thenRunAsync(() -> this.class_(var2), var4);
   }

   void class_(rAL var1);
}
