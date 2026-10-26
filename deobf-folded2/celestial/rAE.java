package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class rAE<S> implements rAN {
   protected final rAL id_class;
   protected final CompletableFuture<rqg_3> id_break = new CompletableFuture<>();
   protected final CompletableFuture<List<S>> id_byte;
   final Set<rAc_1> id_protected;
   private final int id_throws;
   private int id_case;
   private int id_catch;
   private final AtomicInteger id_private = new AtomicInteger();
   private final AtomicInteger id_implements = new AtomicInteger();

   @Override
   public boolean id_byte() {
      return this.id_break.isDone();
   }

   protected rAE(Executor var1, Executor var2, rAL var3, List<rAc_1> var4, rAb_1<S> var5, CompletableFuture<rqg_3> var6) {
      this.id_class = var3;
      this.id_throws = var4.size();
      this.id_private.incrementAndGet();
      var6.thenRun(this.id_implements::incrementAndGet);
      ArrayList var7 = Lists.newArrayList();
      CompletableFuture var8 = var6;
      this.id_protected = Sets.newHashSet(var4);

      for (rAc_1 var10 : var4) {
         CompletableFuture var12 = var5.create(new rAG(this, var2, var10, var8), var3, var10, var2x -> {
            this.id_private.incrementAndGet();
            var1.execute(() -> {
               var2x.run();
               this.id_implements.incrementAndGet();
            });
         }, var2x -> {
            this.id_case++;
            var2.execute(() -> {
               var2x.run();
               this.id_catch++;
            });
         });
         var7.add(var12);
         var8 = var12;
      }

      this.id_byte = rqR_2.id_break(var7);
   }

   @Override
   public CompletableFuture<rqg_3> id_class() {
      return this.id_byte.thenApply(var0 -> rqg_3.INSTANCE);
   }

   public static rAE<Void> id_class(rAL var0, List<rAc_1> var1, Executor var2, Executor var3, CompletableFuture<rqg_3> var4) {
      return new rAE<>(var2, var3, var0, var1, (var1x, var2x, var3x, var4x, var5) -> var3x.id_class(var1x, var2x, var2, var5), var4);
   }

   @Override
   public float id_break() {
      int var1 = this.id_throws - this.id_protected.size();
      float var2 = (float)(this.id_implements.get() * 2 + this.id_catch * 2 + var1 * 1);
      float var3 = (float)(this.id_private.get() * 2 + this.id_case * 2 + this.id_throws * 1);
      return var2 / var3;
   }

   @Override
   public void id_throws() {
      if (this.id_byte.isCompletedExceptionally()) {
         this.id_byte.join();
      }
   }

   @Override
   public boolean id_protected() {
      return this.id_byte.isDone();
   }
}
