package celestial;

import java.util.EnumSet;

class rGe_1 extends rPi_1 {
   @Override
   public void byte_() {
      super.byte_();
      this.protected_.native_(0);
   }

   public rGe_1(is_3 var1) {
      super(var1, 6, rGD.protected_);
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      rGD var1 = (rGD)this.protected_;
      return var1.sd() && rGD.class_(var1).nextInt(10) == 0 && super.class_();
   }

   @Override
   public boolean break_() {
      rGD var1 = (rGD)this.protected_;
      return var1.sd() && super.break_();
   }
}
