package celestial;

import java.util.EnumSet;

class rGQ extends rBk_1 {
   private int break_;

   @Override
   public void byte_() {
      this.break_ = 20;
      this.class_.class_(100);
   }

   public rGQ(rGz_1 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.class_.I_();
      return var1 != null && var1.BM() ? ((rYB)this.class_.throws_[7]).abstract_() != rRO.PEACEFUL : false;
   }

   @Override
   public void throws_() {
      if (((rYB)this.class_.throws_[7]).abstract_() != rRO.PEACEFUL) {
         this.break_--;
         iB_2 var1 = this.class_.I_();
         this.class_.continue_().class_(var1, 180.0F, 180.0F);
         double var2 = this.class_.int_(var1);
         if (var2 < 400.0) {
            if (this.break_ <= 0) {
               this.break_ = 20 + rGz_1.class_(this.class_).nextInt(10) * 20 / 2;
               ((rYB)this.class_.throws_[7]).a_(new rhg_3((rYB)this.class_.throws_[7], this.class_, var1, this.class_.n().final_()));
               this.class_.class_(rqn_3.JQ, 2.0F, (rGz_1.break_(this.class_).nextFloat() - rGz_1.byte_(this.class_).nextFloat()) * 0.2F + 1.0F);
            }
         } else {
            this.class_.byte_((iB_2)null);
         }

         super.throws_();
      }
   }

   @Override
   public void protected_() {
      this.class_.class_(0);
   }
}
