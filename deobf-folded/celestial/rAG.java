package celestial;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

class rAG implements rAu_1 {
   rAG(rAE var1, Executor var2, rAc_1 var3, CompletableFuture var4) {
      this.id_protected = var1;
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   @Override
   public <T> CompletableFuture<T> id_class(T var1) {
      this.id_class.execute(() -> {
         this.id_protected.id_protected.remove(var1x);
         if (this.id_protected.id_protected.isEmpty()) {
            this.id_protected.id_break.complete(rqg_3.INSTANCE);
         }
      });
      return this.id_protected.id_break.thenCombine(this.id_byte, (var1x, var2) -> (T)var1);
   }
}
