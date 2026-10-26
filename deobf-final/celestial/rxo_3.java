package celestial;

public class rxo_3 extends rdb_3 implements rdS_2 {
   public rxo_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public String class_(rhd_3 var1, rdn_3 var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < 45; var4++) {
         rdn_3 var5 = ((rhz_3)var1.implements_[1]).extends_(var4);
         if (var5.break_() == rdy_3.Pz) {
            var3 += var5.char_();
         }
      }

      return var3 + "";
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rhd_3 var2 = var1.final_();
      rYB var3 = var1.int_();
      rfH_2 var4 = var1.class_();
      xc_3 var5 = var3.byte_(var4);
      if (xn_3.implements_(var5)) {
         var3.class_(var2, var4, rqn_3.Sc, rqL_2.BLOCKS, 1.0F, private_.nextFloat() * 0.4F + 0.8F);
         var3.class_(var4, var5.class_(rCT.continue_, Boolean.valueOf(true)), 11);
         if (var2 != null) {
            var1.volatile_().class_(1, var2, var1x -> var1x.byte_(var1.package_()));
         }

         return ryZ_2.class_(var3.import_());
      } else {
         rfH_2 var6 = var4.break_(var1.finally_());
         if (Jj_1.class_(var3, var6, var1.case_())) {
            var3.class_(var2, var6, rqn_3.Sc, rqL_2.BLOCKS, 1.0F, private_.nextFloat() * 0.4F + 0.8F);
            xc_3 var7 = Jj_1.class_(var3, var6);
            var3.class_(var6, var7, 11);
            rdn_3 var8 = var1.volatile_();
            if (var2 instanceof rhN_2) {
               Oo_1.goto_.class_((rhN_2)var2, var6, var8);
               var8.class_(1, var2, var1x -> var1x.byte_(var1.package_()));
            }

            return ryZ_2.class_(var3.import_());
         } else {
            return ryZ_2.FAIL;
         }
      }
   }

   @Override
   public rdn_3 catch_() {
      return new rdn_3(rdy_3.Pz);
   }
}
