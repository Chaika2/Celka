package celestial;

public class rJQ extends rJr_1 {
   private final rXu_1 class_;
   private final rOD break_;

   public rJQ(int var1, rhz_3 var2, rXu_1 var3, rOD var4) {
      super((rJP<?>)null, var1);
      this.class_ = var3;
      this.break_ = var4;
      byte var5 = 3;
      var3.b_(var2.throws_);
      byte var6 = -18;
      this.break_(new rJN(this, var3, 0, 8, 18, var4));
      this.break_(new rJc_1(this, var3, 1, 8, 36, var4));
      if (var4 instanceof rOK && ((rOK)var4).sJ()) {
         for (int var7 = 0; var7 < 3; var7++) {
            for (int var8 = 0; var8 < ((rOK)var4).sc(); var8++) {
               this.break_(new rJY(var3, 2 + var8 + var7 * ((rOK)var4).sc(), 80 + var8 * 18, 18 + var7 * 18));
            }
         }
      }

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var11 = 0; var11 < 9; var11++) {
            this.break_(new rJY(var2, var11 + var9 * 9 + 9, 8 + var11 * 18, 102 + var9 * 18 + -18));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.break_(new rJY(var2, var10, 8 + var10 * 18, 142));
      }
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         int var6 = this.class_.else_();
         if (var2 < var6) {
            if (!this.class_(var5, var6, this.throws_.size(), true)) {
               return rdn_3.break_;
            }
         } else if (this.class_(1).class_(var5) && !this.class_(1).break_()) {
            if (!this.class_(var5, 1, 2, false)) {
               return rdn_3.break_;
            }
         } else if (this.class_(0).class_(var5)) {
            if (!this.class_(var5, 0, 1, false)) {
               return rdn_3.break_;
            }
         } else if (var6 <= 2 || !this.class_(var5, 2, var6, false)) {
            int var7 = var6 + 27;
            int var8 = var7 + 9;
            if (var2 >= var7 && var2 < var8) {
               if (!this.class_(var5, var6, var7, false)) {
                  return rdn_3.break_;
               }
            } else if (var2 >= var6 && var2 < var7) {
               if (!this.class_(var5, var7, var8, false)) {
                  return rdn_3.break_;
               }
            } else if (!this.class_(var5, var7, var7, false)) {
               return rdn_3.break_;
            }

            return rdn_3.break_;
         }

         if (var5.class_()) {
            var4.break_(rdn_3.break_);
         } else {
            var4.byte_();
         }
      }

      return var3;
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return this.class_.byte_(var1) && this.break_.BM() && this.break_.implements_(var1) < 8.0F;
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.class_.break_(var1);
   }
}
