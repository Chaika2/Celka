package celestial;

public class FF extends rJr_1 {
   public final rqs_3<rdn_3> class_ = rqs_3.class_();

   public FF(rhd_3 var1) {
      super((rJP<?>)null, 0);
      rhz_3 var2 = (rhz_3)var1.implements_[1];

      for (int var3 = 0; var3 < 5; var3++) {
         for (int var4 = 0; var4 < 9; var4++) {
            this.break_(new FA(Fv_1.case_, var3 * 9 + var4, 9 + var4 * 18, 18 + var3 * 18));
         }
      }

      for (int var5 = 0; var5 < 9; var5++) {
         this.break_(new rJY(var2, var5, 9 + var5 * 18, 112));
      }

      this.class_(0.0F);
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      if (var2 >= this.throws_.size() - 9 && var2 < this.throws_.size()) {
         rJY var3 = this.throws_.get(var2);
         if (var3 != null && var3.break_()) {
            var3.break_(rdn_3.break_);
         }
      }

      return rdn_3.break_;
   }

   @Override
   public boolean class_(rdn_3 var1, rJY var2) {
      return var2.byte_ != Fv_1.case_;
   }

   @Override
   public boolean class_(rJY var1) {
      return var1.byte_ != Fv_1.case_;
   }

   public boolean class_() {
      return this.class_.size() > 45;
   }

   public void class_(float var1) {
      int var2 = (this.class_.size() + 9 - 1) / 9 - 5;
      int var3 = (int)((double)(var1 * (float)var2) + 0.5);
      if (var3 < 0) {
         var3 = 0;
      }

      for (int var4 = 0; var4 < 5; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            int var6 = var5 + (var4 + var3) * 9;
            if (var6 >= 0 && var6 < this.class_.size()) {
               Fv_1.case_.break_(var5 + var4 * 9, this.class_.get(var6));
            } else {
               Fv_1.case_.break_(var5 + var4 * 9, rdn_3.break_);
            }
         }
      }
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return true;
   }
}
