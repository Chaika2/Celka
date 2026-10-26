package celestial;

public class rxo_3 extends rdb_3 implements rdS_2 {
   public rxo_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public String id_class(rhd_3 var1, rdn_3 var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < 45; var4++) {
         rdn_3 var5 = ((rhz_3)var1.id_implements[1]).id_extends(var4);
         if (var5.id_break() == rdy_3.Pz) {
            var3 += var5.id_char();
         }
      }

      return var3 + "";
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rhd_3 var2 = var1.id_final();
      rYB var3 = var1.id_int();
      rfH_2 var4 = var1.id_class();
      xc_3 var5 = var3.id_byte(var4);
      if (xn_3.id_implements(var5)) {
         var3.id_class(var2, var4, rqn_3.Sc, rqL_2.BLOCKS, 1.0F, id_private.nextFloat() * 0.4F + 0.8F);
         var3.id_class(var4, var5.id_class(rCT.id_continue, Boolean.valueOf(true)), 11);
         if (var2 != null) {
            var1.id_volatile().id_class(1, var2, var1x -> var1x.id_byte(var1.id_package()));
         }

         return ryZ_2.id_class(var3.id_import());
      } else {
         rfH_2 var6 = var4.id_break(var1.id_finally());
         if (Jj_1.id_class(var3, var6, var1.id_case())) {
            var3.id_class(var2, var6, rqn_3.Sc, rqL_2.BLOCKS, 1.0F, id_private.nextFloat() * 0.4F + 0.8F);
            xc_3 var7 = Jj_1.id_class(var3, var6);
            var3.id_class(var6, var7, 11);
            rdn_3 var8 = var1.id_volatile();
            if (var2 instanceof rhN_2) {
               Oo_1.id_goto.id_class((rhN_2)var2, var6, var8);
               var8.id_class(1, var2, var1x -> var1x.id_byte(var1.id_package()));
            }

            return ryZ_2.id_class(var3.id_import());
         } else {
            return ryZ_2.FAIL;
         }
      }
   }

   @Override
   public rdn_3 id_catch() {
      return new rdn_3(rdy_3.Pz);
   }
}
