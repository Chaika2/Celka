package celestial;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class jY_2<T> implements rAc_1 {
   protected abstract void id_class(T var1, rAL var2);

   @Override
   public final CompletableFuture<Void> id_class(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      rrfc_3.id_class();
      return CompletableFuture.<T>supplyAsync(() -> this.id_break(var2), var3)
         .thenCompose(var1::id_class)
         .thenAcceptAsync(var2x -> this.id_class((T)var2x, var2), var4);
   }

   protected abstract T id_break(rAL var1);
}
