package celestial;

class rXU extends rJY {
   rXU(rXR var1, rXu_1 var2, int var3, int var4, int var5, rpq_3 var6) {
      super(var2, var3, var4, var5);
      this.break_ = var1;
      this.class_ = var6;
   }

   @Override
   public rdn_3 class_(rhd_3 var1, rdn_3 var2) {
      this.break_.throws_.get(0).class_(1);
      this.break_.throws_.get(1).class_(1);
      var2.break_().break_(var2, (rYB)var1.throws_[7], var1);
      this.class_.class_((var1x, var2x) -> {
         long var3 = var1x.r();
         if (this.break_.byte_ != var3) {
            var1x.class_((rhd_3)null, var2x, rqn_3.dj, rqL_2.BLOCKS, 1.0F, 1.0F);
            this.break_.byte_ = var3;
         }
      });
      return super.class_(var1, var2);
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return false;
   }
}
