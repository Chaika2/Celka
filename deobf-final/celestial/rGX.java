package celestial;

import java.util.List;

class rGX extends rGb_1 {
   @Override
   public void byte_() {
   }

   rGX(rGB var1) {
      super(var1);
      this.break_ = var1;
   }

   @Override
   public boolean class_() {
      return this.break_.I_() != null && this.break_.super_ == rGS.SWOOP;
   }

   @Override
   public boolean break_() {
      iB_2 var1 = this.break_.I_();
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else if (!(var1 instanceof rhd_3) || !((rhd_3)var1).native_() && !((rhd_3)var1).implements_()) {
         if (!this.class_()) {
            return false;
         } else {
            if ((Integer)this.break_.throws_[41] % 20 == 0) {
               List var2 = ((rYB)this.break_.throws_[7]).class_(rbf_3.class, this.break_.rN().class_(16.0), rpJ_2.class_);
               if (!var2.isEmpty()) {
                  for (rbf_3 var4 : var2) {
                     var4.sc();
                  }

                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.break_.I_();
      this.break_.break_ = new rjU_2(var1.rx(), var1.byte_(0.5), var1.BO());
      if (this.break_.rN().class_(0.2F).byte_(var1.rN())) {
         this.break_.public_(var1);
         this.break_.super_ = rGS.CIRCLE;
         if (!this.break_.BF()) {
            ((rYB)this.break_.throws_[7]).byte_(1039, this.break_.Bs(), 0);
         }
      } else if ((Boolean)this.break_.throws_[23] || (Integer)this.break_.private_[10] > 0) {
         this.break_.super_ = rGS.CIRCLE;
      }
   }

   @Override
   public void protected_() {
      this.break_.byte_((iB_2)null);
      this.break_.super_ = rGS.CIRCLE;
   }
}
