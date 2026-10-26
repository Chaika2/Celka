package celestial;

public class rdq_3 extends rdb_3 {
   public rdq_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xd_3 var4 = var2.byte_(var3).break_();
      if (var4.class_(rls_3.default_)) {
         rhd_3 var5 = var1.final_();
         if (!var2.continue_ && var5 != null) {
            class_(var5, var2, var3);
         }

         return ryZ_2.class_(var2.continue_);
      } else {
         return ryZ_2.PASS;
      }
   }

   public static ryZ_2 class_(rhd_3 var0, rYB var1, rfH_2 var2) {
      rsM_2 var3 = null;
      boolean var4 = false;
      double var5 = 7.0;
      int var7 = var2.b_();
      int var8 = var2.c_();
      int var9 = var2.d_();

      for (is_3 var11 : var1.class_(
         is_3.class, new rfl_3((double)var7 - 7.0, (double)var8 - 7.0, (double)var9 - 7.0, (double)var7 + 7.0, (double)var8 + 7.0, (double)var9 + 7.0)
      )) {
         if (var11.N() == var0) {
            if (var3 == null) {
               var3 = rsM_2.class_(var1, var2);
            }

            var11.break_(var3, true);
            var4 = true;
         }
      }

      return var4 ? ryZ_2.SUCCESS : ryZ_2.PASS;
   }
}
