package celestial;

class rCP implements roS_2 {
   @Override
   public void byte_(roE_2 var1, double var2) {
   }

   rCP(rCr_1 var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(roE_2 var1, int var2) {
      this.class_.class_(new rFw_1(var1, rFf_1.SET_WARNING_TIME));
   }

   @Override
   public void class_(roE_2 var1, double var2) {
      this.class_.class_(new rFw_1(var1, rFf_1.SET_SIZE));
   }

   @Override
   public void class_(roE_2 var1, double var2, double var4) {
      this.class_.class_(new rFw_1(var1, rFf_1.SET_CENTER));
   }

   @Override
   public void class_(roE_2 var1, double var2, double var4, long var6) {
      this.class_.class_(new rFw_1(var1, rFf_1.LERP_SIZE));
   }

   @Override
   public void break_(roE_2 var1, int var2) {
      this.class_.class_(new rFw_1(var1, rFf_1.SET_WARNING_BLOCKS));
   }

   @Override
   public void break_(roE_2 var1, double var2) {
   }
}
