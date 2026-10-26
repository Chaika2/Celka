package celestial;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

class rAG implements rAu_1 {
   rAG(rAE var1, Executor var2, rAc_1 var3, CompletableFuture var4) {
      this.protected_ = var1;
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   @Override
   public <T> CompletableFuture<T> class_(T var1) {
      this.class_.execute(() -> {
         this.protected_.protected_.remove(var1x);
         if (this.protected_.protected_.isEmpty()) {
            this.protected_.break_.complete(rqg_3.INSTANCE);
         }
      });
      return this.protected_.break_.thenCombine(this.byte_, (var1x, var2) -> (T)var1);
   }
}
