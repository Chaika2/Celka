package celestial;

import java.util.EnumSet;
import java.util.Random;

class rEW extends rBk_1 {
   private final aA_2 class_;
   private double break_;
   private double byte_;
   private double protected_;
   private final double throws_;
   private final rYB case_;

   @Override
   public void byte_() {
      this.class_.public_().class_(this.break_, this.byte_, this.protected_, this.throws_);
   }

   public rEW(aA_2 var1, double var2) {
      this.class_ = var1;
      this.throws_ = var2;
      this.case_ = (rYB)var1.throws_[7];
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (!this.case_.strictfp_()) {
         return false;
      } else if (this.class_.rT()) {
         return false;
      } else {
         rjU_2 var1 = this.catch_();
         if (var1 == null) {
            return false;
         } else {
            this.break_ = var1.break_;
            this.byte_ = var1.byte_;
            this.protected_ = var1.protected_;
            return true;
         }
      }
   }

   @Override
   public boolean break_() {
      return !this.class_.public_().native_();
   }

   private rjU_2 catch_() {
      Random var1 = this.class_.Sa();
      rfH_2 var2 = this.class_.Bs();

      for (int var3 = 0; var3 < 10; var3++) {
         rfH_2 var4 = var2.break_(var1.nextInt(20) - 10, 2 - var1.nextInt(8), var1.nextInt(20) - 10);
         if (this.case_.byte_(var4).class_(xu_3.try_)) {
            return rjU_2.protected_(var4);
         }
      }

      return null;
   }
}
