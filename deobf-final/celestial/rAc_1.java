package celestial;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface rAc_1 {
   CompletableFuture<Void> class_(rAu_1 var1, rAL var2, Executor var3, Executor var4);

   default String i_() {
      return this.getClass().getSimpleName();
   }
}
