package celestial;

import java.util.EnumSet;

class rEv_1 extends rBk_1 {
   private final rEu_1 class_;
   private iB_2 break_;

   @Override
   public void byte_() {
      this.class_.public_().final_();
   }

   public rEv_1(rEu_1 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean class_() {
      this.break_ = this.class_.I_();
      if (!(this.break_ instanceof rhd_3)) {
         return false;
      } else {
         double var1 = this.break_.int_(this.class_);
         return var1 > 256.0 ? false : this.class_.case_((rhd_3)this.break_);
      }
   }

   @Override
   public void throws_() {
      this.class_.continue_().class_(this.break_.rx(), this.break_.rH(), this.break_.BO());
   }
}
