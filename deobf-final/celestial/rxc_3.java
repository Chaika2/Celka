package celestial;

public class rxc_3 extends rdb_3 {
   public rxc_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rdn_3 class_(rdn_3 var1, rYB var2, iB_2 var3) {
      rdn_3 var4 = super.class_(var1, var2, var3);
      if (!var2.continue_) {
         double var5 = var3.rx();
         double var7 = var3.re();
         double var9 = var3.BO();

         for (int var11 = 0; var11 < 16; var11++) {
            double var12 = var3.rx() + (var3.Sa().nextDouble() - 0.5) * 16.0;
            double var14 = rfU_2.class_(var3.re() + (double)(var3.Sa().nextInt(16) - 8), 0.0, (double)(var2.float_() - 1));
            double var16 = var3.BO() + (var3.Sa().nextDouble() - 0.5) * 16.0;
            if (var3.Pm()) {
               var3.BH();
            }

            if (var3.class_(var12, var14, var16, true)) {
               rqA_2 var18 = var3 instanceof rba_3 ? rqn_3.SH : rqn_3.rK;
               var2.class_((rhd_3)null, var5, var7, var9, var18, rqL_2.PLAYERS, 1.0F, 1.0F);
               var3.class_(var18, 1.0F, 1.0F);
               break;
            }
         }

         if (var3 instanceof rhd_3) {
            ((rhd_3)var3).sK().class_(this, 20);
         }
      }

      return var4;
   }
}
