package celestial;

class rdF_2 implements rdE_2 {
   private double class_;
   private double break_;
   private long byte_;

   private double class_(rYB var1, double var2) {
      if (var1.r() != this.byte_) {
         this.byte_ = var1.r();
         double var4 = var2 - this.class_;
         var4 = rfU_2.byte_(var4 + 0.5, 1.0) - 0.5;
         this.break_ += var4 * 0.1;
         this.break_ *= 0.9;
         this.class_ = rfU_2.byte_(this.class_ + this.break_, 1.0);
      }

      return this.class_;
   }

   @Override
   public float call(rdn_3 var1, gm_3 var2xx, iB_2 var3) {
      Object var4 = var3 != null ? var3 : var1.try_();
      if (var4 == null) {
         return 0.0F;
      } else {
         if (var2xx == null && (rYB)((an_3)var4).throws_[7] instanceof gm_3 var2xx) {
            ;
         }

         if (var2xx == null) {
            return 0.0F;
         } else {
            double var5;
            if (var2xx.default_().throws_()) {
               var5 = (double)var2xx.protected_(1.0F);
            } else {
               var5 = Math.random();
            }

            var5 = this.class_(var2xx, var5);
            return (float)var5;
         }
      }
   }
}
