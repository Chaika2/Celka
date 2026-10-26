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
   private static final List<roN_2> id_break = roN_2.id_class();
   private final rrEL id_byte;
   private final rKd_1 id_protected;
   private final rrEm_1 id_throws;
   final Thread id_case;
   final rrEZ id_catch;
   private final rrEc_1 id_private;
   public final rrEx_1 id_class;
   private final rrEi_1 id_implements;
   private long id_finally;
   private boolean id_extends = true;
   private boolean id_native = true;
   private final long[] id_volatile = new long[4];
   private final roN_2[] id_final = new roN_2[4];
   private final roC_2[] id_package = new roC_2[4];
   private rrEg_1 id_int;

   private CompletableFuture<Either<roC_2, rrEM>> id_byte(int var1, int var2, roN_2 var3, boolean var4) {
      rfj_3 var5 = new rfj_3(var1, var2);
      long var6 = var5.id_class();
      int var8 = 33 + roN_2.id_class(var3);
      rrEG var9 = this.id_class(var6);
      if (var4) {
         this.id_byte.id_class(rrEl_1.id_private, var5, var8, var5);
         if (this.id_class(var9, var8)) {
            this.id_package();
            var9 = this.id_class(var6);
            if (this.id_class(var9, var8)) {
               throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.id_class(var9, var8) ? rrEG.id_break : var9.id_class(var3, this.id_class);
   }

   public void id_byte(an_3 var1) {
      this.id_class.id_class(var1);
   }

   @Override
   public String id_byte() {
      return "ServerChunkCache: " + this.id_finally();
   }

   private void id_int() {
      long var1 = this.id_throws.r();
      long var3 = var1 - this.id_finally;
      this.id_finally = var1;
      rrGs_1 var5 = this.id_throws.id_public();
      boolean var6 = this.id_throws.b();
      boolean var7 = this.id_throws.B().id_break(rRu_1.id_protected);
      if (!var6) {
         int var8 = this.id_throws.B().id_byte(rRu_1.id_volatile);
         boolean var9 = var5.id_throws() % 400L == 0L;
         int var10 = this.id_byte.id_break();
         rrEg_1 var11 = rrEj_1.id_class(var10, this.id_throws.W(), this::id_class);
         this.id_int = var11;
         ArrayList var12 = Lists.newArrayList(this.id_class.id_catch());
         Collections.shuffle(var12);
         var12.forEach(var7x -> {
            Optional var8x = var7x.id_class().getNow(rrEG.id_byte).left();
            if (var8x.isPresent()) {
               var7x.id_class((roJ_2)var8x.get());
               Optional var9x = var7x.id_break().getNow(rrEG.id_byte).left();
               if (var9x.isPresent()) {
                  roJ_2 var10x = (roJ_2)var9x.get();
                  rfj_3 var11x = var7x.id_implements();
                  if (!this.id_class.id_throws(var11x)) {
                     var10x.id_break(var10x.id_this() + var3);
                     if (var7 && (this.id_extends || this.id_native) && this.id_throws.id_instanceof().id_class(var10x.id_private())) {
                        rrEj_1.id_class(this.id_throws, var10x, var11, this.id_native, this.id_extends, var9);
                     }

                     this.id_throws.id_class(var10x, var8);
                  }
               }
            }
         });
         if (var7) {
            this.id_throws.id_break(this.id_extends, this.id_native);
         }
      }

      this.id_class.id_private();
   }

   public rrEN(rrEm_1 var1, rrGk_1 var2, DataFixer var3, rrPt_1 var4, Executor var5, rKd_1 var6, int var7, boolean var8, roq_3 var9, Supplier<rrEi_1> var10) {
      this.id_throws = var1;
      this.id_private = new rrEc_1(this, var1);
      this.id_protected = var6;
      this.id_case = Thread.currentThread();
      File var11 = var2.id_class(var1.E());
      File var12 = new File(var11, "data");
      var12.mkdirs();
      this.id_implements = new rrEi_1(var12, var3);
      this.id_class = new rrEx_1(var1, var2, var3, var4, var5, this.id_private, this, this.id_implements(), var9, var10, var7, var8);
      this.id_catch = this.id_class.id_break();
      this.id_byte = this.id_class.id_case();
      this.id_final();
   }

   private rrEG id_class(long var1) {
      return this.id_class.id_break(var1);
   }

   public <T> void id_class(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      this.id_byte.id_byte(var1, var2, var3, var4);
   }

   @Override
   public void id_class(rfj_3 var1, boolean var2) {
      this.id_byte.id_class(var1, var2);
   }

   public void id_class(BooleanSupplier var1) {
      this.id_byte.id_class();
      this.id_package();
      this.id_int();
      this.id_class.id_class(var1);
      this.id_final();
   }

   private void id_class(long var1, roC_2 var3, roN_2 var4) {
      for (int var5 = 3; var5 > 0; var5--) {
         this.id_volatile[var5] = this.id_volatile[var5 - 1];
         this.id_final[var5] = this.id_final[var5 - 1];
         this.id_package[var5] = this.id_package[var5 - 1];
      }

      this.id_volatile[0] = var1;
      this.id_final[0] = var4;
      this.id_package[0] = var3;
   }

   private void id_class(long var1, Consumer<roJ_2> var3) {
      rrEG var4 = this.id_class(var1);
      if (var4 != null) {
         var4.id_byte().getNow(rrEG.id_byte).left().ifPresent(var3);
      }
   }

   public void id_class(int var1) {
      this.id_class.id_class(var1);
   }

   @Override
   public void id_class(boolean var1, boolean var2) {
      this.id_extends = var1;
      this.id_native = var2;
   }

   public void id_class(an_3 var1, ruS_2<?> var2) {
      this.id_class.id_break(var1, var2);
   }

   public void id_class(rhN_2 var1) {
      this.id_class.id_class(var1);
   }

   public CompletableFuture<Either<roC_2, rrEM>> id_class(int var1, int var2, roN_2 var3, boolean var4) {
      boolean var5 = Thread.currentThread() == this.id_case;
      CompletableFuture var6;
      if (var5) {
         var6 = this.id_byte(var1, var2, var3, var4);
         this.id_private.id_byte(var6::isDone);
      } else {
         var6 = CompletableFuture.<CompletableFuture<Either<roC_2, rrEM>>>supplyAsync(() -> this.id_byte(var1, var2, var3, var4), this.id_private)
            .thenCompose(var0 -> (CompletionStage<Either<roC_2, rrEM>>)var0);
      }

      return var6;
   }

   @Override
   public boolean id_class(rfj_3 var1) {
      return this.id_class(var1.id_class(), rrEG::id_break);
   }

   @Override
   public boolean id_class(an_3 var1) {
      long var2 = rfj_3.id_class(rfU_2.id_byte(var1.rx()) >> 4, rfU_2.id_byte(var1.BO()) >> 4);
      return this.id_class(var2, rrEG::id_break);
   }

   private boolean id_class(rrEG var1, int var2) {
      return var1 == null || var1.id_finally() > var2;
   }

   @Override
   public void id_class(rRo_1 var1, rjh_3 var2) {
      this.id_private.execute(() -> {
         rrEG var3 = this.id_class(var2.id_new().id_class());
         if (var3 != null) {
            var3.id_class(var1, var2.id_byte());
         }
      });
   }

   public void id_class(boolean var1) {
      this.id_package();
      this.id_class.id_class(var1);
   }

   private boolean id_class(long var1, Function<rrEG, CompletableFuture<Either<roJ_2, rrEM>>> var3) {
      rrEG var4 = this.id_class(var1);
      if (var4 == null) {
         return false;
      } else {
         Either var5 = ((CompletableFuture)var3.apply(var4)).getNow(rrEG.id_byte);
         return var5.left().isPresent();
      }
   }

   @Override
   public boolean id_class(rfH_2 var1) {
      long var2 = rfj_3.id_class(var1.b_() >> 4, var1.d_() >> 4);
      return this.id_class(var2, rrEG::id_class);
   }

   @Override
   public void close() throws IOException {
      this.id_class(true);
      this.id_catch.close();
      this.id_class.close();
   }

   public void id_break(an_3 var1) {
      this.id_class.id_break(var1);
   }

   @Override
   public roC_2 id_break(int var1, int var2, roN_2 var3, boolean var4) {
      if (Thread.currentThread() != this.id_case) {
         return CompletableFuture.<roC_2>supplyAsync(() -> this.id_break(var1, var2, var3, var4), this.id_private).join();
      } else {
         long var5 = rfj_3.id_class(var1, var2);

         for (int var7 = 0; var7 < 4; var7++) {
            if (var5 == this.id_volatile[var7] && var3 == this.id_final[var7]) {
               roC_2 var8 = this.id_package[var7];
               if (var8 != null || !var4) {
                  return var8;
               }
            }
         }

         CompletableFuture var9 = this.id_byte(var1, var2, var3, var4);
         this.id_private.id_byte(var9::isDone);
         roC_2 var10 = (roC_2)((Either)var9.join()).map(var0 -> var0, var1x -> {
            if (var4) {
               throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException("Chunk not there when requested: " + var1x));
            } else {
               return null;
            }
         });
         this.id_class(var5, var10, var3);
         return var10;
      }
   }

   public String id_break(rfj_3 var1) {
      return this.id_class.id_break(var1);
   }

   public <T> void id_break(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      this.id_byte.id_protected(var1, var2, var3, var4);
   }

   public void id_break(rfH_2 var1) {
      int var2 = var1.b_() >> 4;
      int var3 = var1.d_() >> 4;
      rrEG var4 = this.id_class(rfj_3.id_class(var2, var3));
      if (var4 != null) {
         var4.id_class(var1);
      }
   }

   public void id_break(an_3 var1, ruS_2<?> var2) {
      this.id_class.id_class(var1, var2);
   }

   public int id_throws() {
      return this.id_class.id_protected();
   }

   @Override
   public rRq_1 id_throws(int var1, int var2) {
      long var3 = rfj_3.id_class(var1, var2);
      rrEG var5 = this.id_class(var3);
      if (var5 == null) {
         return null;
      } else {
         int var6 = id_break.size() - 1;

         while (true) {
            roN_2 var7 = id_break.get(var6);
            Optional var8 = var5.id_class(var7).getNow(rrEG.id_class).left();
            if (var8.isPresent()) {
               return (rRq_1)var8.get();
            }

            if (var7 == roN_2.id_finally.id_throws()) {
               return null;
            }

            var6--;
         }
      }
   }

   public int id_finally() {
      return this.id_class.id_throws();
   }

   public boolean id_catch() {
      return this.id_private.k_();
   }

   public rrEi_1 id_extends() {
      return this.id_implements;
   }

   public rYB id_case() {
      return this.id_throws;
   }

   @Override
   public boolean id_case(int var1, int var2) {
      rrEG var3 = this.id_class(new rfj_3(var1, var2).id_class());
      int var4 = 33 + roN_2.id_class(roN_2.id_volatile);
      return !this.id_class(var3, var4);
   }

   public rKd_1 id_implements() {
      return this.id_protected;
   }

   boolean id_package() {
      boolean var1 = this.id_byte.id_class(this.id_class);
      boolean var2 = this.id_class.id_byte();
      if (!var1 && !var2) {
         return false;
      } else {
         this.id_final();
         return true;
      }
   }

   @Override
   public roJ_2 id_protected(int var1, int var2) {
      if (Thread.currentThread() != this.id_case) {
         return null;
      } else {
         long var3 = rfj_3.id_class(var1, var2);

         for (int var5 = 0; var5 < 4; var5++) {
            if (var3 == this.id_volatile[var5] && this.id_final[var5] == roN_2.id_volatile) {
               roC_2 var6 = this.id_package[var5];
               return var6 instanceof roJ_2 ? (roJ_2)var6 : null;
            }
         }

         rrEG var8 = this.id_class(var3);
         if (var8 == null) {
            return null;
         } else {
            Either var9 = var8.id_break(roN_2.id_volatile).getNow(null);
            if (var9 == null) {
               return null;
            } else {
               roC_2 var7 = (roC_2)var9.left().orElse(null);
               if (var7 != null) {
                  this.id_class(var3, var7, roN_2.id_volatile);
                  if (var7 instanceof roJ_2) {
                     return (roJ_2)var7;
                  }
               }

               return null;
            }
         }
      }
   }

   public rrEZ id_protected() {
      return this.id_catch;
   }

   public int id_private() {
      return this.id_private.rJ();
   }

   private void id_final() {
      Arrays.fill(this.id_volatile, rfj_3.id_class);
      Arrays.fill(this.id_final, null);
      Arrays.fill(this.id_package, null);
   }

   public rrEg_1 id_volatile() {
      return this.id_int;
   }

   public rga_3 id_native() {
      return this.id_class.id_implements();
   }
}
