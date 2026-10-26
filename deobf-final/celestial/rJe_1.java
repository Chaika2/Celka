package celestial;

class rJe_1 extends rJY {
   rJe_1(rJD var1, rXu_1 var2, int var3, int var4, int var5, rpq_3 var6) {
      super(var2, var3, var4, var5);
      this.break_ = var1;
      this.class_ = var6;
   }

   @Override
   public rdn_3 class_(rhd_3 var1, rdn_3 var2) {
      var2.class_((rYB)var1.throws_[7], var1, var2.char_());
      this.break_.volatile_.class_(var1);
      rdn_3 var3 = this.break_.class_.class_(1);
      if (!var3.class_()) {
         this.break_.throws_();
      }

      this.class_.class_((var1x, var2x) -> {
         long var3x = var1x.r();
         if (this.break_.extends_ != var3x) {
            var1x.class_((rhd_3)null, var2x, rqn_3.dV, rqL_2.BLOCKS, 1.0F, 1.0F);
            this.break_.extends_ = var3x;
         }
      });
      return super.class_(var1, var2);
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return false;
   }
}
