package celestial;

import java.util.Objects;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class rjt_3 extends AbstractSpliterator<rjC_2> {
   private final an_3 class_;
   private final rfl_3 break_;
   private final rjm_3 byte_;
   private final rfR_2 protected_;
   private final rfw_3 throws_;
   private final rjC_2 case_;
   private final rRT catch_;
   private boolean private_;
   private final BiPredicate<xc_3, rfH_2> implements_;

   public rjt_3(rRT var1, an_3 var2, rfl_3 var3) {
      this(var1, var2, var3, (var0, var1x) -> true);
   }

   public rjt_3(rRT var1, an_3 var2, rfl_3 var3, BiPredicate<xc_3, rfH_2> var4) {
      super(Long.MAX_VALUE, 1280);
      this.byte_ = var2 == null ? rjm_3.break_() : rjm_3.class_(var2);
      this.throws_ = new rfw_3();
      this.case_ = rjw_3.class_(var3);
      this.catch_ = var1;
      this.private_ = var2 != null;
      this.class_ = var2;
      this.break_ = var3;
      this.implements_ = var4;
      int var5 = rfU_2.byte_(var3.class_ - 1.0E-7) - 1;
      int var6 = rfU_2.byte_(var3.protected_ + 1.0E-7) + 1;
      int var7 = rfU_2.byte_(var3.break_ - 1.0E-7) - 1;
      int var8 = rfU_2.byte_(var3.throws_ + 1.0E-7) + 1;
      int var9 = rfU_2.byte_(var3.byte_ - 1.0E-7) - 1;
      int var10 = rfU_2.byte_(var3.case_ + 1.0E-7) + 1;
      this.protected_ = new rfR_2(var5, var7, var9, var6, var8, var10);
   }

   private static boolean class_(rjC_2 var0, rfl_3 var1) {
      return rjw_3.byte_(var0, rjw_3.class_(var1.class_(1.0E-7)), rjN_2.implements_);
   }

   public static boolean class_(roE_2 var0, rfl_3 var1) {
      double var2 = (double)rfU_2.byte_(var0.throws_());
      double var4 = (double)rfU_2.byte_(var0.case_());
      double var6 = (double)rfU_2.throws_(var0.catch_());
      double var8 = (double)rfU_2.throws_(var0.private_());
      return var1.class_ > var2
         && var1.class_ < var6
         && var1.byte_ > var4
         && var1.byte_ < var8
         && var1.protected_ > var2
         && var1.protected_ < var6
         && var1.case_ > var4
         && var1.case_ < var8;
   }

   private rRq_1 class_(int var1, int var2) {
      int var3 = var1 >> 4;
      int var4 = var2 >> 4;
      return this.catch_.byte_(var3, var4);
   }

   boolean class_(Consumer<? super rjC_2> var1) {
      while (this.protected_.class_()) {
         int var2 = this.protected_.break_();
         int var3 = this.protected_.byte_();
         int var4 = this.protected_.protected_();
         int var5 = this.protected_.throws_();
         if (var5 != 3) {
            rRq_1 var6 = this.class_(var2, var4);
            if (var6 != null) {
               this.throws_.class_(var2, var3, var4);
               xc_3 var7 = var6.byte_(this.throws_);
               if (this.implements_.test(var7, this.throws_) && (var5 != 1 || var7.protected_()) && (var5 != 2 || var7.class_(xu_3.rc))) {
                  rjC_2 var8 = var7.break_(this.catch_, this.throws_, this.byte_);
                  if (var8 == rjw_3.break_()) {
                     if (this.break_.class_((double)var2, (double)var3, (double)var4, (double)var2 + 1.0, (double)var3 + 1.0, (double)var4 + 1.0)) {
                        var1.accept(var8.class_((double)var2, (double)var3, (double)var4));
                        return true;
                     }
                  } else {
                     rjC_2 var9 = var8.class_((double)var2, (double)var3, (double)var4);
                     if (rjw_3.byte_(var9, this.case_, rjN_2.implements_)) {
                        var1.accept(var9);
                        return true;
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   boolean break_(Consumer<? super rjC_2> var1) {
      Objects.requireNonNull(this.class_);
      this.private_ = false;
      roE_2 var2 = this.catch_.instanceof_();
      rfl_3 var3 = this.class_.rN();
      if (!class_(var2, var3)) {
         rjC_2 var4 = var2.byte_();
         if (!break_(var4, var3) && class_(var4, var3)) {
            var1.accept(var4);
            return true;
         }
      }

      return false;
   }

   private static boolean break_(rjC_2 var0, rfl_3 var1) {
      return rjw_3.byte_(var0, rjw_3.class_(var1.break_(1.0E-7)), rjN_2.implements_);
   }

   @Override
   public boolean tryAdvance(Consumer<? super rjC_2> var1) {
      return this.private_ && this.break_(var1) || this.class_(var1);
   }
}
