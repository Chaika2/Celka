package celestial;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class jY_2<T> implements rAc_1 {
   protected abstract void class_(T var1, rAL var2);

   @Override
   public final CompletableFuture<Void> class_(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      rrfc_3.class_();
      return CompletableFuture.<T>supplyAsync(() -> this.break_(var2), var3)
         .thenCompose(var1::class_)
         .thenAcceptAsync(var2x -> this.class_((T)var2x, var2), var4);
   }

   protected abstract T break_(rAL var1);
}
