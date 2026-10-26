package celestial;

import java.util.EnumSet;

public class rSs_1 extends rBk_1 {
   private final rOD class_;
   private final double break_;
   private double byte_;
   private double protected_;
   private double throws_;

   @Override
   public void byte_() {
      this.class_.public_().class_(this.byte_, this.protected_, this.throws_, this.break_);
   }

   public rSs_1(rOD var1, double var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (!this.class_.sm() && this.class_.BP()) {
         rjU_2 var1 = iX_2.class_(this.class_, 5, 4);
         if (var1 == null) {
            return false;
         } else {
            this.byte_ = var1.break_;
            this.protected_ = var1.byte_;
            this.throws_ = var1.protected_;
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean break_() {
      return !this.class_.sm() && !this.class_.public_().native_() && this.class_.BP();
   }

   @Override
   public void throws_() {
      if (!this.class_.sm() && this.class_.Sa().nextInt(50) == 0) {
         an_3 var1 = this.class_.Bh().get(0);
         if (var1 == null) {
            return;
         }

         if (var1 instanceof rhd_3) {
            int var2 = this.class_.sn();
            int var3 = this.class_.sT();
            if (var3 > 0 && this.class_.Sa().nextInt(var3) < var2) {
               this.class_.private_((rhd_3)var1);
               return;
            }

            this.class_.return_(5);
         }

         this.class_.Bn();
         this.class_.sI();
         ((rYB)this.class_.throws_[7]).class_(this.class_, (byte)6);
      }
   }
}
