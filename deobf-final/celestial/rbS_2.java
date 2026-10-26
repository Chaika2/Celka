package celestial;

class rbS_2 extends rPa_1 {
   rbS_2(rbB_2 var1, aA_2 var2, double var3, int var5) {
      super(xu_3.OX, var2, var3, var5);
      this.catch_ = var1;
   }

   @Override
   public void class_(rYB var1, rfH_2 var2) {
      var1.class_((rhd_3)null, var2, rqn_3.dn, rqL_2.BLOCKS, 0.7F, 0.9F + var1.int_.nextFloat() * 0.2F);
   }

   @Override
   public void class_(rRg_1 var1, rfH_2 var2) {
      var1.class_((rhd_3)null, var2, rqn_3.Wo, rqL_2.HOSTILE, 0.5F, 0.9F + rbB_2.class_(this.catch_).nextFloat() * 0.2F);
   }

   @Override
   public double private_() {
      return 1.14;
   }
}
