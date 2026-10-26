package celestial;

public class rdq_3 extends rdb_3 {
   public rdq_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xd_3 var4 = var2.id_byte(var3).id_break();
      if (var4.id_class(rls_3.id_default)) {
         rhd_3 var5 = var1.id_final();
         if (!var2.id_continue && var5 != null) {
            id_class(var5, var2, var3);
         }

         return ryZ_2.id_class(var2.id_continue);
      } else {
         return ryZ_2.PASS;
      }
   }

   public static ryZ_2 id_class(rhd_3 var0, rYB var1, rfH_2 var2) {
      rsM_2 var3 = null;
      boolean var4 = false;
      double var5 = 7.0;
      int var7 = var2.b_();
      int var8 = var2.c_();
      int var9 = var2.d_();

      for (is_3 var11 : var1.id_class(
         is_3.class, new rfl_3((double)var7 - 7.0, (double)var8 - 7.0, (double)var9 - 7.0, (double)var7 + 7.0, (double)var8 + 7.0, (double)var9 + 7.0)
      )) {
         if (var11.N() == var0) {
            if (var3 == null) {
               var3 = rsM_2.id_class(var1, var2);
            }

            var11.id_break(var3, true);
            var4 = true;
         }
      }

      return var4 ? ryZ_2.SUCCESS : ryZ_2.PASS;
   }
}
