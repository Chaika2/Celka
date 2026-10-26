package celestial;

public class rJs_1 extends rJr_1 {
   private final rXu_1 class_;

   public rJs_1(int var1, rhz_3 var2) {
      this(var1, var2, new rXA(9));
   }

   public rJs_1(int var1, rhz_3 var2, rXu_1 var3) {
      super(rJP.catch_, var1);
      class_(var3, 9);
      this.class_ = var3;
      var3.b_(var2.throws_);

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 3; var5++) {
            this.break_(new rJY(var3, var5 + var4 * 3, 62 + var5 * 18, 17 + var4 * 18));
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
         if (var2 < 9) {
            if (!this.class_(var5, 9, 45, true)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 0, 9, false)) {
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
   public boolean class_(rhd_3 var1) {
      return this.class_.byte_(var1);
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.class_.break_(var1);
   }
}
