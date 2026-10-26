package celestial;

import java.util.EnumSet;

class rMM extends rBk_1 {
   int class_;

   @Override
   public void byte_() {
      this.class_ = 40;
   }

   public rMM(rba_3 var1) {
      this.break_ = var1;
      this.class_(EnumSet.of(rBW.LOOK, rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean class_() {
      return this.break_.sx();
   }

   @Override
   public boolean break_() {
      return this.class_() && this.class_ > 0;
   }

   @Override
   public void throws_() {
      this.class_--;
   }

   @Override
   public void protected_() {
      this.break_.public_(false);
   }
}
