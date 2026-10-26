package celestial;

public abstract class rXy_1 extends rJr_1 {
   protected final rXd_1 class_ = new rXd_1();
   protected final rXu_1 break_ = new rXp_1(this, 2);
   protected final rpq_3 byte_;
   protected final rhd_3 protected_;

   public rXy_1(rJP<?> var1, int var2, rhz_3 var3, rpq_3 var4) {
      super(var1, var2);
      this.byte_ = var4;
      this.protected_ = var3.throws_;
      this.break_(new rJY(this.break_, 0, 27, 47));
      this.break_(new rJY(this.break_, 1, 76, 47));
      this.break_(new rXq_1(this, this.class_, 2, 134, 47));

      for (int var5 = 0; var5 < 3; var5++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.break_(new rJY(var3, var6 + var5 * 9 + 9, 8 + var6 * 18, 84 + var5 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.break_(new rJY(var3, var7, 8 + var7 * 18, 142));
      }
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return this.byte_
         .class_(
            (var2, var3) -> !this.class_(var2.byte_(var3))
                  ? false
                  : var1.class_((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5) <= 64.0,
            true
         );
   }

   @Override
   public void class_(rXu_1 var1) {
      super.class_(var1);
      if (var1 == this.break_) {
         this.class_();
      }
   }

   protected boolean class_(rdn_3 var1) {
      return false;
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 == 2) {
            if (!this.class_(var5, 3, 39, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
         } else if (var2 != 0 && var2 != 1) {
            if (var2 >= 3 && var2 < 39) {
               int var6 = this.class_(var3) ? 1 : 0;
               if (!this.class_(var5, var6, 2, false)) {
                  return rdn_3.break_;
               }
            }
         } else if (!this.class_(var5, 3, 39, false)) {
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

   protected abstract rdn_3 class_(rhd_3 var1, rdn_3 var2);

   protected abstract boolean class_(rhd_3 var1, boolean var2);

   public abstract void class_();

   protected abstract boolean class_(xc_3 var1);

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.byte_.class_((var2, var3) -> this.class_(var1, var2, this.break_));
   }
}
