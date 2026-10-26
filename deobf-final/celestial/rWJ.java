package celestial;

public class rWJ extends rWN {
   public rWJ(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public rdn_3 class_(rXk_1 var1) {
      rdn_3 var2 = rdn_3.break_;
      rxA_2 var3 = (rxA_2)rdy_3.XL;

      for (int var4 = 0; var4 < var1.else_(); var4++) {
         rdn_3 var5 = var1.extends_(var4);
         if (!var5.class_()) {
            rdb_3 var6 = var5.break_();
            if (xd_3.class_(var6) instanceof Wp_1) {
               var2 = var5;
            } else if (var6 instanceof rxA_2) {
               var3 = (rxA_2)var6;
            }
         }
      }

      rdn_3 var7 = Wp_1.break_(var3.byte_());
      if (var2.final_()) {
         var7.byte_(var2.package_().catch_());
      }

      return var7;
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      int var3 = 0;
      int var4 = 0;

      for (int var5 = 0; var5 < var1.else_(); var5++) {
         rdn_3 var6 = var1.extends_(var5);
         if (!var6.class_()) {
            if (xd_3.class_(var6.break_()) instanceof Wp_1) {
               var3++;
            } else {
               if (!(var6.break_() instanceof rxA_2)) {
                  return false;
               }

               var4++;
            }

            if (var4 > 1 || var3 > 1) {
               return false;
            }
         }
      }

      return var3 == 1 && var4 == 1;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.volatile_;
   }
}
