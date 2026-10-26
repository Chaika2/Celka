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
   private static final Logger protected_ = LogManager.getLogger();
   private final Stopwatch throws_ = Stopwatch.createUnstarted();

   public rAX(rAL var1, List<rAc_1> var2, Executor var3, Executor var4, CompletableFuture<rqg_3> var5) {
      super(var3, var4, var1, var2, (var1x, var2x, var3x, var4x, var5x) -> {
         AtomicLong var6 = new AtomicLong();
         AtomicLong var7 = new AtomicLong();
         CompletableFuture var8 = var3x.class_(var1x, var2x, var2xx -> var4x.execute(() -> {
               long var2xxx = rqR_2.byte_();
               var2xx.run();
               var6.addAndGet(rqR_2.byte_() - var2xxx);
            }), var2xx -> var5x.execute(() -> {
               long var2xxx = rqR_2.byte_();
               var2xx.run();
               var7.addAndGet(rqR_2.byte_() - var2xxx);
            }));
         return var8.thenApplyAsync(var3xx -> new rAJ(var3x.i_(), var6, var7), var4);
      }, var5);
      this.throws_.start();
      this.byte_.thenAcceptAsync(this::class_, var4);
   }

   private void class_(List<rAJ> var1) {
      this.throws_.stop();
      int var2 = 0;
      protected_.info("Resource reload finished after " + this.throws_.elapsed(TimeUnit.MILLISECONDS) + " ms");

      for (rAJ var4 : var1) {
         int var5 = (int)((double)var4.break_.get() / 1000000.0);
         int var6 = (int)((double)var4.byte_.get() / 1000000.0);
         int var7 = var5 + var6;
         String var8 = var4.class_;
         protected_.info(var8 + " took approximately " + var7 + " ms (" + var5 + " ms preparing, " + var6 + " ms applying)");
         var2 += var6;
      }

      protected_.info("Total blocking time: " + var2 + " ms");
   }
}
