package celestial;

import java.util.Optional;
import java.util.function.Predicate;

public class WB {
   private static final Jy_1 class_ = (var0, var1, var2) -> var0.class_(xu_3.rg);
   private final rRg_1 break_;
   private final rpB_2 byte_;
   private final rpr_3 protected_;
   private int throws_;
   private rfH_2 case_;
   private int catch_;
   private int private_;

   public boolean byte_() {
      return this.class_() && this.throws_ == this.private_ * this.catch_;
   }

   public WB(rRg_1 var1, rfH_2 var2, rpB_2 var3) {
      this.break_ = var1;
      this.byte_ = var3;
      this.protected_ = var3 == rpB_2.X ? rpr_3.WEST : rpr_3.SOUTH;
      this.case_ = this.class_(var2);
      if (this.case_ == null) {
         this.case_ = var2;
         this.private_ = 1;
         this.catch_ = 1;
      } else {
         this.private_ = this.protected_();
         if (this.private_ > 0) {
            this.catch_ = this.throws_();
         }
      }
   }

   public boolean class_() {
      return this.case_ != null && this.private_ >= 2 && this.private_ <= 21 && this.catch_ >= 3 && this.catch_ <= 21;
   }

   public static rjU_2 class_(rqT_2 var0, rpB_2 var1, rjU_2 var2, ap_3 var3) {
      double var4 = (double)var0.break_ - (double)var3.class_;
      double var6 = (double)var0.byte_ - (double)var3.break_;
      rfH_2 var8 = var0.class_;
      double var9;
      if (var4 > 0.0) {
         float var11 = (float)var8.class_(var1) + var3.class_ / 2.0F;
         var9 = rfU_2.class_(rfU_2.byte_(var2.class_(var1) - (double)var11, 0.0, var4), 0.0, 1.0);
      } else {
         var9 = 0.5;
      }

      double var16;
      if (var6 > 0.0) {
         rpB_2 var13 = rpB_2.Y;
         var16 = rfU_2.class_(rfU_2.byte_(var2.class_(var13) - (double)var8.class_(var13), 0.0, var6), 0.0, 1.0);
      } else {
         var16 = 0.0;
      }

      rpB_2 var17 = var1 == rpB_2.X ? rpB_2.Z : rpB_2.X;
      double var14 = var2.class_(var17) - ((double)var8.class_(var17) + 0.5);
      return new rjU_2(var9, var16, var14);
   }

   public static WP class_(rrEm_1 var0, rqT_2 var1, rpB_2 var2, rjU_2 var3, ap_3 var4, rjU_2 var5, float var6, float var7) {
      rfH_2 var8 = var1.class_;
      xc_3 var9 = var0.byte_(var8);
      rpB_2 var10 = var9.byte_(rCT.char_);
      double var11 = (double)var1.break_;
      double var13 = (double)var1.byte_;
      int var15 = var2 == var10 ? 0 : 90;
      rjU_2 var16 = var2 == var10 ? var5 : new rjU_2(var5.protected_, var5.byte_, -var5.break_);
      double var17 = (double)var4.class_ / 2.0 + (var11 - (double)var4.class_) * var3.class_();
      double var19 = (var13 - (double)var4.break_) * var3.break_();
      double var21 = 0.5 + var3.byte_();
      boolean var23 = var10 == rpB_2.X;
      rjU_2 var24 = new rjU_2((double)var8.b_() + (var23 ? var17 : var21), (double)var8.c_() + var19, (double)var8.d_() + (var23 ? var21 : var17));
      return new WP(var24, var16, var6 + (float)var15, var7);
   }

   public static Optional<WB> class_(rRg_1 var0, rfH_2 var1, rpB_2 var2) {
      return class_(var0, var1, var0x -> var0x.class_() && var0x.throws_ == 0, var2);
   }

   private boolean class_(rfw_3 var1, int var2) {
      for (int var3 = 0; var3 < this.private_; var3++) {
         rfw_3 var4 = var1.class_(this.case_).byte_(rpr_3.UP, var2).byte_(this.protected_, var3);
         if (!class_.test(this.break_.byte_(var4), this.break_, var4)) {
            return false;
         }
      }

      return true;
   }

   public static Optional<WB> class_(rRg_1 var0, rfH_2 var1, Predicate<WB> var2, rpB_2 var3) {
      Optional var4 = Optional.of(new WB(var0, var1, var3)).filter(var2);
      if (var4.isPresent()) {
         return var4;
      } else {
         rpB_2 var5 = var3 == rpB_2.X ? rpB_2.Z : rpB_2.X;
         return Optional.of(new WB(var0, var1, var5)).filter(var2);
      }
   }

   private int class_(rfH_2 var1, rpr_3 var2) {
      rfw_3 var3 = new rfw_3();

      for (int var4 = 0; var4 <= 21; var4++) {
         var3.class_(var1).byte_(var2, var4);
         xc_3 var5 = this.break_.byte_(var3);
         if (!class_(var5)) {
            if (class_.test(var5, this.break_, var3)) {
               return var4;
            }
            break;
         }

         xc_3 var6 = this.break_.byte_(var3.class_(rpr_3.DOWN));
         if (!class_.test(var6, this.break_, var3)) {
            break;
         }
      }

      return 0;
   }

   private rfH_2 class_(rfH_2 var1) {
      int var2 = Math.max(0, var1.c_() - 21);

      while (var1.c_() > var2 && class_(this.break_.byte_(var1.break_()))) {
         var1 = var1.break_();
      }

      rpr_3 var4 = this.protected_.case_();
      int var3 = this.class_(var1, var4) - 1;
      return var3 < 0 ? null : var1.class_(var4, var3);
   }

   private int class_(rfw_3 var1) {
      for (int var2 = 0; var2 < 21; var2++) {
         var1.class_(this.case_).byte_(rpr_3.UP, var2).byte_(this.protected_, -1);
         if (!class_.test(this.break_.byte_(var1), this.break_, var1)) {
            return var2;
         }

         var1.class_(this.case_).byte_(rpr_3.UP, var2).byte_(this.protected_, this.private_);
         if (!class_.test(this.break_.byte_(var1), this.break_, var1)) {
            return var2;
         }

         for (int var3 = 0; var3 < this.private_; var3++) {
            var1.class_(this.case_).byte_(rpr_3.UP, var2).byte_(this.protected_, var3);
            xc_3 var4 = this.break_.byte_(var1);
            if (!class_(var4)) {
               return var2;
            }

            if (var4.class_(xu_3.Pi)) {
               this.throws_++;
            }
         }
      }

      return 21;
   }

   private static boolean class_(xc_3 var0) {
      return var0.catch_() || var0.class_(rls_3.N) || var0.class_(xu_3.Pi);
   }

   public void break_() {
      xc_3 var1 = xu_3.Pi.continue_().class_(kT_2.volatile_, this.byte_);
      rfH_2.class_(this.case_, this.case_.class_(rpr_3.UP, this.catch_ - 1).class_(this.protected_, this.private_ - 1))
         .forEach(var2 -> this.break_.class_(var2, var1, 18));
   }

   private int throws_() {
      rfw_3 var1 = new rfw_3();
      int var2 = this.class_(var1);
      return var2 >= 3 && var2 <= 21 && this.class_(var1, var2) ? var2 : 0;
   }

   private int protected_() {
      int var1 = this.class_(this.case_, this.protected_);
      return var1 >= 2 && var1 <= 21 ? var1 : 0;
   }
}
