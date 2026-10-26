package celestial;

import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.shorts.ShortArraySet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class rrEG {
   public static final Either<roC_2, rrEM> id_class = Either.right(rrEM.id_break);
   public static final CompletableFuture<Either<roC_2, rrEM>> id_break = CompletableFuture.completedFuture(id_class);
   public static final Either<roJ_2, rrEM> id_byte = Either.right(rrEM.id_break);
   private static final CompletableFuture<Either<roJ_2, rrEM>> id_protected = CompletableFuture.completedFuture(id_byte);
   private static final List<roN_2> id_throws = roN_2.id_class();
   private static final rrEJ[] id_case = rrEJ.values();
   private final AtomicReferenceArray<CompletableFuture<Either<roC_2, rrEM>>> id_catch = new AtomicReferenceArray<>(id_throws.size());
   private volatile CompletableFuture<Either<roJ_2, rrEM>> id_private = id_protected;
   private volatile CompletableFuture<Either<roJ_2, rrEM>> id_implements = id_protected;
   private volatile CompletableFuture<Either<roJ_2, rrEM>> id_finally = id_protected;
   private CompletableFuture<roC_2> id_extends = CompletableFuture.completedFuture((roC_2)null);
   private int id_native;
   private int id_volatile;
   private int id_final;
   final rfj_3 id_package;
   private boolean id_int;
   private final ShortSet[] id_new = new ShortSet[16];
   private int id_continue;
   private int id_super;
   private final rrse_3 id_this;
   private final rrEh_1 id_else;
   private final rrEX id_synchronized;
   private boolean id_return;
   private boolean id_public;

   public CompletableFuture<Either<roJ_2, rrEM>> id_byte() {
      return this.id_private;
   }

   public static rrEJ id_byte(int var0) {
      return id_case[rfU_2.id_class(33 - var0 + 1, 0, id_case.length - 1)];
   }

   public rrEG(rfj_3 var1, int var2, rrse_3 var3, rrEh_1 var4, rrEX var5) {
      this.id_package = var1;
      this.id_this = var3;
      this.id_else = var4;
      this.id_synchronized = var5;
      this.id_native = rrEx_1.id_break + 1;
      this.id_volatile = this.id_native;
      this.id_final = this.id_native;
      this.id_class(var2);
   }

   private void id_class(CompletableFuture<? extends Either<? extends roC_2, rrEM>> var1) {
      this.id_extends = this.id_extends.thenCombine(var1, (var0, var1x) -> (roC_2)var1x.map(var0x -> var0x, var1xx -> var0));
   }

   public CompletableFuture<Either<roC_2, rrEM>> id_class(roN_2 var1, rrEx_1 var2) {
      int var3 = var1.id_byte();
      CompletableFuture var4 = this.id_catch.get(var3);
      if (var4 != null) {
         Either var5 = (Either)var4.getNow((Either)null);
         if (var5 == null || var5.left().isPresent()) {
            return var4;
         }
      }

      if (id_break(this.id_volatile).id_break(var1)) {
         CompletableFuture var6 = var2.id_class(this, var1);
         this.id_class(var6);
         this.id_catch.set(var3, var6);
         return var6;
      } else {
         return var4 == null ? id_break : var4;
      }
   }

   public CompletableFuture<Either<roC_2, rrEM>> id_class(roN_2 var1) {
      CompletableFuture var2 = this.id_catch.get(var1.id_byte());
      return var2 == null ? id_break : var2;
   }

   private void id_class(rYB var1, rfH_2 var2) {
      ryO_2 var3 = var1.id_class(var2);
      if (var3 != null) {
         rFy_1 var4 = var3.Y_();
         if (var4 != null) {
            this.id_class(var4, false);
         }
      }
   }

   protected void id_class(rrEx_1 var1) {
      roN_2 var2 = id_break(this.id_native);
      roN_2 var3 = id_break(this.id_volatile);
      boolean var4 = this.id_native <= rrEx_1.id_break;
      boolean var5 = this.id_volatile <= rrEx_1.id_break;
      rrEJ var6 = id_byte(this.id_native);
      rrEJ var7 = id_byte(this.id_volatile);
      if (var4) {
         Either var8 = Either.right(new rrEb_1(this));

         for (int var9 = var5 ? var3.id_byte() + 1 : 0; var9 <= var2.id_byte(); var9++) {
            CompletableFuture var10 = this.id_catch.get(var9);
            if (var10 != null) {
               var10.complete(var8);
            } else {
               this.id_catch.set(var9, CompletableFuture.completedFuture(var8));
            }
         }
      }

      boolean var14 = var6.id_class(rrEJ.BORDER);
      boolean var15 = var7.id_class(rrEJ.BORDER);
      this.id_return |= var15;
      if (!var14 && var15) {
         this.id_private = var1.id_break(this);
         this.id_class(this.id_private);
      }

      if (var14 && !var15) {
         CompletableFuture var16 = this.id_private;
         this.id_private = id_protected;
         this.id_class(var16.thenApply(var1x -> var1x.ifLeft(var1::id_class)));
      }

      boolean var17 = var6.id_class(rrEJ.TICKING);
      boolean var11 = var7.id_class(rrEJ.TICKING);
      if (!var17 && var11) {
         this.id_implements = var1.id_class(this);
         this.id_class(this.id_implements);
      }

      if (var17 && !var11) {
         this.id_implements.complete(id_byte);
         this.id_implements = id_protected;
      }

      boolean var12 = var6.id_class(rrEJ.ENTITY_TICKING);
      boolean var13 = var7.id_class(rrEJ.ENTITY_TICKING);
      if (!var12 && var13) {
         if (this.id_finally != id_protected) {
            throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException());
         }

         this.id_finally = var1.id_byte(this.id_package);
         this.id_class(this.id_finally);
      }

      if (var12 && !var13) {
         this.id_finally.complete(id_byte);
         this.id_finally = id_protected;
      }

      this.id_else.id_class(this.id_package, this::id_extends, this.id_volatile, this::id_protected);
      this.id_native = this.id_volatile;
   }

   public void id_class(int var1) {
      this.id_volatile = var1;
   }

   public void id_class(roz_3 var1) {
      for (int var2 = 0; var2 < this.id_catch.length(); var2++) {
         CompletableFuture var3 = this.id_catch.get(var2);
         if (var3 != null) {
            Optional var4 = var3.getNow(id_class).left();
            if (var4.isPresent() && var4.get() instanceof rok_3) {
               this.id_catch.set(var2, CompletableFuture.completedFuture(Either.left(var1)));
            }
         }
      }

      this.id_class(CompletableFuture.completedFuture(Either.left(var1.id_final())));
   }

   public CompletableFuture<Either<roJ_2, rrEM>> id_class() {
      return this.id_implements;
   }

   private void id_class(ruS_2<?> var1, boolean var2) {
      this.id_synchronized.id_class(this.id_package, var2).forEach(var1x -> var1x.id_class.id_class(var1));
   }

   private void id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      if (var3.id_break().id_protected()) {
         this.id_class(var1, var2);
      }
   }

   public void id_class(rRo_1 var1, int var2) {
      roJ_2 var3 = this.id_protected();
      if (var3 != null) {
         var3.id_break(true);
         if (var1 == rRo_1.SKY) {
            this.id_super |= 1 << var2 - -1;
         } else {
            this.id_continue |= 1 << var2 - -1;
         }
      }
   }

   public void id_class(rfH_2 var1) {
      roJ_2 var2 = this.id_protected();
      if (var2 != null) {
         byte var3 = (byte)rjh_3.id_class(var1.c_());
         if (this.id_new[var3] == null) {
            this.id_int = true;
            this.id_new[var3] = new ShortArraySet();
         }

         this.id_new[var3].add(rjh_3.id_break(var1));
      }
   }

   public void id_class(roJ_2 var1) {
      if (this.id_int || this.id_super != 0 || this.id_continue != 0) {
         rYB var2 = var1.id_extends();
         int var3 = 0;

         for (int var4 = 0; var4 < this.id_new.length; var4++) {
            var3 += this.id_new[var4] != null ? this.id_new[var4].size() : 0;
         }

         this.id_public |= var3 >= 64;
         if (this.id_super != 0 || this.id_continue != 0) {
            this.id_class(new rFC(var1.id_private(), this.id_this, this.id_super, this.id_continue, true), !this.id_public);
            this.id_super = 0;
            this.id_continue = 0;
         }

         for (int var9 = 0; var9 < this.id_new.length; var9++) {
            ShortSet var5 = this.id_new[var9];
            if (var5 != null) {
               rjh_3 var6 = rjh_3.id_class(var1.id_private(), var9);
               if (var5.size() == 1) {
                  rfH_2 var7 = var6.id_catch(var5.iterator().nextShort());
                  xc_3 var8 = var2.id_byte(var7);
                  this.id_class(new rZR(var7, var8), false);
                  this.id_class(var2, var7, var8);
               } else {
                  roQ_2 var10 = var1.id_byte()[var6.c_()];
                  rvC_2 var11 = new rvC_2(var6, var5, var10, this.id_public);
                  this.id_class(var11, false);
                  var11.id_class((var2x, var3x) -> this.id_class(var2, var2x, var3x));
               }

               this.id_new[var9] = null;
            }
         }

         this.id_int = false;
      }
   }

   public CompletableFuture<Either<roJ_2, rrEM>> id_break() {
      return this.id_finally;
   }

   public static roN_2 id_break(int var0) {
      return var0 < 33 ? roN_2.id_volatile : roN_2.id_class(var0 - 33);
   }

   public CompletableFuture<Either<roC_2, rrEM>> id_break(roN_2 var1) {
      return id_break(this.id_volatile).id_break(var1) ? this.id_class(var1) : id_break;
   }

   public roN_2 id_throws() {
      for (int var1 = id_throws.size() - 1; var1 >= 0; var1--) {
         roN_2 var2 = id_throws.get(var1);
         CompletableFuture var3 = this.id_class(var2);
         if (var3.getNow(id_class).left().isPresent()) {
            return var2;
         }
      }

      return null;
   }

   public int id_finally() {
      return this.id_volatile;
   }

   public CompletableFuture<roC_2> id_catch() {
      return this.id_extends;
   }

   public int id_extends() {
      return this.id_final;
   }

   public roC_2 id_case() {
      for (int var1 = id_throws.size() - 1; var1 >= 0; var1--) {
         roN_2 var2 = id_throws.get(var1);
         CompletableFuture var3 = this.id_class(var2);
         if (!var3.isCompletedExceptionally()) {
            Optional var4 = var3.getNow(id_class).left();
            if (var4.isPresent()) {
               return (roC_2)var4.get();
            }
         }
      }

      return null;
   }

   public rfj_3 id_implements() {
      return this.id_package;
   }

   public roJ_2 id_protected() {
      CompletableFuture var1 = this.id_class();
      Either var2 = (Either)var1.getNow((Either)null);
      return var2 == null ? null : (roJ_2)var2.left().orElse((roJ_2)null);
   }

   private void id_protected(int var1) {
      this.id_final = var1;
   }

   public rrEJ id_private() {
      return id_byte(this.id_volatile);
   }

   public void id_volatile() {
      this.id_return = id_byte(this.id_volatile).id_class(rrEJ.BORDER);
   }

   public boolean id_native() {
      return this.id_return;
   }
}
