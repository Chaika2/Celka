package celestial;

public class rJL extends rJr_1 {
   private final rpq_3 class_;
   final rpj_3 break_ = rpj_3.class_();
   Runnable byte_ = () -> {
   };
   final rJY protected_;
   final rJY catch_;
   private final rJY private_;
   private final rJY implements_;
   long finally_;
   private final rXu_1 extends_ = new rJA(this, 3);
   private final rXu_1 native_ = new rJn_1(this, 1);

   public rJY byte_() {
      return this.catch_;
   }

   public rJL(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.class_);
   }

   public rJL(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.continue_, var1);
      this.class_ = var3;
      this.protected_ = this.break_(new rJC(this, this.extends_, 0, 13, 26));
      this.catch_ = this.break_(new rJl_1(this, this.extends_, 1, 33, 26));
      this.private_ = this.break_(new rJH(this, this.extends_, 2, 23, 45));
      this.implements_ = this.break_(new rJy_1(this, this.native_, 0, 143, 58, var3));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.break_(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.break_(new rJY(var2, var6, 8 + var6 * 18, 142));
      }

      this.class_(this.break_);
   }

   @Override
   public void class_(rXu_1 var1) {
      rdn_3 var2 = this.protected_.class_();
      rdn_3 var3 = this.catch_.class_();
      rdn_3 var4 = this.private_.class_();
      rdn_3 var5 = this.implements_.class_();
      if (var5.class_()
         || !var2.class_()
            && !var3.class_()
            && this.break_.break_() > 0
            && (this.break_.break_() < rHE.BANNER_PATTERNS_COUNT - rHE.BANNERS_WITH_ITEMS || !var4.class_())) {
         if (!var4.class_() && var4.break_() instanceof rxh_3) {
            rcd_3 var6 = var2.class_("BlockEntityTag");
            boolean var7 = var6.byte_("Patterns", 9) && !var2.class_() && var6.protected_("Patterns", 10).size() >= 6;
            if (var7) {
               this.break_.class_(0);
            } else {
               this.break_.class_(((rxh_3)var4.break_()).byte_().ordinal());
            }
         }
      } else {
         this.implements_.break_(rdn_3.break_);
         this.break_.class_(0);
      }

      this.case_();
      this.native_();
   }

   public void class_(Runnable var1) {
      this.byte_ = var1;
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 == this.implements_.protected_) {
            if (!this.class_(var5, 4, 40, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
         } else if (var2 != this.catch_.protected_ && var2 != this.protected_.protected_ && var2 != this.private_.protected_) {
            if (var5.break_() instanceof rxO_2) {
               if (!this.class_(var5, this.protected_.protected_, this.protected_.protected_ + 1, false)) {
                  return rdn_3.break_;
               }
            } else if (var5.break_() instanceof rxA_2) {
               if (!this.class_(var5, this.catch_.protected_, this.catch_.protected_ + 1, false)) {
                  return rdn_3.break_;
               }
            } else if (var5.break_() instanceof rxh_3) {
               if (!this.class_(var5, this.private_.protected_, this.private_.protected_ + 1, false)) {
                  return rdn_3.break_;
               }
            } else if (var2 >= 4 && var2 < 31) {
               if (!this.class_(var5, 31, 40, false)) {
                  return rdn_3.break_;
               }
            } else if (var2 >= 31 && var2 < 40 && !this.class_(var5, 4, 31, false)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 4, 40, false)) {
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

         var4.class_(var1, var5);
      }

      return var3;
   }

   public int class_() {
      return this.break_.break_();
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return class_(this.class_, var1, xu_3.he);
   }

   public rJY break_() {
      return this.protected_;
   }

   @Override
   public boolean break_(rhd_3 var1, int var2) {
      if (var2 > 0 && var2 <= rHE.PATTERN_ITEM_INDEX) {
         this.break_.class_(var2);
         this.case_();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.class_.class_((var2, var3) -> this.class_(var1, (rYB)var1.throws_[7], this.extends_));
   }

   public rJY throws_() {
      return this.implements_;
   }

   private void case_() {
      if (this.break_.break_() > 0) {
         rdn_3 var1 = this.protected_.class_();
         rdn_3 var2 = this.catch_.class_();
         rdn_3 var3 = rdn_3.break_;
         if (!var1.class_() && !var2.class_()) {
            var3 = var1.implements_();
            var3.throws_(1);
            rHE var4 = rHE.values()[this.break_.break_()];
            rxL_2 var5 = ((rxA_2)var2.break_()).byte_();
            rcd_3 var6 = var3.class_("BlockEntityTag");
            rcy_3 var7;
            if (var6.byte_("Patterns", 9)) {
               var7 = var6.protected_("Patterns", 10);
            } else {
               var7 = new rcy_3();
               var6.class_("Patterns", var7);
            }

            rcd_3 var8 = new rcd_3();
            var8.class_("Pattern", var4.break_());
            var8.break_("Color", var5.break_());
            var7.add(var8);
         }

         if (!rdn_3.break_(var3, this.implements_.class_())) {
            this.implements_.break_(var3);
         }
      }
   }

   public rJY protected_() {
      return this.private_;
   }
}
