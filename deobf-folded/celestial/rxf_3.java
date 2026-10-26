package celestial;

public class rxf_3 extends rdb_3 {
   public rxf_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      boolean var5 = false;
      if (xn_3.id_implements(var4)) {
         this.id_class(var2, var3);
         var2.id_break(var3, var4.id_class(xn_3.id_final, Boolean.valueOf(true)));
         var5 = true;
      } else {
         var3 = var3.id_break(var1.id_finally());
         if (Jj_1.id_class(var2, var3, var1.id_case())) {
            this.id_class(var2, var3);
            var2.id_break(var3, Jj_1.id_class(var2, var3));
            var5 = true;
         }
      }

      if (var5) {
         var1.id_volatile().id_catch(1);
         return ryZ_2.id_class(var2.id_continue);
      } else {
         return ryZ_2.FAIL;
      }
   }

   private void id_class(rYB var1, rfH_2 var2) {
      var1.id_class((rhd_3)null, var2, rqn_3.SE, rqL_2.BLOCKS, 1.0F, (id_private.nextFloat() - id_private.nextFloat()) * 0.2F + 1.0F);
   }
}
