package celestial;

import java.util.Optional;

public class rJa_1 extends rJI<rXk_1> {
   private final rXk_1 class_ = new rXk_1(this, 3, 3);
   private final rXd_1 break_ = new rXd_1();
   private final rpq_3 byte_;
   private final rhd_3 protected_;

   @Override
   public int byte_() {
      return this.class_.protected_();
   }

   public rJa_1(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.class_);
   }

   public rJa_1(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.native_, var1);
      this.byte_ = var3;
      this.protected_ = var2.throws_;
      this.break_(new rJS(var2.throws_, this.class_, this.break_, 0, 124, 35));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 3; var5++) {
            this.break_(new rJY(this.class_, var5 + var4 * 3, 30 + var5 * 18, 17 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.break_(new rJY(var2, var8 + var6 * 9 + 9, 8 + var8 * 18, 84 + var6 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.break_(new rJY(var2, var7, 8 + var7 * 18, 142));
      }
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 == 0) {
            this.byte_.class_((var2x, var3x) -> var5.break_().break_(var5, var2x, var1));
            if (!this.class_(var5, 10, 46, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
         } else if (var2 >= 10 && var2 < 46) {
            if (!this.class_(var5, 1, 10, false)) {
               if (var2 < 37) {
                  if (!this.class_(var5, 37, 46, false)) {
                     return rdn_3.break_;
                  }
               } else if (!this.class_(var5, 10, 37, false)) {
                  return rdn_3.break_;
               }
            }
         } else if (!this.class_(var5, 10, 46, false)) {
            return rdn_3.break_;
         }

         if (var5.class_()) {
            var4.break_(rdn_3.break_);
         } else {
            var4.byte_();
         }

         if (var5.char_() == var3.char_()) {
            return rdn_3.break_;
         }

         rdn_3 var6 = var4.class_(var1, var5);
         if (var2 == 0) {
            var1.class_(var6, false);
         }
      }

      return var3;
   }

   @Override
   public boolean class_(rdn_3 var1, rJY var2) {
      return var2.byte_ != this.break_ && super.class_(var1, var2);
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return class_(this.byte_, var1, xu_3.PP);
   }

   @Override
   public void class_(rWr_1 var1) {
      this.class_.class_(var1);
   }

   @Override
   public void class_() {
      this.class_.public_();
      this.break_.public_();
   }

   @Override
   public void class_(rXu_1 var1) {
      this.byte_.class_((var1x, var2) -> class_(this.case_, var1x, this.protected_, this.class_, this.break_));
   }

   @Override
   public boolean class_(rkw_3<? super rXk_1> var1) {
      return var1.class_(this.class_, (rYB)this.protected_.throws_[7]);
   }

   protected static void class_(int var0, rYB var1, rhd_3 var2, rXk_1 var3, rXd_1 var4) {
      if (!var1.continue_) {
         rhN_2 var5 = (rhN_2)var2;
         rdn_3 var6 = rdn_3.break_;
         Optional var7 = var1.const_().V().class_(rkj_3.class_, var3, var1);
         if (var7.isPresent()) {
            rkt_3 var8 = (rkt_3)var7.get();
            if (var4.class_(var1, var5, var8)) {
               var6 = var8.class_(var3);
            }
         }

         var4.break_(0, var6);
         var5.class_.class_(new rFM(var0, 0, var6));
      }
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.byte_.class_((var2, var3) -> this.class_(var1, var2, this.class_));
   }

   @Override
   public int break_() {
      return 0;
   }

   @Override
   public int throws_() {
      return 10;
   }

   @Override
   public rke_3 implements_() {
      return rke_3.CRAFTING;
   }

   @Override
   public int protected_() {
      return this.class_.byte_();
   }
}
