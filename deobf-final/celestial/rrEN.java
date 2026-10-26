package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class rrEN extends roX_2 {
   private static final List<roN_2> break_ = roN_2.class_();
   private final rrEL byte_;
   private final rKd_1 protected_;
   private final rrEm_1 throws_;
   final Thread case_;
   final rrEZ catch_;
   private final rrEc_1 private_;
   public final rrEx_1 class_;
   private final rrEi_1 implements_;
   private long finally_;
   private boolean extends_ = true;
   private boolean native_ = true;
   private final long[] volatile_ = new long[4];
   private final roN_2[] final_ = new roN_2[4];
   private final roC_2[] package_ = new roC_2[4];
   private rrEg_1 int_;

   private CompletableFuture<Either<roC_2, rrEM>> byte_(int var1, int var2, roN_2 var3, boolean var4) {
      rfj_3 var5 = new rfj_3(var1, var2);
      long var6 = var5.class_();
      int var8 = 33 + roN_2.class_(var3);
      rrEG var9 = this.class_(var6);
      if (var4) {
         this.byte_.class_(rrEl_1.private_, var5, var8, var5);
         if (this.class_(var9, var8)) {
            this.package_();
            var9 = this.class_(var6);
            if (this.class_(var9, var8)) {
               throw (IllegalStateException)rqR_2.byte_(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.class_(var9, var8) ? rrEG.break_ : var9.class_(var3, this.class_);
   }

   public void byte_(an_3 var1) {
      this.class_.class_(var1);
   }

   @Override
   public String byte_() {
      return "ServerChunkCache: " + this.finally_();
   }

   private void int_() {
      long var1 = this.throws_.r();
      long var3 = var1 - this.finally_;
      this.finally_ = var1;
      rrGs_1 var5 = this.throws_.public_();
      boolean var6 = this.throws_.b();
      boolean var7 = this.throws_.B().break_(rRu_1.protected_);
      if (!var6) {
         int var8 = this.throws_.B().byte_(rRu_1.volatile_);
         boolean var9 = var5.throws_() % 400L == 0L;
         int var10 = this.byte_.break_();
         rrEg_1 var11 = rrEj_1.class_(var10, this.throws_.W(), this::class_);
         this.int_ = var11;
         ArrayList var12 = Lists.newArrayList(this.class_.catch_());
         Collections.shuffle(var12);
         var12.forEach(var7x -> {
            Optional var8x = var7x.class_().getNow(rrEG.byte_).left();
            if (var8x.isPresent()) {
               var7x.class_((roJ_2)var8x.get());
               Optional var9x = var7x.break_().getNow(rrEG.byte_).left();
               if (var9x.isPresent()) {
                  roJ_2 var10x = (roJ_2)var9x.get();
                  rfj_3 var11x = var7x.implements_();
                  if (!this.class_.throws_(var11x)) {
                     var10x.break_(var10x.this_() + var3);
                     if (var7 && (this.extends_ || this.native_) && this.throws_.instanceof_().class_(var10x.private_())) {
                        rrEj_1.class_(this.throws_, var10x, var11, this.native_, this.extends_, var9);
                     }

                     this.throws_.class_(var10x, var8);
                  }
               }
            }
         });
         if (var7) {
            this.throws_.break_(this.extends_, this.native_);
         }
      }

      this.class_.private_();
   }

   public rrEN(rrEm_1 var1, rrGk_1 var2, DataFixer var3, rrPt_1 var4, Executor var5, rKd_1 var6, int var7, boolean var8, roq_3 var9, Supplier<rrEi_1> var10) {
      this.throws_ = var1;
      this.private_ = new rrEc_1(this, var1);
      this.protected_ = var6;
      this.case_ = Thread.currentThread();
      File var11 = var2.class_(var1.E());
      File var12 = new File(var11, "data");
      var12.mkdirs();
      this.implements_ = new rrEi_1(var12, var3);
      this.class_ = new rrEx_1(var1, var2, var3, var4, var5, this.private_, this, this.implements_(), var9, var10, var7, var8);
      this.catch_ = this.class_.break_();
      this.byte_ = this.class_.case_();
      this.final_();
   }

   private rrEG class_(long var1) {
      return this.class_.break_(var1);
   }

   public <T> void class_(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      this.byte_.byte_(var1, var2, var3, var4);
   }

   @Override
   public void class_(rfj_3 var1, boolean var2) {
      this.byte_.class_(var1, var2);
   }

   public void class_(BooleanSupplier var1) {
      this.byte_.class_();
      this.package_();
      this.int_();
      this.class_.class_(var1);
      this.final_();
   }

   private void class_(long var1, roC_2 var3, roN_2 var4) {
      for (int var5 = 3; var5 > 0; var5--) {
         this.volatile_[var5] = this.volatile_[var5 - 1];
         this.final_[var5] = this.final_[var5 - 1];
         this.package_[var5] = this.package_[var5 - 1];
      }

      this.volatile_[0] = var1;
      this.final_[0] = var4;
      this.package_[0] = var3;
   }

   private void class_(long var1, Consumer<roJ_2> var3) {
      rrEG var4 = this.class_(var1);
      if (var4 != null) {
         var4.byte_().getNow(rrEG.byte_).left().ifPresent(var3);
      }
   }

   public void class_(int var1) {
      this.class_.class_(var1);
   }

   @Override
   public void class_(boolean var1, boolean var2) {
      this.extends_ = var1;
      this.native_ = var2;
   }

   public void class_(an_3 var1, ruS_2<?> var2) {
      this.class_.break_(var1, var2);
   }

   public void class_(rhN_2 var1) {
      this.class_.class_(var1);
   }

   public CompletableFuture<Either<roC_2, rrEM>> class_(int var1, int var2, roN_2 var3, boolean var4) {
      boolean var5 = Thread.currentThread() == this.case_;
      CompletableFuture var6;
      if (var5) {
         var6 = this.byte_(var1, var2, var3, var4);
         this.private_.byte_(var6::isDone);
      } else {
         var6 = CompletableFuture.<CompletableFuture<Either<roC_2, rrEM>>>supplyAsync(() -> this.byte_(var1, var2, var3, var4), this.private_)
            .thenCompose(var0 -> (CompletionStage<Either<roC_2, rrEM>>)var0);
      }

      return var6;
   }

   @Override
   public boolean class_(rfj_3 var1) {
      return this.class_(var1.class_(), rrEG::break_);
   }

   @Override
   public boolean class_(an_3 var1) {
      long var2 = rfj_3.class_(rfU_2.byte_(var1.rx()) >> 4, rfU_2.byte_(var1.BO()) >> 4);
      return this.class_(var2, rrEG::break_);
   }

   private boolean class_(rrEG var1, int var2) {
      return var1 == null || var1.finally_() > var2;
   }

   @Override
   public void class_(rRo_1 var1, rjh_3 var2) {
      this.private_.execute(() -> {
         rrEG var3 = this.class_(var2.new_().class_());
         if (var3 != null) {
            var3.class_(var1, var2.byte_());
         }
      });
   }

   public void class_(boolean var1) {
      this.package_();
      this.class_.class_(var1);
   }

   private boolean class_(long var1, Function<rrEG, CompletableFuture<Either<roJ_2, rrEM>>> var3) {
      rrEG var4 = this.class_(var1);
      if (var4 == null) {
         return false;
      } else {
         Either var5 = ((CompletableFuture)var3.apply(var4)).getNow(rrEG.byte_);
         return var5.left().isPresent();
      }
   }

   @Override
   public boolean class_(rfH_2 var1) {
      long var2 = rfj_3.class_(var1.b_() >> 4, var1.d_() >> 4);
      return this.class_(var2, rrEG::class_);
   }

   @Override
   public void close() throws IOException {
      this.class_(true);
      this.catch_.close();
      this.class_.close();
   }

   public void break_(an_3 var1) {
      this.class_.break_(var1);
   }

   @Override
   public roC_2 break_(int var1, int var2, roN_2 var3, boolean var4) {
      if (Thread.currentThread() != this.case_) {
         return CompletableFuture.<roC_2>supplyAsync(() -> this.break_(var1, var2, var3, var4), this.private_).join();
      } else {
         long var5 = rfj_3.class_(var1, var2);

         for (int var7 = 0; var7 < 4; var7++) {
            if (var5 == this.volatile_[var7] && var3 == this.final_[var7]) {
               roC_2 var8 = this.package_[var7];
               if (var8 != null || !var4) {
                  return var8;
               }
            }
         }

         CompletableFuture var9 = this.byte_(var1, var2, var3, var4);
         this.private_.byte_(var9::isDone);
         roC_2 var10 = (roC_2)((Either)var9.join()).map(var0 -> var0, var1x -> {
            if (var4) {
               throw (IllegalStateException)rqR_2.byte_(new IllegalStateException("Chunk not there when requested: " + var1x));
            } else {
               return null;
            }
         });
         this.class_(var5, var10, var3);
         return var10;
      }
   }

   public String break_(rfj_3 var1) {
      return this.class_.break_(var1);
   }

   public <T> void break_(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      this.byte_.protected_(var1, var2, var3, var4);
   }

   public void break_(rfH_2 var1) {
      int var2 = var1.b_() >> 4;
      int var3 = var1.d_() >> 4;
      rrEG var4 = this.class_(rfj_3.class_(var2, var3));
      if (var4 != null) {
         var4.class_(var1);
      }
   }

   public void break_(an_3 var1, ruS_2<?> var2) {
      this.class_.class_(var1, var2);
   }

   public int throws_() {
      return this.class_.protected_();
   }

   @Override
   public rRq_1 throws_(int var1, int var2) {
      long var3 = rfj_3.class_(var1, var2);
      rrEG var5 = this.class_(var3);
      if (var5 == null) {
         return null;
      } else {
         int var6 = break_.size() - 1;

         while (true) {
            roN_2 var7 = break_.get(var6);
            Optional var8 = var5.class_(var7).getNow(rrEG.class_).left();
            if (var8.isPresent()) {
               return (rRq_1)var8.get();
            }

            if (var7 == roN_2.finally_.throws_()) {
               return null;
            }

            var6--;
         }
      }
   }

   public int finally_() {
      return this.class_.throws_();
   }

   public boolean catch_() {
      return this.private_.k_();
   }

   public rrEi_1 extends_() {
      return this.implements_;
   }

   public rYB case_() {
      return this.throws_;
   }

   @Override
   public boolean case_(int var1, int var2) {
      rrEG var3 = this.class_(new rfj_3(var1, var2).class_());
      int var4 = 33 + roN_2.class_(roN_2.volatile_);
      return !this.class_(var3, var4);
   }

   public rKd_1 implements_() {
      return this.protected_;
   }

   boolean package_() {
      boolean var1 = this.byte_.class_(this.class_);
      boolean var2 = this.class_.byte_();
      if (!var1 && !var2) {
         return false;
      } else {
         this.final_();
         return true;
      }
   }

   @Override
   public roJ_2 protected_(int var1, int var2) {
      if (Thread.currentThread() != this.case_) {
         return null;
      } else {
         long var3 = rfj_3.class_(var1, var2);

         for (int var5 = 0; var5 < 4; var5++) {
            if (var3 == this.volatile_[var5] && this.final_[var5] == roN_2.volatile_) {
               roC_2 var6 = this.package_[var5];
               return var6 instanceof roJ_2 ? (roJ_2)var6 : null;
            }
         }

         rrEG var8 = this.class_(var3);
         if (var8 == null) {
            return null;
         } else {
            Either var9 = var8.break_(roN_2.volatile_).getNow(null);
            if (var9 == null) {
               return null;
            } else {
               roC_2 var7 = (roC_2)var9.left().orElse(null);
               if (var7 != null) {
                  this.class_(var3, var7, roN_2.volatile_);
                  if (var7 instanceof roJ_2) {
                     return (roJ_2)var7;
                  }
               }

               return null;
            }
         }
      }
   }

   public rrEZ protected_() {
      return this.catch_;
   }

   public int private_() {
      return this.private_.rJ();
   }

   private void final_() {
      Arrays.fill(this.volatile_, rfj_3.class_);
      Arrays.fill(this.final_, null);
      Arrays.fill(this.package_, null);
   }

   public rrEg_1 volatile_() {
      return this.int_;
   }

   public rga_3 native_() {
      return this.class_.implements_();
   }
}
