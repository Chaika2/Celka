package celestial;

class rbS_2 extends rPa_1 {
   rbS_2(rbB_2 var1, aA_2 var2, double var3, int var5) {
      super(xu_3.OX, var2, var3, var5);
      this.id_catch = var1;
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2) {
      var1.id_class((rhd_3)null, var2, rqn_3.dn, rqL_2.BLOCKS, 0.7F, 0.9F + var1.id_int.nextFloat() * 0.2F);
   }

   @Override
   public void id_class(rRg_1 var1, rfH_2 var2) {
      var1.id_class((rhd_3)null, var2, rqn_3.Wo, rqL_2.HOSTILE, 0.5F, 0.9F + rbB_2.id_class(this.id_catch).nextFloat() * 0.2F);
   }

   @Override
   public double id_private() {
      return 1.14;
   }
}
