package celestial;

import com.google.common.base.Stopwatch;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAX extends rAE<rAJ> {
   private static final Logger id_protected = LogManager.getLogger();
   private final Stopwatch id_throws = Stopwatch.createUnstarted();

   public rAX(rAL var1, List<rAc_1> var2, Executor var3, Executor var4, CompletableFuture<rqg_3> var5) {
      super(var3, var4, var1, var2, (var1x, var2x, var3x, var4x, var5x) -> {
         AtomicLong var6 = new AtomicLong();
         AtomicLong var7 = new AtomicLong();
         CompletableFuture var8 = var3x.id_class(var1x, var2x, var2xx -> var4x.execute(() -> {
               long var2xxx = rqR_2.id_byte();
               var2xx.run();
               var6.addAndGet(rqR_2.id_byte() - var2xxx);
            }), var2xx -> var5x.execute(() -> {
               long var2xxx = rqR_2.id_byte();
               var2xx.run();
               var7.addAndGet(rqR_2.id_byte() - var2xxx);
            }));
         return var8.thenApplyAsync(var3xx -> new rAJ(var3x.i_(), var6, var7), var4);
      }, var5);
      this.id_throws.start();
      this.id_byte.thenAcceptAsync(this::id_class, var4);
   }

   private void id_class(List<rAJ> var1) {
      this.id_throws.stop();
      int var2 = 0;
      id_protected.info("Resource reload finished after " + this.id_throws.elapsed(TimeUnit.MILLISECONDS) + " ms");

      for (rAJ var4 : var1) {
         int var5 = (int)((double)var4.id_break.get() / 1000000.0);
         int var6 = (int)((double)var4.id_byte.get() / 1000000.0);
         int var7 = var5 + var6;
         String var8 = var4.id_class;
         id_protected.info(var8 + " took approximately " + var7 + " ms (" + var5 + " ms preparing, " + var6 + " ms applying)");
         var2 += var6;
      }

      id_protected.info("Total blocking time: " + var2 + " ms");
   }
}
