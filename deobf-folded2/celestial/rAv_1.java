package celestial;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface rAv_1 extends AutoCloseable, rAL {
   void id_class(rAc_1 var1);

   rAN id_class(Executor var1, Executor var2, CompletableFuture<rqg_3> var3, List<rAC> var4);

   default CompletableFuture<rqg_3> id_class(Executor var1, Executor var2, List<rAC> var3, CompletableFuture<rqg_3> var4) {
      return this.id_class(var1, var2, var4, var3).id_class();
   }

   @Override
   void close();
}
