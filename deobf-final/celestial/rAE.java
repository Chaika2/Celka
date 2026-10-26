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
   protected final rAL class_;
   protected final CompletableFuture<rqg_3> break_ = new CompletableFuture<>();
   protected final CompletableFuture<List<S>> byte_;
   final Set<rAc_1> protected_;
   private final int throws_;
   private int case_;
   private int catch_;
   private final AtomicInteger private_ = new AtomicInteger();
   private final AtomicInteger implements_ = new AtomicInteger();

   @Override
   public boolean byte_() {
      return this.break_.isDone();
   }

   protected rAE(Executor var1, Executor var2, rAL var3, List<rAc_1> var4, rAb_1<S> var5, CompletableFuture<rqg_3> var6) {
      this.class_ = var3;
      this.throws_ = var4.size();
      this.private_.incrementAndGet();
      var6.thenRun(this.implements_::incrementAndGet);
      ArrayList var7 = Lists.newArrayList();
      CompletableFuture var8 = var6;
      this.protected_ = Sets.newHashSet(var4);

      for (rAc_1 var10 : var4) {
         CompletableFuture var12 = var5.create(new rAG(this, var2, var10, var8), var3, var10, var2x -> {
            this.private_.incrementAndGet();
            var1.execute(() -> {
               var2x.run();
               this.implements_.incrementAndGet();
            });
         }, var2x -> {
            this.case_++;
            var2.execute(() -> {
               var2x.run();
               this.catch_++;
            });
         });
         var7.add(var12);
         var8 = var12;
      }

      this.byte_ = rqR_2.break_(var7);
   }

   @Override
   public CompletableFuture<rqg_3> class_() {
      return this.byte_.thenApply(var0 -> rqg_3.INSTANCE);
   }

   public static rAE<Void> class_(rAL var0, List<rAc_1> var1, Executor var2, Executor var3, CompletableFuture<rqg_3> var4) {
      return new rAE<>(var2, var3, var0, var1, (var1x, var2x, var3x, var4x, var5) -> var3x.class_(var1x, var2x, var2, var5), var4);
   }

   @Override
   public float break_() {
      int var1 = this.throws_ - this.protected_.size();
      float var2 = (float)(this.implements_.get() * 2 + this.catch_ * 2 + var1 * 1);
      float var3 = (float)(this.private_.get() * 2 + this.case_ * 2 + this.throws_ * 1);
      return var2 / var3;
   }

   @Override
   public void throws_() {
      if (this.byte_.isCompletedExceptionally()) {
         this.byte_.join();
      }
   }

   @Override
   public boolean protected_() {
      return this.byte_.isDone();
   }
}
