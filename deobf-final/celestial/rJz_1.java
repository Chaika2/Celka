package celestial;

public class rJz_1 extends rJr_1 {
   private final rXu_1 class_;

   public rJz_1(int var1, rhz_3 var2) {
      this(var1, var2, new rXA(5));
   }

   public rJz_1(int var1, rhz_3 var2, rXu_1 var3) {
      super(rJP.int_, var1);
      this.class_ = var3;
      class_(var3, 5);
      var3.b_(var2.throws_);
      byte var4 = 51;

      for (int var5 = 0; var5 < 5; var5++) {
         this.break_(new rJY(var3, var5, 44 + var5 * 18, 20));
      }

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.break_(new rJY(var2, var6 + var7 * 9 + 9, 8 + var6 * 18, var7 * 18 + 51));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.break_(new rJY(var2, var8, 8 + var8 * 18, 109));
      }
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 < this.class_.else_()) {
            if (!this.class_(var5, this.class_.else_(), this.throws_.size(), true)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 0, this.class_.else_(), false)) {
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
      return this.class_.byte_(var1);
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.class_.break_(var1);
   }
}
