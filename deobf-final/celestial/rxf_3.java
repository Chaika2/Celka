package celestial;

public class rxf_3 extends rdb_3 {
   public rxf_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      boolean var5 = false;
      if (xn_3.implements_(var4)) {
         this.class_(var2, var3);
         var2.break_(var3, var4.class_(xn_3.final_, Boolean.valueOf(true)));
         var5 = true;
      } else {
         var3 = var3.break_(var1.finally_());
         if (Jj_1.class_(var2, var3, var1.case_())) {
            this.class_(var2, var3);
            var2.break_(var3, Jj_1.class_(var2, var3));
            var5 = true;
         }
      }

      if (var5) {
         var1.volatile_().catch_(1);
         return ryZ_2.class_(var2.continue_);
      } else {
         return ryZ_2.FAIL;
      }
   }

   private void class_(rYB var1, rfH_2 var2) {
      var1.class_((rhd_3)null, var2, rqn_3.SE, rqL_2.BLOCKS, 1.0F, (private_.nextFloat() - private_.nextFloat()) * 0.2F + 1.0F);
   }
}
