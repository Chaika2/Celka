package celestial;

public class rXT extends rJr_1 {
   private final rXu_1 class_ = new rXt_1(this, 1);
   private final rXw_1 break_;
   private final rpq_3 byte_;
   private final rpF_2 protected_;

   public rLR byte_() {
      return rLR.class_(this.protected_.class_(2));
   }

   public rXT(int var1, rXu_1 var2) {
      this(var1, var2, new rpI_2(3), rpq_3.class_);
   }

   public rXT(int var1, rXu_1 var2, rpF_2 var3, rpq_3 var4) {
      super(rJP.implements_, var1);
      class_(var3, 3);
      this.protected_ = var3;
      this.byte_ = var4;
      this.break_ = new rXw_1(this, this.class_, 0, 136, 110);
      this.break_(this.break_);
      this.class_(var3);
      byte var5 = 36;
      short var6 = 137;

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.break_(new rJY(var2, var8 + var7 * 9 + 9, 36 + var8 * 18, 137 + var7 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.break_(new rJY(var2, var9, 36 + var9 * 18, 195));
      }
   }

   public int class_() {
      return this.protected_.class_(0);
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 == 0) {
            if (!this.class_(var5, 1, 37, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
         } else if (!this.break_.break_() && this.break_.class_(var5) && var5.char_() == 1) {
            if (!this.class_(var5, 0, 1, false)) {
               return rdn_3.break_;
            }
         } else if (var2 >= 1 && var2 < 28) {
            if (!this.class_(var5, 28, 37, false)) {
               return rdn_3.break_;
            }
         } else if (var2 >= 28 && var2 < 37) {
            if (!this.class_(var5, 1, 28, false)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 1, 37, false)) {
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

   @Override
   public void class_(int var1, int var2) {
      super.class_(var1, var2);
      this.native_();
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return class_(this.byte_, var1, xu_3.Sv);
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      if (!((rYB)var1.throws_[7]).continue_) {
         rdn_3 var2 = this.break_.class_(this.break_.protected_());
         if (!var2.class_()) {
            var1.class_(var2, false);
         }
      }
   }

   public void break_(int var1, int var2) {
      if (this.break_.break_()) {
         this.protected_.class_(1, var1);
         this.protected_.class_(2, var2);
         this.break_.class_(1);
      }
   }

   public rLR break_() {
      return rLR.class_(this.protected_.class_(1));
   }

   public boolean protected_() {
      return !this.class_.extends_(0).class_();
   }
}
