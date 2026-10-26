package celestial;

import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.shorts.ShortArraySet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class rrEG {
   public static final Either<roC_2, rrEM> class_ = Either.right(rrEM.break_);
   public static final CompletableFuture<Either<roC_2, rrEM>> break_ = CompletableFuture.completedFuture(class_);
   public static final Either<roJ_2, rrEM> byte_ = Either.right(rrEM.break_);
   private static final CompletableFuture<Either<roJ_2, rrEM>> protected_ = CompletableFuture.completedFuture(byte_);
   private static final List<roN_2> throws_ = roN_2.class_();
   private static final rrEJ[] case_ = rrEJ.values();
   private final AtomicReferenceArray<CompletableFuture<Either<roC_2, rrEM>>> catch_ = new AtomicReferenceArray<>(throws_.size());
   private volatile CompletableFuture<Either<roJ_2, rrEM>> private_ = protected_;
   private volatile CompletableFuture<Either<roJ_2, rrEM>> implements_ = protected_;
   private volatile CompletableFuture<Either<roJ_2, rrEM>> finally_ = protected_;
   private CompletableFuture<roC_2> extends_ = CompletableFuture.completedFuture((roC_2)null);
   private int native_;
   private int volatile_;
   private int final_;
   final rfj_3 package_;
   private boolean int_;
   private final ShortSet[] new_ = new ShortSet[16];
   private int continue_;
   private int super_;
   private final rrse_3 this_;
   private final rrEh_1 else_;
   private final rrEX synchronized_;
   private boolean return_;
   private boolean public_;

   public CompletableFuture<Either<roJ_2, rrEM>> byte_() {
      return this.private_;
   }

   public static rrEJ byte_(int var0) {
      return case_[rfU_2.class_(33 - var0 + 1, 0, case_.length - 1)];
   }

   public rrEG(rfj_3 var1, int var2, rrse_3 var3, rrEh_1 var4, rrEX var5) {
      this.package_ = var1;
      this.this_ = var3;
      this.else_ = var4;
      this.synchronized_ = var5;
      this.native_ = rrEx_1.break_ + 1;
      this.volatile_ = this.native_;
      this.final_ = this.native_;
      this.class_(var2);
   }

   private void class_(CompletableFuture<? extends Either<? extends roC_2, rrEM>> var1) {
      this.extends_ = this.extends_.thenCombine(var1, (var0, var1x) -> (roC_2)var1x.map(var0x -> var0x, var1xx -> var0));
   }

   public CompletableFuture<Either<roC_2, rrEM>> class_(roN_2 var1, rrEx_1 var2) {
      int var3 = var1.byte_();
      CompletableFuture var4 = this.catch_.get(var3);
      if (var4 != null) {
         Either var5 = (Either)var4.getNow((Either)null);
         if (var5 == null || var5.left().isPresent()) {
            return var4;
         }
      }

      if (break_(this.volatile_).break_(var1)) {
         CompletableFuture var6 = var2.class_(this, var1);
         this.class_(var6);
         this.catch_.set(var3, var6);
         return var6;
      } else {
         return var4 == null ? break_ : var4;
      }
   }

   public CompletableFuture<Either<roC_2, rrEM>> class_(roN_2 var1) {
      CompletableFuture var2 = this.catch_.get(var1.byte_());
      return var2 == null ? break_ : var2;
   }

   private void class_(rYB var1, rfH_2 var2) {
      ryO_2 var3 = var1.class_(var2);
      if (var3 != null) {
         rFy_1 var4 = var3.Y_();
         if (var4 != null) {
            this.class_(var4, false);
         }
      }
   }

   protected void class_(rrEx_1 var1) {
      roN_2 var2 = break_(this.native_);
      roN_2 var3 = break_(this.volatile_);
      boolean var4 = this.native_ <= rrEx_1.break_;
      boolean var5 = this.volatile_ <= rrEx_1.break_;
      rrEJ var6 = byte_(this.native_);
      rrEJ var7 = byte_(this.volatile_);
      if (var4) {
         Either var8 = Either.right(new rrEb_1(this));

         for (int var9 = var5 ? var3.byte_() + 1 : 0; var9 <= var2.byte_(); var9++) {
            CompletableFuture var10 = this.catch_.get(var9);
            if (var10 != null) {
               var10.complete(var8);
            } else {
               this.catch_.set(var9, CompletableFuture.completedFuture(var8));
            }
         }
      }

      boolean var14 = var6.class_(rrEJ.BORDER);
      boolean var15 = var7.class_(rrEJ.BORDER);
      this.return_ |= var15;
      if (!var14 && var15) {
         this.private_ = var1.break_(this);
         this.class_(this.private_);
      }

      if (var14 && !var15) {
         CompletableFuture var16 = this.private_;
         this.private_ = protected_;
         this.class_(var16.thenApply(var1x -> var1x.ifLeft(var1::class_)));
      }

      boolean var17 = var6.class_(rrEJ.TICKING);
      boolean var11 = var7.class_(rrEJ.TICKING);
      if (!var17 && var11) {
         this.implements_ = var1.class_(this);
         this.class_(this.implements_);
      }

      if (var17 && !var11) {
         this.implements_.complete(byte_);
         this.implements_ = protected_;
      }

      boolean var12 = var6.class_(rrEJ.ENTITY_TICKING);
      boolean var13 = var7.class_(rrEJ.ENTITY_TICKING);
      if (!var12 && var13) {
         if (this.finally_ != protected_) {
            throw (IllegalStateException)rqR_2.byte_(new IllegalStateException());
         }

         this.finally_ = var1.byte_(this.package_);
         this.class_(this.finally_);
      }

      if (var12 && !var13) {
         this.finally_.complete(byte_);
         this.finally_ = protected_;
      }

      this.else_.class_(this.package_, this::extends_, this.volatile_, this::protected_);
      this.native_ = this.volatile_;
   }

   public void class_(int var1) {
      this.volatile_ = var1;
   }

   public void class_(roz_3 var1) {
      for (int var2 = 0; var2 < this.catch_.length(); var2++) {
         CompletableFuture var3 = this.catch_.get(var2);
         if (var3 != null) {
            Optional var4 = var3.getNow(class_).left();
            if (var4.isPresent() && var4.get() instanceof rok_3) {
               this.catch_.set(var2, CompletableFuture.completedFuture(Either.left(var1)));
            }
         }
      }

      this.class_(CompletableFuture.completedFuture(Either.left(var1.final_())));
   }

   public CompletableFuture<Either<roJ_2, rrEM>> class_() {
      return this.implements_;
   }

   private void class_(ruS_2<?> var1, boolean var2) {
      this.synchronized_.class_(this.package_, var2).forEach(var1x -> var1x.class_.class_(var1));
   }

   private void class_(rYB var1, rfH_2 var2, xc_3 var3) {
      if (var3.break_().protected_()) {
         this.class_(var1, var2);
      }
   }

   public void class_(rRo_1 var1, int var2) {
      roJ_2 var3 = this.protected_();
      if (var3 != null) {
         var3.break_(true);
         if (var1 == rRo_1.SKY) {
            this.super_ |= 1 << var2 - -1;
         } else {
            this.continue_ |= 1 << var2 - -1;
         }
      }
   }

   public void class_(rfH_2 var1) {
      roJ_2 var2 = this.protected_();
      if (var2 != null) {
         byte var3 = (byte)rjh_3.class_(var1.c_());
         if (this.new_[var3] == null) {
            this.int_ = true;
            this.new_[var3] = new ShortArraySet();
         }

         this.new_[var3].add(rjh_3.break_(var1));
      }
   }

   public void class_(roJ_2 var1) {
      if (this.int_ || this.super_ != 0 || this.continue_ != 0) {
         rYB var2 = var1.extends_();
         int var3 = 0;

         for (int var4 = 0; var4 < this.new_.length; var4++) {
            var3 += this.new_[var4] != null ? this.new_[var4].size() : 0;
         }

         this.public_ |= var3 >= 64;
         if (this.super_ != 0 || this.continue_ != 0) {
            this.class_(new rFC(var1.private_(), this.this_, this.super_, this.continue_, true), !this.public_);
            this.super_ = 0;
            this.continue_ = 0;
         }

         for (int var9 = 0; var9 < this.new_.length; var9++) {
            ShortSet var5 = this.new_[var9];
            if (var5 != null) {
               rjh_3 var6 = rjh_3.class_(var1.private_(), var9);
               if (var5.size() == 1) {
                  rfH_2 var7 = var6.catch_(var5.iterator().nextShort());
                  xc_3 var8 = var2.byte_(var7);
                  this.class_(new rZR(var7, var8), false);
                  this.class_(var2, var7, var8);
               } else {
                  roQ_2 var10 = var1.byte_()[var6.c_()];
                  rvC_2 var11 = new rvC_2(var6, var5, var10, this.public_);
                  this.class_(var11, false);
                  var11.class_((var2x, var3x) -> this.class_(var2, var2x, var3x));
               }

               this.new_[var9] = null;
            }
         }

         this.int_ = false;
      }
   }

   public CompletableFuture<Either<roJ_2, rrEM>> break_() {
      return this.finally_;
   }

   public static roN_2 break_(int var0) {
      return var0 < 33 ? roN_2.volatile_ : roN_2.class_(var0 - 33);
   }

   public CompletableFuture<Either<roC_2, rrEM>> break_(roN_2 var1) {
      return break_(this.volatile_).break_(var1) ? this.class_(var1) : break_;
   }

   public roN_2 throws_() {
      for (int var1 = throws_.size() - 1; var1 >= 0; var1--) {
         roN_2 var2 = throws_.get(var1);
         CompletableFuture var3 = this.class_(var2);
         if (var3.getNow(class_).left().isPresent()) {
            return var2;
         }
      }

      return null;
   }

   public int finally_() {
      return this.volatile_;
   }

   public CompletableFuture<roC_2> catch_() {
      return this.extends_;
   }

   public int extends_() {
      return this.final_;
   }

   public roC_2 case_() {
      for (int var1 = throws_.size() - 1; var1 >= 0; var1--) {
         roN_2 var2 = throws_.get(var1);
         CompletableFuture var3 = this.class_(var2);
         if (!var3.isCompletedExceptionally()) {
            Optional var4 = var3.getNow(class_).left();
            if (var4.isPresent()) {
               return (roC_2)var4.get();
            }
         }
      }

      return null;
   }

   public rfj_3 implements_() {
      return this.package_;
   }

   public roJ_2 protected_() {
      CompletableFuture var1 = this.class_();
      Either var2 = (Either)var1.getNow((Either)null);
      return var2 == null ? null : (roJ_2)var2.left().orElse((roJ_2)null);
   }

   private void protected_(int var1) {
      this.final_ = var1;
   }

   public rrEJ private_() {
      return byte_(this.volatile_);
   }

   public void volatile_() {
      this.return_ = byte_(this.volatile_).class_(rrEJ.BORDER);
   }

   public boolean native_() {
      return this.return_;
   }
}
